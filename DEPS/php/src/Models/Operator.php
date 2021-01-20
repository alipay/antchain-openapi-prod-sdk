<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class Operator extends Model {
    protected $_name = [
        'id' => 'id',
        'loginName' => 'login_name',
        'email' => 'email',
        'nickName' => 'nick_name',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->loginName) {
            $res['login_name'] = $this->loginName;
        }
        if (null !== $this->email) {
            $res['email'] = $this->email;
        }
        if (null !== $this->nickName) {
            $res['nick_name'] = $this->nickName;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return Operator
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['login_name'])){
            $model->loginName = $map['login_name'];
        }
        if(isset($map['email'])){
            $model->email = $map['email'];
        }
        if(isset($map['nick_name'])){
            $model->nickName = $map['nick_name'];
        }
        return $model;
    }
    // id
    /**
     * @example 123
     * @var string
     */
    public $id;

    // login_name
    /**
     * @example test
     * @var string
     */
    public $loginName;

    // email
    /**
     * @example test@123.com
     * @var string
     */
    public $email;

    // nick_name
    /**
     * @example test
     * @var string
     */
    public $nickName;

}
