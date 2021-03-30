<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PROPERTYCHAIN\Models;

use AlibabaCloud\Tea\Model;

class StorageLocation extends Model
{
    // 仓位容量
    /**
     * @example capacity
     *
     * @var string
     */
    public $capacity;

    // 设备id
    /**
     * @example deviceIdList
     *
     * @var string[]
     */
    public $deviceIdList;

    // 其他信息
    /**
     * @example extraInfo
     *
     * @var string
     */
    public $extraInfo;

    // 库位id
    /**
     * @example id
     *
     * @var string
     */
    public $id;

    // 监控等级【VIDEOREGULATORY：视频监控】
    /**
     * @example VIDEOREGULATORY
     *
     * @var string
     */
    public $monitorCapacity;

    // 监控水平【STANDARD：标准版，UPGRADED：升级版】
    /**
     * @example STANDARD
     *
     * @var string
     */
    public $monitorLevel;

    // 库位名称
    /**
     * @example name
     *
     * @var string
     */
    public $name;

    // 货物类型【DANGER：危险品，NON_DANGER：非危险品，FOOD：食品】
    //
    /**
     * @example DANGER
     *
     * @var string
     */
    public $productType;

    // 状态【AVAILABLE：可用，IN_USE：使用中，IN_CONFIG：配置中，DELETED：已删除】
    /**
     * @example AVAILABLE
     *
     * @var string
     */
    public $status;

    // 仓位面积
    /**
     * @example storageLocationArea
     *
     * @var string
     */
    public $storageLocationArea;

    // 仓位高度
    /**
     * @example storageLocationHeight
     *
     * @var string
     */
    public $storageLocationHeight;

    // 库位类型【CHILL：冷藏，FREEZE：冷冻，PASSAGE：通道，FLAT：平面， STEREO：立体】
    /**
     * @example CHILL
     *
     * @var string
     */
    public $type;

    // 已用容量
    /**
     * @example usedCapacity
     *
     * @var string
     */
    public $usedCapacity;

    // 库位虚拟id
    /**
     * @example virtualId
     *
     * @var string
     */
    public $virtualId;

    // 仓库Id
    /**
     * @example warehouseId
     *
     * @var string
     */
    public $warehouseId;

    // 关联仓单Id
    /**
     * @example warehouseReceiptId
     *
     * @var string
     */
    public $warehouseReceiptId;
    protected $_name = [
        'capacity'              => 'capacity',
        'deviceIdList'          => 'device_id_list',
        'extraInfo'             => 'extra_info',
        'id'                    => 'id',
        'monitorCapacity'       => 'monitor_capacity',
        'monitorLevel'          => 'monitor_level',
        'name'                  => 'name',
        'productType'           => 'product_type',
        'status'                => 'status',
        'storageLocationArea'   => 'storage_location_area',
        'storageLocationHeight' => 'storage_location_height',
        'type'                  => 'type',
        'usedCapacity'          => 'used_capacity',
        'virtualId'             => 'virtual_id',
        'warehouseId'           => 'warehouse_id',
        'warehouseReceiptId'    => 'warehouse_receipt_id',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->capacity) {
            $res['capacity'] = $this->capacity;
        }
        if (null !== $this->deviceIdList) {
            $res['device_id_list'] = $this->deviceIdList;
        }
        if (null !== $this->extraInfo) {
            $res['extra_info'] = $this->extraInfo;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->monitorCapacity) {
            $res['monitor_capacity'] = $this->monitorCapacity;
        }
        if (null !== $this->monitorLevel) {
            $res['monitor_level'] = $this->monitorLevel;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->productType) {
            $res['product_type'] = $this->productType;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->storageLocationArea) {
            $res['storage_location_area'] = $this->storageLocationArea;
        }
        if (null !== $this->storageLocationHeight) {
            $res['storage_location_height'] = $this->storageLocationHeight;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->usedCapacity) {
            $res['used_capacity'] = $this->usedCapacity;
        }
        if (null !== $this->virtualId) {
            $res['virtual_id'] = $this->virtualId;
        }
        if (null !== $this->warehouseId) {
            $res['warehouse_id'] = $this->warehouseId;
        }
        if (null !== $this->warehouseReceiptId) {
            $res['warehouse_receipt_id'] = $this->warehouseReceiptId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StorageLocation
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['capacity'])) {
            $model->capacity = $map['capacity'];
        }
        if (isset($map['device_id_list'])) {
            if (!empty($map['device_id_list'])) {
                $model->deviceIdList = $map['device_id_list'];
            }
        }
        if (isset($map['extra_info'])) {
            $model->extraInfo = $map['extra_info'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['monitor_capacity'])) {
            $model->monitorCapacity = $map['monitor_capacity'];
        }
        if (isset($map['monitor_level'])) {
            $model->monitorLevel = $map['monitor_level'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['product_type'])) {
            $model->productType = $map['product_type'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['storage_location_area'])) {
            $model->storageLocationArea = $map['storage_location_area'];
        }
        if (isset($map['storage_location_height'])) {
            $model->storageLocationHeight = $map['storage_location_height'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['used_capacity'])) {
            $model->usedCapacity = $map['used_capacity'];
        }
        if (isset($map['virtual_id'])) {
            $model->virtualId = $map['virtual_id'];
        }
        if (isset($map['warehouse_id'])) {
            $model->warehouseId = $map['warehouse_id'];
        }
        if (isset($map['warehouse_receipt_id'])) {
            $model->warehouseReceiptId = $map['warehouse_receipt_id'];
        }

        return $model;
    }
}
