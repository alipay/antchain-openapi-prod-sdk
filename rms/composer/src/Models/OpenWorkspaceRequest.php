<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class OpenWorkspaceRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 工作空间名称
    /**
     * @var string
     */
    public $workspaceName;

    // 工作空间展示名称
    /**
     * @var string
     */
    public $workspaceDisplayName;
    protected $_name = [
        'authToken'            => 'auth_token',
        'workspaceName'        => 'workspace_name',
        'workspaceDisplayName' => 'workspace_display_name',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceName', $this->workspaceName, true);
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
        if (null !== $this->workspaceDisplayName) {
            $res['workspace_display_name'] = $this->workspaceDisplayName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OpenWorkspaceRequest
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
        if (isset($map['workspace_display_name'])) {
            $model->workspaceDisplayName = $map['workspace_display_name'];
        }

        return $model;
    }
}
