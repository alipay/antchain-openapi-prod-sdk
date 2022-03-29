<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class QueryUserFavoriteRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 收藏资源 ID 列表
    /**
     * @var string[]
     */
    public $resourceIds;

    // 收藏资源类型
    /**
     * @var string
     */
    public $resourceType;

    // 工作空间
    /**
     * @var string
     */
    public $workspaceName;
    protected $_name = [
        'authToken'     => 'auth_token',
        'resourceIds'   => 'resource_ids',
        'resourceType'  => 'resource_type',
        'workspaceName' => 'workspace_name',
    ];

    public function validate()
    {
        Model::validateRequired('resourceIds', $this->resourceIds, true);
        Model::validateRequired('resourceType', $this->resourceType, true);
        Model::validateRequired('workspaceName', $this->workspaceName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->resourceIds) {
            $res['resource_ids'] = $this->resourceIds;
        }
        if (null !== $this->resourceType) {
            $res['resource_type'] = $this->resourceType;
        }
        if (null !== $this->workspaceName) {
            $res['workspace_name'] = $this->workspaceName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryUserFavoriteRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['resource_ids'])) {
            if (!empty($map['resource_ids'])) {
                $model->resourceIds = $map['resource_ids'];
            }
        }
        if (isset($map['resource_type'])) {
            $model->resourceType = $map['resource_type'];
        }
        if (isset($map['workspace_name'])) {
            $model->workspaceName = $map['workspace_name'];
        }

        return $model;
    }
}
