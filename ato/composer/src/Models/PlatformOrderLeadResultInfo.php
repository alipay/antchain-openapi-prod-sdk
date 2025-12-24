<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class PlatformOrderLeadResultInfo extends Model
{
    // 场景名称
    /**
     * @example 抖音1号直播间
     *
     * @var string
     */
    public $sceneName;

    // 平台订单号
    /**
     * @example 1233123123
     *
     * @var string
     */
    public $platformOrderId;

    // 平台订单派发id
    /**
     * @example 1761892719822_132
     *
     * @var string
     */
    public $deliveryId;

    // 商品名称
    /**
     * @example 苹果/Apple iPhone 17 Pro
     *
     * @var string
     */
    public $productTitle;

    // 订单提交时间
    /**
     * @example 2025-12-10 14:36:12
     *
     * @var string
     */
    public $orderCreateTime;

    // 用户姓名（脱敏）
    /**
     * @example 张**
     *
     * @var string
     */
    public $userName;

    // 用户手机号（脱敏）
    /**
     * @example 180****5678
     *
     * @var string
     */
    public $userPhone;

    // 商家品牌名称
    /**
     * @example 爱租机
     *
     * @var string
     */
    public $merchantBrandName;

    // 商家品牌logoUrl
    /**
     * @example http://logo.png
     *
     * @var string
     */
    public $merchantBrandLogoUrl;

    // 审核状态
    /**
     * @example WAIT_FEEDBACK：审核中 /ACCEPTED：审核通过 /REJECTED：已驳回 /CANCEL：已撤销/ SHIPPED：已发货/ PENDING_SHIPMENT：待发货
     *
     * @var string
     */
    public $approvalStatus;

    // 备注
    /**
     * @example 用户电话打不通，已留言
     *
     * @var string
     */
    public $remark;
    protected $_name = [
        'sceneName'            => 'scene_name',
        'platformOrderId'      => 'platform_order_id',
        'deliveryId'           => 'delivery_id',
        'productTitle'         => 'product_title',
        'orderCreateTime'      => 'order_create_time',
        'userName'             => 'user_name',
        'userPhone'            => 'user_phone',
        'merchantBrandName'    => 'merchant_brand_name',
        'merchantBrandLogoUrl' => 'merchant_brand_logo_url',
        'approvalStatus'       => 'approval_status',
        'remark'               => 'remark',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->sceneName) {
            $res['scene_name'] = $this->sceneName;
        }
        if (null !== $this->platformOrderId) {
            $res['platform_order_id'] = $this->platformOrderId;
        }
        if (null !== $this->deliveryId) {
            $res['delivery_id'] = $this->deliveryId;
        }
        if (null !== $this->productTitle) {
            $res['product_title'] = $this->productTitle;
        }
        if (null !== $this->orderCreateTime) {
            $res['order_create_time'] = $this->orderCreateTime;
        }
        if (null !== $this->userName) {
            $res['user_name'] = $this->userName;
        }
        if (null !== $this->userPhone) {
            $res['user_phone'] = $this->userPhone;
        }
        if (null !== $this->merchantBrandName) {
            $res['merchant_brand_name'] = $this->merchantBrandName;
        }
        if (null !== $this->merchantBrandLogoUrl) {
            $res['merchant_brand_logo_url'] = $this->merchantBrandLogoUrl;
        }
        if (null !== $this->approvalStatus) {
            $res['approval_status'] = $this->approvalStatus;
        }
        if (null !== $this->remark) {
            $res['remark'] = $this->remark;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PlatformOrderLeadResultInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['scene_name'])) {
            $model->sceneName = $map['scene_name'];
        }
        if (isset($map['platform_order_id'])) {
            $model->platformOrderId = $map['platform_order_id'];
        }
        if (isset($map['delivery_id'])) {
            $model->deliveryId = $map['delivery_id'];
        }
        if (isset($map['product_title'])) {
            $model->productTitle = $map['product_title'];
        }
        if (isset($map['order_create_time'])) {
            $model->orderCreateTime = $map['order_create_time'];
        }
        if (isset($map['user_name'])) {
            $model->userName = $map['user_name'];
        }
        if (isset($map['user_phone'])) {
            $model->userPhone = $map['user_phone'];
        }
        if (isset($map['merchant_brand_name'])) {
            $model->merchantBrandName = $map['merchant_brand_name'];
        }
        if (isset($map['merchant_brand_logo_url'])) {
            $model->merchantBrandLogoUrl = $map['merchant_brand_logo_url'];
        }
        if (isset($map['approval_status'])) {
            $model->approvalStatus = $map['approval_status'];
        }
        if (isset($map['remark'])) {
            $model->remark = $map['remark'];
        }

        return $model;
    }
}
