// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryServiceProgressResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // progresses
    @NameInMap("progresses")
    public java.util.List<String> progresses;

    public static QueryServiceProgressResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryServiceProgressResponse self = new QueryServiceProgressResponse();
        return TeaModel.build(map, self);
    }

    public QueryServiceProgressResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryServiceProgressResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryServiceProgressResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryServiceProgressResponse setProgresses(java.util.List<String> progresses) {
        this.progresses = progresses;
        return this;
    }
    public java.util.List<String> getProgresses() {
        return this.progresses;
    }

}
