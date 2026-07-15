// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class LeaseOrderInfo extends TeaModel {
    // 出租方平台名称
    /**
     * <strong>example:</strong>
     * <p>租赁宝</p>
     */
    @NameInMap("lessor_platform_name")
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
    public String contractNo;

    // 合同名称
    /**
     * <strong>example:</strong>
     * <p>租赁合同</p>
     */
    @NameInMap("contract_name")
    public String contractName;

    // 订单商品信息列表
    @NameInMap("order_items")
    @Validation(required = true)
    public java.util.List<OrderItem> orderItems;

    // 设备及配件总价（单位元）
    /**
     * <strong>example:</strong>
     * <p>123.00</p>
     */
    @NameInMap("total_device_price")
    @Validation(required = true)
    public String totalDevicePrice;

    // 押金金额（单位元）
    /**
     * <strong>example:</strong>
     * <p>123.00</p>
     */
    @NameInMap("deposit_amount")
    public String depositAmount;

    // 免押金额
    /**
     * <strong>example:</strong>
     * <p>123.00</p>
     */
    @NameInMap("free_deposit")
    public String freeDeposit;

    // 签约时间
    /**
     * <strong>example:</strong>
     * <p>2021-05-31</p>
     */
    @NameInMap("sign_time")
    public String signTime;

    // 租期起始时间
    /**
     * <strong>example:</strong>
     * <p>2021-06-01</p>
     */
    @NameInMap("lease_start_time")
    public String leaseStartTime;

    // 租期结束时间
    /**
     * <strong>example:</strong>
     * <p>2022-06-01</p>
     */
    @NameInMap("lease_end_time")
    public String leaseEndTime;

    // 买断金额计算公式
    /**
     * <strong>example:</strong>
     * <p>商品官方价-已还租金-实付押金-首付款</p>
     */
    @NameInMap("buyout_amount_formula_calc")
    public String buyoutAmountFormulaCalc;

    // 首付款（单位元）
    /**
     * <strong>example:</strong>
     * <p>1123.00</p>
     */
    @NameInMap("pay_in_advance")
    public String payInAdvance;

    // 创建时间
    /**
     * <strong>example:</strong>
     * <p>2019-12-12</p>
     */
    @NameInMap("order_create_time")
    public String orderCreateTime;

    // 到期买断价 保留两位小数 单位元
    /**
     * <strong>example:</strong>
     * <p>23.33</p>
     */
    @NameInMap("buy_out_price")
    public String buyOutPrice;

    public static LeaseOrderInfo build(java.util.Map<String, ?> map) throws Exception {
        LeaseOrderInfo self = new LeaseOrderInfo();
        return TeaModel.build(map, self);
    }

    public LeaseOrderInfo setLessorPlatformName(String lessorPlatformName) {
        this.lessorPlatformName = lessorPlatformName;
        return this;
    }
    public String getLessorPlatformName() {
        return this.lessorPlatformName;
    }

    public LeaseOrderInfo setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }
    public String getOrderNumber() {
        return this.orderNumber;
    }

    public LeaseOrderInfo setContractNo(String contractNo) {
        this.contractNo = contractNo;
        return this;
    }
    public String getContractNo() {
        return this.contractNo;
    }

    public LeaseOrderInfo setContractName(String contractName) {
        this.contractName = contractName;
        return this;
    }
    public String getContractName() {
        return this.contractName;
    }

    public LeaseOrderInfo setOrderItems(java.util.List<OrderItem> orderItems) {
        this.orderItems = orderItems;
        return this;
    }
    public java.util.List<OrderItem> getOrderItems() {
        return this.orderItems;
    }

    public LeaseOrderInfo setTotalDevicePrice(String totalDevicePrice) {
        this.totalDevicePrice = totalDevicePrice;
        return this;
    }
    public String getTotalDevicePrice() {
        return this.totalDevicePrice;
    }

    public LeaseOrderInfo setDepositAmount(String depositAmount) {
        this.depositAmount = depositAmount;
        return this;
    }
    public String getDepositAmount() {
        return this.depositAmount;
    }

    public LeaseOrderInfo setFreeDeposit(String freeDeposit) {
        this.freeDeposit = freeDeposit;
        return this;
    }
    public String getFreeDeposit() {
        return this.freeDeposit;
    }

    public LeaseOrderInfo setSignTime(String signTime) {
        this.signTime = signTime;
        return this;
    }
    public String getSignTime() {
        return this.signTime;
    }

    public LeaseOrderInfo setLeaseStartTime(String leaseStartTime) {
        this.leaseStartTime = leaseStartTime;
        return this;
    }
    public String getLeaseStartTime() {
        return this.leaseStartTime;
    }

    public LeaseOrderInfo setLeaseEndTime(String leaseEndTime) {
        this.leaseEndTime = leaseEndTime;
        return this;
    }
    public String getLeaseEndTime() {
        return this.leaseEndTime;
    }

    public LeaseOrderInfo setBuyoutAmountFormulaCalc(String buyoutAmountFormulaCalc) {
        this.buyoutAmountFormulaCalc = buyoutAmountFormulaCalc;
        return this;
    }
    public String getBuyoutAmountFormulaCalc() {
        return this.buyoutAmountFormulaCalc;
    }

    public LeaseOrderInfo setPayInAdvance(String payInAdvance) {
        this.payInAdvance = payInAdvance;
        return this;
    }
    public String getPayInAdvance() {
        return this.payInAdvance;
    }

    public LeaseOrderInfo setOrderCreateTime(String orderCreateTime) {
        this.orderCreateTime = orderCreateTime;
        return this;
    }
    public String getOrderCreateTime() {
        return this.orderCreateTime;
    }

    public LeaseOrderInfo setBuyOutPrice(String buyOutPrice) {
        this.buyOutPrice = buyOutPrice;
        return this;
    }
    public String getBuyOutPrice() {
        return this.buyOutPrice;
    }

}
