package ru.vtarasov.cinema.avro;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import ru.vtarasov.cinema.avro.generator.OrderCreatedSchemaGenerator;
import ru.vtarasov.cinema.avro.generator.OrderFinishedSchemaGenerator;

public class AvroGenerationApplication {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.load(
                AvroGenerationApplication.class.getClassLoader().getResourceAsStream("application.properties")
        );

        String schemaGeneratePath = properties.getProperty("avro.schema.generate.path");

        cleanUp(schemaGeneratePath);

        new OrderCreatedSchemaGenerator(
                schemaGeneratePath,
                properties.getProperty("avro.schema.order-creared.name")
        ).generate();
        new OrderFinishedSchemaGenerator(
                schemaGeneratePath,
                properties.getProperty("avro.schema.order-finished.name")
        ).generate();
    }

    private static void cleanUp(String schemaPath) throws IOException {
        FileUtils.cleanDirectory(new File(schemaPath));
    }
}
