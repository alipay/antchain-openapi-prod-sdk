// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class RecommendCategoryDetail extends TeaModel {
    // 推荐分类类型
    /**
     * <strong>example:</strong>
     * <p>ART</p>
     */
    @NameInMap("recommend_work_category")
    @Validation(required = true)
    public String recommendWorkCategory;

    // 作品类型相似度，保留2位小数
    /**
     * <strong>example:</strong>
     * <p>0.95</p>
     */
    @NameInMap("category_similar_ratio")
    @Validation(required = true)
    public String categorySimilarRatio;

    // 作品类型风险等级
    /**
     * <strong>example:</strong>
     * <p>LOW</p>
     */
    @NameInMap("category_risk_rank")
    public String categoryRiskRank;

    public static RecommendCategoryDetail build(java.util.Map<String, ?> map) throws Exception {
        RecommendCategoryDetail self = new RecommendCategoryDetail();
        return TeaModel.build(map, self);
    }

    public RecommendCategoryDetail setRecommendWorkCategory(String recommendWorkCategory) {
        this.recommendWorkCategory = recommendWorkCategory;
        return this;
    }
    public String getRecommendWorkCategory() {
        return this.recommendWorkCategory;
    }

    public RecommendCategoryDetail setCategorySimilarRatio(String categorySimilarRatio) {
        this.categorySimilarRatio = categorySimilarRatio;
        return this;
    }
    public String getCategorySimilarRatio() {
        return this.categorySimilarRatio;
    }

    public RecommendCategoryDetail setCategoryRiskRank(String categoryRiskRank) {
        this.categoryRiskRank = categoryRiskRank;
        return this;
    }
    public String getCategoryRiskRank() {
        return this.categoryRiskRank;
    }

}
