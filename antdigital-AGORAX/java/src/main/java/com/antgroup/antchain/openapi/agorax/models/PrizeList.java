// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.agorax.models;

import com.aliyun.tea.*;

public class PrizeList extends TeaModel {
    // 对客展示信息
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("display_info")
    public DisplayInfo displayInfo;

    // 定价策略
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("price_strategy")
    public PriceStrategy priceStrategy;

    // 奖品基本信息
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("prize_base_info")
    public PrizeBaseInfo prizeBaseInfo;

    public static PrizeList build(java.util.Map<String, ?> map) throws Exception {
        PrizeList self = new PrizeList();
        return TeaModel.build(map, self);
    }

    public PrizeList setDisplayInfo(DisplayInfo displayInfo) {
        this.displayInfo = displayInfo;
        return this;
    }
    public DisplayInfo getDisplayInfo() {
        return this.displayInfo;
    }

    public PrizeList setPriceStrategy(PriceStrategy priceStrategy) {
        this.priceStrategy = priceStrategy;
        return this;
    }
    public PriceStrategy getPriceStrategy() {
        return this.priceStrategy;
    }

    public PrizeList setPrizeBaseInfo(PrizeBaseInfo prizeBaseInfo) {
        this.prizeBaseInfo = prizeBaseInfo;
        return this;
    }
    public PrizeBaseInfo getPrizeBaseInfo() {
        return this.prizeBaseInfo;
    }

}
