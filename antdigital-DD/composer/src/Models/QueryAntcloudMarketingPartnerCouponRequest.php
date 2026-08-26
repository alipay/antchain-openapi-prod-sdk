<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

class QueryAntcloudMarketingPartnerCouponRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'tenantId' => 'tenant_id',
        'productCodes' => 'product_codes',
        'currency' => 'currency',
        'couponType' => 'coupon_type',
        'couponStatus' => 'coupon_status',
        'startTime' => 'start_time',
        'endTime' => 'end_time',
        'pageNo' => 'page_no',
        'pageSize' => 'page_size',
    ];
    public function validate() {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('productCodes', $this->productCodes, true);
        Model::validateRequired('currency', $this->currency, true);
        Model::validateRequired('startTime', $this->startTime, true);
        Model::validateRequired('endTime', $this->endTime, true);
        Model::validateRequired('pageNo', $this->pageNo, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
        Model::validatePattern('startTime', $this->startTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('endTime', $this->endTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->productCodes) {
            $res['product_codes'] = $this->productCodes;
        }
        if (null !== $this->currency) {
            $res['currency'] = $this->currency;
        }
        if (null !== $this->couponType) {
            $res['coupon_type'] = $this->couponType;
        }
        if (null !== $this->couponStatus) {
            $res['coupon_status'] = $this->couponStatus;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        if (null !== $this->pageNo) {
            $res['page_no'] = $this->pageNo;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryAntcloudMarketingPartnerCouponRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['tenant_id'])){
            $model->tenantId = $map['tenant_id'];
        }
        if(isset($map['product_codes'])){
            if(!empty($map['product_codes'])){
                $model->productCodes = $map['product_codes'];
            }
        }
        if(isset($map['currency'])){
            $model->currency = $map['currency'];
        }
        if(isset($map['coupon_type'])){
            if(!empty($map['coupon_type'])){
                $model->couponType = $map['coupon_type'];
            }
        }
        if(isset($map['coupon_status'])){
            if(!empty($map['coupon_status'])){
                $model->couponStatus = $map['coupon_status'];
            }
        }
        if(isset($map['start_time'])){
            $model->startTime = $map['start_time'];
        }
        if(isset($map['end_time'])){
            $model->endTime = $map['end_time'];
        }
        if(isset($map['page_no'])){
            $model->pageNo = $map['page_no'];
        }
        if(isset($map['page_size'])){
            $model->pageSize = $map['page_size'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 目标租户2088 ID，查询发放给该租户的优惠券
    /**
     * @var string
     */
    public $tenantId;

    // 商品规格Code列表
    /**
     * @var string[]
     */
    public $productCodes;

    // 币种，目前仅支持CNY、USD
    /**
     * @var string
     */
    public $currency;

    // 优惠券类型；不传或空列表表示全部类型
    /**
     * @var string[]
     */
    public $couponType;

    // 优惠券状态；不传或空列表表示全部状态.
    // AVAILABLE正常/可用状态
    // EXHAUSTED 已使用完
    // ABANDONED 已作废
    // EXPIRED 已过期
    /**
     * @var string[]
     */
    public $couponStatus;

    // 查询区间开始时间
    /**
     * @var string
     */
    public $startTime;

    // 查询区间结束时间
    /**
     * @var string
     */
    public $endTime;

    // 页码，从1开始
    /**
     * @var int
     */
    public $pageNo;

    // 每页记录数，范围1～100
    /**
     * @var int
     */
    public $pageSize;

}
