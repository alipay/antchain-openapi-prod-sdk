<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PCC\Models;

use AlibabaCloud\Tea\Model;

class PriceLimitStrategyDTO extends Model
{
    // 创建人
    /**
     * @example test
     *
     * @var string
     */
    public $creator;

    // 修改人
    /**
     * @example test
     *
     * @var string
     */
    public $modifier;

    // 是否删除
    /**
     * @example true, false
     *
     * @var bool
     */
    public $deleted;

    // 定价计划ID
    /**
     * @example 0,1
     *
     * @var int
     */
    public $pricePlanId;

    // 保底周期,year年、month月
    /**
     * @example test
     *
     * @var string
     */
    public $durationType;

    // 保底价格
    /**
     * @example test
     *
     * @var string
     */
    public $guaranteePrice;

    // 产品成本
    /**
     * @example test
     *
     * @var string
     */
    public $guaranteeCostPrice;
    protected $_name = [
        'creator'            => 'creator',
        'modifier'           => 'modifier',
        'deleted'            => 'deleted',
        'pricePlanId'        => 'price_plan_id',
        'durationType'       => 'duration_type',
        'guaranteePrice'     => 'guarantee_price',
        'guaranteeCostPrice' => 'guarantee_cost_price',
    ];

    public function validate()
    {
        Model::validateRequired('pricePlanId', $this->pricePlanId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->creator) {
            $res['creator'] = $this->creator;
        }
        if (null !== $this->modifier) {
            $res['modifier'] = $this->modifier;
        }
        if (null !== $this->deleted) {
            $res['deleted'] = $this->deleted;
        }
        if (null !== $this->pricePlanId) {
            $res['price_plan_id'] = $this->pricePlanId;
        }
        if (null !== $this->durationType) {
            $res['duration_type'] = $this->durationType;
        }
        if (null !== $this->guaranteePrice) {
            $res['guarantee_price'] = $this->guaranteePrice;
        }
        if (null !== $this->guaranteeCostPrice) {
            $res['guarantee_cost_price'] = $this->guaranteeCostPrice;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PriceLimitStrategyDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['creator'])) {
            $model->creator = $map['creator'];
        }
        if (isset($map['modifier'])) {
            $model->modifier = $map['modifier'];
        }
        if (isset($map['deleted'])) {
            $model->deleted = $map['deleted'];
        }
        if (isset($map['price_plan_id'])) {
            $model->pricePlanId = $map['price_plan_id'];
        }
        if (isset($map['duration_type'])) {
            $model->durationType = $map['duration_type'];
        }
        if (isset($map['guarantee_price'])) {
            $model->guaranteePrice = $map['guarantee_price'];
        }
        if (isset($map['guarantee_cost_price'])) {
            $model->guaranteeCostPrice = $map['guarantee_cost_price'];
        }

        return $model;
    }
}
