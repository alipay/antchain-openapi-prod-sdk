// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_be9ae52241c747408ac24bec8f036d74.models;

import com.aliyun.tea.*;

public class RecognizedDatasetSchema extends TeaModel {
    // 数据集格式类型。
    // 示例如下：
    // TABLE,
    // CSV
    @NameInMap("format_type")
    public String formatType;

    // 数据集数据源格式信息，如 csv 分隔符，数据库主键名称等。
    // 对应关系如下：
    // 数据表 -> TableFormatConfig，
    // CSV文件 -> CSVFormatConfig
    @NameInMap("format_config")
    public String formatConfig;

    // 数据集 schema 类型。
    @NameInMap("schema_type")
    public String schemaType;

    // 结构化数据 schema
    // schema_type为STRUCTURED_DATA时必填
    @NameInMap("structured_data_schema")
    public StructuredDataSchema structuredDataSchema;

    public static RecognizedDatasetSchema build(java.util.Map<String, ?> map) throws Exception {
        RecognizedDatasetSchema self = new RecognizedDatasetSchema();
        return TeaModel.build(map, self);
    }

    public RecognizedDatasetSchema setFormatType(String formatType) {
        this.formatType = formatType;
        return this;
    }
    public String getFormatType() {
        return this.formatType;
    }

    public RecognizedDatasetSchema setFormatConfig(String formatConfig) {
        this.formatConfig = formatConfig;
        return this;
    }
    public String getFormatConfig() {
        return this.formatConfig;
    }

    public RecognizedDatasetSchema setSchemaType(String schemaType) {
        this.schemaType = schemaType;
        return this;
    }
    public String getSchemaType() {
        return this.schemaType;
    }

    public RecognizedDatasetSchema setStructuredDataSchema(StructuredDataSchema structuredDataSchema) {
        this.structuredDataSchema = structuredDataSchema;
        return this;
    }
    public StructuredDataSchema getStructuredDataSchema() {
        return this.structuredDataSchema;
    }

}
