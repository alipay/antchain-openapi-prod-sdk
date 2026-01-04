// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtaiagt.models;

import com.aliyun.tea.*;

public class SubAgentInfo extends TeaModel {
    // agent主键id
    // 
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // agent code
    // 
    /**
     * <strong>example:</strong>
     * <p>agent code</p>
     */
    @NameInMap("unique_code")
    @Validation(required = true)
    public String uniqueCode;

    // 场景描述
    // 
    /**
     * <strong>example:</strong>
     * <p>场景描述</p>
     */
    @NameInMap("scene")
    @Validation(required = true)
    public String scene;

    // 调用示例 话术
    // 
    @NameInMap("scripting")
    @Validation(required = true)
    public java.util.List<String> scripting;

    // 是否默认展示
    // 
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("is_default")
    @Validation(required = true)
    public Boolean isDefault;

    // 实例id
    // 
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // edges 信息
    // 
    @NameInMap("edges")
    @Validation(required = true)
    public java.util.List<MultiAgentEdge> edges;

    // 坐标信息
    // 
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("position")
    @Validation(required = true)
    public DraftPosition position;

    // agent 来源类型
    // 
    /**
     * <strong>example:</strong>
     * <p>&quot;internal&quot; </p>
     */
    @NameInMap("agent_source")
    @Validation(required = true)
    public String agentSource;

    public static SubAgentInfo build(java.util.Map<String, ?> map) throws Exception {
        SubAgentInfo self = new SubAgentInfo();
        return TeaModel.build(map, self);
    }

    public SubAgentInfo setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public SubAgentInfo setUniqueCode(String uniqueCode) {
        this.uniqueCode = uniqueCode;
        return this;
    }
    public String getUniqueCode() {
        return this.uniqueCode;
    }

    public SubAgentInfo setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public SubAgentInfo setScripting(java.util.List<String> scripting) {
        this.scripting = scripting;
        return this;
    }
    public java.util.List<String> getScripting() {
        return this.scripting;
    }

    public SubAgentInfo setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }
    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public SubAgentInfo setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SubAgentInfo setEdges(java.util.List<MultiAgentEdge> edges) {
        this.edges = edges;
        return this;
    }
    public java.util.List<MultiAgentEdge> getEdges() {
        return this.edges;
    }

    public SubAgentInfo setPosition(DraftPosition position) {
        this.position = position;
        return this;
    }
    public DraftPosition getPosition() {
        return this.position;
    }

    public SubAgentInfo setAgentSource(String agentSource) {
        this.agentSource = agentSource;
        return this;
    }
    public String getAgentSource() {
        return this.agentSource;
    }

}
