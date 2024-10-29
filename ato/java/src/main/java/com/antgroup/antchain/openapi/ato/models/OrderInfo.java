// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class OrderInfo extends TeaModel {
    // 订单id
    @NameInMap("order_id")
    public String orderId;

    // 订单创建时间
    @NameInMap("order_create_time")
    public String orderCreateTime;

    // 订单支付时间
    @NameInMap("order_pay_time")
    public String orderPayTime;

    // 租金总额(分)
    @NameInMap("total_rent_money")
    public Long totalRentMoney;

    // 租期
    @NameInMap("rent_term")
    public Long rentTerm;

    // 租期单位
    @NameInMap("rent_unit")
    public String rentUnit;

    // 订单状态
    @NameInMap("order_status")
    public String orderStatus;

    // 订单子状态
    @NameInMap("order_sub_status")
    public String orderSubStatus;

    // 免押金额（分）
    @NameInMap("deposit_price")
    public Long depositPrice;

    // 到期买断价(分)
    @NameInMap("buy_out_price")
    public Long buyOutPrice;

    // 物流方案
    @NameInMap("logistic_type")
    public String logisticType;

    // 到期形式
    // NA(0, "无意义"),
    // BUYOUT(1, "到期买断或归还"),
    // FREE_ON_RENT(2, "租满即送"),
    // RENEW_LEASE(3, "续租"),;
    @NameInMap("due_mode")
    public Long dueMode;

    // 首付款金额(分)
    @NameInMap("down_payment")
    public Long downPayment;

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

}
