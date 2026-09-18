<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

use AntChain\SECURITYTECH\Models\FundItem;

class OrderFundItem extends Model {
    protected $_name = [
        'orderId' => 'order_id',
        'tradeNo' => 'trade_no',
        'amount' => 'amount',
        'details' => 'details',
    ];
    public function validate() {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('tradeNo', $this->tradeNo, true);
        Model::validateRequired('amount', $this->amount, true);
        Model::validateRequired('details', $this->details, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->tradeNo) {
            $res['trade_no'] = $this->tradeNo;
        }
        if (null !== $this->amount) {
            $res['amount'] = $this->amount;
        }
        if (null !== $this->details) {
            $res['details'] = [];
            if(null !== $this->details && is_array($this->details)){
                $n = 0;
                foreach($this->details as $item){
                    $res['details'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return OrderFundItem
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['order_id'])){
            $model->orderId = $map['order_id'];
        }
        if(isset($map['trade_no'])){
            $model->tradeNo = $map['trade_no'];
        }
        if(isset($map['amount'])){
            $model->amount = $map['amount'];
        }
        if(isset($map['details'])){
            if(!empty($map['details'])){
                $model->details = [];
                $n = 0;
                foreach($map['details'] as $item) {
                    $model->details[$n++] = null !== $item ? FundItem::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    // order_id
    /**
     * @example METL202004041220123456
     * @var string
     */
    public $orderId;

    // trade_no
    /**
     * @example METL202004041220123456
     * @var string
     */
    public $tradeNo;

    // amount
    /**
     * @example 300.00
     * @var string
     */
    public $amount;

    // 详细
    /**
     * @example 
     * @var FundItem[]
     */
    public $details;

}
