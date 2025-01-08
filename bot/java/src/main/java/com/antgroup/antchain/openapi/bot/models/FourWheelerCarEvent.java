// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class FourWheelerCarEvent extends TeaModel {
    // 驾驶事件的类型，如正常驾驶、碰撞、急转弯、启动熄火等。
    @NameInMap("event_type")
    @Validation(required = true)
    public String eventType;

    // 驾驶事件的结束时间
    @NameInMap("end_time")
    @Validation(required = true)
    public Long endTime;

    // 驾驶事件发生地点的经度坐标
    @NameInMap("lng")
    @Validation(required = true)
    public String lng;

    // 驾驶事件发生地点的纬度坐标
    @NameInMap("lat")
    @Validation(required = true)
    public String lat;

    // 驾驶事件开始的速度
    @NameInMap("start_speed")
    public String startSpeed;

    // 驾驶事件结束时的速度
    @NameInMap("end_speed")
    public String endSpeed;

    // 驾驶过程中的平均速度
    @NameInMap("average_speed")
    public String averageSpeed;

    // 驾驶过程中车辆的转弯角度
    @NameInMap("turning_angle")
    public String turningAngle;

    // 驾驶事件的持续时间（以秒为单位)
    @NameInMap("duration")
    public String duration;

    public static FourWheelerCarEvent build(java.util.Map<String, ?> map) throws Exception {
        FourWheelerCarEvent self = new FourWheelerCarEvent();
        return TeaModel.build(map, self);
    }

    public FourWheelerCarEvent setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public FourWheelerCarEvent setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public FourWheelerCarEvent setLng(String lng) {
        this.lng = lng;
        return this;
    }
    public String getLng() {
        return this.lng;
    }

    public FourWheelerCarEvent setLat(String lat) {
        this.lat = lat;
        return this;
    }
    public String getLat() {
        return this.lat;
    }

    public FourWheelerCarEvent setStartSpeed(String startSpeed) {
        this.startSpeed = startSpeed;
        return this;
    }
    public String getStartSpeed() {
        return this.startSpeed;
    }

    public FourWheelerCarEvent setEndSpeed(String endSpeed) {
        this.endSpeed = endSpeed;
        return this;
    }
    public String getEndSpeed() {
        return this.endSpeed;
    }

    public FourWheelerCarEvent setAverageSpeed(String averageSpeed) {
        this.averageSpeed = averageSpeed;
        return this;
    }
    public String getAverageSpeed() {
        return this.averageSpeed;
    }

    public FourWheelerCarEvent setTurningAngle(String turningAngle) {
        this.turningAngle = turningAngle;
        return this;
    }
    public String getTurningAngle() {
        return this.turningAngle;
    }

    public FourWheelerCarEvent setDuration(String duration) {
        this.duration = duration;
        return this;
    }
    public String getDuration() {
        return this.duration;
    }

}
