<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class MerchantBaseInfo extends Model
{
    // 租户id
    /**
     * @example UDFXXXXX
     *
     * @var string
     */
    public $tenantId;

    // 品牌名称
    /**
     * @example 启辰
     *
     * @var string
     */
    public $brandName;

    // 品牌logo
    /**
     * @example 品牌logo
     *
     * @var string
     */
    public $brandLogo;

    // 商家小程序链接
    /**
     * @example https://www.baidu.com
     *
     * @var string
     */
    public $merchantAppLink;

    // 商家更新电话
    /**
     * @example 133xxxxxxxx
     *
     * @var string
     */
    public $merchantPhone;

    // 提交时间
    /**
     * @example yyyy-MM-dd hh:mm:ss
     *
     * @var string
     */
    public $submitTime;

    // 审核状态
    /**
     * @example sumit
     *
     * @var string
     */
    public $status;

    // 品牌名称-审核中
    /**
     * @example 品牌名称
     *
     * @var string
     */
    public $brandNameSnapshot;

    // 品牌logo-审核中
    /**
     * @example 品牌logo
     *
     * @var string
     */
    public $brandLogoSnapshot;

    // 商家小程序链接_审核中
    /**
     * @example https://www.baidu.com
     *
     * @var string
     */
    public $merchantAppLinkSnapshot;

    // 商家电话_审核中
    /**
     * @example 133xxxxxxxx
     *
     * @var string
     */
    public $merchantPhoneSnapshot;

    // 更新时间_审核中
    /**
     * @example yyyy-MM-dd hh:mm:ss
     *
     * @var string
     */
    public $submitTimeSnapshot;

    // 驳回原因_审核中
    /**
     * @example 驳回原因
     *
     * @var string
     */
    public $refuseReasonSnapshot;
    protected $_name = [
        'tenantId'                => 'tenant_id',
        'brandName'               => 'brand_name',
        'brandLogo'               => 'brand_logo',
        'merchantAppLink'         => 'merchant_app_link',
        'merchantPhone'           => 'merchant_phone',
        'submitTime'              => 'submit_time',
        'status'                  => 'status',
        'brandNameSnapshot'       => 'brand_name_snapshot',
        'brandLogoSnapshot'       => 'brand_logo_snapshot',
        'merchantAppLinkSnapshot' => 'merchant_app_link_snapshot',
        'merchantPhoneSnapshot'   => 'merchant_phone_snapshot',
        'submitTimeSnapshot'      => 'submit_time_snapshot',
        'refuseReasonSnapshot'    => 'refuse_reason_snapshot',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->brandName) {
            $res['brand_name'] = $this->brandName;
        }
        if (null !== $this->brandLogo) {
            $res['brand_logo'] = $this->brandLogo;
        }
        if (null !== $this->merchantAppLink) {
            $res['merchant_app_link'] = $this->merchantAppLink;
        }
        if (null !== $this->merchantPhone) {
            $res['merchant_phone'] = $this->merchantPhone;
        }
        if (null !== $this->submitTime) {
            $res['submit_time'] = $this->submitTime;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->brandNameSnapshot) {
            $res['brand_name_snapshot'] = $this->brandNameSnapshot;
        }
        if (null !== $this->brandLogoSnapshot) {
            $res['brand_logo_snapshot'] = $this->brandLogoSnapshot;
        }
        if (null !== $this->merchantAppLinkSnapshot) {
            $res['merchant_app_link_snapshot'] = $this->merchantAppLinkSnapshot;
        }
        if (null !== $this->merchantPhoneSnapshot) {
            $res['merchant_phone_snapshot'] = $this->merchantPhoneSnapshot;
        }
        if (null !== $this->submitTimeSnapshot) {
            $res['submit_time_snapshot'] = $this->submitTimeSnapshot;
        }
        if (null !== $this->refuseReasonSnapshot) {
            $res['refuse_reason_snapshot'] = $this->refuseReasonSnapshot;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MerchantBaseInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['brand_name'])) {
            $model->brandName = $map['brand_name'];
        }
        if (isset($map['brand_logo'])) {
            $model->brandLogo = $map['brand_logo'];
        }
        if (isset($map['merchant_app_link'])) {
            $model->merchantAppLink = $map['merchant_app_link'];
        }
        if (isset($map['merchant_phone'])) {
            $model->merchantPhone = $map['merchant_phone'];
        }
        if (isset($map['submit_time'])) {
            $model->submitTime = $map['submit_time'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['brand_name_snapshot'])) {
            $model->brandNameSnapshot = $map['brand_name_snapshot'];
        }
        if (isset($map['brand_logo_snapshot'])) {
            $model->brandLogoSnapshot = $map['brand_logo_snapshot'];
        }
        if (isset($map['merchant_app_link_snapshot'])) {
            $model->merchantAppLinkSnapshot = $map['merchant_app_link_snapshot'];
        }
        if (isset($map['merchant_phone_snapshot'])) {
            $model->merchantPhoneSnapshot = $map['merchant_phone_snapshot'];
        }
        if (isset($map['submit_time_snapshot'])) {
            $model->submitTimeSnapshot = $map['submit_time_snapshot'];
        }
        if (isset($map['refuse_reason_snapshot'])) {
            $model->refuseReasonSnapshot = $map['refuse_reason_snapshot'];
        }

        return $model;
    }
}
