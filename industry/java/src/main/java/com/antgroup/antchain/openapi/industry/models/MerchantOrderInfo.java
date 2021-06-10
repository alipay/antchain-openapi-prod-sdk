// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.industry.models;

import com.aliyun.tea.*;

public class MerchantOrderInfo extends TeaModel {
    // 申请单id
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 平台方的用户id, 保持唯一
    @NameInMap("merchant_user_id")
    @Validation(required = true)
    public String merchantUserId;

    // 申请状态 99-已完结;-1-失败;031-审核中
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 风控审批状态。CREATE：已创建待审批、SKIP：跳过风控审批步骤、PASS：风控审核通过、REJECT：风控审批拒绝
    @NameInMap("fk_audit")
    public String fkAudit;

    // 风控审批备注
    @NameInMap("fk_audit_memo")
    public String fkAuditMemo;

    // 客资审核状态。CREATE：已创建待审批、SKIP：跳过客资审批步骤、PASS：客资审核通过、REJECT：客资审批拒绝客资审核状态。CREATE：已创建待审批、SKIP：跳过客资审批步骤、PASS：客资审核通过、REJECT：客资审批拒绝
    @NameInMap("kz_audit")
    public String kzAudit;

    // 客资审批备注
    @NameInMap("kz_audit_memo")
    public String kzAuditMemo;

    // 二级商户确认状态。CREATE：已发起二级商户确认、SKIP：无需确认、FAIL：签约失败、NOT_CONFIRM：商户未确认、FINISH签约完成
    @NameInMap("sub_confirm")
    public String subConfirm;

    // 进件备注, 主要用于保存审核拒绝原因
    @NameInMap("remark")
    public String remark;

    public static MerchantOrderInfo build(java.util.Map<String, ?> map) throws Exception {
        MerchantOrderInfo self = new MerchantOrderInfo();
        return TeaModel.build(map, self);
    }

    public MerchantOrderInfo setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public MerchantOrderInfo setMerchantUserId(String merchantUserId) {
        this.merchantUserId = merchantUserId;
        return this;
    }
    public String getMerchantUserId() {
        return this.merchantUserId;
    }

    public MerchantOrderInfo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public MerchantOrderInfo setFkAudit(String fkAudit) {
        this.fkAudit = fkAudit;
        return this;
    }
    public String getFkAudit() {
        return this.fkAudit;
    }

    public MerchantOrderInfo setFkAuditMemo(String fkAuditMemo) {
        this.fkAuditMemo = fkAuditMemo;
        return this;
    }
    public String getFkAuditMemo() {
        return this.fkAuditMemo;
    }

    public MerchantOrderInfo setKzAudit(String kzAudit) {
        this.kzAudit = kzAudit;
        return this;
    }
    public String getKzAudit() {
        return this.kzAudit;
    }

    public MerchantOrderInfo setKzAuditMemo(String kzAuditMemo) {
        this.kzAuditMemo = kzAuditMemo;
        return this;
    }
    public String getKzAuditMemo() {
        return this.kzAuditMemo;
    }

    public MerchantOrderInfo setSubConfirm(String subConfirm) {
        this.subConfirm = subConfirm;
        return this;
    }
    public String getSubConfirm() {
        return this.subConfirm;
    }

    public MerchantOrderInfo setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
