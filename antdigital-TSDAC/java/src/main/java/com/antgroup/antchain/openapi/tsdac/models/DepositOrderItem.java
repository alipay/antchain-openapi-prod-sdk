// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tsdac.models;

import com.aliyun.tea.*;

public class DepositOrderItem extends TeaModel {
    // 订单号
    /**
     * <strong>example:</strong>
     * <p>订单号</p>
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
     * <p>审批时间</p>
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
     * <p>代币</p>
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

    // 订单过期时间
    /**
     * <strong>example:</strong>
     * <p>2026-09-01 16:10:46</p>
     */
    @NameInMap("expired_time")
    @Validation(required = true)
    public String expiredTime;

    // 链上交易hash
    /**
     * <strong>example:</strong>
     * <p>0xa02b024081e380291f3af893a59d70482f1470c2a4dfe3a73554a496e4773c56</p>
     */
    @NameInMap("tx_hash")
    @Validation(required = true)
    public String txHash;

    // 链上交易时间
    /**
     * <strong>example:</strong>
     * <p>2026-09-01 16:10:46</p>
     */
    @NameInMap("transaction_time")
    @Validation(required = true)
    public String transactionTime;

    public static DepositOrderItem build(java.util.Map<String, ?> map) throws Exception {
        DepositOrderItem self = new DepositOrderItem();
        return TeaModel.build(map, self);
    }

    public DepositOrderItem setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public DepositOrderItem setSubmitTime(String submitTime) {
        this.submitTime = submitTime;
        return this;
    }
    public String getSubmitTime() {
        return this.submitTime;
    }

    public DepositOrderItem setApproveTime(String approveTime) {
        this.approveTime = approveTime;
        return this;
    }
    public String getApproveTime() {
        return this.approveTime;
    }

    public DepositOrderItem setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

    public DepositOrderItem setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
        return this;
    }
    public String getFromAddress() {
        return this.fromAddress;
    }

    public DepositOrderItem setToAddress(String toAddress) {
        this.toAddress = toAddress;
        return this;
    }
    public String getToAddress() {
        return this.toAddress;
    }

    public DepositOrderItem setBlockchain(String blockchain) {
        this.blockchain = blockchain;
        return this;
    }
    public String getBlockchain() {
        return this.blockchain;
    }

    public DepositOrderItem setTokenSymbol(String tokenSymbol) {
        this.tokenSymbol = tokenSymbol;
        return this;
    }
    public String getTokenSymbol() {
        return this.tokenSymbol;
    }

    public DepositOrderItem setTokenAmount(String tokenAmount) {
        this.tokenAmount = tokenAmount;
        return this;
    }
    public String getTokenAmount() {
        return this.tokenAmount;
    }

    public DepositOrderItem setMakerName(String makerName) {
        this.makerName = makerName;
        return this;
    }
    public String getMakerName() {
        return this.makerName;
    }

    public DepositOrderItem setCheckerName(String checkerName) {
        this.checkerName = checkerName;
        return this;
    }
    public String getCheckerName() {
        return this.checkerName;
    }

    public DepositOrderItem setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DepositOrderItem setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }
    public String getExpiredTime() {
        return this.expiredTime;
    }

    public DepositOrderItem setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public DepositOrderItem setTransactionTime(String transactionTime) {
        this.transactionTime = transactionTime;
        return this;
    }
    public String getTransactionTime() {
        return this.transactionTime;
    }

}
