// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ItemDto extends TeaModel {
    // 商品id
    /**
     * <strong>example:</strong>
     * <p>test id</p>
     */
    @NameInMap("product_id")
    @Validation(required = true)
    public String productId;

    // 商户id
    /**
     * <strong>example:</strong>
     * <p>test id</p>
     */
    @NameInMap("shop_id")
    @Validation(required = true)
    public String shopId;

    // 链上地址
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("tx_hash")
    @Validation(required = true)
    public String txHash;

    public static ItemDto build(java.util.Map<String, ?> map) throws Exception {
        ItemDto self = new ItemDto();
        return TeaModel.build(map, self);
    }

    public ItemDto setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public ItemDto setShopId(String shopId) {
        this.shopId = shopId;
        return this;
    }
    public String getShopId() {
        return this.shopId;
    }

    public ItemDto setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

}
