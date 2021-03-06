<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class QueryAasAntdaoMypointsSkufeeRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'chainId' => 'chain_id',
        'count' => 'count',
        'env' => 'env',
        'memo' => 'memo',
        'orderNo' => 'order_no',
        'skuId' => 'sku_id',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->regionName) {
            $res['region_name'] = $this->regionName;
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
        return $res;
    }
    /**
     * @param array $map
     * @return QueryAasAntdaoMypointsSkufeeRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['region_name'])){
            $model->regionName = $map['region_name'];
        }
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
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    /**
     * @var string
     */
    public $regionName;

    // 链ID
    /**
     * @var string
     */
    public $chainId;

    // 预下单数量
    /**
     * @var integer
     */
    public $count;

    // 环境标识(sandbox/prod)
    /**
     * @var string
     */
    public $env;

    // 备注信息
    /**
     * @var string
     */
    public $memo;

    // 业务幂等号
    /**
     * @var string
     */
    public $orderNo;

    // 商品ID
    /**
     * @var string
     */
    public $skuId;

}
