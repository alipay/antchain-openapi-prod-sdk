<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class UpdateTraasmetaAppserverRequest extends Model
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

    // ip
    /**
     * @var string
     */
    public $ip;

    // host_ip
    /**
     * @var string
     */
    public $hostIp;

    // collect_id
    /**
     * @var string
     */
    public $collectId;

    // status
    /**
     * @var bool
     */
    public $status;

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

    // cell_uuid
    /**
     * @var string
     */
    public $cellUuid;

    // zone_uuid
    /**
     * @var string
     */
    public $zoneUuid;

    // app_uuid
    /**
     * @var string
     */
    public $appUuid;

    // app_name
    /**
     * @var string
     */
    public $appName;

    // app_service_uuid
    /**
     * @var string
     */
    public $appServiceUuid;

    // vm_uuid
    /**
     * @var string
     */
    public $vmUuid;

    // pod_uuid
    /**
     * @var string
     */
    public $podUuid;
    protected $_name = [
        'authToken'      => 'auth_token',
        'uuid'           => 'uuid',
        'hostname'       => 'hostname',
        'outsideId'      => 'outside_id',
        'sourceFrom'     => 'source_from',
        'extension'      => 'extension',
        'tenantUuid'     => 'tenant_uuid',
        'tenantName'     => 'tenant_name',
        'ip'             => 'ip',
        'hostIp'         => 'host_ip',
        'collectId'      => 'collect_id',
        'status'         => 'status',
        'workspaceUuid'  => 'workspace_uuid',
        'workspaceName'  => 'workspace_name',
        'cellUuid'       => 'cell_uuid',
        'zoneUuid'       => 'zone_uuid',
        'appUuid'        => 'app_uuid',
        'appName'        => 'app_name',
        'appServiceUuid' => 'app_service_uuid',
        'vmUuid'         => 'vm_uuid',
        'podUuid'        => 'pod_uuid',
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
        if (null !== $this->outsideId) {
            $res['outside_id'] = $this->outsideId;
        }
        if (null !== $this->sourceFrom) {
            $res['source_from'] = $this->sourceFrom;
        }
        if (null !== $this->extension) {
            $res['extension'] = $this->extension;
        }
        if (null !== $this->tenantUuid) {
            $res['tenant_uuid'] = $this->tenantUuid;
        }
        if (null !== $this->tenantName) {
            $res['tenant_name'] = $this->tenantName;
        }
        if (null !== $this->ip) {
            $res['ip'] = $this->ip;
        }
        if (null !== $this->hostIp) {
            $res['host_ip'] = $this->hostIp;
        }
        if (null !== $this->collectId) {
            $res['collect_id'] = $this->collectId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->workspaceUuid) {
            $res['workspace_uuid'] = $this->workspaceUuid;
        }
        if (null !== $this->workspaceName) {
            $res['workspace_name'] = $this->workspaceName;
        }
        if (null !== $this->cellUuid) {
            $res['cell_uuid'] = $this->cellUuid;
        }
        if (null !== $this->zoneUuid) {
            $res['zone_uuid'] = $this->zoneUuid;
        }
        if (null !== $this->appUuid) {
            $res['app_uuid'] = $this->appUuid;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->appServiceUuid) {
            $res['app_service_uuid'] = $this->appServiceUuid;
        }
        if (null !== $this->vmUuid) {
            $res['vm_uuid'] = $this->vmUuid;
        }
        if (null !== $this->podUuid) {
            $res['pod_uuid'] = $this->podUuid;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateTraasmetaAppserverRequest
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
        if (isset($map['outside_id'])) {
            $model->outsideId = $map['outside_id'];
        }
        if (isset($map['source_from'])) {
            $model->sourceFrom = $map['source_from'];
        }
        if (isset($map['extension'])) {
            $model->extension = $map['extension'];
        }
        if (isset($map['tenant_uuid'])) {
            $model->tenantUuid = $map['tenant_uuid'];
        }
        if (isset($map['tenant_name'])) {
            $model->tenantName = $map['tenant_name'];
        }
        if (isset($map['ip'])) {
            $model->ip = $map['ip'];
        }
        if (isset($map['host_ip'])) {
            $model->hostIp = $map['host_ip'];
        }
        if (isset($map['collect_id'])) {
            $model->collectId = $map['collect_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['workspace_uuid'])) {
            $model->workspaceUuid = $map['workspace_uuid'];
        }
        if (isset($map['workspace_name'])) {
            $model->workspaceName = $map['workspace_name'];
        }
        if (isset($map['cell_uuid'])) {
            $model->cellUuid = $map['cell_uuid'];
        }
        if (isset($map['zone_uuid'])) {
            $model->zoneUuid = $map['zone_uuid'];
        }
        if (isset($map['app_uuid'])) {
            $model->appUuid = $map['app_uuid'];
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['app_service_uuid'])) {
            $model->appServiceUuid = $map['app_service_uuid'];
        }
        if (isset($map['vm_uuid'])) {
            $model->vmUuid = $map['vm_uuid'];
        }
        if (isset($map['pod_uuid'])) {
            $model->podUuid = $map['pod_uuid'];
        }

        return $model;
    }
}
