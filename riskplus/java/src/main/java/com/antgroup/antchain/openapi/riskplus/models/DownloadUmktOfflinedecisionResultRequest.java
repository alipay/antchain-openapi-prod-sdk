// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class DownloadUmktOfflinedecisionResultRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 离线圈客计划id
    @NameInMap("offline_decision_plan_id")
    @Validation(required = true)
    public Long offlineDecisionPlanId;

    // 圈客计划id
    @NameInMap("decision_plan_id")
    @Validation(required = true)
    public Long decisionPlanId;

    // 圈客结果的产出日期
    // 格式：yyyy-MM-dd
    // 默认当前时间的前一天
    @NameInMap("result_date")
    public String resultDate;

    // 离线圈客任务id
    @NameInMap("task_id")
    public Long taskId;

    public static DownloadUmktOfflinedecisionResultRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadUmktOfflinedecisionResultRequest self = new DownloadUmktOfflinedecisionResultRequest();
        return TeaModel.build(map, self);
    }

    public DownloadUmktOfflinedecisionResultRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DownloadUmktOfflinedecisionResultRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DownloadUmktOfflinedecisionResultRequest setOfflineDecisionPlanId(Long offlineDecisionPlanId) {
        this.offlineDecisionPlanId = offlineDecisionPlanId;
        return this;
    }
    public Long getOfflineDecisionPlanId() {
        return this.offlineDecisionPlanId;
    }

    public DownloadUmktOfflinedecisionResultRequest setDecisionPlanId(Long decisionPlanId) {
        this.decisionPlanId = decisionPlanId;
        return this;
    }
    public Long getDecisionPlanId() {
        return this.decisionPlanId;
    }

    public DownloadUmktOfflinedecisionResultRequest setResultDate(String resultDate) {
        this.resultDate = resultDate;
        return this;
    }
    public String getResultDate() {
        return this.resultDate;
    }

    public DownloadUmktOfflinedecisionResultRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
