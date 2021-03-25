<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class ExecAasAntdaoMypointsPreorderskuResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'count' => 'count',
        'needRetry' => 'need_retry',
        'orderNo' => 'order_no',
        'preOrderId' => 'pre_order_id',
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
        if (null !== $this->needRetry) {
            $res['need_retry'] = $this->needRetry;
        }
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->preOrderId) {
            $res['pre_order_id'] = $this->preOrderId;
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
     * @return ExecAasAntdaoMypointsPreorderskuResponse
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
        if(isset($map['need_retry'])){
            $model->needRetry = $map['need_retry'];
        }
        if(isset($map['order_no'])){
            $model->orderNo = $map['order_no'];
        }
        if(isset($map['pre_order_id'])){
            $model->preOrderId = $map['pre_order_id'];
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

    // 数量
    /**
     * @var integer
     */
    public $count;

    // 是否需要重试
    /**
     * @var bool
     */
    public $needRetry;

    // 业务幂等ID
    /**
     * @var string
     */
    public $orderNo;

    // 预下单Id
    /**
     * @var string
     */
    public $preOrderId;

    // 商品ID
    /**
     * @var string
     */
    public $skuId;

    // 总集分宝数量(单位:个)
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
