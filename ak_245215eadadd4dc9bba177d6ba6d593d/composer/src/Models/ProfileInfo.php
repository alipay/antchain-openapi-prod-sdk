<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_245215eadadd4dc9bba177d6ba6d593d\Models;

use AlibabaCloud\Tea\Model;

class ProfileInfo extends Model
{
    // 数字人离画面位置坐标,可以为负数或者出画
    // 数字人在视频生成中的位置
    /**
     * @example 0
     *
     * @var int
     */
    public $x;

    // 数字人离画面位置坐标,可以为负数或者出画
    // 数字人在视频生成中的位置
    /**
     * @example 0
     *
     * @var int
     */
    public $y;

    // 数字人视频大小,初始大小为训练素材整体大小非数字人在框选大小
    /**
     * @example 100
     *
     * @var int
     */
    public $w;

    // 数字人视频大小,初始大小为训练素材整体大小非数字人在框选大小
    /**
     * @example 100
     *
     * @var int
     */
    public $h;

    // 数字人视频大小缩放,实际大小为  scale*w   scale*h
    /**
     * @example 1.2
     *
     * @var string
     */
    public $scale;
    protected $_name = [
        'x'     => 'x',
        'y'     => 'y',
        'w'     => 'w',
        'h'     => 'h',
        'scale' => 'scale',
    ];

    public function validate()
    {
        Model::validateRequired('x', $this->x, true);
        Model::validateRequired('y', $this->y, true);
        Model::validateRequired('w', $this->w, true);
        Model::validateRequired('h', $this->h, true);
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
        if (null !== $this->w) {
            $res['w'] = $this->w;
        }
        if (null !== $this->h) {
            $res['h'] = $this->h;
        }
        if (null !== $this->scale) {
            $res['scale'] = $this->scale;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ProfileInfo
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
        if (isset($map['w'])) {
            $model->w = $map['w'];
        }
        if (isset($map['h'])) {
            $model->h = $map['h'];
        }
        if (isset($map['scale'])) {
            $model->scale = $map['scale'];
        }

        return $model;
    }
}
