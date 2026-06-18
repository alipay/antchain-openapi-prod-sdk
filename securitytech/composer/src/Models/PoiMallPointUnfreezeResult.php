<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class PoiMallPointUnfreezeResult extends Model
{
    // 账户ID
    /**
     * @example 0
     *
     * @var string
     */
    public $accountId;

    // 本次解冻总积分
    /**
     * @example 0
     *
     * @var string
     */
    public $totalUnfreezePoint;

    // 成功解冻的子订单数
    /**
     * @example 0
     *
     * @var string
     */
    public $availablePoint;

    // 解冻失败的子订单ID列表
    /**
     * @example undefined
     *
     * @var string[]
     */
    public $failedOrderIds;

    // 成功解冻的子订单数
    /**
     * @example 0
     *
     * @var string
     */
    public $unfreezeOrderCount;
    protected $_name = [
        'accountId'          => 'account_id',
        'totalUnfreezePoint' => 'total_unfreeze_point',
        'availablePoint'     => 'available_point',
        'failedOrderIds'     => 'failed_order_ids',
        'unfreezeOrderCount' => 'unfreeze_order_count',
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
        if (null !== $this->totalUnfreezePoint) {
            $res['total_unfreeze_point'] = $this->totalUnfreezePoint;
        }
        if (null !== $this->availablePoint) {
            $res['available_point'] = $this->availablePoint;
        }
        if (null !== $this->failedOrderIds) {
            $res['failed_order_ids'] = $this->failedOrderIds;
        }
        if (null !== $this->unfreezeOrderCount) {
            $res['unfreeze_order_count'] = $this->unfreezeOrderCount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PoiMallPointUnfreezeResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['account_id'])) {
            $model->accountId = $map['account_id'];
        }
        if (isset($map['total_unfreeze_point'])) {
            $model->totalUnfreezePoint = $map['total_unfreeze_point'];
        }
        if (isset($map['available_point'])) {
            $model->availablePoint = $map['available_point'];
        }
        if (isset($map['failed_order_ids'])) {
            if (!empty($map['failed_order_ids'])) {
                $model->failedOrderIds = $map['failed_order_ids'];
            }
        }
        if (isset($map['unfreeze_order_count'])) {
            $model->unfreezeOrderCount = $map['unfreeze_order_count'];
        }

        return $model;
    }
}
