// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tsdac.models;

import com.aliyun.tea.*;

public class WithdrawOrderItem extends TeaModel {
    // 订单号
    /**
     * <strong>example:</strong>
     * <p>202605011200000016</p>
     */
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 提交时间
    /**
     * <strong>example:</strong>
     * <p>提交时间</p>
     */
    @NameInMap("submit_time")
    @Validation(required = true)
    public String submitTime;

    // 审批时间
    /**
     * <strong>example:</strong>
     * <p>审批时间,格式 yyyy-MM-dd HH:mm:ss</p>
     */
    @NameInMap("approve_time")
    @Validation(required = true)
    public String approveTime;

    // 操作类型
    /**
     * <strong>example:</strong>
     * <p>操作类型</p>
     */
    @NameInMap("operation_type")
    @Validation(required = true)
    public String operationType;

    // 来源地址
    /**
     * <strong>example:</strong>
     * <p>来源地址</p>
     */
    @NameInMap("from_address")
    @Validation(required = true)
    public String fromAddress;

    // 充值/目标地址
    /**
     * <strong>example:</strong>
     * <p>充值/目标地址</p>
     */
    @NameInMap("to_address")
    @Validation(required = true)
    public String toAddress;

    // 区块链网络
    /**
     * <strong>example:</strong>
     * <p>区块链网络</p>
     */
    @NameInMap("blockchain")
    @Validation(required = true)
    public String blockchain;

    // 代币
    /**
     * <strong>example:</strong>
     * <p>ETH</p>
     */
    @NameInMap("token_symbol")
    @Validation(required = true)
    public String tokenSymbol;

    // 代币数量
    /**
     * <strong>example:</strong>
     * <p>代币数量</p>
     */
    @NameInMap("token_amount")
    @Validation(required = true)
    public String tokenAmount;

    // 创建人Maker
    /**
     * <strong>example:</strong>
     * <p>创建人Maker</p>
     */
    @NameInMap("maker_name")
    @Validation(required = true)
    public String makerName;

    // 审核人Checker
    /**
     * <strong>example:</strong>
     * <p>审核人Checker</p>
     */
    @NameInMap("checker_name")
    @Validation(required = true)
    public String checkerName;

    // 状态
    /**
     * <strong>example:</strong>
     * <p>状态</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 链上交易hash
    /**
     * <strong>example:</strong>
     * <p>0xa02b024081e380291f3af893a59d70482f1470c2a4dfe3a73554a496e4773c56</p>
     */
    @NameInMap("tx_hash")
    public String txHash;

    // 链上交易时间
    /**
     * <strong>example:</strong>
     * <p>2026-05-01 12:00:00</p>
     */
    @NameInMap("transaction_time")
    public String transactionTime;

    // checker审批备注
    /**
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("checker_remark")
    public String checkerRemark;

    public static WithdrawOrderItem build(java.util.Map<String, ?> map) throws Exception {
        WithdrawOrderItem self = new WithdrawOrderItem();
        return TeaModel.build(map, self);
    }

    public WithdrawOrderItem setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public WithdrawOrderItem setSubmitTime(String submitTime) {
        this.submitTime = submitTime;
        return this;
    }
    public String getSubmitTime() {
        return this.submitTime;
    }

    public WithdrawOrderItem setApproveTime(String approveTime) {
        this.approveTime = approveTime;
        return this;
    }
    public String getApproveTime() {
        return this.approveTime;
    }

    public WithdrawOrderItem setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

    public WithdrawOrderItem setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
        return this;
    }
    public String getFromAddress() {
        return this.fromAddress;
    }

    public WithdrawOrderItem setToAddress(String toAddress) {
        this.toAddress = toAddress;
        return this;
    }
    public String getToAddress() {
        return this.toAddress;
    }

    public WithdrawOrderItem setBlockchain(String blockchain) {
        this.blockchain = blockchain;
        return this;
    }
    public String getBlockchain() {
        return this.blockchain;
    }

    public WithdrawOrderItem setTokenSymbol(String tokenSymbol) {
        this.tokenSymbol = tokenSymbol;
        return this;
    }
    public String getTokenSymbol() {
        return this.tokenSymbol;
    }

    public WithdrawOrderItem setTokenAmount(String tokenAmount) {
        this.tokenAmount = tokenAmount;
        return this;
    }
    public String getTokenAmount() {
        return this.tokenAmount;
    }

    public WithdrawOrderItem setMakerName(String makerName) {
        this.makerName = makerName;
        return this;
    }
    public String getMakerName() {
        return this.makerName;
    }

    public WithdrawOrderItem setCheckerName(String checkerName) {
        this.checkerName = checkerName;
        return this;
    }
    public String getCheckerName() {
        return this.checkerName;
    }

    public WithdrawOrderItem setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public WithdrawOrderItem setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public WithdrawOrderItem setTransactionTime(String transactionTime) {
        this.transactionTime = transactionTime;
        return this;
    }
    public String getTransactionTime() {
        return this.transactionTime;
    }

    public WithdrawOrderItem setCheckerRemark(String checkerRemark) {
        this.checkerRemark = checkerRemark;
        return this;
    }
    public String getCheckerRemark() {
        return this.checkerRemark;
    }

}
