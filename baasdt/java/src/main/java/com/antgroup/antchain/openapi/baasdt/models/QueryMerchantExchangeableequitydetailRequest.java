// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryMerchantExchangeableequitydetailRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链ID
    @NameInMap("chain_id")
    @Validation(required = true)
    public String chainId;

    // 商品SKUID
    @NameInMap("sku_id")
    @Validation(required = true)
    public String skuId;

    public static QueryMerchantExchangeableequitydetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMerchantExchangeableequitydetailRequest self = new QueryMerchantExchangeableequitydetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryMerchantExchangeableequitydetailRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryMerchantExchangeableequitydetailRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryMerchantExchangeableequitydetailRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public QueryMerchantExchangeableequitydetailRequest setSkuId(String skuId) {
        this.skuId = skuId;
        return this;
    }
    public String getSkuId() {
        return this.skuId;
    }

}
