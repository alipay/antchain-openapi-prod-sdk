// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class OverseaContentStatistics extends TeaModel {
    // 发布视频id
    /**
     * <strong>example:</strong>
     * <p>84343147225530369</p>
     */
    @NameInMap("content_id")
    @Validation(required = true)
    public String contentId;

    // 总观看次数
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("total_views")
    @Validation(required = true)
    public String totalViews;

    // 总观看时长
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("total_view_duration")
    @Validation(required = true)
    public String totalViewDuration;

    // 总平均观看时长
    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("total_average_view_duration")
    @Validation(required = true)
    public String totalAverageViewDuration;

    // 总预计收入
    /**
     * <strong>example:</strong>
     * <p>40</p>
     */
    @NameInMap("total_revenue")
    @Validation(required = true)
    public String totalRevenue;

    // 每日详细统计列表
    @NameInMap("day_statistics_list")
    @Validation(required = true)
    public java.util.List<DayStatisticsInfo> dayStatisticsList;

    public static OverseaContentStatistics build(java.util.Map<String, ?> map) throws Exception {
        OverseaContentStatistics self = new OverseaContentStatistics();
        return TeaModel.build(map, self);
    }

    public OverseaContentStatistics setContentId(String contentId) {
        this.contentId = contentId;
        return this;
    }
    public String getContentId() {
        return this.contentId;
    }

    public OverseaContentStatistics setTotalViews(String totalViews) {
        this.totalViews = totalViews;
        return this;
    }
    public String getTotalViews() {
        return this.totalViews;
    }

    public OverseaContentStatistics setTotalViewDuration(String totalViewDuration) {
        this.totalViewDuration = totalViewDuration;
        return this;
    }
    public String getTotalViewDuration() {
        return this.totalViewDuration;
    }

    public OverseaContentStatistics setTotalAverageViewDuration(String totalAverageViewDuration) {
        this.totalAverageViewDuration = totalAverageViewDuration;
        return this;
    }
    public String getTotalAverageViewDuration() {
        return this.totalAverageViewDuration;
    }

    public OverseaContentStatistics setTotalRevenue(String totalRevenue) {
        this.totalRevenue = totalRevenue;
        return this;
    }
    public String getTotalRevenue() {
        return this.totalRevenue;
    }

    public OverseaContentStatistics setDayStatisticsList(java.util.List<DayStatisticsInfo> dayStatisticsList) {
        this.dayStatisticsList = dayStatisticsList;
        return this;
    }
    public java.util.List<DayStatisticsInfo> getDayStatisticsList() {
        return this.dayStatisticsList;
    }

}
