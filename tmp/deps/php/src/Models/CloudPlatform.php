<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class CloudPlatform extends Model {
    protected $_name = [
        'name' => 'name',
        'host' => 'host',
        'loginName' => 'login_name',
        'password' => 'password',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->host) {
            $res['host'] = $this->host;
        }
        if (null !== $this->loginName) {
            $res['login_name'] = $this->loginName;
        }
        if (null !== $this->password) {
            $res['password'] = $this->password;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CloudPlatform
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['host'])){
            $model->host = $map['host'];
        }
        if(isset($map['login_name'])){
            $model->loginName = $map['login_name'];
        }
        if(isset($map['password'])){
            $model->password = $map['password'];
        }
        return $model;
    }
    // name
    /**
     * @example name
     * @var string
     */
    public $name;

    // host
    /**
     * @example host
     * @var string
     */
    public $host;

    // loginName
    /**
     * @example loginName
     * @var string
     */
    public $loginName;

    // password
    /**
     * @example password
     * @var string
     */
    public $password;

}
