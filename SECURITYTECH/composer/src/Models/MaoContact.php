<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class MaoContact extends Model {
    protected $_name = [
        'name' => 'name',
        'phone' => 'phone',
        'email' => 'email',
        'idCard' => 'id_card',
        'role' => 'role',
    ];
    public function validate() {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('phone', $this->phone, true);
        Model::validateRequired('email', $this->email, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->phone) {
            $res['phone'] = $this->phone;
        }
        if (null !== $this->email) {
            $res['email'] = $this->email;
        }
        if (null !== $this->idCard) {
            $res['id_card'] = $this->idCard;
        }
        if (null !== $this->role) {
            $res['role'] = $this->role;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return MaoContact
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['phone'])){
            $model->phone = $map['phone'];
        }
        if(isset($map['email'])){
            $model->email = $map['email'];
        }
        if(isset($map['id_card'])){
            $model->idCard = $map['id_card'];
        }
        if(isset($map['role'])){
            $model->role = $map['role'];
        }
        return $model;
    }
    // 联系人姓名
    /**
     * @example 联系人姓名
     * @var string
     */
    public $name;

    // 联系人手机号
    /**
     * @example 联系人手机号
     * @var string
     */
    public $phone;

    // 联系人邮箱
    /**
     * @example 联系人邮箱
     * @var string
     */
    public $email;

    // 联系人身份证号
    /**
     * @example 联系人身份证号
     * @var string
     */
    public $idCard;

    // 角色
    /**
     * @example 角色
     * @var string
     */
    public $role;

}
