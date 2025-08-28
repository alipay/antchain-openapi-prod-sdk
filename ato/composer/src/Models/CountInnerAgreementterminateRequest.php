<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class CountInnerAgreementterminateRequest extends Model
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

    // 租户ID
    /**
     * @var string
     */
    public $tenantId;

    // 商户超时类型
    /**
     * @var string
     */
    public $merchantHandleDurationType;

    // 订单ID
    /**
     * @var string
     */
    public $orderId;

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
    protected $_name = [
        'authToken'                  => 'auth_token',
        'productInstanceId'          => 'product_instance_id',
        'tenantId'                   => 'tenant_id',
        'merchantHandleDurationType' => 'merchant_handle_duration_type',
        'orderId'                    => 'order_id',
        'terminateApplyId'           => 'terminate_apply_id',
        'gmtTerminateApplyStartTime' => 'gmt_terminate_apply_start_time',
        'gmtTerminateApplyEndTime'   => 'gmt_terminate_apply_end_time',
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
        if (null !== $this->merchantHandleDurationType) {
            $res['merchant_handle_duration_type'] = $this->merchantHandleDurationType;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CountInnerAgreementterminateRequest
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
        if (isset($map['merchant_handle_duration_type'])) {
            $model->merchantHandleDurationType = $map['merchant_handle_duration_type'];
        }
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
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

        return $model;
    }
}
