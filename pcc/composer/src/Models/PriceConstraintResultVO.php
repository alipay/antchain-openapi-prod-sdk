<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PCC\Models;

use AlibabaCloud\Tea\Model;

class PriceConstraintResultVO extends Model
{
    // 价格id
    /**
     * @example 0,1
     *
     * @var int
     */
    public $id;

    // 价格约束ID
    /**
     * @example 0,1
     *
     * @var int
     */
    public $priceConstraintId;

    // 基础价格费率
    /**
     * @example test
     *
     * @var string
     */
    public $basePrice;

    // 基础保底价
    /**
     * @example test
     *
     * @var string
     */
    public $adjustPrice;

    // BD销售最低价费率
    /**
     * @example test
     *
     * @var string
     */
    public $bdPrice;

    // 成本价费率
    /**
     * @example test
     *
     * @var string
     */
    public $costPrice;

    // 阶梯区间最小值
    /**
     * @example test
     *
     * @var string
     */
    public $ladderStart;

    // 阶梯区间结束值
    /**
     * @example test
     *
     * @var string
     */
    public $ladderEnd;

    // 价格单位，例如：元/每次
    /**
     * @example test
     *
     * @var string
     */
    public $priceUnit;

    // 是否阶梯固定价
    /**
     * @example test
     *
     * @var bool
     */
    public $ladderPriceFixed;
    protected $_name = [
        'id'                => 'id',
        'priceConstraintId' => 'price_constraint_id',
        'basePrice'         => 'base_price',
        'adjustPrice'       => 'adjust_price',
        'bdPrice'           => 'bd_price',
        'costPrice'         => 'cost_price',
        'ladderStart'       => 'ladder_start',
        'ladderEnd'         => 'ladder_end',
        'priceUnit'         => 'price_unit',
        'ladderPriceFixed'  => 'ladder_price_fixed',
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
        if (null !== $this->basePrice) {
            $res['base_price'] = $this->basePrice;
        }
        if (null !== $this->adjustPrice) {
            $res['adjust_price'] = $this->adjustPrice;
        }
        if (null !== $this->bdPrice) {
            $res['bd_price'] = $this->bdPrice;
        }
        if (null !== $this->costPrice) {
            $res['cost_price'] = $this->costPrice;
        }
        if (null !== $this->ladderStart) {
            $res['ladder_start'] = $this->ladderStart;
        }
        if (null !== $this->ladderEnd) {
            $res['ladder_end'] = $this->ladderEnd;
        }
        if (null !== $this->priceUnit) {
            $res['price_unit'] = $this->priceUnit;
        }
        if (null !== $this->ladderPriceFixed) {
            $res['ladder_price_fixed'] = $this->ladderPriceFixed;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PriceConstraintResultVO
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
        if (isset($map['base_price'])) {
            $model->basePrice = $map['base_price'];
        }
        if (isset($map['adjust_price'])) {
            $model->adjustPrice = $map['adjust_price'];
        }
        if (isset($map['bd_price'])) {
            $model->bdPrice = $map['bd_price'];
        }
        if (isset($map['cost_price'])) {
            $model->costPrice = $map['cost_price'];
        }
        if (isset($map['ladder_start'])) {
            $model->ladderStart = $map['ladder_start'];
        }
        if (isset($map['ladder_end'])) {
            $model->ladderEnd = $map['ladder_end'];
        }
        if (isset($map['price_unit'])) {
            $model->priceUnit = $map['price_unit'];
        }
        if (isset($map['ladder_price_fixed'])) {
            $model->ladderPriceFixed = $map['ladder_price_fixed'];
        }

        return $model;
    }
}
