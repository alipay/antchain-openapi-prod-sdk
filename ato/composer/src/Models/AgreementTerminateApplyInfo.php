<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class AgreementTerminateApplyInfo extends Model
{
    // 订单ID
    /**
     * @example 20240505151148001384
     *
     * @var string
     */
    public $orderId;

    // 解约申请号
    /**
     * @example A123435454
     *
     * @var string
     */
    public $terminateApplyId;

    // 订单创建时间
    /**
     * @example 2025-01-01 12:00:01
     *
     * @var string
     */
    public $orderGmtCreate;

    // 解约申请时间
    /**
     * @example 2025-01-01 11:12:00
     *
     * @var string
     */
    public $gmtTerminateApply;

    // 处理状态
    /**
     * @example INIT
     *
     * @var string
     */
    public $handleStatus;
    protected $_name = [
        'orderId'           => 'order_id',
        'terminateApplyId'  => 'terminate_apply_id',
        'orderGmtCreate'    => 'order_gmt_create',
        'gmtTerminateApply' => 'gmt_terminate_apply',
        'handleStatus'      => 'handle_status',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->terminateApplyId) {
            $res['terminate_apply_id'] = $this->terminateApplyId;
        }
        if (null !== $this->orderGmtCreate) {
            $res['order_gmt_create'] = $this->orderGmtCreate;
        }
        if (null !== $this->gmtTerminateApply) {
            $res['gmt_terminate_apply'] = $this->gmtTerminateApply;
        }
        if (null !== $this->handleStatus) {
            $res['handle_status'] = $this->handleStatus;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AgreementTerminateApplyInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['terminate_apply_id'])) {
            $model->terminateApplyId = $map['terminate_apply_id'];
        }
        if (isset($map['order_gmt_create'])) {
            $model->orderGmtCreate = $map['order_gmt_create'];
        }
        if (isset($map['gmt_terminate_apply'])) {
            $model->gmtTerminateApply = $map['gmt_terminate_apply'];
        }
        if (isset($map['handle_status'])) {
            $model->handleStatus = $map['handle_status'];
        }

        return $model;
    }
}
