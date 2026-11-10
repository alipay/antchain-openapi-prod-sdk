// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class AgentSearchItem extends TeaModel {
    // Agent DID
    /**
     * <strong>example:</strong>
     * <p>did:antchain:example:agent001</p>
     */
    @NameInMap("agent_did")
    @Validation(required = true)
    public String agentDid;

    // 当前名称；缺名称时使用 DID
    /**
     * <strong>example:</strong>
     * <p>业务分析助手</p>
     */
    @NameInMap("display_name")
    @Validation(required = true)
    public String displayName;

    // 简介；当前未接入权威字段，返回空字符串
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // 当前记录状态，返回对象为 ACTIVE
    /**
     * <strong>example:</strong>
     * <p>ACTIVE</p>
     */
    @NameInMap("record_status")
    @Validation(required = true)
    public String recordStatus;

    // 当前公开声明能力，可为空
    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("capabilities")
    @Validation(required = true)
    public java.util.List<AgentSearchCapability> capabilities;

    // 当前有效且允许公开的 A2A 配置
    /**
     * <strong>example:</strong>
     * <p>{&quot;endpoint&quot;:&quot;<a href="https://agent.example.com/a2a%22%7D">https://agent.example.com/a2a&quot;}</a></p>
     */
    @NameInMap("a2a")
    public AgentSearchA2A a2a;

    // 启用级别，可为空
    /**
     * <strong>example:</strong>
     * <p>[&quot;L1&quot;]</p>
     */
    @NameInMap("enabled_levels")
    @Validation(required = true)
    public java.util.List<String> enabledLevels;

    // 对端要求级别，可为空
    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("required_layers")
    @Validation(required = true)
    public java.util.List<String> requiredLayers;

    // 当前 L2 状态
    /**
     * <strong>example:</strong>
     * <p>PENDING</p>
     */
    @NameInMap("l2_status")
    public String l2Status;

    // 绑定状态：BOUND、UNBOUND、DISABLED、UNKNOWN
    /**
     * <strong>example:</strong>
     * <p>UNBOUND</p>
     */
    @NameInMap("binding_status")
    @Validation(required = true)
    public String bindingStatus;

    // 绑定主体类型；当前未接入权威来源，返回 UNKNOWN
    /**
     * <strong>example:</strong>
     * <p>UNKNOWN</p>
     */
    @NameInMap("bound_entity_type")
    @Validation(required = true)
    public String boundEntityType;

    // 认证状态；当前未接入权威来源，返回 UNKNOWN
    /**
     * <strong>example:</strong>
     * <p>UNKNOWN</p>
     */
    @NameInMap("authentication_status")
    @Validation(required = true)
    public String authenticationStatus;

    // L2 摘要状态；当前未接入结构化 L2，返回 MISSING
    /**
     * <strong>example:</strong>
     * <p>MISSING</p>
     */
    @NameInMap("l2_summary_status")
    @Validation(required = true)
    public String l2SummaryStatus;

    // 已核对当前公开字段的纯文本匹配片段，最长 300 字符
    /**
     * <strong>example:</strong>
     * <p>分析业务指标并生成报告</p>
     */
    @NameInMap("match_reason")
    public String matchReason;

    // 从 1 开始的返回顺序
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("rank")
    @Validation(required = true)
    public Long rank;

    // 当前资料更新时间，RFC 3339；配置明确数据库时区后才生成
    /**
     * <strong>example:</strong>
     * <p>2026-11-09T00:00:00Z</p>
     */
    @NameInMap("source_updated_at")
    public String sourceUpdatedAt;

    // 最终排序分；当前重排成功时为批内归一化分，不是匹配概率；小数字符串，通道无分数时缺省
    /**
     * <strong>example:</strong>
     * <p>0.9</p>
     */
    @NameInMap("match_score")
    public String matchScore;

    // 关键词原始分，不同查询不可直接比较；小数字符串，通道无分数时缺省
    /**
     * <strong>example:</strong>
     * <p>5.9128065</p>
     */
    @NameInMap("bm25_score")
    public String bm25Score;

    // 稠密向量分；KYA minVectorScore 使用此分准入；小数字符串，通道无分数时缺省
    /**
     * <strong>example:</strong>
     * <p>0.7677212</p>
     */
    @NameInMap("vector_score")
    public String vectorScore;

    // 稀疏向量原始分，与其他通道分值尺度不同；小数字符串，通道无分数时缺省
    /**
     * <strong>example:</strong>
     * <p>11.386748</p>
     */
    @NameInMap("sparse_score")
    public String sparseScore;

    public static AgentSearchItem build(java.util.Map<String, ?> map) throws Exception {
        AgentSearchItem self = new AgentSearchItem();
        return TeaModel.build(map, self);
    }

    public AgentSearchItem setAgentDid(String agentDid) {
        this.agentDid = agentDid;
        return this;
    }
    public String getAgentDid() {
        return this.agentDid;
    }

    public AgentSearchItem setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public AgentSearchItem setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AgentSearchItem setRecordStatus(String recordStatus) {
        this.recordStatus = recordStatus;
        return this;
    }
    public String getRecordStatus() {
        return this.recordStatus;
    }

    public AgentSearchItem setCapabilities(java.util.List<AgentSearchCapability> capabilities) {
        this.capabilities = capabilities;
        return this;
    }
    public java.util.List<AgentSearchCapability> getCapabilities() {
        return this.capabilities;
    }

    public AgentSearchItem setA2a(AgentSearchA2A a2a) {
        this.a2a = a2a;
        return this;
    }
    public AgentSearchA2A getA2a() {
        return this.a2a;
    }

    public AgentSearchItem setEnabledLevels(java.util.List<String> enabledLevels) {
        this.enabledLevels = enabledLevels;
        return this;
    }
    public java.util.List<String> getEnabledLevels() {
        return this.enabledLevels;
    }

    public AgentSearchItem setRequiredLayers(java.util.List<String> requiredLayers) {
        this.requiredLayers = requiredLayers;
        return this;
    }
    public java.util.List<String> getRequiredLayers() {
        return this.requiredLayers;
    }

    public AgentSearchItem setL2Status(String l2Status) {
        this.l2Status = l2Status;
        return this;
    }
    public String getL2Status() {
        return this.l2Status;
    }

    public AgentSearchItem setBindingStatus(String bindingStatus) {
        this.bindingStatus = bindingStatus;
        return this;
    }
    public String getBindingStatus() {
        return this.bindingStatus;
    }

    public AgentSearchItem setBoundEntityType(String boundEntityType) {
        this.boundEntityType = boundEntityType;
        return this;
    }
    public String getBoundEntityType() {
        return this.boundEntityType;
    }

    public AgentSearchItem setAuthenticationStatus(String authenticationStatus) {
        this.authenticationStatus = authenticationStatus;
        return this;
    }
    public String getAuthenticationStatus() {
        return this.authenticationStatus;
    }

    public AgentSearchItem setL2SummaryStatus(String l2SummaryStatus) {
        this.l2SummaryStatus = l2SummaryStatus;
        return this;
    }
    public String getL2SummaryStatus() {
        return this.l2SummaryStatus;
    }

    public AgentSearchItem setMatchReason(String matchReason) {
        this.matchReason = matchReason;
        return this;
    }
    public String getMatchReason() {
        return this.matchReason;
    }

    public AgentSearchItem setRank(Long rank) {
        this.rank = rank;
        return this;
    }
    public Long getRank() {
        return this.rank;
    }

    public AgentSearchItem setSourceUpdatedAt(String sourceUpdatedAt) {
        this.sourceUpdatedAt = sourceUpdatedAt;
        return this;
    }
    public String getSourceUpdatedAt() {
        return this.sourceUpdatedAt;
    }

    public AgentSearchItem setMatchScore(String matchScore) {
        this.matchScore = matchScore;
        return this;
    }
    public String getMatchScore() {
        return this.matchScore;
    }

    public AgentSearchItem setBm25Score(String bm25Score) {
        this.bm25Score = bm25Score;
        return this;
    }
    public String getBm25Score() {
        return this.bm25Score;
    }

    public AgentSearchItem setVectorScore(String vectorScore) {
        this.vectorScore = vectorScore;
        return this;
    }
    public String getVectorScore() {
        return this.vectorScore;
    }

    public AgentSearchItem setSparseScore(String sparseScore) {
        this.sparseScore = sparseScore;
        return this;
    }
    public String getSparseScore() {
        return this.sparseScore;
    }

}
