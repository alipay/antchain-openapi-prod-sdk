// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_be9ae52241c747408ac24bec8f036d74.models;

import com.aliyun.tea.*;

public class UpdateAntchainPdcpDatasetRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 采用数据源配置进行登记时的数据源 id，非必填，不填则不更新
    // 如果填写了本参数，则可不填写datasourceType和connConfig
    // 如果填写了本参数，将优先采用本参数指定的datasource配置
    @NameInMap("datasource_id")
    public String datasourceId;

    // 待更新的数据集 id，必填
    @NameInMap("dataset_id")
    @Validation(required = true)
    public String datasetId;

    // 数据集数据源类型，非必填，不填则不更新。
    // 如果填写了datasourceId，则可不传本参数，填写了本参数也将被忽略。
    // 如果未填写datasourceId，则必须同时填写本参数和connConfig参数。
    // 示例如下：
    // MYSQL,
    // DB2,
    // SQLSERVER,
    // ORACLE,
    // HIVE2,
    // ODPS
    @NameInMap("datasource_type")
    public String datasourceType;

    // 更新后的数据集名称，非必填，不填则不更新
    @NameInMap("name")
    @Validation(maxLength = 50)
    public String name;

    // 更新后的数据集描述，非必填，不填则不更新
    @NameInMap("description")
    @Validation(maxLength = 200)
    public String description;

    // 数据集数据源连接信息转化的json字符串，非必填，不填则不更新。
    // 如果填写了datasourceId，则可不传本参数，填写本参数也将被忽略。
    // 如果未填写datasourceId，则必须同时填写本参数和datasourceType参数。
    // 该参数请参考如下对应结构体，定义好后需转成jsonString，对应信息如下：
    // MYSQL -> MysqlConnConfig,
    // ORACLE -> OracleConnConfig,
    // SQLSERVER -> SqlServerConnConfig,
    // DB2 -> DbTwoConnConfig,
    // HIVE2 -> HiveTwoConnConfig,
    // ODPS -> OdpsConnConfig
    @NameInMap("conn_config")
    public String connConfig;

    // 数据集位置信息转化的json字符串，如数据表名称等，非必填，不填则不更新。
    // 如果填写了datasourceId，则本参数必填且根据 datasourceId 对应的数据源类型进行解析。
    // 如果未填写datasourceId且填写了 connConfig，则本参数必填且根据datasourceType进行解析。
    // 该参数请参考如下对应结构体，定义好后需转成jsonString，对应信息如下：
    // MYSQL -> MysqlLocationConfig,
    // ORACLE -> OracleLocationConfig,
    // SQLSERVER -> SqlServerLocationConfig,
    // DB2 -> DbTwoLocationConfig,
    // HIVE2 -> HiveTwoLocationConfig,
    // ODPS -> OdpsLocationConfig
    @NameInMap("location_config")
    public String locationConfig;

    // 数据集格式类型，非必填，不填则不更新，如果填写，则format_config也必须填写。
    // 示例：TABLE
    @NameInMap("format_type")
    public String formatType;

    // 数据集数据源格式信息，如 csv 分隔符，数据库主键名称等，非必填，不填则不更新
    // 如果填写，则formatType也必须填写
    // 该参数请参考如下对应结构体，定义好后需转成jsonString，对应关系如下：
    // 数据表 -> TableFormatConfig，
    @NameInMap("format_config")
    public String formatConfig;

    public static UpdateAntchainPdcpDatasetRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAntchainPdcpDatasetRequest self = new UpdateAntchainPdcpDatasetRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAntchainPdcpDatasetRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateAntchainPdcpDatasetRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateAntchainPdcpDatasetRequest setDatasourceId(String datasourceId) {
        this.datasourceId = datasourceId;
        return this;
    }
    public String getDatasourceId() {
        return this.datasourceId;
    }

    public UpdateAntchainPdcpDatasetRequest setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public String getDatasetId() {
        return this.datasetId;
    }

    public UpdateAntchainPdcpDatasetRequest setDatasourceType(String datasourceType) {
        this.datasourceType = datasourceType;
        return this;
    }
    public String getDatasourceType() {
        return this.datasourceType;
    }

    public UpdateAntchainPdcpDatasetRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateAntchainPdcpDatasetRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateAntchainPdcpDatasetRequest setConnConfig(String connConfig) {
        this.connConfig = connConfig;
        return this;
    }
    public String getConnConfig() {
        return this.connConfig;
    }

    public UpdateAntchainPdcpDatasetRequest setLocationConfig(String locationConfig) {
        this.locationConfig = locationConfig;
        return this;
    }
    public String getLocationConfig() {
        return this.locationConfig;
    }

    public UpdateAntchainPdcpDatasetRequest setFormatType(String formatType) {
        this.formatType = formatType;
        return this;
    }
    public String getFormatType() {
        return this.formatType;
    }

    public UpdateAntchainPdcpDatasetRequest setFormatConfig(String formatConfig) {
        this.formatConfig = formatConfig;
        return this;
    }
    public String getFormatConfig() {
        return this.formatConfig;
    }

}
