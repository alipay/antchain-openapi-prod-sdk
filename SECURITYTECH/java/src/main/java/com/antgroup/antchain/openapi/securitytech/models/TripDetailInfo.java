// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class TripDetailInfo extends TeaModel {
    // 开始时间 时间戳
    /**
     * <strong>example:</strong>
     * 
     */
    @NameInMap("start_time")
    @Validation(required = true)
    public Long startTime;

    // 结束时间 时间戳
    /**
     * <strong>example:</strong>
     * 
     */
    @NameInMap("end_time")
    @Validation(required = true)
    public Long endTime;

    // 行程id
    /**
     * <strong>example:</strong>
     * 
     */
    @NameInMap("trip_id")
    @Validation(required = true)
    public String tripId;

    // 行驶里程
    /**
     * <strong>example:</strong>
     * 
     */
    @NameInMap("mileage")
    @Validation(required = true)
    public String mileage;

    // 时长
    /**
     * <strong>example:</strong>
     * 
     */
    @NameInMap("duration")
    @Validation(required = true)
    public DurationInfo duration;

    // 最高速度
    /**
     * <strong>example:</strong>
     * 
     */
    @NameInMap("max_speed")
    @Validation(required = true)
    public String maxSpeed;

    // 平均速度
    /**
     * <strong>example:</strong>
     * 
     */
    @NameInMap("avg_speed")
    @Validation(required = true)
    public String avgSpeed;

    // 开始地址
    /**
     * <strong>example:</strong>
     * 
     */
    @NameInMap("first_address")
    @Validation(required = true)
    public String firstAddress;

    // 结束地址
    /**
     * <strong>example:</strong>
     * 
     */
    @NameInMap("last_address")
    @Validation(required = true)
    public String lastAddress;

    // 开始定位时间 时间戳
    @NameInMap("first_location_time")
    @Validation(required = true)
    public Long firstLocationTime;

    // 最终定位时间 时间戳
    /**
     * <strong>example:</strong>
     * 
     */
    @NameInMap("last_location_time")
    @Validation(required = true)
    public Long lastLocationTime;

    public static TripDetailInfo build(java.util.Map<String, ?> map) throws Exception {
        TripDetailInfo self = new TripDetailInfo();
        return TeaModel.build(map, self);
    }

    public TripDetailInfo setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public TripDetailInfo setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public TripDetailInfo setTripId(String tripId) {
        this.tripId = tripId;
        return this;
    }
    public String getTripId() {
        return this.tripId;
    }

    public TripDetailInfo setMileage(String mileage) {
        this.mileage = mileage;
        return this;
    }
    public String getMileage() {
        return this.mileage;
    }

    public TripDetailInfo setDuration(DurationInfo duration) {
        this.duration = duration;
        return this;
    }
    public DurationInfo getDuration() {
        return this.duration;
    }

    public TripDetailInfo setMaxSpeed(String maxSpeed) {
        this.maxSpeed = maxSpeed;
        return this;
    }
    public String getMaxSpeed() {
        return this.maxSpeed;
    }

    public TripDetailInfo setAvgSpeed(String avgSpeed) {
        this.avgSpeed = avgSpeed;
        return this;
    }
    public String getAvgSpeed() {
        return this.avgSpeed;
    }

    public TripDetailInfo setFirstAddress(String firstAddress) {
        this.firstAddress = firstAddress;
        return this;
    }
    public String getFirstAddress() {
        return this.firstAddress;
    }

    public TripDetailInfo setLastAddress(String lastAddress) {
        this.lastAddress = lastAddress;
        return this;
    }
    public String getLastAddress() {
        return this.lastAddress;
    }

    public TripDetailInfo setFirstLocationTime(Long firstLocationTime) {
        this.firstLocationTime = firstLocationTime;
        return this;
    }
    public Long getFirstLocationTime() {
        return this.firstLocationTime;
    }

    public TripDetailInfo setLastLocationTime(Long lastLocationTime) {
        this.lastLocationTime = lastLocationTime;
        return this;
    }
    public Long getLastLocationTime() {
        return this.lastLocationTime;
    }

}
