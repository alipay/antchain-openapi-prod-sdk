// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.industry.models;

import com.aliyun.tea.*;

public class QueryTradeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 商户订单号
    @NameInMap("merchant_order_no")
    public String merchantOrderNo;

    // 来源场景码
    @NameInMap("source")
    public String source;

    // 渠道场景码
    @NameInMap("channel")
    public String channel;

    // 交易状态
    // WAIT_BUYER_PAY - 交易创建，等待买家付款
    // TRADE_CLOSED - 未付款交易超时关闭，或支付完成后全额退款
    // TRADE_SUCCESS - 交易成功
    @NameInMap("trade_status")
    public String tradeStatus;

    // 币种，默认156-人民币
    @NameInMap("currency_value")
    public String currencyValue;

    // 交易结算信息
    @NameInMap("trade_settle_info")
    public java.util.List<TradeSettleDetail> tradeSettleInfo;

    public static QueryTradeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTradeResponse self = new QueryTradeResponse();
        return TeaModel.build(map, self);
    }

    public QueryTradeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryTradeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTradeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryTradeResponse setMerchantOrderNo(String merchantOrderNo) {
        this.merchantOrderNo = merchantOrderNo;
        return this;
    }
    public String getMerchantOrderNo() {
        return this.merchantOrderNo;
    }

    public QueryTradeResponse setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public QueryTradeResponse setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public QueryTradeResponse setTradeStatus(String tradeStatus) {
        this.tradeStatus = tradeStatus;
        return this;
    }
    public String getTradeStatus() {
        return this.tradeStatus;
    }

    public QueryTradeResponse setCurrencyValue(String currencyValue) {
        this.currencyValue = currencyValue;
        return this;
    }
    public String getCurrencyValue() {
        return this.currencyValue;
    }

    public QueryTradeResponse setTradeSettleInfo(java.util.List<TradeSettleDetail> tradeSettleInfo) {
        this.tradeSettleInfo = tradeSettleInfo;
        return this;
    }
    public java.util.List<TradeSettleDetail> getTradeSettleInfo() {
        return this.tradeSettleInfo;
    }

}
