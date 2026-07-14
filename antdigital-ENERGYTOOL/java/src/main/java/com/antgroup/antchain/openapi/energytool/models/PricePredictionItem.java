// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energytool.models;

import com.aliyun.tea.*;

public class PricePredictionItem extends TeaModel {
    // 时间点位
    /**
     * <strong>example:</strong>
     * <p>01:00</p>
     */
    @NameInMap("period")
    @Validation(required = true)
    public String period;

    // 预测电价，单位：元/mwh
    /**
     * <strong>example:</strong>
     * <p>0.7</p>
     */
    @NameInMap("predicted_price")
    @Validation(required = true)
    public String predictedPrice;

    // 实际电价，单位：元/mwh
    /**
     * <strong>example:</strong>
     * <p>10.0</p>
     */
    @NameInMap("actual_price")
    public String actualPrice;

    public static PricePredictionItem build(java.util.Map<String, ?> map) throws Exception {
        PricePredictionItem self = new PricePredictionItem();
        return TeaModel.build(map, self);
    }

    public PricePredictionItem setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public PricePredictionItem setPredictedPrice(String predictedPrice) {
        this.predictedPrice = predictedPrice;
        return this;
    }
    public String getPredictedPrice() {
        return this.predictedPrice;
    }

    public PricePredictionItem setActualPrice(String actualPrice) {
        this.actualPrice = actualPrice;
        return this;
    }
    public String getActualPrice() {
        return this.actualPrice;
    }

}
