<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PROPERTYCHAIN\Models;

use AlibabaCloud\Tea\Model;

class UpdateWarehouseStoragelocationRequest extends Model
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

    // 其他信息
    /**
     * @var string
     */
    public $extraInfo;

    // 仓位id
    /**
     * @var string
     */
    public $id;

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
    protected $_name = [
        'authToken'             => 'auth_token',
        'productInstanceId'     => 'product_instance_id',
        'extraInfo'             => 'extra_info',
        'id'                    => 'id',
        'productType'           => 'product_type',
        'status'                => 'status',
        'storageLocationArea'   => 'storage_location_area',
        'storageLocationHeight' => 'storage_location_height',
        'type'                  => 'type',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('productType', $this->productType, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('storageLocationArea', $this->storageLocationArea, true);
        Model::validateRequired('storageLocationHeight', $this->storageLocationHeight, true);
        Model::validateRequired('type', $this->type, true);
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
        if (null !== $this->extraInfo) {
            $res['extra_info'] = $this->extraInfo;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateWarehouseStoragelocationRequest
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
        if (isset($map['extra_info'])) {
            $model->extraInfo = $map['extra_info'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
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

        return $model;
    }
}
