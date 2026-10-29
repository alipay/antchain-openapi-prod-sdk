<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class LiveInfo extends Model {
    protected $_name = [
        'liveProvince' => 'live_province',
        'liveCity' => 'live_city',
        'liveArea' => 'live_area',
        'liveStreet' => 'live_street',
        'liveAddress' => 'live_address',
        'liveYears' => 'live_years',
        'liveProvinceCode' => 'live_province_code',
        'liveCityCode' => 'live_city_code',
        'liveAreaCode' => 'live_area_code',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->liveProvince) {
            $res['live_province'] = $this->liveProvince;
        }
        if (null !== $this->liveCity) {
            $res['live_city'] = $this->liveCity;
        }
        if (null !== $this->liveArea) {
            $res['live_area'] = $this->liveArea;
        }
        if (null !== $this->liveStreet) {
            $res['live_street'] = $this->liveStreet;
        }
        if (null !== $this->liveAddress) {
            $res['live_address'] = $this->liveAddress;
        }
        if (null !== $this->liveYears) {
            $res['live_years'] = $this->liveYears;
        }
        if (null !== $this->liveProvinceCode) {
            $res['live_province_code'] = $this->liveProvinceCode;
        }
        if (null !== $this->liveCityCode) {
            $res['live_city_code'] = $this->liveCityCode;
        }
        if (null !== $this->liveAreaCode) {
            $res['live_area_code'] = $this->liveAreaCode;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return LiveInfo
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['live_province'])){
            $model->liveProvince = $map['live_province'];
        }
        if(isset($map['live_city'])){
            $model->liveCity = $map['live_city'];
        }
        if(isset($map['live_area'])){
            $model->liveArea = $map['live_area'];
        }
        if(isset($map['live_street'])){
            $model->liveStreet = $map['live_street'];
        }
        if(isset($map['live_address'])){
            $model->liveAddress = $map['live_address'];
        }
        if(isset($map['live_years'])){
            $model->liveYears = $map['live_years'];
        }
        if(isset($map['live_province_code'])){
            $model->liveProvinceCode = $map['live_province_code'];
        }
        if(isset($map['live_city_code'])){
            $model->liveCityCode = $map['live_city_code'];
        }
        if(isset($map['live_area_code'])){
            $model->liveAreaCode = $map['live_area_code'];
        }
        return $model;
    }
    // 居住省份
    /**
     * @example 居住省份
     * @var string
     */
    public $liveProvince;

    // 居住城市
    /**
     * @example 居住城市
     * @var string
     */
    public $liveCity;

    // 居住区域
    /**
     * @example 居住区域
     * @var string
     */
    public $liveArea;

    // 居住街道
    /**
     * @example 居住街道
     * @var string
     */
    public $liveStreet;

    // 居住详细地址
    /**
     * @example 居住详细地址
     * @var string
     */
    public $liveAddress;

    // 居住年限
    /**
     * @example 居住年限
     * @var int
     */
    public $liveYears;

    // 居住省份编码
    /**
     * @example 
     * @var string
     */
    public $liveProvinceCode;

    // 居住城市编码
    /**
     * @example 
     * @var string
     */
    public $liveCityCode;

    // 居住区域编码
    /**
     * @example 
     * @var string
     */
    public $liveAreaCode;

}
