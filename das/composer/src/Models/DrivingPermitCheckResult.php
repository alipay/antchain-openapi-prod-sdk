<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;

class DrivingPermitCheckResult extends Model
{
    // 车牌号
    /**
     * @example 一致
     *
     * @var string
     */
    public $platenumber;

    // 车牌种类
    /**
     * @example 一致
     *
     * @var string
     */
    public $platetype;

    // 所有人
    /**
     * @example 一致
     *
     * @var string
     */
    public $owner;
    protected $_name = [
        'platenumber' => 'platenumber',
        'platetype'   => 'platetype',
        'owner'       => 'owner',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->platenumber) {
            $res['platenumber'] = $this->platenumber;
        }
        if (null !== $this->platetype) {
            $res['platetype'] = $this->platetype;
        }
        if (null !== $this->owner) {
            $res['owner'] = $this->owner;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DrivingPermitCheckResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['platenumber'])) {
            $model->platenumber = $map['platenumber'];
        }
        if (isset($map['platetype'])) {
            $model->platetype = $map['platetype'];
        }
        if (isset($map['owner'])) {
            $model->owner = $map['owner'];
        }

        return $model;
    }
}
