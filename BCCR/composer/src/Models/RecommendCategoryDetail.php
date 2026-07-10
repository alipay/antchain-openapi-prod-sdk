<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class RecommendCategoryDetail extends Model
{
    // 推荐分类类型
    /**
     * @example ART
     *
     * @var string
     */
    public $recommendWorkCategory;

    // 作品类型相似度，保留2位小数
    /**
     * @example 0.95
     *
     * @var string
     */
    public $categorySimilarRatio;

    // 作品类型风险等级
    /**
     * @example LOW
     *
     * @var string
     */
    public $categoryRiskRank;
    protected $_name = [
        'recommendWorkCategory' => 'recommend_work_category',
        'categorySimilarRatio'  => 'category_similar_ratio',
        'categoryRiskRank'      => 'category_risk_rank',
    ];

    public function validate()
    {
        Model::validateRequired('recommendWorkCategory', $this->recommendWorkCategory, true);
        Model::validateRequired('categorySimilarRatio', $this->categorySimilarRatio, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->recommendWorkCategory) {
            $res['recommend_work_category'] = $this->recommendWorkCategory;
        }
        if (null !== $this->categorySimilarRatio) {
            $res['category_similar_ratio'] = $this->categorySimilarRatio;
        }
        if (null !== $this->categoryRiskRank) {
            $res['category_risk_rank'] = $this->categoryRiskRank;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RecommendCategoryDetail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['recommend_work_category'])) {
            $model->recommendWorkCategory = $map['recommend_work_category'];
        }
        if (isset($map['category_similar_ratio'])) {
            $model->categorySimilarRatio = $map['category_similar_ratio'];
        }
        if (isset($map['category_risk_rank'])) {
            $model->categoryRiskRank = $map['category_risk_rank'];
        }

        return $model;
    }
}
