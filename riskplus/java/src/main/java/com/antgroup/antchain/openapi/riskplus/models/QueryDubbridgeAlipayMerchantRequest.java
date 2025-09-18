// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeAlipayMerchantRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // request请求单号，每次请求唯一，如uuid
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 门店id
    @NameInMap("store_id")
    @Validation(required = true)
    public String storeId;

    // 入驻申请单号
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    public static QueryDubbridgeAlipayMerchantRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeAlipayMerchantRequest self = new QueryDubbridgeAlipayMerchantRequest();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeAlipayMerchantRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDubbridgeAlipayMerchantRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDubbridgeAlipayMerchantRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public QueryDubbridgeAlipayMerchantRequest setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

    public QueryDubbridgeAlipayMerchantRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}
