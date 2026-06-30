// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytechpoi.models;

import com.aliyun.tea.*;

public class QueryAntsecuritytechGatewayPoiMallpointaccountRequest extends TeaModel {
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

    public static QueryAntsecuritytechGatewayPoiMallpointaccountRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntsecuritytechGatewayPoiMallpointaccountRequest self = new QueryAntsecuritytechGatewayPoiMallpointaccountRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntsecuritytechGatewayPoiMallpointaccountRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntsecuritytechGatewayPoiMallpointaccountRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntsecuritytechGatewayPoiMallpointaccountRequest setOpenId(String openId) {
        this.openId = openId;
        return this;
    }
    public String getOpenId() {
        return this.openId;
    }

    public QueryAntsecuritytechGatewayPoiMallpointaccountRequest setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

}
