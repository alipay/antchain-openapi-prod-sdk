<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class GetOptestRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $tenant;

    // ping
    /**
     * @var string
     */
    public $ping;
    protected $_name = [
        'authToken' => 'auth_token',
        'tenant'    => 'tenant',
        'ping'      => 'ping',
    ];

    public function validate()
    {
        Model::validateRequired('ping', $this->ping, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->ping) {
            $res['ping'] = $this->ping;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetOptestRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['tenant'])) {
            $model->tenant = $map['tenant'];
        }
        if (isset($map['ping'])) {
            $model->ping = $map['ping'];
        }

        return $model;
    }
}
