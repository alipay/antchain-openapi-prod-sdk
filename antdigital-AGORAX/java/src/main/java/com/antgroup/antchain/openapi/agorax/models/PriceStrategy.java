// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.agorax.models;

import com.aliyun.tea.*;

public class PriceStrategy extends TeaModel {
    // 定价策略类型
    /**
     * <strong>example:</strong>
     * <p>FIXED</p>
     */
    @NameInMap("strategy_type")
    public String strategyType;

    // 策略值
    /**
     * <strong>example:</strong>
     * <p>110000199001011234</p>
     */
    @NameInMap("strategy_value")
    public String strategyValue;

    // 最小金额（单位：分）
    /**
     * <strong>example:</strong>
     * <p>6.22</p>
     */
    @NameInMap("min_price")
    public Long minPrice;

    // 最大金额（单位：分）
    /**
     * <strong>example:</strong>
     * <p>45.22</p>
     */
    @NameInMap("max_price")
    public Long maxPrice;

    // 门槛金额（单位：分）
    /**
     * <strong>example:</strong>
     * <p>21.55</p>
     */
    @NameInMap("threshold")
    public Long threshold;

    // 门槛类型
    /**
     * <strong>example:</strong>
     * <p>074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5</p>
     */
    @NameInMap("threshold_type")
    public String thresholdType;

    public static PriceStrategy build(java.util.Map<String, ?> map) throws Exception {
        PriceStrategy self = new PriceStrategy();
        return TeaModel.build(map, self);
    }

    public PriceStrategy setStrategyType(String strategyType) {
        this.strategyType = strategyType;
        return this;
    }
    public String getStrategyType() {
        return this.strategyType;
    }

    public PriceStrategy setStrategyValue(String strategyValue) {
        this.strategyValue = strategyValue;
        return this;
    }
    public String getStrategyValue() {
        return this.strategyValue;
    }

    public PriceStrategy setMinPrice(Long minPrice) {
        this.minPrice = minPrice;
        return this;
    }
    public Long getMinPrice() {
        return this.minPrice;
    }

    public PriceStrategy setMaxPrice(Long maxPrice) {
        this.maxPrice = maxPrice;
        return this;
    }
    public Long getMaxPrice() {
        return this.maxPrice;
    }

    public PriceStrategy setThreshold(Long threshold) {
        this.threshold = threshold;
        return this;
    }
    public Long getThreshold() {
        return this.threshold;
    }

    public PriceStrategy setThresholdType(String thresholdType) {
        this.thresholdType = thresholdType;
        return this;
    }
    public String getThresholdType() {
        return this.thresholdType;
    }

}
