<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class QueryAasAntdaoMypointsSkufeeResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'count' => 'count',
        'rate' => 'rate',
        'skuId' => 'sku_id',
        'totalAmount' => 'total_amount',
        'totalCost' => 'total_cost',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->count) {
            $res['count'] = $this->count;
        }
        if (null !== $this->rate) {
            $res['rate'] = $this->rate;
        }
        if (null !== $this->skuId) {
            $res['sku_id'] = $this->skuId;
        }
        if (null !== $this->totalAmount) {
            $res['total_amount'] = $this->totalAmount;
        }
        if (null !== $this->totalCost) {
            $res['total_cost'] = $this->totalCost;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryAasAntdaoMypointsSkufeeResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['req_msg_id'])){
            $model->reqMsgId = $map['req_msg_id'];
        }
        if(isset($map['result_code'])){
            $model->resultCode = $map['result_code'];
        }
        if(isset($map['result_msg'])){
            $model->resultMsg = $map['result_msg'];
        }
        if(isset($map['count'])){
            $model->count = $map['count'];
        }
        if(isset($map['rate'])){
            $model->rate = $map['rate'];
        }
        if(isset($map['sku_id'])){
            $model->skuId = $map['sku_id'];
        }
        if(isset($map['total_amount'])){
            $model->totalAmount = $map['total_amount'];
        }
        if(isset($map['total_cost'])){
            $model->totalCost = $map['total_cost'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $reqMsgId;

    /**
     * @var string
     */
    public $resultCode;

    /**
     * @var string
     */
    public $resultMsg;

    // 预下单的数量
    /**
     * @var integer
     */
    public $count;

    // 费率
    /**
     * @var string
     */
    public $rate;

    // 商品ID
    /**
     * @var string
     */
    public $skuId;

    // 总集分宝数量（个）
    /**
     * @var integer
     */
    public $totalAmount;

    // 总费用
    /**
     * @var string
     */
    public $totalCost;

}
