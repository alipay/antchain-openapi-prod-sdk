// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_be9ae52241c747408ac24bec8f036d74.models;

import com.aliyun.tea.*;

public class UpdateAntchainPdcpDatasourceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 待更新的数据源 id，必填
    @NameInMap("datasource_id")
    @Validation(required = true)
    public String datasourceId;

    // 更新后的数据源名称，非必填，不填则不更新
    @NameInMap("name")
    @Validation(maxLength = 50)
    public String name;

    // 更新后的数据源描述，非必填，不填则不更新
    @NameInMap("description")
    @Validation(maxLength = 200)
    public String description;

    // 数据源是否可写，非必填，不填则不更新
    @NameInMap("writable")
    public Boolean writable;

    // 数据源连接参数，非必填，不填则不更新，注意必须与此数据源创建时的类型一致。
    // 该参数请参考如下对应结构体，定义好后需转成jsonString，对应关系展示如下：
    // MYSQL -> MysqlConnConfig,
    // ORACLE -> OracleConnConfig,
    // SQLSERVER -> SqlServerConnConfig,
    // DB2 -> DbTwoConnConfig,
    // HIVE2 -> HiveTwoConnConfig,
    // ODPS -> OdpsConnConfig
    @NameInMap("conn_config")
    public String connConfig;

    public static UpdateAntchainPdcpDatasourceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAntchainPdcpDatasourceRequest self = new UpdateAntchainPdcpDatasourceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAntchainPdcpDatasourceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateAntchainPdcpDatasourceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateAntchainPdcpDatasourceRequest setDatasourceId(String datasourceId) {
        this.datasourceId = datasourceId;
        return this;
    }
    public String getDatasourceId() {
        return this.datasourceId;
    }

    public UpdateAntchainPdcpDatasourceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateAntchainPdcpDatasourceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateAntchainPdcpDatasourceRequest setWritable(Boolean writable) {
        this.writable = writable;
        return this;
    }
    public Boolean getWritable() {
        return this.writable;
    }

    public UpdateAntchainPdcpDatasourceRequest setConnConfig(String connConfig) {
        this.connConfig = connConfig;
        return this;
    }
    public String getConnConfig() {
        return this.connConfig;
    }

}
