// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class TripTraceView extends TeaModel {
    // 开始时间
    /**
     * <strong>example:</strong>
     * <p>2018-10-10T10:10:00Z</p>
     */
    @NameInMap("begin_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String beginTime;

    // 结束时间
    /**
     * <strong>example:</strong>
     * <p>2018-10-10T10:10:00Z</p>
     */
    @NameInMap("end_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String endTime;

    // 平均速度
    @NameInMap("avg_speed")
    @Validation(required = true)
    public Long avgSpeed;

    // 最大速度
    @NameInMap("max_speed")
    @Validation(required = true)
    public Long maxSpeed;

    // 最后定位时间
    /**
     * <strong>example:</strong>
     * <p>2018-10-10T10:10:00Z</p>
     */
    @NameInMap("last_location_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String lastLocationTime;

    // 最后定位地址
    /**
     * <strong>example:</strong>
     * <p>河南省郑州市</p>
     */
    @NameInMap("last_location")
    @Validation(required = true)
    public String lastLocation;

    public static TripTraceView build(java.util.Map<String, ?> map) throws Exception {
        TripTraceView self = new TripTraceView();
        return TeaModel.build(map, self);
    }

    public TripTraceView setBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public String getBeginTime() {
        return this.beginTime;
    }

    public TripTraceView setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public TripTraceView setAvgSpeed(Long avgSpeed) {
        this.avgSpeed = avgSpeed;
        return this;
    }
    public Long getAvgSpeed() {
        return this.avgSpeed;
    }

    public TripTraceView setMaxSpeed(Long maxSpeed) {
        this.maxSpeed = maxSpeed;
        return this;
    }
    public Long getMaxSpeed() {
        return this.maxSpeed;
    }

    public TripTraceView setLastLocationTime(String lastLocationTime) {
        this.lastLocationTime = lastLocationTime;
        return this;
    }
    public String getLastLocationTime() {
        return this.lastLocationTime;
    }

    public TripTraceView setLastLocation(String lastLocation) {
        this.lastLocation = lastLocation;
        return this;
    }
    public String getLastLocation() {
        return this.lastLocation;
    }

}
