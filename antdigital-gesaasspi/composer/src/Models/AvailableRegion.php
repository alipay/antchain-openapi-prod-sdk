<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\GESAASSPI\Models;

use AlibabaCloud\Tea\Model;

class AvailableRegion extends Model
{
    // 【类型】 消费金可用地域的类型，COUNTRY表示国家级别可用，PROVINCE表示省级可用，CITY表示市级可用，DISTRICT表示区级可用。
    // 可选取值
    // PROVINCE:  地域信息精确到省级
    // CITY:  地域信息精确到市级
    // DISTRICT:  地域信息精确到区级
    // COUNTRY:  地域信息精确到国家级
    /**
     * @example PROVINCE
     *
     * @var string
     */
    public $type;

    // 【省】 消费金可用省
    /**
     * @example 广东省
     *
     * @var string
     */
    public $province;

    // 【市】 消费金可用
    /**
     * @example 深圳市
     *
     * @var string
     */
    public $city;

    // 【区】 消费金可用区
    /**
     * @example 南山区
     *
     * @var string
     */
    public $district;

    // 【国家】 消费金可用国家
    /**
     * @example 中国大陆
     *
     * @var string
     */
    public $country;
    protected $_name = [
        'type'     => 'type',
        'province' => 'province',
        'city'     => 'city',
        'district' => 'district',
        'country'  => 'country',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->type) {
            $res['type'] = $this->type;
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
        if (null !== $this->country) {
            $res['country'] = $this->country;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AvailableRegion
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['type'])) {
            $model->type = $map['type'];
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
        if (isset($map['country'])) {
            $model->country = $map['country'];
        }

        return $model;
    }
}
