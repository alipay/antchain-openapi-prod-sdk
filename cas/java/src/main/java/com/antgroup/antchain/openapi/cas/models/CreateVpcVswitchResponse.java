// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class CreateVpcVswitchResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
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
