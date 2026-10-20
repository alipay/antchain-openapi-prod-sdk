// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class QueryHealthDataResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 健康指标数据列表
    @NameInMap("metric_list")
    public java.util.List<MetricItemInfo> metricList;

    public static QueryHealthDataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHealthDataResponse self = new QueryHealthDataResponse();
        return TeaModel.build(map, self);
    }

    public QueryHealthDataResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryHealthDataResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryHealthDataResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryHealthDataResponse setMetricList(java.util.List<MetricItemInfo> metricList) {
        this.metricList = metricList;
        return this;
    }
    public java.util.List<MetricItemInfo> getMetricList() {
        return this.metricList;
    }

}
