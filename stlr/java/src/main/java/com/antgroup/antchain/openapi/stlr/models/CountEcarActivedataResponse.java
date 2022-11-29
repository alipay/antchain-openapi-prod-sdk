// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class CountEcarActivedataResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 指定时间区间内的活动数据笔数
    @NameInMap("data_entry_count")
    public Long dataEntryCount;

    // 总碳排放量
    @NameInMap("total_emissions")
    public String totalEmissions;

    // 各活动数据用量累计
    @NameInMap("active_data_amount_list")
    public java.util.List<AnyStatisticalItem> activeDataAmountList;

    // 碳排放强度，碳排放总量/订单笔数，按字符串输出，最多保留6位小数
    @NameInMap("emissions_intensity")
    public String emissionsIntensity;

    // 每月排放量，排放量总计/指定时间区间内的月份数，按字符串输出，最多保留6位小数
    @NameInMap("each_month_emissions")
    public String eachMonthEmissions;

    // 额外统计数据统计结果
    @NameInMap("extra_statistic_datum_list")
    public java.util.List<AnyAmountItem> extraStatisticDatumList;

    public static CountEcarActivedataResponse build(java.util.Map<String, ?> map) throws Exception {
        CountEcarActivedataResponse self = new CountEcarActivedataResponse();
        return TeaModel.build(map, self);
    }

    public CountEcarActivedataResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CountEcarActivedataResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CountEcarActivedataResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CountEcarActivedataResponse setDataEntryCount(Long dataEntryCount) {
        this.dataEntryCount = dataEntryCount;
        return this;
    }
    public Long getDataEntryCount() {
        return this.dataEntryCount;
    }

    public CountEcarActivedataResponse setTotalEmissions(String totalEmissions) {
        this.totalEmissions = totalEmissions;
        return this;
    }
    public String getTotalEmissions() {
        return this.totalEmissions;
    }

    public CountEcarActivedataResponse setActiveDataAmountList(java.util.List<AnyStatisticalItem> activeDataAmountList) {
        this.activeDataAmountList = activeDataAmountList;
        return this;
    }
    public java.util.List<AnyStatisticalItem> getActiveDataAmountList() {
        return this.activeDataAmountList;
    }

    public CountEcarActivedataResponse setEmissionsIntensity(String emissionsIntensity) {
        this.emissionsIntensity = emissionsIntensity;
        return this;
    }
    public String getEmissionsIntensity() {
        return this.emissionsIntensity;
    }

    public CountEcarActivedataResponse setEachMonthEmissions(String eachMonthEmissions) {
        this.eachMonthEmissions = eachMonthEmissions;
        return this;
    }
    public String getEachMonthEmissions() {
        return this.eachMonthEmissions;
    }

    public CountEcarActivedataResponse setExtraStatisticDatumList(java.util.List<AnyAmountItem> extraStatisticDatumList) {
        this.extraStatisticDatumList = extraStatisticDatumList;
        return this;
    }
    public java.util.List<AnyAmountItem> getExtraStatisticDatumList() {
        return this.extraStatisticDatumList;
    }

}
