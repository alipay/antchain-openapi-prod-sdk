// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class ContentRiskData extends TeaModel {
    // 识别结果
    @NameInMap("code")
    @Validation(required = true)
    public Long code;

    // 内容类型
    @NameInMap("content_type")
    @Validation(required = true)
    public String contentType;

    // 风险名称
    @NameInMap("risk_name")
    @Validation(required = true)
    public String riskName;

    // 风险等级
    @NameInMap("risk_level")
    @Validation(required = true)
    public Long riskLevel;

    // 风险评分
    @NameInMap("risk_score")
    @Validation(required = true)
    public Long riskScore;

    public static ContentRiskData build(java.util.Map<String, ?> map) throws Exception {
        ContentRiskData self = new ContentRiskData();
        return TeaModel.build(map, self);
    }

    public ContentRiskData setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ContentRiskData setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public ContentRiskData setRiskName(String riskName) {
        this.riskName = riskName;
        return this;
    }
    public String getRiskName() {
        return this.riskName;
    }

    public ContentRiskData setRiskLevel(Long riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public Long getRiskLevel() {
        return this.riskLevel;
    }

    public ContentRiskData setRiskScore(Long riskScore) {
        this.riskScore = riskScore;
        return this;
    }
    public Long getRiskScore() {
        return this.riskScore;
    }

}
