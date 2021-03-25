// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryBuildpackFindbynamesResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // techstack对象的json串
    @NameInMap("techstack")
    public java.util.List<Techstack> techstack;

    public static QueryBuildpackFindbynamesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBuildpackFindbynamesResponse self = new QueryBuildpackFindbynamesResponse();
        return TeaModel.build(map, self);
    }

    public QueryBuildpackFindbynamesResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBuildpackFindbynamesResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBuildpackFindbynamesResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBuildpackFindbynamesResponse setTechstack(java.util.List<Techstack> techstack) {
        this.techstack = techstack;
        return this;
    }
    public java.util.List<Techstack> getTechstack() {
        return this.techstack;
    }

}
