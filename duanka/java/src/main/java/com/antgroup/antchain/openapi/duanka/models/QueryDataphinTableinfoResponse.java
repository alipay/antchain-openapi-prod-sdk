// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.duanka.models;

import com.aliyun.tea.*;

public class QueryDataphinTableinfoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // requestId
    @NameInMap("request_id")
    public String requestId;

    // code
    @NameInMap("code")
    public String code;

    // message
    @NameInMap("message")
    public String message;

    // traceId
    @NameInMap("trace_id")
    public String traceId;

    // data
    @NameInMap("data")
    public BaseResult data;

    public static QueryDataphinTableinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDataphinTableinfoResponse self = new QueryDataphinTableinfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryDataphinTableinfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDataphinTableinfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDataphinTableinfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDataphinTableinfoResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDataphinTableinfoResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDataphinTableinfoResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryDataphinTableinfoResponse setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public QueryDataphinTableinfoResponse setData(BaseResult data) {
        this.data = data;
        return this;
    }
    public BaseResult getData() {
        return this.data;
    }

}
