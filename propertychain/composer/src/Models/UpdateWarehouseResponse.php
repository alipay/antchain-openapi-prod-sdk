<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PROPERTYCHAIN\Models;

use AlibabaCloud\Tea\Model;

class UpdateWarehouseResponse extends Model
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

    // 经纬度
    /**
     * @var string
     */
    public $location;

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

    // 仓库名称
    /**
     * @var string
     */
    public $warehouseName;
    protected $_name = [
        'reqMsgId'      => 'req_msg_id',
        'resultCode'    => 'result_code',
        'resultMsg'     => 'result_msg',
        'address'       => 'address',
        'blueprintId'   => 'blueprint_id',
        'country'       => 'country',
        'extraInfo'     => 'extra_info',
        'location'      => 'location',
        'warehouseArea' => 'warehouse_area',
        'warehouseId'   => 'warehouse_id',
        'warehouseName' => 'warehouse_name',
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
        if (null !== $this->blueprintId) {
            $res['blueprint_id'] = $this->blueprintId;
        }
        if (null !== $this->country) {
            $res['country'] = $this->country;
        }
        if (null !== $this->extraInfo) {
            $res['extra_info'] = $this->extraInfo;
        }
        if (null !== $this->location) {
            $res['location'] = $this->location;
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
     * @return UpdateWarehouseResponse
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
        if (isset($map['blueprint_id'])) {
            $model->blueprintId = $map['blueprint_id'];
        }
        if (isset($map['country'])) {
            $model->country = $map['country'];
        }
        if (isset($map['extra_info'])) {
            $model->extraInfo = $map['extra_info'];
        }
        if (isset($map['location'])) {
            $model->location = $map['location'];
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
