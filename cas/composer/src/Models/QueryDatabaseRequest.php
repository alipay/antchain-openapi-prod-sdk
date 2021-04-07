<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class QueryDatabaseRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // app_ids
    /**
     * @var string[]
     */
    public $appIds;

    // app_service_ids
    /**
     * @var string[]
     */
    public $appServiceIds;

    // connection_addresses
    /**
     * @var string[]
     */
    public $connectionAddresses;

    // current_page
    /**
     * @var int
     */
    public $currentPage;

    // engines
    /**
     * @var string[]
     */
    public $engines;

    // engine_versions
    /**
     * @var string[]
     */
    public $engineVersions;

    // include_shared
    /**
     * @var bool
     */
    public $includeShared;

    // master_ids
    /**
     * @var string[]
     */
    public $masterIds;

    // max_cpu
    /**
     * @var int
     */
    public $maxCpu;

    // max_max_connections
    /**
     * @var int
     */
    public $maxMaxConnections;

    // max_max_iops
    /**
     * @var int
     */
    public $maxMaxIops;

    // max_memory
    /**
     * @var int
     */
    public $maxMemory;

    // max_port
    /**
     * @var int
     */
    public $maxPort;

    // max_storage
    /**
     * @var int
     */
    public $maxStorage;

    // min_cpu
    /**
     * @var int
     */
    public $minCpu;

    // min_max_connections
    /**
     * @var int
     */
    public $minMaxConnections;

    // min_max_iops
    /**
     * @var int
     */
    public $minMaxIops;

    // min_memory
    /**
     * @var int
     */
    public $minMemory;

    // min_port
    /**
     * @var int
     */
    public $minPort;

    // min_storage
    /**
     * @var int
     */
    public $minStorage;

    // name
    /**
     * @var string
     */
    public $name;

    // network_type
    /**
     * @var string
     */
    public $networkType;

    // net_type
    /**
     * @var string
     */
    public $netType;

    // page_size
    /**
     * @var int
     */
    public $pageSize;

    // spec_iaas_ids
    /**
     * @var string[]
     */
    public $specIaasIds;

    // statuses
    /**
     * @var string[]
     */
    public $statuses;

    // types
    /**
     * @var string[]
     */
    public $types;

    // vpc_ids
    /**
     * @var string[]
     */
    public $vpcIds;

    // v_switch_iaas_ids
    /**
     * @var string[]
     */
    public $vSwitchIaasIds;

    // workspace_ids
    /**
     * @var string[]
     */
    public $workspaceIds;
    protected $_name = [
        'authToken'           => 'auth_token',
        'appIds'              => 'app_ids',
        'appServiceIds'       => 'app_service_ids',
        'connectionAddresses' => 'connection_addresses',
        'currentPage'         => 'current_page',
        'engines'             => 'engines',
        'engineVersions'      => 'engine_versions',
        'includeShared'       => 'include_shared',
        'masterIds'           => 'master_ids',
        'maxCpu'              => 'max_cpu',
        'maxMaxConnections'   => 'max_max_connections',
        'maxMaxIops'          => 'max_max_iops',
        'maxMemory'           => 'max_memory',
        'maxPort'             => 'max_port',
        'maxStorage'          => 'max_storage',
        'minCpu'              => 'min_cpu',
        'minMaxConnections'   => 'min_max_connections',
        'minMaxIops'          => 'min_max_iops',
        'minMemory'           => 'min_memory',
        'minPort'             => 'min_port',
        'minStorage'          => 'min_storage',
        'name'                => 'name',
        'networkType'         => 'network_type',
        'netType'             => 'net_type',
        'pageSize'            => 'page_size',
        'specIaasIds'         => 'spec_iaas_ids',
        'statuses'            => 'statuses',
        'types'               => 'types',
        'vpcIds'              => 'vpc_ids',
        'vSwitchIaasIds'      => 'v_switch_iaas_ids',
        'workspaceIds'        => 'workspace_ids',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->appIds) {
            $res['app_ids'] = $this->appIds;
        }
        if (null !== $this->appServiceIds) {
            $res['app_service_ids'] = $this->appServiceIds;
        }
        if (null !== $this->connectionAddresses) {
            $res['connection_addresses'] = $this->connectionAddresses;
        }
        if (null !== $this->currentPage) {
            $res['current_page'] = $this->currentPage;
        }
        if (null !== $this->engines) {
            $res['engines'] = $this->engines;
        }
        if (null !== $this->engineVersions) {
            $res['engine_versions'] = $this->engineVersions;
        }
        if (null !== $this->includeShared) {
            $res['include_shared'] = $this->includeShared;
        }
        if (null !== $this->masterIds) {
            $res['master_ids'] = $this->masterIds;
        }
        if (null !== $this->maxCpu) {
            $res['max_cpu'] = $this->maxCpu;
        }
        if (null !== $this->maxMaxConnections) {
            $res['max_max_connections'] = $this->maxMaxConnections;
        }
        if (null !== $this->maxMaxIops) {
            $res['max_max_iops'] = $this->maxMaxIops;
        }
        if (null !== $this->maxMemory) {
            $res['max_memory'] = $this->maxMemory;
        }
        if (null !== $this->maxPort) {
            $res['max_port'] = $this->maxPort;
        }
        if (null !== $this->maxStorage) {
            $res['max_storage'] = $this->maxStorage;
        }
        if (null !== $this->minCpu) {
            $res['min_cpu'] = $this->minCpu;
        }
        if (null !== $this->minMaxConnections) {
            $res['min_max_connections'] = $this->minMaxConnections;
        }
        if (null !== $this->minMaxIops) {
            $res['min_max_iops'] = $this->minMaxIops;
        }
        if (null !== $this->minMemory) {
            $res['min_memory'] = $this->minMemory;
        }
        if (null !== $this->minPort) {
            $res['min_port'] = $this->minPort;
        }
        if (null !== $this->minStorage) {
            $res['min_storage'] = $this->minStorage;
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
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->specIaasIds) {
            $res['spec_iaas_ids'] = $this->specIaasIds;
        }
        if (null !== $this->statuses) {
            $res['statuses'] = $this->statuses;
        }
        if (null !== $this->types) {
            $res['types'] = $this->types;
        }
        if (null !== $this->vpcIds) {
            $res['vpc_ids'] = $this->vpcIds;
        }
        if (null !== $this->vSwitchIaasIds) {
            $res['v_switch_iaas_ids'] = $this->vSwitchIaasIds;
        }
        if (null !== $this->workspaceIds) {
            $res['workspace_ids'] = $this->workspaceIds;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDatabaseRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
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
        if (isset($map['connection_addresses'])) {
            if (!empty($map['connection_addresses'])) {
                $model->connectionAddresses = $map['connection_addresses'];
            }
        }
        if (isset($map['current_page'])) {
            $model->currentPage = $map['current_page'];
        }
        if (isset($map['engines'])) {
            if (!empty($map['engines'])) {
                $model->engines = $map['engines'];
            }
        }
        if (isset($map['engine_versions'])) {
            if (!empty($map['engine_versions'])) {
                $model->engineVersions = $map['engine_versions'];
            }
        }
        if (isset($map['include_shared'])) {
            $model->includeShared = $map['include_shared'];
        }
        if (isset($map['master_ids'])) {
            if (!empty($map['master_ids'])) {
                $model->masterIds = $map['master_ids'];
            }
        }
        if (isset($map['max_cpu'])) {
            $model->maxCpu = $map['max_cpu'];
        }
        if (isset($map['max_max_connections'])) {
            $model->maxMaxConnections = $map['max_max_connections'];
        }
        if (isset($map['max_max_iops'])) {
            $model->maxMaxIops = $map['max_max_iops'];
        }
        if (isset($map['max_memory'])) {
            $model->maxMemory = $map['max_memory'];
        }
        if (isset($map['max_port'])) {
            $model->maxPort = $map['max_port'];
        }
        if (isset($map['max_storage'])) {
            $model->maxStorage = $map['max_storage'];
        }
        if (isset($map['min_cpu'])) {
            $model->minCpu = $map['min_cpu'];
        }
        if (isset($map['min_max_connections'])) {
            $model->minMaxConnections = $map['min_max_connections'];
        }
        if (isset($map['min_max_iops'])) {
            $model->minMaxIops = $map['min_max_iops'];
        }
        if (isset($map['min_memory'])) {
            $model->minMemory = $map['min_memory'];
        }
        if (isset($map['min_port'])) {
            $model->minPort = $map['min_port'];
        }
        if (isset($map['min_storage'])) {
            $model->minStorage = $map['min_storage'];
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
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['spec_iaas_ids'])) {
            if (!empty($map['spec_iaas_ids'])) {
                $model->specIaasIds = $map['spec_iaas_ids'];
            }
        }
        if (isset($map['statuses'])) {
            if (!empty($map['statuses'])) {
                $model->statuses = $map['statuses'];
            }
        }
        if (isset($map['types'])) {
            if (!empty($map['types'])) {
                $model->types = $map['types'];
            }
        }
        if (isset($map['vpc_ids'])) {
            if (!empty($map['vpc_ids'])) {
                $model->vpcIds = $map['vpc_ids'];
            }
        }
        if (isset($map['v_switch_iaas_ids'])) {
            if (!empty($map['v_switch_iaas_ids'])) {
                $model->vSwitchIaasIds = $map['v_switch_iaas_ids'];
            }
        }
        if (isset($map['workspace_ids'])) {
            if (!empty($map['workspace_ids'])) {
                $model->workspaceIds = $map['workspace_ids'];
            }
        }

        return $model;
    }
}
