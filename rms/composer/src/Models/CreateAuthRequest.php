<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class CreateAuthRequest extends Model
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

    // 用户名列表
    /**
     * @var string[]
     */
    public $userNames;

    // 权限的资源类型（取值范围：CUSTOM_PLUGIN(自定义监控)、FOLDER(文件夹)、UNIVERSAL_TABLE(用户应用)）
    /**
     * @var string
     */
    public $resourceType;

    // 权限对应的资源ID
    /**
     * @var string
     */
    public $resourceId;
    protected $_name = [
        'authToken'     => 'auth_token',
        'workspaceName' => 'workspace_name',
        'auth'          => 'auth',
        'userNames'     => 'user_names',
        'resourceType'  => 'resource_type',
        'resourceId'    => 'resource_id',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceName', $this->workspaceName, true);
        Model::validateRequired('auth', $this->auth, true);
        Model::validateRequired('userNames', $this->userNames, true);
        Model::validateRequired('resourceType', $this->resourceType, true);
        Model::validateRequired('resourceId', $this->resourceId, true);
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
        if (null !== $this->userNames) {
            $res['user_names'] = $this->userNames;
        }
        if (null !== $this->resourceType) {
            $res['resource_type'] = $this->resourceType;
        }
        if (null !== $this->resourceId) {
            $res['resource_id'] = $this->resourceId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateAuthRequest
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
        if (isset($map['user_names'])) {
            if (!empty($map['user_names'])) {
                $model->userNames = $map['user_names'];
            }
        }
        if (isset($map['resource_type'])) {
            $model->resourceType = $map['resource_type'];
        }
        if (isset($map['resource_id'])) {
            $model->resourceId = $map['resource_id'];
        }

        return $model;
    }
}
