// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energytool.models;

import com.aliyun.tea.*;

public class AheadRealtimePriceCompareData extends TeaModel {
    // 时间点位
    /**
     * <strong>example:</strong>
     * <p>01:00</p>
     */
    @NameInMap("period")
    @Validation(required = true)
    public String period;

    // 日前大于实时占比
    /**
     * <strong>example:</strong>
     * <p>10.0</p>
     */
    @NameInMap("realtime_rate")
    public String realtimeRate;

    // 日前等于实时占比
    /**
     * <strong>example:</strong>
     * <p>10.0</p>
     */
    @NameInMap("dayahead_rate")
    public String dayaheadRate;

    // 日前小于实时占比
    /**
     * <strong>example:</strong>
     * <p>10.0</p>
     */
    @NameInMap("equal_rate")
    public String equalRate;

    // 偏差值
    /**
     * <strong>example:</strong>
     * <p>10.0</p>
     */
    @NameInMap("deviation_data")
    public String deviationData;

    // 实时电价均值
    /**
     * <strong>example:</strong>
     * <p>10.0</p>
     */
    @NameInMap("realtime_avg")
    public String realtimeAvg;

    // 日前电价均值
    /**
     * <strong>example:</strong>
     * <p>10.0</p>
     */
    @NameInMap("day_ahead_avg")
    public String dayAheadAvg;

    // 偏差均值
    /**
     * <strong>example:</strong>
     * <p>10.0</p>
     */
    @NameInMap("deviation_avg")
    public String deviationAvg;

    // 差价数值
    /**
     * <strong>example:</strong>
     * <p>10.0</p>
     */
    @NameInMap("price_diff")
    public String priceDiff;

    // 价差均值
    /**
     * <strong>example:</strong>
     * <p>10.0</p>
     */
    @NameInMap("price_diff_avg")
    public String priceDiffAvg;

    public static AheadRealtimePriceCompareData build(java.util.Map<String, ?> map) throws Exception {
        AheadRealtimePriceCompareData self = new AheadRealtimePriceCompareData();
        return TeaModel.build(map, self);
    }

    public AheadRealtimePriceCompareData setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public AheadRealtimePriceCompareData setRealtimeRate(String realtimeRate) {
        this.realtimeRate = realtimeRate;
        return this;
    }
    public String getRealtimeRate() {
        return this.realtimeRate;
    }

    public AheadRealtimePriceCompareData setDayaheadRate(String dayaheadRate) {
        this.dayaheadRate = dayaheadRate;
        return this;
    }
    public String getDayaheadRate() {
        return this.dayaheadRate;
    }

    public AheadRealtimePriceCompareData setEqualRate(String equalRate) {
        this.equalRate = equalRate;
        return this;
    }
    public String getEqualRate() {
        return this.equalRate;
    }

    public AheadRealtimePriceCompareData setDeviationData(String deviationData) {
        this.deviationData = deviationData;
        return this;
    }
    public String getDeviationData() {
        return this.deviationData;
    }

    public AheadRealtimePriceCompareData setRealtimeAvg(String realtimeAvg) {
        this.realtimeAvg = realtimeAvg;
        return this;
    }
    public String getRealtimeAvg() {
        return this.realtimeAvg;
    }

    public AheadRealtimePriceCompareData setDayAheadAvg(String dayAheadAvg) {
        this.dayAheadAvg = dayAheadAvg;
        return this;
    }
    public String getDayAheadAvg() {
        return this.dayAheadAvg;
    }

    public AheadRealtimePriceCompareData setDeviationAvg(String deviationAvg) {
        this.deviationAvg = deviationAvg;
        return this;
    }
    public String getDeviationAvg() {
        return this.deviationAvg;
    }

    public AheadRealtimePriceCompareData setPriceDiff(String priceDiff) {
        this.priceDiff = priceDiff;
        return this;
    }
    public String getPriceDiff() {
        return this.priceDiff;
    }

    public AheadRealtimePriceCompareData setPriceDiffAvg(String priceDiffAvg) {
        this.priceDiffAvg = priceDiffAvg;
        return this;
    }
    public String getPriceDiffAvg() {
        return this.priceDiffAvg;
    }

}
