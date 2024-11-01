// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.asset.models;

import com.aliyun.tea.*;

public class QueryStatisticsConversionmetricsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 统计过程转化指标结果
    @NameInMap("data")
    public ProcessConversionMetricData data;

    public static QueryStatisticsConversionmetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryStatisticsConversionmetricsResponse self = new QueryStatisticsConversionmetricsResponse();
        return TeaModel.build(map, self);
    }

    public QueryStatisticsConversionmetricsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryStatisticsConversionmetricsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryStatisticsConversionmetricsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryStatisticsConversionmetricsResponse setData(ProcessConversionMetricData data) {
        this.data = data;
        return this;
    }
    public ProcessConversionMetricData getData() {
        return this.data;
    }

}
