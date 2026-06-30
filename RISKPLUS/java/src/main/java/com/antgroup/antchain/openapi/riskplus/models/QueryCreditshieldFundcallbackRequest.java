// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryCreditshieldFundcallbackRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // ALLOCATE_CASE_FILE -案件信息查询
    // REDUCE_RESULT_NOTIFICATION - 减免结果通知
    // REPAYMENT_RESULT_NOTIFICATION -入账通知
    @NameInMap("query_code")
    @Validation(required = true)
    public String queryCode;

    // 请求信息json
    @NameInMap("query_infos")
    @Validation(required = true)
    public java.util.List<String> queryInfos;

    public static QueryCreditshieldFundcallbackRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCreditshieldFundcallbackRequest self = new QueryCreditshieldFundcallbackRequest();
        return TeaModel.build(map, self);
    }

    public QueryCreditshieldFundcallbackRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCreditshieldFundcallbackRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryCreditshieldFundcallbackRequest setQueryCode(String queryCode) {
        this.queryCode = queryCode;
        return this;
    }
    public String getQueryCode() {
        return this.queryCode;
    }

    public QueryCreditshieldFundcallbackRequest setQueryInfos(java.util.List<String> queryInfos) {
        this.queryInfos = queryInfos;
        return this;
    }
    public java.util.List<String> getQueryInfos() {
        return this.queryInfos;
    }

}
