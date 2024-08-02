<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SDS\Models;

use AlibabaCloud\Tea\Model;

class Address extends Model
{
    // 市级
    /**
     * @example 110100
     *
     * @var string
     */
    public $city;

    // 区、县级
    /**
     * @example 110101
     *
     * @var string
     */
    public $district;
    protected $_name = [
        'city'     => 'city',
        'district' => 'district',
    ];

    public function validate()
    {
        Model::validateRequired('city', $this->city, true);
        Model::validateMaxLength('city', $this->city, 6);
        Model::validateMaxLength('district', $this->district, 6);
        Model::validateMinLength('city', $this->city, 6);
        Model::validateMinLength('district', $this->district, 6);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->city) {
            $res['city'] = $this->city;
        }
        if (null !== $this->district) {
            $res['district'] = $this->district;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Address
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['city'])) {
            $model->city = $map['city'];
        }
        if (isset($map['district'])) {
            $model->district = $map['district'];
        }

        return $model;
    }
}
