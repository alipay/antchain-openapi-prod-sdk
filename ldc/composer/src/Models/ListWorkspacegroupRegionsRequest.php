<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class ListWorkspacegroupRegionsRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // workspace group 名称
    //
    /**
     * @var string
     */
    public $workspaceGroupName;
    protected $_name = [
        'authToken'          => 'auth_token',
        'workspaceGroupName' => 'workspace_group_name',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceGroupName', $this->workspaceGroupName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->workspaceGroupName) {
            $res['workspace_group_name'] = $this->workspaceGroupName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListWorkspacegroupRegionsRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['workspace_group_name'])) {
            $model->workspaceGroupName = $map['workspace_group_name'];
        }

        return $model;
    }
}
