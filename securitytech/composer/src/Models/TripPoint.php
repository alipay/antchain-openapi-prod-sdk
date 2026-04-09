<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class TripPoint extends Model
{
    // 经度
    /**
     * @example 121.503052
     *
     * @var string
     */
    public $longitude;

    // 维度
    /**
     * @example 31.218412
     *
     * @var string
     */
    public $latitude;
    protected $_name = [
        'longitude' => 'longitude',
        'latitude'  => 'latitude',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
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
     * @return TripPoint
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['longitude'])) {
            $model->longitude = $map['longitude'];
        }
        if (isset($map['latitude'])) {
            $model->latitude = $map['latitude'];
        }

        return $model;
    }
}
