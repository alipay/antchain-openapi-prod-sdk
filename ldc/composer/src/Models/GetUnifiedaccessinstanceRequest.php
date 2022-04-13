<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class GetUnifiedaccessinstanceRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 统一接入实例名称
    /**
     * @var string
     */
    public $unifiedAccessInstanceName;

    // 工作空间组
    /**
     * @var string
     */
    public $workspaceGroup;
    protected $_name = [
        'authToken'                 => 'auth_token',
        'unifiedAccessInstanceName' => 'unified_access_instance_name',
        'workspaceGroup'            => 'workspace_group',
    ];

    public function validate()
    {
        Model::validateRequired('unifiedAccessInstanceName', $this->unifiedAccessInstanceName, true);
        Model::validateRequired('workspaceGroup', $this->workspaceGroup, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->unifiedAccessInstanceName) {
            $res['unified_access_instance_name'] = $this->unifiedAccessInstanceName;
        }
        if (null !== $this->workspaceGroup) {
            $res['workspace_group'] = $this->workspaceGroup;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetUnifiedaccessinstanceRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['unified_access_instance_name'])) {
            $model->unifiedAccessInstanceName = $map['unified_access_instance_name'];
        }
        if (isset($map['workspace_group'])) {
            $model->workspaceGroup = $map['workspace_group'];
        }

        return $model;
    }
}
