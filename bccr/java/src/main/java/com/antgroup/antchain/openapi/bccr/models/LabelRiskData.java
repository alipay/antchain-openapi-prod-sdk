// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class LabelRiskData extends TeaModel {
    // 识别出的标签名称
    /**
     * <strong>example:</strong>
     * <p>识别出的标签名称</p>
     */
    @NameInMap("label_name")
    @Validation(required = true)
    public String labelName;

    // 识别出的标签是否与用户选择的标签匹配
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("is_match")
    @Validation(required = true)
    public Boolean isMatch;

    // 识别出的标签匹配度
    /**
     * <strong>example:</strong>
     * <p>识别出的标签匹配度</p>
     */
    @NameInMap("match_value")
    @Validation(required = true)
    public String matchValue;

    public static LabelRiskData build(java.util.Map<String, ?> map) throws Exception {
        LabelRiskData self = new LabelRiskData();
        return TeaModel.build(map, self);
    }

    public LabelRiskData setLabelName(String labelName) {
        this.labelName = labelName;
        return this;
    }
    public String getLabelName() {
        return this.labelName;
    }

    public LabelRiskData setIsMatch(Boolean isMatch) {
        this.isMatch = isMatch;
        return this;
    }
    public Boolean getIsMatch() {
        return this.isMatch;
    }

    public LabelRiskData setMatchValue(String matchValue) {
        this.matchValue = matchValue;
        return this;
    }
    public String getMatchValue() {
        return this.matchValue;
    }

}
