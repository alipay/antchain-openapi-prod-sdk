// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class CreateDubbridgeAlipayMerchantRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // request请求单号，每次请求唯一，如uuid
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 门店详情
    @NameInMap("store_info")
    @Validation(required = true)
    public StoreInfo storeInfo;

    public static CreateDubbridgeAlipayMerchantRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDubbridgeAlipayMerchantRequest self = new CreateDubbridgeAlipayMerchantRequest();
        return TeaModel.build(map, self);
    }

    public CreateDubbridgeAlipayMerchantRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateDubbridgeAlipayMerchantRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateDubbridgeAlipayMerchantRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public CreateDubbridgeAlipayMerchantRequest setStoreInfo(StoreInfo storeInfo) {
        this.storeInfo = storeInfo;
        return this;
    }
    public StoreInfo getStoreInfo() {
        return this.storeInfo;
    }

}
