<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PROPERTYCHAIN\Models;

use AlibabaCloud\Tea\Model;

class WarehouseInfo extends Model
{
    // 地址
    /**
     * @example 地址
     *
     * @var string
     */
    public $address;

    // 平面图
    /**
     * @example 1
     *
     * @var string
     */
    public $blueprintUrl;

    // 所在国家
    /**
     * @example China
     *
     * @var string
     */
    public $country;

    // 设备数量
    /**
     * @example 100
     *
     * @var int
     */
    public $deviceNum;

    // 其他信息
    /**
     * @example 其他信息
     *
     * @var string
     */
    public $extraInfo;

    // 纬度
    /**
     * @example 25.65
     *
     * @var string
     */
    public $latitude;

    // 经度
    /**
     * @example 125.45
     *
     * @var string
     */
    public $longitude;

    // 智能版本
    /**
     * @example 1.0.0
     *
     * @var string
     */
    public $smartLevel;

    // 仓库状态
    /**
     * @example 1
     *
     * @var string
     */
    public $status;

    // 仓位数量
    /**
     * @example 100
     *
     * @var int
     */
    public $stockPositionNum;

    // 版本信息
    /**
     * @example 1.0.0
     *
     * @var string
     */
    public $version;

    // 仓库面积
    /**
     * @example 100
     *
     * @var string
     */
    public $warehouseArea;

    // 仓库高度
    /**
     * @example 10
     *
     * @var string
     */
    public $warehouseHeight;

    // 仓库Id
    /**
     * @example 5676989
     *
     * @var string
     */
    public $warehouseId;

    // 仓库名称
    /**
     * @example 仓库名称
     *
     * @var string
     */
    public $warehouseName;
    protected $_name = [
        'address'          => 'address',
        'blueprintUrl'     => 'blueprint_url',
        'country'          => 'country',
        'deviceNum'        => 'device_num',
        'extraInfo'        => 'extra_info',
        'latitude'         => 'latitude',
        'longitude'        => 'longitude',
        'smartLevel'       => 'smart_level',
        'status'           => 'status',
        'stockPositionNum' => 'stock_position_num',
        'version'          => 'version',
        'warehouseArea'    => 'warehouse_area',
        'warehouseHeight'  => 'warehouse_height',
        'warehouseId'      => 'warehouse_id',
        'warehouseName'    => 'warehouse_name',
    ];

    public function validate()
    {
        Model::validateRequired('address', $this->address, true);
        Model::validateRequired('blueprintUrl', $this->blueprintUrl, true);
        Model::validateRequired('country', $this->country, true);
        Model::validateRequired('deviceNum', $this->deviceNum, true);
        Model::validateRequired('latitude', $this->latitude, true);
        Model::validateRequired('longitude', $this->longitude, true);
        Model::validateRequired('smartLevel', $this->smartLevel, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('stockPositionNum', $this->stockPositionNum, true);
        Model::validateRequired('version', $this->version, true);
        Model::validateRequired('warehouseArea', $this->warehouseArea, true);
        Model::validateRequired('warehouseHeight', $this->warehouseHeight, true);
        Model::validateRequired('warehouseId', $this->warehouseId, true);
        Model::validateRequired('warehouseName', $this->warehouseName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->address) {
            $res['address'] = $this->address;
        }
        if (null !== $this->blueprintUrl) {
            $res['blueprint_url'] = $this->blueprintUrl;
        }
        if (null !== $this->country) {
            $res['country'] = $this->country;
        }
        if (null !== $this->deviceNum) {
            $res['device_num'] = $this->deviceNum;
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
        if (null !== $this->smartLevel) {
            $res['smart_level'] = $this->smartLevel;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->stockPositionNum) {
            $res['stock_position_num'] = $this->stockPositionNum;
        }
        if (null !== $this->version) {
            $res['version'] = $this->version;
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
     * @return WarehouseInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['address'])) {
            $model->address = $map['address'];
        }
        if (isset($map['blueprint_url'])) {
            $model->blueprintUrl = $map['blueprint_url'];
        }
        if (isset($map['country'])) {
            $model->country = $map['country'];
        }
        if (isset($map['device_num'])) {
            $model->deviceNum = $map['device_num'];
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
        if (isset($map['smart_level'])) {
            $model->smartLevel = $map['smart_level'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['stock_position_num'])) {
            $model->stockPositionNum = $map['stock_position_num'];
        }
        if (isset($map['version'])) {
            $model->version = $map['version'];
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
