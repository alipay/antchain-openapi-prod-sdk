// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.partner.models;

import com.aliyun.tea.*;

public class ExpenditureProject extends TeaModel {
    // 项目阶段：   
    //     REQUIREMENT_CONFIRM("REQUIREMENT_CONFIRM", "需求确认", "SOLUTION"),
    //     SOLUTION("SOLUTION", "方案沟通", "TALKS"),
    //     TALKS("TALKS", "商务谈判", "SIGNED"),
    //     SIGNED("SIGNED", "签约完成", "SIGNED"),
    //     ABORT("ABORT", "项目终止", "ABORT"),
    // 
    @NameInMap("stage")
    @Validation(required = true)
    public String stage;

    // 项目状态：
    //     DOING("DOING","进行中"),
    //     ABORTED("ABORTED","已终止"),
    //     FINISHED("FINISHED","已完成"),
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 支出合同信息
    @NameInMap("contract")
    public ExpenditureContract contract;

    // 支出配置单信息
    @NameInMap("quotation")
    public ExpenditureQuotation quotation;

    // 合作计划id
    @NameInMap("collaboration_plan_id")
    public Long collaborationPlanId;

    public static ExpenditureProject build(java.util.Map<String, ?> map) throws Exception {
        ExpenditureProject self = new ExpenditureProject();
        return TeaModel.build(map, self);
    }

    public ExpenditureProject setStage(String stage) {
        this.stage = stage;
        return this;
    }
    public String getStage() {
        return this.stage;
    }

    public ExpenditureProject setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ExpenditureProject setContract(ExpenditureContract contract) {
        this.contract = contract;
        return this;
    }
    public ExpenditureContract getContract() {
        return this.contract;
    }

    public ExpenditureProject setQuotation(ExpenditureQuotation quotation) {
        this.quotation = quotation;
        return this;
    }
    public ExpenditureQuotation getQuotation() {
        return this.quotation;
    }

    public ExpenditureProject setCollaborationPlanId(Long collaborationPlanId) {
        this.collaborationPlanId = collaborationPlanId;
        return this;
    }
    public Long getCollaborationPlanId() {
        return this.collaborationPlanId;
    }

}
