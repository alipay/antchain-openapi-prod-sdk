<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

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

    // 操作IMEI
    /**
     * @example 359426002899056
     *
     * @var string
     */
    public $imei;

    // 操作IMSI
    /**
     * @example 460001357924680
     *
     * @var string
     */
    public $imsi;

    // 操作IP地址
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

    // 扩展属性
    /**
     * @example {"key":"value"}
     *
     * @var string
     */
    public $propertities;

    // 操作Wi-Fi物理地址
    /**
     * @example 00-01-6C-06-A6-29
     *
     * @var string
     */
    public $wifiMac;
    protected $_name = [
        'city'         => 'city',
        'imei'         => 'imei',
        'imsi'         => 'imsi',
        'ip'           => 'ip',
        'latitude'     => 'latitude',
        'longitude'    => 'longitude',
        'propertities' => 'propertities',
        'wifiMac'      => 'wifi_mac',
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
        if (null !== $this->propertities) {
            $res['propertities'] = $this->propertities;
        }
        if (null !== $this->wifiMac) {
            $res['wifi_mac'] = $this->wifiMac;
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
        if (isset($map['propertities'])) {
            $model->propertities = $map['propertities'];
        }
        if (isset($map['wifi_mac'])) {
            $model->wifiMac = $map['wifi_mac'];
        }

        return $model;
    }
}
