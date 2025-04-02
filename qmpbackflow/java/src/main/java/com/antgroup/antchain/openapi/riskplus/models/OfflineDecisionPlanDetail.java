// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class OfflineDecisionPlanDetail extends TeaModel {
    // 圈客计划ID
    @NameInMap("decision_plan_id")
    @Validation(required = true)
    public String decisionPlanId;

    // 离线圈客执行任务状态
    @NameInMap("decision_result_status")
    @Validation(required = true)
    public String decisionResultStatus;

    public static OfflineDecisionPlanDetail build(java.util.Map<String, ?> map) throws Exception {
        OfflineDecisionPlanDetail self = new OfflineDecisionPlanDetail();
        return TeaModel.build(map, self);
    }

    public OfflineDecisionPlanDetail setDecisionPlanId(String decisionPlanId) {
        this.decisionPlanId = decisionPlanId;
        return this;
    }
    public String getDecisionPlanId() {
        return this.decisionPlanId;
    }

    public OfflineDecisionPlanDetail setDecisionResultStatus(String decisionResultStatus) {
        this.decisionResultStatus = decisionResultStatus;
        return this;
    }
    public String getDecisionResultStatus() {
        return this.decisionResultStatus;
    }

}
