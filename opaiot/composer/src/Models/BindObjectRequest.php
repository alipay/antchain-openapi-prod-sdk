<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\OPAIOT\Models;

use AlibabaCloud\Tea\Model;

class BindObjectRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;
    protected $_name = [
        'authToken' => 'auth_token',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BindObjectRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }

        return $model;
    }
}
