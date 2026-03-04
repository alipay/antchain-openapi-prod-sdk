<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class SimCarLocationInfo extends Model
{
    // 定位时间
    /**
     * @example 2025-12-26 17:07:00
     *
     * @var string
     */
    public $locationTime;

    // 经度
    /**
     * @example
     *
     * @var string
     */
    public $longitude;

    // 纬度
    /**
     * @example
     *
     * @var string
     */
    public $latitude;
    protected $_name = [
        'locationTime' => 'location_time',
        'longitude'    => 'longitude',
        'latitude'     => 'latitude',
    ];

    public function validate()
    {
        Model::validateRequired('locationTime', $this->locationTime, true);
        Model::validateRequired('longitude', $this->longitude, true);
        Model::validateRequired('latitude', $this->latitude, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->locationTime) {
            $res['location_time'] = $this->locationTime;
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
     *
     * @return SimCarLocationInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['location_time'])) {
            $model->locationTime = $map['location_time'];
        }
        if (isset($map['longitude'])) {
            $model->longitude = $map['longitude'];
        }
        if (isset($map['latitude'])) {
            $model->latitude = $map['latitude'];
        }

        return $model;
    }
}
