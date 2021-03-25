// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryGrayProgressResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 进度
    @NameInMap("progresses")
    public String progresses;

    public static QueryGrayProgressResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryGrayProgressResponse self = new QueryGrayProgressResponse();
        return TeaModel.build(map, self);
    }

    public QueryGrayProgressResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryGrayProgressResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryGrayProgressResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryGrayProgressResponse setProgresses(String progresses) {
        this.progresses = progresses;
        return this;
    }
    public String getProgresses() {
        return this.progresses;
    }

}
