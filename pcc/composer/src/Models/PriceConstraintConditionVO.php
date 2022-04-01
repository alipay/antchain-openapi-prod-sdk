<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PCC\Models;

use AlibabaCloud\Tea\Model;

class PriceConstraintConditionVO extends Model
{
    // 约束ID
    /**
     * @example
     *
     * @var int
     */
    public $id;

    // 价格约束ID
    /**
     * @example
     *
     * @var int
     */
    public $priceConstraintId;

    // 规格条件CODE
    /**
     * @example test
     *
     * @var string
     */
    public $specConditionCode;

    // 条件关系比较符
    /**
     * @example test
     *
     * @var string
     */
    public $operator;

    // 待比较对象的值
    /**
     * @example test
     *
     * @var string
     */
    public $targetValue;

    // 特定场景下set才会有值
    /**
     * @example test
     *
     * @var string
     */
    public $specConditionName;

    // 特定场景下set才会有值
    /**
     * @example test
     *
     * @var string
     */
    public $targetValueName;

    // 描述
    /**
     * @example test
     *
     * @var string
     */
    public $description;
    protected $_name = [
        'id'                => 'id',
        'priceConstraintId' => 'price_constraint_id',
        'specConditionCode' => 'spec_condition_code',
        'operator'          => 'operator',
        'targetValue'       => 'target_value',
        'specConditionName' => 'spec_condition_name',
        'targetValueName'   => 'target_value_name',
        'description'       => 'description',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('priceConstraintId', $this->priceConstraintId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->priceConstraintId) {
            $res['price_constraint_id'] = $this->priceConstraintId;
        }
        if (null !== $this->specConditionCode) {
            $res['spec_condition_code'] = $this->specConditionCode;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->targetValue) {
            $res['target_value'] = $this->targetValue;
        }
        if (null !== $this->specConditionName) {
            $res['spec_condition_name'] = $this->specConditionName;
        }
        if (null !== $this->targetValueName) {
            $res['target_value_name'] = $this->targetValueName;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PriceConstraintConditionVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['price_constraint_id'])) {
            $model->priceConstraintId = $map['price_constraint_id'];
        }
        if (isset($map['spec_condition_code'])) {
            $model->specConditionCode = $map['spec_condition_code'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['target_value'])) {
            $model->targetValue = $map['target_value'];
        }
        if (isset($map['spec_condition_name'])) {
            $model->specConditionName = $map['spec_condition_name'];
        }
        if (isset($map['target_value_name'])) {
            $model->targetValueName = $map['target_value_name'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }

        return $model;
    }
}
