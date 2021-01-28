// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class SendContractInvitationResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 业务码，0表示成功
    @NameInMap("code")
    public Long code;

    // 邀请任务id
    @NameInMap("invitation_id")
    public String invitationId;

    // 邀请链接
    @NameInMap("invitation_url")
    public String invitationUrl;

    // 业务码信息
    @NameInMap("message")
    public String message;

    public static SendContractInvitationResponse build(java.util.Map<String, ?> map) throws Exception {
        SendContractInvitationResponse self = new SendContractInvitationResponse();
        return TeaModel.build(map, self);
    }

    public SendContractInvitationResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SendContractInvitationResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SendContractInvitationResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SendContractInvitationResponse setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public SendContractInvitationResponse setInvitationId(String invitationId) {
        this.invitationId = invitationId;
        return this;
    }
    public String getInvitationId() {
        return this.invitationId;
    }

    public SendContractInvitationResponse setInvitationUrl(String invitationUrl) {
        this.invitationUrl = invitationUrl;
        return this;
    }
    public String getInvitationUrl() {
        return this.invitationUrl;
    }

    public SendContractInvitationResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
