<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\QQQ\Models;

use AlibabaCloud\Tea\Model;

class QueryDemoTtUseRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'idCard' => 'id_card',
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
        if (null !== $this->idCard) {
            $res['id_card'] = $this->idCard;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryDemoTtUseRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['id_card'])){
            $model->idCard = $map['id_card'];
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
    public $idCard;

}
