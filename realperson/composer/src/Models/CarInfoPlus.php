<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\REALPERSON\Models;

use AlibabaCloud\Tea\Model;

class CarInfoPlus extends Model
{
    // 车牌号
    /**
     * @example 京A123456
     *
     * @var string
     */
    public $plateNo;

    // 车辆型号，格式：1，2，3...
    /**
     * @example 1
     *
     * @var string
     */
    public $model;

    // 车辆颜色，格式：1，2，3
    /**
     * @example 1
     *
     * @var string
     */
    public $color;
    protected $_name = [
        'plateNo' => 'plate_no',
        'model'   => 'model',
        'color'   => 'color',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->plateNo) {
            $res['plate_no'] = $this->plateNo;
        }
        if (null !== $this->model) {
            $res['model'] = $this->model;
        }
        if (null !== $this->color) {
            $res['color'] = $this->color;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CarInfoPlus
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['plate_no'])) {
            $model->plateNo = $map['plate_no'];
        }
        if (isset($map['model'])) {
            $model->model = $map['model'];
        }
        if (isset($map['color'])) {
            $model->color = $map['color'];
        }

        return $model;
    }
}
