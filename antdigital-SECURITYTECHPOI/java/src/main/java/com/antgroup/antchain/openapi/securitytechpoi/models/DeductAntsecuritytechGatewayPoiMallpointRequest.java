// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytechpoi.models;

import com.aliyun.tea.*;

public class DeductAntsecuritytechGatewayPoiMallpointRequest extends TeaModel {
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

    // 订单号列表
    @NameInMap("order_id_list")
    @Validation(required = true)
    public java.util.List<String> orderIdList;

    public static DeductAntsecuritytechGatewayPoiMallpointRequest build(java.util.Map<String, ?> map) throws Exception {
        DeductAntsecuritytechGatewayPoiMallpointRequest self = new DeductAntsecuritytechGatewayPoiMallpointRequest();
        return TeaModel.build(map, self);
    }

    public DeductAntsecuritytechGatewayPoiMallpointRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeductAntsecuritytechGatewayPoiMallpointRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeductAntsecuritytechGatewayPoiMallpointRequest setOpenId(String openId) {
        this.openId = openId;
        return this;
    }
    public String getOpenId() {
        return this.openId;
    }

    public DeductAntsecuritytechGatewayPoiMallpointRequest setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

    public DeductAntsecuritytechGatewayPoiMallpointRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public DeductAntsecuritytechGatewayPoiMallpointRequest setOrderIdList(java.util.List<String> orderIdList) {
        this.orderIdList = orderIdList;
        return this;
    }
    public java.util.List<String> getOrderIdList() {
        return this.orderIdList;
    }

}
