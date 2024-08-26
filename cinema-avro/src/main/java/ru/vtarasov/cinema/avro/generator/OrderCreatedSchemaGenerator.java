package ru.vtarasov.cinema.avro.generator;

import org.apache.avro.Schema;
import org.apache.avro.SchemaBuilder;

public class OrderCreatedSchemaGenerator extends FileSchemaGenerator {
    public OrderCreatedSchemaGenerator(String schemaPath, String schemaName) {
        super(schemaPath, schemaName);
    }

    @Override
    protected Schema buildSchema() {
        return SchemaBuilder.record("OrderEventDto")
                .namespace("generated.ru.vtarasov.cinema.avro.dto")
                .fields()
                .name("film")
                .type()
                .stringType()
                .noDefault()
                .name("price")
                .type()
                .intType()
                .noDefault()
                .endRecord();
    }
}
