// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class UmktOfflineDecisionTaskDetailInfo extends TeaModel {
    // 任务id
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("task_id")
    @Validation(required = true)
    public Long taskId;

    // 圈客计划id
    @NameInMap("decision_plan_id")
    @Validation(required = true)
    public Long decisionPlanId;

    // 圈客结果状态
    /**
     * <strong>example:</strong>
     * <p>D</p>
     */
    @NameInMap("decision_result_status")
    @Validation(required = true)
    public String decisionResultStatus;

    // 圈客结果状态描述
    /**
     * <strong>example:</strong>
     * <p>已完成</p>
     */
    @NameInMap("status_remark")
    @Validation(required = true)
    public String statusRemark;

    public static UmktOfflineDecisionTaskDetailInfo build(java.util.Map<String, ?> map) throws Exception {
        UmktOfflineDecisionTaskDetailInfo self = new UmktOfflineDecisionTaskDetailInfo();
        return TeaModel.build(map, self);
    }

    public UmktOfflineDecisionTaskDetailInfo setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public UmktOfflineDecisionTaskDetailInfo setDecisionPlanId(Long decisionPlanId) {
        this.decisionPlanId = decisionPlanId;
        return this;
    }
    public Long getDecisionPlanId() {
        return this.decisionPlanId;
    }

    public UmktOfflineDecisionTaskDetailInfo setDecisionResultStatus(String decisionResultStatus) {
        this.decisionResultStatus = decisionResultStatus;
        return this;
    }
    public String getDecisionResultStatus() {
        return this.decisionResultStatus;
    }

    public UmktOfflineDecisionTaskDetailInfo setStatusRemark(String statusRemark) {
        this.statusRemark = statusRemark;
        return this;
    }
    public String getStatusRemark() {
        return this.statusRemark;
    }

}
