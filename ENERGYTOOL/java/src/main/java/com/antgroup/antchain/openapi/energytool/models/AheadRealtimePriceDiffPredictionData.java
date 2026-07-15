// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energytool.models;

import com.aliyun.tea.*;

public class AheadRealtimePriceDiffPredictionData extends TeaModel {
    // 时间点位
    /**
     * <strong>example:</strong>
     * <p>01:00</p>
     */
    @NameInMap("period")
    @Validation(required = true)
    public String period;

    // 实际价差方向
    /**
     * <strong>example:</strong>
     * <p>10.0</p>
     */
    @NameInMap("real_direction")
    public String realDirection;

    // 预测价差方向
    /**
     * <strong>example:</strong>
     * <p>10.0</p>
     */
    @NameInMap("pre_direction")
    public String preDirection;

    // 实际日前实时价差
    /**
     * <strong>example:</strong>
     * <p>10.0</p>
     */
    @NameInMap("real_day_ahead_diff")
    public String realDayAheadDiff;

    // 预测日前实时价差
    /**
     * <strong>example:</strong>
     * <p>10.0</p>
     */
    @NameInMap("pre_day_ahead_diff")
    public String preDayAheadDiff;

    public static AheadRealtimePriceDiffPredictionData build(java.util.Map<String, ?> map) throws Exception {
        AheadRealtimePriceDiffPredictionData self = new AheadRealtimePriceDiffPredictionData();
        return TeaModel.build(map, self);
    }

    public AheadRealtimePriceDiffPredictionData setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public AheadRealtimePriceDiffPredictionData setRealDirection(String realDirection) {
        this.realDirection = realDirection;
        return this;
    }
    public String getRealDirection() {
        return this.realDirection;
    }

    public AheadRealtimePriceDiffPredictionData setPreDirection(String preDirection) {
        this.preDirection = preDirection;
        return this;
    }
    public String getPreDirection() {
        return this.preDirection;
    }

    public AheadRealtimePriceDiffPredictionData setRealDayAheadDiff(String realDayAheadDiff) {
        this.realDayAheadDiff = realDayAheadDiff;
        return this;
    }
    public String getRealDayAheadDiff() {
        return this.realDayAheadDiff;
    }

    public AheadRealtimePriceDiffPredictionData setPreDayAheadDiff(String preDayAheadDiff) {
        this.preDayAheadDiff = preDayAheadDiff;
        return this;
    }
    public String getPreDayAheadDiff() {
        return this.preDayAheadDiff;
    }

}
