<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class RegistryAccout extends Model
{
    // registry email url
    /**
     * @example aaa@aliapy.com
     *
     * @var string
     */
    public $email;

    // registry password
    /**
     * @example 123456
     *
     * @var string
     */
    public $password;

    // registry url
    /**
     * @example registry.com
     *
     * @var string
     */
    public $registry;

    // registry username
    /**
     * @example admin
     *
     * @var string
     */
    public $username;
    protected $_name = [
        'email'    => 'email',
        'password' => 'password',
        'registry' => 'registry',
        'username' => 'username',
    ];

    public function validate()
    {
        Model::validateRequired('password', $this->password, true);
        Model::validateRequired('registry', $this->registry, true);
        Model::validateRequired('username', $this->username, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->email) {
            $res['email'] = $this->email;
        }
        if (null !== $this->password) {
            $res['password'] = $this->password;
        }
        if (null !== $this->registry) {
            $res['registry'] = $this->registry;
        }
        if (null !== $this->username) {
            $res['username'] = $this->username;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RegistryAccout
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['email'])) {
            $model->email = $map['email'];
        }
        if (isset($map['password'])) {
            $model->password = $map['password'];
        }
        if (isset($map['registry'])) {
            $model->registry = $map['registry'];
        }
        if (isset($map['username'])) {
            $model->username = $map['username'];
        }

        return $model;
    }
}
