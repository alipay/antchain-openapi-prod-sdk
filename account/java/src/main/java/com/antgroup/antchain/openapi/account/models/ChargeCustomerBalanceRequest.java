// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.account.models;

import com.aliyun.tea.*;

public class ChargeCustomerBalanceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 充值金额，单位分
    @NameInMap("recharge_amt")
    @Validation(required = true)
    public String rechargeAmt;

    // 币种
    @NameInMap("currency_value")
    @Validation(required = true)
    public String currencyValue;

    // 用户充值后跳转的地址链接，若不填，则默认跳到中台费用中心页面
    @NameInMap("return_url")
    public String returnUrl;

    // 调用系统appName
    @NameInMap("source")
    @Validation(required = true)
    public String source;

    // 充值渠道，默认传"01"
    @NameInMap("recharge_channel")
    @Validation(required = true)
    public String rechargeChannel;

    // 外部单据号，用于幂等
    @NameInMap("out_biz_no")
    @Validation(required = true)
    public String outBizNo;

    public static ChargeCustomerBalanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ChargeCustomerBalanceRequest self = new ChargeCustomerBalanceRequest();
        return TeaModel.build(map, self);
    }

    public ChargeCustomerBalanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ChargeCustomerBalanceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ChargeCustomerBalanceRequest setRechargeAmt(String rechargeAmt) {
        this.rechargeAmt = rechargeAmt;
        return this;
    }
    public String getRechargeAmt() {
        return this.rechargeAmt;
    }

    public ChargeCustomerBalanceRequest setCurrencyValue(String currencyValue) {
        this.currencyValue = currencyValue;
        return this;
    }
    public String getCurrencyValue() {
        return this.currencyValue;
    }

    public ChargeCustomerBalanceRequest setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
        return this;
    }
    public String getReturnUrl() {
        return this.returnUrl;
    }

    public ChargeCustomerBalanceRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public ChargeCustomerBalanceRequest setRechargeChannel(String rechargeChannel) {
        this.rechargeChannel = rechargeChannel;
        return this;
    }
    public String getRechargeChannel() {
        return this.rechargeChannel;
    }

    public ChargeCustomerBalanceRequest setOutBizNo(String outBizNo) {
        this.outBizNo = outBizNo;
        return this;
    }
    public String getOutBizNo() {
        return this.outBizNo;
    }

}
