// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class CreateSecuritygroupResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 安全组/域 序列号
    @NameInMap("security_group_sequence")
    public String securityGroupSequence;

    public static CreateSecuritygroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSecuritygroupResponse self = new CreateSecuritygroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateSecuritygroupResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateSecuritygroupResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateSecuritygroupResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateSecuritygroupResponse setSecurityGroupSequence(String securityGroupSequence) {
        this.securityGroupSequence = securityGroupSequence;
        return this;
    }
    public String getSecurityGroupSequence() {
        return this.securityGroupSequence;
    }

}
