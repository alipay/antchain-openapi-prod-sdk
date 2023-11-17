// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_be9ae52241c747408ac24bec8f036d74.models;

import com.aliyun.tea.*;

public class LocalDataset extends TeaModel {
    // 数据集id
    @NameInMap("id")
    public String id;

    // 数据集名称
    @NameInMap("name")
    public String name;

    // 数据集描述
    @NameInMap("description")
    public String description;

    // 数据集所属的数据源 id
    @NameInMap("datasource_id")
    public String datasourceId;

    // 数据源类型。
    // 示例如下：
    // MYSQL,
    // DB2,
    // SQLSERVER,
    // ORACLE,
    // HIVE2,
    // ODPS
    @NameInMap("datasource_type")
    public String datasourceType;

    // 数据源连接参数转化成的json字符串，必须与数据源类型一一对应。
    // 该参数请参考如下对应结构体，定义好后需转成jsonString，具体的对应信息如下：
    // MYSQL -> MysqlConnConfig,
    // ORACLE -> OracleConnConfig,
    // SQLSERVER -> SqlServerConnConfig,
    // DB2 -> DbTwoConnConfig,
    // HIVE2 -> HiveTwoConnConfig,
    // ODPS -> OdpsConnConfig
    @NameInMap("datasource_conn_config")
    public String datasourceConnConfig;

    // 数据集在数据源中的位置信息转化成的json字符串，如数据表名称等，必须和数据源类型一一对应。
    // 该参数请参考如下对应结构体，定义好后需转成jsonString，具体的对应关系如下：
    // MYSQL -> MysqlLocationConfig,
    // ORACLE -> OracleLocationConfig,
    // SQLSERVER -> SqlServerLocationConfig,
    // DB2 -> DbTwoLocationConfig,
    // HIVE2 -> HiveTwoLocationConfig,
    // ODPS -> OdpsLocationConfig
    @NameInMap("location_config")
    public String locationConfig;

    // 数据集格式类型。
    // 示例如下：
    // TABLE
    @NameInMap("format_type")
    public String formatType;

    // 数据集格式信息，如 csv 分隔符，数据库主键名称等，与数据集类型一一对应。
    // 该参数请参考如下对应结构体，定义好后需转成jsonString，当前支持的类型展示如下：
    // 数据表 -> TableFormatConfig
    @NameInMap("format_config")
    public String formatConfig;

    // 数据集 schema 类型。
    // 示例如下：
    // STRUCTURED_DATA
    @NameInMap("schema_type")
    public String schemaType;

    // 结构化数据 schema，schema_type为STRUCTURED_DATA时必填
    @NameInMap("structured_data_schema")
    public StructuredDataSchema structuredDataSchema;

    public static LocalDataset build(java.util.Map<String, ?> map) throws Exception {
        LocalDataset self = new LocalDataset();
        return TeaModel.build(map, self);
    }

    public LocalDataset setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public LocalDataset setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public LocalDataset setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public LocalDataset setDatasourceId(String datasourceId) {
        this.datasourceId = datasourceId;
        return this;
    }
    public String getDatasourceId() {
        return this.datasourceId;
    }

    public LocalDataset setDatasourceType(String datasourceType) {
        this.datasourceType = datasourceType;
        return this;
    }
    public String getDatasourceType() {
        return this.datasourceType;
    }

    public LocalDataset setDatasourceConnConfig(String datasourceConnConfig) {
        this.datasourceConnConfig = datasourceConnConfig;
        return this;
    }
    public String getDatasourceConnConfig() {
        return this.datasourceConnConfig;
    }

    public LocalDataset setLocationConfig(String locationConfig) {
        this.locationConfig = locationConfig;
        return this;
    }
    public String getLocationConfig() {
        return this.locationConfig;
    }

    public LocalDataset setFormatType(String formatType) {
        this.formatType = formatType;
        return this;
    }
    public String getFormatType() {
        return this.formatType;
    }

    public LocalDataset setFormatConfig(String formatConfig) {
        this.formatConfig = formatConfig;
        return this;
    }
    public String getFormatConfig() {
        return this.formatConfig;
    }

    public LocalDataset setSchemaType(String schemaType) {
        this.schemaType = schemaType;
        return this;
    }
    public String getSchemaType() {
        return this.schemaType;
    }

    public LocalDataset setStructuredDataSchema(StructuredDataSchema structuredDataSchema) {
        this.structuredDataSchema = structuredDataSchema;
        return this;
    }
    public StructuredDataSchema getStructuredDataSchema() {
        return this.structuredDataSchema;
    }

}
