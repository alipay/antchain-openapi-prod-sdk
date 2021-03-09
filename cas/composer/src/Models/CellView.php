<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class CellView extends Model
{
    // id
    /**
     * @example id
     *
     * @var string
     */
    public $id;

    // name
    /**
     * @example name
     *
     * @var string
     */
    public $name;

    // displayName
    /**
     * @example displayName
     *
     * @var string
     */
    public $displayName;

    // description
    /**
     * @example description
     *
     * @var string
     */
    public $description;

    // deploymentZoneId
    /**
     * @example deploymentZoneId
     *
     * @var string
     */
    public $deploymentZoneId;

    // workspaceId
    /**
     * @example workspaceId
     *
     * @var string
     */
    public $workspaceId;

    // workspaceGroupId
    /**
     * @example workspaceGroupId
     *
     * @var string
     */
    public $workspaceGroupId;

    // status
    /**
     * @example status
     *
     * @var string
     */
    public $status;

    // masterZoneId
    /**
     * @example masterZoneId
     *
     * @var string
     */
    public $masterZoneId;

    // appendedZoneIds
    /**
     * @example appendedZoneIds
     *
     * @var string[]
     */
    public $appendedZoneIds;

    // List<ZoneView> zones
    /**
     * @example
     *
     * @var ZoneView[]
     */
    public $zones;
    protected $_name = [
        'id'               => 'id',
        'name'             => 'name',
        'displayName'      => 'display_name',
        'description'      => 'description',
        'deploymentZoneId' => 'deployment_zone_id',
        'workspaceId'      => 'workspace_id',
        'workspaceGroupId' => 'workspace_group_id',
        'status'           => 'status',
        'masterZoneId'     => 'master_zone_id',
        'appendedZoneIds'  => 'appended_zone_ids',
        'zones'            => 'zones',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->displayName) {
            $res['display_name'] = $this->displayName;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->deploymentZoneId) {
            $res['deployment_zone_id'] = $this->deploymentZoneId;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->workspaceGroupId) {
            $res['workspace_group_id'] = $this->workspaceGroupId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->masterZoneId) {
            $res['master_zone_id'] = $this->masterZoneId;
        }
        if (null !== $this->appendedZoneIds) {
            $res['appended_zone_ids'] = $this->appendedZoneIds;
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CellView
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['display_name'])) {
            $model->displayName = $map['display_name'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['deployment_zone_id'])) {
            $model->deploymentZoneId = $map['deployment_zone_id'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }
        if (isset($map['workspace_group_id'])) {
            $model->workspaceGroupId = $map['workspace_group_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['master_zone_id'])) {
            $model->masterZoneId = $map['master_zone_id'];
        }
        if (isset($map['appended_zone_ids'])) {
            if (!empty($map['appended_zone_ids'])) {
                $model->appendedZoneIds = $map['appended_zone_ids'];
            }
        }
        if (isset($map['zones'])) {
            if (!empty($map['zones'])) {
                $model->zones = [];
                $n            = 0;
                foreach ($map['zones'] as $item) {
                    $model->zones[$n++] = null !== $item ? ZoneView::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
