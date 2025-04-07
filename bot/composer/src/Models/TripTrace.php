<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class TripTrace extends Model
{
    // 定位数据
    /**
     * @example 113.784416,22.747500
     *
     * @var string
     */
    public $deviceLocation;
    protected $_name = [
        'deviceLocation' => 'device_location',
    ];

    public function validate()
    {
        Model::validateRequired('deviceLocation', $this->deviceLocation, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->deviceLocation) {
            $res['device_location'] = $this->deviceLocation;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TripTrace
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['device_location'])) {
            $model->deviceLocation = $map['device_location'];
        }

        return $model;
    }
}
