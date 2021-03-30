<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PROPERTYCHAIN\Models;

use AlibabaCloud\Tea\Model;

class QueryWarehouseDeviceRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 设备状态[READY：未启用，STARTED：已启用，LOADING：信息待完善，DELETED：已注销，ALL：全部]
    /**
     * @var string
     */
    public $deviceFilter;

    // 仓位id
    /**
     * @var string
     */
    public $storageLocationId;

    // 仓库id
    /**
     * @var string
     */
    public $warehouseId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'deviceFilter'      => 'device_filter',
        'storageLocationId' => 'storage_location_id',
        'warehouseId'       => 'warehouse_id',
    ];

    public function validate()
    {
        Model::validateRequired('warehouseId', $this->warehouseId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->deviceFilter) {
            $res['device_filter'] = $this->deviceFilter;
        }
        if (null !== $this->storageLocationId) {
            $res['storage_location_id'] = $this->storageLocationId;
        }
        if (null !== $this->warehouseId) {
            $res['warehouse_id'] = $this->warehouseId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryWarehouseDeviceRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['device_filter'])) {
            $model->deviceFilter = $map['device_filter'];
        }
        if (isset($map['storage_location_id'])) {
            $model->storageLocationId = $map['storage_location_id'];
        }
        if (isset($map['warehouse_id'])) {
            $model->warehouseId = $map['warehouse_id'];
        }

        return $model;
    }
}
