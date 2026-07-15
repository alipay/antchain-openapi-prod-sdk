// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energytool.models;

import com.aliyun.tea.*;

public class SimilarDayAnalysisData extends TeaModel {
    // 综合相似度，单位%
    /**
     * <strong>example:</strong>
     * <p>10.0</p>
     */
    @NameInMap("com_similar_value")
    @Validation(required = true)
    public String comSimilarValue;

    // 特征相似度，单位%
    /**
     * <strong>example:</strong>
     * <p>10.0</p>
     */
    @NameInMap("feature_similar_value")
    @Validation(required = true)
    public String featureSimilarValue;

    // 特征数据列表
    @NameInMap("similar_feature_data")
    @Validation(required = true)
    public java.util.List<SimilarFeatureData> similarFeatureData;

    public static SimilarDayAnalysisData build(java.util.Map<String, ?> map) throws Exception {
        SimilarDayAnalysisData self = new SimilarDayAnalysisData();
        return TeaModel.build(map, self);
    }

    public SimilarDayAnalysisData setComSimilarValue(String comSimilarValue) {
        this.comSimilarValue = comSimilarValue;
        return this;
    }
    public String getComSimilarValue() {
        return this.comSimilarValue;
    }

    public SimilarDayAnalysisData setFeatureSimilarValue(String featureSimilarValue) {
        this.featureSimilarValue = featureSimilarValue;
        return this;
    }
    public String getFeatureSimilarValue() {
        return this.featureSimilarValue;
    }

    public SimilarDayAnalysisData setSimilarFeatureData(java.util.List<SimilarFeatureData> similarFeatureData) {
        this.similarFeatureData = similarFeatureData;
        return this;
    }
    public java.util.List<SimilarFeatureData> getSimilarFeatureData() {
        return this.similarFeatureData;
    }

}
