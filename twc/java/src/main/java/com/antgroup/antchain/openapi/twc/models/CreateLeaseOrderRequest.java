// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateLeaseOrderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 账号标识，可弃用
    @NameInMap("account_id")
    public String accountId;

    // 支付宝交易金额
    @NameInMap("alipay_order_amount")
    @Validation(required = true)
    public Long alipayOrderAmount;

    // 支付宝订单号
    @NameInMap("alipay_order_no")
    @Validation(required = true)
    public String alipayOrderNo;

    // 支付宝交易总金额
    @NameInMap("alipay_order_total_amount")
    @Validation(required = true)
    public Long alipayOrderTotalAmount;

    // 免押金额
    @NameInMap("deposit_waive_amount")
    @Validation(required = true)
    public Long depositWaiveAmount;

    // 订单总保额，单位分，insured为True时必填
    @NameInMap("insurance_coverage")
    public Long insuranceCoverage;

    // 保单号，insured为True时必填，仅支持数字和字母
    @NameInMap("insurance_order_no")
    public String insuranceOrderNo;

    // 商品名称
    @NameInMap("item_name")
    @Validation(required = true)
    public String itemName;

    // 商品市场价格
    @NameInMap("item_price")
    @Validation(required = true)
    public Long itemPrice;

    // 商品类目
    @NameInMap("item_type")
    @Validation(required = true)
    public String itemType;

    // 商户支付宝账号
    @NameInMap("merchant_alipay_account")
    @Validation(required = true)
    public String merchantAlipayAccount;

    // 商户支付宝ID
    @NameInMap("merchant_alipay_id")
    @Validation(required = true)
    public String merchantAlipayId;

    // 商户名称
    @NameInMap("merchant_name")
    @Validation(required = true)
    public String merchantName;

    // 商户单号
    @NameInMap("merchant_order_no")
    public String merchantOrderNo;

    // 支付渠道，包括支付宝（Alipay）、第三方收单机构（ThirdParty）、信用卡（CreditCard）、银行转账（BankTransfer）、微信（WeChatPay）、其他（Other）
    @NameInMap("payment_channel")
    public String paymentChannel;

    // 租约结束日期
    @NameInMap("tenancy_term_end")
    @Validation(required = true)
    public Long tenancyTermEnd;

    // 租约起始日期
    @NameInMap("tenancy_term_start")
    @Validation(required = true)
    public Long tenancyTermStart;

    // 是否投保，默认为True
    @NameInMap("insured")
    public Boolean insured;

    // 保单查询地址，insured为True时必填
    @NameInMap("insurance_order_url")
    public String insuranceOrderUrl;

    // 保险缴费单号，insured为True时必填，仅支持数字和字母，长度20
    @NameInMap("insurance_bill_no")
    public String insuranceBillNo;

    // 保险缴费北京时间，格式为"YYYYMMDDHHMISS"，时区为UTC+8
    @NameInMap("insurance_bill_time")
    public String insuranceBillTime;

    // 保险缴费金额，单位分
    @NameInMap("insurance_bill_amount")
    public Long insuranceBillAmount;

    // 订单产品保额，单位分，insured为True时必填
    @NameInMap("insurance_product_coverage")
    public Long insuranceProductCoverage;

    public static CreateLeaseOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLeaseOrderRequest self = new CreateLeaseOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreateLeaseOrderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateLeaseOrderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateLeaseOrderRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public CreateLeaseOrderRequest setAlipayOrderAmount(Long alipayOrderAmount) {
        this.alipayOrderAmount = alipayOrderAmount;
        return this;
    }
    public Long getAlipayOrderAmount() {
        return this.alipayOrderAmount;
    }

    public CreateLeaseOrderRequest setAlipayOrderNo(String alipayOrderNo) {
        this.alipayOrderNo = alipayOrderNo;
        return this;
    }
    public String getAlipayOrderNo() {
        return this.alipayOrderNo;
    }

    public CreateLeaseOrderRequest setAlipayOrderTotalAmount(Long alipayOrderTotalAmount) {
        this.alipayOrderTotalAmount = alipayOrderTotalAmount;
        return this;
    }
    public Long getAlipayOrderTotalAmount() {
        return this.alipayOrderTotalAmount;
    }

    public CreateLeaseOrderRequest setDepositWaiveAmount(Long depositWaiveAmount) {
        this.depositWaiveAmount = depositWaiveAmount;
        return this;
    }
    public Long getDepositWaiveAmount() {
        return this.depositWaiveAmount;
    }

    public CreateLeaseOrderRequest setInsuranceCoverage(Long insuranceCoverage) {
        this.insuranceCoverage = insuranceCoverage;
        return this;
    }
    public Long getInsuranceCoverage() {
        return this.insuranceCoverage;
    }

    public CreateLeaseOrderRequest setInsuranceOrderNo(String insuranceOrderNo) {
        this.insuranceOrderNo = insuranceOrderNo;
        return this;
    }
    public String getInsuranceOrderNo() {
        return this.insuranceOrderNo;
    }

    public CreateLeaseOrderRequest setItemName(String itemName) {
        this.itemName = itemName;
        return this;
    }
    public String getItemName() {
        return this.itemName;
    }

    public CreateLeaseOrderRequest setItemPrice(Long itemPrice) {
        this.itemPrice = itemPrice;
        return this;
    }
    public Long getItemPrice() {
        return this.itemPrice;
    }

    public CreateLeaseOrderRequest setItemType(String itemType) {
        this.itemType = itemType;
        return this;
    }
    public String getItemType() {
        return this.itemType;
    }

    public CreateLeaseOrderRequest setMerchantAlipayAccount(String merchantAlipayAccount) {
        this.merchantAlipayAccount = merchantAlipayAccount;
        return this;
    }
    public String getMerchantAlipayAccount() {
        return this.merchantAlipayAccount;
    }

    public CreateLeaseOrderRequest setMerchantAlipayId(String merchantAlipayId) {
        this.merchantAlipayId = merchantAlipayId;
        return this;
    }
    public String getMerchantAlipayId() {
        return this.merchantAlipayId;
    }

    public CreateLeaseOrderRequest setMerchantName(String merchantName) {
        this.merchantName = merchantName;
        return this;
    }
    public String getMerchantName() {
        return this.merchantName;
    }

    public CreateLeaseOrderRequest setMerchantOrderNo(String merchantOrderNo) {
        this.merchantOrderNo = merchantOrderNo;
        return this;
    }
    public String getMerchantOrderNo() {
        return this.merchantOrderNo;
    }

    public CreateLeaseOrderRequest setPaymentChannel(String paymentChannel) {
        this.paymentChannel = paymentChannel;
        return this;
    }
    public String getPaymentChannel() {
        return this.paymentChannel;
    }

    public CreateLeaseOrderRequest setTenancyTermEnd(Long tenancyTermEnd) {
        this.tenancyTermEnd = tenancyTermEnd;
        return this;
    }
    public Long getTenancyTermEnd() {
        return this.tenancyTermEnd;
    }

    public CreateLeaseOrderRequest setTenancyTermStart(Long tenancyTermStart) {
        this.tenancyTermStart = tenancyTermStart;
        return this;
    }
    public Long getTenancyTermStart() {
        return this.tenancyTermStart;
    }

    public CreateLeaseOrderRequest setInsured(Boolean insured) {
        this.insured = insured;
        return this;
    }
    public Boolean getInsured() {
        return this.insured;
    }

    public CreateLeaseOrderRequest setInsuranceOrderUrl(String insuranceOrderUrl) {
        this.insuranceOrderUrl = insuranceOrderUrl;
        return this;
    }
    public String getInsuranceOrderUrl() {
        return this.insuranceOrderUrl;
    }

    public CreateLeaseOrderRequest setInsuranceBillNo(String insuranceBillNo) {
        this.insuranceBillNo = insuranceBillNo;
        return this;
    }
    public String getInsuranceBillNo() {
        return this.insuranceBillNo;
    }

    public CreateLeaseOrderRequest setInsuranceBillTime(String insuranceBillTime) {
        this.insuranceBillTime = insuranceBillTime;
        return this;
    }
    public String getInsuranceBillTime() {
        return this.insuranceBillTime;
    }

    public CreateLeaseOrderRequest setInsuranceBillAmount(Long insuranceBillAmount) {
        this.insuranceBillAmount = insuranceBillAmount;
        return this;
    }
    public Long getInsuranceBillAmount() {
        return this.insuranceBillAmount;
    }

    public CreateLeaseOrderRequest setInsuranceProductCoverage(Long insuranceProductCoverage) {
        this.insuranceProductCoverage = insuranceProductCoverage;
        return this;
    }
    public Long getInsuranceProductCoverage() {
        return this.insuranceProductCoverage;
    }

}
