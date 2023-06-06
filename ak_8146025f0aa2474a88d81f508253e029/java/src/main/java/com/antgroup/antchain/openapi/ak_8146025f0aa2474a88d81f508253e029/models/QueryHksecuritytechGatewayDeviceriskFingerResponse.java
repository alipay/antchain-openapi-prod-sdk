// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_8146025f0aa2474a88d81f508253e029.models;

import com.aliyun.tea.*;

public class QueryHksecuritytechGatewayDeviceriskFingerResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // code
    @NameInMap("code")
    public Long code;

    // message
    @NameInMap("message")
    public String message;

    // request_id
    @NameInMap("request_id")
    public String requestId;

    // success
    @NameInMap("success")
    public Boolean success;

    // data
    @NameInMap("data")
    public DeviceRiskResp data;

    public static QueryHksecuritytechGatewayDeviceriskFingerResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHksecuritytechGatewayDeviceriskFingerResponse self = new QueryHksecuritytechGatewayDeviceriskFingerResponse();
        return TeaModel.build(map, self);
    }

    public QueryHksecuritytechGatewayDeviceriskFingerResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryHksecuritytechGatewayDeviceriskFingerResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryHksecuritytechGatewayDeviceriskFingerResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryHksecuritytechGatewayDeviceriskFingerResponse setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public QueryHksecuritytechGatewayDeviceriskFingerResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryHksecuritytechGatewayDeviceriskFingerResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHksecuritytechGatewayDeviceriskFingerResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryHksecuritytechGatewayDeviceriskFingerResponse setData(DeviceRiskResp data) {
        this.data = data;
        return this;
    }
    public DeviceRiskResp getData() {
        return this.data;
    }

}
