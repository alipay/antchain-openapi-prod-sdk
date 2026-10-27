<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TESTJZQ\Models;

use AlibabaCloud\Tea\Model;

use AntChain\TESTJZQ\Models\AddStruct;

class TestAddStructRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'structparam' => 'structparam',
    ];
    public function validate() {
        Model::validateRequired('structparam', $this->structparam, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->structparam) {
            $res['structparam'] = [];
            if(null !== $this->structparam && is_array($this->structparam)){
                $n = 0;
                foreach($this->structparam as $item){
                    $res['structparam'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return TestAddStructRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['structparam'])){
            if(!empty($map['structparam'])){
                $model->structparam = [];
                $n = 0;
                foreach($map['structparam'] as $item) {
                    $model->structparam[$n++] = null !== $item ? AddStruct::fromMap($item) : $item;
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

    // ceshi
    /**
     * @var AddStruct[]
     */
    public $structparam;

}
