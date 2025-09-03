// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryCreditshieldProductIvrfcRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 1.信息查询 2.债务人判断
    @NameInMap("query_code")
    @Validation(required = true)
    public String queryCode;

    // 查询信息Map集合
    @NameInMap("query_infos")
    public java.util.List<QueryInfo> queryInfos;

    public static QueryCreditshieldProductIvrfcRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCreditshieldProductIvrfcRequest self = new QueryCreditshieldProductIvrfcRequest();
        return TeaModel.build(map, self);
    }

    public QueryCreditshieldProductIvrfcRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCreditshieldProductIvrfcRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryCreditshieldProductIvrfcRequest setQueryCode(String queryCode) {
        this.queryCode = queryCode;
        return this;
    }
    public String getQueryCode() {
        return this.queryCode;
    }

    public QueryCreditshieldProductIvrfcRequest setQueryInfos(java.util.List<QueryInfo> queryInfos) {
        this.queryInfos = queryInfos;
        return this;
    }
    public java.util.List<QueryInfo> getQueryInfos() {
        return this.queryInfos;
    }

}
