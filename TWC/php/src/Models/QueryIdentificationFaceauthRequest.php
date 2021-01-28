<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class QueryIdentificationFaceauthRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'certifyId' => 'certify_id',
        'authCode' => 'auth_code',
    ];
    public function validate() {
        Model::validateRequired('certifyId', $this->certifyId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->certifyId) {
            $res['certify_id'] = $this->certifyId;
        }
        if (null !== $this->authCode) {
            $res['auth_code'] = $this->authCode;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryIdentificationFaceauthRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['certify_id'])){
            $model->certifyId = $map['certify_id'];
        }
        if(isset($map['auth_code'])){
            $model->authCode = $map['auth_code'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 实人认证流程ID
    /**
     * @var string
     */
    public $certifyId;

    // 授权码，针对某些特定场景使用，非必填
    /**
     * @var string
     */
    public $authCode;

}
