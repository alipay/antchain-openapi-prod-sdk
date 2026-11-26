// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurancesaas.models;

import com.aliyun.tea.*;

public class CallbackAntcloudInsuranceMktMonitordataResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 回传请求对应id
    @NameInMap("request_id")
    public String requestId;

    public static CallbackAntcloudInsuranceMktMonitordataResponse build(java.util.Map<String, ?> map) throws Exception {
        CallbackAntcloudInsuranceMktMonitordataResponse self = new CallbackAntcloudInsuranceMktMonitordataResponse();
        return TeaModel.build(map, self);
    }

    public CallbackAntcloudInsuranceMktMonitordataResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CallbackAntcloudInsuranceMktMonitordataResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CallbackAntcloudInsuranceMktMonitordataResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CallbackAntcloudInsuranceMktMonitordataResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
