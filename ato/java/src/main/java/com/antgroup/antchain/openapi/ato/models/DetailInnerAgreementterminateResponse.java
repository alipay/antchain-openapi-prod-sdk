// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class DetailInnerAgreementterminateResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 订单ID
    @NameInMap("order_id")
    public String orderId;

    // 申请解约号
    @NameInMap("terminate_apply_id")
    public String terminateApplyId;

    // 订单创建时间
    @NameInMap("order_gmt_create")
    public String orderGmtCreate;

    // 用户解约申请时间
    @NameInMap("gmt_terminate_apply")
    public String gmtTerminateApply;

    // 解约状态
    @NameInMap("terminate_status")
    public String terminateStatus;

    // 商家举证材料列表
    @NameInMap("merchant_support_evidence_list")
    public java.util.List<MerchantSupportEvidence> merchantSupportEvidenceList;

    // 用户申请解约材料
    @NameInMap("terminate_apply_evidence_list")
    public java.util.List<TerminateApplyEvidence> terminateApplyEvidenceList;

    // 代扣协议中标示用户的唯一签约号（确保在商户系统中唯一）
    @NameInMap("external_agreement_no")
    public String externalAgreementNo;

    // 支付宝系统中用以唯一标识用户签约记录的编号
    @NameInMap("agreement_no")
    public String agreementNo;

    // 处理状态
    @NameInMap("handle_status")
    public String handleStatus;

    public static DetailInnerAgreementterminateResponse build(java.util.Map<String, ?> map) throws Exception {
        DetailInnerAgreementterminateResponse self = new DetailInnerAgreementterminateResponse();
        return TeaModel.build(map, self);
    }

    public DetailInnerAgreementterminateResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public DetailInnerAgreementterminateResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DetailInnerAgreementterminateResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DetailInnerAgreementterminateResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public DetailInnerAgreementterminateResponse setTerminateApplyId(String terminateApplyId) {
        this.terminateApplyId = terminateApplyId;
        return this;
    }
    public String getTerminateApplyId() {
        return this.terminateApplyId;
    }

    public DetailInnerAgreementterminateResponse setOrderGmtCreate(String orderGmtCreate) {
        this.orderGmtCreate = orderGmtCreate;
        return this;
    }
    public String getOrderGmtCreate() {
        return this.orderGmtCreate;
    }

    public DetailInnerAgreementterminateResponse setGmtTerminateApply(String gmtTerminateApply) {
        this.gmtTerminateApply = gmtTerminateApply;
        return this;
    }
    public String getGmtTerminateApply() {
        return this.gmtTerminateApply;
    }

    public DetailInnerAgreementterminateResponse setTerminateStatus(String terminateStatus) {
        this.terminateStatus = terminateStatus;
        return this;
    }
    public String getTerminateStatus() {
        return this.terminateStatus;
    }

    public DetailInnerAgreementterminateResponse setMerchantSupportEvidenceList(java.util.List<MerchantSupportEvidence> merchantSupportEvidenceList) {
        this.merchantSupportEvidenceList = merchantSupportEvidenceList;
        return this;
    }
    public java.util.List<MerchantSupportEvidence> getMerchantSupportEvidenceList() {
        return this.merchantSupportEvidenceList;
    }

    public DetailInnerAgreementterminateResponse setTerminateApplyEvidenceList(java.util.List<TerminateApplyEvidence> terminateApplyEvidenceList) {
        this.terminateApplyEvidenceList = terminateApplyEvidenceList;
        return this;
    }
    public java.util.List<TerminateApplyEvidence> getTerminateApplyEvidenceList() {
        return this.terminateApplyEvidenceList;
    }

    public DetailInnerAgreementterminateResponse setExternalAgreementNo(String externalAgreementNo) {
        this.externalAgreementNo = externalAgreementNo;
        return this;
    }
    public String getExternalAgreementNo() {
        return this.externalAgreementNo;
    }

    public DetailInnerAgreementterminateResponse setAgreementNo(String agreementNo) {
        this.agreementNo = agreementNo;
        return this;
    }
    public String getAgreementNo() {
        return this.agreementNo;
    }

    public DetailInnerAgreementterminateResponse setHandleStatus(String handleStatus) {
        this.handleStatus = handleStatus;
        return this;
    }
    public String getHandleStatus() {
        return this.handleStatus;
    }

}
