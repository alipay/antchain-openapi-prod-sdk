<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INTELLICAR\Models;

use AlibabaCloud\Tea\Model;

class CityResult extends Model
{
    // 城市Id
    /**
     * @example 110000
     *
     * @var string
     */
    public $cityId;

    // 城市名称
    /**
     * @example 北京
     *
     * @var string
     */
    public $cityName;
    protected $_name = [
        'cityId'   => 'city_id',
        'cityName' => 'city_name',
    ];

    public function validate()
    {
        Model::validateRequired('cityId', $this->cityId, true);
        Model::validateRequired('cityName', $this->cityName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->cityId) {
            $res['city_id'] = $this->cityId;
        }
        if (null !== $this->cityName) {
            $res['city_name'] = $this->cityName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CityResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['city_id'])) {
            $model->cityId = $map['city_id'];
        }
        if (isset($map['city_name'])) {
            $model->cityName = $map['city_name'];
        }

        return $model;
    }
}
