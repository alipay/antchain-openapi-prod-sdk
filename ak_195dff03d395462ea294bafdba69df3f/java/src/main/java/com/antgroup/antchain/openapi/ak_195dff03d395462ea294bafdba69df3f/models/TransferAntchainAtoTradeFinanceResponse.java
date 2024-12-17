// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class TransferAntchainAtoTradeFinanceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // order_id
    @NameInMap("order_id")
    public String orderId;

    // merchant_id
    @NameInMap("merchant_id")
    public String merchantId;

    // jsonArray.toString
    @NameInMap("fund_candidates")
    public String fundCandidates;

    // 转融资结果
    @NameInMap("transfer_result")
    public String transferResult;

    public static TransferAntchainAtoTradeFinanceResponse build(java.util.Map<String, ?> map) throws Exception {
        TransferAntchainAtoTradeFinanceResponse self = new TransferAntchainAtoTradeFinanceResponse();
        return TeaModel.build(map, self);
    }

    public TransferAntchainAtoTradeFinanceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public TransferAntchainAtoTradeFinanceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public TransferAntchainAtoTradeFinanceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public TransferAntchainAtoTradeFinanceResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public TransferAntchainAtoTradeFinanceResponse setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public TransferAntchainAtoTradeFinanceResponse setFundCandidates(String fundCandidates) {
        this.fundCandidates = fundCandidates;
        return this;
    }
    public String getFundCandidates() {
        return this.fundCandidates;
    }

    public TransferAntchainAtoTradeFinanceResponse setTransferResult(String transferResult) {
        this.transferResult = transferResult;
        return this;
    }
    public String getTransferResult() {
        return this.transferResult;
    }

}
