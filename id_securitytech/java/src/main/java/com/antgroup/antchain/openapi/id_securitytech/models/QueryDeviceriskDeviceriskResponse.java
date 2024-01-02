// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.id_securitytech.models;

import com.aliyun.tea.*;

public class QueryDeviceriskDeviceriskResponse extends TeaModel {
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

    public static QueryDeviceriskDeviceriskResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceriskDeviceriskResponse self = new QueryDeviceriskDeviceriskResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeviceriskDeviceriskResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDeviceriskDeviceriskResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDeviceriskDeviceriskResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDeviceriskDeviceriskResponse setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public QueryDeviceriskDeviceriskResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryDeviceriskDeviceriskResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceriskDeviceriskResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDeviceriskDeviceriskResponse setData(DeviceRiskResp data) {
        this.data = data;
        return this;
    }
    public DeviceRiskResp getData() {
        return this.data;
    }

}
