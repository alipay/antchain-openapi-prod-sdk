<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class Disk extends Model
{
    // ssd, cloud_efficiency
    /**
     * @example ssd
     *
     * @var string
     */
    public $category;

    // disk related computer info
    /**
     * @example
     *
     * @var DiskComputer
     */
    public $computer;

    // 是否同时删除自动快照
    /**
     * @example true, false
     *
     * @var bool
     */
    public $deleteAutoSnapshot;

    // 磁盘是否随container一起释放
    /**
     * @example true, false
     *
     * @var bool
     */
    public $deleteWithComputer;

    // device info
    /**
     * @example /dev/xvdb
     *
     * @var string
     */
    public $device;

    // 磁盘是否执行自动快照策略
    /**
     * @example true, false
     *
     * @var bool
     */
    public $enableAutoSnapshot;

    // iaasId
    /**
     * @example d-dsf8usduiufsid***
     *
     * @var string
     */
    public $iaasId;

    // id
    /**
     * @example 0000000001
     *
     * @var string
     */
    public $id;

    // 创建磁盘的镜像
    /**
     * @example d-dafjlakgh23424hhkjh***
     *
     * @var string
     */
    public $imageId;

    // name
    /**
     * @example name
     *
     * @var string
     */
    public $name;

    // 磁盘是否可卸载
    /**
     * @example true, false
     *
     * @var bool
     */
    public $portable;

    // providerId
    /**
     * @example 0000000001
     *
     * @var string
     */
    public $providerId;

    // regionId
    /**
     * @example 0000000001
     *
     * @var string
     */
    public $regionId;

    // disk size
    /**
     * @example
     *
     * @var int
     */
    public $size;

    // disk status
    /**
     * @example AVAILABLE
     *
     * @var string
     */
    public $status;

    // tenantId
    /**
     * @example 0000000001
     *
     * @var string
     */
    public $tenantId;

    // SYSTEM, DATA
    /**
     * @example SYSTEM
     *
     * @var string
     */
    public $type;

    // utcCreate
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $utcCreate;

    // utcModified
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $utcModified;

    // workspaceId
    /**
     * @example 000000001
     *
     * @var string
     */
    public $workspaceId;

    // zoneId
    /**
     * @example 000000001
     *
     * @var string
     */
    public $zoneId;
    protected $_name = [
        'category'           => 'category',
        'computer'           => 'computer',
        'deleteAutoSnapshot' => 'delete_auto_snapshot',
        'deleteWithComputer' => 'delete_with_computer',
        'device'             => 'device',
        'enableAutoSnapshot' => 'enable_auto_snapshot',
        'iaasId'             => 'iaas_id',
        'id'                 => 'id',
        'imageId'            => 'image_id',
        'name'               => 'name',
        'portable'           => 'portable',
        'providerId'         => 'provider_id',
        'regionId'           => 'region_id',
        'size'               => 'size',
        'status'             => 'status',
        'tenantId'           => 'tenant_id',
        'type'               => 'type',
        'utcCreate'          => 'utc_create',
        'utcModified'        => 'utc_modified',
        'workspaceId'        => 'workspace_id',
        'zoneId'             => 'zone_id',
    ];

    public function validate()
    {
        Model::validatePattern('utcCreate', $this->utcCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('utcModified', $this->utcModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->category) {
            $res['category'] = $this->category;
        }
        if (null !== $this->computer) {
            $res['computer'] = null !== $this->computer ? $this->computer->toMap() : null;
        }
        if (null !== $this->deleteAutoSnapshot) {
            $res['delete_auto_snapshot'] = $this->deleteAutoSnapshot;
        }
        if (null !== $this->deleteWithComputer) {
            $res['delete_with_computer'] = $this->deleteWithComputer;
        }
        if (null !== $this->device) {
            $res['device'] = $this->device;
        }
        if (null !== $this->enableAutoSnapshot) {
            $res['enable_auto_snapshot'] = $this->enableAutoSnapshot;
        }
        if (null !== $this->iaasId) {
            $res['iaas_id'] = $this->iaasId;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->imageId) {
            $res['image_id'] = $this->imageId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->portable) {
            $res['portable'] = $this->portable;
        }
        if (null !== $this->providerId) {
            $res['provider_id'] = $this->providerId;
        }
        if (null !== $this->regionId) {
            $res['region_id'] = $this->regionId;
        }
        if (null !== $this->size) {
            $res['size'] = $this->size;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
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
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->zoneId) {
            $res['zone_id'] = $this->zoneId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Disk
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['category'])) {
            $model->category = $map['category'];
        }
        if (isset($map['computer'])) {
            $model->computer = DiskComputer::fromMap($map['computer']);
        }
        if (isset($map['delete_auto_snapshot'])) {
            $model->deleteAutoSnapshot = $map['delete_auto_snapshot'];
        }
        if (isset($map['delete_with_computer'])) {
            $model->deleteWithComputer = $map['delete_with_computer'];
        }
        if (isset($map['device'])) {
            $model->device = $map['device'];
        }
        if (isset($map['enable_auto_snapshot'])) {
            $model->enableAutoSnapshot = $map['enable_auto_snapshot'];
        }
        if (isset($map['iaas_id'])) {
            $model->iaasId = $map['iaas_id'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['image_id'])) {
            $model->imageId = $map['image_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['portable'])) {
            $model->portable = $map['portable'];
        }
        if (isset($map['provider_id'])) {
            $model->providerId = $map['provider_id'];
        }
        if (isset($map['region_id'])) {
            $model->regionId = $map['region_id'];
        }
        if (isset($map['size'])) {
            $model->size = $map['size'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
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
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }
        if (isset($map['zone_id'])) {
            $model->zoneId = $map['zone_id'];
        }

        return $model;
    }
}
