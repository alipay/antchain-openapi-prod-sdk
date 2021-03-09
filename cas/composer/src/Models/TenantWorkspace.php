<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class TenantWorkspace extends Model
{
    // displayName
    /**
     * @example test
     *
     * @var string
     */
    public $displayName;

    // gmtCreate
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtCreate;

    // gmtModified
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtModified;

    // id
    /**
     * @example 001
     *
     * @var string
     */
    public $id;

    // name
    /**
     * @example test
     *
     * @var string
     */
    public $name;

    // networkType
    /**
     * @example vpc
     *
     * @var string
     */
    public $networkType;

    // status
    /**
     * @example CREATED
     *
     * @var string
     */
    public $status;

    // tenantId
    /**
     * @example 001
     *
     * @var string
     */
    public $tenantId;

    // type
    /**
     * @example NORMAL
     *
     * @var string
     */
    public $type;

    // workspaceDcs
    /**
     * @example
     *
     * @var WorkspaceDc[]
     */
    public $workspaceDcs;

    // workspaceRegions
    /**
     * @example
     *
     * @var WorkspaceRegion[]
     */
    public $workspaceRegions;
    protected $_name = [
        'displayName'      => 'display_name',
        'gmtCreate'        => 'gmt_create',
        'gmtModified'      => 'gmt_modified',
        'id'               => 'id',
        'name'             => 'name',
        'networkType'      => 'network_type',
        'status'           => 'status',
        'tenantId'         => 'tenant_id',
        'type'             => 'type',
        'workspaceDcs'     => 'workspace_dcs',
        'workspaceRegions' => 'workspace_regions',
    ];

    public function validate()
    {
        Model::validateRequired('displayName', $this->displayName, true);
        Model::validateRequired('gmtCreate', $this->gmtCreate, true);
        Model::validateRequired('gmtModified', $this->gmtModified, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('networkType', $this->networkType, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('workspaceDcs', $this->workspaceDcs, true);
        Model::validateRequired('workspaceRegions', $this->workspaceRegions, true);
        Model::validatePattern('gmtCreate', $this->gmtCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('gmtModified', $this->gmtModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->displayName) {
            $res['display_name'] = $this->displayName;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->networkType) {
            $res['network_type'] = $this->networkType;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->workspaceDcs) {
            $res['workspace_dcs'] = [];
            if (null !== $this->workspaceDcs && \is_array($this->workspaceDcs)) {
                $n = 0;
                foreach ($this->workspaceDcs as $item) {
                    $res['workspace_dcs'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->workspaceRegions) {
            $res['workspace_regions'] = [];
            if (null !== $this->workspaceRegions && \is_array($this->workspaceRegions)) {
                $n = 0;
                foreach ($this->workspaceRegions as $item) {
                    $res['workspace_regions'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TenantWorkspace
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['display_name'])) {
            $model->displayName = $map['display_name'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['network_type'])) {
            $model->networkType = $map['network_type'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['workspace_dcs'])) {
            if (!empty($map['workspace_dcs'])) {
                $model->workspaceDcs = [];
                $n                   = 0;
                foreach ($map['workspace_dcs'] as $item) {
                    $model->workspaceDcs[$n++] = null !== $item ? WorkspaceDc::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['workspace_regions'])) {
            if (!empty($map['workspace_regions'])) {
                $model->workspaceRegions = [];
                $n                       = 0;
                foreach ($map['workspace_regions'] as $item) {
                    $model->workspaceRegions[$n++] = null !== $item ? WorkspaceRegion::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
