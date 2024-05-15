<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class EnterpriseLcaStageAssessmentItem extends Model
{
    // LCA阶段
    /**
     * @example ProductManufacture
     *
     * @var string
     */
    public $lcaStage;

    // 阶段排放占比
    /**
     * @example 1
     *
     * @var string
     */
    public $lcaStageCarbonRate;

    // 阶段排放量
    /**
     * @example 123.12
     *
     * @var string
     */
    public $lcaStageCarbonEmissions;

    // 阶段评估明细数据
    /**
     * @example
     *
     * @var EnterpriseLcaAssessmentItem[]
     */
    public $lcaAssessmentDatum;
    protected $_name = [
        'lcaStage'                => 'lca_stage',
        'lcaStageCarbonRate'      => 'lca_stage_carbon_rate',
        'lcaStageCarbonEmissions' => 'lca_stage_carbon_emissions',
        'lcaAssessmentDatum'      => 'lca_assessment_datum',
    ];

    public function validate()
    {
        Model::validateRequired('lcaStage', $this->lcaStage, true);
        Model::validateRequired('lcaStageCarbonRate', $this->lcaStageCarbonRate, true);
        Model::validateRequired('lcaStageCarbonEmissions', $this->lcaStageCarbonEmissions, true);
        Model::validateRequired('lcaAssessmentDatum', $this->lcaAssessmentDatum, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->lcaStage) {
            $res['lca_stage'] = $this->lcaStage;
        }
        if (null !== $this->lcaStageCarbonRate) {
            $res['lca_stage_carbon_rate'] = $this->lcaStageCarbonRate;
        }
        if (null !== $this->lcaStageCarbonEmissions) {
            $res['lca_stage_carbon_emissions'] = $this->lcaStageCarbonEmissions;
        }
        if (null !== $this->lcaAssessmentDatum) {
            $res['lca_assessment_datum'] = [];
            if (null !== $this->lcaAssessmentDatum && \is_array($this->lcaAssessmentDatum)) {
                $n = 0;
                foreach ($this->lcaAssessmentDatum as $item) {
                    $res['lca_assessment_datum'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EnterpriseLcaStageAssessmentItem
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['lca_stage'])) {
            $model->lcaStage = $map['lca_stage'];
        }
        if (isset($map['lca_stage_carbon_rate'])) {
            $model->lcaStageCarbonRate = $map['lca_stage_carbon_rate'];
        }
        if (isset($map['lca_stage_carbon_emissions'])) {
            $model->lcaStageCarbonEmissions = $map['lca_stage_carbon_emissions'];
        }
        if (isset($map['lca_assessment_datum'])) {
            if (!empty($map['lca_assessment_datum'])) {
                $model->lcaAssessmentDatum = [];
                $n                         = 0;
                foreach ($map['lca_assessment_datum'] as $item) {
                    $model->lcaAssessmentDatum[$n++] = null !== $item ? EnterpriseLcaAssessmentItem::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
