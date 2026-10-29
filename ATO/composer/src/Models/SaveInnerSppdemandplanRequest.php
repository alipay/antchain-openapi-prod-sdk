<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class SaveInnerSppdemandplanRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tenantId' => 'tenant_id',
        'traceId' => 'trace_id',
        'planId' => 'plan_id',
        'productForm' => 'product_form',
        'targetVolume' => 'target_volume',
        'minVolume' => 'min_volume',
        'maxVolume' => 'max_volume',
        'focusMetrics' => 'focus_metrics',
        'dailyStartTime' => 'daily_start_time',
        'dailyEndTime' => 'daily_end_time',
        'targetCost' => 'target_cost',
        'expectedRiskPassRate' => 'expected_risk_pass_rate',
        'expectedDealRate' => 'expected_deal_rate',
        'expectedOrderRate' => 'expected_order_rate',
        'remark' => 'remark',
        'submitAudit' => 'submit_audit',
    ];
    public function validate() {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('traceId', $this->traceId, true);
        Model::validateRequired('productForm', $this->productForm, true);
        Model::validateRequired('targetVolume', $this->targetVolume, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->traceId) {
            $res['trace_id'] = $this->traceId;
        }
        if (null !== $this->planId) {
            $res['plan_id'] = $this->planId;
        }
        if (null !== $this->productForm) {
            $res['product_form'] = $this->productForm;
        }
        if (null !== $this->targetVolume) {
            $res['target_volume'] = $this->targetVolume;
        }
        if (null !== $this->minVolume) {
            $res['min_volume'] = $this->minVolume;
        }
        if (null !== $this->maxVolume) {
            $res['max_volume'] = $this->maxVolume;
        }
        if (null !== $this->focusMetrics) {
            $res['focus_metrics'] = $this->focusMetrics;
        }
        if (null !== $this->dailyStartTime) {
            $res['daily_start_time'] = $this->dailyStartTime;
        }
        if (null !== $this->dailyEndTime) {
            $res['daily_end_time'] = $this->dailyEndTime;
        }
        if (null !== $this->targetCost) {
            $res['target_cost'] = $this->targetCost;
        }
        if (null !== $this->expectedRiskPassRate) {
            $res['expected_risk_pass_rate'] = $this->expectedRiskPassRate;
        }
        if (null !== $this->expectedDealRate) {
            $res['expected_deal_rate'] = $this->expectedDealRate;
        }
        if (null !== $this->expectedOrderRate) {
            $res['expected_order_rate'] = $this->expectedOrderRate;
        }
        if (null !== $this->remark) {
            $res['remark'] = $this->remark;
        }
        if (null !== $this->submitAudit) {
            $res['submit_audit'] = $this->submitAudit;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return SaveInnerSppdemandplanRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['tenant_id'])){
            $model->tenantId = $map['tenant_id'];
        }
        if(isset($map['trace_id'])){
            $model->traceId = $map['trace_id'];
        }
        if(isset($map['plan_id'])){
            $model->planId = $map['plan_id'];
        }
        if(isset($map['product_form'])){
            $model->productForm = $map['product_form'];
        }
        if(isset($map['target_volume'])){
            $model->targetVolume = $map['target_volume'];
        }
        if(isset($map['min_volume'])){
            $model->minVolume = $map['min_volume'];
        }
        if(isset($map['max_volume'])){
            $model->maxVolume = $map['max_volume'];
        }
        if(isset($map['focus_metrics'])){
            $model->focusMetrics = $map['focus_metrics'];
        }
        if(isset($map['daily_start_time'])){
            $model->dailyStartTime = $map['daily_start_time'];
        }
        if(isset($map['daily_end_time'])){
            $model->dailyEndTime = $map['daily_end_time'];
        }
        if(isset($map['target_cost'])){
            $model->targetCost = $map['target_cost'];
        }
        if(isset($map['expected_risk_pass_rate'])){
            $model->expectedRiskPassRate = $map['expected_risk_pass_rate'];
        }
        if(isset($map['expected_deal_rate'])){
            $model->expectedDealRate = $map['expected_deal_rate'];
        }
        if(isset($map['expected_order_rate'])){
            $model->expectedOrderRate = $map['expected_order_rate'];
        }
        if(isset($map['remark'])){
            $model->remark = $map['remark'];
        }
        if(isset($map['submit_audit'])){
            $model->submitAudit = $map['submit_audit'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 商家租户ID，须校验调用方对该租户的访问授权
    /**
     * @var string
     */
    public $tenantId;

    // 链路追踪ID，1~64字符；写操作同时作为幂等号
    /**
     * @var string
     */
    public $traceId;

    // 空为新增，非空为编辑
    /**
     * @var string
     */
    public $planId;

    // APP / WECHAT
    /**
     * @var string
     */
    public $productForm;

    // 正整数，≤metadata.maxVolume
    /**
     * @var int
     */
    public $targetVolume;

    // 正整数，≤target_volume
    /**
     * @var int
     */
    public $minVolume;

    // 正整数，≥target_volume，≤metadata.maxVolume
    /**
     * @var int
     */
    public $maxVolume;

    // JSON数组，code数组，只允许元数据中的指标；不传或[]清空，重复元素拒绝
    /**
     * @var string
     */
    public $focusMetrics;

    // HH:mm:ss，与结束时间同时传或同时不传
    /**
     * @var string
     */
    public $dailyStartTime;

    // HH:mm:ss，须晚于开始时间；不传两者为全天，一期不支持跨日
    /**
     * @var string
     */
    public $dailyEndTime;

    // 元/成交，非负十进制，最多2位小数
    /**
     * @var string
     */
    public $targetCost;

    // 0~1，最多4位小数
    /**
     * @var string
     */
    public $expectedRiskPassRate;

    // 0~1，最多4位小数
    /**
     * @var string
     */
    public $expectedDealRate;

    // 0~1，最多4位小数
    /**
     * @var string
     */
    public $expectedOrderRate;

    // ≤100字符，不传清空
    /**
     * @var string
     */
    public $remark;

    // 默认false保存草稿；true同时提交审核
    /**
     * @var bool
     */
    public $submitAudit;

}
