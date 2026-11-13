<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CREATIVE\Models;

use AlibabaCloud\Tea\Model;

class RequestItems extends Model {
    protected $_name = [
        'priceRuleCode' => 'price_rule_code',
        'chargeItemCode' => 'charge_item_code',
        'metricType' => 'metric_type',
        'quantity' => 'quantity',
        'freeQuota' => 'free_quota',
        'billableQuantity' => 'billable_quantity',
        'unitSize' => 'unit_size',
        'unitPrice' => 'unit_price',
        'currency' => 'currency',
        'amount' => 'amount',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->priceRuleCode) {
            $res['price_rule_code'] = $this->priceRuleCode;
        }
        if (null !== $this->chargeItemCode) {
            $res['charge_item_code'] = $this->chargeItemCode;
        }
        if (null !== $this->metricType) {
            $res['metric_type'] = $this->metricType;
        }
        if (null !== $this->quantity) {
            $res['quantity'] = $this->quantity;
        }
        if (null !== $this->freeQuota) {
            $res['free_quota'] = $this->freeQuota;
        }
        if (null !== $this->billableQuantity) {
            $res['billable_quantity'] = $this->billableQuantity;
        }
        if (null !== $this->unitSize) {
            $res['unit_size'] = $this->unitSize;
        }
        if (null !== $this->unitPrice) {
            $res['unit_price'] = $this->unitPrice;
        }
        if (null !== $this->currency) {
            $res['currency'] = $this->currency;
        }
        if (null !== $this->amount) {
            $res['amount'] = $this->amount;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return RequestItems
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['price_rule_code'])){
            $model->priceRuleCode = $map['price_rule_code'];
        }
        if(isset($map['charge_item_code'])){
            $model->chargeItemCode = $map['charge_item_code'];
        }
        if(isset($map['metric_type'])){
            $model->metricType = $map['metric_type'];
        }
        if(isset($map['quantity'])){
            $model->quantity = $map['quantity'];
        }
        if(isset($map['free_quota'])){
            $model->freeQuota = $map['free_quota'];
        }
        if(isset($map['billable_quantity'])){
            $model->billableQuantity = $map['billable_quantity'];
        }
        if(isset($map['unit_size'])){
            $model->unitSize = $map['unit_size'];
        }
        if(isset($map['unit_price'])){
            $model->unitPrice = $map['unit_price'];
        }
        if(isset($map['currency'])){
            $model->currency = $map['currency'];
        }
        if(isset($map['amount'])){
            $model->amount = $map['amount'];
        }
        return $model;
    }
    // 规则编码
    /**
     * @example 规则编码
     * @var string
     */
    public $priceRuleCode;

    // 收费项编码
    /**
     * @example 收费项编码
     * @var string
     */
    public $chargeItemCode;

    // 计量指标类型
    /**
     * @example 计量指标类型
     * @var string
     */
    public $metricType;

    // 原始计量数量
    /**
     * @example 原始计量数量
     * @var string
     */
    public $quantity;

    // 免费额度
    /**
     * @example 免费额度
     * @var string
     */
    public $freeQuota;

    // 计费数量（扣除免费额度后的值）
    /**
     * @example 计费数量（扣除免费额度后的值）
     * @var string
     */
    public $billableQuantity;

    // 计费单位大小
    /**
     * @example 计费单位大小
     * @var string
     */
    public $unitSize;

    // 单价
    /**
     * @example 单价
     * @var string
     */
    public $unitPrice;

    // 币种
    /**
     * @example 币种
     * @var string
     */
    public $currency;

    // 单项金额
    /**
     * @example 单项金额
     * @var string
     */
    public $amount;

}
