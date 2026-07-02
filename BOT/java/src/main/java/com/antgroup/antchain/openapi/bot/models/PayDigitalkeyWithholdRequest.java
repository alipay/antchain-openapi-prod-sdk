// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class PayDigitalkeyWithholdRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商户订单号，需要保证不重复
    @NameInMap("out_trade_no")
    @Validation(required = true)
    public String outTradeNo;

    // 订单标题
    @NameInMap("subject")
    @Validation(required = true)
    public String subject;

    // 签约时支付宝返回的用户ID
    @NameInMap("alipay_user_id")
    public String alipayUserId;

    // 销售产品码，商户代扣场景为GENERAL_WITHHOLDING；预授权支付场景为PRE_AUTH_ONLINE
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 订单总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
    @NameInMap("total_amount")
    @Validation(required = true)
    public Long totalAmount;

    // 商户代扣扣款许可
    @NameInMap("deduct_permission")
    public String deductPermission;

    // 代扣协议号, 对应于签约时外部商户传入的协议号
    @NameInMap("external_agreement_no")
    public String externalAgreementNo;

    // 该笔订单允许的最晚付款时间，逾期将关闭交易，超时关闭交易无法继续付款。取值范围：1m～15d。m-分钟，h-小时，d-天，1c-当天 该参数数值不接受小数点， 如：1.5 h，可转换为 90m。
    @NameInMap("timeout_express")
    public String timeoutExpress;

    // 异步支付类型
    @NameInMap("async_type")
    @Validation(required = true)
    public String asyncType;

    // 可打折金额。 参与优惠计算的金额，单位为元，精确到小数点后两位，取值范围：[1,10000000000]
    // 传值为实际金额的100倍，例如传值为8000，实际金额为80.00 
    // 如果订单金额全部参与优惠计算，则【可打折金额】无需传入。
    @NameInMap("discountable_amount")
    public Long discountableAmount;

    // 二级商户信息
    @NameInMap("sub_merchant")
    public SubMerchantParams subMerchant;

    // 订单附加信息。 如果请求时传递了该参数，将在异步通知、对账单中原样返回，同时会在商户和用户的pc账单详情中作为交易描述展示
    @NameInMap("body")
    public String body;

    // 资金授权冻结时的商户授权资金订单号
    // 支付宝预授权场景下必填。
    @NameInMap("out_auth_no")
    public String outAuthNo;

    public static PayDigitalkeyWithholdRequest build(java.util.Map<String, ?> map) throws Exception {
        PayDigitalkeyWithholdRequest self = new PayDigitalkeyWithholdRequest();
        return TeaModel.build(map, self);
    }

    public PayDigitalkeyWithholdRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PayDigitalkeyWithholdRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PayDigitalkeyWithholdRequest setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
        return this;
    }
    public String getOutTradeNo() {
        return this.outTradeNo;
    }

    public PayDigitalkeyWithholdRequest setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public String getSubject() {
        return this.subject;
    }

    public PayDigitalkeyWithholdRequest setAlipayUserId(String alipayUserId) {
        this.alipayUserId = alipayUserId;
        return this;
    }
    public String getAlipayUserId() {
        return this.alipayUserId;
    }

    public PayDigitalkeyWithholdRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public PayDigitalkeyWithholdRequest setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }
    public Long getTotalAmount() {
        return this.totalAmount;
    }

    public PayDigitalkeyWithholdRequest setDeductPermission(String deductPermission) {
        this.deductPermission = deductPermission;
        return this;
    }
    public String getDeductPermission() {
        return this.deductPermission;
    }

    public PayDigitalkeyWithholdRequest setExternalAgreementNo(String externalAgreementNo) {
        this.externalAgreementNo = externalAgreementNo;
        return this;
    }
    public String getExternalAgreementNo() {
        return this.externalAgreementNo;
    }

    public PayDigitalkeyWithholdRequest setTimeoutExpress(String timeoutExpress) {
        this.timeoutExpress = timeoutExpress;
        return this;
    }
    public String getTimeoutExpress() {
        return this.timeoutExpress;
    }

    public PayDigitalkeyWithholdRequest setAsyncType(String asyncType) {
        this.asyncType = asyncType;
        return this;
    }
    public String getAsyncType() {
        return this.asyncType;
    }

    public PayDigitalkeyWithholdRequest setDiscountableAmount(Long discountableAmount) {
        this.discountableAmount = discountableAmount;
        return this;
    }
    public Long getDiscountableAmount() {
        return this.discountableAmount;
    }

    public PayDigitalkeyWithholdRequest setSubMerchant(SubMerchantParams subMerchant) {
        this.subMerchant = subMerchant;
        return this;
    }
    public SubMerchantParams getSubMerchant() {
        return this.subMerchant;
    }

    public PayDigitalkeyWithholdRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public PayDigitalkeyWithholdRequest setOutAuthNo(String outAuthNo) {
        this.outAuthNo = outAuthNo;
        return this;
    }
    public String getOutAuthNo() {
        return this.outAuthNo;
    }

}
