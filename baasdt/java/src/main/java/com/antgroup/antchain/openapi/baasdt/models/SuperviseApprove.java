// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class SuperviseApprove extends TeaModel {
    // 关联的订单id
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 当前的阶段
    @NameInMap("stage")
    @Validation(required = true)
    public Long stage;

    // json组织，用于存储监修报审的具体信息
    @NameInMap("ext_info")
    @Validation(required = true)
    public String extInfo;

    // 当前阶段的审批状态   0:待审批，1:审批通过 2:审批拒绝
    @NameInMap("approval_status")
    @Validation(required = true)
    public Long approvalStatus;

    // 审批备注
    @NameInMap("approval_comments")
    public String approvalComments;

    // 上链的交易hash
    @NameInMap("tx_hash")
    @Validation(required = true)
    public String txHash;

    // 关联的订单交易的ip id
    @NameInMap("ip_id")
    @Validation(required = true)
    public String ipId;

    // 关联交易的卖家id
    @NameInMap("seller_account_id")
    @Validation(required = true)
    public String sellerAccountId;

    // 关联交易的买家id
    @NameInMap("buyer_account_id")
    @Validation(required = true)
    public String buyerAccountId;

    // 审批额外信息
    @NameInMap("approval_ext_info")
    public String approvalExtInfo;

    public static SuperviseApprove build(java.util.Map<String, ?> map) throws Exception {
        SuperviseApprove self = new SuperviseApprove();
        return TeaModel.build(map, self);
    }

    public SuperviseApprove setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public SuperviseApprove setStage(Long stage) {
        this.stage = stage;
        return this;
    }
    public Long getStage() {
        return this.stage;
    }

    public SuperviseApprove setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public SuperviseApprove setApprovalStatus(Long approvalStatus) {
        this.approvalStatus = approvalStatus;
        return this;
    }
    public Long getApprovalStatus() {
        return this.approvalStatus;
    }

    public SuperviseApprove setApprovalComments(String approvalComments) {
        this.approvalComments = approvalComments;
        return this;
    }
    public String getApprovalComments() {
        return this.approvalComments;
    }

    public SuperviseApprove setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public SuperviseApprove setIpId(String ipId) {
        this.ipId = ipId;
        return this;
    }
    public String getIpId() {
        return this.ipId;
    }

    public SuperviseApprove setSellerAccountId(String sellerAccountId) {
        this.sellerAccountId = sellerAccountId;
        return this;
    }
    public String getSellerAccountId() {
        return this.sellerAccountId;
    }

    public SuperviseApprove setBuyerAccountId(String buyerAccountId) {
        this.buyerAccountId = buyerAccountId;
        return this;
    }
    public String getBuyerAccountId() {
        return this.buyerAccountId;
    }

    public SuperviseApprove setApprovalExtInfo(String approvalExtInfo) {
        this.approvalExtInfo = approvalExtInfo;
        return this;
    }
    public String getApprovalExtInfo() {
        return this.approvalExtInfo;
    }

}
