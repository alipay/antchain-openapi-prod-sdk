<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class ListApplicationPackageRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 工作空间id，用于做鉴权
    /**
     * @var string
     */
    public $workspaceId;

    // 动态查询
    /**
     * @var DynamicQuery
     */
    public $dynamicQuery;

    // 应用查询
    /**
     * @var AppQuery
     */
    public $query;
    protected $_name = [
        'authToken'    => 'auth_token',
        'workspaceId'  => 'workspace_id',
        'dynamicQuery' => 'dynamic_query',
        'query'        => 'query',
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
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->dynamicQuery) {
            $res['dynamic_query'] = null !== $this->dynamicQuery ? $this->dynamicQuery->toMap() : null;
        }
        if (null !== $this->query) {
            $res['query'] = null !== $this->query ? $this->query->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListApplicationPackageRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }
        if (isset($map['dynamic_query'])) {
            $model->dynamicQuery = DynamicQuery::fromMap($map['dynamic_query']);
        }
        if (isset($map['query'])) {
            $model->query = AppQuery::fromMap($map['query']);
        }

        return $model;
    }
}
