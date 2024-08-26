<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class UserPerformanceInfo extends Model
{
    // 履约期数
    /**
     * @example 1
     *
     * @var int
     */
    public $periodNum;

    // 履约时间，格式 yyyy-MM-dd
    // 针对签收日作为起租日模式,未签收时：以签收日开始计算
    /**
     * @example 2018-10-10
     *
     * @var string
     */
    public $payDate;

    // 履约金额，单位为分
    /**
     * @example 10
     *
     * @var int
     */
    public $payMoney;
    protected $_name = [
        'periodNum' => 'period_num',
        'payDate'   => 'pay_date',
        'payMoney'  => 'pay_money',
    ];

    public function validate()
    {
        Model::validateRequired('periodNum', $this->periodNum, true);
        Model::validateRequired('payDate', $this->payDate, true);
        Model::validateRequired('payMoney', $this->payMoney, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->periodNum) {
            $res['period_num'] = $this->periodNum;
        }
        if (null !== $this->payDate) {
            $res['pay_date'] = $this->payDate;
        }
        if (null !== $this->payMoney) {
            $res['pay_money'] = $this->payMoney;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UserPerformanceInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['period_num'])) {
            $model->periodNum = $map['period_num'];
        }
        if (isset($map['pay_date'])) {
            $model->payDate = $map['pay_date'];
        }
        if (isset($map['pay_money'])) {
            $model->payMoney = $map['pay_money'];
        }

        return $model;
    }
}
