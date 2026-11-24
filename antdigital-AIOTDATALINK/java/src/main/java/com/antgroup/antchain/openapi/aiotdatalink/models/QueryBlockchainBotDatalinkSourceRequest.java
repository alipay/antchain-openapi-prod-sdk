// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aiotdatalink.models;

import com.aliyun.tea.*;

public class QueryBlockchainBotDatalinkSourceRequest extends TeaModel {
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

    public static QueryBlockchainBotDatalinkSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBlockchainBotDatalinkSourceRequest self = new QueryBlockchainBotDatalinkSourceRequest();
        return TeaModel.build(map, self);
    }

    public QueryBlockchainBotDatalinkSourceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBlockchainBotDatalinkSourceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryBlockchainBotDatalinkSourceRequest setConfigType(String configType) {
        this.configType = configType;
        return this;
    }
    public String getConfigType() {
        return this.configType;
    }

    public QueryBlockchainBotDatalinkSourceRequest setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

}
