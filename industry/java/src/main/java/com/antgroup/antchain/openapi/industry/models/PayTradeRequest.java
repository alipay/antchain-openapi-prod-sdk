// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.industry.models;

import com.aliyun.tea.*;

public class PayTradeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 外部单据号。32 个字符以内的大小，仅支持字母、数字。需保证该参数在业务侧不重复。
    @NameInMap("merchant_order_no")
    @Validation(required = true)
    public String merchantOrderNo;

    // 来源场景码, 由中台分配给业务方
    @NameInMap("source")
    @Validation(required = true)
    public String source;

    // 渠道
    @NameInMap("channel")
    @Validation(required = true)
    public String channel;

    // 收单金额，"10.11"代表10.11元,最小粒度到分,小数点后2位，不支持高精度和负数
    @NameInMap("total_amount")
    @Validation(required = true)
    public String totalAmount;

    // 交易币种，默认：人民币（156）
    @NameInMap("currency_value")
    public String currencyValue;

    // 交易标题等。注意：不可使用特殊字符，如 /，=，& 等。不超过256
    @NameInMap("subject")
    public String subject;

    // 交易信息
    @NameInMap("body")
    public String body;

    // 收款方id
    @NameInMap("payee_id")
    @Validation(required = true)
    public String payeeId;

    // 付款方id
    @NameInMap("payer_id")
    @Validation(required = true)
    public String payerId;

    // ZFT
    @NameInMap("pay_product_code")
    @Validation(required = true)
    public String payProductCode;

    // 交易创建时间
    @NameInMap("gmt_trade_create")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtTradeCreate;

    // 交易支付时间
    @NameInMap("gmt_trade_pay")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtTradePay;

    // 交易完成时间
    @NameInMap("gmt_trade_complete")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtTradeComplete;

    // 交易状态
    @NameInMap("trade_status")
    public String tradeStatus;

    // 扩展字段，json串
    @NameInMap("properties")
    public String properties;

    public static PayTradeRequest build(java.util.Map<String, ?> map) throws Exception {
        PayTradeRequest self = new PayTradeRequest();
        return TeaModel.build(map, self);
    }

    public PayTradeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PayTradeRequest setMerchantOrderNo(String merchantOrderNo) {
        this.merchantOrderNo = merchantOrderNo;
        return this;
    }
    public String getMerchantOrderNo() {
        return this.merchantOrderNo;
    }

    public PayTradeRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public PayTradeRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public PayTradeRequest setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }
    public String getTotalAmount() {
        return this.totalAmount;
    }

    public PayTradeRequest setCurrencyValue(String currencyValue) {
        this.currencyValue = currencyValue;
        return this;
    }
    public String getCurrencyValue() {
        return this.currencyValue;
    }

    public PayTradeRequest setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public String getSubject() {
        return this.subject;
    }

    public PayTradeRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public PayTradeRequest setPayeeId(String payeeId) {
        this.payeeId = payeeId;
        return this;
    }
    public String getPayeeId() {
        return this.payeeId;
    }

    public PayTradeRequest setPayerId(String payerId) {
        this.payerId = payerId;
        return this;
    }
    public String getPayerId() {
        return this.payerId;
    }

    public PayTradeRequest setPayProductCode(String payProductCode) {
        this.payProductCode = payProductCode;
        return this;
    }
    public String getPayProductCode() {
        return this.payProductCode;
    }

    public PayTradeRequest setGmtTradeCreate(String gmtTradeCreate) {
        this.gmtTradeCreate = gmtTradeCreate;
        return this;
    }
    public String getGmtTradeCreate() {
        return this.gmtTradeCreate;
    }

    public PayTradeRequest setGmtTradePay(String gmtTradePay) {
        this.gmtTradePay = gmtTradePay;
        return this;
    }
    public String getGmtTradePay() {
        return this.gmtTradePay;
    }

    public PayTradeRequest setGmtTradeComplete(String gmtTradeComplete) {
        this.gmtTradeComplete = gmtTradeComplete;
        return this;
    }
    public String getGmtTradeComplete() {
        return this.gmtTradeComplete;
    }

    public PayTradeRequest setTradeStatus(String tradeStatus) {
        this.tradeStatus = tradeStatus;
        return this;
    }
    public String getTradeStatus() {
        return this.tradeStatus;
    }

    public PayTradeRequest setProperties(String properties) {
        this.properties = properties;
        return this;
    }
    public String getProperties() {
        return this.properties;
    }

}
