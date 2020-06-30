<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class ExecMypointsPreorderskuResponse extends Model {
    protected $_name = [
        'count' => 'count',
        'orderNo' => 'order_no',
        'preOrderId' => 'pre_order_id',
        'skuId' => 'sku_id',
        'totalAmount' => 'total_amount',
        'totalCost' => 'total_cost',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->count) {
            $res['count'] = $this->count;
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
     * @return ExecMypointsPreorderskuResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['count'])){
            $model->count = $map['count'];
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
     * @description 数量
     * @example 10
     * @var integer
     */
    public $count;

    /**
     * @description 业务幂等ID
     * @example JFB1234567
     * @var string
     */
    public $orderNo;

    /**
     * @description 预下单Id
     * @example PREORDER001
     * @var string
     */
    public $preOrderId;

    /**
     * @description 商品ID
     * @example 2367452386537ab38647
     * @var string
     */
    public $skuId;

    /**
     * @description 总集分宝数量(单位:个)
     * @example 100000
     * @var integer
     */
    public $totalAmount;

    /**
     * @description 总费用
     * @example 100006
     * @var string
     */
    public $totalCost;

}
