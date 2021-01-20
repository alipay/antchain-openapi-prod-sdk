<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class UserDTO extends Model {
    protected $_name = [
        'customerId' => 'customer_id',
        'name' => 'name',
        'realName' => 'real_name',
        'type' => 'type',
        'id' => 'id',
        'loginName' => 'login_name',
        'email' => 'email',
        'mobile' => 'mobile',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->customerId) {
            $res['customer_id'] = $this->customerId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->realName) {
            $res['real_name'] = $this->realName;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->loginName) {
            $res['login_name'] = $this->loginName;
        }
        if (null !== $this->email) {
            $res['email'] = $this->email;
        }
        if (null !== $this->mobile) {
            $res['mobile'] = $this->mobile;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UserDTO
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['customer_id'])){
            $model->customerId = $map['customer_id'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['real_name'])){
            $model->realName = $map['real_name'];
        }
        if(isset($map['type'])){
            $model->type = $map['type'];
        }
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['login_name'])){
            $model->loginName = $map['login_name'];
        }
        if(isset($map['email'])){
            $model->email = $map['email'];
        }
        if(isset($map['mobile'])){
            $model->mobile = $map['mobile'];
        }
        return $model;
    }
    // customerId
    /**
     * @example customerId
     * @var string
     */
    public $customerId;

    // name
    /**
     * @example name
     * @var string
     */
    public $name;

    // realName
    /**
     * @example realName
     * @var string
     */
    public $realName;

    // type
    /**
     * @example type
     * @var string
     */
    public $type;

    // 用户id
    /**
     * @example 100001
     * @var string
     */
    public $id;

    // 登录名称
    /**
     * @example aksinspecttest
     * @var string
     */
    public $loginName;

    // 邮箱
    /**
     * @example 123@antgroup.com
     * @var string
     */
    public $email;

    // 手机号
    /**
     * @example 123042324
     * @var string
     */
    public $mobile;

}
