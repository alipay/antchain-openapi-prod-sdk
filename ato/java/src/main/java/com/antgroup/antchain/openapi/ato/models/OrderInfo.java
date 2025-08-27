// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class OrderInfo extends TeaModel {
    // 订单id
    /**
     * <strong>example:</strong>
     * <p>SH20241017184159846222</p>
     */
    @NameInMap("order_id")
    public String orderId;

    // 订单创建时间
    /**
     * <strong>example:</strong>
     * <p>2024-10-17 18:41:59.000</p>
     */
    @NameInMap("order_create_time")
    public String orderCreateTime;

    // 订单支付时间
    /**
     * <strong>example:</strong>
     * <p>2024-10-17 18:41:59.000</p>
     */
    @NameInMap("order_pay_time")
    public String orderPayTime;

    // 租金总额(分)
    /**
     * <strong>example:</strong>
     * <p>3500</p>
     */
    @NameInMap("total_rent_money")
    public Long totalRentMoney;

    // 租期
    /**
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("rent_term")
    public Long rentTerm;

    // 租期单位
    /**
     * <strong>example:</strong>
     * <p>MONTH</p>
     */
    @NameInMap("rent_unit")
    public String rentUnit;

    // 订单状态
    /**
     * <strong>example:</strong>
     * <p>OPEN</p>
     */
    @NameInMap("order_status")
    public String orderStatus;

    // 订单子状态
    /**
     * <strong>example:</strong>
     * <p>ORDER_FULFILLMENT</p>
     */
    @NameInMap("order_sub_status")
    public String orderSubStatus;

    // 免押金额（分）
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("deposit_price")
    public Long depositPrice;

    // 到期买断价(分)
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("buy_out_price")
    public Long buyOutPrice;

    // 物流方案
    /**
     * <strong>example:</strong>
     * <p>POST</p>
     */
    @NameInMap("logistic_type")
    public String logisticType;

    // 到期形式
    // NA(0, "无意义"),
    // BUYOUT(1, "到期买断或归还"),
    // FREE_ON_RENT(2, "租满即送"),
    // RENEW_LEASE(3, "续租"),;
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("due_mode")
    public Long dueMode;

    // 首付款金额(分)
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("down_payment")
    public Long downPayment;

    // 商户统一社会信用代码
    /**
     * <strong>example:</strong>
     * <p>91301010101010101A</p>
     */
    @NameInMap("merchant_id")
    public String merchantId;

    // 商户名称
    /**
     * <strong>example:</strong>
     * <p>xxx有限公司</p>
     */
    @NameInMap("merchant_name")
    public String merchantName;

    // 订单开始履约期数
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("divide_start_term_index")
    public Long divideStartTermIndex;

    // 订单关联的营销id
    /**
     * <strong>example:</strong>
     * <p>Promoionxxxxx</p>
     */
    @NameInMap("promotion_id")
    public String promotionId;

    public static OrderInfo build(java.util.Map<String, ?> map) throws Exception {
        OrderInfo self = new OrderInfo();
        return TeaModel.build(map, self);
    }

    public OrderInfo setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public OrderInfo setOrderCreateTime(String orderCreateTime) {
        this.orderCreateTime = orderCreateTime;
        return this;
    }
    public String getOrderCreateTime() {
        return this.orderCreateTime;
    }

    public OrderInfo setOrderPayTime(String orderPayTime) {
        this.orderPayTime = orderPayTime;
        return this;
    }
    public String getOrderPayTime() {
        return this.orderPayTime;
    }

    public OrderInfo setTotalRentMoney(Long totalRentMoney) {
        this.totalRentMoney = totalRentMoney;
        return this;
    }
    public Long getTotalRentMoney() {
        return this.totalRentMoney;
    }

    public OrderInfo setRentTerm(Long rentTerm) {
        this.rentTerm = rentTerm;
        return this;
    }
    public Long getRentTerm() {
        return this.rentTerm;
    }

    public OrderInfo setRentUnit(String rentUnit) {
        this.rentUnit = rentUnit;
        return this;
    }
    public String getRentUnit() {
        return this.rentUnit;
    }

    public OrderInfo setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }
    public String getOrderStatus() {
        return this.orderStatus;
    }

    public OrderInfo setOrderSubStatus(String orderSubStatus) {
        this.orderSubStatus = orderSubStatus;
        return this;
    }
    public String getOrderSubStatus() {
        return this.orderSubStatus;
    }

    public OrderInfo setDepositPrice(Long depositPrice) {
        this.depositPrice = depositPrice;
        return this;
    }
    public Long getDepositPrice() {
        return this.depositPrice;
    }

    public OrderInfo setBuyOutPrice(Long buyOutPrice) {
        this.buyOutPrice = buyOutPrice;
        return this;
    }
    public Long getBuyOutPrice() {
        return this.buyOutPrice;
    }

    public OrderInfo setLogisticType(String logisticType) {
        this.logisticType = logisticType;
        return this;
    }
    public String getLogisticType() {
        return this.logisticType;
    }

    public OrderInfo setDueMode(Long dueMode) {
        this.dueMode = dueMode;
        return this;
    }
    public Long getDueMode() {
        return this.dueMode;
    }

    public OrderInfo setDownPayment(Long downPayment) {
        this.downPayment = downPayment;
        return this;
    }
    public Long getDownPayment() {
        return this.downPayment;
    }

    public OrderInfo setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public OrderInfo setMerchantName(String merchantName) {
        this.merchantName = merchantName;
        return this;
    }
    public String getMerchantName() {
        return this.merchantName;
    }

    public OrderInfo setDivideStartTermIndex(Long divideStartTermIndex) {
        this.divideStartTermIndex = divideStartTermIndex;
        return this;
    }
    public Long getDivideStartTermIndex() {
        return this.divideStartTermIndex;
    }

    public OrderInfo setPromotionId(String promotionId) {
        this.promotionId = promotionId;
        return this;
    }
    public String getPromotionId() {
        return this.promotionId;
    }

}
