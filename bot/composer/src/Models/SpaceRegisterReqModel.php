<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class SpaceRegisterReqModel extends Model
{
    // 面积 平方米单位*1e4
    /**
     * @example 10000
     *
     * @var int
     */
    public $area;

    // 自定义业务类型，例如选择：危险品/非危险品/食品
    /**
     * @example "biz_type"
     *
     * @var string
     */
    public $bizType;

    // 海拔 米单位*1e2
    /**
     * @example 0
     *
     * @var int
     */
    public $elevation;

    // 高度 米单位*1e2
    /**
     * @example 123
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

    // 自定义其他字段
    /**
     * @example "自定义"
     *
     * @var string
     */
    public $otherInfo;

    // 父类型，在业务中自定义关联，例如仓位的父节点是仓库
    /**
     * @example “did:iot:xxxx”
     *
     * @var string
     */
    public $parentDid;

    // 可填入符合w3c did定义的服务节点
    /**
     * @example "xxxx"
     *
     * @var string
     */
    public $serviceEndpoint;

    // 空间状态，自定义
    /**
     * @example "IN_USE"
     *
     * @var string
     */
    public $status;

    // 空间类型，例如冷藏/冷冻/通道/平面/立体
    /**
     * @example “平面“
     *
     * @var string
     */
    public $type;
    protected $_name = [
        'area'            => 'area',
        'bizType'         => 'biz_type',
        'elevation'       => 'elevation',
        'height'          => 'height',
        'latitude'        => 'latitude',
        'longitude'       => 'longitude',
        'otherInfo'       => 'other_info',
        'parentDid'       => 'parent_did',
        'serviceEndpoint' => 'service_endpoint',
        'status'          => 'status',
        'type'            => 'type',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->area) {
            $res['area'] = $this->area;
        }
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
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
        if (null !== $this->otherInfo) {
            $res['other_info'] = $this->otherInfo;
        }
        if (null !== $this->parentDid) {
            $res['parent_did'] = $this->parentDid;
        }
        if (null !== $this->serviceEndpoint) {
            $res['service_endpoint'] = $this->serviceEndpoint;
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
     * @return SpaceRegisterReqModel
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['area'])) {
            $model->area = $map['area'];
        }
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
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
        if (isset($map['other_info'])) {
            $model->otherInfo = $map['other_info'];
        }
        if (isset($map['parent_did'])) {
            $model->parentDid = $map['parent_did'];
        }
        if (isset($map['service_endpoint'])) {
            $model->serviceEndpoint = $map['service_endpoint'];
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
