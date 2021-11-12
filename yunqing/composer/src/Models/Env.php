<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class Env extends Model
{
    // cellGroup的列表
    /**
     * @example
     *
     * @var CellGroup[]
     */
    public $cellGroups;

    // 云信息
    /**
     * @example
     *
     * @var Cloud
     */
    public $cloud;

    // 关联的ake集群id
    /**
     * @example 0000000000000635
     *
     * @var string
     */
    public $clusterId;

    // 环境名
    /**
     * @example LDC生产环境
     *
     * @var string
     */
    public $displayName;

    // 环境的id
    /**
     * @example 123456
     *
     * @var string
     */
    public $envId;

    // （已废弃）环境唯一标识。
    /**
     * @example 730420180226205707848400000
     *
     * @var string
     */
    public $id;

    // 是否ldc环境
    /**
     * @example true, false
     *
     * @var bool
     */
    public $ldc;

    // 环境名称。
    /**
     * @example mybk2--mybank--prod
     *
     * @var string
     */
    public $name;

    // （已废弃）环境底座iaas技术栈。
    /**
     * @example ALIYUN_STACK
     *
     * @var string
     */
    public $stack;

    // 租户信息
    /**
     * @example
     *
     * @var Tenant
     */
    public $tenant;

    // 工作空间列表
    /**
     * @example
     *
     * @var Workspace[]
     */
    public $workspaces;

    // （已废弃）兼容逻辑老的workspace逻辑，非监控产品勿依赖。
    /**
     * @example 73040009170888
     *
     * @var string
     */
    public $workspaceId;

    // 环境类型
    /**
     * @example PROD
     *
     * @var string
     */
    public $envType;
    protected $_name = [
        'cellGroups'  => 'cell_groups',
        'cloud'       => 'cloud',
        'clusterId'   => 'cluster_id',
        'displayName' => 'display_name',
        'envId'       => 'env_id',
        'id'          => 'id',
        'ldc'         => 'ldc',
        'name'        => 'name',
        'stack'       => 'stack',
        'tenant'      => 'tenant',
        'workspaces'  => 'workspaces',
        'workspaceId' => 'workspace_id',
        'envType'     => 'env_type',
    ];

    public function validate()
    {
        Model::validateRequired('cellGroups', $this->cellGroups, true);
        Model::validateRequired('cloud', $this->cloud, true);
        Model::validateRequired('clusterId', $this->clusterId, true);
        Model::validateRequired('envId', $this->envId, true);
        Model::validateRequired('ldc', $this->ldc, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('workspaces', $this->workspaces, true);
        Model::validateRequired('envType', $this->envType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->cellGroups) {
            $res['cell_groups'] = [];
            if (null !== $this->cellGroups && \is_array($this->cellGroups)) {
                $n = 0;
                foreach ($this->cellGroups as $item) {
                    $res['cell_groups'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->cloud) {
            $res['cloud'] = null !== $this->cloud ? $this->cloud->toMap() : null;
        }
        if (null !== $this->clusterId) {
            $res['cluster_id'] = $this->clusterId;
        }
        if (null !== $this->displayName) {
            $res['display_name'] = $this->displayName;
        }
        if (null !== $this->envId) {
            $res['env_id'] = $this->envId;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->ldc) {
            $res['ldc'] = $this->ldc;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->stack) {
            $res['stack'] = $this->stack;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = null !== $this->tenant ? $this->tenant->toMap() : null;
        }
        if (null !== $this->workspaces) {
            $res['workspaces'] = [];
            if (null !== $this->workspaces && \is_array($this->workspaces)) {
                $n = 0;
                foreach ($this->workspaces as $item) {
                    $res['workspaces'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->envType) {
            $res['env_type'] = $this->envType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Env
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cell_groups'])) {
            if (!empty($map['cell_groups'])) {
                $model->cellGroups = [];
                $n                 = 0;
                foreach ($map['cell_groups'] as $item) {
                    $model->cellGroups[$n++] = null !== $item ? CellGroup::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['cloud'])) {
            $model->cloud = Cloud::fromMap($map['cloud']);
        }
        if (isset($map['cluster_id'])) {
            $model->clusterId = $map['cluster_id'];
        }
        if (isset($map['display_name'])) {
            $model->displayName = $map['display_name'];
        }
        if (isset($map['env_id'])) {
            $model->envId = $map['env_id'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['ldc'])) {
            $model->ldc = $map['ldc'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['stack'])) {
            $model->stack = $map['stack'];
        }
        if (isset($map['tenant'])) {
            $model->tenant = Tenant::fromMap($map['tenant']);
        }
        if (isset($map['workspaces'])) {
            if (!empty($map['workspaces'])) {
                $model->workspaces = [];
                $n                 = 0;
                foreach ($map['workspaces'] as $item) {
                    $model->workspaces[$n++] = null !== $item ? Workspace::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }
        if (isset($map['env_type'])) {
            $model->envType = $map['env_type'];
        }

        return $model;
    }
}
