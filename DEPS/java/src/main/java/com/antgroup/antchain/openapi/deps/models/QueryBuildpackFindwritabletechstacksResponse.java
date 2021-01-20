// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryBuildpackFindwritabletechstacksResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // Techstack
    @NameInMap("techstack")
    public java.util.List<Techstack> techstack;

    public static QueryBuildpackFindwritabletechstacksResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBuildpackFindwritabletechstacksResponse self = new QueryBuildpackFindwritabletechstacksResponse();
        return TeaModel.build(map, self);
    }

    public QueryBuildpackFindwritabletechstacksResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBuildpackFindwritabletechstacksResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBuildpackFindwritabletechstacksResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBuildpackFindwritabletechstacksResponse setTechstack(java.util.List<Techstack> techstack) {
        this.techstack = techstack;
        return this;
    }
    public java.util.List<Techstack> getTechstack() {
        return this.techstack;
    }

}
