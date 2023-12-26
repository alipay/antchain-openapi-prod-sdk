// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class TaskCrowdNodeDTO extends TeaModel {
    // 节点ID
    @NameInMap("node_id")
    @Validation(required = true)
    public String nodeId;

    // 节点类型
    @NameInMap("node_type")
    @Validation(required = true)
    public String nodeType;

    // 是否排除
    @NameInMap("exclude")
    @Validation(required = true)
    public Boolean exclude;

    // 节点配置
    @NameInMap("node_config")
    @Validation(required = true)
    public String nodeConfig;

    public static TaskCrowdNodeDTO build(java.util.Map<String, ?> map) throws Exception {
        TaskCrowdNodeDTO self = new TaskCrowdNodeDTO();
        return TeaModel.build(map, self);
    }

    public TaskCrowdNodeDTO setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public TaskCrowdNodeDTO setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
    }

    public TaskCrowdNodeDTO setExclude(Boolean exclude) {
        this.exclude = exclude;
        return this;
    }
    public Boolean getExclude() {
        return this.exclude;
    }

    public TaskCrowdNodeDTO setNodeConfig(String nodeConfig) {
        this.nodeConfig = nodeConfig;
        return this;
    }
    public String getNodeConfig() {
        return this.nodeConfig;
    }

}
