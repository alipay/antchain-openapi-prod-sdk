// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class CreateVpcVswitchResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // switch paas id
    @NameInMap("vswitch_sequence")
    public String vswitchSequence;

    public static CreateVpcVswitchResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVpcVswitchResponse self = new CreateVpcVswitchResponse();
        return TeaModel.build(map, self);
    }

    public CreateVpcVswitchResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateVpcVswitchResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateVpcVswitchResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateVpcVswitchResponse setVswitchSequence(String vswitchSequence) {
        this.vswitchSequence = vswitchSequence;
        return this;
    }
    public String getVswitchSequence() {
        return this.vswitchSequence;
    }

}
