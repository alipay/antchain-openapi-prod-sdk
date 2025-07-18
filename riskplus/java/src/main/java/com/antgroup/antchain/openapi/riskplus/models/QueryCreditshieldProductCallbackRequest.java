// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryCreditshieldProductCallbackRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 查询编码 
    // 1.支付宝交易流水查询
    // 2.审批回调
    @NameInMap("query_code")
    @Validation(required = true)
    public String queryCode;

    // 查询信息集合
    @NameInMap("query_infos")
    public java.util.List<QueryInfo> queryInfos;

    public static QueryCreditshieldProductCallbackRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCreditshieldProductCallbackRequest self = new QueryCreditshieldProductCallbackRequest();
        return TeaModel.build(map, self);
    }

    public QueryCreditshieldProductCallbackRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCreditshieldProductCallbackRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryCreditshieldProductCallbackRequest setQueryCode(String queryCode) {
        this.queryCode = queryCode;
        return this;
    }
    public String getQueryCode() {
        return this.queryCode;
    }

    public QueryCreditshieldProductCallbackRequest setQueryInfos(java.util.List<QueryInfo> queryInfos) {
        this.queryInfos = queryInfos;
        return this;
    }
    public java.util.List<QueryInfo> getQueryInfos() {
        return this.queryInfos;
    }

}
