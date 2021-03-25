// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class ListStsActorResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 虚拟身份列表
    @NameInMap("actors")
    public java.util.List<StsActor> actors;

    public static ListStsActorResponse build(java.util.Map<String, ?> map) throws Exception {
        ListStsActorResponse self = new ListStsActorResponse();
        return TeaModel.build(map, self);
    }

    public ListStsActorResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListStsActorResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListStsActorResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListStsActorResponse setActors(java.util.List<StsActor> actors) {
        this.actors = actors;
        return this;
    }
    public java.util.List<StsActor> getActors() {
        return this.actors;
    }

}
