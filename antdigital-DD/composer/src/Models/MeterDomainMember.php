<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

class MeterDomainMember extends Model {
    protected $_name = [
        'role' => 'role',
        'userId' => 'user_id',
        'nickName' => 'nick_name',
        'name' => 'name',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->role) {
            $res['role'] = $this->role;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->nickName) {
            $res['nick_name'] = $this->nickName;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return MeterDomainMember
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['role'])){
            $model->role = $map['role'];
        }
        if(isset($map['user_id'])){
            $model->userId = $map['user_id'];
        }
        if(isset($map['nick_name'])){
            $model->nickName = $map['nick_name'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        return $model;
    }
    // 角色
    /**
     * @example develooper
     * @var string
     */
    public $role;

    // 成员id
    /**
     * @example workNo
     * @var string
     */
    public $userId;

    // 成员昵称
    /**
     * @example 成员昵称
     * @var string
     */
    public $nickName;

    // 成员姓名
    /**
     * @example 成员姓名
     * @var string
     */
    public $name;

}
