package ru.vtarasov.cinema.avro.generator;

import org.apache.avro.Schema;
import org.apache.avro.SchemaBuilder;

public class OrderFinishedSchemaGenerator extends FileSchemaGenerator {
    public OrderFinishedSchemaGenerator(String schemaPath, String schemaName) {
        super(schemaPath, schemaName);
    }

    @Override
    protected Schema buildSchema() {
        return SchemaBuilder.record("OrderFinishedDto")
                .namespace("generated.ru.vtarasov.cinema.avro.dto")
                .fields()
                .name("state")
                .type()
                .stringType()
                .noDefault()
                .endRecord();
    }
}
