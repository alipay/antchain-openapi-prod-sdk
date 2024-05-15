<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class TransportActiveData extends Model
{
    // 运输方式编码
    /**
     * @example 5201000000
     *
     * @var string
     */
    public $transportCode;

    // 运输设备
    /**
     * @example KCTC
     *
     * @var string
     */
    public $equipment;

    // 运输里程
    /**
     * @example 200
     *
     * @var string
     */
    public $distance;

    // 是否空载
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isEmptyLoad;
    protected $_name = [
        'transportCode' => 'transport_code',
        'equipment'     => 'equipment',
        'distance'      => 'distance',
        'isEmptyLoad'   => 'is_empty_load',
    ];

    public function validate()
    {
        Model::validateRequired('transportCode', $this->transportCode, true);
        Model::validateRequired('equipment', $this->equipment, true);
        Model::validateRequired('distance', $this->distance, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->transportCode) {
            $res['transport_code'] = $this->transportCode;
        }
        if (null !== $this->equipment) {
            $res['equipment'] = $this->equipment;
        }
        if (null !== $this->distance) {
            $res['distance'] = $this->distance;
        }
        if (null !== $this->isEmptyLoad) {
            $res['is_empty_load'] = $this->isEmptyLoad;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TransportActiveData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['transport_code'])) {
            $model->transportCode = $map['transport_code'];
        }
        if (isset($map['equipment'])) {
            $model->equipment = $map['equipment'];
        }
        if (isset($map['distance'])) {
            $model->distance = $map['distance'];
        }
        if (isset($map['is_empty_load'])) {
            $model->isEmptyLoad = $map['is_empty_load'];
        }

        return $model;
    }
}
