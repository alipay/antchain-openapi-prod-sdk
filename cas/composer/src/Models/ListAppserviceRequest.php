<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class ListAppserviceRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // 动态查询
    /**
     * @var DynamicQuery
     */
    public $dynamicQuery;

    // 应用服务查询
    /**
     * @var AppServiceQuery
     */
    public $query;

    // 工作空间id，用于鉴权
    /**
     * @var string
     */
    public $workspaceId;
    protected $_name = [
        'authToken'    => 'auth_token',
        'dynamicQuery' => 'dynamic_query',
        'query'        => 'query',
        'workspaceId'  => 'workspace_id',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceId', $this->workspaceId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->dynamicQuery) {
            $res['dynamic_query'] = null !== $this->dynamicQuery ? $this->dynamicQuery->toMap() : null;
        }
        if (null !== $this->query) {
            $res['query'] = null !== $this->query ? $this->query->toMap() : null;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListAppserviceRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['dynamic_query'])) {
            $model->dynamicQuery = DynamicQuery::fromMap($map['dynamic_query']);
        }
        if (isset($map['query'])) {
            $model->query = AppServiceQuery::fromMap($map['query']);
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }

        return $model;
    }
}
