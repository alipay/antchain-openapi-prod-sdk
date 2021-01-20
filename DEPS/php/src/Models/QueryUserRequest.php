<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class QueryUserRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'loginName' => 'login_name',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->loginName) {
            $res['login_name'] = $this->loginName;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryUserRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['login_name'])){
            $model->loginName = $map['login_name'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    // 没传递该参数时，返回当前登录用户信息
    /**
     * @var string
     */
    public $loginName;

}
