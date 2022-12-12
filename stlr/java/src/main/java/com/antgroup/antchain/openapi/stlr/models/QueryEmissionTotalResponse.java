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
    public Long totalEmission;

    // 今日新增碳排放量
    @NameInMap("total_emission_today")
    public Long totalEmissionToday;

    // 累计减碳量
    @NameInMap("total_reduction")
    public Long totalReduction;

    // 今日减碳量
    @NameInMap("total_reduction_today")
    public Long totalReductionToday;

    // 累计抵消量
    @NameInMap("total_counteraction")
    public Long totalCounteraction;

    // 今日抵消量
    @NameInMap("total_counteraction_today")
    public Long totalCounteractionToday;

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

    public QueryEmissionTotalResponse setTotalEmission(Long totalEmission) {
        this.totalEmission = totalEmission;
        return this;
    }
    public Long getTotalEmission() {
        return this.totalEmission;
    }

    public QueryEmissionTotalResponse setTotalEmissionToday(Long totalEmissionToday) {
        this.totalEmissionToday = totalEmissionToday;
        return this;
    }
    public Long getTotalEmissionToday() {
        return this.totalEmissionToday;
    }

    public QueryEmissionTotalResponse setTotalReduction(Long totalReduction) {
        this.totalReduction = totalReduction;
        return this;
    }
    public Long getTotalReduction() {
        return this.totalReduction;
    }

    public QueryEmissionTotalResponse setTotalReductionToday(Long totalReductionToday) {
        this.totalReductionToday = totalReductionToday;
        return this;
    }
    public Long getTotalReductionToday() {
        return this.totalReductionToday;
    }

    public QueryEmissionTotalResponse setTotalCounteraction(Long totalCounteraction) {
        this.totalCounteraction = totalCounteraction;
        return this;
    }
    public Long getTotalCounteraction() {
        return this.totalCounteraction;
    }

    public QueryEmissionTotalResponse setTotalCounteractionToday(Long totalCounteractionToday) {
        this.totalCounteractionToday = totalCounteractionToday;
        return this;
    }
    public Long getTotalCounteractionToday() {
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
