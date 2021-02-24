<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class CreateRbbApiGwtokenRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'extension' => 'extension',
        'password' => 'password',
        'username' => 'username',
    ];
    public function validate() {
        Model::validateRequired('password', $this->password, true);
        Model::validateRequired('username', $this->username, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->extension) {
            $res['extension'] = $this->extension;
        }
        if (null !== $this->password) {
            $res['password'] = $this->password;
        }
        if (null !== $this->username) {
            $res['username'] = $this->username;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateRbbApiGwtokenRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['extension'])){
            $model->extension = $map['extension'];
        }
        if(isset($map['password'])){
            $model->password = $map['password'];
        }
        if(isset($map['username'])){
            $model->username = $map['username'];
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

    // 扩展字段
    /**
     * @var string
     */
    public $extension;

    // 新人用户密码，用来做映射生成token
    /**
     * @var string
     */
    public $password;

    // 用户
    /**
     * @var string
     */
    public $username;

}
