<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class RepaymentOrderRequest extends Model
{
    // 代扣触发时间，精确到毫秒
    // java.lang.System#currentTimeMillis()
    /**
     * @example 12345600000
     *
     * @var int
     */
    public $payDate;

    // 代扣金额，整数 精确到分
    /**
     * @example 1000
     *
     * @var int
     */
    public $payMoney;

    // 是否用户签署成功后立即触发第一期代扣
    /**
     * @example 1
     *
     * @var int
     */
    public $triggerImmediately;
    protected $_name = [
        'payDate'            => 'pay_date',
        'payMoney'           => 'pay_money',
        'triggerImmediately' => 'trigger_immediately',
    ];

    public function validate()
    {
        Model::validateRequired('payDate', $this->payDate, true);
        Model::validateRequired('payMoney', $this->payMoney, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->payDate) {
            $res['pay_date'] = $this->payDate;
        }
        if (null !== $this->payMoney) {
            $res['pay_money'] = $this->payMoney;
        }
        if (null !== $this->triggerImmediately) {
            $res['trigger_immediately'] = $this->triggerImmediately;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RepaymentOrderRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['pay_date'])) {
            $model->payDate = $map['pay_date'];
        }
        if (isset($map['pay_money'])) {
            $model->payMoney = $map['pay_money'];
        }
        if (isset($map['trigger_immediately'])) {
            $model->triggerImmediately = $map['trigger_immediately'];
        }

        return $model;
    }
}
