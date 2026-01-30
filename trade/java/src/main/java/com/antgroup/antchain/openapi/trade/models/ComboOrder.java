// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trade.models;

import com.aliyun.tea.*;

public class ComboOrder extends TeaModel {
    // 租户ID
    /**
     * <strong>example:</strong>
     * <p>2088xxx</p>
     */
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 业务流水号
    /**
     * <strong>example:</strong>
     * <p>2088123412341234</p>
     */
    @NameInMap("biz_no")
    @Validation(required = true)
    public String bizNo;

    // 套餐订单号
    /**
     * <strong>example:</strong>
     * <p>2088123412341234</p>
     */
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 套餐编码
    /**
     * <strong>example:</strong>
     * <p>KKAASP00001001</p>
     */
    @NameInMap("combo_code")
    @Validation(required = true)
    public String comboCode;

    // 套餐名称，下单时的套餐名称
    /**
     * <strong>example:</strong>
     * <p>测试套餐</p>
     */
    @NameInMap("combo_name")
    @Validation(required = true)
    public String comboName;

    // 订单状态，CREATED：创建；CANCEL：取消；PAYING：支付中；PAID：支付完成
    /**
     * <strong>example:</strong>
     * <p>CREATED</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 履约生产状态，INCOMPLETE:未完成、COMPLETED:完成
    /**
     * <strong>example:</strong>
     * <p>COMPLETED</p>
     */
    @NameInMap("provision_status")
    @Validation(required = true)
    public String provisionStatus;

    // 订单原始金额
    /**
     * <strong>example:</strong>
     * <p>200.00</p>
     */
    @NameInMap("original_amount")
    @Validation(required = true)
    public String originalAmount;

    // 折扣金额
    /**
     * <strong>example:</strong>
     * <p>100.00</p>
     */
    @NameInMap("discount_amount")
    @Validation(required = true)
    public String discountAmount;

    // 优惠金额
    /**
     * <strong>example:</strong>
     * <p>100.00</p>
     */
    @NameInMap("coupon_amount")
    @Validation(required = true)
    public String couponAmount;

    // 实付金额
    /**
     * <strong>example:</strong>
     * <p>0.00</p>
     */
    @NameInMap("pay_amount")
    @Validation(required = true)
    public String payAmount;

    // 下单时间
    /**
     * <strong>example:</strong>
     * <p>2018-10-10T10:10:00Z</p>
     */
    @NameInMap("gmt_create")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreate;

    // 套餐内商品订单列表
    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("commodity_orders")
    @Validation(required = true)
    public java.util.List<ComboCommodityOrder> commodityOrders;

    // 支付完成时间
    /**
     * <strong>example:</strong>
     * <p>2018-10-10T10:10:00Z</p>
     */
    @NameInMap("pay_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String payTime;

    // 支付渠道
    /**
     * <strong>example:</strong>
     * <p>CUSTOMER_FUND</p>
     */
    @NameInMap("pay_channel")
    @Validation(required = true)
    public String payChannel;

    public static ComboOrder build(java.util.Map<String, ?> map) throws Exception {
        ComboOrder self = new ComboOrder();
        return TeaModel.build(map, self);
    }

    public ComboOrder setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ComboOrder setBizNo(String bizNo) {
        this.bizNo = bizNo;
        return this;
    }
    public String getBizNo() {
        return this.bizNo;
    }

    public ComboOrder setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ComboOrder setComboCode(String comboCode) {
        this.comboCode = comboCode;
        return this;
    }
    public String getComboCode() {
        return this.comboCode;
    }

    public ComboOrder setComboName(String comboName) {
        this.comboName = comboName;
        return this;
    }
    public String getComboName() {
        return this.comboName;
    }

    public ComboOrder setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ComboOrder setProvisionStatus(String provisionStatus) {
        this.provisionStatus = provisionStatus;
        return this;
    }
    public String getProvisionStatus() {
        return this.provisionStatus;
    }

    public ComboOrder setOriginalAmount(String originalAmount) {
        this.originalAmount = originalAmount;
        return this;
    }
    public String getOriginalAmount() {
        return this.originalAmount;
    }

    public ComboOrder setDiscountAmount(String discountAmount) {
        this.discountAmount = discountAmount;
        return this;
    }
    public String getDiscountAmount() {
        return this.discountAmount;
    }

    public ComboOrder setCouponAmount(String couponAmount) {
        this.couponAmount = couponAmount;
        return this;
    }
    public String getCouponAmount() {
        return this.couponAmount;
    }

    public ComboOrder setPayAmount(String payAmount) {
        this.payAmount = payAmount;
        return this;
    }
    public String getPayAmount() {
        return this.payAmount;
    }

    public ComboOrder setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public ComboOrder setCommodityOrders(java.util.List<ComboCommodityOrder> commodityOrders) {
        this.commodityOrders = commodityOrders;
        return this;
    }
    public java.util.List<ComboCommodityOrder> getCommodityOrders() {
        return this.commodityOrders;
    }

    public ComboOrder setPayTime(String payTime) {
        this.payTime = payTime;
        return this;
    }
    public String getPayTime() {
        return this.payTime;
    }

    public ComboOrder setPayChannel(String payChannel) {
        this.payChannel = payChannel;
        return this;
    }
    public String getPayChannel() {
        return this.payChannel;
    }

}
