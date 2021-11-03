// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryContractMerchantorderResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 申请单id
    @NameInMap("order_id")
    public String orderId;

    // 外部商户id
    @NameInMap("external_id")
    public String externalId;

    // 进件时填写的商户名称
    @NameInMap("merchant_name")
    public String merchantName;

    // 申请总体状态。99:已完结;-1:失败;031:审核中
    @NameInMap("status")
    public String status;

    // 申请单创建时间
    @NameInMap("apply_time")
    public String applyTime;

    // 风控审核状态。CREATE：已创建待审批、SKIP：跳过风控审批步骤、PASS：风控审核通过、REJECT：风控审批拒绝
    @NameInMap("fk_audit")
    public String fkAudit;

    // 风控审批备注，如有则返回
    @NameInMap("fk_audit_memo")
    public String fkAuditMemo;

    // 客资审核状态。CREATE：已创建待审批、SKIP：跳过客资审批步骤、PASS：客资审核通过、REJECT：客资审批拒绝
    @NameInMap("kz_audit")
    public String kzAudit;

    // 客资审批备注，如有则返回
    @NameInMap("kz_audit_memo")
    public String kzAuditMemo;

    // 二级商户确认状态。CREATE：已发起二级商户确认、SKIP：无需确认、FAIL：签约失败、NOT_CONFIRM：商户未确认、FINISH签约完成
    @NameInMap("sub_confirm")
    public String subConfirm;

    // 进件生成的卡编号，在发起结算时可以作为结算账号
    @NameInMap("card_alias_no")
    public String cardAliasNo;

    // 二级商户id。当总体申请状态status为99时，smid才算进件完成
    @NameInMap("smid")
    public String smid;

    // 本申请单的请求类型。一般可选值包括ZHIFUTONG_CONSULT（直付通商户预校验）/ZHIFUTONG_CREATE（直付通商户创建）/ZHIFUTONG_MODIFY（直付通商户修改）
    @NameInMap("apply_type")
    public String applyType;

    // 申请单处理失败时，通过此此段返回具体的失败理由；与kf_audit_memo和kz_audit_memo配合使用
    @NameInMap("reason")
    public String reason;

    public static QueryContractMerchantorderResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryContractMerchantorderResponse self = new QueryContractMerchantorderResponse();
        return TeaModel.build(map, self);
    }

    public QueryContractMerchantorderResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryContractMerchantorderResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryContractMerchantorderResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryContractMerchantorderResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public QueryContractMerchantorderResponse setExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }
    public String getExternalId() {
        return this.externalId;
    }

    public QueryContractMerchantorderResponse setMerchantName(String merchantName) {
        this.merchantName = merchantName;
        return this;
    }
    public String getMerchantName() {
        return this.merchantName;
    }

    public QueryContractMerchantorderResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryContractMerchantorderResponse setApplyTime(String applyTime) {
        this.applyTime = applyTime;
        return this;
    }
    public String getApplyTime() {
        return this.applyTime;
    }

    public QueryContractMerchantorderResponse setFkAudit(String fkAudit) {
        this.fkAudit = fkAudit;
        return this;
    }
    public String getFkAudit() {
        return this.fkAudit;
    }

    public QueryContractMerchantorderResponse setFkAuditMemo(String fkAuditMemo) {
        this.fkAuditMemo = fkAuditMemo;
        return this;
    }
    public String getFkAuditMemo() {
        return this.fkAuditMemo;
    }

    public QueryContractMerchantorderResponse setKzAudit(String kzAudit) {
        this.kzAudit = kzAudit;
        return this;
    }
    public String getKzAudit() {
        return this.kzAudit;
    }

    public QueryContractMerchantorderResponse setKzAuditMemo(String kzAuditMemo) {
        this.kzAuditMemo = kzAuditMemo;
        return this;
    }
    public String getKzAuditMemo() {
        return this.kzAuditMemo;
    }

    public QueryContractMerchantorderResponse setSubConfirm(String subConfirm) {
        this.subConfirm = subConfirm;
        return this;
    }
    public String getSubConfirm() {
        return this.subConfirm;
    }

    public QueryContractMerchantorderResponse setCardAliasNo(String cardAliasNo) {
        this.cardAliasNo = cardAliasNo;
        return this;
    }
    public String getCardAliasNo() {
        return this.cardAliasNo;
    }

    public QueryContractMerchantorderResponse setSmid(String smid) {
        this.smid = smid;
        return this;
    }
    public String getSmid() {
        return this.smid;
    }

    public QueryContractMerchantorderResponse setApplyType(String applyType) {
        this.applyType = applyType;
        return this;
    }
    public String getApplyType() {
        return this.applyType;
    }

    public QueryContractMerchantorderResponse setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

}
