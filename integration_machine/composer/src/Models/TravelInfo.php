<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INTEGRATION_MACHINE\Models;

use AlibabaCloud\Tea\Model;

class TravelInfo extends Model
{
    // 行程码信息
    // 1:没去过疫情区，绿码;
    // 2:去过疫情区，红码;
    // 3:其他，黄码;
    // 0:行程信息不全;
    // -1:查询失败
    /**
     * @example 1
     *
     * @var string
     */
    public $travelCode;

    // 行程码异常原因
    /**
     * @example 123
     *
     * @var string
     */
    public $travelFactor;
    protected $_name = [
        'travelCode'   => 'travel_code',
        'travelFactor' => 'travel_factor',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->travelCode) {
            $res['travel_code'] = $this->travelCode;
        }
        if (null !== $this->travelFactor) {
            $res['travel_factor'] = $this->travelFactor;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TravelInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['travel_code'])) {
            $model->travelCode = $map['travel_code'];
        }
        if (isset($map['travel_factor'])) {
            $model->travelFactor = $map['travel_factor'];
        }

        return $model;
    }
}
