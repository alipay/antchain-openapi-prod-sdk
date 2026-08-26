<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

class ApplyAntcloudBillingRespackageCountRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'outBizId' => 'out_biz_id',
        'tenantId' => 'tenant_id',
        'productCode' => 'product_code',
        'instanceId' => 'instance_id',
        'templateName' => 'template_name',
        'gmtService' => 'gmt_service',
        'partialDeductFlag' => 'partial_deduct_flag',
        'needAlert' => 'need_alert',
        'deductAmount' => 'deduct_amount',
        'fromApp' => 'from_app',
        'extendInfo' => 'extend_info',
        'hold' => 'hold',
        'holdTime' => 'hold_time',
        'deductAmountStr' => 'deduct_amount_str',
    ];
    public function validate() {
        Model::validateRequired('outBizId', $this->outBizId, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('gmtService', $this->gmtService, true);
        Model::validateRequired('fromApp', $this->fromApp, true);
        Model::validatePattern('gmtService', $this->gmtService, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->outBizId) {
            $res['out_biz_id'] = $this->outBizId;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->templateName) {
            $res['template_name'] = $this->templateName;
        }
        if (null !== $this->gmtService) {
            $res['gmt_service'] = $this->gmtService;
        }
        if (null !== $this->partialDeductFlag) {
            $res['partial_deduct_flag'] = $this->partialDeductFlag;
        }
        if (null !== $this->needAlert) {
            $res['need_alert'] = $this->needAlert;
        }
        if (null !== $this->deductAmount) {
            $res['deduct_amount'] = $this->deductAmount;
        }
        if (null !== $this->fromApp) {
            $res['from_app'] = $this->fromApp;
        }
        if (null !== $this->extendInfo) {
            $res['extend_info'] = $this->extendInfo;
        }
        if (null !== $this->hold) {
            $res['hold'] = $this->hold;
        }
        if (null !== $this->holdTime) {
            $res['hold_time'] = $this->holdTime;
        }
        if (null !== $this->deductAmountStr) {
            $res['deduct_amount_str'] = $this->deductAmountStr;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ApplyAntcloudBillingRespackageCountRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['out_biz_id'])){
            $model->outBizId = $map['out_biz_id'];
        }
        if(isset($map['tenant_id'])){
            $model->tenantId = $map['tenant_id'];
        }
        if(isset($map['product_code'])){
            $model->productCode = $map['product_code'];
        }
        if(isset($map['instance_id'])){
            $model->instanceId = $map['instance_id'];
        }
        if(isset($map['template_name'])){
            $model->templateName = $map['template_name'];
        }
        if(isset($map['gmt_service'])){
            $model->gmtService = $map['gmt_service'];
        }
        if(isset($map['partial_deduct_flag'])){
            $model->partialDeductFlag = $map['partial_deduct_flag'];
        }
        if(isset($map['need_alert'])){
            $model->needAlert = $map['need_alert'];
        }
        if(isset($map['deduct_amount'])){
            $model->deductAmount = $map['deduct_amount'];
        }
        if(isset($map['from_app'])){
            $model->fromApp = $map['from_app'];
        }
        if(isset($map['extend_info'])){
            $model->extendInfo = $map['extend_info'];
        }
        if(isset($map['hold'])){
            $model->hold = $map['hold'];
        }
        if(isset($map['hold_time'])){
            $model->holdTime = $map['hold_time'];
        }
        if(isset($map['deduct_amount_str'])){
            $model->deductAmountStr = $map['deduct_amount_str'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 外部唯一单据号 不超过64位
    /**
     * @var string
     */
    public $outBizId;

    // 租户id
    /**
     * @var string
     */
    public $tenantId;

    // 商品码
    /**
     * @var string
     */
    public $productCode;

    // 指定实例ID
    /**
     * @var string
     */
    public $instanceId;

    // 指定模板
    /**
     * @var string
     */
    public $templateName;

    // 业务发生时间
    /**
     * @var string
     */
    public $gmtService;

    // 是否部分抵扣
    /**
     * @var bool
     */
    public $partialDeductFlag;

    // 是否通知用户
    /**
     * @var bool
     */
    public $needAlert;

    // 抵扣量，后续废弃，新业务使用deduct_amount_str
    /**
     * @var int
     */
    public $deductAmount;

    // 来源系统
    /**
     * @var string
     */
    public $fromApp;

    // json字符串
    /**
     * @var string
     */
    public $extendInfo;

    // 预占抵扣模式
    /**
     * @var bool
     */
    public $hold;

    // 预占时长
    /**
     * @var int
     */
    public $holdTime;

    // 高精度抵扣量，与deduct_amount互斥，传一个就可以，deduct_amount不支持小数，deduct_amount_str支持小数
    /**
     * @var string
     */
    public $deductAmountStr;

}
