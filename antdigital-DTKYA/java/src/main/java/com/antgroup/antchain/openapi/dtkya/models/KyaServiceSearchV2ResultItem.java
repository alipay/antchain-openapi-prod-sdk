// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class KyaServiceSearchV2ResultItem extends TeaModel {
    // 服务 ID
    /**
     * <strong>example:</strong>
     * <p>svc-example</p>
     */
    @NameInMap("service_id")
    @Validation(required = true)
    public String serviceId;

    // 公开名称
    /**
     * <strong>example:</strong>
     * <p>银行网点查询</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 公开描述
    /**
     * <strong>example:</strong>
     * <p>查询银行网点</p>
     */
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // 服务类型
    /**
     * <strong>example:</strong>
     * <p>MCP</p>
     */
    @NameInMap("service_type")
    @Validation(required = true)
    public String serviceType;

    // 实际返回排名，从 1 开始
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("rank")
    @Validation(required = true)
    public Long rank;

    // 当前公开服务名称或描述中已复核的纯文本匹配片段，最多 300 字符
    /**
     * <strong>example:</strong>
     * <p>查询银行网点</p>
     */
    @NameInMap("match_reason")
    public String matchReason;

    // 最终排序分，小数字符串。暂无分数时省略，分数不表示概率
    /**
     * <strong>example:</strong>
     * <p>0.9</p>
     */
    @NameInMap("match_score")
    public String matchScore;

    // 关键词 BM25 原始分，小数字符串。该路无分数时省略
    /**
     * <strong>example:</strong>
     * <p>5.9128065</p>
     */
    @NameInMap("bm25_score")
    public String bm25Score;

    // 稠密向量分，小数字符串。该路无分数时省略
    /**
     * <strong>example:</strong>
     * <p>0.7677212</p>
     */
    @NameInMap("vector_score")
    public String vectorScore;

    // 稀疏向量原始分，小数字符串。该路无分数时省略
    /**
     * <strong>example:</strong>
     * <p>11.386748</p>
     */
    @NameInMap("sparse_score")
    public String sparseScore;

    public static KyaServiceSearchV2ResultItem build(java.util.Map<String, ?> map) throws Exception {
        KyaServiceSearchV2ResultItem self = new KyaServiceSearchV2ResultItem();
        return TeaModel.build(map, self);
    }

    public KyaServiceSearchV2ResultItem setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public KyaServiceSearchV2ResultItem setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public KyaServiceSearchV2ResultItem setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public KyaServiceSearchV2ResultItem setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public KyaServiceSearchV2ResultItem setRank(Long rank) {
        this.rank = rank;
        return this;
    }
    public Long getRank() {
        return this.rank;
    }

    public KyaServiceSearchV2ResultItem setMatchReason(String matchReason) {
        this.matchReason = matchReason;
        return this;
    }
    public String getMatchReason() {
        return this.matchReason;
    }

    public KyaServiceSearchV2ResultItem setMatchScore(String matchScore) {
        this.matchScore = matchScore;
        return this;
    }
    public String getMatchScore() {
        return this.matchScore;
    }

    public KyaServiceSearchV2ResultItem setBm25Score(String bm25Score) {
        this.bm25Score = bm25Score;
        return this;
    }
    public String getBm25Score() {
        return this.bm25Score;
    }

    public KyaServiceSearchV2ResultItem setVectorScore(String vectorScore) {
        this.vectorScore = vectorScore;
        return this;
    }
    public String getVectorScore() {
        return this.vectorScore;
    }

    public KyaServiceSearchV2ResultItem setSparseScore(String sparseScore) {
        this.sparseScore = sparseScore;
        return this;
    }
    public String getSparseScore() {
        return this.sparseScore;
    }

}
