<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_245215eadadd4dc9bba177d6ba6d593d\Models;

use AlibabaCloud\Tea\Model;

class Background extends Model
{
    // 背景元素，支持 gif png jpg mp4等格式
    /**
     * @example https://asdsadas.png
     *
     * @var string
     */
    public $srcUrl;

    // 背景缩放比例
    /**
     * @example 1.0
     *
     * @var int
     */
    public $scale;

    // 背景图片x坐标位置，距左侧
    /**
     * @example 0
     *
     * @var int
     */
    public $x;

    // 背景图片y坐标位置，距上侧
    /**
     * @example 0
     *
     * @var int
     */
    public $y;
    protected $_name = [
        'srcUrl' => 'src_url',
        'scale'  => 'scale',
        'x'      => 'x',
        'y'      => 'y',
    ];

    public function validate()
    {
        Model::validateRequired('srcUrl', $this->srcUrl, true);
        Model::validateRequired('scale', $this->scale, true);
        Model::validateRequired('x', $this->x, true);
        Model::validateRequired('y', $this->y, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->srcUrl) {
            $res['src_url'] = $this->srcUrl;
        }
        if (null !== $this->scale) {
            $res['scale'] = $this->scale;
        }
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
     * @return Background
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['src_url'])) {
            $model->srcUrl = $map['src_url'];
        }
        if (isset($map['scale'])) {
            $model->scale = $map['scale'];
        }
        if (isset($map['x'])) {
            $model->x = $map['x'];
        }
        if (isset($map['y'])) {
            $model->y = $map['y'];
        }

        return $model;
    }
}
