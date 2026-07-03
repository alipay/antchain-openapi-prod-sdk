<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class RtopCrowdRiskFeatureResp extends Model
{
    // 特征标签列表
    /**
     * @example
     *
     * @var RtopCrowdRiskFeatureTag[]
     */
    public $clueTags;

    // 特征名称
    /**
     * @example 工商风险维度
     *
     * @var string
     */
    public $featureName;

    // 特征分数
    /**
     * @example 10
     *
     * @var int
     */
    public $score;
    protected $_name = [
        'clueTags'    => 'clue_tags',
        'featureName' => 'feature_name',
        'score'       => 'score',
    ];

    public function validate()
    {
        Model::validateRequired('featureName', $this->featureName, true);
        Model::validateRequired('score', $this->score, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->clueTags) {
            $res['clue_tags'] = [];
            if (null !== $this->clueTags && \is_array($this->clueTags)) {
                $n = 0;
                foreach ($this->clueTags as $item) {
                    $res['clue_tags'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->featureName) {
            $res['feature_name'] = $this->featureName;
        }
        if (null !== $this->score) {
            $res['score'] = $this->score;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RtopCrowdRiskFeatureResp
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['clue_tags'])) {
            if (!empty($map['clue_tags'])) {
                $model->clueTags = [];
                $n               = 0;
                foreach ($map['clue_tags'] as $item) {
                    $model->clueTags[$n++] = null !== $item ? RtopCrowdRiskFeatureTag::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['feature_name'])) {
            $model->featureName = $map['feature_name'];
        }
        if (isset($map['score'])) {
            $model->score = $map['score'];
        }

        return $model;
    }
}
