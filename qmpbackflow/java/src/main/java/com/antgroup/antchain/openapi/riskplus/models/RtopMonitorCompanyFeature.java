// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class RtopMonitorCompanyFeature extends TeaModel {
    // 特征的描述
    @NameInMap("description")
    public String description;

    // 特征的名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 特征里的风险标签列表
    @NameInMap("risk_tags")
    public java.util.List<String> riskTags;

    // 特征的评分
    @NameInMap("score")
    @Validation(required = true)
    public Integer score;

    public static RtopMonitorCompanyFeature build(java.util.Map<String, ?> map) throws Exception {
        RtopMonitorCompanyFeature self = new RtopMonitorCompanyFeature();
        return TeaModel.build(map, self);
    }

    public RtopMonitorCompanyFeature setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public RtopMonitorCompanyFeature setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public RtopMonitorCompanyFeature setRiskTags(java.util.List<String> riskTags) {
        this.riskTags = riskTags;
        return this;
    }
    public java.util.List<String> getRiskTags() {
        return this.riskTags;
    }

    public RtopMonitorCompanyFeature setScore(Integer score) {
        this.score = score;
        return this;
    }
    public Integer getScore() {
        return this.score;
    }

}
