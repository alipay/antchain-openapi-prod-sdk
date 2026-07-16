<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CLIPRODUCT\Models;

use AlibabaCloud\Tea\Model;

class ApikCliCreateRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'timeout' => 'timeout',
        'name' => 'name',
        'age' => 'age',
    ];
    public function validate() {
        Model::validateRequired('timeout', $this->timeout, true);
    }
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
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->age) {
            $res['age'] = $this->age;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ApikCliCreateRequest
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
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['age'])){
            $model->age = $map['age'];
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

    // 超时时间
    /**
     * @var string
     */
    public $timeout;

    // 姓名
    /**
     * @var string
     */
    public $name;

    // 年龄
    /**
     * @var int
     */
    public $age;

}
