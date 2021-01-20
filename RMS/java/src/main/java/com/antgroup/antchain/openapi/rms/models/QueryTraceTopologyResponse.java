// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryTraceTopologyResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 拓扑节点
    @NameInMap("nodes")
    public TopologyNode nodes;

    // 拓扑边
    @NameInMap("edges")
    public TopologyEdge edges;

    // 节点性能指标
    @NameInMap("node_metrics")
    public TimeSeriesMetrics nodeMetrics;

    // 边性能指标
    @NameInMap("edge_metrics")
    public TimeSeriesMetrics edgeMetrics;

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

    public QueryTraceTopologyResponse setNodes(TopologyNode nodes) {
        this.nodes = nodes;
        return this;
    }
    public TopologyNode getNodes() {
        return this.nodes;
    }

    public QueryTraceTopologyResponse setEdges(TopologyEdge edges) {
        this.edges = edges;
        return this;
    }
    public TopologyEdge getEdges() {
        return this.edges;
    }

    public QueryTraceTopologyResponse setNodeMetrics(TimeSeriesMetrics nodeMetrics) {
        this.nodeMetrics = nodeMetrics;
        return this;
    }
    public TimeSeriesMetrics getNodeMetrics() {
        return this.nodeMetrics;
    }

    public QueryTraceTopologyResponse setEdgeMetrics(TimeSeriesMetrics edgeMetrics) {
        this.edgeMetrics = edgeMetrics;
        return this;
    }
    public TimeSeriesMetrics getEdgeMetrics() {
        return this.edgeMetrics;
    }

}
