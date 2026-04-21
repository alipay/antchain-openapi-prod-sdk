<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AGORAX\Models;

use AlibabaCloud\Tea\Model;

class AddressInfo extends Model
{
    // 城市编码
    /**
     * @example 371000
     *
     * @var string
     */
    public $cityCode;

    // 区县编码
    /**
     * @example 371002
     *
     * @var string
     */
    public $districtCode;

    // 地址
    /**
     * @example 万塘路18号黄龙时代广场B座
     *
     * @var string
     */
    public $address;

    // 省份编码
    /**
     * @example 370000
     *
     * @var string
     */
    public $provinceCode;

    // 高德 poiid
    /**
     * @example B0FFIVU189
     *
     * @var string
     */
    public $poiid;

    // 经度
    /**
     * @example 120.760001
     *
     * @var string
     */
    public $longitude;

    // 纬度
    /**
     * @example 60.270001
     *
     * @var string
     */
    public $latitude;

    // 地址类型
    /**
     * @example BUSINESS_ADDRESS
     *
     * @var string
     */
    public $type;
    protected $_name = [
        'cityCode'     => 'city_code',
        'districtCode' => 'district_code',
        'address'      => 'address',
        'provinceCode' => 'province_code',
        'poiid'        => 'poiid',
        'longitude'    => 'longitude',
        'latitude'     => 'latitude',
        'type'         => 'type',
    ];

    public function validate()
    {
        Model::validateRequired('cityCode', $this->cityCode, true);
        Model::validateRequired('districtCode', $this->districtCode, true);
        Model::validateRequired('address', $this->address, true);
        Model::validateRequired('provinceCode', $this->provinceCode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->cityCode) {
            $res['city_code'] = $this->cityCode;
        }
        if (null !== $this->districtCode) {
            $res['district_code'] = $this->districtCode;
        }
        if (null !== $this->address) {
            $res['address'] = $this->address;
        }
        if (null !== $this->provinceCode) {
            $res['province_code'] = $this->provinceCode;
        }
        if (null !== $this->poiid) {
            $res['poiid'] = $this->poiid;
        }
        if (null !== $this->longitude) {
            $res['longitude'] = $this->longitude;
        }
        if (null !== $this->latitude) {
            $res['latitude'] = $this->latitude;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AddressInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['city_code'])) {
            $model->cityCode = $map['city_code'];
        }
        if (isset($map['district_code'])) {
            $model->districtCode = $map['district_code'];
        }
        if (isset($map['address'])) {
            $model->address = $map['address'];
        }
        if (isset($map['province_code'])) {
            $model->provinceCode = $map['province_code'];
        }
        if (isset($map['poiid'])) {
            $model->poiid = $map['poiid'];
        }
        if (isset($map['longitude'])) {
            $model->longitude = $map['longitude'];
        }
        if (isset($map['latitude'])) {
            $model->latitude = $map['latitude'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }

        return $model;
    }
}
