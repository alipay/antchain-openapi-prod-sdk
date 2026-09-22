// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energent.models;

import com.aliyun.tea.*;

public class RetrieveKgGraphResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 结果是否被截断
    @NameInMap("truncated")
    public Boolean truncated;

    // 节点JSON数组(KbGraphNode字段定义见文档)
    @NameInMap("nodes")
    public String nodes;

    // 关系JSON数组(KbGraphEdge字段定义见文档)
    @NameInMap("edges")
    public String edges;

    public static RetrieveKgGraphResponse build(java.util.Map<String, ?> map) throws Exception {
        RetrieveKgGraphResponse self = new RetrieveKgGraphResponse();
        return TeaModel.build(map, self);
    }

    public RetrieveKgGraphResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public RetrieveKgGraphResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public RetrieveKgGraphResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public RetrieveKgGraphResponse setTruncated(Boolean truncated) {
        this.truncated = truncated;
        return this;
    }
    public Boolean getTruncated() {
        return this.truncated;
    }

    public RetrieveKgGraphResponse setNodes(String nodes) {
        this.nodes = nodes;
        return this;
    }
    public String getNodes() {
        return this.nodes;
    }

    public RetrieveKgGraphResponse setEdges(String edges) {
        this.edges = edges;
        return this;
    }
    public String getEdges() {
        return this.edges;
    }

}
