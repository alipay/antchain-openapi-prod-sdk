<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

class PriceDetailDTO extends Model {
    protected $_name = [
        'constraintId' => 'constraint_id',
        'chargeItem' => 'charge_item',
        'stageLevel' => 'stage_level',
        'provider' => 'provider',
        'basePrice' => 'base_price',
        'bdPrice' => 'bd_price',
        'costPrice' => 'cost_price',
        'priceUnit' => 'price_unit',
        'currencyValue' => 'currency_value',
        'ladderStart' => 'ladder_start',
        'ladderEnd' => 'ladder_end',
        'pricePlanId' => 'price_plan_id',
        'pricePlanName' => 'price_plan_name',
        'startTime' => 'start_time',
        'endTime' => 'end_time',
    ];
    public function validate() {
        Model::validateRequired('constraintId', $this->constraintId, true);
        Model::validateRequired('chargeItem', $this->chargeItem, true);
        Model::validateRequired('stageLevel', $this->stageLevel, true);
        Model::validateRequired('provider', $this->provider, true);
        Model::validateRequired('basePrice', $this->basePrice, true);
        Model::validateRequired('bdPrice', $this->bdPrice, true);
        Model::validateRequired('costPrice', $this->costPrice, true);
        Model::validateRequired('priceUnit', $this->priceUnit, true);
        Model::validateRequired('currencyValue', $this->currencyValue, true);
        Model::validateRequired('ladderStart', $this->ladderStart, true);
        Model::validateRequired('ladderEnd', $this->ladderEnd, true);
        Model::validateRequired('pricePlanId', $this->pricePlanId, true);
        Model::validateRequired('pricePlanName', $this->pricePlanName, true);
        Model::validateRequired('startTime', $this->startTime, true);
        Model::validateRequired('endTime', $this->endTime, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->constraintId) {
            $res['constraint_id'] = $this->constraintId;
        }
        if (null !== $this->chargeItem) {
            $res['charge_item'] = $this->chargeItem;
        }
        if (null !== $this->stageLevel) {
            $res['stage_level'] = $this->stageLevel;
        }
        if (null !== $this->provider) {
            $res['provider'] = $this->provider;
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
        if (null !== $this->priceUnit) {
            $res['price_unit'] = $this->priceUnit;
        }
        if (null !== $this->currencyValue) {
            $res['currency_value'] = $this->currencyValue;
        }
        if (null !== $this->ladderStart) {
            $res['ladder_start'] = $this->ladderStart;
        }
        if (null !== $this->ladderEnd) {
            $res['ladder_end'] = $this->ladderEnd;
        }
        if (null !== $this->pricePlanId) {
            $res['price_plan_id'] = $this->pricePlanId;
        }
        if (null !== $this->pricePlanName) {
            $res['price_plan_name'] = $this->pricePlanName;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return PriceDetailDTO
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['constraint_id'])){
            $model->constraintId = $map['constraint_id'];
        }
        if(isset($map['charge_item'])){
            $model->chargeItem = $map['charge_item'];
        }
        if(isset($map['stage_level'])){
            $model->stageLevel = $map['stage_level'];
        }
        if(isset($map['provider'])){
            $model->provider = $map['provider'];
        }
        if(isset($map['base_price'])){
            $model->basePrice = $map['base_price'];
        }
        if(isset($map['bd_price'])){
            $model->bdPrice = $map['bd_price'];
        }
        if(isset($map['cost_price'])){
            $model->costPrice = $map['cost_price'];
        }
        if(isset($map['price_unit'])){
            $model->priceUnit = $map['price_unit'];
        }
        if(isset($map['currency_value'])){
            $model->currencyValue = $map['currency_value'];
        }
        if(isset($map['ladder_start'])){
            $model->ladderStart = $map['ladder_start'];
        }
        if(isset($map['ladder_end'])){
            $model->ladderEnd = $map['ladder_end'];
        }
        if(isset($map['price_plan_id'])){
            $model->pricePlanId = $map['price_plan_id'];
        }
        if(isset($map['price_plan_name'])){
            $model->pricePlanName = $map['price_plan_name'];
        }
        if(isset($map['start_time'])){
            $model->startTime = $map['start_time'];
        }
        if(isset($map['end_time'])){
            $model->endTime = $map['end_time'];
        }
        return $model;
    }
    // 定价约束id
    /**
     * @example 1
     * @var int
     */
    public $constraintId;

    // 计费项code
    /**
     * @example IN_NO_CACHE
     * @var string
     */
    public $chargeItem;

    // 定价阶梯
    /**
     * @example L0
     * @var string
     */
    public $stageLevel;

    // 供应商
    /**
     * @example aliyun
     * @var string
     */
    public $provider;

    // 刊例价
    /**
     * @example 0.01
     * @var string
     */
    public $basePrice;

    // BD权限价
    /**
     * @example 0.1
     * @var string
     */
    public $bdPrice;

    // 底价
    /**
     * @example 0.1
     * @var string
     */
    public $costPrice;

    // 定价单位
    /**
     * @example 元
     * @var string
     */
    public $priceUnit;

    // 币种
    /**
     * @example 156
     * @var string
     */
    public $currencyValue;

    // 阶梯起始值
    /**
     * @example 0
     * @var string
     */
    public $ladderStart;

    // 阶梯结束值
    /**
     * @example 100
     * @var string
     */
    public $ladderEnd;

    // 定价id
    /**
     * @example 12344
     * @var int
     */
    public $pricePlanId;

    // 定价计划名称
    /**
     * @example 1234
     * @var string
     */
    public $pricePlanName;

    // 定价开始时间
    /**
     * @example 2026-06-01
     * @var string
     */
    public $startTime;

    // 定价结束时间
    /**
     * @example 2026-06-30
     * @var string
     */
    public $endTime;

}
