// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.billing.models;

import com.aliyun.tea.*;

public class ChargeAccountBalanceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // "10.11"代表10.11元,最小粒度到分，小数点后2位
    @NameInMap("charge_amt")
    @Validation(required = true)
    public String chargeAmt;

    // 币种,支付宝体系内一般存储币种值（156/840/...），156代表人民币
    @NameInMap("currency_value")
    @Validation(required = true)
    public String currencyValue;

    // 渠道来源： ANTCLOUD_OFFICIAL 官网 ANT_OPEN_SERVICE_MARKET 开放平-服务市场台
    @NameInMap("from_channel")
    @Validation(required = true)
    public String fromChannel;

    // 唤起收银台后，充值后回调url链接
    @NameInMap("return_url")
    @Validation(required = true)
    public String returnUrl;

    public static ChargeAccountBalanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ChargeAccountBalanceRequest self = new ChargeAccountBalanceRequest();
        return TeaModel.build(map, self);
    }

    public ChargeAccountBalanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ChargeAccountBalanceRequest setChargeAmt(String chargeAmt) {
        this.chargeAmt = chargeAmt;
        return this;
    }
    public String getChargeAmt() {
        return this.chargeAmt;
    }

    public ChargeAccountBalanceRequest setCurrencyValue(String currencyValue) {
        this.currencyValue = currencyValue;
        return this;
    }
    public String getCurrencyValue() {
        return this.currencyValue;
    }

    public ChargeAccountBalanceRequest setFromChannel(String fromChannel) {
        this.fromChannel = fromChannel;
        return this;
    }
    public String getFromChannel() {
        return this.fromChannel;
    }

    public ChargeAccountBalanceRequest setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
        return this;
    }
    public String getReturnUrl() {
        return this.returnUrl;
    }

}
