<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class RepaymentOrderRequest extends Model {
    protected $_name = [
        'payDate' => 'pay_date',
        'payMoney' => 'pay_money',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
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
     * @return RepaymentOrderRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['pay_date'])){
            $model->payDate = $map['pay_date'];
        }
        if(isset($map['pay_money'])){
            $model->payMoney = $map['pay_money'];
        }
        return $model;
    }
    // 代扣触发时间，精确到毫秒
    // java.lang.System#currentTimeMillis()
    /**
     * @example 12345600000
     * @var int
     */
    public $payDate;

    // 代扣金额，整数 精确到分
    /**
     * @example 1000
     * @var int
     */
    public $payMoney;

}
