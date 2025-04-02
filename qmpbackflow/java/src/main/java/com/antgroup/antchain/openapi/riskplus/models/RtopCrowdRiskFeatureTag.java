// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class RtopCrowdRiskFeatureTag extends TeaModel {
    // 标签描述
    @NameInMap("tag_explanation")
    @Validation(required = true)
    public String tagExplanation;

    // 标签名称
    @NameInMap("tag_name")
    @Validation(required = true)
    public String tagName;

    public static RtopCrowdRiskFeatureTag build(java.util.Map<String, ?> map) throws Exception {
        RtopCrowdRiskFeatureTag self = new RtopCrowdRiskFeatureTag();
        return TeaModel.build(map, self);
    }

    public RtopCrowdRiskFeatureTag setTagExplanation(String tagExplanation) {
        this.tagExplanation = tagExplanation;
        return this;
    }
    public String getTagExplanation() {
        return this.tagExplanation;
    }

    public RtopCrowdRiskFeatureTag setTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }
    public String getTagName() {
        return this.tagName;
    }

}
