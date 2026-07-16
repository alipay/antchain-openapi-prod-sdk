<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DEMOSDK\Models;

use AlibabaCloud\Tea\Model;

use AntChain\DEMOSDK\Models\TestParamA;

class ZhongyipretestbZhongyipretestbZhongyipretestbRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'timeout' => 'timeout',
        'structParama' => 'struct_parama',
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
        if (null !== $this->timeout) {
            $res['timeout'] = $this->timeout;
        }
        if (null !== $this->structParama) {
            $res['struct_parama'] = null !== $this->structParama ? $this->structParama->toMap() : null;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ZhongyipretestbZhongyipretestbZhongyipretestbRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['timeout'])){
            $model->timeout = $map['timeout'];
        }
        if(isset($map['struct_parama'])){
            $model->structParama = TestParamA::fromMap($map['struct_parama']);
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

    // 1
    /**
     * @var string
     */
    public $timeout;

    // struct_parama
    /**
     * @var TestParamA
     */
    public $structParama;

}
