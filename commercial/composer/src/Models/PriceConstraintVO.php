<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COMMERCIAL\Models;

use AlibabaCloud\Tea\Model;

class PriceConstraintVO extends Model
{
    // 规格条件Code
    /**
     * @example durationUnit
     *
     * @var string
     */
    public $specConditionCode;

    // 当前规格条件下可选值
    /**
     * @example year
     *
     * @var string
     */
    public $targetValue;

    // 基础价格
    /**
     * @example 10
     *
     * @var string
     */
    public $basePrice;

    // bd价格
    /**
     * @example 10
     *
     * @var string
     */
    public $bdPrice;

    // 成本价格
    /**
     * @example 10
     *
     * @var string
     */
    public $costPrice;
    protected $_name = [
        'specConditionCode' => 'spec_condition_code',
        'targetValue'       => 'target_value',
        'basePrice'         => 'base_price',
        'bdPrice'           => 'bd_price',
        'costPrice'         => 'cost_price',
    ];

    public function validate()
    {
        Model::validateRequired('specConditionCode', $this->specConditionCode, true);
        Model::validateRequired('targetValue', $this->targetValue, true);
        Model::validateRequired('basePrice', $this->basePrice, true);
        Model::validateRequired('bdPrice', $this->bdPrice, true);
        Model::validateRequired('costPrice', $this->costPrice, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->specConditionCode) {
            $res['spec_condition_code'] = $this->specConditionCode;
        }
        if (null !== $this->targetValue) {
            $res['target_value'] = $this->targetValue;
        }
        if (null !== $this->basePrice) {
            $res['base_price'] = $this->basePrice;
        }
        if (null !== $this->bdPrice) {
            $res['bd_price'] = $this->bdPrice;
        }
        if (null !== $this->costPrice) {
            $res['cost_price'] = $this->costPrice;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PriceConstraintVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['spec_condition_code'])) {
            $model->specConditionCode = $map['spec_condition_code'];
        }
        if (isset($map['target_value'])) {
            $model->targetValue = $map['target_value'];
        }
        if (isset($map['base_price'])) {
            $model->basePrice = $map['base_price'];
        }
        if (isset($map['bd_price'])) {
            $model->bdPrice = $map['bd_price'];
        }
        if (isset($map['cost_price'])) {
            $model->costPrice = $map['cost_price'];
        }

        return $model;
    }
}
