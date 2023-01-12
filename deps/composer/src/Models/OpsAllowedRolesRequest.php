<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class OpsAllowedRolesRequest extends Model
{
    // 角色列表
    /**
     * @example []
     *
     * @var string[]
     */
    public $allowedRoles;

    // 授权用户
    /**
     * @example []
     *
     * @var string[]
     */
    public $allowedOperators;

    // 授权工作空间列表
    /**
     * @example []
     *
     * @var string[]
     */
    public $workspaceIds;
    protected $_name = [
        'allowedRoles'     => 'allowed_roles',
        'allowedOperators' => 'allowed_operators',
        'workspaceIds'     => 'workspace_ids',
    ];

    public function validate()
    {
        Model::validateRequired('allowedRoles', $this->allowedRoles, true);
        Model::validateRequired('allowedOperators', $this->allowedOperators, true);
        Model::validateRequired('workspaceIds', $this->workspaceIds, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->allowedRoles) {
            $res['allowed_roles'] = $this->allowedRoles;
        }
        if (null !== $this->allowedOperators) {
            $res['allowed_operators'] = $this->allowedOperators;
        }
        if (null !== $this->workspaceIds) {
            $res['workspace_ids'] = $this->workspaceIds;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OpsAllowedRolesRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['allowed_roles'])) {
            if (!empty($map['allowed_roles'])) {
                $model->allowedRoles = $map['allowed_roles'];
            }
        }
        if (isset($map['allowed_operators'])) {
            if (!empty($map['allowed_operators'])) {
                $model->allowedOperators = $map['allowed_operators'];
            }
        }
        if (isset($map['workspace_ids'])) {
            if (!empty($map['workspace_ids'])) {
                $model->workspaceIds = $map['workspace_ids'];
            }
        }

        return $model;
    }
}
