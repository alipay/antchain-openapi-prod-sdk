// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class InvokeAgenticnexusAilongoperationResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 业务是否成功
    @NameInMap("success")
    public Boolean success;

    // 结果码
    @NameInMap("code")
    public String code;

    // 提示信息
    @NameInMap("message")
    public String message;

    // 链路 ID
    @NameInMap("trace_id")
    public String traceId;

    // 场景特定响应体
    @NameInMap("biz_data")
    public String bizData;

    public static InvokeAgenticnexusAilongoperationResponse build(java.util.Map<String, ?> map) throws Exception {
        InvokeAgenticnexusAilongoperationResponse self = new InvokeAgenticnexusAilongoperationResponse();
        return TeaModel.build(map, self);
    }

    public InvokeAgenticnexusAilongoperationResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public InvokeAgenticnexusAilongoperationResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public InvokeAgenticnexusAilongoperationResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public InvokeAgenticnexusAilongoperationResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public InvokeAgenticnexusAilongoperationResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public InvokeAgenticnexusAilongoperationResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InvokeAgenticnexusAilongoperationResponse setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public InvokeAgenticnexusAilongoperationResponse setBizData(String bizData) {
        this.bizData = bizData;
        return this;
    }
    public String getBizData() {
        return this.bizData;
    }

}
