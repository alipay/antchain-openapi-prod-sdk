// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class KyaAgentSearchResultItem extends TeaModel {
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

    // 可选简介。首期固定样例可带描述。
    @NameInMap("description")
    public String description;

    // 当前记录状态，返回对象为 ACTIVE
    /**
     * <strong>example:</strong>
     * <p>ACTIVE</p>
     */
    @NameInMap("record_status")
    @Validation(required = true)
    public String recordStatus;

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

    // 已核对当前公开字段的纯文本匹配片段，最长 300 字符
    /**
     * <strong>example:</strong>
     * <p>分析业务指标并生成报告</p>
     */
    @NameInMap("match_reason")
    public String matchReason;

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

    public static KyaAgentSearchResultItem build(java.util.Map<String, ?> map) throws Exception {
        KyaAgentSearchResultItem self = new KyaAgentSearchResultItem();
        return TeaModel.build(map, self);
    }

    public KyaAgentSearchResultItem setAgentDid(String agentDid) {
        this.agentDid = agentDid;
        return this;
    }
    public String getAgentDid() {
        return this.agentDid;
    }

    public KyaAgentSearchResultItem setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public KyaAgentSearchResultItem setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public KyaAgentSearchResultItem setRecordStatus(String recordStatus) {
        this.recordStatus = recordStatus;
        return this;
    }
    public String getRecordStatus() {
        return this.recordStatus;
    }

    public KyaAgentSearchResultItem setRank(Long rank) {
        this.rank = rank;
        return this;
    }
    public Long getRank() {
        return this.rank;
    }

    public KyaAgentSearchResultItem setSourceUpdatedAt(String sourceUpdatedAt) {
        this.sourceUpdatedAt = sourceUpdatedAt;
        return this;
    }
    public String getSourceUpdatedAt() {
        return this.sourceUpdatedAt;
    }

    public KyaAgentSearchResultItem setMatchReason(String matchReason) {
        this.matchReason = matchReason;
        return this;
    }
    public String getMatchReason() {
        return this.matchReason;
    }

    public KyaAgentSearchResultItem setMatchScore(String matchScore) {
        this.matchScore = matchScore;
        return this;
    }
    public String getMatchScore() {
        return this.matchScore;
    }

    public KyaAgentSearchResultItem setBm25Score(String bm25Score) {
        this.bm25Score = bm25Score;
        return this;
    }
    public String getBm25Score() {
        return this.bm25Score;
    }

    public KyaAgentSearchResultItem setVectorScore(String vectorScore) {
        this.vectorScore = vectorScore;
        return this;
    }
    public String getVectorScore() {
        return this.vectorScore;
    }

    public KyaAgentSearchResultItem setSparseScore(String sparseScore) {
        this.sparseScore = sparseScore;
        return this;
    }
    public String getSparseScore() {
        return this.sparseScore;
    }

}
