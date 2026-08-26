<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

class ChannelTemplateInfo extends Model {
    protected $_name = [
        'templateId' => 'template_id',
        'templateName' => 'template_name',
        'templateStatus' => 'template_status',
        'couponType' => 'coupon_type',
        'couponAmount' => 'coupon_amount',
        'currency' => 'currency',
        'totalQuota' => 'total_quota',
        'releasedQuota' => 'released_quota',
        'availableQuota' => 'available_quota',
        'templateStartTime' => 'template_start_time',
        'templateEndTime' => 'template_end_time',
        'itemCodes' => 'item_codes',
    ];
    public function validate() {
        Model::validateRequired('templateId', $this->templateId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->templateId) {
            $res['template_id'] = $this->templateId;
        }
        if (null !== $this->templateName) {
            $res['template_name'] = $this->templateName;
        }
        if (null !== $this->templateStatus) {
            $res['template_status'] = $this->templateStatus;
        }
        if (null !== $this->couponType) {
            $res['coupon_type'] = $this->couponType;
        }
        if (null !== $this->couponAmount) {
            $res['coupon_amount'] = $this->couponAmount;
        }
        if (null !== $this->currency) {
            $res['currency'] = $this->currency;
        }
        if (null !== $this->totalQuota) {
            $res['total_quota'] = $this->totalQuota;
        }
        if (null !== $this->releasedQuota) {
            $res['released_quota'] = $this->releasedQuota;
        }
        if (null !== $this->availableQuota) {
            $res['available_quota'] = $this->availableQuota;
        }
        if (null !== $this->templateStartTime) {
            $res['template_start_time'] = $this->templateStartTime;
        }
        if (null !== $this->templateEndTime) {
            $res['template_end_time'] = $this->templateEndTime;
        }
        if (null !== $this->itemCodes) {
            $res['item_codes'] = $this->itemCodes;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ChannelTemplateInfo
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['template_id'])){
            $model->templateId = $map['template_id'];
        }
        if(isset($map['template_name'])){
            $model->templateName = $map['template_name'];
        }
        if(isset($map['template_status'])){
            $model->templateStatus = $map['template_status'];
        }
        if(isset($map['coupon_type'])){
            $model->couponType = $map['coupon_type'];
        }
        if(isset($map['coupon_amount'])){
            $model->couponAmount = $map['coupon_amount'];
        }
        if(isset($map['currency'])){
            $model->currency = $map['currency'];
        }
        if(isset($map['total_quota'])){
            $model->totalQuota = $map['total_quota'];
        }
        if(isset($map['released_quota'])){
            $model->releasedQuota = $map['released_quota'];
        }
        if(isset($map['available_quota'])){
            $model->availableQuota = $map['available_quota'];
        }
        if(isset($map['template_start_time'])){
            $model->templateStartTime = $map['template_start_time'];
        }
        if(isset($map['template_end_time'])){
            $model->templateEndTime = $map['template_end_time'];
        }
        if(isset($map['item_codes'])){
            if(!empty($map['item_codes'])){
                $model->itemCodes = $map['item_codes'];
            }
        }
        return $model;
    }
    // 优惠券模板id
    /**
     * @example 12345
     * @var string
     */
    public $templateId;

    // 模板名称
    /**
     * @example 国际站10美元优惠券
     * @var string
     */
    public $templateName;

    // 模板状态,APPROVED代表审批通过的模板
    /**
     * @example APPROVED
     * @var string
     */
    public $templateStatus;

    // 优惠券类型
    /**
     * @example VOUCHER
     * @var string
     */
    public $couponType;

    // 单张优惠券的券面额，单位是 分/美分
    /**
     * @example 1000
     * @var string
     */
    public $couponAmount;

    // 券面额币种
    /**
     * @example CNY、USD
     * @var string
     */
    public $currency;

    // 模板最多允许发放的优惠券总数量
    /**
     * @example 100
     * @var int
     */
    public $totalQuota;

    // 当前已经发出的优惠券数量
    /**
     * @example 20
     * @var int
     */
    public $releasedQuota;

    // 当前剩余可发数量
    /**
     * @example 80
     * @var int
     */
    public $availableQuota;

    // 模板有效期开始时间
    /**
     * @example 2026-08-09T10:10:00Z
     * @var string
     */
    public $templateStartTime;

    // 模板有效期结束时间
    /**
     * @example 2026-08-12T10:10:00Z
     * @var string
     */
    public $templateEndTime;

    // 模板适用的商品编码列表
    /**
     * @example undefined
     * @var string[]
     */
    public $itemCodes;

}
