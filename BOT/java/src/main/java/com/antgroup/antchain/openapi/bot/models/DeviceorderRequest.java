// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class DeviceorderRequest extends TeaModel {
    // 订单id
    /**
     * <strong>example:</strong>
     * <p>20034932</p>
     */
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 支付状态
    /**
     * <strong>example:</strong>
     * <p>PAID,UNPAID,PAYMENT_FAILED</p>
     */
    @NameInMap("order_status")
    @Validation(required = true)
    public String orderStatus;

    // 商家唯一id
    /**
     * <strong>example:</strong>
     * <p>30099234</p>
     */
    @NameInMap("merchant_id")
    @Validation(required = true)
    public String merchantId;

    // 设备订单元素集合
    @NameInMap("order_device_list")
    @Validation(required = true)
    public java.util.List<IotBasicDeviceOrderItem> orderDeviceList;

    // 订单总金额，精确到小数点后两位
    /**
     * <strong>example:</strong>
     * <p>22220.98</p>
     */
    @NameInMap("total_amount")
    @Validation(required = true)
    public String totalAmount;

    public static DeviceorderRequest build(java.util.Map<String, ?> map) throws Exception {
        DeviceorderRequest self = new DeviceorderRequest();
        return TeaModel.build(map, self);
    }

    public DeviceorderRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public DeviceorderRequest setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }
    public String getOrderStatus() {
        return this.orderStatus;
    }

    public DeviceorderRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public DeviceorderRequest setOrderDeviceList(java.util.List<IotBasicDeviceOrderItem> orderDeviceList) {
        this.orderDeviceList = orderDeviceList;
        return this;
    }
    public java.util.List<IotBasicDeviceOrderItem> getOrderDeviceList() {
        return this.orderDeviceList;
    }

    public DeviceorderRequest setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }
    public String getTotalAmount() {
        return this.totalAmount;
    }

}
