// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class QueryDeviceplusMpaasResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 是否成功
    @NameInMap("success")
    public Boolean success;

    // 返回码
    @NameInMap("code")
    public Long code;

    // 返回信息
    @NameInMap("message")
    public String message;

    // 供nearx排查的链路业务请求id
    @NameInMap("request_id")
    public String requestId;

    // 风险咨询信息
    @NameInMap("data")
    public RiskQueryData data;

    public static QueryDeviceplusMpaasResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceplusMpaasResponse self = new QueryDeviceplusMpaasResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeviceplusMpaasResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDeviceplusMpaasResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDeviceplusMpaasResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDeviceplusMpaasResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDeviceplusMpaasResponse setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public QueryDeviceplusMpaasResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryDeviceplusMpaasResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceplusMpaasResponse setData(RiskQueryData data) {
        this.data = data;
        return this;
    }
    public RiskQueryData getData() {
        return this.data;
    }

}
