// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class TripInfo extends TeaModel {
    // tripList
    /**
     * <strong>example:</strong>
     * <p>METL202004041220123456</p>
     */
    @NameInMap("trip_id")
    @Validation(required = true)
    public String tripId;

    // 开始时间
    /**
     * <strong>example:</strong>
     * <p>2000-10-10 00:00:00</p>
     */
    @NameInMap("start_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String startTime;

    // 结束时间
    /**
     * <strong>example:</strong>
     * <p>2000-10-10 00:00:00</p>
     */
    @NameInMap("end_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String endTime;

    // 起点位置
    /**
     * <strong>example:</strong>
     * <p>7FA1316252F6DDA22176ED13DBA4EF65</p>
     */
    @NameInMap("start_location")
    public String startLocation;

    // 终点位置
    /**
     * <strong>example:</strong>
     * <p>7FA1316252F6DDA22176ED13DBA4EF65</p>
     */
    @NameInMap("end_location")
    public String endLocation;

    // 行驶里程（km）
    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("mileage")
    public String mileage;

    public static TripInfo build(java.util.Map<String, ?> map) throws Exception {
        TripInfo self = new TripInfo();
        return TeaModel.build(map, self);
    }

    public TripInfo setTripId(String tripId) {
        this.tripId = tripId;
        return this;
    }
    public String getTripId() {
        return this.tripId;
    }

    public TripInfo setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public TripInfo setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public TripInfo setStartLocation(String startLocation) {
        this.startLocation = startLocation;
        return this;
    }
    public String getStartLocation() {
        return this.startLocation;
    }

    public TripInfo setEndLocation(String endLocation) {
        this.endLocation = endLocation;
        return this;
    }
    public String getEndLocation() {
        return this.endLocation;
    }

    public TripInfo setMileage(String mileage) {
        this.mileage = mileage;
        return this;
    }
    public String getMileage() {
        return this.mileage;
    }

}
