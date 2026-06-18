<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class PoiMallPointFreezeResult extends Model
{
    // 账户ID
    /**
     * @example 0
     *
     * @var string
     */
    public $accountId;

    // 本次冻结总积分
    /**
     * @example 0
     *
     * @var string
     */
    public $totalFreezePoint;

    // 冻结后剩余可用积分
    /**
     * @example 0
     *
     * @var string
     */
    public $availablePoint;

    // 成功冻结的子订单数
    /**
     * @example 0
     *
     * @var string
     */
    public $freezeOrderCount;

    // 冻结失败的子订单ID列表
    /**
     * @example undefined
     *
     * @var string[]
     */
    public $failedOrderIds;
    protected $_name = [
        'accountId'        => 'account_id',
        'totalFreezePoint' => 'total_freeze_point',
        'availablePoint'   => 'available_point',
        'freezeOrderCount' => 'freeze_order_count',
        'failedOrderIds'   => 'failed_order_ids',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
        }
        if (null !== $this->totalFreezePoint) {
            $res['total_freeze_point'] = $this->totalFreezePoint;
        }
        if (null !== $this->availablePoint) {
            $res['available_point'] = $this->availablePoint;
        }
        if (null !== $this->freezeOrderCount) {
            $res['freeze_order_count'] = $this->freezeOrderCount;
        }
        if (null !== $this->failedOrderIds) {
            $res['failed_order_ids'] = $this->failedOrderIds;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PoiMallPointFreezeResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['account_id'])) {
            $model->accountId = $map['account_id'];
        }
        if (isset($map['total_freeze_point'])) {
            $model->totalFreezePoint = $map['total_freeze_point'];
        }
        if (isset($map['available_point'])) {
            $model->availablePoint = $map['available_point'];
        }
        if (isset($map['freeze_order_count'])) {
            $model->freezeOrderCount = $map['freeze_order_count'];
        }
        if (isset($map['failed_order_ids'])) {
            if (!empty($map['failed_order_ids'])) {
                $model->failedOrderIds = $map['failed_order_ids'];
            }
        }

        return $model;
    }
}
