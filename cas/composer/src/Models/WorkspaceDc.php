<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class WorkspaceDc extends Model
{
    // id
    /**
     * @example 001
     *
     * @var string
     */
    public $id;

    // datacenterId
    /**
     * @example 001
     *
     * @var string
     */
    public $datacenterId;

    // workspaceId
    /**
     * @example 001
     *
     * @var string
     */
    public $workspaceId;

    // datacenterType
    /**
     * @example MAIN
     *
     * @var string
     */
    public $datacenterType;

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
    protected $_name = [
        'id'             => 'id',
        'datacenterId'   => 'datacenter_id',
        'workspaceId'    => 'workspace_id',
        'datacenterType' => 'datacenter_type',
        'gmtCreate'      => 'gmt_create',
        'gmtModified'    => 'gmt_modified',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('datacenterId', $this->datacenterId, true);
        Model::validateRequired('workspaceId', $this->workspaceId, true);
        Model::validateRequired('datacenterType', $this->datacenterType, true);
        Model::validateRequired('gmtCreate', $this->gmtCreate, true);
        Model::validateRequired('gmtModified', $this->gmtModified, true);
        Model::validatePattern('gmtCreate', $this->gmtCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('gmtModified', $this->gmtModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->datacenterId) {
            $res['datacenter_id'] = $this->datacenterId;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->datacenterType) {
            $res['datacenter_type'] = $this->datacenterType;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return WorkspaceDc
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['datacenter_id'])) {
            $model->datacenterId = $map['datacenter_id'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }
        if (isset($map['datacenter_type'])) {
            $model->datacenterType = $map['datacenter_type'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }

        return $model;
    }
}
