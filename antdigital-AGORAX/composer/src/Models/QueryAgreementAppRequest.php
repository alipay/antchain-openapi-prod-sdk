<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\AGORAX\Models;

use AlibabaCloud\Tea\Model;

class QueryAgreementAppRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'openId' => 'open_id',
        'associatedAppId' => 'associated_app_id',
        'associatedOpenId' => 'associated_open_id',
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
        if (null !== $this->openId) {
            $res['open_id'] = $this->openId;
        }
        if (null !== $this->associatedAppId) {
            $res['associated_app_id'] = $this->associatedAppId;
        }
        if (null !== $this->associatedOpenId) {
            $res['associated_open_id'] = $this->associatedOpenId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryAgreementAppRequest
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
        if(isset($map['associated_app_id'])){
            $model->associatedAppId = $map['associated_app_id'];
        }
        if(isset($map['associated_open_id'])){
            $model->associatedOpenId = $map['associated_open_id'];
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

    // 小程序用户open_id
    /**
     * @var string
     */
    public $openId;

    // 关联小程序appId
    /**
     * @var string
     */
    public $associatedAppId;

    // 关联的小程序用户openId
    /**
     * @var string
     */
    public $associatedOpenId;

}
