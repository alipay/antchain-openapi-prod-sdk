<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class MasterCluster extends Model
{
    // master cluster name
    /**
     * @example masterCluster01
     *
     * @var string
     */
    public $name;

    // workspace id
    /**
     * @example 0000000001
     *
     * @var string
     */
    public $workspaceId;

    // workspace name
    /**
     * @example wsName
     *
     * @var string
     */
    public $workspaceName;

    // region id
    /**
     * @example 000000001
     *
     * @var string
     */
    public $regionId;

    // region name
    /**
     * @example hangzhou
     *
     * @var string
     */
    public $regionName;

    // zone id
    /**
     * @example 0000000001
     *
     * @var string
     */
    public $zoneId;

    // zone name
    /**
     * @example hangzhou-a
     *
     * @var string
     */
    public $zoneName;
    protected $_name = [
        'name'          => 'name',
        'workspaceId'   => 'workspace_id',
        'workspaceName' => 'workspace_name',
        'regionId'      => 'region_id',
        'regionName'    => 'region_name',
        'zoneId'        => 'zone_id',
        'zoneName'      => 'zone_name',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('workspaceId', $this->workspaceId, true);
        Model::validateRequired('regionId', $this->regionId, true);
        Model::validateRequired('zoneId', $this->zoneId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->workspaceName) {
            $res['workspace_name'] = $this->workspaceName;
        }
        if (null !== $this->regionId) {
            $res['region_id'] = $this->regionId;
        }
        if (null !== $this->regionName) {
            $res['region_name'] = $this->regionName;
        }
        if (null !== $this->zoneId) {
            $res['zone_id'] = $this->zoneId;
        }
        if (null !== $this->zoneName) {
            $res['zone_name'] = $this->zoneName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MasterCluster
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }
        if (isset($map['workspace_name'])) {
            $model->workspaceName = $map['workspace_name'];
        }
        if (isset($map['region_id'])) {
            $model->regionId = $map['region_id'];
        }
        if (isset($map['region_name'])) {
            $model->regionName = $map['region_name'];
        }
        if (isset($map['zone_id'])) {
            $model->zoneId = $map['zone_id'];
        }
        if (isset($map['zone_name'])) {
            $model->zoneName = $map['zone_name'];
        }

        return $model;
    }
}
