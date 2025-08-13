// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class GoodsIdAndCount extends TeaModel {
    // 商品id
    /**
     * <strong>example:</strong>
     * <p>23123131</p>
     */
    @NameInMap("goods_sku_id")
    @Validation(required = true)
    public Long goodsSkuId;

    // 商品采购数量
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("count")
    @Validation(required = true)
    public Long count;

    public static GoodsIdAndCount build(java.util.Map<String, ?> map) throws Exception {
        GoodsIdAndCount self = new GoodsIdAndCount();
        return TeaModel.build(map, self);
    }

    public GoodsIdAndCount setGoodsSkuId(Long goodsSkuId) {
        this.goodsSkuId = goodsSkuId;
        return this;
    }
    public Long getGoodsSkuId() {
        return this.goodsSkuId;
    }

    public GoodsIdAndCount setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

}
