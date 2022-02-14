<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreateLeaseClearingRequest extends Model
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

    // 融资租赁业务id，由资方控制台创建返回
    /**
     * @var string
     */
    public $applicationId;

    // 清分收款账号 长度不超过64
    /**
     * @var string
     */
    public $clearingAccount;

    // 清分金额,精确到毫厘，即123400表示12.34元
    /**
     * @var int
     */
    public $clearingMoney;

    // 清分订单号 长度不超过128
    /**
     * @var string[]
     */
    public $clearingOrderIds;

    // 清分状态,1.足额2.部分3.零
    /**
     * @var int
     */
    public $clearingState;

    // 结束时间，格式为"2019-07-31 12:00:00"
    /**
     * @var string
     */
    public $endTime;

    // 融资租赁额外字段
    /**
     * @var string
     */
    public $extraInfo;

    // 租赁平台商户Id 长度不可超过50
    /**
     * @var string
     */
    public $leaseId;

    // 订单id 长度不可超过50
    //
    /**
     * @var string
     */
    public $orderId;

    // 还款批次
    /**
     * @var int
     */
    public $returnIndex;

    // 开始时间，格式为"2019-07-31 12:00:00"
    /**
     * @var string
     */
    public $startTime;

    // 是否启动订单的异步处理
    /**
     * @var int
     */
    public $async;

    // 清分资金的来源，比如用户xx元，商家yy元
    /**
     * @var string
     */
    public $memo;

    // 融资租赁资金方id
    /**
     * @var string
     */
    public $creditId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'applicationId'     => 'application_id',
        'clearingAccount'   => 'clearing_account',
        'clearingMoney'     => 'clearing_money',
        'clearingOrderIds'  => 'clearing_order_ids',
        'clearingState'     => 'clearing_state',
        'endTime'           => 'end_time',
        'extraInfo'         => 'extra_info',
        'leaseId'           => 'lease_id',
        'orderId'           => 'order_id',
        'returnIndex'       => 'return_index',
        'startTime'         => 'start_time',
        'async'             => 'async',
        'memo'              => 'memo',
        'creditId'          => 'credit_id',
    ];

    public function validate()
    {
        Model::validateRequired('clearingAccount', $this->clearingAccount, true);
        Model::validateRequired('clearingMoney', $this->clearingMoney, true);
        Model::validateRequired('clearingOrderIds', $this->clearingOrderIds, true);
        Model::validateRequired('endTime', $this->endTime, true);
        Model::validateRequired('leaseId', $this->leaseId, true);
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('returnIndex', $this->returnIndex, true);
        Model::validateRequired('startTime', $this->startTime, true);
        Model::validateRequired('creditId', $this->creditId, true);
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
        if (null !== $this->applicationId) {
            $res['application_id'] = $this->applicationId;
        }
        if (null !== $this->clearingAccount) {
            $res['clearing_account'] = $this->clearingAccount;
        }
        if (null !== $this->clearingMoney) {
            $res['clearing_money'] = $this->clearingMoney;
        }
        if (null !== $this->clearingOrderIds) {
            $res['clearing_order_ids'] = $this->clearingOrderIds;
        }
        if (null !== $this->clearingState) {
            $res['clearing_state'] = $this->clearingState;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        if (null !== $this->extraInfo) {
            $res['extra_info'] = $this->extraInfo;
        }
        if (null !== $this->leaseId) {
            $res['lease_id'] = $this->leaseId;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->returnIndex) {
            $res['return_index'] = $this->returnIndex;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }
        if (null !== $this->async) {
            $res['async'] = $this->async;
        }
        if (null !== $this->memo) {
            $res['memo'] = $this->memo;
        }
        if (null !== $this->creditId) {
            $res['credit_id'] = $this->creditId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateLeaseClearingRequest
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
        if (isset($map['application_id'])) {
            $model->applicationId = $map['application_id'];
        }
        if (isset($map['clearing_account'])) {
            $model->clearingAccount = $map['clearing_account'];
        }
        if (isset($map['clearing_money'])) {
            $model->clearingMoney = $map['clearing_money'];
        }
        if (isset($map['clearing_order_ids'])) {
            if (!empty($map['clearing_order_ids'])) {
                $model->clearingOrderIds = $map['clearing_order_ids'];
            }
        }
        if (isset($map['clearing_state'])) {
            $model->clearingState = $map['clearing_state'];
        }
        if (isset($map['end_time'])) {
            $model->endTime = $map['end_time'];
        }
        if (isset($map['extra_info'])) {
            $model->extraInfo = $map['extra_info'];
        }
        if (isset($map['lease_id'])) {
            $model->leaseId = $map['lease_id'];
        }
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['return_index'])) {
            $model->returnIndex = $map['return_index'];
        }
        if (isset($map['start_time'])) {
            $model->startTime = $map['start_time'];
        }
        if (isset($map['async'])) {
            $model->async = $map['async'];
        }
        if (isset($map['memo'])) {
            $model->memo = $map['memo'];
        }
        if (isset($map['credit_id'])) {
            $model->creditId = $map['credit_id'];
        }

        return $model;
    }
}
