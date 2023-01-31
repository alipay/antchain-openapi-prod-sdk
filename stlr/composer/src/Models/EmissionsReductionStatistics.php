<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class EmissionsReductionStatistics extends Model
{
    // 减排方法
    /**
     * @example EnergySubstitution
     *
     * @var string
     */
    public $reductionMethod;

    // 减排方法名称
    /**
     * @example 使用绿电
     *
     * @var string
     */
    public $reductionMethodName;

    // 减排量
    /**
     * @example 123123.11
     *
     * @var string
     */
    public $reductionAmount;

    // 减排量占比
    /**
     * @example 0.22
     *
     * @var string
     */
    public $reductionRatio;

    // 减排量单位
    /**
     * @example tCO2e
     *
     * @var string
     */
    public $dataUnit;
    protected $_name = [
        'reductionMethod'     => 'reduction_method',
        'reductionMethodName' => 'reduction_method_name',
        'reductionAmount'     => 'reduction_amount',
        'reductionRatio'      => 'reduction_ratio',
        'dataUnit'            => 'data_unit',
    ];

    public function validate()
    {
        Model::validateRequired('reductionMethod', $this->reductionMethod, true);
        Model::validateRequired('reductionMethodName', $this->reductionMethodName, true);
        Model::validateRequired('reductionAmount', $this->reductionAmount, true);
        Model::validateRequired('reductionRatio', $this->reductionRatio, true);
        Model::validateRequired('dataUnit', $this->dataUnit, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reductionMethod) {
            $res['reduction_method'] = $this->reductionMethod;
        }
        if (null !== $this->reductionMethodName) {
            $res['reduction_method_name'] = $this->reductionMethodName;
        }
        if (null !== $this->reductionAmount) {
            $res['reduction_amount'] = $this->reductionAmount;
        }
        if (null !== $this->reductionRatio) {
            $res['reduction_ratio'] = $this->reductionRatio;
        }
        if (null !== $this->dataUnit) {
            $res['data_unit'] = $this->dataUnit;
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
        if (isset($map['reduction_method'])) {
            $model->reductionMethod = $map['reduction_method'];
        }
        if (isset($map['reduction_method_name'])) {
            $model->reductionMethodName = $map['reduction_method_name'];
        }
        if (isset($map['reduction_amount'])) {
            $model->reductionAmount = $map['reduction_amount'];
        }
        if (isset($map['reduction_ratio'])) {
            $model->reductionRatio = $map['reduction_ratio'];
        }
        if (isset($map['data_unit'])) {
            $model->dataUnit = $map['data_unit'];
        }

        return $model;
    }
}
