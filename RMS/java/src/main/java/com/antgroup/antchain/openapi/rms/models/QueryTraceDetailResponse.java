// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryTraceDetailResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // TaceTreeItem
    @NameInMap("trace_tree_item")
    public TraceTreeItem traceTreeItem;

    public static QueryTraceDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTraceDetailResponse self = new QueryTraceDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryTraceDetailResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryTraceDetailResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTraceDetailResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryTraceDetailResponse setTraceTreeItem(TraceTreeItem traceTreeItem) {
        this.traceTreeItem = traceTreeItem;
        return this;
    }
    public TraceTreeItem getTraceTreeItem() {
        return this.traceTreeItem;
    }

}
