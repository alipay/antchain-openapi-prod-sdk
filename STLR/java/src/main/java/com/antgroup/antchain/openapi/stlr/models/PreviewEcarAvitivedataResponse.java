// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class PreviewEcarAvitivedataResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 总排放量，最多保留6位小数
    @NameInMap("total_emissions")
    public String totalEmissions;

    // 核减减排量，最多保留6位小数
    @NameInMap("subtract_reductions")
    public String subtractReductions;

    // 净排放量，核减后的碳排放量
    @NameInMap("net_reductions")
    public String netReductions;

    // 年同比
    @NameInMap("year_compare_last_per")
    public String yearCompareLastPer;

    // 碳排放量单位
    @NameInMap("unit")
    public String unit;

    // 碳排放量单位显示标签
    @NameInMap("unit_label")
    public String unitLabel;

    // 各月份排放数据列表
    @NameInMap("list")
    public java.util.List<AnnualMonthEmissionDatum> list;

    public static PreviewEcarAvitivedataResponse build(java.util.Map<String, ?> map) throws Exception {
        PreviewEcarAvitivedataResponse self = new PreviewEcarAvitivedataResponse();
        return TeaModel.build(map, self);
    }

    public PreviewEcarAvitivedataResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PreviewEcarAvitivedataResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PreviewEcarAvitivedataResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PreviewEcarAvitivedataResponse setTotalEmissions(String totalEmissions) {
        this.totalEmissions = totalEmissions;
        return this;
    }
    public String getTotalEmissions() {
        return this.totalEmissions;
    }

    public PreviewEcarAvitivedataResponse setSubtractReductions(String subtractReductions) {
        this.subtractReductions = subtractReductions;
        return this;
    }
    public String getSubtractReductions() {
        return this.subtractReductions;
    }

    public PreviewEcarAvitivedataResponse setNetReductions(String netReductions) {
        this.netReductions = netReductions;
        return this;
    }
    public String getNetReductions() {
        return this.netReductions;
    }

    public PreviewEcarAvitivedataResponse setYearCompareLastPer(String yearCompareLastPer) {
        this.yearCompareLastPer = yearCompareLastPer;
        return this;
    }
    public String getYearCompareLastPer() {
        return this.yearCompareLastPer;
    }

    public PreviewEcarAvitivedataResponse setUnit(String unit) {
        this.unit = unit;
        return this;
    }
    public String getUnit() {
        return this.unit;
    }

    public PreviewEcarAvitivedataResponse setUnitLabel(String unitLabel) {
        this.unitLabel = unitLabel;
        return this;
    }
    public String getUnitLabel() {
        return this.unitLabel;
    }

    public PreviewEcarAvitivedataResponse setList(java.util.List<AnnualMonthEmissionDatum> list) {
        this.list = list;
        return this;
    }
    public java.util.List<AnnualMonthEmissionDatum> getList() {
        return this.list;
    }

}
