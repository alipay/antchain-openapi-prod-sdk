// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ImportIotbasicDeviceorderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 所属业务
    @NameInMap("biz_scene")
    @Validation(required = true)
    public String bizScene;

    // 订单ID
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 订单状态: 已支付
    @NameInMap("order_status")
    @Validation(required = true)
    public String orderStatus;

    // 订单采购设备清单
    @NameInMap("order_device_list")
    @Validation(required = true)
    public java.util.List<IotBasicDeviceOrderItem> orderDeviceList;

    // 商家ID，唯一编号
    @NameInMap("merchant_id")
    public String merchantId;

    // 订单总金额，精确到小数后两位
    @NameInMap("total_amount")
    @Validation(required = true)
    public String totalAmount;

    public static ImportIotbasicDeviceorderRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportIotbasicDeviceorderRequest self = new ImportIotbasicDeviceorderRequest();
        return TeaModel.build(map, self);
    }

    public ImportIotbasicDeviceorderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ImportIotbasicDeviceorderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ImportIotbasicDeviceorderRequest setBizScene(String bizScene) {
        this.bizScene = bizScene;
        return this;
    }
    public String getBizScene() {
        return this.bizScene;
    }

    public ImportIotbasicDeviceorderRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ImportIotbasicDeviceorderRequest setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }
    public String getOrderStatus() {
        return this.orderStatus;
    }

    public ImportIotbasicDeviceorderRequest setOrderDeviceList(java.util.List<IotBasicDeviceOrderItem> orderDeviceList) {
        this.orderDeviceList = orderDeviceList;
        return this;
    }
    public java.util.List<IotBasicDeviceOrderItem> getOrderDeviceList() {
        return this.orderDeviceList;
    }

    public ImportIotbasicDeviceorderRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public ImportIotbasicDeviceorderRequest setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }
    public String getTotalAmount() {
        return this.totalAmount;
    }

}
