<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class TraasHostMachineDto extends Model
{
    // uuid
    /**
     * @example uuid
     *
     * @var string
     */
    public $uuid;

    // hostname
    /**
     * @example hostname
     *
     * @var string
     */
    public $hostname;

    // ip
    /**
     * @example ip
     *
     * @var string
     */
    public $ip;

    // collect_ip
    /**
     * @example collect_ip
     *
     * @var string
     */
    public $collectIp;

    // tenant_uuid
    /**
     * @example tenant_uuid
     *
     * @var string
     */
    public $tenantUuid;

    // tenant_name
    /**
     * @example tenant_name
     *
     * @var string
     */
    public $tenantName;

    // workspace_uuid
    /**
     * @example workspace_uuid
     *
     * @var string
     */
    public $workspaceUuid;

    // workspace_name
    /**
     * @example workspace_name
     *
     * @var string
     */
    public $workspaceName;

    // zone_uuid
    /**
     * @example zone_uuid
     *
     * @var string
     */
    public $zoneUuid;

    // zone_name
    /**
     * @example zone_name
     *
     * @var string
     */
    public $zoneName;

    // outside_id
    /**
     * @example outside_id
     *
     * @var string
     */
    public $outsideId;

    // source_from
    /**
     * @example source_from
     *
     * @var string
     */
    public $sourceFrom;

    // extension
    /**
     * @example extension
     *
     * @var string
     */
    public $extension;

    // gmt_create
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtCreate;

    // gmt_modified
    /**
     * @example gmt_modified
     *
     * @var string
     */
    public $gmtModified;
    protected $_name = [
        'uuid'          => 'uuid',
        'hostname'      => 'hostname',
        'ip'            => 'ip',
        'collectIp'     => 'collect_ip',
        'tenantUuid'    => 'tenant_uuid',
        'tenantName'    => 'tenant_name',
        'workspaceUuid' => 'workspace_uuid',
        'workspaceName' => 'workspace_name',
        'zoneUuid'      => 'zone_uuid',
        'zoneName'      => 'zone_name',
        'outsideId'     => 'outside_id',
        'sourceFrom'    => 'source_from',
        'extension'     => 'extension',
        'gmtCreate'     => 'gmt_create',
        'gmtModified'   => 'gmt_modified',
    ];

    public function validate()
    {
        Model::validateRequired('uuid', $this->uuid, true);
        Model::validateRequired('hostname', $this->hostname, true);
        Model::validateRequired('ip', $this->ip, true);
        Model::validateRequired('collectIp', $this->collectIp, true);
        Model::validateRequired('sourceFrom', $this->sourceFrom, true);
        Model::validatePattern('gmtCreate', $this->gmtCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->uuid) {
            $res['uuid'] = $this->uuid;
        }
        if (null !== $this->hostname) {
            $res['hostname'] = $this->hostname;
        }
        if (null !== $this->ip) {
            $res['ip'] = $this->ip;
        }
        if (null !== $this->collectIp) {
            $res['collect_ip'] = $this->collectIp;
        }
        if (null !== $this->tenantUuid) {
            $res['tenant_uuid'] = $this->tenantUuid;
        }
        if (null !== $this->tenantName) {
            $res['tenant_name'] = $this->tenantName;
        }
        if (null !== $this->workspaceUuid) {
            $res['workspace_uuid'] = $this->workspaceUuid;
        }
        if (null !== $this->workspaceName) {
            $res['workspace_name'] = $this->workspaceName;
        }
        if (null !== $this->zoneUuid) {
            $res['zone_uuid'] = $this->zoneUuid;
        }
        if (null !== $this->zoneName) {
            $res['zone_name'] = $this->zoneName;
        }
        if (null !== $this->outsideId) {
            $res['outside_id'] = $this->outsideId;
        }
        if (null !== $this->sourceFrom) {
            $res['source_from'] = $this->sourceFrom;
        }
        if (null !== $this->extension) {
            $res['extension'] = $this->extension;
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
     * @return TraasHostMachineDto
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['uuid'])) {
            $model->uuid = $map['uuid'];
        }
        if (isset($map['hostname'])) {
            $model->hostname = $map['hostname'];
        }
        if (isset($map['ip'])) {
            $model->ip = $map['ip'];
        }
        if (isset($map['collect_ip'])) {
            $model->collectIp = $map['collect_ip'];
        }
        if (isset($map['tenant_uuid'])) {
            $model->tenantUuid = $map['tenant_uuid'];
        }
        if (isset($map['tenant_name'])) {
            $model->tenantName = $map['tenant_name'];
        }
        if (isset($map['workspace_uuid'])) {
            $model->workspaceUuid = $map['workspace_uuid'];
        }
        if (isset($map['workspace_name'])) {
            $model->workspaceName = $map['workspace_name'];
        }
        if (isset($map['zone_uuid'])) {
            $model->zoneUuid = $map['zone_uuid'];
        }
        if (isset($map['zone_name'])) {
            $model->zoneName = $map['zone_name'];
        }
        if (isset($map['outside_id'])) {
            $model->outsideId = $map['outside_id'];
        }
        if (isset($map['source_from'])) {
            $model->sourceFrom = $map['source_from'];
        }
        if (isset($map['extension'])) {
            $model->extension = $map['extension'];
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
