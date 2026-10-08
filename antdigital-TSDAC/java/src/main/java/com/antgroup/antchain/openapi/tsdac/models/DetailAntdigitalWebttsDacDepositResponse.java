// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tsdac.models;

import com.aliyun.tea.*;

public class DetailAntdigitalWebttsDacDepositResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 订单号
    @NameInMap("order_id")
    public String orderId;

    // 操作类型
    @NameInMap("operation_type")
    public String operationType;

    // 状态
    @NameInMap("status")
    public String status;

    // 代币数量
    @NameInMap("token_amount")
    public String tokenAmount;

    // 代币
    @NameInMap("token_symbol")
    public String tokenSymbol;

    // 区块链网络
    @NameInMap("blockchain")
    public String blockchain;

    // 来源地址
    @NameInMap("from_address")
    public String fromAddress;

    // 充值/目标地址
    @NameInMap("to_address")
    public String toAddress;

    // 提交时间
    @NameInMap("submit_time")
    public String submitTime;

    // 审批时间
    @NameInMap("approve_time")
    public String approveTime;

    // 创建人Maker
    @NameInMap("maker_name")
    public String makerName;

    // 审核人Checker
    @NameInMap("checker_name")
    public String checkerName;

    // 过期时间
    @NameInMap("expired_time")
    public String expiredTime;

    // 链上交易hash
    @NameInMap("tx_hash")
    public String txHash;

    // 链上交易时间
    @NameInMap("transaction_time")
    public String transactionTime;

    public static DetailAntdigitalWebttsDacDepositResponse build(java.util.Map<String, ?> map) throws Exception {
        DetailAntdigitalWebttsDacDepositResponse self = new DetailAntdigitalWebttsDacDepositResponse();
        return TeaModel.build(map, self);
    }

    public DetailAntdigitalWebttsDacDepositResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public DetailAntdigitalWebttsDacDepositResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DetailAntdigitalWebttsDacDepositResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DetailAntdigitalWebttsDacDepositResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public DetailAntdigitalWebttsDacDepositResponse setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

    public DetailAntdigitalWebttsDacDepositResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DetailAntdigitalWebttsDacDepositResponse setTokenAmount(String tokenAmount) {
        this.tokenAmount = tokenAmount;
        return this;
    }
    public String getTokenAmount() {
        return this.tokenAmount;
    }

    public DetailAntdigitalWebttsDacDepositResponse setTokenSymbol(String tokenSymbol) {
        this.tokenSymbol = tokenSymbol;
        return this;
    }
    public String getTokenSymbol() {
        return this.tokenSymbol;
    }

    public DetailAntdigitalWebttsDacDepositResponse setBlockchain(String blockchain) {
        this.blockchain = blockchain;
        return this;
    }
    public String getBlockchain() {
        return this.blockchain;
    }

    public DetailAntdigitalWebttsDacDepositResponse setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
        return this;
    }
    public String getFromAddress() {
        return this.fromAddress;
    }

    public DetailAntdigitalWebttsDacDepositResponse setToAddress(String toAddress) {
        this.toAddress = toAddress;
        return this;
    }
    public String getToAddress() {
        return this.toAddress;
    }

    public DetailAntdigitalWebttsDacDepositResponse setSubmitTime(String submitTime) {
        this.submitTime = submitTime;
        return this;
    }
    public String getSubmitTime() {
        return this.submitTime;
    }

    public DetailAntdigitalWebttsDacDepositResponse setApproveTime(String approveTime) {
        this.approveTime = approveTime;
        return this;
    }
    public String getApproveTime() {
        return this.approveTime;
    }

    public DetailAntdigitalWebttsDacDepositResponse setMakerName(String makerName) {
        this.makerName = makerName;
        return this;
    }
    public String getMakerName() {
        return this.makerName;
    }

    public DetailAntdigitalWebttsDacDepositResponse setCheckerName(String checkerName) {
        this.checkerName = checkerName;
        return this;
    }
    public String getCheckerName() {
        return this.checkerName;
    }

    public DetailAntdigitalWebttsDacDepositResponse setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }
    public String getExpiredTime() {
        return this.expiredTime;
    }

    public DetailAntdigitalWebttsDacDepositResponse setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public DetailAntdigitalWebttsDacDepositResponse setTransactionTime(String transactionTime) {
        this.transactionTime = transactionTime;
        return this;
    }
    public String getTransactionTime() {
        return this.transactionTime;
    }

}
