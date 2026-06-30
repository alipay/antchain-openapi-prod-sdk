// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytechpoi.models;

import com.aliyun.tea.*;

public class FreezeAntsecuritytechGatewayPoiMallpointRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 支付宝小程序用户唯一ID
    @NameInMap("open_id")
    @Validation(required = true)
    public String openId;

    // 门店ID
    @NameInMap("store_id")
    @Validation(required = true)
    public String storeId;

    // 账户ID
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // 收货信息
    @NameInMap("receiver_info")
    @Validation(required = true)
    public PoiMallPointReceiverInfo receiverInfo;

    // 订单信息列表
    @NameInMap("order_info_list")
    @Validation(required = true)
    public java.util.List<PoiMallPointOrderInfo> orderInfoList;

    // 扩展字段
    @NameInMap("extra_info")
    public String extraInfo;

    public static FreezeAntsecuritytechGatewayPoiMallpointRequest build(java.util.Map<String, ?> map) throws Exception {
        FreezeAntsecuritytechGatewayPoiMallpointRequest self = new FreezeAntsecuritytechGatewayPoiMallpointRequest();
        return TeaModel.build(map, self);
    }

    public FreezeAntsecuritytechGatewayPoiMallpointRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public FreezeAntsecuritytechGatewayPoiMallpointRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public FreezeAntsecuritytechGatewayPoiMallpointRequest setOpenId(String openId) {
        this.openId = openId;
        return this;
    }
    public String getOpenId() {
        return this.openId;
    }

    public FreezeAntsecuritytechGatewayPoiMallpointRequest setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

    public FreezeAntsecuritytechGatewayPoiMallpointRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public FreezeAntsecuritytechGatewayPoiMallpointRequest setReceiverInfo(PoiMallPointReceiverInfo receiverInfo) {
        this.receiverInfo = receiverInfo;
        return this;
    }
    public PoiMallPointReceiverInfo getReceiverInfo() {
        return this.receiverInfo;
    }

    public FreezeAntsecuritytechGatewayPoiMallpointRequest setOrderInfoList(java.util.List<PoiMallPointOrderInfo> orderInfoList) {
        this.orderInfoList = orderInfoList;
        return this;
    }
    public java.util.List<PoiMallPointOrderInfo> getOrderInfoList() {
        return this.orderInfoList;
    }

    public FreezeAntsecuritytechGatewayPoiMallpointRequest setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

}
