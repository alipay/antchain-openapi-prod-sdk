<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class PagequeryInnerPlatformorderleadRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 服务商租户id
    /**
     * @var string
     */
    public $tenantId;

    // 场景名称
    /**
     * @var string
     */
    public $sceneName;

    // 商品名称
    /**
     * @var string
     */
    public $productTitle;

    // 用户手机号
    /**
     * @var string
     */
    public $userPhone;

    // 商家品牌名称
    /**
     * @var string
     */
    public $merchantBrandName;

    // 订单提交开始时间
    /**
     * @var string
     */
    public $startTime;

    // 订单提交结束时间
    /**
     * @var string
     */
    public $endTime;

    // 审核状态
    /**
     * @var string
     */
    public $approvalStatus;

    // 分页参数
    /**
     * @var PageQuery
     */
    public $pageInfo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tenantId'          => 'tenant_id',
        'sceneName'         => 'scene_name',
        'productTitle'      => 'product_title',
        'userPhone'         => 'user_phone',
        'merchantBrandName' => 'merchant_brand_name',
        'startTime'         => 'start_time',
        'endTime'           => 'end_time',
        'approvalStatus'    => 'approval_status',
        'pageInfo'          => 'page_info',
    ];

    public function validate()
    {
        Model::validateRequired('tenantId', $this->tenantId, true);
    }

    public function toMap()
    {
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
        if (null !== $this->sceneName) {
            $res['scene_name'] = $this->sceneName;
        }
        if (null !== $this->productTitle) {
            $res['product_title'] = $this->productTitle;
        }
        if (null !== $this->userPhone) {
            $res['user_phone'] = $this->userPhone;
        }
        if (null !== $this->merchantBrandName) {
            $res['merchant_brand_name'] = $this->merchantBrandName;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        if (null !== $this->approvalStatus) {
            $res['approval_status'] = $this->approvalStatus;
        }
        if (null !== $this->pageInfo) {
            $res['page_info'] = null !== $this->pageInfo ? $this->pageInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PagequeryInnerPlatformorderleadRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['scene_name'])) {
            $model->sceneName = $map['scene_name'];
        }
        if (isset($map['product_title'])) {
            $model->productTitle = $map['product_title'];
        }
        if (isset($map['user_phone'])) {
            $model->userPhone = $map['user_phone'];
        }
        if (isset($map['merchant_brand_name'])) {
            $model->merchantBrandName = $map['merchant_brand_name'];
        }
        if (isset($map['start_time'])) {
            $model->startTime = $map['start_time'];
        }
        if (isset($map['end_time'])) {
            $model->endTime = $map['end_time'];
        }
        if (isset($map['approval_status'])) {
            $model->approvalStatus = $map['approval_status'];
        }
        if (isset($map['page_info'])) {
            $model->pageInfo = PageQuery::fromMap($map['page_info']);
        }

        return $model;
    }
}
