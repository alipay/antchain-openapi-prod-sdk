// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class SubMerchantOrder extends TeaModel {
    // 是否开通线上预授权，
    // TRUE/FALSE
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("app_pre_auth")
    public String appPreAuth;

    // 申请单创建时间
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("apply_time")
    @Validation(required = true)
    public String applyTime;

    // 本申请单的请求类型，
    // 商户预校验: ZHIFUTONG_CONSULT
    // 商户创建: ZHIFUTONG_CREATE
    // 商户修改: ZHIFUTONG_MODIFY
    // 
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("apply_type")
    @Validation(required = true)
    public String applyType;

    // 进件生成的卡编号，在发起结算时可以作为结算账号
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("card_alias_no")
    public String cardAliasNo;

    // 外部商户id
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("external_id")
    @Validation(required = true)
    public String externalId;

    // 是否开通线下预授权，
    // TRUE/FALSE
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("face_pre_auth")
    public String facePreAuth;

    // 风控审核状态，
    // CREATE: 已创建待审批
    // SKIP: 跳过风控审批步骤
    // PASS: 风控审核通过
    // REJECT: 风控审批拒绝
    // 
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("fk_audit")
    public String fkAudit;

    // 风控审批备注
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("fk_audit_memo")
    public String fkAuditMemo;

    // 判断个人当面付权限版本，
    // TRUE: 表示是标准版
    // FALSE: 表示受限版
    // 
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("is_face_limit")
    public String isFaceLimit;

    // 客资审核状态，
    // CREATE: 已创建待审批
    // SKIP: 跳过客资审批步骤
    // PASS: 客资审核通过
    // REJECT: 客资审批拒绝
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("kz_audit")
    public String kzAudit;

    // 客资审批备注
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("kz_audit_memo")
    public String kzAuditMemo;

    // 进件时填写的商户名称
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("merchant_name")
    public String merchantName;

    // 入驻申请单号
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 申请单处理失败时，通过此此段返回具体的失败理由，
    // 与kf_audit_memo和kz_audit_memo配合使用
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("reason")
    public String reason;

    // 签约支付宝账号（脱敏）
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("safe_binding_logon_id")
    public String safeBindingLogonId;

    // 二级商户id，当总体申请状态status为99时，smid才算进件完成
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("smid")
    public String smid;

    // 申请总体状态，
    // 99: 已完结
    // -1: 失败
    // 031: 审核中
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 二级商户确认状态，
    // CREATE: 已发起二级商户确认
    // SKIP: 无需确认
    // FAIL: 签约失败
    // NOT_CONFIRM: 商户未确认
    // FINISH: 签约完成
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("sub_confirm")
    public String subConfirm;

    public static SubMerchantOrder build(java.util.Map<String, ?> map) throws Exception {
        SubMerchantOrder self = new SubMerchantOrder();
        return TeaModel.build(map, self);
    }

    public SubMerchantOrder setAppPreAuth(String appPreAuth) {
        this.appPreAuth = appPreAuth;
        return this;
    }
    public String getAppPreAuth() {
        return this.appPreAuth;
    }

    public SubMerchantOrder setApplyTime(String applyTime) {
        this.applyTime = applyTime;
        return this;
    }
    public String getApplyTime() {
        return this.applyTime;
    }

    public SubMerchantOrder setApplyType(String applyType) {
        this.applyType = applyType;
        return this;
    }
    public String getApplyType() {
        return this.applyType;
    }

    public SubMerchantOrder setCardAliasNo(String cardAliasNo) {
        this.cardAliasNo = cardAliasNo;
        return this;
    }
    public String getCardAliasNo() {
        return this.cardAliasNo;
    }

    public SubMerchantOrder setExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }
    public String getExternalId() {
        return this.externalId;
    }

    public SubMerchantOrder setFacePreAuth(String facePreAuth) {
        this.facePreAuth = facePreAuth;
        return this;
    }
    public String getFacePreAuth() {
        return this.facePreAuth;
    }

    public SubMerchantOrder setFkAudit(String fkAudit) {
        this.fkAudit = fkAudit;
        return this;
    }
    public String getFkAudit() {
        return this.fkAudit;
    }

    public SubMerchantOrder setFkAuditMemo(String fkAuditMemo) {
        this.fkAuditMemo = fkAuditMemo;
        return this;
    }
    public String getFkAuditMemo() {
        return this.fkAuditMemo;
    }

    public SubMerchantOrder setIsFaceLimit(String isFaceLimit) {
        this.isFaceLimit = isFaceLimit;
        return this;
    }
    public String getIsFaceLimit() {
        return this.isFaceLimit;
    }

    public SubMerchantOrder setKzAudit(String kzAudit) {
        this.kzAudit = kzAudit;
        return this;
    }
    public String getKzAudit() {
        return this.kzAudit;
    }

    public SubMerchantOrder setKzAuditMemo(String kzAuditMemo) {
        this.kzAuditMemo = kzAuditMemo;
        return this;
    }
    public String getKzAuditMemo() {
        return this.kzAuditMemo;
    }

    public SubMerchantOrder setMerchantName(String merchantName) {
        this.merchantName = merchantName;
        return this;
    }
    public String getMerchantName() {
        return this.merchantName;
    }

    public SubMerchantOrder setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public SubMerchantOrder setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public SubMerchantOrder setSafeBindingLogonId(String safeBindingLogonId) {
        this.safeBindingLogonId = safeBindingLogonId;
        return this;
    }
    public String getSafeBindingLogonId() {
        return this.safeBindingLogonId;
    }

    public SubMerchantOrder setSmid(String smid) {
        this.smid = smid;
        return this;
    }
    public String getSmid() {
        return this.smid;
    }

    public SubMerchantOrder setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public SubMerchantOrder setSubConfirm(String subConfirm) {
        this.subConfirm = subConfirm;
        return this;
    }
    public String getSubConfirm() {
        return this.subConfirm;
    }

}
