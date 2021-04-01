// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ListDataauthorizationParticipantResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 参与方列表
    @NameInMap("participants")
    public java.util.List<Participant> participants;

    public static ListDataauthorizationParticipantResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataauthorizationParticipantResponse self = new ListDataauthorizationParticipantResponse();
        return TeaModel.build(map, self);
    }

    public ListDataauthorizationParticipantResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListDataauthorizationParticipantResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListDataauthorizationParticipantResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListDataauthorizationParticipantResponse setParticipants(java.util.List<Participant> participants) {
        this.participants = participants;
        return this;
    }
    public java.util.List<Participant> getParticipants() {
        return this.participants;
    }

}
