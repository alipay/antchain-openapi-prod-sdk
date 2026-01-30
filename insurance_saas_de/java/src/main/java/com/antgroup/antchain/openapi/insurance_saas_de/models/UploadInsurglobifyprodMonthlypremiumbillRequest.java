// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurance_saas_de.models;

import com.aliyun.tea.*;

public class UploadInsurglobifyprodMonthlypremiumbillRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 调用方生成的唯一编码，系统会根据该流水号做防重、幂等判断逻辑。当极端场景中，系统会返回处理中，错误码为2222，客户端应该保持该流水号不变，并使用原来的请求再次发送请求，系统会根据幂等逻辑返回处理结果；
    @NameInMap("trade_no")
    @Validation(required = true, maxLength = 50)
    public String tradeNo;

    // 保司编码
    @NameInMap("external_channel_code")
    @Validation(required = true, maxLength = 10)
    public String externalChannelCode;

    // 险种编码
    @NameInMap("external_product_code")
    @Validation(required = true, maxLength = 10)
    public String externalProductCode;

    // 保险方案名
    @NameInMap("ch_scheme_name")
    @Validation(required = true, maxLength = 20)
    public String chSchemeName;

    // 关联的大保单号
    @NameInMap("big_pol_no")
    @Validation(required = true, maxLength = 200)
    public String bigPolNo;

    // 账单年度
    @NameInMap("billing_year")
    @Validation(required = true, maxLength = 4)
    public String billingYear;

    // 账单月份
    @NameInMap("billing_month")
    @Validation(required = true, maxLength = 2)
    public String billingMonth;

    // 包裹总数
    @NameInMap("package_count")
    @Validation(required = true, maxLength = 256)
    public String packageCount;

    // 净保费，小数位只支持2位
    @NameInMap("premium")
    @Validation(required = true, maxLength = 20)
    public String premium;

    // 税费，小数位只支持2位
    @NameInMap("taxa_amount")
    @Validation(required = true, maxLength = 20)
    public String taxaAmount;

    // 总保费（含税费），小数位只支持2位
    @NameInMap("total_premium")
    @Validation(required = true, maxLength = 20)
    public String totalPremium;

    // 币种，使用ISO 4217代码；
    // CNY：人民币
    // USD：美元
    // EUR：欧元
    // GBP：英镑
    // JPY：日元
    // CHF：瑞士法郎
    // SGD：新加坡元
    @NameInMap("currency")
    @Validation(required = true, maxLength = 3)
    public String currency;

    public static UploadInsurglobifyprodMonthlypremiumbillRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadInsurglobifyprodMonthlypremiumbillRequest self = new UploadInsurglobifyprodMonthlypremiumbillRequest();
        return TeaModel.build(map, self);
    }

    public UploadInsurglobifyprodMonthlypremiumbillRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UploadInsurglobifyprodMonthlypremiumbillRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UploadInsurglobifyprodMonthlypremiumbillRequest setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

    public UploadInsurglobifyprodMonthlypremiumbillRequest setExternalChannelCode(String externalChannelCode) {
        this.externalChannelCode = externalChannelCode;
        return this;
    }
    public String getExternalChannelCode() {
        return this.externalChannelCode;
    }

    public UploadInsurglobifyprodMonthlypremiumbillRequest setExternalProductCode(String externalProductCode) {
        this.externalProductCode = externalProductCode;
        return this;
    }
    public String getExternalProductCode() {
        return this.externalProductCode;
    }

    public UploadInsurglobifyprodMonthlypremiumbillRequest setChSchemeName(String chSchemeName) {
        this.chSchemeName = chSchemeName;
        return this;
    }
    public String getChSchemeName() {
        return this.chSchemeName;
    }

    public UploadInsurglobifyprodMonthlypremiumbillRequest setBigPolNo(String bigPolNo) {
        this.bigPolNo = bigPolNo;
        return this;
    }
    public String getBigPolNo() {
        return this.bigPolNo;
    }

    public UploadInsurglobifyprodMonthlypremiumbillRequest setBillingYear(String billingYear) {
        this.billingYear = billingYear;
        return this;
    }
    public String getBillingYear() {
        return this.billingYear;
    }

    public UploadInsurglobifyprodMonthlypremiumbillRequest setBillingMonth(String billingMonth) {
        this.billingMonth = billingMonth;
        return this;
    }
    public String getBillingMonth() {
        return this.billingMonth;
    }

    public UploadInsurglobifyprodMonthlypremiumbillRequest setPackageCount(String packageCount) {
        this.packageCount = packageCount;
        return this;
    }
    public String getPackageCount() {
        return this.packageCount;
    }

    public UploadInsurglobifyprodMonthlypremiumbillRequest setPremium(String premium) {
        this.premium = premium;
        return this;
    }
    public String getPremium() {
        return this.premium;
    }

    public UploadInsurglobifyprodMonthlypremiumbillRequest setTaxaAmount(String taxaAmount) {
        this.taxaAmount = taxaAmount;
        return this;
    }
    public String getTaxaAmount() {
        return this.taxaAmount;
    }

    public UploadInsurglobifyprodMonthlypremiumbillRequest setTotalPremium(String totalPremium) {
        this.totalPremium = totalPremium;
        return this;
    }
    public String getTotalPremium() {
        return this.totalPremium;
    }

    public UploadInsurglobifyprodMonthlypremiumbillRequest setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

}
