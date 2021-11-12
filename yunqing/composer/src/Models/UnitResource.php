<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class UnitResource extends Model
{
    // 资源地址
    /**
     * @example 127.0.0.1
     *
     * @var string
     */
    public $address;

    // 环境标识
    /**
     * @example 123
     *
     * @var string
     */
    public $envId;

    // 资源ID
    /**
     * @example abc
     *
     * @var string
     */
    public $id;

    // 资源名称
    /**
     * @example lb-1
     *
     * @var string
     */
    public $name;

    // 资源端口
    /**
     * @example 8077
     *
     * @var int
     */
    public $port;

    // 资源类型:CONTAINER,LB,DB,CACHE,APP,STORAGE
    /**
     * @example LB,DB
     *
     * @var string
     */
    public $resourceType;

    // zone标识
    /**
     * @example defaut-a
     *
     * @var string
     */
    public $zoneId;
    protected $_name = [
        'address'      => 'address',
        'envId'        => 'env_id',
        'id'           => 'id',
        'name'         => 'name',
        'port'         => 'port',
        'resourceType' => 'resource_type',
        'zoneId'       => 'zone_id',
    ];

    public function validate()
    {
        Model::validateRequired('address', $this->address, true);
        Model::validateRequired('envId', $this->envId, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('resourceType', $this->resourceType, true);
        Model::validateRequired('zoneId', $this->zoneId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->address) {
            $res['address'] = $this->address;
        }
        if (null !== $this->envId) {
            $res['env_id'] = $this->envId;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->port) {
            $res['port'] = $this->port;
        }
        if (null !== $this->resourceType) {
            $res['resource_type'] = $this->resourceType;
        }
        if (null !== $this->zoneId) {
            $res['zone_id'] = $this->zoneId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UnitResource
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['address'])) {
            $model->address = $map['address'];
        }
        if (isset($map['env_id'])) {
            $model->envId = $map['env_id'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['port'])) {
            $model->port = $map['port'];
        }
        if (isset($map['resource_type'])) {
            $model->resourceType = $map['resource_type'];
        }
        if (isset($map['zone_id'])) {
            $model->zoneId = $map['zone_id'];
        }

        return $model;
    }
}
