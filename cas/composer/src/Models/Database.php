<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class Database extends Model
{
    // app_ids
    /**
     * @example
     *
     * @var string[]
     */
    public $appIds;

    // app_service_ids
    /**
     * @example
     *
     * @var string[]
     */
    public $appServiceIds;

    // assignedApps
    /**
     * @example
     *
     * @var AssignedApp[]
     */
    public $assignedApps;

    // assigned_app_service_ids
    /**
     * @example
     *
     * @var string[]
     */
    public $assignedAppServiceIds;

    // autoRenew
    /**
     * @example
     *
     * @var bool
     */
    public $autoRenew;

    // auto_renew_period
    /**
     * @example
     *
     * @var int
     */
    public $autoRenewPeriod;

    // connection_address
    /**
     * @example connection_address
     *
     * @var string
     */
    public $connectionAddress;

    // cpu
    /**
     * @example
     *
     * @var int
     */
    public $cpu;

    // description
    /**
     * @example description
     *
     * @var string
     */
    public $description;

    // engine
    /**
     * @example engine
     *
     * @var string
     */
    public $engine;

    // engine_version
    /**
     * @example engine_version
     *
     * @var string
     */
    public $engineVersion;

    // iaasId
    /**
     * @example iaasId
     *
     * @var string
     */
    public $iaasId;

    // iaas_type
    /**
     * @example iaas_type
     *
     * @var string
     */
    public $iaasType;

    // id
    /**
     * @example id
     *
     * @var string
     */
    public $id;

    // master_zone_id
    /**
     * @example master_zone_id
     *
     * @var string
     */
    public $masterZoneId;

    // max_connections
    /**
     * @example
     *
     * @var int
     */
    public $maxConnections;

    // max_iops
    /**
     * @example
     *
     * @var int
     */
    public $maxIops;

    // memory
    /**
     * @example
     *
     * @var int
     */
    public $memory;

    // name
    /**
     * @example name
     *
     * @var string
     */
    public $name;

    // network_type
    /**
     * @example network_type
     *
     * @var string
     */
    public $networkType;

    // net_type
    /**
     * @example net_type
     *
     * @var string
     */
    public $netType;

    // port
    /**
     * @example
     *
     * @var int
     */
    public $port;

    // shared_workspace_ids
    /**
     * @example
     *
     * @var string[]
     */
    public $sharedWorkspaceIds;

    // spec_iaas_id
    /**
     * @example spec_iaas_id
     *
     * @var string
     */
    public $specIaasId;

    // status
    /**
     * @example status
     *
     * @var string
     */
    public $status;

    // storage
    /**
     * @example
     *
     * @var int
     */
    public $storage;

    // type
    /**
     * @example type
     *
     * @var string
     */
    public $type;

    // utc_create
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $utcCreate;

    // utc_modified
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $utcModified;

    // vpc_id
    /**
     * @example vpc_id
     *
     * @var string
     */
    public $vpcId;

    // v_switch_iaas_id
    /**
     * @example v_switch_iaas_id
     *
     * @var string
     */
    public $vSwitchIaasId;

    // workspace_id
    /**
     * @example workspace_id
     *
     * @var string
     */
    public $workspaceId;
    protected $_name = [
        'appIds'                => 'app_ids',
        'appServiceIds'         => 'app_service_ids',
        'assignedApps'          => 'assigned_apps',
        'assignedAppServiceIds' => 'assigned_app_service_ids',
        'autoRenew'             => 'auto_renew',
        'autoRenewPeriod'       => 'auto_renew_period',
        'connectionAddress'     => 'connection_address',
        'cpu'                   => 'cpu',
        'description'           => 'description',
        'engine'                => 'engine',
        'engineVersion'         => 'engine_version',
        'iaasId'                => 'iaas_id',
        'iaasType'              => 'iaas_type',
        'id'                    => 'id',
        'masterZoneId'          => 'master_zone_id',
        'maxConnections'        => 'max_connections',
        'maxIops'               => 'max_iops',
        'memory'                => 'memory',
        'name'                  => 'name',
        'networkType'           => 'network_type',
        'netType'               => 'net_type',
        'port'                  => 'port',
        'sharedWorkspaceIds'    => 'shared_workspace_ids',
        'specIaasId'            => 'spec_iaas_id',
        'status'                => 'status',
        'storage'               => 'storage',
        'type'                  => 'type',
        'utcCreate'             => 'utc_create',
        'utcModified'           => 'utc_modified',
        'vpcId'                 => 'vpc_id',
        'vSwitchIaasId'         => 'v_switch_iaas_id',
        'workspaceId'           => 'workspace_id',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('status', $this->status, true);
        Model::validatePattern('utcCreate', $this->utcCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('utcModified', $this->utcModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->appIds) {
            $res['app_ids'] = $this->appIds;
        }
        if (null !== $this->appServiceIds) {
            $res['app_service_ids'] = $this->appServiceIds;
        }
        if (null !== $this->assignedApps) {
            $res['assigned_apps'] = [];
            if (null !== $this->assignedApps && \is_array($this->assignedApps)) {
                $n = 0;
                foreach ($this->assignedApps as $item) {
                    $res['assigned_apps'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->assignedAppServiceIds) {
            $res['assigned_app_service_ids'] = $this->assignedAppServiceIds;
        }
        if (null !== $this->autoRenew) {
            $res['auto_renew'] = $this->autoRenew;
        }
        if (null !== $this->autoRenewPeriod) {
            $res['auto_renew_period'] = $this->autoRenewPeriod;
        }
        if (null !== $this->connectionAddress) {
            $res['connection_address'] = $this->connectionAddress;
        }
        if (null !== $this->cpu) {
            $res['cpu'] = $this->cpu;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->engine) {
            $res['engine'] = $this->engine;
        }
        if (null !== $this->engineVersion) {
            $res['engine_version'] = $this->engineVersion;
        }
        if (null !== $this->iaasId) {
            $res['iaas_id'] = $this->iaasId;
        }
        if (null !== $this->iaasType) {
            $res['iaas_type'] = $this->iaasType;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->masterZoneId) {
            $res['master_zone_id'] = $this->masterZoneId;
        }
        if (null !== $this->maxConnections) {
            $res['max_connections'] = $this->maxConnections;
        }
        if (null !== $this->maxIops) {
            $res['max_iops'] = $this->maxIops;
        }
        if (null !== $this->memory) {
            $res['memory'] = $this->memory;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->networkType) {
            $res['network_type'] = $this->networkType;
        }
        if (null !== $this->netType) {
            $res['net_type'] = $this->netType;
        }
        if (null !== $this->port) {
            $res['port'] = $this->port;
        }
        if (null !== $this->sharedWorkspaceIds) {
            $res['shared_workspace_ids'] = $this->sharedWorkspaceIds;
        }
        if (null !== $this->specIaasId) {
            $res['spec_iaas_id'] = $this->specIaasId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->storage) {
            $res['storage'] = $this->storage;
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
        if (null !== $this->vpcId) {
            $res['vpc_id'] = $this->vpcId;
        }
        if (null !== $this->vSwitchIaasId) {
            $res['v_switch_iaas_id'] = $this->vSwitchIaasId;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Database
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['app_ids'])) {
            if (!empty($map['app_ids'])) {
                $model->appIds = $map['app_ids'];
            }
        }
        if (isset($map['app_service_ids'])) {
            if (!empty($map['app_service_ids'])) {
                $model->appServiceIds = $map['app_service_ids'];
            }
        }
        if (isset($map['assigned_apps'])) {
            if (!empty($map['assigned_apps'])) {
                $model->assignedApps = [];
                $n                   = 0;
                foreach ($map['assigned_apps'] as $item) {
                    $model->assignedApps[$n++] = null !== $item ? AssignedApp::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['assigned_app_service_ids'])) {
            if (!empty($map['assigned_app_service_ids'])) {
                $model->assignedAppServiceIds = $map['assigned_app_service_ids'];
            }
        }
        if (isset($map['auto_renew'])) {
            $model->autoRenew = $map['auto_renew'];
        }
        if (isset($map['auto_renew_period'])) {
            $model->autoRenewPeriod = $map['auto_renew_period'];
        }
        if (isset($map['connection_address'])) {
            $model->connectionAddress = $map['connection_address'];
        }
        if (isset($map['cpu'])) {
            $model->cpu = $map['cpu'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['engine'])) {
            $model->engine = $map['engine'];
        }
        if (isset($map['engine_version'])) {
            $model->engineVersion = $map['engine_version'];
        }
        if (isset($map['iaas_id'])) {
            $model->iaasId = $map['iaas_id'];
        }
        if (isset($map['iaas_type'])) {
            $model->iaasType = $map['iaas_type'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['master_zone_id'])) {
            $model->masterZoneId = $map['master_zone_id'];
        }
        if (isset($map['max_connections'])) {
            $model->maxConnections = $map['max_connections'];
        }
        if (isset($map['max_iops'])) {
            $model->maxIops = $map['max_iops'];
        }
        if (isset($map['memory'])) {
            $model->memory = $map['memory'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['network_type'])) {
            $model->networkType = $map['network_type'];
        }
        if (isset($map['net_type'])) {
            $model->netType = $map['net_type'];
        }
        if (isset($map['port'])) {
            $model->port = $map['port'];
        }
        if (isset($map['shared_workspace_ids'])) {
            if (!empty($map['shared_workspace_ids'])) {
                $model->sharedWorkspaceIds = $map['shared_workspace_ids'];
            }
        }
        if (isset($map['spec_iaas_id'])) {
            $model->specIaasId = $map['spec_iaas_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['storage'])) {
            $model->storage = $map['storage'];
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
        if (isset($map['vpc_id'])) {
            $model->vpcId = $map['vpc_id'];
        }
        if (isset($map['v_switch_iaas_id'])) {
            $model->vSwitchIaasId = $map['v_switch_iaas_id'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }

        return $model;
    }
}
