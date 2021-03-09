<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class WorkspaceRegion extends Model
{
    // id
    /**
     * @example 001
     *
     * @var string
     */
    public $id;

    // workspaceId
    /**
     * @example 001
     *
     * @var string
     */
    public $workspaceId;

    // regionId
    /**
     * @example 001
     *
     * @var string
     */
    public $regionId;

    // type
    /**
     * @example type
     *
     * @var string
     */
    public $type;

    // securedIsolationIdentity
    /**
     * @example securedIsolationIdentity
     *
     * @var string
     */
    public $securedIsolationIdentity;

    // securedIsolationName
    /**
     * @example securedIsolationName
     *
     * @var string
     */
    public $securedIsolationName;

    // securedZoneId
    /**
     * @example securedZoneId
     *
     * @var string
     */
    public $securedZoneId;
    protected $_name = [
        'id'                       => 'id',
        'workspaceId'              => 'workspace_id',
        'regionId'                 => 'region_id',
        'type'                     => 'type',
        'securedIsolationIdentity' => 'secured_isolation_identity',
        'securedIsolationName'     => 'secured_isolation_name',
        'securedZoneId'            => 'secured_zone_id',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('workspaceId', $this->workspaceId, true);
        Model::validateRequired('regionId', $this->regionId, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('securedIsolationIdentity', $this->securedIsolationIdentity, true);
        Model::validateRequired('securedIsolationName', $this->securedIsolationName, true);
        Model::validateRequired('securedZoneId', $this->securedZoneId, true);
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
        if (null !== $this->regionId) {
            $res['region_id'] = $this->regionId;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->securedIsolationIdentity) {
            $res['secured_isolation_identity'] = $this->securedIsolationIdentity;
        }
        if (null !== $this->securedIsolationName) {
            $res['secured_isolation_name'] = $this->securedIsolationName;
        }
        if (null !== $this->securedZoneId) {
            $res['secured_zone_id'] = $this->securedZoneId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return WorkspaceRegion
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
        if (isset($map['region_id'])) {
            $model->regionId = $map['region_id'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['secured_isolation_identity'])) {
            $model->securedIsolationIdentity = $map['secured_isolation_identity'];
        }
        if (isset($map['secured_isolation_name'])) {
            $model->securedIsolationName = $map['secured_isolation_name'];
        }
        if (isset($map['secured_zone_id'])) {
            $model->securedZoneId = $map['secured_zone_id'];
        }

        return $model;
    }
}
