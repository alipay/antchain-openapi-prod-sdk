// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CaseBaseInfo extends TeaModel {
    // caseID
    @NameInMap("case_id")
    @Validation(required = true)
    public String caseId;

    // PENDING_RIGHTS_PROTECTION(1, "待发起维权"),
    // TO_BE_SUBMITTED(2, "待提交"),
    // ACCEPTED_AND_PROCESSED(3, "收案处理中"),
    // RESULTS_TO_BE_CONFIRMED(4, "结果待确认"),
    // CLOSED(5, "已关闭"),
    @NameInMap("case_phase")
    @Validation(required = true)
    public String casePhase;

    // 维权ID
    @NameInMap("record_id")
    @Validation(required = true)
    public String recordId;

    // MEDIATION(1, "调解"),
    // LITIGATION(2, "诉讼"),
    // ARBITRATION(3, "仲裁"),
    // CARRIED_OUT(4, "执行"),
    @NameInMap("record_type")
    @Validation(required = true)
    public String recordType;

    // MATERIAL_PREPARATION(1, "材料准备中"),
    // SUBMITTED(2, "已提交"),
    // FILED(3, "已立案"),
    // CLOSED(4, "已结案"),
    // WITHDRAW_THE_CASE(5, "撤案"),
    // REVOKE(6, "撤销"),
    // INADMISSIBLE(7, "不予受理"),
    // SUBMITTING(8, "提交中"),
    // SUBMISSION_FAILED(9, "提交失败"),
    // FINAL_RULING(10, "裁定终本"),
    // CARRIED_OUT_FINISHED(11, "执行完毕"),
    // TO_BE_SIGNED(12, "签署中"),
    // SIGNING_TIMED_OUT(13, "签署超时"),
    // SIGN_REJECTED(14, "签署被拒绝"),
    // SIGN_REVOCATION(15, "签署撤销"),
    // WITHDRAW_THE_CASE_ING(16, "撤案处理中"),
    // WITHDRAW_SIGNING_TIMED_OUT(17, "撤案签署超时"),
    // WITHDRAW_SIGN_REJECTED(18, "撤案签署被拒绝"),
    // WITHDRAW_SIGN_REVOCATION(19, "撤案签署撤销"),
    // SIGNED(20, "签署完成"),
    // WITHDRAW_SIGNED(21, "撤案签署完成"),
    @NameInMap("case_status")
    @Validation(required = true)
    public String caseStatus;

    // 案件提交时间
    @NameInMap("submit_time")
    @Validation(required = true)
    public String submitTime;

    // 维权机构
    @NameInMap("arbitral_body")
    @Validation(required = true)
    public String arbitralBody;

    // 结案时间 如没有则为""
    @NameInMap("close_time")
    public String closeTime;

    // 案号 如没有则为""
    @NameInMap("acceptance_number")
    public String acceptanceNumber;

    // 案件回款金额,两位小数 单位(元) 如没有则为""
    @NameInMap("case_payment_actual_amount")
    public String casePaymentActualAmount;

    // 是否能够下载 true可以下载 false没有可下载文件
    @NameInMap("can_download")
    @Validation(required = true)
    public String canDownload;

    public static CaseBaseInfo build(java.util.Map<String, ?> map) throws Exception {
        CaseBaseInfo self = new CaseBaseInfo();
        return TeaModel.build(map, self);
    }

    public CaseBaseInfo setCaseId(String caseId) {
        this.caseId = caseId;
        return this;
    }
    public String getCaseId() {
        return this.caseId;
    }

    public CaseBaseInfo setCasePhase(String casePhase) {
        this.casePhase = casePhase;
        return this;
    }
    public String getCasePhase() {
        return this.casePhase;
    }

    public CaseBaseInfo setRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }
    public String getRecordId() {
        return this.recordId;
    }

    public CaseBaseInfo setRecordType(String recordType) {
        this.recordType = recordType;
        return this;
    }
    public String getRecordType() {
        return this.recordType;
    }

    public CaseBaseInfo setCaseStatus(String caseStatus) {
        this.caseStatus = caseStatus;
        return this;
    }
    public String getCaseStatus() {
        return this.caseStatus;
    }

    public CaseBaseInfo setSubmitTime(String submitTime) {
        this.submitTime = submitTime;
        return this;
    }
    public String getSubmitTime() {
        return this.submitTime;
    }

    public CaseBaseInfo setArbitralBody(String arbitralBody) {
        this.arbitralBody = arbitralBody;
        return this;
    }
    public String getArbitralBody() {
        return this.arbitralBody;
    }

    public CaseBaseInfo setCloseTime(String closeTime) {
        this.closeTime = closeTime;
        return this;
    }
    public String getCloseTime() {
        return this.closeTime;
    }

    public CaseBaseInfo setAcceptanceNumber(String acceptanceNumber) {
        this.acceptanceNumber = acceptanceNumber;
        return this;
    }
    public String getAcceptanceNumber() {
        return this.acceptanceNumber;
    }

    public CaseBaseInfo setCasePaymentActualAmount(String casePaymentActualAmount) {
        this.casePaymentActualAmount = casePaymentActualAmount;
        return this;
    }
    public String getCasePaymentActualAmount() {
        return this.casePaymentActualAmount;
    }

    public CaseBaseInfo setCanDownload(String canDownload) {
        this.canDownload = canDownload;
        return this;
    }
    public String getCanDownload() {
        return this.canDownload;
    }

}
