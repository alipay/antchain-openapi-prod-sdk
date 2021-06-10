// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.industry.models;

import com.aliyun.tea.*;

public class CreateTradeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 来源场景码, 由中台分配给业务方
    @NameInMap("source")
    @Validation(required = true)
    public String source;

    // 渠道 自营平台、第三方平台等
    @NameInMap("channel")
    @Validation(required = true)
    public String channel;

    // 支付成功后returl地址
    @NameInMap("return_url")
    public String returnUrl;

    // 外部单据号。32 个字符以内的大小，仅支持字母、数字。需保证该参数在业务侧不重复。
    @NameInMap("merchant_order_no")
    @Validation(required = true)
    public String merchantOrderNo;

    // 收单金额，"10.11"代表10.11元,最小粒度到分,小数点后2位，不支持高精度和负数
    @NameInMap("total_amount")
    @Validation(required = true)
    public String totalAmount;

    // 交易标题等。注意：不可使用特殊字符，如 /，=，& 等。不超过256
    @NameInMap("subject")
    @Validation(required = true)
    public String subject;

    // 支付渠道产品码； 目前只支持直付通，code= ZFT;
    @NameInMap("pay_product_code")
    public String payProductCode;

    // 交易币种，默认：人民币（156）
    @NameInMap("trans_currency")
    public String transCurrency;

    // 平台方下的商家id
    @NameInMap("merchant_user_id")
    @Validation(required = true)
    public String merchantUserId;

    // 买家的支付宝唯一用户号（2088开头的16位纯数字）。
    // 小程序支付场景必填。
    @NameInMap("buyer_id")
    public String buyerId;

    // 对一笔交易的具体描述信息。如果是多种商品，请将商品描述字符串累加传给body。
    @NameInMap("body")
    public String body;

    public static CreateTradeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTradeRequest self = new CreateTradeRequest();
        return TeaModel.build(map, self);
    }

    public CreateTradeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateTradeRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public CreateTradeRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public CreateTradeRequest setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
        return this;
    }
    public String getReturnUrl() {
        return this.returnUrl;
    }

    public CreateTradeRequest setMerchantOrderNo(String merchantOrderNo) {
        this.merchantOrderNo = merchantOrderNo;
        return this;
    }
    public String getMerchantOrderNo() {
        return this.merchantOrderNo;
    }

    public CreateTradeRequest setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }
    public String getTotalAmount() {
        return this.totalAmount;
    }

    public CreateTradeRequest setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public String getSubject() {
        return this.subject;
    }

    public CreateTradeRequest setPayProductCode(String payProductCode) {
        this.payProductCode = payProductCode;
        return this;
    }
    public String getPayProductCode() {
        return this.payProductCode;
    }

    public CreateTradeRequest setTransCurrency(String transCurrency) {
        this.transCurrency = transCurrency;
        return this;
    }
    public String getTransCurrency() {
        return this.transCurrency;
    }

    public CreateTradeRequest setMerchantUserId(String merchantUserId) {
        this.merchantUserId = merchantUserId;
        return this;
    }
    public String getMerchantUserId() {
        return this.merchantUserId;
    }

    public CreateTradeRequest setBuyerId(String buyerId) {
        this.buyerId = buyerId;
        return this;
    }
    public String getBuyerId() {
        return this.buyerId;
    }

    public CreateTradeRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
