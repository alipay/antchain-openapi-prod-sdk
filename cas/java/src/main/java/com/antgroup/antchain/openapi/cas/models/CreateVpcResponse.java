// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class CreateVpcResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 专有网络序列号
    @NameInMap("vpc_sequence")
    public String vpcSequence;

    public static CreateVpcResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVpcResponse self = new CreateVpcResponse();
        return TeaModel.build(map, self);
    }

    public CreateVpcResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateVpcResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateVpcResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateVpcResponse setVpcSequence(String vpcSequence) {
        this.vpcSequence = vpcSequence;
        return this;
    }
    public String getVpcSequence() {
        return this.vpcSequence;
    }

}
