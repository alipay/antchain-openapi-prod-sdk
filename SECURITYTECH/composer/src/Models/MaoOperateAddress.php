<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

use AntChain\SECURITYTECH\Models\MaoDistrictCode;

class MaoOperateAddress extends Model {
    protected $_name = [
        'province' => 'province',
        'city' => 'city',
        'district' => 'district',
        'address' => 'address',
        'longitude' => 'longitude',
        'latitude' => 'latitude',
    ];
    public function validate() {
        Model::validateRequired('province', $this->province, true);
        Model::validateRequired('city', $this->city, true);
        Model::validateRequired('district', $this->district, true);
        Model::validateRequired('address', $this->address, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->province) {
            $res['province'] = null !== $this->province ? $this->province->toMap() : null;
        }
        if (null !== $this->city) {
            $res['city'] = null !== $this->city ? $this->city->toMap() : null;
        }
        if (null !== $this->district) {
            $res['district'] = null !== $this->district ? $this->district->toMap() : null;
        }
        if (null !== $this->address) {
            $res['address'] = $this->address;
        }
        if (null !== $this->longitude) {
            $res['longitude'] = $this->longitude;
        }
        if (null !== $this->latitude) {
            $res['latitude'] = $this->latitude;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return MaoOperateAddress
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['province'])){
            $model->province = MaoDistrictCode::fromMap($map['province']);
        }
        if(isset($map['city'])){
            $model->city = MaoDistrictCode::fromMap($map['city']);
        }
        if(isset($map['district'])){
            $model->district = MaoDistrictCode::fromMap($map['district']);
        }
        if(isset($map['address'])){
            $model->address = $map['address'];
        }
        if(isset($map['longitude'])){
            $model->longitude = $map['longitude'];
        }
        if(isset($map['latitude'])){
            $model->latitude = $map['latitude'];
        }
        return $model;
    }
    // 省
    /**
     * @example undefined
     * @var MaoDistrictCode
     */
    public $province;

    // 市
    /**
     * @example undefined
     * @var MaoDistrictCode
     */
    public $city;

    // 区
    /**
     * @example undefined
     * @var MaoDistrictCode
     */
    public $district;

    // 详细地址
    /**
     * @example 详细地址
     * @var string
     */
    public $address;

    // 经度
    /**
     * @example 经度
     * @var string
     */
    public $longitude;

    // 纬度
    /**
     * @example 纬度
     * @var string
     */
    public $latitude;

}
