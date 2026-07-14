// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energytool.models;

import com.aliyun.tea.*;

public class SimilarFeatureData extends TeaModel {
    // 时间点位
    /**
     * <strong>example:</strong>
     * <p>时间点位</p>
     */
    @NameInMap("period")
    @Validation(required = true)
    public String period;

    // 运行日日前电价
    /**
     * <strong>example:</strong>
     * <p>10.0</p>
     */
    @NameInMap("run_day_ahead_price")
    public String runDayAheadPrice;

    // 相似日日前电价
    /**
     * <strong>example:</strong>
     * <p>10.0</p>
     */
    @NameInMap("similar_day_ahead_price")
    public String similarDayAheadPrice;

    // 相似日实际电价
    /**
     * <strong>example:</strong>
     * <p>10.0</p>
     */
    @NameInMap("similar_realtime_price")
    public String similarRealtimePrice;

    // 运行日预出清数据值
    /**
     * <strong>example:</strong>
     * <p>10.0</p>
     */
    @NameInMap("run_preclearing_data")
    public String runPreclearingData;

    // 相似日预出清数据值
    /**
     * <strong>example:</strong>
     * <p>10.0</p>
     */
    @NameInMap("similar_preclearing_data")
    public String similarPreclearingData;

    // 相似日实际数据值
    /**
     * <strong>example:</strong>
     * <p>10.0</p>
     */
    @NameInMap("similar_realtime_data")
    public String similarRealtimeData;

    // 预出清数据偏差值, =运行日预出清数据值-相似日预出清数据值
    /**
     * <strong>example:</strong>
     * <p>0.0</p>
     */
    @NameInMap("deviation_data")
    public String deviationData;

    public static SimilarFeatureData build(java.util.Map<String, ?> map) throws Exception {
        SimilarFeatureData self = new SimilarFeatureData();
        return TeaModel.build(map, self);
    }

    public SimilarFeatureData setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public SimilarFeatureData setRunDayAheadPrice(String runDayAheadPrice) {
        this.runDayAheadPrice = runDayAheadPrice;
        return this;
    }
    public String getRunDayAheadPrice() {
        return this.runDayAheadPrice;
    }

    public SimilarFeatureData setSimilarDayAheadPrice(String similarDayAheadPrice) {
        this.similarDayAheadPrice = similarDayAheadPrice;
        return this;
    }
    public String getSimilarDayAheadPrice() {
        return this.similarDayAheadPrice;
    }

    public SimilarFeatureData setSimilarRealtimePrice(String similarRealtimePrice) {
        this.similarRealtimePrice = similarRealtimePrice;
        return this;
    }
    public String getSimilarRealtimePrice() {
        return this.similarRealtimePrice;
    }

    public SimilarFeatureData setRunPreclearingData(String runPreclearingData) {
        this.runPreclearingData = runPreclearingData;
        return this;
    }
    public String getRunPreclearingData() {
        return this.runPreclearingData;
    }

    public SimilarFeatureData setSimilarPreclearingData(String similarPreclearingData) {
        this.similarPreclearingData = similarPreclearingData;
        return this;
    }
    public String getSimilarPreclearingData() {
        return this.similarPreclearingData;
    }

    public SimilarFeatureData setSimilarRealtimeData(String similarRealtimeData) {
        this.similarRealtimeData = similarRealtimeData;
        return this;
    }
    public String getSimilarRealtimeData() {
        return this.similarRealtimeData;
    }

    public SimilarFeatureData setDeviationData(String deviationData) {
        this.deviationData = deviationData;
        return this;
    }
    public String getDeviationData() {
        return this.deviationData;
    }

}
