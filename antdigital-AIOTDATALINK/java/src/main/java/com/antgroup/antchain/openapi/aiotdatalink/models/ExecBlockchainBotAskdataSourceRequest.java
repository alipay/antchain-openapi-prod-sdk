// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aiotdatalink.models;

import com.aliyun.tea.*;

public class ExecBlockchainBotAskdataSourceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 数据源类型
    @NameInMap("config_type")
    @Validation(required = true)
    public String configType;

    // 数据源别称
    @NameInMap("alias")
    @Validation(required = true)
    public String alias;

    // 执行查询的SQL
    @NameInMap("sql")
    @Validation(required = true)
    public String sql;

    public static ExecBlockchainBotAskdataSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecBlockchainBotAskdataSourceRequest self = new ExecBlockchainBotAskdataSourceRequest();
        return TeaModel.build(map, self);
    }

    public ExecBlockchainBotAskdataSourceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecBlockchainBotAskdataSourceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecBlockchainBotAskdataSourceRequest setConfigType(String configType) {
        this.configType = configType;
        return this;
    }
    public String getConfigType() {
        return this.configType;
    }

    public ExecBlockchainBotAskdataSourceRequest setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public ExecBlockchainBotAskdataSourceRequest setSql(String sql) {
        this.sql = sql;
        return this;
    }
    public String getSql() {
        return this.sql;
    }

}
