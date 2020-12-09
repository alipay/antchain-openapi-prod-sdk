<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class LogisticLocation extends Model {
    protected $_name = [
        'address' => 'address',
        'cityCode' => 'city_code',
        'lat' => 'lat',
        'lon' => 'lon',
        'trackTime' => 'track_time',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->address) {
            $res['address'] = $this->address;
        }
        if (null !== $this->cityCode) {
            $res['city_code'] = $this->cityCode;
        }
        if (null !== $this->lat) {
            $res['lat'] = $this->lat;
        }
        if (null !== $this->lon) {
            $res['lon'] = $this->lon;
        }
        if (null !== $this->trackTime) {
            $res['track_time'] = $this->trackTime;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return LogisticLocation
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['address'])){
            $model->address = $map['address'];
        }
        if(isset($map['city_code'])){
            $model->cityCode = $map['city_code'];
        }
        if(isset($map['lat'])){
            $model->lat = $map['lat'];
        }
        if(isset($map['lon'])){
            $model->lon = $map['lon'];
        }
        if(isset($map['track_time'])){
            $model->trackTime = $map['track_time'];
        }
        return $model;
    }
    // 结构化地址信息,规则遵循：国家、省份、城市、区县、城镇、乡村、街道、门牌号码、屋邨、大厦
    /**
     * @example 北京市朝阳区阜通东大街6号 
     * @var string
     */
    public $address;

    // 行政区划代码
    /**
     * @example 110000
     * @var string
     */
    public $cityCode;

    // 纬度
    // 
    /**
     * @example 39.916527 
     * @var string
     */
    public $lat;

    // 经度
    /**
     * @example 116.397128 
     * @var string
     */
    public $lon;

    // 轨迹时间戳
    /**
     * @example 1566221266000
     * @var int
     */
    public $trackTime;

}
