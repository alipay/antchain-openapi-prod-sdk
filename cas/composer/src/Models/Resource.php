<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class Resource extends Model
{
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

    // instance_charge_type
    /**
     * @example instance_charge_type
     *
     * @var string
     */
    public $instanceChargeType;

    // expiredTime
    /**
     * @example expiredTime
     *
     * @var string
     */
    public $expiredTime;

    // auto_renew
    /**
     * @example true, false
     *
     * @var bool
     */
    public $autoRenew;

    // autoRenewPeriod
    /**
     * @example autoRenewPeriod
     *
     * @var int
     */
    public $autoRenewPeriod;

    // iaas_id
    /**
     * @example iaas_id
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

    // region_id
    /**
     * @example region_id
     *
     * @var string
     */
    public $regionId;

    // zone_id
    /**
     * @example zone_id
     *
     * @var string
     */
    public $zoneId;

    // id
    /**
     * @example id
     *
     * @var string
     */
    public $id;

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
    protected $_name = [
        'name'               => 'name',
        'description'        => 'description',
        'instanceChargeType' => 'instance_charge_type',
        'expiredTime'        => 'expired_time',
        'autoRenew'          => 'auto_renew',
        'autoRenewPeriod'    => 'auto_renew_period',
        'iaasId'             => 'iaas_id',
        'iaasType'           => 'iaas_type',
        'regionId'           => 'region_id',
        'zoneId'             => 'zone_id',
        'id'                 => 'id',
        'utcCreate'          => 'utc_create',
        'utcModified'        => 'utc_modified',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('zoneId', $this->zoneId, true);
        Model::validateRequired('id', $this->id, true);
        Model::validatePattern('expiredTime', $this->expiredTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('utcCreate', $this->utcCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('utcModified', $this->utcModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->instanceChargeType) {
            $res['instance_charge_type'] = $this->instanceChargeType;
        }
        if (null !== $this->expiredTime) {
            $res['expired_time'] = $this->expiredTime;
        }
        if (null !== $this->autoRenew) {
            $res['auto_renew'] = $this->autoRenew;
        }
        if (null !== $this->autoRenewPeriod) {
            $res['auto_renew_period'] = $this->autoRenewPeriod;
        }
        if (null !== $this->iaasId) {
            $res['iaas_id'] = $this->iaasId;
        }
        if (null !== $this->iaasType) {
            $res['iaas_type'] = $this->iaasType;
        }
        if (null !== $this->regionId) {
            $res['region_id'] = $this->regionId;
        }
        if (null !== $this->zoneId) {
            $res['zone_id'] = $this->zoneId;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->utcCreate) {
            $res['utc_create'] = $this->utcCreate;
        }
        if (null !== $this->utcModified) {
            $res['utc_modified'] = $this->utcModified;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return resource
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['instance_charge_type'])) {
            $model->instanceChargeType = $map['instance_charge_type'];
        }
        if (isset($map['expired_time'])) {
            $model->expiredTime = $map['expired_time'];
        }
        if (isset($map['auto_renew'])) {
            $model->autoRenew = $map['auto_renew'];
        }
        if (isset($map['auto_renew_period'])) {
            $model->autoRenewPeriod = $map['auto_renew_period'];
        }
        if (isset($map['iaas_id'])) {
            $model->iaasId = $map['iaas_id'];
        }
        if (isset($map['iaas_type'])) {
            $model->iaasType = $map['iaas_type'];
        }
        if (isset($map['region_id'])) {
            $model->regionId = $map['region_id'];
        }
        if (isset($map['zone_id'])) {
            $model->zoneId = $map['zone_id'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['utc_create'])) {
            $model->utcCreate = $map['utc_create'];
        }
        if (isset($map['utc_modified'])) {
            $model->utcModified = $map['utc_modified'];
        }

        return $model;
    }
}
