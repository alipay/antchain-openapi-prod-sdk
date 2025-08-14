// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class ApplyTdiquickmsgRobotcallResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 呼叫记录id
    @NameInMap("call_id")
    public String callId;

    public static ApplyTdiquickmsgRobotcallResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyTdiquickmsgRobotcallResponse self = new ApplyTdiquickmsgRobotcallResponse();
        return TeaModel.build(map, self);
    }

    public ApplyTdiquickmsgRobotcallResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ApplyTdiquickmsgRobotcallResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ApplyTdiquickmsgRobotcallResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ApplyTdiquickmsgRobotcallResponse setCallId(String callId) {
        this.callId = callId;
        return this;
    }
    public String getCallId() {
        return this.callId;
    }

}
