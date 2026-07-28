<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\MDIP\Models;

use AlibabaCloud\Tea\Model;

class RefoundGoodOrderInfo extends Model {
    protected $_name = [
        'goodsOrderNo' => 'goods_order_no',
        'amount' => 'amount',
    ];
    public function validate() {
        Model::validateRequired('goodsOrderNo', $this->goodsOrderNo, true);
        Model::validateRequired('amount', $this->amount, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->goodsOrderNo) {
            $res['goods_order_no'] = $this->goodsOrderNo;
        }
        if (null !== $this->amount) {
            $res['amount'] = $this->amount;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return RefoundGoodOrderInfo
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['goods_order_no'])){
            $model->goodsOrderNo = $map['goods_order_no'];
        }
        if(isset($map['amount'])){
            $model->amount = $map['amount'];
        }
        return $model;
    }
    // 商城订单号
    /**
     * @example 2023343380112
     * @var string
     */
    public $goodsOrderNo;

    // 退款金额
    /**
     * @example 1000.00
     * @var string
     */
    public $amount;

}
