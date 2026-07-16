<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DEMOSDK\Models;

use AlibabaCloud\Tea\Model;

use AntChain\DEMOSDK\Models\DemoClass;

class PublishTwiceOneRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'timeout' => 'timeout',
        'aaa' => 'aaa',
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
        if (null !== $this->aaa) {
            $res['aaa'] = null !== $this->aaa ? $this->aaa->toMap() : null;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return PublishTwiceOneRequest
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
        if(isset($map['aaa'])){
            $model->aaa = DemoClass::fromMap($map['aaa']);
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

    // aa
    /**
     * @var DemoClass
     */
    public $aaa;

}
