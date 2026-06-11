<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\GESAAS\Models;

use AlibabaCloud\Tea\Model;

class RefundDetail extends Model
{
    // 支出方账户ID，如果是支付宝：以2088开头的纯16位数字
    /**
     * @example 2088101126765726
     *
     * @var string
     */
    public $transOutAccount;

    // 分账的金额，单位为分
    /**
     * @example 990
     *
     * @var int
     */
    public $amount;
    protected $_name = [
        'transOutAccount' => 'trans_out_account',
        'amount'          => 'amount',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->transOutAccount) {
            $res['trans_out_account'] = $this->transOutAccount;
        }
        if (null !== $this->amount) {
            $res['amount'] = $this->amount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RefundDetail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['trans_out_account'])) {
            $model->transOutAccount = $map['trans_out_account'];
        }
        if (isset($map['amount'])) {
            $model->amount = $map['amount'];
        }

        return $model;
    }
}
