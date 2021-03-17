<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class Location extends Model
{
    // 所在城市
    /**
     * @example 杭州
     *
     * @var string
     */
    public $city;

    // 使用设备的IMEI号
    /**
     * @example 359426002899056
     *
     * @var string
     */
    public $imei;

    // 使用设备的IMSI号
    /**
     * @example 460001357924680
     *
     * @var string
     */
    public $imsi;

    // 使用设备的IP地址
    /**
     * @example 0.0.0.0
     *
     * @var string
     */
    public $ip;

    // 纬度
    /**
     * @example 66.33
     *
     * @var string
     */
    public $latitude;

    // 经度
    /**
     * @example 23.26
     *
     * @var string
     */
    public $longitude;

    // 使用设备的Wi-Fi物理地址
    /**
     * @example 00-01-6C-06-A6-29
     *
     * @var string
     */
    public $macAddr;

    // 扩展属性
    /**
     * @example {"key":"value"}
     *
     * @var string
     */
    public $properties;
    protected $_name = [
        'city'       => 'city',
        'imei'       => 'imei',
        'imsi'       => 'imsi',
        'ip'         => 'ip',
        'latitude'   => 'latitude',
        'longitude'  => 'longitude',
        'macAddr'    => 'mac_addr',
        'properties' => 'properties',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->city) {
            $res['city'] = $this->city;
        }
        if (null !== $this->imei) {
            $res['imei'] = $this->imei;
        }
        if (null !== $this->imsi) {
            $res['imsi'] = $this->imsi;
        }
        if (null !== $this->ip) {
            $res['ip'] = $this->ip;
        }
        if (null !== $this->latitude) {
            $res['latitude'] = $this->latitude;
        }
        if (null !== $this->longitude) {
            $res['longitude'] = $this->longitude;
        }
        if (null !== $this->macAddr) {
            $res['mac_addr'] = $this->macAddr;
        }
        if (null !== $this->properties) {
            $res['properties'] = $this->properties;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Location
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['city'])) {
            $model->city = $map['city'];
        }
        if (isset($map['imei'])) {
            $model->imei = $map['imei'];
        }
        if (isset($map['imsi'])) {
            $model->imsi = $map['imsi'];
        }
        if (isset($map['ip'])) {
            $model->ip = $map['ip'];
        }
        if (isset($map['latitude'])) {
            $model->latitude = $map['latitude'];
        }
        if (isset($map['longitude'])) {
            $model->longitude = $map['longitude'];
        }
        if (isset($map['mac_addr'])) {
            $model->macAddr = $map['mac_addr'];
        }
        if (isset($map['properties'])) {
            $model->properties = $map['properties'];
        }

        return $model;
    }
}
