// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryUmktOfflinedecisionPlandetailsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 离线圈客配置的ID
    @NameInMap("offline_decision_plan_id")
    @Validation(required = true)
    public Long offlineDecisionPlanId;

    // 执行日期
    @NameInMap("result_date")
    @Validation(required = true)
    public String resultDate;

    public static QueryUmktOfflinedecisionPlandetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUmktOfflinedecisionPlandetailsRequest self = new QueryUmktOfflinedecisionPlandetailsRequest();
        return TeaModel.build(map, self);
    }

    public QueryUmktOfflinedecisionPlandetailsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryUmktOfflinedecisionPlandetailsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryUmktOfflinedecisionPlandetailsRequest setOfflineDecisionPlanId(Long offlineDecisionPlanId) {
        this.offlineDecisionPlanId = offlineDecisionPlanId;
        return this;
    }
    public Long getOfflineDecisionPlanId() {
        return this.offlineDecisionPlanId;
    }

    public QueryUmktOfflinedecisionPlandetailsRequest setResultDate(String resultDate) {
        this.resultDate = resultDate;
        return this;
    }
    public String getResultDate() {
        return this.resultDate;
    }

}
