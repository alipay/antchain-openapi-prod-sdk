// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class AgentCapabilityDTO extends TeaModel {
    // 能力标识
    /**
     * <strong>example:</strong>
     * <p>code-review</p>
     */
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 展示名称
    /**
     * <strong>example:</strong>
     * <p>代码审查</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 能力说明
    /**
     * <strong>example:</strong>
     * <p>审查代码并给出建议</p>
     */
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // 检索标签
    /**
     * <strong>example:</strong>
     * <p>[&quot;Java&quot;,&quot;安全审查&quot;]</p>
     */
    @NameInMap("tags")
    public java.util.List<String> tags;

    public static AgentCapabilityDTO build(java.util.Map<String, ?> map) throws Exception {
        AgentCapabilityDTO self = new AgentCapabilityDTO();
        return TeaModel.build(map, self);
    }

    public AgentCapabilityDTO setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public AgentCapabilityDTO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AgentCapabilityDTO setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AgentCapabilityDTO setTags(java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<String> getTags() {
        return this.tags;
    }

}
