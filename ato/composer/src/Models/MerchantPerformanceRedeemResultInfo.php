<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class MerchantPerformanceRedeemResultInfo extends Model
{
    // 回购支付方式
    // ONLINE-线上
    // OFFLINE-线下
    /**
     * @example OFFLINE
     *
     * @var string
     */
    public $redeemWay;

    // 回购时间
    /**
     * @example 2024-10-17 18:41:59
     *
     * @var string
     */
    public $redeemTime;

    // 回购原因
    // ACTIVE_REDEEM("ACTIVE_REDEEM", "自主赎回"),
    // RENTING_OUT_REDEEM("RENTING_OUT_REDEEM",
    // "退租赎回"),
    // RENTING_AND_RESALE_REDEEM("RENTING_AND_RESALE_REDEEM",
    // "租转售赎回");
    /**
     * @example ACTIVE_REDEEM
     *
     * @var string
     */
    public $redeemReason;

    // 回购类型
    // TRANSFER，转账代偿
    // WITHHOLD，代扣代偿
    /**
     * @example TRANSFER
     *
     * @var string
     */
    public $redeemType;

    // 回购金额（分）
    /**
     * @example 100
     *
     * @var int
     */
    public $redeemAmount;

    // 回购状态
    // PAYING 回购中
    // SUCCESS 成功
    // FAILED 失败
    /**
     * @example PAYING
     *
     * @var string
     */
    public $redeemStatus;
    protected $_name = [
        'redeemWay'    => 'redeem_way',
        'redeemTime'   => 'redeem_time',
        'redeemReason' => 'redeem_reason',
        'redeemType'   => 'redeem_type',
        'redeemAmount' => 'redeem_amount',
        'redeemStatus' => 'redeem_status',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->redeemWay) {
            $res['redeem_way'] = $this->redeemWay;
        }
        if (null !== $this->redeemTime) {
            $res['redeem_time'] = $this->redeemTime;
        }
        if (null !== $this->redeemReason) {
            $res['redeem_reason'] = $this->redeemReason;
        }
        if (null !== $this->redeemType) {
            $res['redeem_type'] = $this->redeemType;
        }
        if (null !== $this->redeemAmount) {
            $res['redeem_amount'] = $this->redeemAmount;
        }
        if (null !== $this->redeemStatus) {
            $res['redeem_status'] = $this->redeemStatus;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MerchantPerformanceRedeemResultInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['redeem_way'])) {
            $model->redeemWay = $map['redeem_way'];
        }
        if (isset($map['redeem_time'])) {
            $model->redeemTime = $map['redeem_time'];
        }
        if (isset($map['redeem_reason'])) {
            $model->redeemReason = $map['redeem_reason'];
        }
        if (isset($map['redeem_type'])) {
            $model->redeemType = $map['redeem_type'];
        }
        if (isset($map['redeem_amount'])) {
            $model->redeemAmount = $map['redeem_amount'];
        }
        if (isset($map['redeem_status'])) {
            $model->redeemStatus = $map['redeem_status'];
        }

        return $model;
    }
}
