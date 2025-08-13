// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class TripView extends TeaModel {
    // 开始时间
    /**
     * <strong>example:</strong>
     * <p>2018-10-10T10:10:00Z</p>
     */
    @NameInMap("trip_begin_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String tripBeginTime;

    // 结束时间
    /**
     * <strong>example:</strong>
     * <p>2018-10-10T10:10:00Z</p>
     */
    @NameInMap("trip_end_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String tripEndTime;

    // 行驶公里数
    /**
     * <strong>example:</strong>
     * <p>22</p>
     */
    @NameInMap("trip_total_distance")
    @Validation(required = true)
    public Long tripTotalDistance;

    // 用时
    @NameInMap("trip_time")
    @Validation(required = true)
    public Long tripTime;

    public static TripView build(java.util.Map<String, ?> map) throws Exception {
        TripView self = new TripView();
        return TeaModel.build(map, self);
    }

    public TripView setTripBeginTime(String tripBeginTime) {
        this.tripBeginTime = tripBeginTime;
        return this;
    }
    public String getTripBeginTime() {
        return this.tripBeginTime;
    }

    public TripView setTripEndTime(String tripEndTime) {
        this.tripEndTime = tripEndTime;
        return this;
    }
    public String getTripEndTime() {
        return this.tripEndTime;
    }

    public TripView setTripTotalDistance(Long tripTotalDistance) {
        this.tripTotalDistance = tripTotalDistance;
        return this;
    }
    public Long getTripTotalDistance() {
        return this.tripTotalDistance;
    }

    public TripView setTripTime(Long tripTime) {
        this.tripTime = tripTime;
        return this;
    }
    public Long getTripTime() {
        return this.tripTime;
    }

}
