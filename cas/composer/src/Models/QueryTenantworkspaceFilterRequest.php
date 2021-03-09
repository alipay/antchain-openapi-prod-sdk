<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class QueryTenantworkspaceFilterRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // statuses
    /**
     * @var string
     */
    public $statuses;
    protected $_name = [
        'authToken' => 'auth_token',
        'statuses'  => 'statuses',
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
        if (null !== $this->statuses) {
            $res['statuses'] = $this->statuses;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryTenantworkspaceFilterRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['statuses'])) {
            $model->statuses = $map['statuses'];
        }

        return $model;
    }
}
