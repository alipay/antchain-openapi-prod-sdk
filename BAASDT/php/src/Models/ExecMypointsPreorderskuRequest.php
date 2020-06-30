<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class ExecMypointsPreorderskuRequest extends Model {
    protected $_name = [
        'chainId' => 'chain_id',
        'count' => 'count',
        'env' => 'env',
        'memo' => 'memo',
        'orderNo' => 'order_no',
        'skuId' => 'sku_id',
        'totalCost' => 'total_cost',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->chainId) {
            $res['chain_id'] = $this->chainId;
        }
        if (null !== $this->count) {
            $res['count'] = $this->count;
        }
        if (null !== $this->env) {
            $res['env'] = $this->env;
        }
        if (null !== $this->memo) {
            $res['memo'] = $this->memo;
        }
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->skuId) {
            $res['sku_id'] = $this->skuId;
        }
        if (null !== $this->totalCost) {
            $res['total_cost'] = $this->totalCost;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ExecMypointsPreorderskuRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['chain_id'])){
            $model->chainId = $map['chain_id'];
        }
        if(isset($map['count'])){
            $model->count = $map['count'];
        }
        if(isset($map['env'])){
            $model->env = $map['env'];
        }
        if(isset($map['memo'])){
            $model->memo = $map['memo'];
        }
        if(isset($map['order_no'])){
            $model->orderNo = $map['order_no'];
        }
        if(isset($map['sku_id'])){
            $model->skuId = $map['sku_id'];
        }
        if(isset($map['total_cost'])){
            $model->totalCost = $map['total_cost'];
        }
        return $model;
    }
    /**
     * @description 链ID
     * @example mypoints
     * @var string
     */
    public $chainId;

    /**
     * @description 预下单数量
     * @example 10000
     * @var integer
     */
    public $count;

    /**
     * @description 环境标识
     * @example loadtest/pre/gray/prod
     * @var string
     */
    public $env;

    /**
     * @description 备注
     * @example 预下单
     * @var string
     */
    public $memo;

    /**
     * @description 业务幂等号，商户需要保证每笔订单号唯一
     * @example S20200707123456
     * @var string
     */
    public $orderNo;

    /**
     * @description 商品ID
     * @example 21432654236547657
     * @var string
     */
    public $skuId;

    /**
     * @description 总花费花费(询价接口结果) 
     * @example 1000.06
     * @var string
     */
    public $totalCost;

}
