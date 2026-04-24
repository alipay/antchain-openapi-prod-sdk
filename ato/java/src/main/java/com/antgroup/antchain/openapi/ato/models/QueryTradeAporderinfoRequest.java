// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryTradeAporderinfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商户社会信用代码
    @NameInMap("merchant_id")
    @Validation(required = true)
    public String merchantId;

    // 资产包id
    @NameInMap("asset_packet_id")
    @Validation(required = true)
    public String assetPacketId;

    // 订单id
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    public static QueryTradeAporderinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTradeAporderinfoRequest self = new QueryTradeAporderinfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryTradeAporderinfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryTradeAporderinfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryTradeAporderinfoRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public QueryTradeAporderinfoRequest setAssetPacketId(String assetPacketId) {
        this.assetPacketId = assetPacketId;
        return this;
    }
    public String getAssetPacketId() {
        return this.assetPacketId;
    }

    public QueryTradeAporderinfoRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}
