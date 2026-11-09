// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.sds.models;

import com.aliyun.tea.*;

public class CutToMessage extends TeaModel {
    // 【可用优惠的商品最高单价】 可用优惠的商品最高单价，单位：分。
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("single_price_max")
    @Validation(required = true)
    public Long singlePriceMax;

    // 【减至后的优惠单价】 减至后的优惠单价，单位：分。
    /**
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("cut_to_price")
    @Validation(required = true)
    public Long cutToPrice;

    public static CutToMessage build(java.util.Map<String, ?> map) throws Exception {
        CutToMessage self = new CutToMessage();
        return TeaModel.build(map, self);
    }

    public CutToMessage setSinglePriceMax(Long singlePriceMax) {
        this.singlePriceMax = singlePriceMax;
        return this;
    }
    public Long getSinglePriceMax() {
        return this.singlePriceMax;
    }

    public CutToMessage setCutToPrice(Long cutToPrice) {
        this.cutToPrice = cutToPrice;
        return this;
    }
    public Long getCutToPrice() {
        return this.cutToPrice;
    }

}
