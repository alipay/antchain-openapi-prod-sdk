// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class QueryContentStatisticsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 总观看次数
    @NameInMap("total_views")
    public String totalViews;

    // 总观看时长
    @NameInMap("total_view_duration")
    public String totalViewDuration;

    // 总平均观看时长
    @NameInMap("total_average_view_duration")
    public java.util.List<String> totalAverageViewDuration;

    //  总预计收入
    @NameInMap("total_revenue")
    public String totalRevenue;

    // 每日详细统计列表
    @NameInMap("day_statistics_list")
    public java.util.List<DayStatisticsInfo> dayStatisticsList;

    public static QueryContentStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryContentStatisticsResponse self = new QueryContentStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public QueryContentStatisticsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryContentStatisticsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryContentStatisticsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryContentStatisticsResponse setTotalViews(String totalViews) {
        this.totalViews = totalViews;
        return this;
    }
    public String getTotalViews() {
        return this.totalViews;
    }

    public QueryContentStatisticsResponse setTotalViewDuration(String totalViewDuration) {
        this.totalViewDuration = totalViewDuration;
        return this;
    }
    public String getTotalViewDuration() {
        return this.totalViewDuration;
    }

    public QueryContentStatisticsResponse setTotalAverageViewDuration(java.util.List<String> totalAverageViewDuration) {
        this.totalAverageViewDuration = totalAverageViewDuration;
        return this;
    }
    public java.util.List<String> getTotalAverageViewDuration() {
        return this.totalAverageViewDuration;
    }

    public QueryContentStatisticsResponse setTotalRevenue(String totalRevenue) {
        this.totalRevenue = totalRevenue;
        return this;
    }
    public String getTotalRevenue() {
        return this.totalRevenue;
    }

    public QueryContentStatisticsResponse setDayStatisticsList(java.util.List<DayStatisticsInfo> dayStatisticsList) {
        this.dayStatisticsList = dayStatisticsList;
        return this;
    }
    public java.util.List<DayStatisticsInfo> getDayStatisticsList() {
        return this.dayStatisticsList;
    }

}
