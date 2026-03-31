// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurance_saas.models;

import com.aliyun.tea.*;

public class IssueEmbedcardPaysucRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 险种编码
    @NameInMap("insurance_type_code")
    @Validation(required = true, maxLength = 32)
    public String insuranceTypeCode;

    // 保司编码
    @NameInMap("insurance_company_no")
    @Validation(required = true, maxLength = 32)
    public String insuranceCompanyNo;

    // 嵌入式产品编码
    @NameInMap("embed_product_code")
    @Validation(required = true, maxLength = 32)
    public String embedProductCode;

    // 交易流水号
    @NameInMap("trade_no")
    @Validation(required = true, maxLength = 128)
    public String tradeNo;

    // 方案名称
    @NameInMap("scheme_name")
    @Validation(required = true, maxLength = 32)
    public String schemeName;

    // 保费，保留2位小数
    @NameInMap("premium")
    @Validation(required = true)
    public String premium;

    // 保费支付渠道，01-支付宝、02-微信支付、03-银行卡支付、04-平台账户余额支付
    @NameInMap("premium_payment_channel")
    @Validation(required = true, maxLength = 32)
    public String premiumPaymentChannel;

    // 保费支付流水号
    @NameInMap("premium_payment_no")
    @Validation(required = true, maxLength = 128)
    public String premiumPaymentNo;

    // 保费支付金额，保留2位小数
    @NameInMap("premium_payment_amount")
    @Validation(required = true)
    public String premiumPaymentAmount;

    // 保费支付时间
    @NameInMap("premium_payment_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String premiumPaymentTime;

    // 询价编码
    @NameInMap("inquiry_no")
    @Validation(required = true, maxLength = 32)
    public String inquiryNo;

    public static IssueEmbedcardPaysucRequest build(java.util.Map<String, ?> map) throws Exception {
        IssueEmbedcardPaysucRequest self = new IssueEmbedcardPaysucRequest();
        return TeaModel.build(map, self);
    }

    public IssueEmbedcardPaysucRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public IssueEmbedcardPaysucRequest setInsuranceTypeCode(String insuranceTypeCode) {
        this.insuranceTypeCode = insuranceTypeCode;
        return this;
    }
    public String getInsuranceTypeCode() {
        return this.insuranceTypeCode;
    }

    public IssueEmbedcardPaysucRequest setInsuranceCompanyNo(String insuranceCompanyNo) {
        this.insuranceCompanyNo = insuranceCompanyNo;
        return this;
    }
    public String getInsuranceCompanyNo() {
        return this.insuranceCompanyNo;
    }

    public IssueEmbedcardPaysucRequest setEmbedProductCode(String embedProductCode) {
        this.embedProductCode = embedProductCode;
        return this;
    }
    public String getEmbedProductCode() {
        return this.embedProductCode;
    }

    public IssueEmbedcardPaysucRequest setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

    public IssueEmbedcardPaysucRequest setSchemeName(String schemeName) {
        this.schemeName = schemeName;
        return this;
    }
    public String getSchemeName() {
        return this.schemeName;
    }

    public IssueEmbedcardPaysucRequest setPremium(String premium) {
        this.premium = premium;
        return this;
    }
    public String getPremium() {
        return this.premium;
    }

    public IssueEmbedcardPaysucRequest setPremiumPaymentChannel(String premiumPaymentChannel) {
        this.premiumPaymentChannel = premiumPaymentChannel;
        return this;
    }
    public String getPremiumPaymentChannel() {
        return this.premiumPaymentChannel;
    }

    public IssueEmbedcardPaysucRequest setPremiumPaymentNo(String premiumPaymentNo) {
        this.premiumPaymentNo = premiumPaymentNo;
        return this;
    }
    public String getPremiumPaymentNo() {
        return this.premiumPaymentNo;
    }

    public IssueEmbedcardPaysucRequest setPremiumPaymentAmount(String premiumPaymentAmount) {
        this.premiumPaymentAmount = premiumPaymentAmount;
        return this;
    }
    public String getPremiumPaymentAmount() {
        return this.premiumPaymentAmount;
    }

    public IssueEmbedcardPaysucRequest setPremiumPaymentTime(String premiumPaymentTime) {
        this.premiumPaymentTime = premiumPaymentTime;
        return this;
    }
    public String getPremiumPaymentTime() {
        return this.premiumPaymentTime;
    }

    public IssueEmbedcardPaysucRequest setInquiryNo(String inquiryNo) {
        this.inquiryNo = inquiryNo;
        return this;
    }
    public String getInquiryNo() {
        return this.inquiryNo;
    }

}
