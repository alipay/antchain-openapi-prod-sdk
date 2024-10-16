// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class AuditSyncLabel extends TeaModel {
    // 标签名：sex-色情
    @NameInMap("label")
    @Validation(required = true)
    public String label;

    // 检测到单个风险标签的置信度：66.25
    @NameInMap("probability")
    @Validation(required = true)
    public Long probability;

    // 风险标签说明
    @NameInMap("description")
    public String description;

    // 检测到的敏感词，多个词用逗号分隔，部分标签不会返回敏感词：AA,BB,CC
    @NameInMap("risk_words")
    @Validation(required = true)
    public String riskWords;

    public static AuditSyncLabel build(java.util.Map<String, ?> map) throws Exception {
        AuditSyncLabel self = new AuditSyncLabel();
        return TeaModel.build(map, self);
    }

    public AuditSyncLabel setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public AuditSyncLabel setProbability(Long probability) {
        this.probability = probability;
        return this;
    }
    public Long getProbability() {
        return this.probability;
    }

    public AuditSyncLabel setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AuditSyncLabel setRiskWords(String riskWords) {
        this.riskWords = riskWords;
        return this;
    }
    public String getRiskWords() {
        return this.riskWords;
    }

}
