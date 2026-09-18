<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

use AntChain\SECURITYTECH\Models\MaoMerchantInfo;

class MaoQueryMerchantResult extends Model {
    protected $_name = [
        'merchantId' => 'merchant_id',
        'channelTenant' => 'channel_tenant',
        'usci' => 'usci',
        'industry' => 'industry',
        'subCategory' => 'sub_category',
        'scene' => 'scene',
        'applyStatus' => 'apply_status',
        'merchantInfo' => 'merchant_info',
        'pendingApply' => 'pending_apply',
        'onboardingTime' => 'onboarding_time',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }
        if (null !== $this->channelTenant) {
            $res['channel_tenant'] = $this->channelTenant;
        }
        if (null !== $this->usci) {
            $res['usci'] = $this->usci;
        }
        if (null !== $this->industry) {
            $res['industry'] = $this->industry;
        }
        if (null !== $this->subCategory) {
            $res['sub_category'] = $this->subCategory;
        }
        if (null !== $this->scene) {
            $res['scene'] = $this->scene;
        }
        if (null !== $this->applyStatus) {
            $res['apply_status'] = $this->applyStatus;
        }
        if (null !== $this->merchantInfo) {
            $res['merchant_info'] = null !== $this->merchantInfo ? $this->merchantInfo->toMap() : null;
        }
        if (null !== $this->pendingApply) {
            $res['pending_apply'] = $this->pendingApply;
        }
        if (null !== $this->onboardingTime) {
            $res['onboarding_time'] = $this->onboardingTime;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return MaoQueryMerchantResult
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['merchant_id'])){
            $model->merchantId = $map['merchant_id'];
        }
        if(isset($map['channel_tenant'])){
            $model->channelTenant = $map['channel_tenant'];
        }
        if(isset($map['usci'])){
            $model->usci = $map['usci'];
        }
        if(isset($map['industry'])){
            $model->industry = $map['industry'];
        }
        if(isset($map['sub_category'])){
            $model->subCategory = $map['sub_category'];
        }
        if(isset($map['scene'])){
            $model->scene = $map['scene'];
        }
        if(isset($map['apply_status'])){
            $model->applyStatus = $map['apply_status'];
        }
        if(isset($map['merchant_info'])){
            $model->merchantInfo = MaoMerchantInfo::fromMap($map['merchant_info']);
        }
        if(isset($map['pending_apply'])){
            $model->pendingApply = $map['pending_apply'];
        }
        if(isset($map['onboarding_time'])){
            $model->onboardingTime = $map['onboarding_time'];
        }
        return $model;
    }
    // 商户号
    /**
     * @example 商户号
     * @var string
     */
    public $merchantId;

    // 所属渠道租户
    /**
     * @example 所属渠道租户
     * @var string
     */
    public $channelTenant;

    // 统一社会信用代码
    /**
     * @example 统一社会信用代码
     * @var string
     */
    public $usci;

    // 行业类型
    /**
     * @example 行业类型
     * @var string
     */
    public $industry;

    // 二级类目
    /**
     * @example 二级类目
     * @var string
     */
    public $subCategory;

    // 入驻场景
    /**
     * @example 入驻场景
     * @var string
     */
    public $scene;

    // 申请单状态
    /**
     * @example 申请单状态
     * @var string
     */
    public $applyStatus;

    // 商户信息
    /**
     * @example undefined
     * @var MaoMerchantInfo
     */
    public $merchantInfo;

    // 是否有在申请
    /**
     * @example 是否有在申请
     * @var string
     */
    public $pendingApply;

    // 入驻时间
    /**
     * @example 入驻时间
     * @var string
     */
    public $onboardingTime;

}
