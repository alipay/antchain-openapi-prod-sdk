<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\GESAAS\Models;

use AlibabaCloud\Tea\Model;

class RefundDetailItemList extends Model {
    protected $_name = [
        'amount' => 'amount',
        'transOutAccount' => 'trans_out_account',
        'transInAccount' => 'trans_in_account',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->amount) {
            $res['amount'] = $this->amount;
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
     * @return RefundDetailItemList
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['amount'])){
            $model->amount = $map['amount'];
        }
        if(isset($map['trans_out_account'])){
            $model->transOutAccount = $map['trans_out_account'];
        }
        if(isset($map['trans_in_account'])){
            $model->transInAccount = $map['trans_in_account'];
        }
        return $model;
    }
    // 退款退分账金额，单位为分
    /**
     * @example 990
     * @var int
     */
    public $amount;

    // 退款退分账支出账号
    /**
     * @example 2088101126765726
     * @var string
     */
    public $transOutAccount;

    // 退款退分账转入账号
    /**
     * @example 2088101126765726
     * @var string
     */
    public $transInAccount;

}
