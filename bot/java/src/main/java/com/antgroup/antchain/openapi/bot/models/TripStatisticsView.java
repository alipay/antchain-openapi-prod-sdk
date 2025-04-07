// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class TripStatisticsView extends TeaModel {
    // 过去七天内所有行驶记录的总里程	，单位km
    @NameInMap("total_distance")
    @Validation(required = true)
    public String totalDistance;

    // 行驶总用时
    @NameInMap("total_duration")
    @Validation(required = true)
    public String totalDuration;

    // 骑行次数
    @NameInMap("trip_count")
    @Validation(required = true)
    public String tripCount;

    // 最近一次行驶的里程
    @NameInMap("last_trip_distance")
    @Validation(required = true)
    public String lastTripDistance;

    // 最近一次行驶的平均速度	，单位  km/h
    @NameInMap("last_trip_avg_speed")
    @Validation(required = true)
    public String lastTripAvgSpeed;

    // 最近一次行驶的最大速度	
    @NameInMap("last_trip_max_speed")
    @Validation(required = true)
    public String lastTripMaxSpeed;

    // 最后一次行驶用时
    @NameInMap("last_trip_spend_time")
    @Validation(required = true)
    public String lastTripSpendTime;

    public static TripStatisticsView build(java.util.Map<String, ?> map) throws Exception {
        TripStatisticsView self = new TripStatisticsView();
        return TeaModel.build(map, self);
    }

    public TripStatisticsView setTotalDistance(String totalDistance) {
        this.totalDistance = totalDistance;
        return this;
    }
    public String getTotalDistance() {
        return this.totalDistance;
    }

    public TripStatisticsView setTotalDuration(String totalDuration) {
        this.totalDuration = totalDuration;
        return this;
    }
    public String getTotalDuration() {
        return this.totalDuration;
    }

    public TripStatisticsView setTripCount(String tripCount) {
        this.tripCount = tripCount;
        return this;
    }
    public String getTripCount() {
        return this.tripCount;
    }

    public TripStatisticsView setLastTripDistance(String lastTripDistance) {
        this.lastTripDistance = lastTripDistance;
        return this;
    }
    public String getLastTripDistance() {
        return this.lastTripDistance;
    }

    public TripStatisticsView setLastTripAvgSpeed(String lastTripAvgSpeed) {
        this.lastTripAvgSpeed = lastTripAvgSpeed;
        return this;
    }
    public String getLastTripAvgSpeed() {
        return this.lastTripAvgSpeed;
    }

    public TripStatisticsView setLastTripMaxSpeed(String lastTripMaxSpeed) {
        this.lastTripMaxSpeed = lastTripMaxSpeed;
        return this;
    }
    public String getLastTripMaxSpeed() {
        return this.lastTripMaxSpeed;
    }

    public TripStatisticsView setLastTripSpendTime(String lastTripSpendTime) {
        this.lastTripSpendTime = lastTripSpendTime;
        return this;
    }
    public String getLastTripSpendTime() {
        return this.lastTripSpendTime;
    }

}
