<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

use AntChain\RISKPLUS\Models\FundItemDetail;

class UserFundInfo extends Model {
    protected $_name = [
        'bizOrderNo' => 'biz_order_no',
        'tradeNo' => 'trade_no',
        'amount' => 'amount',
        'details' => 'details',
    ];
    public function validate() {
        Model::validateRequired('bizOrderNo', $this->bizOrderNo, true);
        Model::validateRequired('tradeNo', $this->tradeNo, true);
        Model::validateRequired('amount', $this->amount, true);
        Model::validateRequired('details', $this->details, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->bizOrderNo) {
            $res['biz_order_no'] = $this->bizOrderNo;
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
     * @return UserFundInfo
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['biz_order_no'])){
            $model->bizOrderNo = $map['biz_order_no'];
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
                    $model->details[$n++] = null !== $item ? FundItemDetail::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    // 业务订单号
    /**
     * @example xxx
     * @var string
     */
    public $bizOrderNo;

    // 关联交易单号
    /**
     * @example xxx
     * @var string
     */
    public $tradeNo;

    // 订单支付金额，单位：元
    /**
     * @example 199.68
     * @var string
     */
    public $amount;

    // 金额明细
    /**
     * @example 
     * @var FundItemDetail[]
     */
    public $details;

}
