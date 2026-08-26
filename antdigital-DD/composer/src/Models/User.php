<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

class User extends Model {
    protected $_name = [
        'userId' => 'user_id',
        'userName' => 'user_name',
        'loginName' => 'login_name',
    ];
    public function validate() {
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('userName', $this->userName, true);
        Model::validateRequired('loginName', $this->loginName, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->userName) {
            $res['user_name'] = $this->userName;
        }
        if (null !== $this->loginName) {
            $res['login_name'] = $this->loginName;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return User
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['user_id'])){
            $model->userId = $map['user_id'];
        }
        if(isset($map['user_name'])){
            $model->userName = $map['user_name'];
        }
        if(isset($map['login_name'])){
            $model->loginName = $map['login_name'];
        }
        return $model;
    }
    // 用户ID
    /**
     * @example 0000460699
     * @var string
     */
    public $userId;

    // 用户名称
    /**
     * @example 张三
     * @var string
     */
    public $userName;

    // 登录名
    /**
     * @example xsh@digital-engine.com
     * @var string
     */
    public $loginName;

}
