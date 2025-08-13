// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class TripStatistics extends TeaModel {
    // 行驶天数
    /**
     * <strong>example:</strong>
     * <p>2018-10-10T10:10:00Z</p>
     */
    @NameInMap("trip_day")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String tripDay;

    // 总里程
    /**
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("total_distance")
    @Validation(required = true)
    public Long totalDistance;

    // 总用时
    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("total_duration")
    @Validation(required = true)
    public Long totalDuration;

    // 行驶次数
    /**
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("trip_count")
    @Validation(required = true)
    public Long tripCount;

    public static TripStatistics build(java.util.Map<String, ?> map) throws Exception {
        TripStatistics self = new TripStatistics();
        return TeaModel.build(map, self);
    }

    public TripStatistics setTripDay(String tripDay) {
        this.tripDay = tripDay;
        return this;
    }
    public String getTripDay() {
        return this.tripDay;
    }

    public TripStatistics setTotalDistance(Long totalDistance) {
        this.totalDistance = totalDistance;
        return this;
    }
    public Long getTotalDistance() {
        return this.totalDistance;
    }

    public TripStatistics setTotalDuration(Long totalDuration) {
        this.totalDuration = totalDuration;
        return this;
    }
    public Long getTotalDuration() {
        return this.totalDuration;
    }

    public TripStatistics setTripCount(Long tripCount) {
        this.tripCount = tripCount;
        return this;
    }
    public Long getTripCount() {
        return this.tripCount;
    }

}
