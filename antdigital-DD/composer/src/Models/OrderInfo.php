<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

use AntChain\DD\Models\OrderDetail;

class OrderInfo extends Model {
    protected $_name = [
        'orderId' => 'order_id',
        'amount' => 'amount',
        'detail' => 'detail',
    ];
    public function validate() {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('amount', $this->amount, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->amount) {
            $res['amount'] = $this->amount;
        }
        if (null !== $this->detail) {
            $res['detail'] = null !== $this->detail ? $this->detail->toMap() : null;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return OrderInfo
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['order_id'])){
            $model->orderId = $map['order_id'];
        }
        if(isset($map['amount'])){
            $model->amount = $map['amount'];
        }
        if(isset($map['detail'])){
            $model->detail = OrderDetail::fromMap($map['detail']);
        }
        return $model;
    }
    // 订单号
    /**
     * @example ORD001
     * @var string
     */
    public $orderId;

    // 金额
    /**
     * @example 100
     * @var int
     */
    public $amount;

    // 详情
    /**
     * @example {}
     * @var OrderDetail
     */
    public $detail;

}
