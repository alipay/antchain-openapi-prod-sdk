// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryCreditshieldFixedcontactRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // FIXED_CONTACT_BATCH_QUERY 已修复联系方式查询
    @NameInMap("query_code")
    @Validation(required = true)
    public String queryCode;

    // 批量查询请求体，手机号为md5,必填
    @NameInMap("query_infos")
    @Validation(required = true)
    public java.util.List<CreditShieldFixContactResult> queryInfos;

    public static QueryCreditshieldFixedcontactRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCreditshieldFixedcontactRequest self = new QueryCreditshieldFixedcontactRequest();
        return TeaModel.build(map, self);
    }

    public QueryCreditshieldFixedcontactRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCreditshieldFixedcontactRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryCreditshieldFixedcontactRequest setQueryCode(String queryCode) {
        this.queryCode = queryCode;
        return this;
    }
    public String getQueryCode() {
        return this.queryCode;
    }

    public QueryCreditshieldFixedcontactRequest setQueryInfos(java.util.List<CreditShieldFixContactResult> queryInfos) {
        this.queryInfos = queryInfos;
        return this;
    }
    public java.util.List<CreditShieldFixContactResult> getQueryInfos() {
        return this.queryInfos;
    }

}
