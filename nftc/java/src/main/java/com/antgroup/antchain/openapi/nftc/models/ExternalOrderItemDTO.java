// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.nftc.models;

import com.aliyun.tea.*;

public class ExternalOrderItemDTO extends TeaModel {
    // 购买的sku id
    @NameInMap("sku_id")
    @Validation(required = true)
    public String skuId;

    public static ExternalOrderItemDTO build(java.util.Map<String, ?> map) throws Exception {
        ExternalOrderItemDTO self = new ExternalOrderItemDTO();
        return TeaModel.build(map, self);
    }

    public ExternalOrderItemDTO setSkuId(String skuId) {
        this.skuId = skuId;
        return this;
    }
    public String getSkuId() {
        return this.skuId;
    }

}
