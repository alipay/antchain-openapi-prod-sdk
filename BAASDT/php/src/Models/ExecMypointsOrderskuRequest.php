<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class ExecMypointsOrderskuRequest extends Model {
    protected $_name = [
        'chainId' => 'chain_id',
        'env' => 'env',
        'orderNo' => 'order_no',
        'phoneNumber' => 'phone_number',
        'preOrderId' => 'pre_order_id',
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
        if (null !== $this->phoneNumber) {
            $res['phone_number'] = $this->phoneNumber;
        }
        if (null !== $this->preOrderId) {
            $res['pre_order_id'] = $this->preOrderId;
        }
        if (null !== $this->skuId) {
            $res['sku_id'] = $this->skuId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ExecMypointsOrderskuRequest
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
        if(isset($map['phone_number'])){
            $model->phoneNumber = $map['phone_number'];
        }
        if(isset($map['pre_order_id'])){
            $model->preOrderId = $map['pre_order_id'];
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
     * @example loadtest/pre/gray/prod
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
     * @description 手机号
     * @example 15809890000
     * @var string
     */
    public $phoneNumber;

    /**
     * @description 预下单号
     * @example PREORDER001
     * @var string
     */
    public $preOrderId;

    /**
     * @description 商品ID
     * @example 164723847238746
     * @var string
     */
    public $skuId;

}
