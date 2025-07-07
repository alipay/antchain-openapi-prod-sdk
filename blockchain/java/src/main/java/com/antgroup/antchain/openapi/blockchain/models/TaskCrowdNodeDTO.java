// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class TaskCrowdNodeDTO extends TeaModel {
    // 节点ID
    /**
     * <strong>example:</strong>
     * <p>c1bff3fe-f1fb-42a2-8fc7-9cbb1a011713</p>
     */
    @NameInMap("node_id")
    @Validation(required = true)
    public String nodeId;

    // 节点类型
    /**
     * <strong>example:</strong>
     * <p>GROUP、AND</p>
     */
    @NameInMap("node_type")
    @Validation(required = true)
    public String nodeType;

    // 是否排除
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("exclude")
    @Validation(required = true)
    public Boolean exclude;

    // 节点配置
    /**
     * <strong>example:</strong>
     * <p>&quot;nodeConfig&quot;: { &quot;tagCode&quot;: &quot;P0010GC6&quot;, &quot;valueList&quot;: [ { &quot;selectedValues&quot;: [ &quot;18&quot;, &quot;30&quot; ], &quot;operator&quot;: &quot;BT&quot; } ], &quot;tagType&quot;: &quot;BASE&quot; }</p>
     */
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
