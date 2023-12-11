<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class DciUserAddressInfo extends Model
{
    // 所在国家
    /**
     * @example 所在国家
     *
     * @var string
     */
    public $country;

    // 所在省份
    /**
     * @example 所在省份
     *
     * @var string
     */
    public $province;

    // 所在城市
    /**
     * @example 所在城市
     *
     * @var string
     */
    public $city;

    // 识别出的地区
    /**
     * @example 识别出的地区
     *
     * @var string
     */
    public $district;

    // 识别出的街道
    /**
     * @example 识别出的街道
     *
     * @var string
     */
    public $town;

    // 识别出的路
    /**
     * @example 识别出的路
     *
     * @var string
     */
    public $road;

    // 识别出的路号牌
    /**
     * @example 识别出的路号牌
     *
     * @var string
     */
    public $roadNo;

    // 地址详情
    /**
     * @example 地址详情
     *
     * @var string
     */
    public $addressDetail;
    protected $_name = [
        'country'       => 'country',
        'province'      => 'province',
        'city'          => 'city',
        'district'      => 'district',
        'town'          => 'town',
        'road'          => 'road',
        'roadNo'        => 'road_no',
        'addressDetail' => 'address_detail',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->country) {
            $res['country'] = $this->country;
        }
        if (null !== $this->province) {
            $res['province'] = $this->province;
        }
        if (null !== $this->city) {
            $res['city'] = $this->city;
        }
        if (null !== $this->district) {
            $res['district'] = $this->district;
        }
        if (null !== $this->town) {
            $res['town'] = $this->town;
        }
        if (null !== $this->road) {
            $res['road'] = $this->road;
        }
        if (null !== $this->roadNo) {
            $res['road_no'] = $this->roadNo;
        }
        if (null !== $this->addressDetail) {
            $res['address_detail'] = $this->addressDetail;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DciUserAddressInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['country'])) {
            $model->country = $map['country'];
        }
        if (isset($map['province'])) {
            $model->province = $map['province'];
        }
        if (isset($map['city'])) {
            $model->city = $map['city'];
        }
        if (isset($map['district'])) {
            $model->district = $map['district'];
        }
        if (isset($map['town'])) {
            $model->town = $map['town'];
        }
        if (isset($map['road'])) {
            $model->road = $map['road'];
        }
        if (isset($map['road_no'])) {
            $model->roadNo = $map['road_no'];
        }
        if (isset($map['address_detail'])) {
            $model->addressDetail = $map['address_detail'];
        }

        return $model;
    }
}
