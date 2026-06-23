// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class Coupon extends TeaModel {
    // 优惠券ID
    /**
     * <strong>example:</strong>
     * <p>1231313</p>
     */
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 优惠券名称,前端展示
    /**
     * <strong>example:</strong>
     * <p>XX优惠券</p>
     */
    @NameInMap("display_name")
    @Validation(required = true)
    public String displayName;

    // 优惠券模板名称
    /**
     * <strong>example:</strong>
     * <p>XXXX</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 优惠券类型，VOUCHER：抵用券;CERTAIN：满减券；DISCOUNT：折扣券
    /**
     * <strong>example:</strong>
     * <p>VOUCHER</p>
     */
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 优惠券总金额，单位（分）。可使用优惠金额为amount-used_amount
    /**
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("amount")
    public String amount;

    // 已使用金额，单位（分）。
    /**
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("used_amount")
    public String usedAmount;

    // 状态，AVAILABLE-有效/EXPIRED-已过期/EXHAUSTED-已用完/ABANDONED-已作废
    /**
     * <strong>example:</strong>
     * <p>AVAILABLE</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 有效期开始时间
    /**
     * <strong>example:</strong>
     * <p>2018-10-10T10:10:00Z</p>
     */
    @NameInMap("start_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String startTime;

    // 有效期结束时间
    /**
     * <strong>example:</strong>
     * <p>2018-10-10T10:10:00Z</p>
     */
    @NameInMap("end_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String endTime;

    // 模板id
    /**
     * <strong>example:</strong>
     * <p>111</p>
     */
    @NameInMap("youhui_template_id")
    @Validation(required = true)
    public Long youhuiTemplateId;

    // 优惠券=折扣券时使用，如0.75
    /**
     * <strong>example:</strong>
     * <p>0.75</p>
     */
    @NameInMap("discount_rate")
    public String discountRate;

    // 优惠券类型=满减券时使用，如满2000元
    /**
     * <strong>example:</strong>
     * <p>2000.00</p>
     */
    @NameInMap("full_amount")
    public String fullAmount;

    // 可以使用的总次数
    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("usage_count")
    @Validation(required = true)
    public Long usageCount;

    // 已使用次数（冻结次数）
    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("used_count")
    @Validation(required = true)
    public Long usedCount;

    // 适用产品：通用/ECS/RDS
    /**
     * <strong>example:</strong>
     * <p>通用</p>
     */
    @NameInMap("product_list")
    @Validation(required = true)
    public String productList;

    // 适用订单类型
    /**
     * <strong>example:</strong>
     * <p>BUY</p>
     */
    @NameInMap("order_type_list")
    @Validation(required = true)
    public String orderTypeList;

    //  币种CurrencyCode CNY 代表人民币 USD代表美元
    /**
     * <strong>example:</strong>
     * <p>CNY</p>
     */
    @NameInMap("currency")
    @Validation(required = true)
    public String currency;

    // 高精度总金额，单位元。可用金额 high_precision_available_amount = 总金额 high_precision_amount - 已使用金额 high_precision_used_amount
    /**
     * <strong>example:</strong>
     * <p>100.00</p>
     */
    @NameInMap("high_precision_amount")
    @Validation(required = true)
    public String highPrecisionAmount;

    // 单位元
    /**
     * <strong>example:</strong>
     * <p>0.001</p>
     */
    @NameInMap("high_precision_used_amount")
    @Validation(required = true)
    public String highPrecisionUsedAmount;

    // 单位元
    /**
     * <strong>example:</strong>
     * <p>100.001</p>
     */
    @NameInMap("high_precision_available_amount")
    @Validation(required = true)
    public String highPrecisionAvailableAmount;

    public static Coupon build(java.util.Map<String, ?> map) throws Exception {
        Coupon self = new Coupon();
        return TeaModel.build(map, self);
    }

    public Coupon setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public Coupon setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public Coupon setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Coupon setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public Coupon setAmount(String amount) {
        this.amount = amount;
        return this;
    }
    public String getAmount() {
        return this.amount;
    }

    public Coupon setUsedAmount(String usedAmount) {
        this.usedAmount = usedAmount;
        return this;
    }
    public String getUsedAmount() {
        return this.usedAmount;
    }

    public Coupon setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public Coupon setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public Coupon setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public Coupon setYouhuiTemplateId(Long youhuiTemplateId) {
        this.youhuiTemplateId = youhuiTemplateId;
        return this;
    }
    public Long getYouhuiTemplateId() {
        return this.youhuiTemplateId;
    }

    public Coupon setDiscountRate(String discountRate) {
        this.discountRate = discountRate;
        return this;
    }
    public String getDiscountRate() {
        return this.discountRate;
    }

    public Coupon setFullAmount(String fullAmount) {
        this.fullAmount = fullAmount;
        return this;
    }
    public String getFullAmount() {
        return this.fullAmount;
    }

    public Coupon setUsageCount(Long usageCount) {
        this.usageCount = usageCount;
        return this;
    }
    public Long getUsageCount() {
        return this.usageCount;
    }

    public Coupon setUsedCount(Long usedCount) {
        this.usedCount = usedCount;
        return this;
    }
    public Long getUsedCount() {
        return this.usedCount;
    }

    public Coupon setProductList(String productList) {
        this.productList = productList;
        return this;
    }
    public String getProductList() {
        return this.productList;
    }

    public Coupon setOrderTypeList(String orderTypeList) {
        this.orderTypeList = orderTypeList;
        return this;
    }
    public String getOrderTypeList() {
        return this.orderTypeList;
    }

    public Coupon setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public Coupon setHighPrecisionAmount(String highPrecisionAmount) {
        this.highPrecisionAmount = highPrecisionAmount;
        return this;
    }
    public String getHighPrecisionAmount() {
        return this.highPrecisionAmount;
    }

    public Coupon setHighPrecisionUsedAmount(String highPrecisionUsedAmount) {
        this.highPrecisionUsedAmount = highPrecisionUsedAmount;
        return this;
    }
    public String getHighPrecisionUsedAmount() {
        return this.highPrecisionUsedAmount;
    }

    public Coupon setHighPrecisionAvailableAmount(String highPrecisionAvailableAmount) {
        this.highPrecisionAvailableAmount = highPrecisionAvailableAmount;
        return this;
    }
    public String getHighPrecisionAvailableAmount() {
        return this.highPrecisionAvailableAmount;
    }

}
