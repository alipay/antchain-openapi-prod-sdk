<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PROPERTYCHAIN\Models;

use AlibabaCloud\Tea\Model;

class UpdateWarehouseRequest extends Model
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

    // 地址（传原值，不可修改此项）
    /**
     * @var string
     */
    public $address;

    // 平面图
    /**
     * @var string
     */
    public $blueprintId;

    // 所在国家（传原值，不可修改此项）
    /**
     * @var string
     */
    public $country;

    // 其他信息
    /**
     * @var string
     */
    public $extraInfo;

    // 仓库面积
    /**
     * @var string
     */
    public $warehouseArea;

    // 仓库id
    /**
     * @var string
     */
    public $warehouseId;

    // 仓库名称（传原值，不可修改此项）
    /**
     * @var string
     */
    public $warehouseName;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'address'           => 'address',
        'blueprintId'       => 'blueprint_id',
        'country'           => 'country',
        'extraInfo'         => 'extra_info',
        'warehouseArea'     => 'warehouse_area',
        'warehouseId'       => 'warehouse_id',
        'warehouseName'     => 'warehouse_name',
    ];

    public function validate()
    {
        Model::validateRequired('address', $this->address, true);
        Model::validateRequired('country', $this->country, true);
        Model::validateRequired('warehouseArea', $this->warehouseArea, true);
        Model::validateRequired('warehouseId', $this->warehouseId, true);
        Model::validateRequired('warehouseName', $this->warehouseName, true);
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
        if (null !== $this->address) {
            $res['address'] = $this->address;
        }
        if (null !== $this->blueprintId) {
            $res['blueprint_id'] = $this->blueprintId;
        }
        if (null !== $this->country) {
            $res['country'] = $this->country;
        }
        if (null !== $this->extraInfo) {
            $res['extra_info'] = $this->extraInfo;
        }
        if (null !== $this->warehouseArea) {
            $res['warehouse_area'] = $this->warehouseArea;
        }
        if (null !== $this->warehouseId) {
            $res['warehouse_id'] = $this->warehouseId;
        }
        if (null !== $this->warehouseName) {
            $res['warehouse_name'] = $this->warehouseName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateWarehouseRequest
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
        if (isset($map['address'])) {
            $model->address = $map['address'];
        }
        if (isset($map['blueprint_id'])) {
            $model->blueprintId = $map['blueprint_id'];
        }
        if (isset($map['country'])) {
            $model->country = $map['country'];
        }
        if (isset($map['extra_info'])) {
            $model->extraInfo = $map['extra_info'];
        }
        if (isset($map['warehouse_area'])) {
            $model->warehouseArea = $map['warehouse_area'];
        }
        if (isset($map['warehouse_id'])) {
            $model->warehouseId = $map['warehouse_id'];
        }
        if (isset($map['warehouse_name'])) {
            $model->warehouseName = $map['warehouse_name'];
        }

        return $model;
    }
}
