<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class ExecMypointsPreorderskuRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 链ID
    /**
     * @var string
     */
    public $chainId;

    // 预下单数量
    /**
     * @var int
     */
    public $count;

    // 环境标识
    /**
     * @var string
     */
    public $env;

    // 备注
    /**
     * @var string
     */
    public $memo;

    // 业务幂等号，商户需要保证每笔订单号唯一
    /**
     * @var string
     */
    public $orderNo;

    // 商品ID
    /**
     * @var string
     */
    public $skuId;

    // 总花费花费(询价接口结果)
    /**
     * @var string
     */
    public $totalCost;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'chainId'           => 'chain_id',
        'count'             => 'count',
        'env'               => 'env',
        'memo'              => 'memo',
        'orderNo'           => 'order_no',
        'skuId'             => 'sku_id',
        'totalCost'         => 'total_cost',
    ];

    public function validate()
    {
        Model::validateRequired('chainId', $this->chainId, true);
        Model::validateRequired('count', $this->count, true);
        Model::validateRequired('env', $this->env, true);
        Model::validateRequired('orderNo', $this->orderNo, true);
        Model::validateRequired('skuId', $this->skuId, true);
        Model::validateRequired('totalCost', $this->totalCost, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
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
     *
     * @return ExecMypointsPreorderskuRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['chain_id'])) {
            $model->chainId = $map['chain_id'];
        }
        if (isset($map['count'])) {
            $model->count = $map['count'];
        }
        if (isset($map['env'])) {
            $model->env = $map['env'];
        }
        if (isset($map['memo'])) {
            $model->memo = $map['memo'];
        }
        if (isset($map['order_no'])) {
            $model->orderNo = $map['order_no'];
        }
        if (isset($map['sku_id'])) {
            $model->skuId = $map['sku_id'];
        }
        if (isset($map['total_cost'])) {
            $model->totalCost = $map['total_cost'];
        }

        return $model;
    }
}
