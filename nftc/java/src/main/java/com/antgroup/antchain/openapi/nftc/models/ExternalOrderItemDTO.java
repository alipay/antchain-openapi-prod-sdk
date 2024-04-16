// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.nftc.models;

import com.aliyun.tea.*;

public class ExternalOrderItemDTO extends TeaModel {
    // 购买的sku id
    @NameInMap("sku_id")
    @Validation(required = true)
    public Long skuId;

    // 购买后对应发放的藏品nftId，仅当orderStatus为FINISH时返回
    @NameInMap("nft_id")
    @Validation(required = true)
    public String nftId;

    public static ExternalOrderItemDTO build(java.util.Map<String, ?> map) throws Exception {
        ExternalOrderItemDTO self = new ExternalOrderItemDTO();
        return TeaModel.build(map, self);
    }

    public ExternalOrderItemDTO setSkuId(Long skuId) {
        this.skuId = skuId;
        return this;
    }
    public Long getSkuId() {
        return this.skuId;
    }

    public ExternalOrderItemDTO setNftId(String nftId) {
        this.nftId = nftId;
        return this;
    }
    public String getNftId() {
        return this.nftId;
    }

}
