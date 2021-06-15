// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class LeaseOrderInfo extends TeaModel {
    // 出租方平台名称
    @NameInMap("lessor_platform_name")
    public String lessorPlatformName;

    // 订单号
    @NameInMap("order_number")
    @Validation(required = true)
    public String orderNumber;

    // 合同编号
    @NameInMap("contract_no")
    @Validation(required = true)
    public String contractNo;

    // 合同名称
    @NameInMap("contract_name")
    public String contractName;

    // 订单商品信息
    @NameInMap("order_items")
    @Validation(required = true)
    public java.util.List<OrderItem> orderItems;

    // 设备及配件总价（单位元）
    @NameInMap("total_device_price")
    @Validation(required = true)
    public String totalDevicePrice;

    // 押金金额（单位元）
    @NameInMap("deposit_amount")
    @Validation(required = true)
    public String depositAmount;

    // 免押金额
    @NameInMap("free_deposit")
    @Validation(required = true)
    public String freeDeposit;

    // 签约时间
    @NameInMap("sign_time")
    @Validation(required = true)
    public String signTime;

    // 租期起始时间
    @NameInMap("lease_start_time")
    @Validation(required = true)
    public String leaseStartTime;

    // 租期结束时间
    @NameInMap("lease_end_time")
    @Validation(required = true)
    public String leaseEndTime;

    // 买断金额计算公式
    @NameInMap("buyout_amount_formula_calc")
    @Validation(required = true)
    public String buyoutAmountFormulaCalc;

    // 首付款（单位元）
    @NameInMap("pay_in_advance")
    @Validation(required = true)
    public String payInAdvance;

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

}
