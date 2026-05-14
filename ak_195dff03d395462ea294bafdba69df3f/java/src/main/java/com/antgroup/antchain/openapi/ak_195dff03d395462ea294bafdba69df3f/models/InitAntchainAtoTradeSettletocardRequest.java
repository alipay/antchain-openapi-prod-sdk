// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class InitAntchainAtoTradeSettletocardRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 统一社会信用代码
    @NameInMap("merchant_id")
    @Validation(required = true)
    public String merchantId;

    // 支付渠道: ALIPAY-支付宝支付 JDPAY-京东支付
    @NameInMap("pay_channel")
    @Validation(required = true)
    public String payChannel;

    // 京东二级商户号,当pay_channel=JDPAY时，该字段必填
    @NameInMap("sub_merchant_id")
    public String subMerchantId;

    // 账单开始日期, 格式：YYYY-MM-DD
    @NameInMap("gmt_plan")
    @Validation(required = true)
    public String gmtPlan;

    // 账单结束日期；格式：YYYY-MM-DD
    @NameInMap("gmt_finish")
    @Validation(required = true)
    public String gmtFinish;

    // 交易流水:TRADE,结算流水:SETTLE
    @NameInMap("bill_type")
    @Validation(required = true)
    public String billType;

    public static InitAntchainAtoTradeSettletocardRequest build(java.util.Map<String, ?> map) throws Exception {
        InitAntchainAtoTradeSettletocardRequest self = new InitAntchainAtoTradeSettletocardRequest();
        return TeaModel.build(map, self);
    }

    public InitAntchainAtoTradeSettletocardRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InitAntchainAtoTradeSettletocardRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public InitAntchainAtoTradeSettletocardRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public InitAntchainAtoTradeSettletocardRequest setPayChannel(String payChannel) {
        this.payChannel = payChannel;
        return this;
    }
    public String getPayChannel() {
        return this.payChannel;
    }

    public InitAntchainAtoTradeSettletocardRequest setSubMerchantId(String subMerchantId) {
        this.subMerchantId = subMerchantId;
        return this;
    }
    public String getSubMerchantId() {
        return this.subMerchantId;
    }

    public InitAntchainAtoTradeSettletocardRequest setGmtPlan(String gmtPlan) {
        this.gmtPlan = gmtPlan;
        return this;
    }
    public String getGmtPlan() {
        return this.gmtPlan;
    }

    public InitAntchainAtoTradeSettletocardRequest setGmtFinish(String gmtFinish) {
        this.gmtFinish = gmtFinish;
        return this;
    }
    public String getGmtFinish() {
        return this.gmtFinish;
    }

    public InitAntchainAtoTradeSettletocardRequest setBillType(String billType) {
        this.billType = billType;
        return this;
    }
    public String getBillType() {
        return this.billType;
    }

}
