// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class DescribeAcarDailyemissionsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 净排放量
    @NameInMap("net_emissions")
    public Long netEmissions;

    // 累计到当前时间的总碳排放量
    @NameInMap("total_emissions")
    public Long totalEmissions;

    // 排放量单位
    @NameInMap("unit")
    public String unit;

    //  当前计算完成时间
    @NameInMap("finish_timestamp")
    public String finishTimestamp;

    // 活动期间每日累计的总碳排放量
    @NameInMap("daily_emissions_list")
    public java.util.List<DailyEmissions> dailyEmissionsList;

    public static DescribeAcarDailyemissionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAcarDailyemissionsResponse self = new DescribeAcarDailyemissionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAcarDailyemissionsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public DescribeAcarDailyemissionsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DescribeAcarDailyemissionsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DescribeAcarDailyemissionsResponse setNetEmissions(Long netEmissions) {
        this.netEmissions = netEmissions;
        return this;
    }
    public Long getNetEmissions() {
        return this.netEmissions;
    }

    public DescribeAcarDailyemissionsResponse setTotalEmissions(Long totalEmissions) {
        this.totalEmissions = totalEmissions;
        return this;
    }
    public Long getTotalEmissions() {
        return this.totalEmissions;
    }

    public DescribeAcarDailyemissionsResponse setUnit(String unit) {
        this.unit = unit;
        return this;
    }
    public String getUnit() {
        return this.unit;
    }

    public DescribeAcarDailyemissionsResponse setFinishTimestamp(String finishTimestamp) {
        this.finishTimestamp = finishTimestamp;
        return this;
    }
    public String getFinishTimestamp() {
        return this.finishTimestamp;
    }

    public DescribeAcarDailyemissionsResponse setDailyEmissionsList(java.util.List<DailyEmissions> dailyEmissionsList) {
        this.dailyEmissionsList = dailyEmissionsList;
        return this;
    }
    public java.util.List<DailyEmissions> getDailyEmissionsList() {
        return this.dailyEmissionsList;
    }

}
