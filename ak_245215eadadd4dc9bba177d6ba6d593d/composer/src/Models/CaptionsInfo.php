<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_245215eadadd4dc9bba177d6ba6d593d\Models;

use AlibabaCloud\Tea\Model;

class CaptionsInfo extends Model
{
    // 字幕画面位置x坐标，距左侧
    /**
     * @example 10
     *
     * @var int
     */
    public $x;

    // 字幕画面位置y坐标，距上侧
    /**
     * @example 100
     *
     * @var int
     */
    public $y;

    // 字幕框宽度
    /**
     * @example 100
     *
     * @var int
     */
    public $w;

    // 字幕框高度
    /**
     * @example 20
     *
     * @var int
     */
    public $h;

    // 字幕id
    /**
     * @example 123
     *
     * @var string
     */
    public $id;

    // 字幕句子时间节点信息
    /**
     * @example
     *
     * @var Sentence[]
     */
    public $sentences;
    protected $_name = [
        'x'         => 'x',
        'y'         => 'y',
        'w'         => 'w',
        'h'         => 'h',
        'id'        => 'id',
        'sentences' => 'sentences',
    ];

    public function validate()
    {
        Model::validateRequired('x', $this->x, true);
        Model::validateRequired('y', $this->y, true);
        Model::validateRequired('w', $this->w, true);
        Model::validateRequired('h', $this->h, true);
        Model::validateRequired('sentences', $this->sentences, true);
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
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->sentences) {
            $res['sentences'] = [];
            if (null !== $this->sentences && \is_array($this->sentences)) {
                $n = 0;
                foreach ($this->sentences as $item) {
                    $res['sentences'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CaptionsInfo
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
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['sentences'])) {
            if (!empty($map['sentences'])) {
                $model->sentences = [];
                $n                = 0;
                foreach ($map['sentences'] as $item) {
                    $model->sentences[$n++] = null !== $item ? Sentence::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
