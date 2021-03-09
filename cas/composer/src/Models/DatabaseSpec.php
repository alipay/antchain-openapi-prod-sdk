<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class DatabaseSpec extends Model
{
    // cpu
    /**
     * @example
     *
     * @var int
     */
    public $cpu;

    // custom_storage
    /**
     * @example true, false
     *
     * @var bool
     */
    public $customStorage;

    // engine
    /**
     * @example engine
     *
     * @var string
     */
    public $engine;

    // engine_version
    /**
     * @example
     *
     * @var string[]
     */
    public $engineVersion;

    // iaas_id
    /**
     * @example iaas_id
     *
     * @var string
     */
    public $iaasId;

    // id
    /**
     * @example id
     *
     * @var string
     */
    public $id;

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

    // max_storage
    /**
     * @example
     *
     * @var int
     */
    public $maxStorage;

    // memory
    /**
     * @example memory
     *
     * @var int
     */
    public $memory;

    // min_storage
    /**
     * @example min_storage
     *
     * @var int
     */
    public $minStorage;

    // name
    /**
     * @example name
     *
     * @var string
     */
    public $name;

    // supported_storages
    /**
     * @example
     *
     * @var int[]
     */
    public $supportedStorages;

    // type
    /**
     * @example type
     *
     * @var string
     */
    public $type;
    protected $_name = [
        'cpu'               => 'cpu',
        'customStorage'     => 'custom_storage',
        'engine'            => 'engine',
        'engineVersion'     => 'engine_version',
        'iaasId'            => 'iaas_id',
        'id'                => 'id',
        'maxConnections'    => 'max_connections',
        'maxIops'           => 'max_iops',
        'maxStorage'        => 'max_storage',
        'memory'            => 'memory',
        'minStorage'        => 'min_storage',
        'name'              => 'name',
        'supportedStorages' => 'supported_storages',
        'type'              => 'type',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->cpu) {
            $res['cpu'] = $this->cpu;
        }
        if (null !== $this->customStorage) {
            $res['custom_storage'] = $this->customStorage;
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
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->maxConnections) {
            $res['max_connections'] = $this->maxConnections;
        }
        if (null !== $this->maxIops) {
            $res['max_iops'] = $this->maxIops;
        }
        if (null !== $this->maxStorage) {
            $res['max_storage'] = $this->maxStorage;
        }
        if (null !== $this->memory) {
            $res['memory'] = $this->memory;
        }
        if (null !== $this->minStorage) {
            $res['min_storage'] = $this->minStorage;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->supportedStorages) {
            $res['supported_storages'] = $this->supportedStorages;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DatabaseSpec
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cpu'])) {
            $model->cpu = $map['cpu'];
        }
        if (isset($map['custom_storage'])) {
            $model->customStorage = $map['custom_storage'];
        }
        if (isset($map['engine'])) {
            $model->engine = $map['engine'];
        }
        if (isset($map['engine_version'])) {
            if (!empty($map['engine_version'])) {
                $model->engineVersion = $map['engine_version'];
            }
        }
        if (isset($map['iaas_id'])) {
            $model->iaasId = $map['iaas_id'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['max_connections'])) {
            $model->maxConnections = $map['max_connections'];
        }
        if (isset($map['max_iops'])) {
            $model->maxIops = $map['max_iops'];
        }
        if (isset($map['max_storage'])) {
            $model->maxStorage = $map['max_storage'];
        }
        if (isset($map['memory'])) {
            $model->memory = $map['memory'];
        }
        if (isset($map['min_storage'])) {
            $model->minStorage = $map['min_storage'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['supported_storages'])) {
            if (!empty($map['supported_storages'])) {
                $model->supportedStorages = $map['supported_storages'];
            }
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }

        return $model;
    }
}
