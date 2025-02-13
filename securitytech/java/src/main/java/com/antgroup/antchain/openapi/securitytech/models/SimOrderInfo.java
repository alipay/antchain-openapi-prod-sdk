// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class SimOrderInfo extends TeaModel {
    // 订单ID
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 必填	销售id
    @NameInMap("sales_id")
    @Validation(required = true)
    public String salesId;

    // 车辆SN号
    @NameInMap("sn")
    public String sn;

    // 支付类型，枚举值FULL（全额付款）, INSTALLMENT（分期付款）
    @NameInMap("payment_type")
    public String paymentType;

    // 支付时间，格式yyyy-MM-dd HH:mm:ss
    @NameInMap("payment_time")
    public String paymentTime;

    // 总金额，单位元
    @NameInMap("total_amount")
    public String totalAmount;

    // 订单状态，枚举值
    // UNPAID（未支付），
    // PAID（已支付），
    // CANCEL（订单取消），
    // PENDING（支付中），
    // FAILED（支付失败）
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 车辆SKU名字
    @NameInMap("sku_name")
    public String skuName;

    // 车型
    @NameInMap("vehicle_model")
    public String vehicleModel;

    // 颜色
    @NameInMap("color")
    public String color;

    public static SimOrderInfo build(java.util.Map<String, ?> map) throws Exception {
        SimOrderInfo self = new SimOrderInfo();
        return TeaModel.build(map, self);
    }

    public SimOrderInfo setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public SimOrderInfo setSalesId(String salesId) {
        this.salesId = salesId;
        return this;
    }
    public String getSalesId() {
        return this.salesId;
    }

    public SimOrderInfo setSn(String sn) {
        this.sn = sn;
        return this;
    }
    public String getSn() {
        return this.sn;
    }

    public SimOrderInfo setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public SimOrderInfo setPaymentTime(String paymentTime) {
        this.paymentTime = paymentTime;
        return this;
    }
    public String getPaymentTime() {
        return this.paymentTime;
    }

    public SimOrderInfo setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }
    public String getTotalAmount() {
        return this.totalAmount;
    }

    public SimOrderInfo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public SimOrderInfo setSkuName(String skuName) {
        this.skuName = skuName;
        return this;
    }
    public String getSkuName() {
        return this.skuName;
    }

    public SimOrderInfo setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
        return this;
    }
    public String getVehicleModel() {
        return this.vehicleModel;
    }

    public SimOrderInfo setColor(String color) {
        this.color = color;
        return this;
    }
    public String getColor() {
        return this.color;
    }

}
