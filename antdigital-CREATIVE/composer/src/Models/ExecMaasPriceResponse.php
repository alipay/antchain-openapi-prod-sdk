<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CREATIVE\Models;

use AlibabaCloud\Tea\Model;

use AntChain\CREATIVE\Models\RequestItems;
use AntChain\CREATIVE\Models\UnitEstimates;

class ExecMaasPriceResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'matched' => 'matched',
        'fallback' => 'fallback',
        'priceRuleCode' => 'price_rule_code',
        'matchedRuleVersion' => 'matched_rule_version',
        'ruleName' => 'rule_name',
        'priority' => 'priority',
        'requestItems' => 'request_items',
        'unitEstimates' => 'unit_estimates',
        'totalAmount' => 'total_amount',
        'currency' => 'currency',
        'message' => 'message',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
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
        if (null !== $this->requestItems) {
            $res['request_items'] = [];
            if(null !== $this->requestItems && is_array($this->requestItems)){
                $n = 0;
                foreach($this->requestItems as $item){
                    $res['request_items'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->unitEstimates) {
            $res['unit_estimates'] = [];
            if(null !== $this->unitEstimates && is_array($this->unitEstimates)){
                $n = 0;
                foreach($this->unitEstimates as $item){
                    $res['unit_estimates'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->totalAmount) {
            $res['total_amount'] = $this->totalAmount;
        }
        if (null !== $this->currency) {
            $res['currency'] = $this->currency;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ExecMaasPriceResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['req_msg_id'])){
            $model->reqMsgId = $map['req_msg_id'];
        }
        if(isset($map['result_code'])){
            $model->resultCode = $map['result_code'];
        }
        if(isset($map['result_msg'])){
            $model->resultMsg = $map['result_msg'];
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
        if(isset($map['request_items'])){
            if(!empty($map['request_items'])){
                $model->requestItems = [];
                $n = 0;
                foreach($map['request_items'] as $item) {
                    $model->requestItems[$n++] = null !== $item ? RequestItems::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['unit_estimates'])){
            if(!empty($map['unit_estimates'])){
                $model->unitEstimates = [];
                $n = 0;
                foreach($map['unit_estimates'] as $item) {
                    $model->unitEstimates[$n++] = null !== $item ? UnitEstimates::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['total_amount'])){
            $model->totalAmount = $map['total_amount'];
        }
        if(isset($map['currency'])){
            $model->currency = $map['currency'];
        }
        if(isset($map['message'])){
            $model->message = $map['message'];
        }
        return $model;
    }
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 至少一个输出单元命中
    /**
     * @var bool
     */
    public $matched;

    // 首个输出单元是否命中兜底规则
    /**
     * @var bool
     */
    public $fallback;

    // 命中规则编码
    /**
     * @var string
     */
    public $priceRuleCode;

    // 规则版本
    /**
     * @var int
     */
    public $matchedRuleVersion;

    // 规则名称
    /**
     * @var string
     */
    public $ruleName;

    // 规则优先级
    /**
     * @var int
     */
    public $priority;

    // 只计一次的请求级费用明细
    /**
     * @var RequestItems[]
     */
    public $requestItems;

    // 各输出单元的试算明细
    /**
     * @var UnitEstimates[]
     */
    public $unitEstimates;

    // 试算总金额
    /**
     * @var string
     */
    public $totalAmount;

    // 币种
    /**
     * @var string
     */
    public $currency;

    // 未命中或部分命中时的提示
    /**
     * @var string
     */
    public $message;

}
