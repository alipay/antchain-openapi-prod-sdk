// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class MediationCaseDetailInfo extends TeaModel {
    // 案件编码
    @NameInMap("case_number")
    @Validation(required = true)
    public String caseNumber;

    // 案号
    @NameInMap("case_code")
    @Validation(required = true)
    public String caseCode;

    // 案由
    @NameInMap("cause_action_name")
    @Validation(required = true)
    public String causeActionName;

    // 案件状态
    @NameInMap("case_tatus")
    @Validation(required = true)
    public String caseTatus;

    // 调解平台
    @NameInMap("mediation_platform")
    @Validation(required = true)
    public String mediationPlatform;

    // 调解机构
    @NameInMap("mediation_org")
    @Validation(required = true)
    public String mediationOrg;

    // 调解员
    @NameInMap("mediator")
    @Validation(required = true)
    public String mediator;

    // 申请时间
    @NameInMap("apply_time")
    @Validation(required = true)
    public Long applyTime;

    // 调解结果
    @NameInMap("mediation_result")
    @Validation(required = true)
    public String mediationResult;

    // 申请人意向金额
    @NameInMap("accuser_intent_amount")
    @Validation(required = true)
    public Long accuserIntentAmount;

    // 被申请人意向金额
    @NameInMap("accused_intent_amount")
    @Validation(required = true)
    public Long accusedIntentAmount;

    // 和解金额
    @NameInMap("mediation_amount")
    @Validation(required = true)
    public Long mediationAmount;

    // 已确认事实
    @NameInMap("confirm_fact")
    @Validation(required = true)
    public String confirmFact;

    // 调解协议（已达成调解协议或未达成原因）
    @NameInMap("mediation_agreement")
    @Validation(required = true)
    public String mediationAgreement;

    public static MediationCaseDetailInfo build(java.util.Map<String, ?> map) throws Exception {
        MediationCaseDetailInfo self = new MediationCaseDetailInfo();
        return TeaModel.build(map, self);
    }

    public MediationCaseDetailInfo setCaseNumber(String caseNumber) {
        this.caseNumber = caseNumber;
        return this;
    }
    public String getCaseNumber() {
        return this.caseNumber;
    }

    public MediationCaseDetailInfo setCaseCode(String caseCode) {
        this.caseCode = caseCode;
        return this;
    }
    public String getCaseCode() {
        return this.caseCode;
    }

    public MediationCaseDetailInfo setCauseActionName(String causeActionName) {
        this.causeActionName = causeActionName;
        return this;
    }
    public String getCauseActionName() {
        return this.causeActionName;
    }

    public MediationCaseDetailInfo setCaseTatus(String caseTatus) {
        this.caseTatus = caseTatus;
        return this;
    }
    public String getCaseTatus() {
        return this.caseTatus;
    }

    public MediationCaseDetailInfo setMediationPlatform(String mediationPlatform) {
        this.mediationPlatform = mediationPlatform;
        return this;
    }
    public String getMediationPlatform() {
        return this.mediationPlatform;
    }

    public MediationCaseDetailInfo setMediationOrg(String mediationOrg) {
        this.mediationOrg = mediationOrg;
        return this;
    }
    public String getMediationOrg() {
        return this.mediationOrg;
    }

    public MediationCaseDetailInfo setMediator(String mediator) {
        this.mediator = mediator;
        return this;
    }
    public String getMediator() {
        return this.mediator;
    }

    public MediationCaseDetailInfo setApplyTime(Long applyTime) {
        this.applyTime = applyTime;
        return this;
    }
    public Long getApplyTime() {
        return this.applyTime;
    }

    public MediationCaseDetailInfo setMediationResult(String mediationResult) {
        this.mediationResult = mediationResult;
        return this;
    }
    public String getMediationResult() {
        return this.mediationResult;
    }

    public MediationCaseDetailInfo setAccuserIntentAmount(Long accuserIntentAmount) {
        this.accuserIntentAmount = accuserIntentAmount;
        return this;
    }
    public Long getAccuserIntentAmount() {
        return this.accuserIntentAmount;
    }

    public MediationCaseDetailInfo setAccusedIntentAmount(Long accusedIntentAmount) {
        this.accusedIntentAmount = accusedIntentAmount;
        return this;
    }
    public Long getAccusedIntentAmount() {
        return this.accusedIntentAmount;
    }

    public MediationCaseDetailInfo setMediationAmount(Long mediationAmount) {
        this.mediationAmount = mediationAmount;
        return this;
    }
    public Long getMediationAmount() {
        return this.mediationAmount;
    }

    public MediationCaseDetailInfo setConfirmFact(String confirmFact) {
        this.confirmFact = confirmFact;
        return this;
    }
    public String getConfirmFact() {
        return this.confirmFact;
    }

    public MediationCaseDetailInfo setMediationAgreement(String mediationAgreement) {
        this.mediationAgreement = mediationAgreement;
        return this;
    }
    public String getMediationAgreement() {
        return this.mediationAgreement;
    }

}
