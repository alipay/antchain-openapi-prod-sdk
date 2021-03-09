<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class WorkspaceWithGroupView extends Model
{
    // id
    /**
     * @example id
     *
     * @var string
     */
    public $id;

    // identity
    /**
     * @example identity
     *
     * @var string
     */
    public $identity;

    // name
    /**
     * @example name
     *
     * @var string
     */
    public $name;

    // networkType
    /**
     * @example networkType
     *
     * @var string
     */
    public $networkType;

    // region
    /**
     * @example
     *
     * @var RegionView
     */
    public $region;

    // status
    /**
     * @example status
     *
     * @var string
     */
    public $status;

    // tenantId
    /**
     * @example tenantId
     *
     * @var string
     */
    public $tenantId;

    // zones
    /**
     * @example
     *
     * @var WorkspaceZoneView[]
     */
    public $zones;

    // workspaceGroup
    /**
     * @example
     *
     * @var WorkspaceGroupView
     */
    public $workspaceGroup;
    protected $_name = [
        'id'             => 'id',
        'identity'       => 'identity',
        'name'           => 'name',
        'networkType'    => 'network_type',
        'region'         => 'region',
        'status'         => 'status',
        'tenantId'       => 'tenant_id',
        'zones'          => 'zones',
        'workspaceGroup' => 'workspace_group',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('identity', $this->identity, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('networkType', $this->networkType, true);
        Model::validateRequired('region', $this->region, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('zones', $this->zones, true);
        Model::validateRequired('workspaceGroup', $this->workspaceGroup, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->identity) {
            $res['identity'] = $this->identity;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->networkType) {
            $res['network_type'] = $this->networkType;
        }
        if (null !== $this->region) {
            $res['region'] = null !== $this->region ? $this->region->toMap() : null;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->zones) {
            $res['zones'] = [];
            if (null !== $this->zones && \is_array($this->zones)) {
                $n = 0;
                foreach ($this->zones as $item) {
                    $res['zones'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->workspaceGroup) {
            $res['workspace_group'] = null !== $this->workspaceGroup ? $this->workspaceGroup->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return WorkspaceWithGroupView
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['identity'])) {
            $model->identity = $map['identity'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['network_type'])) {
            $model->networkType = $map['network_type'];
        }
        if (isset($map['region'])) {
            $model->region = RegionView::fromMap($map['region']);
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['zones'])) {
            if (!empty($map['zones'])) {
                $model->zones = [];
                $n            = 0;
                foreach ($map['zones'] as $item) {
                    $model->zones[$n++] = null !== $item ? WorkspaceZoneView::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['workspace_group'])) {
            $model->workspaceGroup = WorkspaceGroupView::fromMap($map['workspace_group']);
        }

        return $model;
    }
}
