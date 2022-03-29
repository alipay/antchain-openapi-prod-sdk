<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class BatchcreateUserFavoriteRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 工作空间
    /**
     * @var string
     */
    public $workspaceName;

    // 收藏资源类型（取值范围：CUSTOM_PLUGIN(自定义监控)、FOLDER(文件夹)、UNIVERSAL_TABLE(用户应用)）
    /**
     * @var string
     */
    public $resourceType;

    // 收藏资源ID列表，需要是相同类型下的ID (如果是自定义监控或文件夹，为数值类型，如果是用户应用，是复杂组合字符串)
    /**
     * @var string[]
     */
    public $resourceIds;
    protected $_name = [
        'authToken'     => 'auth_token',
        'workspaceName' => 'workspace_name',
        'resourceType'  => 'resource_type',
        'resourceIds'   => 'resource_ids',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceName', $this->workspaceName, true);
        Model::validateRequired('resourceType', $this->resourceType, true);
        Model::validateRequired('resourceIds', $this->resourceIds, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->workspaceName) {
            $res['workspace_name'] = $this->workspaceName;
        }
        if (null !== $this->resourceType) {
            $res['resource_type'] = $this->resourceType;
        }
        if (null !== $this->resourceIds) {
            $res['resource_ids'] = $this->resourceIds;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchcreateUserFavoriteRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['workspace_name'])) {
            $model->workspaceName = $map['workspace_name'];
        }
        if (isset($map['resource_type'])) {
            $model->resourceType = $map['resource_type'];
        }
        if (isset($map['resource_ids'])) {
            if (!empty($map['resource_ids'])) {
                $model->resourceIds = $map['resource_ids'];
            }
        }

        return $model;
    }
}
