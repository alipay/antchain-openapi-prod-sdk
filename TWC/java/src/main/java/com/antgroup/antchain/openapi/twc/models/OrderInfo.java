// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class OrderInfo extends TeaModel {
    // 出租方平台名称
    /**
     * <strong>example:</strong>
     * <p>租赁宝</p>
     */
    @NameInMap("lessor_platform_name")
    @Validation(required = true)
    public String lessorPlatformName;

    // 订单号
    /**
     * <strong>example:</strong>
     * <p>232278957595482</p>
     */
    @NameInMap("order_number")
    @Validation(required = true)
    public String orderNumber;

    // 合同编号
    /**
     * <strong>example:</strong>
     * <p>232278957595482</p>
     */
    @NameInMap("contract_no")
    @Validation(required = true)
    public String contractNo;

    // 合同名称
    /**
     * <strong>example:</strong>
     * <p>租赁宝合同</p>
     */
    @NameInMap("contract_name")
    @Validation(required = true)
    public String contractName;

    // 订单商品信息
    @NameInMap("order_items")
    @Validation(required = true)
    public java.util.List<OrderItem> orderItems;

    // 设备及配件总价
    /**
     * <strong>example:</strong>
     * <p>123.00</p>
     */
    @NameInMap("total_device_price")
    @Validation(required = true)
    public String totalDevicePrice;

    // 押金金额
    /**
     * <strong>example:</strong>
     * <p>123.00</p>
     */
    @NameInMap("deposit_amount")
    @Validation(required = true)
    public String depositAmount;

    // 免押金额
    /**
     * <strong>example:</strong>
     * <p>1123.00</p>
     */
    @NameInMap("free_deposit")
    @Validation(required = true)
    public String freeDeposit;

    // 签约时间
    /**
     * <strong>example:</strong>
     * <p>2021-05-07 17:13:50</p>
     */
    @NameInMap("signing_time")
    @Validation(required = true)
    public String signingTime;

    // 租期起始时间
    /**
     * <strong>example:</strong>
     * <p>2021-05-07 17:13:50</p>
     */
    @NameInMap("lease_start_time")
    @Validation(required = true)
    public String leaseStartTime;

    // 租期结束时间
    /**
     * <strong>example:</strong>
     * <p>2021-05-07 17:13:50</p>
     */
    @NameInMap("lease_end_time")
    @Validation(required = true)
    public String leaseEndTime;

    // 买断金额计算公式
    /**
     * <strong>example:</strong>
     * <p>到期转售买断款+未还租金-实付押金</p>
     */
    @NameInMap("buyout_amount_formula_calc")
    @Validation(required = true)
    public String buyoutAmountFormulaCalc;

    // 首付款
    /**
     * <strong>example:</strong>
     * <p>123.00</p>
     */
    @NameInMap("pay_in_advance")
    @Validation(required = true)
    public String payInAdvance;

    public static OrderInfo build(java.util.Map<String, ?> map) throws Exception {
        OrderInfo self = new OrderInfo();
        return TeaModel.build(map, self);
    }

    public OrderInfo setLessorPlatformName(String lessorPlatformName) {
        this.lessorPlatformName = lessorPlatformName;
        return this;
    }
    public String getLessorPlatformName() {
        return this.lessorPlatformName;
    }

    public OrderInfo setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }
    public String getOrderNumber() {
        return this.orderNumber;
    }

    public OrderInfo setContractNo(String contractNo) {
        this.contractNo = contractNo;
        return this;
    }
    public String getContractNo() {
        return this.contractNo;
    }

    public OrderInfo setContractName(String contractName) {
        this.contractName = contractName;
        return this;
    }
    public String getContractName() {
        return this.contractName;
    }

    public OrderInfo setOrderItems(java.util.List<OrderItem> orderItems) {
        this.orderItems = orderItems;
        return this;
    }
    public java.util.List<OrderItem> getOrderItems() {
        return this.orderItems;
    }

    public OrderInfo setTotalDevicePrice(String totalDevicePrice) {
        this.totalDevicePrice = totalDevicePrice;
        return this;
    }
    public String getTotalDevicePrice() {
        return this.totalDevicePrice;
    }

    public OrderInfo setDepositAmount(String depositAmount) {
        this.depositAmount = depositAmount;
        return this;
    }
    public String getDepositAmount() {
        return this.depositAmount;
    }

    public OrderInfo setFreeDeposit(String freeDeposit) {
        this.freeDeposit = freeDeposit;
        return this;
    }
    public String getFreeDeposit() {
        return this.freeDeposit;
    }

    public OrderInfo setSigningTime(String signingTime) {
        this.signingTime = signingTime;
        return this;
    }
    public String getSigningTime() {
        return this.signingTime;
    }

    public OrderInfo setLeaseStartTime(String leaseStartTime) {
        this.leaseStartTime = leaseStartTime;
        return this;
    }
    public String getLeaseStartTime() {
        return this.leaseStartTime;
    }

    public OrderInfo setLeaseEndTime(String leaseEndTime) {
        this.leaseEndTime = leaseEndTime;
        return this;
    }
    public String getLeaseEndTime() {
        return this.leaseEndTime;
    }

    public OrderInfo setBuyoutAmountFormulaCalc(String buyoutAmountFormulaCalc) {
        this.buyoutAmountFormulaCalc = buyoutAmountFormulaCalc;
        return this;
    }
    public String getBuyoutAmountFormulaCalc() {
        return this.buyoutAmountFormulaCalc;
    }

    public OrderInfo setPayInAdvance(String payInAdvance) {
        this.payInAdvance = payInAdvance;
        return this;
    }
    public String getPayInAdvance() {
        return this.payInAdvance;
    }

}
