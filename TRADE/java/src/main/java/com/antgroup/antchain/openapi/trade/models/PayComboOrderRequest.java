// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trade.models;

import com.aliyun.tea.*;

public class PayComboOrderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 套餐订单号
    @NameInMap("combo_order_id")
    @Validation(required = true)
    public String comboOrderId;

    // 支付渠道，客资：FINANCIAL_FUND；财资：CUSTOMER_FUND；支付通：ALIPAY
    @NameInMap("pay_channel")
    @Validation(required = true)
    public String payChannel;

    // 支付模式，PAGE：页面确认支付；AUTO：系统自动扣款
    // 支付通模式只支持PAGE
    @NameInMap("pay_mode")
    @Validation(required = true)
    public String payMode;

    // 支付回跳地址，当pay_mode=PAGE时，必传
    @NameInMap("pay_return_url")
    public String payReturnUrl;

    public static PayComboOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        PayComboOrderRequest self = new PayComboOrderRequest();
        return TeaModel.build(map, self);
    }

    public PayComboOrderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PayComboOrderRequest setComboOrderId(String comboOrderId) {
        this.comboOrderId = comboOrderId;
        return this;
    }
    public String getComboOrderId() {
        return this.comboOrderId;
    }

    public PayComboOrderRequest setPayChannel(String payChannel) {
        this.payChannel = payChannel;
        return this;
    }
    public String getPayChannel() {
        return this.payChannel;
    }

    public PayComboOrderRequest setPayMode(String payMode) {
        this.payMode = payMode;
        return this;
    }
    public String getPayMode() {
        return this.payMode;
    }

    public PayComboOrderRequest setPayReturnUrl(String payReturnUrl) {
        this.payReturnUrl = payReturnUrl;
        return this;
    }
    public String getPayReturnUrl() {
        return this.payReturnUrl;
    }

}
