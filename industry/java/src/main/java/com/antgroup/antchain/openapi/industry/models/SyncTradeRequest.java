// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.industry.models;

import com.aliyun.tea.*;

public class SyncTradeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 商户订单号
    @NameInMap("merchant_order_no")
    @Validation(required = true)
    public String merchantOrderNo;

    // 行业场景码(由经支中台分配给业务方)
    @NameInMap("source")
    @Validation(required = true)
    public String source;

    // 行业渠道码(由经支中台分配给业务方)
    @NameInMap("channel")
    @Validation(required = true)
    public String channel;

    // 交易金额, 最小到分, 支持0元
    @NameInMap("total_amount")
    @Validation(required = true)
    public String totalAmount;

    // 币种，默认156-人民币
    @NameInMap("currency_value")
    public String currencyValue;

    // 交易标题
    @NameInMap("subject")
    public String subject;

    // 交易详情(例如商品、价格快照、数量等)
    @NameInMap("body")
    public String body;

    // 支付渠道, 当前仅支持ZFT-直付通
    @NameInMap("pay_product_code")
    @Validation(required = true)
    public String payProductCode;

    // 交易收款方支付宝uid
    @NameInMap("payee_id")
    @Validation(required = true)
    public String payeeId;

    // 交易付款方支付宝uid
    @NameInMap("payer_id")
    @Validation(required = true)
    public String payerId;

    // 交易创建时间
    @NameInMap("gmt_trade_create")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtTradeCreate;

    // 交易支付时间
    @NameInMap("gmt_trade_pay")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtTradePay;

    // 交易完成时间
    @NameInMap("gmt_trade_complete")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtTradeComplete;

    // 交易状态
    @NameInMap("trade_status")
    @Validation(required = true)
    public String tradeStatus;

    // 扩展字段，json串
    @NameInMap("properties")
    @Validation(required = true)
    public String properties;

    public static SyncTradeRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncTradeRequest self = new SyncTradeRequest();
        return TeaModel.build(map, self);
    }

    public SyncTradeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncTradeRequest setMerchantOrderNo(String merchantOrderNo) {
        this.merchantOrderNo = merchantOrderNo;
        return this;
    }
    public String getMerchantOrderNo() {
        return this.merchantOrderNo;
    }

    public SyncTradeRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public SyncTradeRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public SyncTradeRequest setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }
    public String getTotalAmount() {
        return this.totalAmount;
    }

    public SyncTradeRequest setCurrencyValue(String currencyValue) {
        this.currencyValue = currencyValue;
        return this;
    }
    public String getCurrencyValue() {
        return this.currencyValue;
    }

    public SyncTradeRequest setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public String getSubject() {
        return this.subject;
    }

    public SyncTradeRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public SyncTradeRequest setPayProductCode(String payProductCode) {
        this.payProductCode = payProductCode;
        return this;
    }
    public String getPayProductCode() {
        return this.payProductCode;
    }

    public SyncTradeRequest setPayeeId(String payeeId) {
        this.payeeId = payeeId;
        return this;
    }
    public String getPayeeId() {
        return this.payeeId;
    }

    public SyncTradeRequest setPayerId(String payerId) {
        this.payerId = payerId;
        return this;
    }
    public String getPayerId() {
        return this.payerId;
    }

    public SyncTradeRequest setGmtTradeCreate(String gmtTradeCreate) {
        this.gmtTradeCreate = gmtTradeCreate;
        return this;
    }
    public String getGmtTradeCreate() {
        return this.gmtTradeCreate;
    }

    public SyncTradeRequest setGmtTradePay(String gmtTradePay) {
        this.gmtTradePay = gmtTradePay;
        return this;
    }
    public String getGmtTradePay() {
        return this.gmtTradePay;
    }

    public SyncTradeRequest setGmtTradeComplete(String gmtTradeComplete) {
        this.gmtTradeComplete = gmtTradeComplete;
        return this;
    }
    public String getGmtTradeComplete() {
        return this.gmtTradeComplete;
    }

    public SyncTradeRequest setTradeStatus(String tradeStatus) {
        this.tradeStatus = tradeStatus;
        return this;
    }
    public String getTradeStatus() {
        return this.tradeStatus;
    }

    public SyncTradeRequest setProperties(String properties) {
        this.properties = properties;
        return this;
    }
    public String getProperties() {
        return this.properties;
    }

}
