// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_be9ae52241c747408ac24bec8f036d74.models;

import com.aliyun.tea.*;

public class CreateAntchainPdcpDatasourceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 数据源名称，必填，长度不超过50个字符
    @NameInMap("name")
    @Validation(required = true, maxLength = 50, minLength = 1)
    public String name;

    // 数据源的描述，数据量，作用域等等。
    // 非必填，长度不超过200个字符。
    @NameInMap("description")
    @Validation(maxLength = 200)
    public String description;

    // 描述当前数据源是否支持写入。
    // true表示支持写入。
    @NameInMap("writable")
    @Validation(required = true)
    public Boolean writable;

    // 描述数据源类型的枚举，必填。
    // 示例如下：
    // MYSQL,
    // DB2,
    // SQLSERVER,
    // ORACLE,
    // HIVE2,
    // ODPS
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 数据源连接信息的对象体转化为的json字符串。
    // 要求连接信息的类型必须与type指定的一致。
    // 该参数请参考如下的对应结构体，定义好后转化成jsonstring，对应信息如下：
    // MYSQL -> MysqlConnConfig,
    // ORACLE -> OracleConnConfig,
    // SQLSERVER -> SqlServerConnConfig,
    // DB2 -> DbTwoConnConfig,
    // HIVE2 -> HiveTwoConnConfig,
    // ODPS -> OdpsConnConfig
    @NameInMap("conn_config")
    @Validation(required = true)
    public String connConfig;

    public static CreateAntchainPdcpDatasourceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAntchainPdcpDatasourceRequest self = new CreateAntchainPdcpDatasourceRequest();
        return TeaModel.build(map, self);
    }

    public CreateAntchainPdcpDatasourceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateAntchainPdcpDatasourceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateAntchainPdcpDatasourceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAntchainPdcpDatasourceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAntchainPdcpDatasourceRequest setWritable(Boolean writable) {
        this.writable = writable;
        return this;
    }
    public Boolean getWritable() {
        return this.writable;
    }

    public CreateAntchainPdcpDatasourceRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateAntchainPdcpDatasourceRequest setConnConfig(String connConfig) {
        this.connConfig = connConfig;
        return this;
    }
    public String getConnConfig() {
        return this.connConfig;
    }

}
