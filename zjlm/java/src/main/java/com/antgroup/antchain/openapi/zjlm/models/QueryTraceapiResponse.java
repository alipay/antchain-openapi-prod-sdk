// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.zjlm.models;

import com.aliyun.tea.*;

public class QueryTraceapiResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 成功数据
    @NameInMap("data")
    public java.util.List<QiaReportTraceResponse> data;

    public static QueryTraceapiResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTraceapiResponse self = new QueryTraceapiResponse();
        return TeaModel.build(map, self);
    }

    public QueryTraceapiResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryTraceapiResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTraceapiResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryTraceapiResponse setData(java.util.List<QiaReportTraceResponse> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QiaReportTraceResponse> getData() {
        return this.data;
    }

}
