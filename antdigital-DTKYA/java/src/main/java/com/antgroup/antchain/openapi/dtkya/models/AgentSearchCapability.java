// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class AgentSearchCapability extends TeaModel {
    // 能力标识
    /**
     * <strong>example:</strong>
     * <p>analysis</p>
     */
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 能力名称
    /**
     * <strong>example:</strong>
     * <p>业务指标分析</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 能力描述
    /**
     * <strong>example:</strong>
     * <p>分析业务指标并生成报告</p>
     */
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // 能力标签
    /**
     * <strong>example:</strong>
     * <p>[&quot;分析&quot;]</p>
     */
    @NameInMap("tags")
    public java.util.List<String> tags;

    public static AgentSearchCapability build(java.util.Map<String, ?> map) throws Exception {
        AgentSearchCapability self = new AgentSearchCapability();
        return TeaModel.build(map, self);
    }

    public AgentSearchCapability setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public AgentSearchCapability setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AgentSearchCapability setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AgentSearchCapability setTags(java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<String> getTags() {
        return this.tags;
    }

}
