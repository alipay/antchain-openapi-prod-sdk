<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class DeviceLocationInfo extends Model {
    protected $_name = [
        'lat' => 'lat',
        'lng' => 'lng',
        'locationTime' => 'location_time',
        'extraInfo' => 'extra_info',
    ];
    public function validate() {
        Model::validateRequired('lat', $this->lat, true);
        Model::validateRequired('lng', $this->lng, true);
        Model::validateRequired('locationTime', $this->locationTime, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->lat) {
            $res['lat'] = $this->lat;
        }
        if (null !== $this->lng) {
            $res['lng'] = $this->lng;
        }
        if (null !== $this->locationTime) {
            $res['location_time'] = $this->locationTime;
        }
        if (null !== $this->extraInfo) {
            $res['extra_info'] = $this->extraInfo;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return DeviceLocationInfo
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['lat'])){
            $model->lat = $map['lat'];
        }
        if(isset($map['lng'])){
            $model->lng = $map['lng'];
        }
        if(isset($map['location_time'])){
            $model->locationTime = $map['location_time'];
        }
        if(isset($map['extra_info'])){
            $model->extraInfo = $map['extra_info'];
        }
        return $model;
    }
    // 纬度
    /**
     * @example 30.288701
     * @var string
     */
    public $lat;

    // 经度
    /**
     * @example 120.160256
     * @var string
     */
    public $lng;

    // 最后一次定位上报时间
    /**
     * @example 2026-10-13 10:00:00
     * @var string
     */
    public $locationTime;

    // 预留可扩展字段json
    /**
     * @example 
     * @var string
     */
    public $extraInfo;

}
