// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryTraceConfigResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 链路配置
    @NameInMap("tags")
    public java.util.List<TraceSpanSearchTagConfig> tags;

    public static QueryTraceConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTraceConfigResponse self = new QueryTraceConfigResponse();
        return TeaModel.build(map, self);
    }

    public QueryTraceConfigResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryTraceConfigResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTraceConfigResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryTraceConfigResponse setTags(java.util.List<TraceSpanSearchTagConfig> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<TraceSpanSearchTagConfig> getTags() {
        return this.tags;
    }

}
