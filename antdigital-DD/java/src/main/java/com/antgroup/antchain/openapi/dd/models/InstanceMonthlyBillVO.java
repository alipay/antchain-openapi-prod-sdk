// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class InstanceMonthlyBillVO extends TeaModel {
    // 金融云租户id
    /**
     * <strong>example:</strong>
     * <p>2088101118131245</p>
     */
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 产品类别@ProductServiceEnum
    /**
     * <strong>example:</strong>
     * <p>MONITOR</p>
     */
    @NameInMap("product_category")
    @Validation(required = true)
    public String productCategory;

    // 产品名称
    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("product_name")
    @Validation(required = true)
    public String productName;

    // 付费类型
    /**
     * <strong>example:</strong>
     * <p>AFTER_PAY</p>
     */
    @NameInMap("charge_type")
    @Validation(required = true)
    public String chargeType;

    // 实例id
    /**
     * <strong>example:</strong>
     * <p>ASXASDAZAZ</p>
     */
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 账单月份
    /**
     * <strong>example:</strong>
     * <p>yyyyMM(202201)</p>
     */
    @NameInMap("bill_month")
    @Validation(required = true)
    public String billMonth;

    // 应收金额(不包含优惠券和折扣)
    @NameInMap("bill_amount")
    public MultiCurrencyMoney billAmount;

    // 优惠券抵扣金额
    /**
     * <strong>example:</strong>
     * <p>100.10</p>
     */
    @NameInMap("coupon_amount")
    @Validation(required = true)
    public MultiCurrencyMoney couponAmount;

    // 高精度优惠券金额
    /**
     * <strong>example:</strong>
     * <p>1.01</p>
     */
    @NameInMap("high_precision_coupon_amount")
    @Validation(required = true)
    public String highPrecisionCouponAmount;

    // 折扣金额
    /**
     * <strong>example:</strong>
     * <p>11.01</p>
     */
    @NameInMap("discount_amount")
    @Validation(required = true)
    public MultiCurrencyMoney discountAmount;

    // 高精度折扣金额
    /**
     * <strong>example:</strong>
     * <p>1.01</p>
     */
    @NameInMap("high_precision_discount_amount")
    @Validation(required = true)
    public String highPrecisionDiscountAmount;

    // 调账金额
    /**
     * <strong>example:</strong>
     * <p>1.01</p>
     */
    @NameInMap("adjust_amount")
    @Validation(required = true)
    public MultiCurrencyMoney adjustAmount;

    // 已收金额
    /**
     * <strong>example:</strong>
     * <p>1.01</p>
     */
    @NameInMap("received_amount")
    @Validation(required = true)
    public MultiCurrencyMoney receivedAmount;

    // 账单应收日期
    /**
     * <strong>example:</strong>
     * <p>2018-10-10T10:10:00Z</p>
     */
    @NameInMap("account_receivable_date")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String accountReceivableDate;

    // 月账单号
    /**
     * <strong>example:</strong>
     * <p>123123</p>
     */
    @NameInMap("instance_monthly_bill_id")
    @Validation(required = true)
    public String instanceMonthlyBillId;

    // 支付渠道
    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("pay_channel")
    @Validation(required = true)
    public String payChannel;

    // 合同ID
    /**
     * <strong>example:</strong>
     * <p>123123</p>
     */
    @NameInMap("contract_id")
    @Validation(required = true)
    public String contractId;

    // map的json串
    /**
     * <strong>example:</strong>
     * <p>{&quot;test&quot;:&quot;tets&quot;}</p>
     */
    @NameInMap("extend_info")
    @Validation(required = true)
    public String extendInfo;

    // 未结清金额
    @NameInMap("unsettled_amount")
    @Validation(required = true)
    public MultiCurrencyMoney unsettledAmount;

    // 优惠金额
    @NameInMap("total_discount_amount")
    @Validation(required = true)
    public MultiCurrencyMoney totalDiscountAmount;

    public static InstanceMonthlyBillVO build(java.util.Map<String, ?> map) throws Exception {
        InstanceMonthlyBillVO self = new InstanceMonthlyBillVO();
        return TeaModel.build(map, self);
    }

    public InstanceMonthlyBillVO setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public InstanceMonthlyBillVO setProductCategory(String productCategory) {
        this.productCategory = productCategory;
        return this;
    }
    public String getProductCategory() {
        return this.productCategory;
    }

    public InstanceMonthlyBillVO setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public InstanceMonthlyBillVO setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public InstanceMonthlyBillVO setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public InstanceMonthlyBillVO setBillMonth(String billMonth) {
        this.billMonth = billMonth;
        return this;
    }
    public String getBillMonth() {
        return this.billMonth;
    }

    public InstanceMonthlyBillVO setBillAmount(MultiCurrencyMoney billAmount) {
        this.billAmount = billAmount;
        return this;
    }
    public MultiCurrencyMoney getBillAmount() {
        return this.billAmount;
    }

    public InstanceMonthlyBillVO setCouponAmount(MultiCurrencyMoney couponAmount) {
        this.couponAmount = couponAmount;
        return this;
    }
    public MultiCurrencyMoney getCouponAmount() {
        return this.couponAmount;
    }

    public InstanceMonthlyBillVO setHighPrecisionCouponAmount(String highPrecisionCouponAmount) {
        this.highPrecisionCouponAmount = highPrecisionCouponAmount;
        return this;
    }
    public String getHighPrecisionCouponAmount() {
        return this.highPrecisionCouponAmount;
    }

    public InstanceMonthlyBillVO setDiscountAmount(MultiCurrencyMoney discountAmount) {
        this.discountAmount = discountAmount;
        return this;
    }
    public MultiCurrencyMoney getDiscountAmount() {
        return this.discountAmount;
    }

    public InstanceMonthlyBillVO setHighPrecisionDiscountAmount(String highPrecisionDiscountAmount) {
        this.highPrecisionDiscountAmount = highPrecisionDiscountAmount;
        return this;
    }
    public String getHighPrecisionDiscountAmount() {
        return this.highPrecisionDiscountAmount;
    }

    public InstanceMonthlyBillVO setAdjustAmount(MultiCurrencyMoney adjustAmount) {
        this.adjustAmount = adjustAmount;
        return this;
    }
    public MultiCurrencyMoney getAdjustAmount() {
        return this.adjustAmount;
    }

    public InstanceMonthlyBillVO setReceivedAmount(MultiCurrencyMoney receivedAmount) {
        this.receivedAmount = receivedAmount;
        return this;
    }
    public MultiCurrencyMoney getReceivedAmount() {
        return this.receivedAmount;
    }

    public InstanceMonthlyBillVO setAccountReceivableDate(String accountReceivableDate) {
        this.accountReceivableDate = accountReceivableDate;
        return this;
    }
    public String getAccountReceivableDate() {
        return this.accountReceivableDate;
    }

    public InstanceMonthlyBillVO setInstanceMonthlyBillId(String instanceMonthlyBillId) {
        this.instanceMonthlyBillId = instanceMonthlyBillId;
        return this;
    }
    public String getInstanceMonthlyBillId() {
        return this.instanceMonthlyBillId;
    }

    public InstanceMonthlyBillVO setPayChannel(String payChannel) {
        this.payChannel = payChannel;
        return this;
    }
    public String getPayChannel() {
        return this.payChannel;
    }

    public InstanceMonthlyBillVO setContractId(String contractId) {
        this.contractId = contractId;
        return this;
    }
    public String getContractId() {
        return this.contractId;
    }

    public InstanceMonthlyBillVO setExtendInfo(String extendInfo) {
        this.extendInfo = extendInfo;
        return this;
    }
    public String getExtendInfo() {
        return this.extendInfo;
    }

    public InstanceMonthlyBillVO setUnsettledAmount(MultiCurrencyMoney unsettledAmount) {
        this.unsettledAmount = unsettledAmount;
        return this;
    }
    public MultiCurrencyMoney getUnsettledAmount() {
        return this.unsettledAmount;
    }

    public InstanceMonthlyBillVO setTotalDiscountAmount(MultiCurrencyMoney totalDiscountAmount) {
        this.totalDiscountAmount = totalDiscountAmount;
        return this;
    }
    public MultiCurrencyMoney getTotalDiscountAmount() {
        return this.totalDiscountAmount;
    }

}
