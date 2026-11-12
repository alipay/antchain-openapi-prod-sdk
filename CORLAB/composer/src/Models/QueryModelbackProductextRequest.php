<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CORLAB\Models;

use AlibabaCloud\Tea\Model;

class QueryModelbackProductextRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'productCodes' => 'product_codes',
    ];
    public function validate() {
        Model::validateRequired('productCodes', $this->productCodes, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->productCodes) {
            $res['product_codes'] = $this->productCodes;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryModelbackProductextRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['product_codes'])){
            if(!empty($map['product_codes'])){
                $model->productCodes = $map['product_codes'];
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

    // 通过产品Code查询出相关产品的产品名、模版字段等信息
    /**
     * @var string[]
     */
    public $productCodes;

}
