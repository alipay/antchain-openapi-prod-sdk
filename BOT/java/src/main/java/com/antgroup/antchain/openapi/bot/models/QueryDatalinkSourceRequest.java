// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryDatalinkSourceRequest extends TeaModel {
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

    public static QueryDatalinkSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDatalinkSourceRequest self = new QueryDatalinkSourceRequest();
        return TeaModel.build(map, self);
    }

    public QueryDatalinkSourceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDatalinkSourceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDatalinkSourceRequest setConfigType(String configType) {
        this.configType = configType;
        return this;
    }
    public String getConfigType() {
        return this.configType;
    }

    public QueryDatalinkSourceRequest setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

}
