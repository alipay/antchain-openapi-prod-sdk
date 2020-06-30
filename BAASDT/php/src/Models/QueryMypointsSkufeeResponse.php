<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class QueryMypointsSkufeeResponse extends Model {
    protected $_name = [
        'count' => 'count',
        'rate' => 'rate',
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
     * @return QueryMypointsSkufeeResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
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
     * @description 预下单的数量
     * @example 100
     * @var integer
     */
    public $count;

    /**
     * @description 费率
     * @example 0.006
     * @var string
     */
    public $rate;

    /**
     * @description 商品ID
     * @example 23546356253462536abc3843
     * @var string
     */
    public $skuId;

    /**
     * @description 总集分宝数量（个）
     * @example 10000
     * @var integer
     */
    public $totalAmount;

    /**
     * @description 总费用
     * @example 100.06
     * @var string
     */
    public $totalCost;

}
