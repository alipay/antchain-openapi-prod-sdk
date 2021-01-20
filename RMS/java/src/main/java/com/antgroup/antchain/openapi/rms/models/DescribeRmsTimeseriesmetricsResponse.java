// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class DescribeRmsTimeseriesmetricsResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

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
