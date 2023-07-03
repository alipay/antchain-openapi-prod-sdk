// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.hk_securitytech.models;

import com.aliyun.tea.*;

public class QueryFaceshieldWebResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // success
    @NameInMap("success")
    public Boolean success;

    // 请求码，200成功，其他失败，具体见错误码
    // 
    @NameInMap("code")
    public Long code;

    // 错误时的返回信息
    // 
    @NameInMap("message")
    public String message;

    // 请求时传入的，若没有传，则系统自动生成
    // 
    @NameInMap("request_id")
    public String requestId;

    // data
    @NameInMap("data")
    public FaceShieldResult data;

    public static QueryFaceshieldWebResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFaceshieldWebResponse self = new QueryFaceshieldWebResponse();
        return TeaModel.build(map, self);
    }

    public QueryFaceshieldWebResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryFaceshieldWebResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryFaceshieldWebResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryFaceshieldWebResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryFaceshieldWebResponse setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public QueryFaceshieldWebResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryFaceshieldWebResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryFaceshieldWebResponse setData(FaceShieldResult data) {
        this.data = data;
        return this;
    }
    public FaceShieldResult getData() {
        return this.data;
    }

}
