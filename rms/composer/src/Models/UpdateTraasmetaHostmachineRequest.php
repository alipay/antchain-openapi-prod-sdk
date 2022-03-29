<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class UpdateTraasmetaHostmachineRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // uuid
    /**
     * @var string
     */
    public $uuid;

    // hostname
    /**
     * @var string
     */
    public $hostname;

    // collect_id
    /**
     * @var string
     */
    public $collectId;

    // tenant_uuid
    /**
     * @var string
     */
    public $tenantUuid;

    // tenant_name
    /**
     * @var string
     */
    public $tenantName;

    // workspace_uuid
    /**
     * @var string
     */
    public $workspaceUuid;

    // workspace_name
    /**
     * @var string
     */
    public $workspaceName;

    // zone_uuid
    /**
     * @var string
     */
    public $zoneUuid;

    // zone_name
    /**
     * @var string
     */
    public $zoneName;

    // outside_id
    /**
     * @var string
     */
    public $outsideId;

    // source_from
    /**
     * @var string
     */
    public $sourceFrom;

    // extension
    /**
     * @var string
     */
    public $extension;

    // ip
    /**
     * @var string
     */
    public $ip;
    protected $_name = [
        'authToken'     => 'auth_token',
        'uuid'          => 'uuid',
        'hostname'      => 'hostname',
        'collectId'     => 'collect_id',
        'tenantUuid'    => 'tenant_uuid',
        'tenantName'    => 'tenant_name',
        'workspaceUuid' => 'workspace_uuid',
        'workspaceName' => 'workspace_name',
        'zoneUuid'      => 'zone_uuid',
        'zoneName'      => 'zone_name',
        'outsideId'     => 'outside_id',
        'sourceFrom'    => 'source_from',
        'extension'     => 'extension',
        'ip'            => 'ip',
    ];

    public function validate()
    {
        Model::validateRequired('uuid', $this->uuid, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->uuid) {
            $res['uuid'] = $this->uuid;
        }
        if (null !== $this->hostname) {
            $res['hostname'] = $this->hostname;
        }
        if (null !== $this->collectId) {
            $res['collect_id'] = $this->collectId;
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
        if (null !== $this->ip) {
            $res['ip'] = $this->ip;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateTraasmetaHostmachineRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['uuid'])) {
            $model->uuid = $map['uuid'];
        }
        if (isset($map['hostname'])) {
            $model->hostname = $map['hostname'];
        }
        if (isset($map['collect_id'])) {
            $model->collectId = $map['collect_id'];
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
        if (isset($map['ip'])) {
            $model->ip = $map['ip'];
        }

        return $model;
    }
}
