<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;

class VehicleLicenseCertResult extends Model
{
    // 与车辆的车牌号是否一致
    /**
     * @example true
     *
     * @var bool
     */
    public $plateNumber;

    // 与车辆对应号牌种类是否一致
    /**
     * @example true
     *
     * @var bool
     */
    public $plateType;

    // 与车辆所有人是否一致
    /**
     * @example true
     *
     * @var bool
     */
    public $owner;
    protected $_name = [
        'plateNumber' => 'plate_number',
        'plateType'   => 'plate_type',
        'owner'       => 'owner',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->plateNumber) {
            $res['plate_number'] = $this->plateNumber;
        }
        if (null !== $this->plateType) {
            $res['plate_type'] = $this->plateType;
        }
        if (null !== $this->owner) {
            $res['owner'] = $this->owner;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VehicleLicenseCertResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['plate_number'])) {
            $model->plateNumber = $map['plate_number'];
        }
        if (isset($map['plate_type'])) {
            $model->plateType = $map['plate_type'];
        }
        if (isset($map['owner'])) {
            $model->owner = $map['owner'];
        }

        return $model;
    }
}
