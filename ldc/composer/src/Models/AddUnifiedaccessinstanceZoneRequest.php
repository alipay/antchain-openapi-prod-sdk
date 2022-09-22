<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class AddUnifiedaccessinstanceZoneRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 工作空间组
    /**
     * @var string
     */
    public $workspaceGroup;

    // 统一接入实例名称
    /**
     * @var string
     */
    public $name;

    // 可用区（机房）列表
    /**
     * @var string[]
     */
    public $zones;
    protected $_name = [
        'authToken'      => 'auth_token',
        'workspaceGroup' => 'workspace_group',
        'name'           => 'name',
        'zones'          => 'zones',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceGroup', $this->workspaceGroup, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('zones', $this->zones, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->workspaceGroup) {
            $res['workspace_group'] = $this->workspaceGroup;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->zones) {
            $res['zones'] = $this->zones;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AddUnifiedaccessinstanceZoneRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['workspace_group'])) {
            $model->workspaceGroup = $map['workspace_group'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['zones'])) {
            if (!empty($map['zones'])) {
                $model->zones = $map['zones'];
            }
        }

        return $model;
    }
}
