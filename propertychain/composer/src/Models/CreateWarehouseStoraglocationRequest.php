<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PROPERTYCHAIN\Models;

use AlibabaCloud\Tea\Model;

class CreateWarehouseStoraglocationRequest extends Model
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

    // 是否禁用智能监管
    /**
     * @var bool
     */
    public $disableSurv;

    // 其他信息
    /**
     * @var string
     */
    public $extraInfo;

    // 库位名称
    /**
     * @var string
     */
    public $name;

    // 货物类型【DANGER：危险品，NON_DANGER：非危险品，FOOD：食品】
    /**
     * @var string
     */
    public $productType;

    // 状态【AVAILABLE：可用，IN_USE：使用中，IN_CONFIG：配置中，DELETED：已删除】
    /**
     * @var string
     */
    public $status;

    // 仓位面积
    /**
     * @var string
     */
    public $storageLocationArea;

    // 仓位高度
    /**
     * @var string
     */
    public $storageLocationHeight;

    // 库位类型【CHILL：冷藏，FREEZE：冷冻，PASSAGE：通道，FLAT：平面， STEREO：立体】
    /**
     * @var string
     */
    public $type;

    // 仓位虚拟id
    /**
     * @var string
     */
    public $virtualStorageLocationId;

    // 仓库id
    /**
     * @var string
     */
    public $warehouseId;
    protected $_name = [
        'authToken'                => 'auth_token',
        'productInstanceId'        => 'product_instance_id',
        'disableSurv'              => 'disable_surv',
        'extraInfo'                => 'extra_info',
        'name'                     => 'name',
        'productType'              => 'product_type',
        'status'                   => 'status',
        'storageLocationArea'      => 'storage_location_area',
        'storageLocationHeight'    => 'storage_location_height',
        'type'                     => 'type',
        'virtualStorageLocationId' => 'virtual_storage_location_id',
        'warehouseId'              => 'warehouse_id',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('productType', $this->productType, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('storageLocationArea', $this->storageLocationArea, true);
        Model::validateRequired('storageLocationHeight', $this->storageLocationHeight, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('virtualStorageLocationId', $this->virtualStorageLocationId, true);
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
        if (null !== $this->disableSurv) {
            $res['disable_surv'] = $this->disableSurv;
        }
        if (null !== $this->extraInfo) {
            $res['extra_info'] = $this->extraInfo;
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
        if (null !== $this->virtualStorageLocationId) {
            $res['virtual_storage_location_id'] = $this->virtualStorageLocationId;
        }
        if (null !== $this->warehouseId) {
            $res['warehouse_id'] = $this->warehouseId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateWarehouseStoraglocationRequest
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
        if (isset($map['disable_surv'])) {
            $model->disableSurv = $map['disable_surv'];
        }
        if (isset($map['extra_info'])) {
            $model->extraInfo = $map['extra_info'];
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
        if (isset($map['virtual_storage_location_id'])) {
            $model->virtualStorageLocationId = $map['virtual_storage_location_id'];
        }
        if (isset($map['warehouse_id'])) {
            $model->warehouseId = $map['warehouse_id'];
        }

        return $model;
    }
}
