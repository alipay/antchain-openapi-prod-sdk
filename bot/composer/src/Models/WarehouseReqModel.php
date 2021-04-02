<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class WarehouseReqModel extends Model
{
    // 详细地址
    /**
     * @example 北京海淀区
     *
     * @var string
     */
    public $address;

    // 面积 平方米单位*1e4
    /**
     * @example 1000000
     *
     * @var int
     */
    public $area;

    // 海拔 米单位*1e2
    /**
     * @example 0
     *
     * @var int
     */
    public $elevation;

    // 仓库高度 米单位*1e2
    /**
     * @example 1000
     *
     * @var int
     */
    public $height;

    // 纬度 度数单位*1e9
    /**
     * @example 0
     *
     * @var int
     */
    public $latitude;

    // 经度 度数单位*1e9
    /**
     * @example 35000000000
     *
     * @var int
     */
    public $longitude;

    // 所在国家，中国
    /**
     * @example 中国
     *
     * @var string
     */
    public $nation;

    // 其他信息
    /**
     * @example "自定义"
     *
     * @var string
     */
    public $otherInfo;

    // 仓库状态, AVAILABLE, IN_USE, DELETED, 自定义
    /**
     * @example "AVAILABLE"
     *
     * @var string
     */
    public $status;

    // 仓库类型
    /**
     * @example "自定义"
     *
     * @var string
     */
    public $type;
    protected $_name = [
        'address'   => 'address',
        'area'      => 'area',
        'elevation' => 'elevation',
        'height'    => 'height',
        'latitude'  => 'latitude',
        'longitude' => 'longitude',
        'nation'    => 'nation',
        'otherInfo' => 'other_info',
        'status'    => 'status',
        'type'      => 'type',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->address) {
            $res['address'] = $this->address;
        }
        if (null !== $this->area) {
            $res['area'] = $this->area;
        }
        if (null !== $this->elevation) {
            $res['elevation'] = $this->elevation;
        }
        if (null !== $this->height) {
            $res['height'] = $this->height;
        }
        if (null !== $this->latitude) {
            $res['latitude'] = $this->latitude;
        }
        if (null !== $this->longitude) {
            $res['longitude'] = $this->longitude;
        }
        if (null !== $this->nation) {
            $res['nation'] = $this->nation;
        }
        if (null !== $this->otherInfo) {
            $res['other_info'] = $this->otherInfo;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return WarehouseReqModel
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['address'])) {
            $model->address = $map['address'];
        }
        if (isset($map['area'])) {
            $model->area = $map['area'];
        }
        if (isset($map['elevation'])) {
            $model->elevation = $map['elevation'];
        }
        if (isset($map['height'])) {
            $model->height = $map['height'];
        }
        if (isset($map['latitude'])) {
            $model->latitude = $map['latitude'];
        }
        if (isset($map['longitude'])) {
            $model->longitude = $map['longitude'];
        }
        if (isset($map['nation'])) {
            $model->nation = $map['nation'];
        }
        if (isset($map['other_info'])) {
            $model->otherInfo = $map['other_info'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }

        return $model;
    }
}
