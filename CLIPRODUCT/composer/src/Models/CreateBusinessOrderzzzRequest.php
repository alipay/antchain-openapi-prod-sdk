<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CLIPRODUCT\Models;

use AlibabaCloud\Tea\Model;

class CreateBusinessOrderzzzRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'orderNo' => 'order_no',
    ];
    public function validate() {
        Model::validateRequired('orderNo', $this->orderNo, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateBusinessOrderzzzRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['order_no'])){
            $model->orderNo = $map['order_no'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 订单编号
    /**
     * @var string
     */
    public $orderNo;

}
