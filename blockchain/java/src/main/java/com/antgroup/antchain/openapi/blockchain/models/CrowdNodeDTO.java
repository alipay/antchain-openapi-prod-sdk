// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CrowdNodeDTO extends TeaModel {
    // 节点id
    @NameInMap("node_id")
    @Validation(required = true)
    public String nodeId;

    // 节点类型
    @NameInMap("node_type")
    @Validation(required = true)
    public CrowdNodeTypeEnum nodeType;

    // 是否排除
    @NameInMap("exclude")
    @Validation(required = true)
    public Boolean exclude;

    // 节点配置
    @NameInMap("node_config")
    @Validation(required = true)
    public String nodeConfig;

    public static CrowdNodeDTO build(java.util.Map<String, ?> map) throws Exception {
        CrowdNodeDTO self = new CrowdNodeDTO();
        return TeaModel.build(map, self);
    }

    public CrowdNodeDTO setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public CrowdNodeDTO setNodeType(CrowdNodeTypeEnum nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public CrowdNodeTypeEnum getNodeType() {
        return this.nodeType;
    }

    public CrowdNodeDTO setExclude(Boolean exclude) {
        this.exclude = exclude;
        return this;
    }
    public Boolean getExclude() {
        return this.exclude;
    }

    public CrowdNodeDTO setNodeConfig(String nodeConfig) {
        this.nodeConfig = nodeConfig;
        return this;
    }
    public String getNodeConfig() {
        return this.nodeConfig;
    }

}
