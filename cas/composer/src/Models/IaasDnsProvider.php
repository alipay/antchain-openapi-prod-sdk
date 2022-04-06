<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class IaasDnsProvider extends Model
{
    // id
    /**
     * @example id
     *
     * @var string
     */
    public $id;

    // service_config_id
    /**
     * @example service_config_id
     *
     * @var string
     */
    public $serviceConfigId;

    // name
    /**
     * @example name
     *
     * @var string
     */
    public $name;

    // description
    /**
     * @example description
     *
     * @var string
     */
    public $description;

    // type
    /**
     * @example type
     *
     * @var string
     */
    public $type;

    // status
    /**
     * @example status
     *
     * @var string
     */
    public $status;

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

    // dns_zones
    /**
     * @example
     *
     * @var DnsZones[]
     */
    public $dnsZones;
    protected $_name = [
        'id'              => 'id',
        'serviceConfigId' => 'service_config_id',
        'name'            => 'name',
        'description'     => 'description',
        'type'            => 'type',
        'status'          => 'status',
        'regionId'        => 'region_id',
        'zoneId'          => 'zone_id',
        'utcCreate'       => 'utc_create',
        'utcModified'     => 'utc_modified',
        'dnsZones'        => 'dns_zones',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('serviceConfigId', $this->serviceConfigId, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('description', $this->description, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('regionId', $this->regionId, true);
        Model::validateRequired('utcCreate', $this->utcCreate, true);
        Model::validateRequired('utcModified', $this->utcModified, true);
        Model::validateRequired('dnsZones', $this->dnsZones, true);
        Model::validatePattern('utcCreate', $this->utcCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('utcModified', $this->utcModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->serviceConfigId) {
            $res['service_config_id'] = $this->serviceConfigId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->regionId) {
            $res['region_id'] = $this->regionId;
        }
        if (null !== $this->zoneId) {
            $res['zone_id'] = $this->zoneId;
        }
        if (null !== $this->utcCreate) {
            $res['utc_create'] = $this->utcCreate;
        }
        if (null !== $this->utcModified) {
            $res['utc_modified'] = $this->utcModified;
        }
        if (null !== $this->dnsZones) {
            $res['dns_zones'] = [];
            if (null !== $this->dnsZones && \is_array($this->dnsZones)) {
                $n = 0;
                foreach ($this->dnsZones as $item) {
                    $res['dns_zones'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IaasDnsProvider
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['service_config_id'])) {
            $model->serviceConfigId = $map['service_config_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['region_id'])) {
            $model->regionId = $map['region_id'];
        }
        if (isset($map['zone_id'])) {
            $model->zoneId = $map['zone_id'];
        }
        if (isset($map['utc_create'])) {
            $model->utcCreate = $map['utc_create'];
        }
        if (isset($map['utc_modified'])) {
            $model->utcModified = $map['utc_modified'];
        }
        if (isset($map['dns_zones'])) {
            if (!empty($map['dns_zones'])) {
                $model->dnsZones = [];
                $n               = 0;
                foreach ($map['dns_zones'] as $item) {
                    $model->dnsZones[$n++] = null !== $item ? DnsZones::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
