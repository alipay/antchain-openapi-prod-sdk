// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class QueryEmissionTotalResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 累计排放量
    @NameInMap("total_emission")
    public String totalEmission;

    // 今日新增碳排放量
    @NameInMap("total_emission_today")
    public String totalEmissionToday;

    // 累计减碳量
    @NameInMap("total_reduction")
    public String totalReduction;

    // 今日减碳量
    @NameInMap("total_reduction_today")
    public String totalReductionToday;

    // 累计抵消量
    @NameInMap("total_counteraction")
    public String totalCounteraction;

    // 今日抵消量
    @NameInMap("total_counteraction_today")
    public String totalCounteractionToday;

    // 排放数据单位
    @NameInMap("data_unit")
    public String dataUnit;

    public static QueryEmissionTotalResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEmissionTotalResponse self = new QueryEmissionTotalResponse();
        return TeaModel.build(map, self);
    }

    public QueryEmissionTotalResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryEmissionTotalResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryEmissionTotalResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryEmissionTotalResponse setTotalEmission(String totalEmission) {
        this.totalEmission = totalEmission;
        return this;
    }
    public String getTotalEmission() {
        return this.totalEmission;
    }

    public QueryEmissionTotalResponse setTotalEmissionToday(String totalEmissionToday) {
        this.totalEmissionToday = totalEmissionToday;
        return this;
    }
    public String getTotalEmissionToday() {
        return this.totalEmissionToday;
    }

    public QueryEmissionTotalResponse setTotalReduction(String totalReduction) {
        this.totalReduction = totalReduction;
        return this;
    }
    public String getTotalReduction() {
        return this.totalReduction;
    }

    public QueryEmissionTotalResponse setTotalReductionToday(String totalReductionToday) {
        this.totalReductionToday = totalReductionToday;
        return this;
    }
    public String getTotalReductionToday() {
        return this.totalReductionToday;
    }

    public QueryEmissionTotalResponse setTotalCounteraction(String totalCounteraction) {
        this.totalCounteraction = totalCounteraction;
        return this;
    }
    public String getTotalCounteraction() {
        return this.totalCounteraction;
    }

    public QueryEmissionTotalResponse setTotalCounteractionToday(String totalCounteractionToday) {
        this.totalCounteractionToday = totalCounteractionToday;
        return this;
    }
    public String getTotalCounteractionToday() {
        return this.totalCounteractionToday;
    }

    public QueryEmissionTotalResponse setDataUnit(String dataUnit) {
        this.dataUnit = dataUnit;
        return this;
    }
    public String getDataUnit() {
        return this.dataUnit;
    }

}
