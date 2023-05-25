// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class RiskTaskAudit extends TeaModel {
    // 操作人
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    // 操作类型
    @NameInMap("operation_type")
    @Validation(required = true)
    public String operationType;

    // 风险工单ID
    @NameInMap("risk_task_id")
    @Validation(required = true)
    public String riskTaskId;

    // 评论
    @NameInMap("comment")
    @Validation(required = true)
    public String comment;

    public static RiskTaskAudit build(java.util.Map<String, ?> map) throws Exception {
        RiskTaskAudit self = new RiskTaskAudit();
        return TeaModel.build(map, self);
    }

    public RiskTaskAudit setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public RiskTaskAudit setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

    public RiskTaskAudit setRiskTaskId(String riskTaskId) {
        this.riskTaskId = riskTaskId;
        return this;
    }
    public String getRiskTaskId() {
        return this.riskTaskId;
    }

    public RiskTaskAudit setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

}
