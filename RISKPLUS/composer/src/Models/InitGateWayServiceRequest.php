<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class InitGateWayServiceRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'user' => 'user',
        'pass' => 'pass',
    ];
    public function validate() {
        Model::validateRequired('user', $this->user, true);
        Model::validateRequired('pass', $this->pass, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->user) {
            $res['user'] = $this->user;
        }
        if (null !== $this->pass) {
            $res['pass'] = $this->pass;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return InitGateWayServiceRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['user'])){
            $model->user = $map['user'];
        }
        if(isset($map['pass'])){
            $model->pass = $map['pass'];
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

    // 测试
    /**
     * @var string
     */
    public $user;

    // 测试
    /**
     * @var string
     */
    public $pass;

}
