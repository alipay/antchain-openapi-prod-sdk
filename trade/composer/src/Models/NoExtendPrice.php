<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TRADE\Models;

use AlibabaCloud\Tea\Model;

class NoExtendPrice extends Model
{
    // 定价条件
    /**
     * @example
     *
     * @var PriceConditionAttr[]
     */
    public $conditionAttrs;

    // 阶梯开始
    /**
     * @example 0
     *
     * @var string
     */
    public $ladderStart;

    // 阶梯结束
    /**
     * @example infinity
     *
     * @var string
     */
    public $ladderEnd;

    // 签约价
    /**
     * @example 100
     *
     * @var string
     */
    public $price;

    // 计价方法：具体公式、阶梯方法、自定义
    /**
     * @example nonAccDiffFullCalculation
     *
     * @var string
     */
    public $pricingMethod;

    // 阶梯区间类型，左开右闭/左闭右开
    /**
     * @example LCRO
     *
     * @var string
     */
    public $ladderIntervalType;

    // 定价对象code
    /**
     * @example SYS_USAGE_AMOUNT
     *
     * @var string
     */
    public $priceObjectCode;

    // 计价模式：公式、阶梯、自定义
    /**
     * @example ladder
     *
     * @var string
     */
    public $pricingMode;

    // 价格单位
    /**
     * @example 元/次
     *
     * @var string
     */
    public $unit;

    // 是否阶梯总价
    /**
     * @example true, false
     *
     * @var bool
     */
    public $ladderPriceFixed;
    protected $_name = [
        'conditionAttrs'     => 'condition_attrs',
        'ladderStart'        => 'ladder_start',
        'ladderEnd'          => 'ladder_end',
        'price'              => 'price',
        'pricingMethod'      => 'pricing_method',
        'ladderIntervalType' => 'ladder_interval_type',
        'priceObjectCode'    => 'price_object_code',
        'pricingMode'        => 'pricing_mode',
        'unit'               => 'unit',
        'ladderPriceFixed'   => 'ladder_price_fixed',
    ];

    public function validate()
    {
        Model::validateRequired('ladderStart', $this->ladderStart, true);
        Model::validateRequired('ladderEnd', $this->ladderEnd, true);
        Model::validateRequired('price', $this->price, true);
        Model::validateRequired('pricingMethod', $this->pricingMethod, true);
        Model::validateRequired('ladderIntervalType', $this->ladderIntervalType, true);
        Model::validateRequired('priceObjectCode', $this->priceObjectCode, true);
        Model::validateRequired('pricingMode', $this->pricingMode, true);
        Model::validateRequired('unit', $this->unit, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->conditionAttrs) {
            $res['condition_attrs'] = [];
            if (null !== $this->conditionAttrs && \is_array($this->conditionAttrs)) {
                $n = 0;
                foreach ($this->conditionAttrs as $item) {
                    $res['condition_attrs'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->ladderStart) {
            $res['ladder_start'] = $this->ladderStart;
        }
        if (null !== $this->ladderEnd) {
            $res['ladder_end'] = $this->ladderEnd;
        }
        if (null !== $this->price) {
            $res['price'] = $this->price;
        }
        if (null !== $this->pricingMethod) {
            $res['pricing_method'] = $this->pricingMethod;
        }
        if (null !== $this->ladderIntervalType) {
            $res['ladder_interval_type'] = $this->ladderIntervalType;
        }
        if (null !== $this->priceObjectCode) {
            $res['price_object_code'] = $this->priceObjectCode;
        }
        if (null !== $this->pricingMode) {
            $res['pricing_mode'] = $this->pricingMode;
        }
        if (null !== $this->unit) {
            $res['unit'] = $this->unit;
        }
        if (null !== $this->ladderPriceFixed) {
            $res['ladder_price_fixed'] = $this->ladderPriceFixed;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NoExtendPrice
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['condition_attrs'])) {
            if (!empty($map['condition_attrs'])) {
                $model->conditionAttrs = [];
                $n                     = 0;
                foreach ($map['condition_attrs'] as $item) {
                    $model->conditionAttrs[$n++] = null !== $item ? PriceConditionAttr::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['ladder_start'])) {
            $model->ladderStart = $map['ladder_start'];
        }
        if (isset($map['ladder_end'])) {
            $model->ladderEnd = $map['ladder_end'];
        }
        if (isset($map['price'])) {
            $model->price = $map['price'];
        }
        if (isset($map['pricing_method'])) {
            $model->pricingMethod = $map['pricing_method'];
        }
        if (isset($map['ladder_interval_type'])) {
            $model->ladderIntervalType = $map['ladder_interval_type'];
        }
        if (isset($map['price_object_code'])) {
            $model->priceObjectCode = $map['price_object_code'];
        }
        if (isset($map['pricing_mode'])) {
            $model->pricingMode = $map['pricing_mode'];
        }
        if (isset($map['unit'])) {
            $model->unit = $map['unit'];
        }
        if (isset($map['ladder_price_fixed'])) {
            $model->ladderPriceFixed = $map['ladder_price_fixed'];
        }

        return $model;
    }
}
