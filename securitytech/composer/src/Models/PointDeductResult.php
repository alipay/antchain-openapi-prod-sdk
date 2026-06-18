<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class PointDeductResult extends Model
{
    // 账户ID
    /**
     * @example 0
     *
     * @var string
     */
    public $accountId;

    // 本次扣减总积分
    /**
     * @example 0
     *
     * @var string
     */
    public $totalDeductPoint;

    // 账户累计已消费积分
    /**
     * @example 0
     *
     * @var string
     */
    public $consumedPoint;

    // 成功扣减的子订单数
    /**
     * @example 0
     *
     * @var string
     */
    public $deductOrderCount;

    // 扣减失败的子订单ID列表（全部成功时为空）
    /**
     * @example undefined
     *
     * @var string[]
     */
    public $failedOrderIds;
    protected $_name = [
        'accountId'        => 'account_id',
        'totalDeductPoint' => 'total_deduct_point',
        'consumedPoint'    => 'consumed_point',
        'deductOrderCount' => 'deduct_order_count',
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
        if (null !== $this->totalDeductPoint) {
            $res['total_deduct_point'] = $this->totalDeductPoint;
        }
        if (null !== $this->consumedPoint) {
            $res['consumed_point'] = $this->consumedPoint;
        }
        if (null !== $this->deductOrderCount) {
            $res['deduct_order_count'] = $this->deductOrderCount;
        }
        if (null !== $this->failedOrderIds) {
            $res['failed_order_ids'] = $this->failedOrderIds;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PointDeductResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['account_id'])) {
            $model->accountId = $map['account_id'];
        }
        if (isset($map['total_deduct_point'])) {
            $model->totalDeductPoint = $map['total_deduct_point'];
        }
        if (isset($map['consumed_point'])) {
            $model->consumedPoint = $map['consumed_point'];
        }
        if (isset($map['deduct_order_count'])) {
            $model->deductOrderCount = $map['deduct_order_count'];
        }
        if (isset($map['failed_order_ids'])) {
            if (!empty($map['failed_order_ids'])) {
                $model->failedOrderIds = $map['failed_order_ids'];
            }
        }

        return $model;
    }
}
