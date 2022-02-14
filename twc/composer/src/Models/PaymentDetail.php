<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class PaymentDetail extends Model
{
    // 业务自定义扣款id，长度不能超过64
    /**
     * @example miivpw2345678
     *
     * @var string
     */
    public $bizTradeId;

    // 扣款期数
    /**
     * @example 1
     *
     * @var int
     */
    public $period;

    // 支付金额，单位：分
    /**
     * @example 1200
     *
     * @var int
     */
    public $payMoney;

    // 计划扣款时间，格式"yyyy-MM-dd HH:mm:ss"
    /**
     * @example 2022-01-19 12:00:00
     *
     * @var string
     */
    public $payDate;
    protected $_name = [
        'bizTradeId' => 'biz_trade_id',
        'period'     => 'period',
        'payMoney'   => 'pay_money',
        'payDate'    => 'pay_date',
    ];

    public function validate()
    {
        Model::validateRequired('bizTradeId', $this->bizTradeId, true);
        Model::validateRequired('period', $this->period, true);
        Model::validateRequired('payMoney', $this->payMoney, true);
        Model::validateRequired('payDate', $this->payDate, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->bizTradeId) {
            $res['biz_trade_id'] = $this->bizTradeId;
        }
        if (null !== $this->period) {
            $res['period'] = $this->period;
        }
        if (null !== $this->payMoney) {
            $res['pay_money'] = $this->payMoney;
        }
        if (null !== $this->payDate) {
            $res['pay_date'] = $this->payDate;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PaymentDetail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['biz_trade_id'])) {
            $model->bizTradeId = $map['biz_trade_id'];
        }
        if (isset($map['period'])) {
            $model->period = $map['period'];
        }
        if (isset($map['pay_money'])) {
            $model->payMoney = $map['pay_money'];
        }
        if (isset($map['pay_date'])) {
            $model->payDate = $map['pay_date'];
        }

        return $model;
    }
}
