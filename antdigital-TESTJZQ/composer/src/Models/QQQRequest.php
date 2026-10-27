<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TESTJZQ\Models;

use AlibabaCloud\Tea\Model;

use AntChain\TESTJZQ\Models\Q;

class QQQRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'struct' => 'struct',
    ];
    public function validate() {
        Model::validateRequired('struct', $this->struct, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->struct) {
            $res['struct'] = [];
            if(null !== $this->struct && is_array($this->struct)){
                $n = 0;
                foreach($this->struct as $item){
                    $res['struct'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QQQRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['struct'])){
            if(!empty($map['struct'])){
                $model->struct = [];
                $n = 0;
                foreach($map['struct'] as $item) {
                    $model->struct[$n++] = null !== $item ? Q::fromMap($item) : $item;
                }
            }
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

    // test
    /**
     * @var Q[]
     */
    public $struct;

}
