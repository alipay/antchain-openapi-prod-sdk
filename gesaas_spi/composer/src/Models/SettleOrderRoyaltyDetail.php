<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\GESAAS_SPI\Models;

use AlibabaCloud\Tea\Model;

class SettleOrderRoyaltyDetail extends Model
{
    // 分账金额，单位：分
    /**
     * @example 100
     *
     * @var int
     */
    public $amount;

    // 分账执行时间
    /**
     * @example 2021-07-30 12:00:00
     *
     * @var string
     */
    public $executeTime;

    // 分账转出账号
    /**
     * @example 2088111111111111
     *
     * @var string
     */
    public $transOutAccount;

    // 分账转入账号
    /**
     * @example 2088111111111111
     *
     * @var string
     */
    public $transInAccount;
    protected $_name = [
        'amount'          => 'amount',
        'executeTime'     => 'execute_time',
        'transOutAccount' => 'trans_out_account',
        'transInAccount'  => 'trans_in_account',
    ];

    public function validate()
    {
        Model::validateRequired('amount', $this->amount, true);
        Model::validateRequired('executeTime', $this->executeTime, true);
        Model::validateRequired('transOutAccount', $this->transOutAccount, true);
        Model::validateRequired('transInAccount', $this->transInAccount, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->amount) {
            $res['amount'] = $this->amount;
        }
        if (null !== $this->executeTime) {
            $res['execute_time'] = $this->executeTime;
        }
        if (null !== $this->transOutAccount) {
            $res['trans_out_account'] = $this->transOutAccount;
        }
        if (null !== $this->transInAccount) {
            $res['trans_in_account'] = $this->transInAccount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SettleOrderRoyaltyDetail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['amount'])) {
            $model->amount = $map['amount'];
        }
        if (isset($map['execute_time'])) {
            $model->executeTime = $map['execute_time'];
        }
        if (isset($map['trans_out_account'])) {
            $model->transOutAccount = $map['trans_out_account'];
        }
        if (isset($map['trans_in_account'])) {
            $model->transInAccount = $map['trans_in_account'];
        }

        return $model;
    }
}
