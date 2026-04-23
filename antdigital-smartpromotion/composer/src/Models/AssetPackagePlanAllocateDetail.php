<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SMARTPROMOTION\Models;

use AlibabaCloud\Tea\Model;

class AssetPackagePlanAllocateDetail extends Model
{
    // 订单id
    /**
     * @example 123
     *
     * @var string
     */
    public $orderId;

    // 商户租户id
    /**
     * @example HXDRFKOF
     *
     * @var string
     */
    public $tenantId;

    // 类型
    // PERFORMANCE 履约
    // ASSET_PACKAGE_EXCESS 资产包超额
    /**
     * @example ASSET_PACKAGE_EXCESS
     *
     * @var string
     */
    public $type;

    // 用户还款期数
    /**
     * @example 1
     *
     * @var int
     */
    public $periodNum;

    // 用户还款时间yyyy-MM-dd
    /**
     * @example 2026-03-16
     *
     * @var string
     */
    public $payDay;

    // 用户还款金额，单位为分
    /**
     * @example 100
     *
     * @var int
     */
    public $payAmount;

    // 分账比例(不存储实时计算)，保留两位小数，比例统一类型。
    /**
     * @example 20
     *
     * @var string
     */
    public $divideRatio;

    // 商户履约分账金额
    /**
     * @example 100
     *
     * @var int
     */
    public $divideAmount;
    protected $_name = [
        'orderId'      => 'order_id',
        'tenantId'     => 'tenant_id',
        'type'         => 'type',
        'periodNum'    => 'period_num',
        'payDay'       => 'pay_day',
        'payAmount'    => 'pay_amount',
        'divideRatio'  => 'divide_ratio',
        'divideAmount' => 'divide_amount',
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
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->periodNum) {
            $res['period_num'] = $this->periodNum;
        }
        if (null !== $this->payDay) {
            $res['pay_day'] = $this->payDay;
        }
        if (null !== $this->payAmount) {
            $res['pay_amount'] = $this->payAmount;
        }
        if (null !== $this->divideRatio) {
            $res['divide_ratio'] = $this->divideRatio;
        }
        if (null !== $this->divideAmount) {
            $res['divide_amount'] = $this->divideAmount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AssetPackagePlanAllocateDetail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['period_num'])) {
            $model->periodNum = $map['period_num'];
        }
        if (isset($map['pay_day'])) {
            $model->payDay = $map['pay_day'];
        }
        if (isset($map['pay_amount'])) {
            $model->payAmount = $map['pay_amount'];
        }
        if (isset($map['divide_ratio'])) {
            $model->divideRatio = $map['divide_ratio'];
        }
        if (isset($map['divide_amount'])) {
            $model->divideAmount = $map['divide_amount'];
        }

        return $model;
    }
}
