// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class TripDetail extends TeaModel {
    // 行程id
    /**
     * <strong>example:</strong>
     * <p>T20251210140000001</p>
     */
    @NameInMap("trip_id")
    @Validation(required = true)
    public String tripId;

    // 开始时间
    /**
     * <strong>example:</strong>
     * <p>1765794345159</p>
     */
    @NameInMap("start_time")
    @Validation(required = true)
    public Long startTime;

    // 结束时间
    /**
     * <strong>example:</strong>
     * <p>1765794345159</p>
     */
    @NameInMap("end_time")
    @Validation(required = true)
    public Long endTime;

    // 行驶里程
    /**
     * <strong>example:</strong>
     * <p>36.9</p>
     */
    @NameInMap("mileage")
    @Validation(required = true)
    public String mileage;

    // 单次用时
    /**
     * <strong>example:</strong>
     * <p>&quot;duration&quot;:{ &quot;value&quot;:&quot;79&quot;, &quot;unit&quot;:&quot;h&quot; },</p>
     */
    @NameInMap("duration")
    @Validation(required = true)
    public TripDuration duration;

    // 最高速度
    /**
     * <strong>example:</strong>
     * <p>86</p>
     */
    @NameInMap("max_speed")
    @Validation(required = true)
    public String maxSpeed;

    // 平均速度
    /**
     * <strong>example:</strong>
     * <p>32</p>
     */
    @NameInMap("avg_speed")
    @Validation(required = true)
    public String avgSpeed;

    // 开始地址
    /**
     * <strong>example:</strong>
     * <p>上海市浦东新区张江高科技园区博云路</p>
     */
    @NameInMap("first_address")
    @Validation(required = true)
    public String firstAddress;

    // 结束地址
    /**
     * <strong>example:</strong>
     * <p>上海市浦东新区张江高科技园区博云路</p>
     */
    @NameInMap("last_address")
    @Validation(required = true)
    public String lastAddress;

    // 最开始定位时间
    /**
     * <strong>example:</strong>
     * <p>1733841605000</p>
     */
    @NameInMap("first_location_time")
    @Validation(required = true)
    public Long firstLocationTime;

    // 最后结束定位时间
    /**
     * <strong>example:</strong>
     * <p>1733845195000</p>
     */
    @NameInMap("last_location_time")
    @Validation(required = true)
    public Long lastLocationTime;

    public static TripDetail build(java.util.Map<String, ?> map) throws Exception {
        TripDetail self = new TripDetail();
        return TeaModel.build(map, self);
    }

    public TripDetail setTripId(String tripId) {
        this.tripId = tripId;
        return this;
    }
    public String getTripId() {
        return this.tripId;
    }

    public TripDetail setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public TripDetail setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public TripDetail setMileage(String mileage) {
        this.mileage = mileage;
        return this;
    }
    public String getMileage() {
        return this.mileage;
    }

    public TripDetail setDuration(TripDuration duration) {
        this.duration = duration;
        return this;
    }
    public TripDuration getDuration() {
        return this.duration;
    }

    public TripDetail setMaxSpeed(String maxSpeed) {
        this.maxSpeed = maxSpeed;
        return this;
    }
    public String getMaxSpeed() {
        return this.maxSpeed;
    }

    public TripDetail setAvgSpeed(String avgSpeed) {
        this.avgSpeed = avgSpeed;
        return this;
    }
    public String getAvgSpeed() {
        return this.avgSpeed;
    }

    public TripDetail setFirstAddress(String firstAddress) {
        this.firstAddress = firstAddress;
        return this;
    }
    public String getFirstAddress() {
        return this.firstAddress;
    }

    public TripDetail setLastAddress(String lastAddress) {
        this.lastAddress = lastAddress;
        return this;
    }
    public String getLastAddress() {
        return this.lastAddress;
    }

    public TripDetail setFirstLocationTime(Long firstLocationTime) {
        this.firstLocationTime = firstLocationTime;
        return this;
    }
    public Long getFirstLocationTime() {
        return this.firstLocationTime;
    }

    public TripDetail setLastLocationTime(Long lastLocationTime) {
        this.lastLocationTime = lastLocationTime;
        return this;
    }
    public Long getLastLocationTime() {
        return this.lastLocationTime;
    }

}
