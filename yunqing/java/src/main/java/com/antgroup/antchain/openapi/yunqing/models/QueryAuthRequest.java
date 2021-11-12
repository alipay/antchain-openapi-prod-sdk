// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class QueryAuthRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 条件前缀, 一般传入环境ID
    @NameInMap("condition_prefix")
    public String conditionPrefix;

    // 授权状态
    @NameInMap("statuses")
    @Validation(required = true)
    public java.util.List<String> statuses;

    public static QueryAuthRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAuthRequest self = new QueryAuthRequest();
        return TeaModel.build(map, self);
    }

    public QueryAuthRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAuthRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAuthRequest setConditionPrefix(String conditionPrefix) {
        this.conditionPrefix = conditionPrefix;
        return this;
    }
    public String getConditionPrefix() {
        return this.conditionPrefix;
    }

    public QueryAuthRequest setStatuses(java.util.List<String> statuses) {
        this.statuses = statuses;
        return this;
    }
    public java.util.List<String> getStatuses() {
        return this.statuses;
    }

}
