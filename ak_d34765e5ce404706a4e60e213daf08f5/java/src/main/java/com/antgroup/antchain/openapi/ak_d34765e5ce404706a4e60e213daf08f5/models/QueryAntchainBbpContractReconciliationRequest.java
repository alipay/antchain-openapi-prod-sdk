// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_d34765e5ce404706a4e60e213daf08f5.models;

import com.aliyun.tea.*;

public class QueryAntchainBbpContractReconciliationRequest extends TeaModel {
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

    public static QueryAntchainBbpContractReconciliationRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainBbpContractReconciliationRequest self = new QueryAntchainBbpContractReconciliationRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntchainBbpContractReconciliationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntchainBbpContractReconciliationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntchainBbpContractReconciliationRequest setSupCode(String supCode) {
        this.supCode = supCode;
        return this;
    }
    public String getSupCode() {
        return this.supCode;
    }

    public QueryAntchainBbpContractReconciliationRequest setScoreDates(java.util.List<String> scoreDates) {
        this.scoreDates = scoreDates;
        return this;
    }
    public java.util.List<String> getScoreDates() {
        return this.scoreDates;
    }

}
