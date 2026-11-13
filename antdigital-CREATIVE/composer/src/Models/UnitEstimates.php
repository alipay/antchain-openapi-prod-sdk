<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CREATIVE\Models;

use AlibabaCloud\Tea\Model;

use AntChain\CREATIVE\Models\RequestItems;

class UnitEstimates extends Model {
    protected $_name = [
        'unitIndex' => 'unit_index',
        'matched' => 'matched',
        'fallback' => 'fallback',
        'priceRuleCode' => 'price_rule_code',
        'matchedRuleVersion' => 'matched_rule_version',
        'ruleName' => 'rule_name',
        'priority' => 'priority',
        'items' => 'items',
        'amount' => 'amount',
        'message' => 'message',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->unitIndex) {
            $res['unit_index'] = $this->unitIndex;
        }
        if (null !== $this->matched) {
            $res['matched'] = $this->matched;
        }
        if (null !== $this->fallback) {
            $res['fallback'] = $this->fallback;
        }
        if (null !== $this->priceRuleCode) {
            $res['price_rule_code'] = $this->priceRuleCode;
        }
        if (null !== $this->matchedRuleVersion) {
            $res['matched_rule_version'] = $this->matchedRuleVersion;
        }
        if (null !== $this->ruleName) {
            $res['rule_name'] = $this->ruleName;
        }
        if (null !== $this->priority) {
            $res['priority'] = $this->priority;
        }
        if (null !== $this->items) {
            $res['items'] = [];
            if(null !== $this->items && is_array($this->items)){
                $n = 0;
                foreach($this->items as $item){
                    $res['items'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->amount) {
            $res['amount'] = $this->amount;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UnitEstimates
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['unit_index'])){
            $model->unitIndex = $map['unit_index'];
        }
        if(isset($map['matched'])){
            $model->matched = $map['matched'];
        }
        if(isset($map['fallback'])){
            $model->fallback = $map['fallback'];
        }
        if(isset($map['price_rule_code'])){
            $model->priceRuleCode = $map['price_rule_code'];
        }
        if(isset($map['matched_rule_version'])){
            $model->matchedRuleVersion = $map['matched_rule_version'];
        }
        if(isset($map['rule_name'])){
            $model->ruleName = $map['rule_name'];
        }
        if(isset($map['priority'])){
            $model->priority = $map['priority'];
        }
        if(isset($map['items'])){
            if(!empty($map['items'])){
                $model->items = [];
                $n = 0;
                foreach($map['items'] as $item) {
                    $model->items[$n++] = null !== $item ? RequestItems::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['amount'])){
            $model->amount = $map['amount'];
        }
        if(isset($map['message'])){
            $model->message = $map['message'];
        }
        return $model;
    }
    // 从 0 开始，与请求的 units[] 顺序一致
    /**
     * @example 1
     * @var int
     */
    public $unitIndex;

    // 当前单元是否命中
    /**
     * @example true
     * @var bool
     */
    public $matched;

    // 当前单元是否命中兜底规则
    /**
     * @example true
     * @var bool
     */
    public $fallback;

    // 规则编码
    /**
     * @example 规则编码
     * @var string
     */
    public $priceRuleCode;

    // 规则版本
    /**
     * @example 1
     * @var int
     */
    public $matchedRuleVersion;

    // 规则名称
    /**
     * @example 规则名称
     * @var string
     */
    public $ruleName;

    // 规则优先级
    /**
     * @example 1
     * @var int
     */
    public $priority;

    // 费用明细
    /**
     * @example undefined
     * @var RequestItems[]
     */
    public $items;

    // 当前单元金额
    /**
     * @example 当前单元金额
     * @var string
     */
    public $amount;

    // 未命中或部分命中时的提示
    /**
     * @example 未命中或部分命中时的提示
     * @var string
     */
    public $message;

}
