<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APIGATEWAY\Models;

use AlibabaCloud\Tea\Model;

class SofaGwAuthenticationVO extends Model
{
    //
    // access key
    //
    //
    /**
     * @example xxx
     *
     * @var string
     */
    public $authAccessKey;

    // secret key
    /**
     * @example yyy
     *
     * @var string
     */
    public $authSecretKey;

    // id
    /**
     * @example 100
     *
     * @var int
     */
    public $id;
    protected $_name = [
        'authAccessKey' => 'auth_access_key',
        'authSecretKey' => 'auth_secret_key',
        'id'            => 'id',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authAccessKey) {
            $res['auth_access_key'] = $this->authAccessKey;
        }
        if (null !== $this->authSecretKey) {
            $res['auth_secret_key'] = $this->authSecretKey;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SofaGwAuthenticationVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_access_key'])) {
            $model->authAccessKey = $map['auth_access_key'];
        }
        if (isset($map['auth_secret_key'])) {
            $model->authSecretKey = $map['auth_secret_key'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }

        return $model;
    }
}
