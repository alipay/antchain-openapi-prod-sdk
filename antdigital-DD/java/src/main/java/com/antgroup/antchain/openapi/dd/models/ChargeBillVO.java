// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class ChargeBillVO extends TeaModel {
    // 主键Id
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 租户Id
    /**
     * <strong>example:</strong>
     * <p>2333</p>
     */
    @NameInMap("tenant_id")
    public String tenantId;

    // 合约号
    /**
     * <strong>example:</strong>
     * <p>dasd</p>
     */
    @NameInMap("ar_no")
    public String arNo;

    // 资源名称@ProductEnum
    /**
     * <strong>example:</strong>
     * <p>资源名称</p>
     */
    @NameInMap("prod_code")
    public String prodCode;

    // 云产品收费事件码
    /**
     * <strong>example:</strong>
     * <p>adqd</p>
     */
    @NameInMap("prod_event_code")
    public String prodEventCode;

    // 实例id
    /**
     * <strong>example:</strong>
     * <p>eqw</p>
     */
    @NameInMap("instance_id")
    public String instanceId;

    // 账单计费状态@ChargeBillStatusEnum
    /**
     * <strong>example:</strong>
     * <p>INIT</p>
     */
    @NameInMap("status")
    public String status;

    // 账单金额
    /**
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("amount")
    public MultiCurrencyMoney amount;

    // 优惠金额
    /**
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("discount_fee")
    public MultiCurrencyMoney discountFee;

    // 高精度金额
    /**
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("high_precision_amount")
    public String highPrecisionAmount;

    // 高精度活动金额
    /**
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("high_precision_discount_fee")
    public String highPrecisionDiscountFee;

    // 优惠券抵扣金额
    /**
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("coupon_settle_amount")
    public MultiCurrencyMoney couponSettleAmount;

    // 高精度优惠券抵扣金额
    /**
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("high_precision_coupon_settle_amount")
    public String highPrecisionCouponSettleAmount;

    // 优惠券id
    /**
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("coupon_id")
    public String couponId;

    // 应付金额
    /**
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("require_amount")
    public MultiCurrencyMoney requireAmount;

    // 高精度应付金额
    /**
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("high_precision_require_amount")
    public String highPrecisionRequireAmount;

    // 账单对应的使用时间区间的开始时间
    /**
     * <strong>example:</strong>
     * <p>2018-10-10T10:10:00Z</p>
     */
    @NameInMap("gmt_fee_start_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtFeeStartTime;

    // 账单对应的使用时间区间的结束时间
    /**
     * <strong>example:</strong>
     * <p>2018-10-10T10:10:00Z</p>
     */
    @NameInMap("gmt_fee_end_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtFeeEndTime;

    // This property corresponds to db column <tt>extend_info</tt>.
    /**
     * <strong>example:</strong>
     * <p>JSON</p>
     */
    @NameInMap("extend_info")
    public String extendInfo;

    // 是否有流量包抵扣
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("is_flow_pack_deducted")
    public Boolean isFlowPackDeducted;

    public static ChargeBillVO build(java.util.Map<String, ?> map) throws Exception {
        ChargeBillVO self = new ChargeBillVO();
        return TeaModel.build(map, self);
    }

    public ChargeBillVO setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ChargeBillVO setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ChargeBillVO setArNo(String arNo) {
        this.arNo = arNo;
        return this;
    }
    public String getArNo() {
        return this.arNo;
    }

    public ChargeBillVO setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public ChargeBillVO setProdEventCode(String prodEventCode) {
        this.prodEventCode = prodEventCode;
        return this;
    }
    public String getProdEventCode() {
        return this.prodEventCode;
    }

    public ChargeBillVO setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ChargeBillVO setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ChargeBillVO setAmount(MultiCurrencyMoney amount) {
        this.amount = amount;
        return this;
    }
    public MultiCurrencyMoney getAmount() {
        return this.amount;
    }

    public ChargeBillVO setDiscountFee(MultiCurrencyMoney discountFee) {
        this.discountFee = discountFee;
        return this;
    }
    public MultiCurrencyMoney getDiscountFee() {
        return this.discountFee;
    }

    public ChargeBillVO setHighPrecisionAmount(String highPrecisionAmount) {
        this.highPrecisionAmount = highPrecisionAmount;
        return this;
    }
    public String getHighPrecisionAmount() {
        return this.highPrecisionAmount;
    }

    public ChargeBillVO setHighPrecisionDiscountFee(String highPrecisionDiscountFee) {
        this.highPrecisionDiscountFee = highPrecisionDiscountFee;
        return this;
    }
    public String getHighPrecisionDiscountFee() {
        return this.highPrecisionDiscountFee;
    }

    public ChargeBillVO setCouponSettleAmount(MultiCurrencyMoney couponSettleAmount) {
        this.couponSettleAmount = couponSettleAmount;
        return this;
    }
    public MultiCurrencyMoney getCouponSettleAmount() {
        return this.couponSettleAmount;
    }

    public ChargeBillVO setHighPrecisionCouponSettleAmount(String highPrecisionCouponSettleAmount) {
        this.highPrecisionCouponSettleAmount = highPrecisionCouponSettleAmount;
        return this;
    }
    public String getHighPrecisionCouponSettleAmount() {
        return this.highPrecisionCouponSettleAmount;
    }

    public ChargeBillVO setCouponId(String couponId) {
        this.couponId = couponId;
        return this;
    }
    public String getCouponId() {
        return this.couponId;
    }

    public ChargeBillVO setRequireAmount(MultiCurrencyMoney requireAmount) {
        this.requireAmount = requireAmount;
        return this;
    }
    public MultiCurrencyMoney getRequireAmount() {
        return this.requireAmount;
    }

    public ChargeBillVO setHighPrecisionRequireAmount(String highPrecisionRequireAmount) {
        this.highPrecisionRequireAmount = highPrecisionRequireAmount;
        return this;
    }
    public String getHighPrecisionRequireAmount() {
        return this.highPrecisionRequireAmount;
    }

    public ChargeBillVO setGmtFeeStartTime(String gmtFeeStartTime) {
        this.gmtFeeStartTime = gmtFeeStartTime;
        return this;
    }
    public String getGmtFeeStartTime() {
        return this.gmtFeeStartTime;
    }

    public ChargeBillVO setGmtFeeEndTime(String gmtFeeEndTime) {
        this.gmtFeeEndTime = gmtFeeEndTime;
        return this;
    }
    public String getGmtFeeEndTime() {
        return this.gmtFeeEndTime;
    }

    public ChargeBillVO setExtendInfo(String extendInfo) {
        this.extendInfo = extendInfo;
        return this;
    }
    public String getExtendInfo() {
        return this.extendInfo;
    }

    public ChargeBillVO setIsFlowPackDeducted(Boolean isFlowPackDeducted) {
        this.isFlowPackDeducted = isFlowPackDeducted;
        return this;
    }
    public Boolean getIsFlowPackDeducted() {
        return this.isFlowPackDeducted;
    }

}
