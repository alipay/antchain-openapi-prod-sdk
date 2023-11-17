// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_be9ae52241c747408ac24bec8f036d74.models;

import com.aliyun.tea.*;

public class CreateAntchainPdcpDatasetRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 数据集名称，必填
    @NameInMap("name")
    @Validation(required = true, maxLength = 50, minLength = 1)
    public String name;

    // 数据集描述，非必填
    @NameInMap("description")
    @Validation(maxLength = 200)
    public String description;

    // 采用数据源配置进行登记时的数据源 id
    // 如果填写了本参数，则可不填写datasourceType和connConfig
    // 如果填写了本参数，将优先采用本参数指定的 datasource 配置
    @NameInMap("datasource_id")
    public String datasourceId;

    // 数据集数据源类型。
    // 如果填写了datasourceId，则可不传本参数，填写了本参数也将被忽略。
    // 如果未填写datasourceId，则必须同时填写本参数和 connConfig参数。
    // 示例如下：
    // MYSQL,
    // DB2,
    // SQLSERVER,
    // ORACLE,
    // HIVE2,
    // ODPS
    @NameInMap("datasource_type")
    public String datasourceType;

    // 数据集所属数据源连接信息，与数据源类型一一对应。
    // 如果填写了datasourceId，则可不传本参数，填写本参数也将被忽略。
    // 如果未填写 datasourceId，则必须同时填写本参数和datasourceType参数。
    // 该参数请参考如下对应结构体，定义好后需转成jsonString，具体对应关系如下：
    // MYSQL -> MysqlConnConfig,
    // ORACLE -> OracleConnConfig,
    // SQLSERVER -> SqlServerConnConfig,
    // DB2 -> DbTwoConnConfig,
    // HIVE2 -> HiveTwoConnConfig,
    // ODPS -> OdpsConnConfig
    @NameInMap("conn_config")
    public String connConfig;

    // 数据集位置信息的对象转化成的json字符串，如数据表名称等。
    // 该参数请参考如下对应结构体，定义好后需转成jsonString，具体的对应信息如下：
    // MYSQL -> MysqlLocationConfig,
    // ORACLE -> OracleLocationConfig,
    // SQLSERVER -> SqlServerLocationConfig,
    // DB2 -> DbTwoLocationConfig,
    // HIVE2 -> HiveTwoLocationConfig,
    // ODPS -> OdpsLocationConfig
    @NameInMap("location_config")
    @Validation(required = true)
    public String locationConfig;

    // 数据集格式类型。
    // 示例如下：
    // TABLE
    @NameInMap("format_type")
    @Validation(required = true)
    public String formatType;

    // 数据集格式信息转化成的json字符串，如 csv 分隔符，数据库主键名称等，必须与数据源类型一一对应。
    // 具体的对应关系如下：
    // 数据表 -> TableFormatConfig
    @NameInMap("format_config")
    @Validation(required = true)
    public String formatConfig;

    // 数据集 schema 类型。
    // 示例如下：
    // STRUCTURED_DATA
    @NameInMap("schema_type")
    @Validation(required = true)
    public String schemaType;

    // 结构化数据 schema
    // schemaType为STRUCTURED_DATA时必填
    @NameInMap("structured_data_schema")
    public StructuredDataSchema structuredDataSchema;

    public static CreateAntchainPdcpDatasetRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAntchainPdcpDatasetRequest self = new CreateAntchainPdcpDatasetRequest();
        return TeaModel.build(map, self);
    }

    public CreateAntchainPdcpDatasetRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateAntchainPdcpDatasetRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateAntchainPdcpDatasetRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAntchainPdcpDatasetRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAntchainPdcpDatasetRequest setDatasourceId(String datasourceId) {
        this.datasourceId = datasourceId;
        return this;
    }
    public String getDatasourceId() {
        return this.datasourceId;
    }

    public CreateAntchainPdcpDatasetRequest setDatasourceType(String datasourceType) {
        this.datasourceType = datasourceType;
        return this;
    }
    public String getDatasourceType() {
        return this.datasourceType;
    }

    public CreateAntchainPdcpDatasetRequest setConnConfig(String connConfig) {
        this.connConfig = connConfig;
        return this;
    }
    public String getConnConfig() {
        return this.connConfig;
    }

    public CreateAntchainPdcpDatasetRequest setLocationConfig(String locationConfig) {
        this.locationConfig = locationConfig;
        return this;
    }
    public String getLocationConfig() {
        return this.locationConfig;
    }

    public CreateAntchainPdcpDatasetRequest setFormatType(String formatType) {
        this.formatType = formatType;
        return this;
    }
    public String getFormatType() {
        return this.formatType;
    }

    public CreateAntchainPdcpDatasetRequest setFormatConfig(String formatConfig) {
        this.formatConfig = formatConfig;
        return this;
    }
    public String getFormatConfig() {
        return this.formatConfig;
    }

    public CreateAntchainPdcpDatasetRequest setSchemaType(String schemaType) {
        this.schemaType = schemaType;
        return this;
    }
    public String getSchemaType() {
        return this.schemaType;
    }

    public CreateAntchainPdcpDatasetRequest setStructuredDataSchema(StructuredDataSchema structuredDataSchema) {
        this.structuredDataSchema = structuredDataSchema;
        return this;
    }
    public StructuredDataSchema getStructuredDataSchema() {
        return this.structuredDataSchema;
    }

}
