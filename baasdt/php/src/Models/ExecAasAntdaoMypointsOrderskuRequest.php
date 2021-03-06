<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class ExecAasAntdaoMypointsOrderskuRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
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
     * @return ExecAasAntdaoMypointsOrderskuRequest
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

    // 环境标识
    /**
     * @var string
     */
    public $env;

    // 业务幂等号
    /**
     * @var string
     */
    public $orderNo;

    // 手机号
    /**
     * @var string
     */
    public $phoneNumber;

    // 预下单号
    /**
     * @var string
     */
    public $preOrderId;

    // 商品ID
    /**
     * @var string
     */
    public $skuId;

}
