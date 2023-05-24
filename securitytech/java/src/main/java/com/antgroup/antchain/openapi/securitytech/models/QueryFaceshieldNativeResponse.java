// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class QueryFaceshieldNativeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // true成功，false失败
    @NameInMap("success")
    public Boolean success;

    // 请求码，200成功，其他失败，具体见错误码
    @NameInMap("code")
    public Long code;

    // 错误时的返回信息
    @NameInMap("message")
    public String message;

    // 请求时传入的，若没有传，则系统自动生成
    @NameInMap("request_id")
    public String requestId;

    // apdidToken	String	设备token
    // riskLevel	String	风险等级，-1参数异常，0无风险，1-3表示低、中、高
    // riskDesc	String	风险描述，对风险等级的补充
    // sugAction	String	处理的建议，如PAAS
    @NameInMap("data")
    public FaceShieldResult data;

    public static QueryFaceshieldNativeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFaceshieldNativeResponse self = new QueryFaceshieldNativeResponse();
        return TeaModel.build(map, self);
    }

    public QueryFaceshieldNativeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryFaceshieldNativeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryFaceshieldNativeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryFaceshieldNativeResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryFaceshieldNativeResponse setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public QueryFaceshieldNativeResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryFaceshieldNativeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryFaceshieldNativeResponse setData(FaceShieldResult data) {
        this.data = data;
        return this;
    }
    public FaceShieldResult getData() {
        return this.data;
    }

}
