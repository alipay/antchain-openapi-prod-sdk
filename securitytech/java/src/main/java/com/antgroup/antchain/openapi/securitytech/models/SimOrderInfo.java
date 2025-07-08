// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class SimOrderInfo extends TeaModel {
    // 订单ID
    /**
     * <strong>example:</strong>
     * 
     */
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 必填	销售id
    /**
     * <strong>example:</strong>
     * 
     */
    @NameInMap("sales_id")
    @Validation(required = true)
    public String salesId;

    // 车辆SN号
    /**
     * <strong>example:</strong>
     * 
     */
    @NameInMap("sn")
    public String sn;

    // 用户手机号
    /**
     * <strong>example:</strong>
     * <p>17796897555</p>
     */
    @NameInMap("mobile_no")
    public String mobileNo;

    // 订单时间，格式yyyy-MM-dd HH:mm:ss
    /**
     * <strong>example:</strong>
     * <p>2025-01-01 00:00:00</p>
     */
    @NameInMap("order_time")
    @Validation(required = true)
    public String orderTime;

    // 支付类型，枚举值FULL（全额付款）, INSTALLMENT（分期付款）
    /**
     * <strong>example:</strong>
     * <p>FULL</p>
     */
    @NameInMap("payment_type")
    public String paymentType;

    // 支付时间，格式yyyy-MM-dd HH:mm:ss
    /**
     * <strong>example:</strong>
     * <p>2025-01-01 00:00:00</p>
     */
    @NameInMap("payment_time")
    public String paymentTime;

    // 总金额，单位元
    /**
     * <strong>example:</strong>
     * <p>1000.00</p>
     */
    @NameInMap("total_amount")
    public String totalAmount;

    // 订单状态，枚举值
    // UNPAID（未支付），
    // PAID（已支付），
    // CANCEL（订单取消），
    // PENDING（支付中），
    // FAILED（支付失败）
    /**
     * <strong>example:</strong>
     * <p>PAID</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 车辆SKU名字
    /**
     * <strong>example:</strong>
     * 
     */
    @NameInMap("sku_name")
    public String skuName;

    // 车型
    /**
     * <strong>example:</strong>
     * 
     */
    @NameInMap("vehicle_model")
    public String vehicleModel;

    // 颜色
    /**
     * <strong>example:</strong>
     * 
     */
    @NameInMap("color")
    public String color;

    // 配件信息，逗号分隔
    /**
     * <strong>example:</strong>
     * 
     */
    @NameInMap("accessories")
    public String accessories;

    // 图片json
    /**
     * <strong>example:</strong>
     * 
     */
    @NameInMap("images")
    public String images;

    // 拓展字段，json格式
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("extra_info")
    public String extraInfo;

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

    public SimOrderInfo setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
        return this;
    }
    public String getMobileNo() {
        return this.mobileNo;
    }

    public SimOrderInfo setOrderTime(String orderTime) {
        this.orderTime = orderTime;
        return this;
    }
    public String getOrderTime() {
        return this.orderTime;
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

    public SimOrderInfo setAccessories(String accessories) {
        this.accessories = accessories;
        return this;
    }
    public String getAccessories() {
        return this.accessories;
    }

    public SimOrderInfo setImages(String images) {
        this.images = images;
        return this;
    }
    public String getImages() {
        return this.images;
    }

    public SimOrderInfo setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

}
