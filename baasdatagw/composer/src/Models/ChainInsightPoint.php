<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDATAGW\Models;

use AlibabaCloud\Tea\Model;

class ChainInsightPoint extends Model
{
    // x坐标，4位定点小数， 10000 表示 1
    /**
     * @example 10000
     *
     * @var int
     */
    public $x;

    // y坐标，4位定点小数， 10000 表示 1
    /**
     * @example 10000
     *
     * @var int
     */
    public $y;
    protected $_name = [
        'x' => 'x',
        'y' => 'y',
    ];

    public function validate()
    {
        Model::validateRequired('x', $this->x, true);
        Model::validateRequired('y', $this->y, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->x) {
            $res['x'] = $this->x;
        }
        if (null !== $this->y) {
            $res['y'] = $this->y;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ChainInsightPoint
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['x'])) {
            $model->x = $map['x'];
        }
        if (isset($map['y'])) {
            $model->y = $map['y'];
        }

        return $model;
    }
}
