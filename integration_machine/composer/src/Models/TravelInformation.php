<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INTEGRATION_MACHINE\Models;

use AlibabaCloud\Tea\Model;

class TravelInformation extends Model
{
    // 1:没去过疫情区，绿码;
    // 2:去过疫情区，红码;
    // 3:其他，黄码;
    // 0:行程信息不全;
    // -1查询失败
    /**
     * @example 1
     *
     * @var string
     */
    public $travelCode;

    // 行程途径地
    /**
     * @example 杭州
     *
     * @var string
     */
    public $travelPath;
    protected $_name = [
        'travelCode' => 'travel_code',
        'travelPath' => 'travel_path',
    ];

    public function validate()
    {
        Model::validateRequired('travelCode', $this->travelCode, true);
        Model::validateRequired('travelPath', $this->travelPath, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->travelCode) {
            $res['travel_code'] = $this->travelCode;
        }
        if (null !== $this->travelPath) {
            $res['travel_path'] = $this->travelPath;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TravelInformation
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['travel_code'])) {
            $model->travelCode = $map['travel_code'];
        }
        if (isset($map['travel_path'])) {
            $model->travelPath = $map['travel_path'];
        }

        return $model;
    }
}
