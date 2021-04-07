<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class WorkspaceDto extends Model
{
    // displayName
    /**
     * @example test
     *
     * @var string
     */
    public $displayName;

    // id
    /**
     * @example 001
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

    // networkType
    /**
     * @example vpc
     *
     * @var string
     */
    public $networkType;

    // projectId
    /**
     * @example 002
     *
     * @var string
     */
    public $projectId;

    // status
    /**
     * @example CREATED
     *
     * @var string
     */
    public $status;

    // type
    /**
     * @example NORMAL
     *
     * @var string
     */
    public $type;

    // utcCreate
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $utcCreate;

    // utcModified
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $utcModified;

    // workspaceRegionDto
    /**
     * @example
     *
     * @var WorkspaceRegionDto
     */
    public $workspaceRegionDto;
    protected $_name = [
        'displayName'        => 'display_name',
        'id'                 => 'id',
        'name'               => 'name',
        'networkType'        => 'network_type',
        'projectId'          => 'project_id',
        'status'             => 'status',
        'type'               => 'type',
        'utcCreate'          => 'utc_create',
        'utcModified'        => 'utc_modified',
        'workspaceRegionDto' => 'workspace_region_dto',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('networkType', $this->networkType, true);
        Model::validateRequired('projectId', $this->projectId, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('utcCreate', $this->utcCreate, true);
        Model::validatePattern('utcCreate', $this->utcCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('utcModified', $this->utcModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->displayName) {
            $res['display_name'] = $this->displayName;
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
        if (null !== $this->projectId) {
            $res['project_id'] = $this->projectId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->utcCreate) {
            $res['utc_create'] = $this->utcCreate;
        }
        if (null !== $this->utcModified) {
            $res['utc_modified'] = $this->utcModified;
        }
        if (null !== $this->workspaceRegionDto) {
            $res['workspace_region_dto'] = null !== $this->workspaceRegionDto ? $this->workspaceRegionDto->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return WorkspaceDto
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['display_name'])) {
            $model->displayName = $map['display_name'];
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
        if (isset($map['project_id'])) {
            $model->projectId = $map['project_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['utc_create'])) {
            $model->utcCreate = $map['utc_create'];
        }
        if (isset($map['utc_modified'])) {
            $model->utcModified = $map['utc_modified'];
        }
        if (isset($map['workspace_region_dto'])) {
            $model->workspaceRegionDto = WorkspaceRegionDto::fromMap($map['workspace_region_dto']);
        }

        return $model;
    }
}
