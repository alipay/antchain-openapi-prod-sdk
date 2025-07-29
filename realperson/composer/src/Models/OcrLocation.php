<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\REALPERSON\Models;

use AlibabaCloud\Tea\Model;

class OcrLocation extends Model
{
    // 表示定位位置的长方形左上顶点的垂直坐标
    /**
     * @example 0
     *
     * @var string
     */
    public $top;

    // 表示定位位置的长方形左上顶点的水平坐标
    /**
     * @example 0
     *
     * @var string
     */
    public $left;

    // 表示定位位置的长方形的宽度
    /**
     * @example 100
     *
     * @var string
     */
    public $width;

    // 表示定位位置的长方形的高度
    /**
     * @example 100
     *
     * @var string
     */
    public $height;
    protected $_name = [
        'top'    => 'top',
        'left'   => 'left',
        'width'  => 'width',
        'height' => 'height',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->top) {
            $res['top'] = $this->top;
        }
        if (null !== $this->left) {
            $res['left'] = $this->left;
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
     * @return OcrLocation
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['top'])) {
            $model->top = $map['top'];
        }
        if (isset($map['left'])) {
            $model->left = $map['left'];
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
