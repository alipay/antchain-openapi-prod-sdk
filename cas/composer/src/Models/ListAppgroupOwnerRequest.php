<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class ListAppgroupOwnerRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // 用户查询
    /**
     * @var UserQuery
     */
    public $query;

    // 占位
    /**
     * @var string
     */
    public $tenantId;
    protected $_name = [
        'authToken' => 'auth_token',
        'query'     => 'query',
        'tenantId'  => 'tenant_id',
    ];

    public function validate()
    {
        Model::validateRequired('query', $this->query, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->query) {
            $res['query'] = null !== $this->query ? $this->query->toMap() : null;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListAppgroupOwnerRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['query'])) {
            $model->query = UserQuery::fromMap($map['query']);
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }

        return $model;
    }
}
