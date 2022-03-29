// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class DescribeRmsTracetreeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 树状图结构体
    // 找不到数据时 trace_tree_items 为空数组, 并不会报错
    @NameInMap("trace_tree_items")
    public java.util.List<TraceTreeItem> traceTreeItems;

    public static DescribeRmsTracetreeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRmsTracetreeResponse self = new DescribeRmsTracetreeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRmsTracetreeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public DescribeRmsTracetreeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DescribeRmsTracetreeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DescribeRmsTracetreeResponse setTraceTreeItems(java.util.List<TraceTreeItem> traceTreeItems) {
        this.traceTreeItems = traceTreeItems;
        return this;
    }
    public java.util.List<TraceTreeItem> getTraceTreeItems() {
        return this.traceTreeItems;
    }

}
