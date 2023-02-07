<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class QueryQuotaRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 维度标识, 可选
    /**
     * @var string
     */
    public $dimIdentity;

    // resource_identity
    /**
     * @var string
     */
    public $resourceIdentity;
    protected $_name = [
        'authToken'        => 'auth_token',
        'dimIdentity'      => 'dim_identity',
        'resourceIdentity' => 'resource_identity',
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
        if (null !== $this->dimIdentity) {
            $res['dim_identity'] = $this->dimIdentity;
        }
        if (null !== $this->resourceIdentity) {
            $res['resource_identity'] = $this->resourceIdentity;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryQuotaRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['dim_identity'])) {
            $model->dimIdentity = $map['dim_identity'];
        }
        if (isset($map['resource_identity'])) {
            $model->resourceIdentity = $map['resource_identity'];
        }

        return $model;
    }
}
