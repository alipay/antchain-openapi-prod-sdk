<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class CloudPlatform extends Model
{
    // host
    /**
     * @example host
     *
     * @var string
     */
    public $host;

    // login_name
    /**
     * @example login_name
     *
     * @var string
     */
    public $loginName;

    // name
    /**
     * @example name
     *
     * @var string
     */
    public $name;

    // password
    /**
     * @example password
     *
     * @var string
     */
    public $password;
    protected $_name = [
        'host'      => 'host',
        'loginName' => 'login_name',
        'name'      => 'name',
        'password'  => 'password',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->host) {
            $res['host'] = $this->host;
        }
        if (null !== $this->loginName) {
            $res['login_name'] = $this->loginName;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->password) {
            $res['password'] = $this->password;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CloudPlatform
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['host'])) {
            $model->host = $map['host'];
        }
        if (isset($map['login_name'])) {
            $model->loginName = $map['login_name'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['password'])) {
            $model->password = $map['password'];
        }

        return $model;
    }
}
