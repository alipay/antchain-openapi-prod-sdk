<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTAIAGT\Models;

use AlibabaCloud\Tea\Model;

class DraftPosition extends Model
{
    // x 浮点类型
    /**
     * @example 0.1
     *
     * @var string
     */
    public $x;

    // y 浮点类型
    /**
     * @example 0.1
     *
     * @var string
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
     * @return DraftPosition
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
