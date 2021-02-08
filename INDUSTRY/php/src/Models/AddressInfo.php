<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\INDUSTRY\Models;

use AlibabaCloud\Tea\Model;

class AddressInfo extends Model {
    protected $_name = [
        'provinceCode' => 'province_code',
        'cityCode' => 'city_code',
        'districtCode' => 'district_code',
        'address' => 'address',
    ];
    public function validate() {
        Model::validateRequired('provinceCode', $this->provinceCode, true);
        Model::validateRequired('cityCode', $this->cityCode, true);
        Model::validateRequired('districtCode', $this->districtCode, true);
        Model::validateRequired('address', $this->address, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->provinceCode) {
            $res['province_code'] = $this->provinceCode;
        }
        if (null !== $this->cityCode) {
            $res['city_code'] = $this->cityCode;
        }
        if (null !== $this->districtCode) {
            $res['district_code'] = $this->districtCode;
        }
        if (null !== $this->address) {
            $res['address'] = $this->address;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return AddressInfo
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['province_code'])){
            $model->provinceCode = $map['province_code'];
        }
        if(isset($map['city_code'])){
            $model->cityCode = $map['city_code'];
        }
        if(isset($map['district_code'])){
            $model->districtCode = $map['district_code'];
        }
        if(isset($map['address'])){
            $model->address = $map['address'];
        }
        return $model;
    }
    // 省份编码
    /**
     * @example 370000
     * @var string
     */
    public $provinceCode;

    // 城市编码
    /**
     * @example 371000
     * @var string
     */
    public $cityCode;

    // 区域编码
    /**
     * @example 371002
     * @var string
     */
    public $districtCode;

    // 详细地址
    /**
     * @example 万塘路18号黄龙时代广场B座
     * @var string
     */
    public $address;

}
