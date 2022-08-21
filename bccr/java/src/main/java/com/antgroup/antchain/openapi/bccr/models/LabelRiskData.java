// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class LabelRiskData extends TeaModel {
    // 识别结果
    @NameInMap("code")
    @Validation(required = true)
    public Long code;

    // 识别出的标签名称
    @NameInMap("label_name")
    @Validation(required = true)
    public String labelName;

    // 识别出的标签是否与用户选择的标签匹配
    @NameInMap("is_risk")
    @Validation(required = true)
    public Boolean isRisk;

    // 识别出的标签匹配度百分比
    @NameInMap("similar_value")
    @Validation(required = true)
    public String similarValue;

    // 风险等级
    @NameInMap("risk_level")
    @Validation(required = true)
    public Long riskLevel;

    public static LabelRiskData build(java.util.Map<String, ?> map) throws Exception {
        LabelRiskData self = new LabelRiskData();
        return TeaModel.build(map, self);
    }

    public LabelRiskData setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public LabelRiskData setLabelName(String labelName) {
        this.labelName = labelName;
        return this;
    }
    public String getLabelName() {
        return this.labelName;
    }

    public LabelRiskData setIsRisk(Boolean isRisk) {
        this.isRisk = isRisk;
        return this;
    }
    public Boolean getIsRisk() {
        return this.isRisk;
    }

    public LabelRiskData setSimilarValue(String similarValue) {
        this.similarValue = similarValue;
        return this;
    }
    public String getSimilarValue() {
        return this.similarValue;
    }

    public LabelRiskData setRiskLevel(Long riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public Long getRiskLevel() {
        return this.riskLevel;
    }

}
