<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PROPERTYCHAIN\Models;

use AlibabaCloud\Tea\Model;

class CreateWarehouseRequest extends Model
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

    // 地址
    /**
     * @var string
     */
    public $address;

    // 平面图
    /**
     * @var string
     */
    public $blueprintId;

    // 所在国家
    /**
     * @var string
     */
    public $country;

    // 其他信息
    /**
     * @var string
     */
    public $extraInfo;

    // 纬度
    /**
     * @var string
     */
    public $latitude;

    // 经度
    /**
     * @var string
     */
    public $longitude;

    // 仓库面积
    /**
     * @var string
     */
    public $warehouseArea;

    // 仓库高度
    /**
     * @var string
     */
    public $warehouseHeight;

    // 仓库id
    /**
     * @var string
     */
    public $warehouseId;

    // 仓库名称
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
        'latitude'          => 'latitude',
        'longitude'         => 'longitude',
        'warehouseArea'     => 'warehouse_area',
        'warehouseHeight'   => 'warehouse_height',
        'warehouseId'       => 'warehouse_id',
        'warehouseName'     => 'warehouse_name',
    ];

    public function validate()
    {
        Model::validateRequired('address', $this->address, true);
        Model::validateRequired('country', $this->country, true);
        Model::validateRequired('latitude', $this->latitude, true);
        Model::validateRequired('longitude', $this->longitude, true);
        Model::validateRequired('warehouseArea', $this->warehouseArea, true);
        Model::validateRequired('warehouseId', $this->warehouseId, true);
        Model::validateRequired('warehouseName', $this->warehouseName, true);
        Model::validateMaxLength('warehouseId', $this->warehouseId, 255);
        Model::validateMaxLength('warehouseName', $this->warehouseName, 255);
        Model::validateMinLength('warehouseId', $this->warehouseId, 1);
        Model::validateMinLength('warehouseName', $this->warehouseName, 1);
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
        if (null !== $this->latitude) {
            $res['latitude'] = $this->latitude;
        }
        if (null !== $this->longitude) {
            $res['longitude'] = $this->longitude;
        }
        if (null !== $this->warehouseArea) {
            $res['warehouse_area'] = $this->warehouseArea;
        }
        if (null !== $this->warehouseHeight) {
            $res['warehouse_height'] = $this->warehouseHeight;
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
     * @return CreateWarehouseRequest
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
        if (isset($map['latitude'])) {
            $model->latitude = $map['latitude'];
        }
        if (isset($map['longitude'])) {
            $model->longitude = $map['longitude'];
        }
        if (isset($map['warehouse_area'])) {
            $model->warehouseArea = $map['warehouse_area'];
        }
        if (isset($map['warehouse_height'])) {
            $model->warehouseHeight = $map['warehouse_height'];
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
