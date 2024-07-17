// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_a050edd0f07344eabd879166e7187ce5.models;

import com.aliyun.tea.*;

public class Node extends TeaModel {
    // 节点的id
    @NameInMap("node_id")
    @Validation(required = true)
    public String nodeId;

    // 节点名称
    @NameInMap("node_name")
    @Validation(required = true)
    public String nodeName;

    // 节点类型
    @NameInMap("node_type")
    @Validation(required = true)
    public String nodeType;

    // 节点在画布的横向位置
    @NameInMap("x")
    @Validation(required = true)
    public Long x;

    // 节点在画布的纵向位置
    @NameInMap("y")
    @Validation(required = true)
    public Long y;

    // 节点配置信息
    @NameInMap("node_info")
    @Validation(required = true)
    public NodeInfo nodeInfo;

    // 交互节点的首问播报
    @NameInMap("node_outputs")
    @Validation(required = true)
    public Output nodeOutputs;

    // 交互节点的新的首问播报
    @NameInMap("first_outputs")
    @Validation(required = true)
    public java.util.List<Output> firstOutputs;

    // 视频首句播报配置
    @NameInMap("node_video_output")
    @Validation(required = true)
    public Output nodeVideoOutput;

    // 视频结束配置
    @NameInMap("end_video_output")
    @Validation(required = true)
    public OutputGroup endVideoOutput;

    public static Node build(java.util.Map<String, ?> map) throws Exception {
        Node self = new Node();
        return TeaModel.build(map, self);
    }

    public Node setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public Node setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }
    public String getNodeName() {
        return this.nodeName;
    }

    public Node setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
    }

    public Node setX(Long x) {
        this.x = x;
        return this;
    }
    public Long getX() {
        return this.x;
    }

    public Node setY(Long y) {
        this.y = y;
        return this;
    }
    public Long getY() {
        return this.y;
    }

    public Node setNodeInfo(NodeInfo nodeInfo) {
        this.nodeInfo = nodeInfo;
        return this;
    }
    public NodeInfo getNodeInfo() {
        return this.nodeInfo;
    }

    public Node setNodeOutputs(Output nodeOutputs) {
        this.nodeOutputs = nodeOutputs;
        return this;
    }
    public Output getNodeOutputs() {
        return this.nodeOutputs;
    }

    public Node setFirstOutputs(java.util.List<Output> firstOutputs) {
        this.firstOutputs = firstOutputs;
        return this;
    }
    public java.util.List<Output> getFirstOutputs() {
        return this.firstOutputs;
    }

    public Node setNodeVideoOutput(Output nodeVideoOutput) {
        this.nodeVideoOutput = nodeVideoOutput;
        return this;
    }
    public Output getNodeVideoOutput() {
        return this.nodeVideoOutput;
    }

    public Node setEndVideoOutput(OutputGroup endVideoOutput) {
        this.endVideoOutput = endVideoOutput;
        return this;
    }
    public OutputGroup getEndVideoOutput() {
        return this.endVideoOutput;
    }

}
