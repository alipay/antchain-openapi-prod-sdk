<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class DnsRecordParam extends Model
{
    // workspace_id
    /**
     * @example workspace_id
     *
     * @var string
     */
    public $workspaceId;

    // value
    /**
     * @example value
     *
     * @var string
     */
    public $value;

    // ttl
    /**
     * @example 60
     *
     * @var int
     */
    public $ttl;

    // regionId
    /**
     * @example regionId
     *
     * @var string
     */
    public $regionId;

    // zoneId
    /**
     * @example zoneId
     *
     * @var string
     */
    public $zoneId;

    // description
    /**
     * @example description
     *
     * @var string
     */
    public $description;

    // resource_type
    /**
     * @example COMPUTER
     *
     * @var string
     */
    public $resourceType;
    protected $_name = [
        'workspaceId'  => 'workspace_id',
        'value'        => 'value',
        'ttl'          => 'ttl',
        'regionId'     => 'region_id',
        'zoneId'       => 'zone_id',
        'description'  => 'description',
        'resourceType' => 'resource_type',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceId', $this->workspaceId, true);
        Model::validateRequired('value', $this->value, true);
        Model::validateRequired('ttl', $this->ttl, true);
        Model::validateRequired('regionId', $this->regionId, true);
        Model::validateRequired('resourceType', $this->resourceType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }
        if (null !== $this->ttl) {
            $res['ttl'] = $this->ttl;
        }
        if (null !== $this->regionId) {
            $res['region_id'] = $this->regionId;
        }
        if (null !== $this->zoneId) {
            $res['zone_id'] = $this->zoneId;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->resourceType) {
            $res['resource_type'] = $this->resourceType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DnsRecordParam
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }
        if (isset($map['ttl'])) {
            $model->ttl = $map['ttl'];
        }
        if (isset($map['region_id'])) {
            $model->regionId = $map['region_id'];
        }
        if (isset($map['zone_id'])) {
            $model->zoneId = $map['zone_id'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['resource_type'])) {
            $model->resourceType = $map['resource_type'];
        }

        return $model;
    }
}
