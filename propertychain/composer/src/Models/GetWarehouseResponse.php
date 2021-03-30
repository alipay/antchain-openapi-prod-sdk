<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PROPERTYCHAIN\Models;

use AlibabaCloud\Tea\Model;

class GetWarehouseResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 地址
    /**
     * @var string
     */
    public $address;

    // 平面图
    /**
     * @var string
     */
    public $blueprintUrl;

    // 所在国家
    /**
     * @var string
     */
    public $country;

    // 设备数量
    /**
     * @var int
     */
    public $deviceNum;

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

    // 智能版本
    /**
     * @var string
     */
    public $smartLevel;

    // 仓位数量
    /**
     * @var int
     */
    public $stockPositionNum;

    // version
    /**
     * @var string
     */
    public $version;

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
        'reqMsgId'         => 'req_msg_id',
        'resultCode'       => 'result_code',
        'resultMsg'        => 'result_msg',
        'address'          => 'address',
        'blueprintUrl'     => 'blueprint_url',
        'country'          => 'country',
        'deviceNum'        => 'device_num',
        'extraInfo'        => 'extra_info',
        'latitude'         => 'latitude',
        'longitude'        => 'longitude',
        'smartLevel'       => 'smart_level',
        'stockPositionNum' => 'stock_position_num',
        'version'          => 'version',
        'warehouseArea'    => 'warehouse_area',
        'warehouseHeight'  => 'warehouse_height',
        'warehouseId'      => 'warehouse_id',
        'warehouseName'    => 'warehouse_name',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
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
     * @return GetWarehouseResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
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
