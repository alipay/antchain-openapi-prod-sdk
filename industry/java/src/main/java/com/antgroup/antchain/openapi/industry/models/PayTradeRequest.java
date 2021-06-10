// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.industry.models;

import com.aliyun.tea.*;

public class PayTradeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 来源场景码, 由中台分配给业务方
    @NameInMap("source")
    @Validation(required = true)
    public String source;

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

    // 平台方下的商家id
    @NameInMap("merchant_user_id")
    @Validation(required = true)
    public String merchantUserId;

    // 交易币种，默认：人民币（156）
    @NameInMap("trans_currency")
    public String transCurrency;

    // 买家支付宝uid
    @NameInMap("buyer_id")
    @Validation(required = true)
    public String buyerId;

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

    public PayTradeRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public PayTradeRequest setMerchantOrderNo(String merchantOrderNo) {
        this.merchantOrderNo = merchantOrderNo;
        return this;
    }
    public String getMerchantOrderNo() {
        return this.merchantOrderNo;
    }

    public PayTradeRequest setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }
    public String getTotalAmount() {
        return this.totalAmount;
    }

    public PayTradeRequest setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public String getSubject() {
        return this.subject;
    }

    public PayTradeRequest setMerchantUserId(String merchantUserId) {
        this.merchantUserId = merchantUserId;
        return this;
    }
    public String getMerchantUserId() {
        return this.merchantUserId;
    }

    public PayTradeRequest setTransCurrency(String transCurrency) {
        this.transCurrency = transCurrency;
        return this;
    }
    public String getTransCurrency() {
        return this.transCurrency;
    }

    public PayTradeRequest setBuyerId(String buyerId) {
        this.buyerId = buyerId;
        return this;
    }
    public String getBuyerId() {
        return this.buyerId;
    }

}
