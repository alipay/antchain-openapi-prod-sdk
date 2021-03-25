// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryMachinegroupProgressResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 进度
    @NameInMap("progresses")
    public java.util.List<String> progresses;

    public static QueryMachinegroupProgressResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMachinegroupProgressResponse self = new QueryMachinegroupProgressResponse();
        return TeaModel.build(map, self);
    }

    public QueryMachinegroupProgressResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryMachinegroupProgressResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMachinegroupProgressResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryMachinegroupProgressResponse setProgresses(java.util.List<String> progresses) {
        this.progresses = progresses;
        return this;
    }
    public java.util.List<String> getProgresses() {
        return this.progresses;
    }

}
