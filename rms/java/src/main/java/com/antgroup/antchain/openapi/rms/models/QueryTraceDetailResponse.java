// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryTraceDetailResponse extends TeaModel {
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
    public java.util.List<TraceTreeItem> items;

    // 描述整体链路的额外信息，比span总数，应用总数之类的
    @NameInMap("attributes")
    public java.util.List<KeySet> attributes;

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

    public QueryTraceDetailResponse setItems(java.util.List<TraceTreeItem> items) {
        this.items = items;
        return this;
    }
    public java.util.List<TraceTreeItem> getItems() {
        return this.items;
    }

    public QueryTraceDetailResponse setAttributes(java.util.List<KeySet> attributes) {
        this.attributes = attributes;
        return this;
    }
    public java.util.List<KeySet> getAttributes() {
        return this.attributes;
    }

}
