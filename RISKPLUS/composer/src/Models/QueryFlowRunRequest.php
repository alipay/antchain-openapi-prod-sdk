<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryFlowRunRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'clientOrderNo' => 'client_order_no',
    ];
    public function validate() {
        Model::validateRequired('clientOrderNo', $this->clientOrderNo, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->clientOrderNo) {
            $res['client_order_no'] = $this->clientOrderNo;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryFlowRunRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['client_order_no'])){
            $model->clientOrderNo = $map['client_order_no'];
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

    // 创建 Flow Run 时传入的业务订单号，必须唯一，用于定位本次执行。
    /**
     * @var string
     */
    public $clientOrderNo;

}
