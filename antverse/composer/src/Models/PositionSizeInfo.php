<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ANTVERSE\Models;

use AlibabaCloud\Tea\Model;

class PositionSizeInfo extends Model
{
    // 数字人x轴（竖轴）坐标
    /**
     * @example
     *
     * @var int
     */
    public $x;

    // 数字人y轴（横轴）坐标
    /**
     * @example
     *
     * @var int
     */
    public $y;

    // 数字人宽度
    //
    /**
     * @example
     *
     * @var int
     */
    public $width;

    // 数字人高度
    /**
     * @example
     *
     * @var int
     */
    public $height;
    protected $_name = [
        'x'      => 'x',
        'y'      => 'y',
        'width'  => 'width',
        'height' => 'height',
    ];

    public function validate()
    {
        Model::validateRequired('x', $this->x, true);
        Model::validateRequired('y', $this->y, true);
        Model::validateRequired('width', $this->width, true);
        Model::validateRequired('height', $this->height, true);
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
        if (null !== $this->width) {
            $res['width'] = $this->width;
        }
        if (null !== $this->height) {
            $res['height'] = $this->height;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PositionSizeInfo
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
        if (isset($map['width'])) {
            $model->width = $map['width'];
        }
        if (isset($map['height'])) {
            $model->height = $map['height'];
        }

        return $model;
    }
}
