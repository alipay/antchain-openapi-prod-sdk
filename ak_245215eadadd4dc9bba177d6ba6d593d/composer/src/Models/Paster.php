<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_245215eadadd4dc9bba177d6ba6d593d\Models;

use AlibabaCloud\Tea\Model;

class Paster extends Model
{
    // 贴片元素离画面位置x坐标
    /**
     * @example 30
     *
     * @var int
     */
    public $x;

    // 贴片元素离画面位置y坐标
    /**
     * @example 200
     *
     * @var int
     */
    public $y;

    // 贴片元素 url,支持 gif png jpg等图片格式
    /**
     * @example https://aaa.gif
     *
     * @var string
     */
    public $srcUrl;

    // 贴片元素缩放比例
    /**
     * @example 1.0
     *
     * @var int
     */
    public $scale;
    protected $_name = [
        'x'      => 'x',
        'y'      => 'y',
        'srcUrl' => 'src_url',
        'scale'  => 'scale',
    ];

    public function validate()
    {
        Model::validateRequired('x', $this->x, true);
        Model::validateRequired('y', $this->y, true);
        Model::validateRequired('srcUrl', $this->srcUrl, true);
        Model::validateRequired('scale', $this->scale, true);
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
        if (null !== $this->srcUrl) {
            $res['src_url'] = $this->srcUrl;
        }
        if (null !== $this->scale) {
            $res['scale'] = $this->scale;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Paster
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
        if (isset($map['src_url'])) {
            $model->srcUrl = $map['src_url'];
        }
        if (isset($map['scale'])) {
            $model->scale = $map['scale'];
        }

        return $model;
    }
}
