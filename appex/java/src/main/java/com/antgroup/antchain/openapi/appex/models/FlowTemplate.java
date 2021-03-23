// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.appex.models;

import com.aliyun.tea.*;

public class FlowTemplate extends TeaModel {
    // 业务单据类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 起始状态
    @NameInMap("from_status")
    @Validation(required = true)
    public String fromStatus;

    // 目标状态
    @NameInMap("to_status")
    @Validation(required = true)
    public String toStatus;

    // 是否为状态流起始节点
    @NameInMap("start_node")
    @Validation(required = true)
    public Boolean startNode;

    public static FlowTemplate build(java.util.Map<String, ?> map) throws Exception {
        FlowTemplate self = new FlowTemplate();
        return TeaModel.build(map, self);
    }

    public FlowTemplate setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public FlowTemplate setFromStatus(String fromStatus) {
        this.fromStatus = fromStatus;
        return this;
    }
    public String getFromStatus() {
        return this.fromStatus;
    }

    public FlowTemplate setToStatus(String toStatus) {
        this.toStatus = toStatus;
        return this;
    }
    public String getToStatus() {
        return this.toStatus;
    }

    public FlowTemplate setStartNode(Boolean startNode) {
        this.startNode = startNode;
        return this;
    }
    public Boolean getStartNode() {
        return this.startNode;
    }

}
