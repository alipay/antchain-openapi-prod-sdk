<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PCC\Models;

use AlibabaCloud\Tea\Model;

class PriceObjectFee extends Model
{
    // 收费项CODE
    /**
     * @example test
     *
     * @var string
     */
    public $priceObjectCode;

    // 收费项名称
    /**
     * @example test
     *
     * @var string
     */
    public $priceObjectName;

    // 高精度价格12位
    /**
     * @example test
     *
     * @var string
     */
    public $price;

    // 价格类型，标准价格，一客一价
    /**
     * @example test
     *
     * @var string
     */
    public $priceType;

    // 结算信息
    /**
     * @example test
     *
     * @var string
     */
    public $settleType;

    // 币种
    /**
     * @example test
     *
     * @var string
     */
    public $currency;

    // 命中的定价计划
    /**
     * @example test
     *
     * @var PricePlanVO
     */
    public $pricePlanVo;

    // 命中的定价计划约束
    /**
     * @example test
     *
     * @var PriceConstraintVO
     */
    public $priceConstraintVo;

    // 扩展信息
    /**
     * @example test
     *
     * @var string
     */
    public $extendsMap;

    // BD销售价格区间
    /**
     * @example test
     *
     * @var string
     */
    public $bdPrice;

    // 最低成本价
    /**
     * @example test
     *
     * @var string
     */
    public $costPrice;
    protected $_name = [
        'priceObjectCode'   => 'price_object_code',
        'priceObjectName'   => 'price_object_name',
        'price'             => 'price',
        'priceType'         => 'price_type',
        'settleType'        => 'settle_type',
        'currency'          => 'currency',
        'pricePlanVo'       => 'price_plan_vo',
        'priceConstraintVo' => 'price_constraint_vo',
        'extendsMap'        => 'extends_map',
        'bdPrice'           => 'bd_price',
        'costPrice'         => 'cost_price',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->priceObjectCode) {
            $res['price_object_code'] = $this->priceObjectCode;
        }
        if (null !== $this->priceObjectName) {
            $res['price_object_name'] = $this->priceObjectName;
        }
        if (null !== $this->price) {
            $res['price'] = $this->price;
        }
        if (null !== $this->priceType) {
            $res['price_type'] = $this->priceType;
        }
        if (null !== $this->settleType) {
            $res['settle_type'] = $this->settleType;
        }
        if (null !== $this->currency) {
            $res['currency'] = $this->currency;
        }
        if (null !== $this->pricePlanVo) {
            $res['price_plan_vo'] = null !== $this->pricePlanVo ? $this->pricePlanVo->toMap() : null;
        }
        if (null !== $this->priceConstraintVo) {
            $res['price_constraint_vo'] = null !== $this->priceConstraintVo ? $this->priceConstraintVo->toMap() : null;
        }
        if (null !== $this->extendsMap) {
            $res['extends_map'] = $this->extendsMap;
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
     * @return PriceObjectFee
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['price_object_code'])) {
            $model->priceObjectCode = $map['price_object_code'];
        }
        if (isset($map['price_object_name'])) {
            $model->priceObjectName = $map['price_object_name'];
        }
        if (isset($map['price'])) {
            $model->price = $map['price'];
        }
        if (isset($map['price_type'])) {
            $model->priceType = $map['price_type'];
        }
        if (isset($map['settle_type'])) {
            $model->settleType = $map['settle_type'];
        }
        if (isset($map['currency'])) {
            $model->currency = $map['currency'];
        }
        if (isset($map['price_plan_vo'])) {
            $model->pricePlanVo = PricePlanVO::fromMap($map['price_plan_vo']);
        }
        if (isset($map['price_constraint_vo'])) {
            $model->priceConstraintVo = PriceConstraintVO::fromMap($map['price_constraint_vo']);
        }
        if (isset($map['extends_map'])) {
            $model->extendsMap = $map['extends_map'];
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
