<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class PagequeryInnerAgreementterminateRequest extends Model
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

    // 分页参数
    /**
     * @var PageQuery
     */
    public $pageInfo;

    // 租户ID
    /**
     * @var string
     */
    public $tenantId;

    // 订单ID
    /**
     * @var string
     */
    public $orderId;

    // 商家处理超时时长类型(DAY/HOUR)
    /**
     * @var string
     */
    public $merchantHandleDurationType;

    // terminateApplyId
    /**
     * @var string
     */
    public $terminateApplyId;

    // 解约申请开始时间
    /**
     * @var string
     */
    public $gmtTerminateApplyStartTime;

    // 解约申请结束时间
    /**
     * @var string
     */
    public $gmtTerminateApplyEndTime;

    // 处理状态
    /**
     * @var string
     */
    public $handleStatus;
    protected $_name = [
        'authToken'                  => 'auth_token',
        'productInstanceId'          => 'product_instance_id',
        'pageInfo'                   => 'page_info',
        'tenantId'                   => 'tenant_id',
        'orderId'                    => 'order_id',
        'merchantHandleDurationType' => 'merchant_handle_duration_type',
        'terminateApplyId'           => 'terminate_apply_id',
        'gmtTerminateApplyStartTime' => 'gmt_terminate_apply_start_time',
        'gmtTerminateApplyEndTime'   => 'gmt_terminate_apply_end_time',
        'handleStatus'               => 'handle_status',
    ];

    public function validate()
    {
        Model::validateRequired('pageInfo', $this->pageInfo, true);
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
        if (null !== $this->pageInfo) {
            $res['page_info'] = null !== $this->pageInfo ? $this->pageInfo->toMap() : null;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->merchantHandleDurationType) {
            $res['merchant_handle_duration_type'] = $this->merchantHandleDurationType;
        }
        if (null !== $this->terminateApplyId) {
            $res['terminate_apply_id'] = $this->terminateApplyId;
        }
        if (null !== $this->gmtTerminateApplyStartTime) {
            $res['gmt_terminate_apply_start_time'] = $this->gmtTerminateApplyStartTime;
        }
        if (null !== $this->gmtTerminateApplyEndTime) {
            $res['gmt_terminate_apply_end_time'] = $this->gmtTerminateApplyEndTime;
        }
        if (null !== $this->handleStatus) {
            $res['handle_status'] = $this->handleStatus;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PagequeryInnerAgreementterminateRequest
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
        if (isset($map['page_info'])) {
            $model->pageInfo = PageQuery::fromMap($map['page_info']);
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['merchant_handle_duration_type'])) {
            $model->merchantHandleDurationType = $map['merchant_handle_duration_type'];
        }
        if (isset($map['terminate_apply_id'])) {
            $model->terminateApplyId = $map['terminate_apply_id'];
        }
        if (isset($map['gmt_terminate_apply_start_time'])) {
            $model->gmtTerminateApplyStartTime = $map['gmt_terminate_apply_start_time'];
        }
        if (isset($map['gmt_terminate_apply_end_time'])) {
            $model->gmtTerminateApplyEndTime = $map['gmt_terminate_apply_end_time'];
        }
        if (isset($map['handle_status'])) {
            $model->handleStatus = $map['handle_status'];
        }

        return $model;
    }
}
