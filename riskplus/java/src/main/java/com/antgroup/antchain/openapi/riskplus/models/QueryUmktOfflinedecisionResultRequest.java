// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryUmktOfflinedecisionResultRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 离线圈客计划id
    @NameInMap("offline_decision_plan_id")
    @Validation(required = true)
    public Long offlineDecisionPlanId;

    // 圈客结果的产出日期
    // 格式：yyyy-MM-dd
    // 默认当前时间的前一天
    @NameInMap("result_date")
    public String resultDate;

    public static QueryUmktOfflinedecisionResultRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUmktOfflinedecisionResultRequest self = new QueryUmktOfflinedecisionResultRequest();
        return TeaModel.build(map, self);
    }

    public QueryUmktOfflinedecisionResultRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryUmktOfflinedecisionResultRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryUmktOfflinedecisionResultRequest setOfflineDecisionPlanId(Long offlineDecisionPlanId) {
        this.offlineDecisionPlanId = offlineDecisionPlanId;
        return this;
    }
    public Long getOfflineDecisionPlanId() {
        return this.offlineDecisionPlanId;
    }

    public QueryUmktOfflinedecisionResultRequest setResultDate(String resultDate) {
        this.resultDate = resultDate;
        return this;
    }
    public String getResultDate() {
        return this.resultDate;
    }

}
