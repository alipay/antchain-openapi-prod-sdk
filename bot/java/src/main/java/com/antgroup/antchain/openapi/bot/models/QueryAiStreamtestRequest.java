// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryAiStreamtestRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 咨询内容
    @NameInMap("query")
    @Validation(required = true)
    public String query;

    // 用户ID
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    public static QueryAiStreamtestRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAiStreamtestRequest self = new QueryAiStreamtestRequest();
        return TeaModel.build(map, self);
    }

    public QueryAiStreamtestRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAiStreamtestRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAiStreamtestRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public QueryAiStreamtestRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
