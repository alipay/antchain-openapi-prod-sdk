<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PCC\Models;

use AlibabaCloud\Tea\Model;

class PriceConstraintVO extends Model
{
    // 定价计划ID
    /**
     * @example 0,1
     *
     * @var int
     */
    public $id;

    // 定价计划ID
    /**
     * @example 0,1
     *
     * @var int
     */
    public $pricePlanId;

    // 定价计划名称
    /**
     * @example test
     *
     * @var string
     */
    public $name;

    // 描述
    /**
     * @example test
     *
     * @var string
     */
    public $description;

    // 约束条件列表
    /**
     * @example test
     *
     * @var PriceConstraintConditionVO[]
     */
    public $priceConstraintConditionVoList;

    // 约束结果列表
    /**
     * @example test
     *
     * @var PriceConstraintResultVO[]
     */
    public $priceConstraintResultVoList;
    protected $_name = [
        'id'                             => 'id',
        'pricePlanId'                    => 'price_plan_id',
        'name'                           => 'name',
        'description'                    => 'description',
        'priceConstraintConditionVoList' => 'price_constraint_condition_vo_list',
        'priceConstraintResultVoList'    => 'price_constraint_result_vo_list',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('pricePlanId', $this->pricePlanId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->pricePlanId) {
            $res['price_plan_id'] = $this->pricePlanId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->priceConstraintConditionVoList) {
            $res['price_constraint_condition_vo_list'] = [];
            if (null !== $this->priceConstraintConditionVoList && \is_array($this->priceConstraintConditionVoList)) {
                $n = 0;
                foreach ($this->priceConstraintConditionVoList as $item) {
                    $res['price_constraint_condition_vo_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->priceConstraintResultVoList) {
            $res['price_constraint_result_vo_list'] = [];
            if (null !== $this->priceConstraintResultVoList && \is_array($this->priceConstraintResultVoList)) {
                $n = 0;
                foreach ($this->priceConstraintResultVoList as $item) {
                    $res['price_constraint_result_vo_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
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
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['price_plan_id'])) {
            $model->pricePlanId = $map['price_plan_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['price_constraint_condition_vo_list'])) {
            if (!empty($map['price_constraint_condition_vo_list'])) {
                $model->priceConstraintConditionVoList = [];
                $n                                     = 0;
                foreach ($map['price_constraint_condition_vo_list'] as $item) {
                    $model->priceConstraintConditionVoList[$n++] = null !== $item ? PriceConstraintConditionVO::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['price_constraint_result_vo_list'])) {
            if (!empty($map['price_constraint_result_vo_list'])) {
                $model->priceConstraintResultVoList = [];
                $n                                  = 0;
                foreach ($map['price_constraint_result_vo_list'] as $item) {
                    $model->priceConstraintResultVoList[$n++] = null !== $item ? PriceConstraintResultVO::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
