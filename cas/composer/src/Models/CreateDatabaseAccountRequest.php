<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class CreateDatabaseAccountRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // database 序列号
    /**
     * @var string
     */
    public $databaseSequence;

    // 账户名称
    /**
     * @var string
     */
    public $name;

    // 账户密码
    /**
     * @var string
     */
    public $password;
    protected $_name = [
        'authToken'        => 'auth_token',
        'databaseSequence' => 'database_sequence',
        'name'             => 'name',
        'password'         => 'password',
    ];

    public function validate()
    {
        Model::validateRequired('databaseSequence', $this->databaseSequence, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('password', $this->password, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->databaseSequence) {
            $res['database_sequence'] = $this->databaseSequence;
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
     * @return CreateDatabaseAccountRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['database_sequence'])) {
            $model->databaseSequence = $map['database_sequence'];
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
