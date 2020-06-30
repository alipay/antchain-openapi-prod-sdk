<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class QueryMypointsOrderinstructionRequest extends Model {
    protected $_name = [
        'chainId' => 'chain_id',
        'env' => 'env',
        'orderNo' => 'order_no',
        'skuId' => 'sku_id',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->chainId) {
            $res['chain_id'] = $this->chainId;
        }
        if (null !== $this->env) {
            $res['env'] = $this->env;
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
     * @return QueryMypointsOrderinstructionRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['chain_id'])){
            $model->chainId = $map['chain_id'];
        }
        if(isset($map['env'])){
            $model->env = $map['env'];
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
     * @description 链ID
     * @example mypoints
     * @var string
     */
    public $chainId;

    /**
     * @description 环境标识
     * @example prod
     * @var string
     */
    public $env;

    /**
     * @description 业务幂等号
     * @example S20200707123456
     * @var string
     */
    public $orderNo;

    /**
     * @description SKU ID
     * @example 53462386abc367343
     * @var string
     */
    public $skuId;

}
