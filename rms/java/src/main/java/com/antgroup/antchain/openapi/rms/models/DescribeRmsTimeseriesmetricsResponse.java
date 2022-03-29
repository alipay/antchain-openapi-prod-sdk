// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class DescribeRmsTimeseriesmetricsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // metrics reulsts
    @NameInMap("results")
    public java.util.List<TimeSeriesMetrics> results;

    public static DescribeRmsTimeseriesmetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRmsTimeseriesmetricsResponse self = new DescribeRmsTimeseriesmetricsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRmsTimeseriesmetricsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public DescribeRmsTimeseriesmetricsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DescribeRmsTimeseriesmetricsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DescribeRmsTimeseriesmetricsResponse setResults(java.util.List<TimeSeriesMetrics> results) {
        this.results = results;
        return this;
    }
    public java.util.List<TimeSeriesMetrics> getResults() {
        return this.results;
    }

}
