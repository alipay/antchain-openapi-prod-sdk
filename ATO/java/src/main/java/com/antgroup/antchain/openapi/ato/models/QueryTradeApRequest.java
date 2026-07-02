// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryTradeApRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商户社会引用代码
    @NameInMap("merchant_id")
    @Validation(required = true)
    public String merchantId;

    // 资产包id
    @NameInMap("asset_packet_id")
    @Validation(required = true)
    public String assetPacketId;

    public static QueryTradeApRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTradeApRequest self = new QueryTradeApRequest();
        return TeaModel.build(map, self);
    }

    public QueryTradeApRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryTradeApRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryTradeApRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public QueryTradeApRequest setAssetPacketId(String assetPacketId) {
        this.assetPacketId = assetPacketId;
        return this;
    }
    public String getAssetPacketId() {
        return this.assetPacketId;
    }

}
