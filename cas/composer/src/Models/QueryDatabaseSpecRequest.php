<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class QueryDatabaseSpecRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // current_page
    /**
     * @var int
     */
    public $currentPage;

    // custom_storage
    /**
     * @var bool
     */
    public $customStorage;

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

    // iaas_ids
    /**
     * @var string[]
     */
    public $iaasIds;

    // ids
    /**
     * @var string[]
     */
    public $ids;

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

    // pageSize
    /**
     * @var int
     */
    public $pageSize;

    // types
    /**
     * @var string[]
     */
    public $types;

    // provider_ids
    /**
     * @var string[]
     */
    public $providerIds;

    // enable
    /**
     * @var bool
     */
    public $enable;

    // iaas_types
    /**
     * @var string[]
     */
    public $iaasTypes;
    protected $_name = [
        'authToken'         => 'auth_token',
        'currentPage'       => 'current_page',
        'customStorage'     => 'custom_storage',
        'engines'           => 'engines',
        'engineVersions'    => 'engine_versions',
        'iaasIds'           => 'iaas_ids',
        'ids'               => 'ids',
        'maxCpu'            => 'max_cpu',
        'maxMaxConnections' => 'max_max_connections',
        'maxMaxIops'        => 'max_max_iops',
        'maxMemory'         => 'max_memory',
        'minCpu'            => 'min_cpu',
        'minMaxConnections' => 'min_max_connections',
        'minMaxIops'        => 'min_max_iops',
        'minMemory'         => 'min_memory',
        'pageSize'          => 'page_size',
        'types'             => 'types',
        'providerIds'       => 'provider_ids',
        'enable'            => 'enable',
        'iaasTypes'         => 'iaas_types',
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
        if (null !== $this->currentPage) {
            $res['current_page'] = $this->currentPage;
        }
        if (null !== $this->customStorage) {
            $res['custom_storage'] = $this->customStorage;
        }
        if (null !== $this->engines) {
            $res['engines'] = $this->engines;
        }
        if (null !== $this->engineVersions) {
            $res['engine_versions'] = $this->engineVersions;
        }
        if (null !== $this->iaasIds) {
            $res['iaas_ids'] = $this->iaasIds;
        }
        if (null !== $this->ids) {
            $res['ids'] = $this->ids;
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
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->types) {
            $res['types'] = $this->types;
        }
        if (null !== $this->providerIds) {
            $res['provider_ids'] = $this->providerIds;
        }
        if (null !== $this->enable) {
            $res['enable'] = $this->enable;
        }
        if (null !== $this->iaasTypes) {
            $res['iaas_types'] = $this->iaasTypes;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDatabaseSpecRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['current_page'])) {
            $model->currentPage = $map['current_page'];
        }
        if (isset($map['custom_storage'])) {
            $model->customStorage = $map['custom_storage'];
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
        if (isset($map['iaas_ids'])) {
            if (!empty($map['iaas_ids'])) {
                $model->iaasIds = $map['iaas_ids'];
            }
        }
        if (isset($map['ids'])) {
            if (!empty($map['ids'])) {
                $model->ids = $map['ids'];
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
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['types'])) {
            if (!empty($map['types'])) {
                $model->types = $map['types'];
            }
        }
        if (isset($map['provider_ids'])) {
            if (!empty($map['provider_ids'])) {
                $model->providerIds = $map['provider_ids'];
            }
        }
        if (isset($map['enable'])) {
            $model->enable = $map['enable'];
        }
        if (isset($map['iaas_types'])) {
            if (!empty($map['iaas_types'])) {
                $model->iaasTypes = $map['iaas_types'];
            }
        }

        return $model;
    }
}
