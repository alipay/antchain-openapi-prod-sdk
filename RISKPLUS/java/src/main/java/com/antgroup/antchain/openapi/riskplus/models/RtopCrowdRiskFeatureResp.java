// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class RtopCrowdRiskFeatureResp extends TeaModel {
    // 特征标签列表
    @NameInMap("clue_tags")
    public java.util.List<RtopCrowdRiskFeatureTag> clueTags;

    // 特征名称
    @NameInMap("feature_name")
    @Validation(required = true)
    public String featureName;

    // 特征​分数
    @NameInMap("score")
    @Validation(required = true)
    public Integer score;

    public static RtopCrowdRiskFeatureResp build(java.util.Map<String, ?> map) throws Exception {
        RtopCrowdRiskFeatureResp self = new RtopCrowdRiskFeatureResp();
        return TeaModel.build(map, self);
    }

    public RtopCrowdRiskFeatureResp setClueTags(java.util.List<RtopCrowdRiskFeatureTag> clueTags) {
        this.clueTags = clueTags;
        return this;
    }
    public java.util.List<RtopCrowdRiskFeatureTag> getClueTags() {
        return this.clueTags;
    }

    public RtopCrowdRiskFeatureResp setFeatureName(String featureName) {
        this.featureName = featureName;
        return this;
    }
    public String getFeatureName() {
        return this.featureName;
    }

    public RtopCrowdRiskFeatureResp setScore(Integer score) {
        this.score = score;
        return this;
    }
    public Integer getScore() {
        return this.score;
    }

}
