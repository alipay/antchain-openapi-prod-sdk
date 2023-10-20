// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class QueryRiskGeneralResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 是否计费
    @NameInMap("meter")
    public Boolean meter;

    // 批量调用情况下的计费数量
    @NameInMap("meter_count")
    public Long meterCount;

    // 风险咨询结果的批量查询结果
    @NameInMap("result_list")
    public java.util.List<ResultList> resultList;

    // 拓展输出字段
    @NameInMap("ext_data")
    public String extData;

    public static QueryRiskGeneralResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRiskGeneralResponse self = new QueryRiskGeneralResponse();
        return TeaModel.build(map, self);
    }

    public QueryRiskGeneralResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryRiskGeneralResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRiskGeneralResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryRiskGeneralResponse setMeter(Boolean meter) {
        this.meter = meter;
        return this;
    }
    public Boolean getMeter() {
        return this.meter;
    }

    public QueryRiskGeneralResponse setMeterCount(Long meterCount) {
        this.meterCount = meterCount;
        return this;
    }
    public Long getMeterCount() {
        return this.meterCount;
    }

    public QueryRiskGeneralResponse setResultList(java.util.List<ResultList> resultList) {
        this.resultList = resultList;
        return this;
    }
    public java.util.List<ResultList> getResultList() {
        return this.resultList;
    }

    public QueryRiskGeneralResponse setExtData(String extData) {
        this.extData = extData;
        return this;
    }
    public String getExtData() {
        return this.extData;
    }

}
