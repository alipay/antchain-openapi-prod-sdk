<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class LeaseClearingInfo extends Model
{
    // 还款批次
    /**
     * @example 1
     *
     * @var int
     */
    public $returnIndex;

    // 清分状态
    /**
     * @example 1
     *
     * @var int
     */
    public $clearingState;

    // 清分金额,精确到毫厘，即123400表示12.34元
    /**
     * @example 123400
     *
     * @var int
     */
    public $clearingMoney;

    // 开始清分时间
    /**
     * @example 2019-07-31 12:00:00
     *
     * @var string
     */
    public $startTime;

    // 结束清分时间
    /**
     * @example 2019-08-31 12:00:00
     *
     * @var string
     */
    public $endTime;

    // 清分单号
    /**
     * @example 2021231231231313
     *
     * @var string
     */
    public $clearingOrderId;

    // 清分收款账号
    /**
     * @example 88234234234xxxx
     *
     * @var string
     */
    public $clearingAccount;

    // 清分额外说明
    /**
     * @example ""
     *
     * @var string
     */
    public $memo;
    protected $_name = [
        'returnIndex'     => 'return_index',
        'clearingState'   => 'clearing_state',
        'clearingMoney'   => 'clearing_money',
        'startTime'       => 'start_time',
        'endTime'         => 'end_time',
        'clearingOrderId' => 'clearing_order_id',
        'clearingAccount' => 'clearing_account',
        'memo'            => 'memo',
    ];

    public function validate()
    {
        Model::validateRequired('returnIndex', $this->returnIndex, true);
        Model::validateRequired('clearingState', $this->clearingState, true);
        Model::validateRequired('clearingMoney', $this->clearingMoney, true);
        Model::validateRequired('startTime', $this->startTime, true);
        Model::validateRequired('endTime', $this->endTime, true);
        Model::validateRequired('clearingOrderId', $this->clearingOrderId, true);
        Model::validateRequired('clearingAccount', $this->clearingAccount, true);
        Model::validateRequired('memo', $this->memo, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->returnIndex) {
            $res['return_index'] = $this->returnIndex;
        }
        if (null !== $this->clearingState) {
            $res['clearing_state'] = $this->clearingState;
        }
        if (null !== $this->clearingMoney) {
            $res['clearing_money'] = $this->clearingMoney;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        if (null !== $this->clearingOrderId) {
            $res['clearing_order_id'] = $this->clearingOrderId;
        }
        if (null !== $this->clearingAccount) {
            $res['clearing_account'] = $this->clearingAccount;
        }
        if (null !== $this->memo) {
            $res['memo'] = $this->memo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return LeaseClearingInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['return_index'])) {
            $model->returnIndex = $map['return_index'];
        }
        if (isset($map['clearing_state'])) {
            $model->clearingState = $map['clearing_state'];
        }
        if (isset($map['clearing_money'])) {
            $model->clearingMoney = $map['clearing_money'];
        }
        if (isset($map['start_time'])) {
            $model->startTime = $map['start_time'];
        }
        if (isset($map['end_time'])) {
            $model->endTime = $map['end_time'];
        }
        if (isset($map['clearing_order_id'])) {
            $model->clearingOrderId = $map['clearing_order_id'];
        }
        if (isset($map['clearing_account'])) {
            $model->clearingAccount = $map['clearing_account'];
        }
        if (isset($map['memo'])) {
            $model->memo = $map['memo'];
        }

        return $model;
    }
}
