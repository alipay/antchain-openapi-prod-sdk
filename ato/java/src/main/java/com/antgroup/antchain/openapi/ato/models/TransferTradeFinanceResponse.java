// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class TransferTradeFinanceResponse extends TeaModel {
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

    public static TransferTradeFinanceResponse build(java.util.Map<String, ?> map) throws Exception {
        TransferTradeFinanceResponse self = new TransferTradeFinanceResponse();
        return TeaModel.build(map, self);
    }

    public TransferTradeFinanceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public TransferTradeFinanceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public TransferTradeFinanceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public TransferTradeFinanceResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public TransferTradeFinanceResponse setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public TransferTradeFinanceResponse setFundCandidates(String fundCandidates) {
        this.fundCandidates = fundCandidates;
        return this;
    }
    public String getFundCandidates() {
        return this.fundCandidates;
    }

    public TransferTradeFinanceResponse setTransferResult(String transferResult) {
        this.transferResult = transferResult;
        return this;
    }
    public String getTransferResult() {
        return this.transferResult;
    }

}
