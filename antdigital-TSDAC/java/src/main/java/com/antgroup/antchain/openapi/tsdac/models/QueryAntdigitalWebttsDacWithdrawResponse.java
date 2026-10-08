// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tsdac.models;

import com.aliyun.tea.*;

public class QueryAntdigitalWebttsDacWithdrawResponse extends TeaModel {
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

    // 创建人只能查看，不能进行审批操作
    @NameInMap("is_approved")
    public Long isApproved;

    // 链上交易hash
    @NameInMap("tx_hash")
    public String txHash;

    // 链上交易时间
    @NameInMap("transaction_time")
    public String transactionTime;

    // checker审批备注
    @NameInMap("checker_remark")
    public String checkerRemark;

    public static QueryAntdigitalWebttsDacWithdrawResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntdigitalWebttsDacWithdrawResponse self = new QueryAntdigitalWebttsDacWithdrawResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntdigitalWebttsDacWithdrawResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntdigitalWebttsDacWithdrawResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntdigitalWebttsDacWithdrawResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntdigitalWebttsDacWithdrawResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public QueryAntdigitalWebttsDacWithdrawResponse setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

    public QueryAntdigitalWebttsDacWithdrawResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryAntdigitalWebttsDacWithdrawResponse setTokenAmount(String tokenAmount) {
        this.tokenAmount = tokenAmount;
        return this;
    }
    public String getTokenAmount() {
        return this.tokenAmount;
    }

    public QueryAntdigitalWebttsDacWithdrawResponse setTokenSymbol(String tokenSymbol) {
        this.tokenSymbol = tokenSymbol;
        return this;
    }
    public String getTokenSymbol() {
        return this.tokenSymbol;
    }

    public QueryAntdigitalWebttsDacWithdrawResponse setBlockchain(String blockchain) {
        this.blockchain = blockchain;
        return this;
    }
    public String getBlockchain() {
        return this.blockchain;
    }

    public QueryAntdigitalWebttsDacWithdrawResponse setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
        return this;
    }
    public String getFromAddress() {
        return this.fromAddress;
    }

    public QueryAntdigitalWebttsDacWithdrawResponse setToAddress(String toAddress) {
        this.toAddress = toAddress;
        return this;
    }
    public String getToAddress() {
        return this.toAddress;
    }

    public QueryAntdigitalWebttsDacWithdrawResponse setSubmitTime(String submitTime) {
        this.submitTime = submitTime;
        return this;
    }
    public String getSubmitTime() {
        return this.submitTime;
    }

    public QueryAntdigitalWebttsDacWithdrawResponse setApproveTime(String approveTime) {
        this.approveTime = approveTime;
        return this;
    }
    public String getApproveTime() {
        return this.approveTime;
    }

    public QueryAntdigitalWebttsDacWithdrawResponse setMakerName(String makerName) {
        this.makerName = makerName;
        return this;
    }
    public String getMakerName() {
        return this.makerName;
    }

    public QueryAntdigitalWebttsDacWithdrawResponse setCheckerName(String checkerName) {
        this.checkerName = checkerName;
        return this;
    }
    public String getCheckerName() {
        return this.checkerName;
    }

    public QueryAntdigitalWebttsDacWithdrawResponse setIsApproved(Long isApproved) {
        this.isApproved = isApproved;
        return this;
    }
    public Long getIsApproved() {
        return this.isApproved;
    }

    public QueryAntdigitalWebttsDacWithdrawResponse setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public QueryAntdigitalWebttsDacWithdrawResponse setTransactionTime(String transactionTime) {
        this.transactionTime = transactionTime;
        return this;
    }
    public String getTransactionTime() {
        return this.transactionTime;
    }

    public QueryAntdigitalWebttsDacWithdrawResponse setCheckerRemark(String checkerRemark) {
        this.checkerRemark = checkerRemark;
        return this;
    }
    public String getCheckerRemark() {
        return this.checkerRemark;
    }

}
