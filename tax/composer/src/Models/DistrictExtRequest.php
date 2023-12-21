<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAX\Models;

use AlibabaCloud\Tea\Model;

class DistrictExtRequest extends Model
{
    // 地区编码
    /**
     * @example 340909
     *
     * @var string
     */
    public $cityCode;

    // 省或者直辖市代码
    /**
     * @example 340000
     *
     * @var string
     */
    public $provCode;
    protected $_name = [
        'cityCode' => 'city_code',
        'provCode' => 'prov_code',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->cityCode) {
            $res['city_code'] = $this->cityCode;
        }
        if (null !== $this->provCode) {
            $res['prov_code'] = $this->provCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DistrictExtRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['city_code'])) {
            $model->cityCode = $map['city_code'];
        }
        if (isset($map['prov_code'])) {
            $model->provCode = $map['prov_code'];
        }

        return $model;
    }
}
