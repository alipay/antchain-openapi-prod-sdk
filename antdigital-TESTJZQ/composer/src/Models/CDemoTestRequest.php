<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TESTJZQ\Models;

use AlibabaCloud\Tea\Model;

use AntChain\TESTJZQ\Models\A;

class CDemoTestRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'a' => 'a',
    ];
    public function validate() {
        Model::validateRequired('a', $this->a, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->a) {
            $res['a'] = [];
            if(null !== $this->a && is_array($this->a)){
                $n = 0;
                foreach($this->a as $item){
                    $res['a'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CDemoTestRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['a'])){
            if(!empty($map['a'])){
                $model->a = [];
                $n = 0;
                foreach($map['a'] as $item) {
                    $model->a[$n++] = null !== $item ? A::fromMap($item) : $item;
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

    // a
    /**
     * @var A[]
     */
    public $a;

}
