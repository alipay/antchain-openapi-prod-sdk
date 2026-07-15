<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\AGORAX\Models;

use AlibabaCloud\Tea\Model;

class QueryBenefitAppRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'openId' => 'open_id',
    ];
    public function validate() {
        Model::validateRequired('openId', $this->openId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->openId) {
            $res['open_id'] = $this->openId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryBenefitAppRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['open_id'])){
            $model->openId = $map['open_id'];
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

    // 用户open_id
    /**
     * @var string
     */
    public $openId;

}
