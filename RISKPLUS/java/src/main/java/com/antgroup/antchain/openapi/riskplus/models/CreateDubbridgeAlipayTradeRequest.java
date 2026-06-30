// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class CreateDubbridgeAlipayTradeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // request请求单号，每次请求唯一，如uuid
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 门店所属子品牌
    @NameInMap("traffic_platform")
    @Validation(required = true)
    public String trafficPlatform;

    // 订单归属门店id
    @NameInMap("store_id")
    @Validation(required = true)
    public String storeId;

    // 订单车辆信息
    @NameInMap("vehicle_info")
    @Validation(required = true)
    public VehicleInfo vehicleInfo;

    // 订单绝对超时时间 yyyy-MM-dd HH:mm:ss，支付宝结算生成订单二维码时传值（非必填，优先于 timeout_express)
    @NameInMap("time_expire")
    public String timeExpire;

    // 订单相对超时时间，从预下单请求时间开始计算，该笔订单允许的最晚付款时间，逾期将关闭交易（非必填）
    @NameInMap("timeout_express")
    public String timeoutExpress;

    public static CreateDubbridgeAlipayTradeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDubbridgeAlipayTradeRequest self = new CreateDubbridgeAlipayTradeRequest();
        return TeaModel.build(map, self);
    }

    public CreateDubbridgeAlipayTradeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateDubbridgeAlipayTradeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateDubbridgeAlipayTradeRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public CreateDubbridgeAlipayTradeRequest setTrafficPlatform(String trafficPlatform) {
        this.trafficPlatform = trafficPlatform;
        return this;
    }
    public String getTrafficPlatform() {
        return this.trafficPlatform;
    }

    public CreateDubbridgeAlipayTradeRequest setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

    public CreateDubbridgeAlipayTradeRequest setVehicleInfo(VehicleInfo vehicleInfo) {
        this.vehicleInfo = vehicleInfo;
        return this;
    }
    public VehicleInfo getVehicleInfo() {
        return this.vehicleInfo;
    }

    public CreateDubbridgeAlipayTradeRequest setTimeExpire(String timeExpire) {
        this.timeExpire = timeExpire;
        return this;
    }
    public String getTimeExpire() {
        return this.timeExpire;
    }

    public CreateDubbridgeAlipayTradeRequest setTimeoutExpress(String timeoutExpress) {
        this.timeoutExpress = timeoutExpress;
        return this;
    }
    public String getTimeoutExpress() {
        return this.timeoutExpress;
    }

}
