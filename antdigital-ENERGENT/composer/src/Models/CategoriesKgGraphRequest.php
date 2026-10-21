<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ENERGENT\Models;

use AlibabaCloud\Tea\Model;

class CategoriesKgGraphRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'kbId' => 'kb_id',
    ];
    public function validate() {
        Model::validateRequired('kbId', $this->kbId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->kbId) {
            $res['kb_id'] = $this->kbId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CategoriesKgGraphRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['kb_id'])){
            $model->kbId = $map['kb_id'];
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

    // 知识库ID
    /**
     * @var string
     */
    public $kbId;

}
