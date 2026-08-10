<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class EsgUser extends Model {
    protected $_name = [
        'userId' => 'user_id',
        'userName' => 'user_name',
        'nickName' => 'nick_name',
        'realName' => 'real_name',
        'phoneNumber' => 'phone_number',
    ];
    public function validate() {
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('userName', $this->userName, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->userName) {
            $res['user_name'] = $this->userName;
        }
        if (null !== $this->nickName) {
            $res['nick_name'] = $this->nickName;
        }
        if (null !== $this->realName) {
            $res['real_name'] = $this->realName;
        }
        if (null !== $this->phoneNumber) {
            $res['phone_number'] = $this->phoneNumber;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return EsgUser
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['user_id'])){
            $model->userId = $map['user_id'];
        }
        if(isset($map['user_name'])){
            $model->userName = $map['user_name'];
        }
        if(isset($map['nick_name'])){
            $model->nickName = $map['nick_name'];
        }
        if(isset($map['real_name'])){
            $model->realName = $map['real_name'];
        }
        if(isset($map['phone_number'])){
            $model->phoneNumber = $map['phone_number'];
        }
        return $model;
    }
    // 当前操作员 ID
    /**
     * @example xxxxx
     * @var string
     */
    public $userId;

    // 当前登录账号。
    /**
     * @example xxxxx
     * @var string
     */
    public $userName;

    // 操作员昵称
    /**
     * @example xxxxx
     * @var string
     */
    public $nickName;

    // 操作员真实姓名
    /**
     * @example xxxxx
     * @var string
     */
    public $realName;

    // 操作员手机号
    /**
     * @example xxxxx
     * @var string
     */
    public $phoneNumber;

}
