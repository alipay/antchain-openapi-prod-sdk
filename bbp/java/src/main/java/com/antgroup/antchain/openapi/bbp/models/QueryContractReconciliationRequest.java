// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bbp.models;

import com.aliyun.tea.*;

public class QueryContractReconciliationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 供应商code
    @NameInMap("sup_code")
    @Validation(required = true)
    public String supCode;

    // 月份
    @NameInMap("score_dates")
    @Validation(required = true)
    public java.util.List<String> scoreDates;

    public static QueryContractReconciliationRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryContractReconciliationRequest self = new QueryContractReconciliationRequest();
        return TeaModel.build(map, self);
    }

    public QueryContractReconciliationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryContractReconciliationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryContractReconciliationRequest setSupCode(String supCode) {
        this.supCode = supCode;
        return this;
    }
    public String getSupCode() {
        return this.supCode;
    }

    public QueryContractReconciliationRequest setScoreDates(java.util.List<String> scoreDates) {
        this.scoreDates = scoreDates;
        return this;
    }
    public java.util.List<String> getScoreDates() {
        return this.scoreDates;
    }

}
