<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PARTNER\Models;

use AlibabaCloud\Tea\Model;

class City extends Model
{
    // 城市名称
    /**
     * @example 杭州市
     *
     * @var string
     */
    public $cityName;
    protected $_name = [
        'cityName' => 'city_name',
    ];

    public function validate()
    {
        Model::validateRequired('cityName', $this->cityName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->cityName) {
            $res['city_name'] = $this->cityName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return City
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['city_name'])) {
            $model->cityName = $map['city_name'];
        }

        return $model;
    }
}
