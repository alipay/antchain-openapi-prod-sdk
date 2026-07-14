// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energytool.models;

import com.aliyun.tea.*;

public class BiddingAnalysisData extends TeaModel {
    // 时间点位
    /**
     * <strong>example:</strong>
     * <p>01:00</p>
     */
    @NameInMap("period")
    @Validation(required = true)
    public String period;

    // 实时数据
    /**
     * <strong>example:</strong>
     * <p>10.0</p>
     */
    @NameInMap("realtime_data")
    public String realtimeData;

    // 日前数据
    /**
     * <strong>example:</strong>
     * <p>10.0</p>
     */
    @NameInMap("day_ahead_data")
    public String dayAheadData;

    // 预出清数据
    /**
     * <strong>example:</strong>
     * <p>10.0</p>
     */
    @NameInMap("preclearing_data")
    public String preclearingData;

    // 实际数据
    /**
     * <strong>example:</strong>
     * <p>10.0</p>
     */
    @NameInMap("actual_data")
    public String actualData;

    // 实时预测数据
    /**
     * <strong>example:</strong>
     * <p>10.0</p>
     */
    @NameInMap("realtime_prediction_data")
    public String realtimePredictionData;

    // 日前预测数据
    /**
     * <strong>example:</strong>
     * <p>10.0</p>
     */
    @NameInMap("day_ahead_prediction_data")
    public String dayAheadPredictionData;

    // 偏差值
    /**
     * <strong>example:</strong>
     * <p>10.0</p>
     */
    @NameInMap("deviation_data")
    public String deviationData;

    public static BiddingAnalysisData build(java.util.Map<String, ?> map) throws Exception {
        BiddingAnalysisData self = new BiddingAnalysisData();
        return TeaModel.build(map, self);
    }

    public BiddingAnalysisData setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public BiddingAnalysisData setRealtimeData(String realtimeData) {
        this.realtimeData = realtimeData;
        return this;
    }
    public String getRealtimeData() {
        return this.realtimeData;
    }

    public BiddingAnalysisData setDayAheadData(String dayAheadData) {
        this.dayAheadData = dayAheadData;
        return this;
    }
    public String getDayAheadData() {
        return this.dayAheadData;
    }

    public BiddingAnalysisData setPreclearingData(String preclearingData) {
        this.preclearingData = preclearingData;
        return this;
    }
    public String getPreclearingData() {
        return this.preclearingData;
    }

    public BiddingAnalysisData setActualData(String actualData) {
        this.actualData = actualData;
        return this;
    }
    public String getActualData() {
        return this.actualData;
    }

    public BiddingAnalysisData setRealtimePredictionData(String realtimePredictionData) {
        this.realtimePredictionData = realtimePredictionData;
        return this;
    }
    public String getRealtimePredictionData() {
        return this.realtimePredictionData;
    }

    public BiddingAnalysisData setDayAheadPredictionData(String dayAheadPredictionData) {
        this.dayAheadPredictionData = dayAheadPredictionData;
        return this;
    }
    public String getDayAheadPredictionData() {
        return this.dayAheadPredictionData;
    }

    public BiddingAnalysisData setDeviationData(String deviationData) {
        this.deviationData = deviationData;
        return this;
    }
    public String getDeviationData() {
        return this.deviationData;
    }

}
