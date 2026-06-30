// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class DayStatisticsInfo extends TeaModel {
    // 日期时间戳
    /**
     * <strong>example:</strong>
     * <p>1661788800000</p>
     */
    @NameInMap("date")
    @Validation(required = true)
    public Long date;

    // 日观看次数
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("day_views")
    @Validation(required = true)
    public String dayViews;

    // 日观看时长
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("day_view_duration")
    @Validation(required = true)
    public String dayViewDuration;

    // 日平均观看时长
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("day_average_view_duration")
    @Validation(required = true)
    public String dayAverageViewDuration;

    // 日预计收入
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("revenue")
    @Validation(required = true)
    public String revenue;

    public static DayStatisticsInfo build(java.util.Map<String, ?> map) throws Exception {
        DayStatisticsInfo self = new DayStatisticsInfo();
        return TeaModel.build(map, self);
    }

    public DayStatisticsInfo setDate(Long date) {
        this.date = date;
        return this;
    }
    public Long getDate() {
        return this.date;
    }

    public DayStatisticsInfo setDayViews(String dayViews) {
        this.dayViews = dayViews;
        return this;
    }
    public String getDayViews() {
        return this.dayViews;
    }

    public DayStatisticsInfo setDayViewDuration(String dayViewDuration) {
        this.dayViewDuration = dayViewDuration;
        return this;
    }
    public String getDayViewDuration() {
        return this.dayViewDuration;
    }

    public DayStatisticsInfo setDayAverageViewDuration(String dayAverageViewDuration) {
        this.dayAverageViewDuration = dayAverageViewDuration;
        return this;
    }
    public String getDayAverageViewDuration() {
        return this.dayAverageViewDuration;
    }

    public DayStatisticsInfo setRevenue(String revenue) {
        this.revenue = revenue;
        return this;
    }
    public String getRevenue() {
        return this.revenue;
    }

}
