<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class EmissionsReductionStatistics extends Model
{
    // 减排措施类型，可选值：EnergySubstitution-能源替代，SelfDefining-自定义
    /**
     * @example EnergySubstitution
     *
     * @var string
     */
    public $reductionType;

    // 减排措施名称
    /**
     * @example 使用绿电
     *
     * @var string
     */
    public $reductionMeasureName;

    // 减排方案编码
    /**
     * @example 202109111231231231232
     *
     * @var string
     */
    public $reductionProposalNo;

    // 减排量
    /**
     * @example 123123.11
     *
     * @var int
     */
    public $reductionEmissions;

    // 减排量单位
    /**
     * @example tCO2e
     *
     * @var string
     */
    public $unit;
    protected $_name = [
        'reductionType'        => 'reduction_type',
        'reductionMeasureName' => 'reduction_measure_name',
        'reductionProposalNo'  => 'reduction_proposal_no',
        'reductionEmissions'   => 'reduction_emissions',
        'unit'                 => 'unit',
    ];

    public function validate()
    {
        Model::validateRequired('reductionType', $this->reductionType, true);
        Model::validateRequired('reductionMeasureName', $this->reductionMeasureName, true);
        Model::validateRequired('reductionProposalNo', $this->reductionProposalNo, true);
        Model::validateRequired('reductionEmissions', $this->reductionEmissions, true);
        Model::validateRequired('unit', $this->unit, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reductionType) {
            $res['reduction_type'] = $this->reductionType;
        }
        if (null !== $this->reductionMeasureName) {
            $res['reduction_measure_name'] = $this->reductionMeasureName;
        }
        if (null !== $this->reductionProposalNo) {
            $res['reduction_proposal_no'] = $this->reductionProposalNo;
        }
        if (null !== $this->reductionEmissions) {
            $res['reduction_emissions'] = $this->reductionEmissions;
        }
        if (null !== $this->unit) {
            $res['unit'] = $this->unit;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EmissionsReductionStatistics
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['reduction_type'])) {
            $model->reductionType = $map['reduction_type'];
        }
        if (isset($map['reduction_measure_name'])) {
            $model->reductionMeasureName = $map['reduction_measure_name'];
        }
        if (isset($map['reduction_proposal_no'])) {
            $model->reductionProposalNo = $map['reduction_proposal_no'];
        }
        if (isset($map['reduction_emissions'])) {
            $model->reductionEmissions = $map['reduction_emissions'];
        }
        if (isset($map['unit'])) {
            $model->unit = $map['unit'];
        }

        return $model;
    }
}
