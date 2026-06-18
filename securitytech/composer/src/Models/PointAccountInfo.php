<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class PointAccountInfo extends Model
{
    // 门店ID
    /**
     * @example 0
     *
     * @var string
     */
    public $storeId;

    // 账户ID
    /**
     * @example 0
     *
     * @var string
     */
    public $accountId;

    // 总积分
    /**
     * @example 0
     *
     * @var string
     */
    public $totalPoint;

    // 已充值积分
    /**
     * @example 0
     *
     * @var string
     */
    public $rechargedPoint;

    // 可用积分
    /**
     * @example 0
     *
     * @var string
     */
    public $availablePoint;

    // 冻结积分
    /**
     * @example 0
     *
     * @var string
     */
    public $frozenPoint;

    // 已消费积分
    /**
     * @example 0
     *
     * @var string
     */
    public $consumedPoint;

    // 账户状态：ACTIVE-生效, INACTIVE-失效, FROZEN-逾期冻结, CANCEL-解约中
    /**
     * @example ACTIVE
     *
     * @var string
     */
    public $accountStatus;
    protected $_name = [
        'storeId'        => 'store_id',
        'accountId'      => 'account_id',
        'totalPoint'     => 'total_point',
        'rechargedPoint' => 'recharged_point',
        'availablePoint' => 'available_point',
        'frozenPoint'    => 'frozen_point',
        'consumedPoint'  => 'consumed_point',
        'accountStatus'  => 'account_status',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->storeId) {
            $res['store_id'] = $this->storeId;
        }
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
        }
        if (null !== $this->totalPoint) {
            $res['total_point'] = $this->totalPoint;
        }
        if (null !== $this->rechargedPoint) {
            $res['recharged_point'] = $this->rechargedPoint;
        }
        if (null !== $this->availablePoint) {
            $res['available_point'] = $this->availablePoint;
        }
        if (null !== $this->frozenPoint) {
            $res['frozen_point'] = $this->frozenPoint;
        }
        if (null !== $this->consumedPoint) {
            $res['consumed_point'] = $this->consumedPoint;
        }
        if (null !== $this->accountStatus) {
            $res['account_status'] = $this->accountStatus;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PointAccountInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['store_id'])) {
            $model->storeId = $map['store_id'];
        }
        if (isset($map['account_id'])) {
            $model->accountId = $map['account_id'];
        }
        if (isset($map['total_point'])) {
            $model->totalPoint = $map['total_point'];
        }
        if (isset($map['recharged_point'])) {
            $model->rechargedPoint = $map['recharged_point'];
        }
        if (isset($map['available_point'])) {
            $model->availablePoint = $map['available_point'];
        }
        if (isset($map['frozen_point'])) {
            $model->frozenPoint = $map['frozen_point'];
        }
        if (isset($map['consumed_point'])) {
            $model->consumedPoint = $map['consumed_point'];
        }
        if (isset($map['account_status'])) {
            $model->accountStatus = $map['account_status'];
        }

        return $model;
    }
}
