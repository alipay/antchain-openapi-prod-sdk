// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryTraceTopologyResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 拓扑节点
    @NameInMap("nodes")
    public java.util.List<TopologyNode> nodes;

    // 拓扑边
    @NameInMap("edges")
    public java.util.List<TopologyEdge> edges;

    // 节点性能指标
    @NameInMap("node_metrics")
    public java.util.List<TimeSeriesMetrics> nodeMetrics;

    // 边性能指标
    @NameInMap("edge_metrics")
    public java.util.List<TimeSeriesMetrics> edgeMetrics;

    public static QueryTraceTopologyResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTraceTopologyResponse self = new QueryTraceTopologyResponse();
        return TeaModel.build(map, self);
    }

    public QueryTraceTopologyResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryTraceTopologyResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTraceTopologyResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryTraceTopologyResponse setNodes(java.util.List<TopologyNode> nodes) {
        this.nodes = nodes;
        return this;
    }
    public java.util.List<TopologyNode> getNodes() {
        return this.nodes;
    }

    public QueryTraceTopologyResponse setEdges(java.util.List<TopologyEdge> edges) {
        this.edges = edges;
        return this;
    }
    public java.util.List<TopologyEdge> getEdges() {
        return this.edges;
    }

    public QueryTraceTopologyResponse setNodeMetrics(java.util.List<TimeSeriesMetrics> nodeMetrics) {
        this.nodeMetrics = nodeMetrics;
        return this;
    }
    public java.util.List<TimeSeriesMetrics> getNodeMetrics() {
        return this.nodeMetrics;
    }

    public QueryTraceTopologyResponse setEdgeMetrics(java.util.List<TimeSeriesMetrics> edgeMetrics) {
        this.edgeMetrics = edgeMetrics;
        return this;
    }
    public java.util.List<TimeSeriesMetrics> getEdgeMetrics() {
        return this.edgeMetrics;
    }

}
