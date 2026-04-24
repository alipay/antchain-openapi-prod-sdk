// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryCreditshieldRestrictedRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 还款概率评估策略
    @NameInMap("query_code")
    @Validation(required = true)
    public String queryCode;

    // 查询信息集合
    @NameInMap("query_infos")
    @Validation(required = true)
    public java.util.List<String> queryInfos;

    public static QueryCreditshieldRestrictedRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCreditshieldRestrictedRequest self = new QueryCreditshieldRestrictedRequest();
        return TeaModel.build(map, self);
    }

    public QueryCreditshieldRestrictedRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCreditshieldRestrictedRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryCreditshieldRestrictedRequest setQueryCode(String queryCode) {
        this.queryCode = queryCode;
        return this;
    }
    public String getQueryCode() {
        return this.queryCode;
    }

    public QueryCreditshieldRestrictedRequest setQueryInfos(java.util.List<String> queryInfos) {
        this.queryInfos = queryInfos;
        return this;
    }
    public java.util.List<String> getQueryInfos() {
        return this.queryInfos;
    }

}
