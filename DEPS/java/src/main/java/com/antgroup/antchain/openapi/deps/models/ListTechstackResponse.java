// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class ListTechstackResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 技术栈列表
    @NameInMap("techstacks")
    @Validation(required = true)
    public java.util.List<Techstack> techstacks;

    public static ListTechstackResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTechstackResponse self = new ListTechstackResponse();
        return TeaModel.build(map, self);
    }

    public ListTechstackResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListTechstackResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListTechstackResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListTechstackResponse setTechstacks(java.util.List<Techstack> techstacks) {
        this.techstacks = techstacks;
        return this;
    }
    public java.util.List<Techstack> getTechstacks() {
        return this.techstacks;
    }

}
