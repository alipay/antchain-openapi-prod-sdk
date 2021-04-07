<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class QueryDiskspecRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // provider id
    /**
     * @var string
     */
    public $providerId;

    // enable
    /**
     * @var bool
     */
    public $enable;
    protected $_name = [
        'authToken'  => 'auth_token',
        'providerId' => 'provider_id',
        'enable'     => 'enable',
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
        if (null !== $this->providerId) {
            $res['provider_id'] = $this->providerId;
        }
        if (null !== $this->enable) {
            $res['enable'] = $this->enable;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDiskspecRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['provider_id'])) {
            $model->providerId = $map['provider_id'];
        }
        if (isset($map['enable'])) {
            $model->enable = $map['enable'];
        }

        return $model;
    }
}
