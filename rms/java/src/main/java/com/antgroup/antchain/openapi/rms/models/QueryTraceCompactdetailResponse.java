// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryTraceCompactdetailResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 节点
    @NameInMap("items")
    public java.util.List<TraceCompactTreeItem> items;

    // 描述整体链路的额外信息，比span总数，应用总数之类的
    @NameInMap("attributes")
    public java.util.List<KeySet> attributes;

    public static QueryTraceCompactdetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTraceCompactdetailResponse self = new QueryTraceCompactdetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryTraceCompactdetailResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryTraceCompactdetailResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTraceCompactdetailResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryTraceCompactdetailResponse setItems(java.util.List<TraceCompactTreeItem> items) {
        this.items = items;
        return this;
    }
    public java.util.List<TraceCompactTreeItem> getItems() {
        return this.items;
    }

    public QueryTraceCompactdetailResponse setAttributes(java.util.List<KeySet> attributes) {
        this.attributes = attributes;
        return this;
    }
    public java.util.List<KeySet> getAttributes() {
        return this.attributes;
    }

}
