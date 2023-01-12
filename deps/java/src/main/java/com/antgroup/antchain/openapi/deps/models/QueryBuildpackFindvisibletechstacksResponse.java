// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryBuildpackFindvisibletechstacksResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // Techstack
    @NameInMap("techstack")
    public java.util.List<Techstack> techstack;

    public static QueryBuildpackFindvisibletechstacksResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBuildpackFindvisibletechstacksResponse self = new QueryBuildpackFindvisibletechstacksResponse();
        return TeaModel.build(map, self);
    }

    public QueryBuildpackFindvisibletechstacksResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBuildpackFindvisibletechstacksResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBuildpackFindvisibletechstacksResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBuildpackFindvisibletechstacksResponse setTechstack(java.util.List<Techstack> techstack) {
        this.techstack = techstack;
        return this;
    }
    public java.util.List<Techstack> getTechstack() {
        return this.techstack;
    }

}
