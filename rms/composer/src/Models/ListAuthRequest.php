<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class ListAuthRequest extends Model
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

    // 权限码
    /**
     * @var string
     */
    public $auth;

    // 资源类型（取值范围：CUSTOM_PLUGIN(自定义监控)、FOLDER(文件夹)、UNIVERSAL_TABLE(用户应用)）
    /**
     * @var string
     */
    public $resourceType;

    // 资源ID列表
    /**
     * @var string[]
     */
    public $resourceIds;
    protected $_name = [
        'authToken'     => 'auth_token',
        'workspaceName' => 'workspace_name',
        'auth'          => 'auth',
        'resourceType'  => 'resource_type',
        'resourceIds'   => 'resource_ids',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceName', $this->workspaceName, true);
        Model::validateRequired('auth', $this->auth, true);
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
        if (null !== $this->auth) {
            $res['auth'] = $this->auth;
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
     * @return ListAuthRequest
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
        if (isset($map['auth'])) {
            $model->auth = $map['auth'];
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
