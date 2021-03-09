<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class WorkspaceZoneDto extends Model
{
    // id
    /**
     * @example 001
     *
     * @var string
     */
    public $id;

    // workspace_id
    /**
     * @example 001
     *
     * @var string
     */
    public $workspaceId;

    // zone_id
    /**
     * @example 001
     *
     * @var string
     */
    public $zoneId;

    // zone name
    /**
     * @example shanghai
     *
     * @var string
     */
    public $zoneName;
    protected $_name = [
        'id'          => 'id',
        'workspaceId' => 'workspace_id',
        'zoneId'      => 'zone_id',
        'zoneName'    => 'zone_name',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('workspaceId', $this->workspaceId, true);
        Model::validateRequired('zoneId', $this->zoneId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
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
     * @return WorkspaceZoneDto
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
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
