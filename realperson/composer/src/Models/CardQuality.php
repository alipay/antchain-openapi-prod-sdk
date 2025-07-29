<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\REALPERSON\Models;

use AlibabaCloud\Tea\Model;

class CardQuality extends Model
{
    // 1-清晰
    // 0-不清晰
    //
    /**
     * @example 1
     *
     * @var string
     */
    public $isClear;

    // 清晰度取值0-1，值越大表示图像质量越好，默认阈值0.5
    /**
     * @example 1
     *
     * @var string
     */
    public $isClearPropobility;

    // 1-边框/四角完整
    // 0-边框/四角不完整
    /**
     * @example 1
     *
     * @var string
     */
    public $isComplete;

    // 取值0-1，值越大表示图像质量越好，默认阈值0.5
    /**
     * @example 1
     *
     * @var string
     */
    public $isCompletePropobility;

    // 1-头像、关键字段无遮挡/马赛克
    // 0-头像、关键字段有遮挡/马赛克
    /**
     * @example 1
     *
     * @var string
     */
    public $isNoCover;

    // 有无遮挡propobility-取值0-1，值越大表示图像质量越好，默认阈值0.3
    /**
     * @example 1
     *
     * @var string
     */
    public $isNoCoverPropobility;
    protected $_name = [
        'isClear'               => 'is_clear',
        'isClearPropobility'    => 'is_clear_propobility',
        'isComplete'            => 'is_complete',
        'isCompletePropobility' => 'is_complete_propobility',
        'isNoCover'             => 'is_no_cover',
        'isNoCoverPropobility'  => 'is_no_cover_propobility',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->isClear) {
            $res['is_clear'] = $this->isClear;
        }
        if (null !== $this->isClearPropobility) {
            $res['is_clear_propobility'] = $this->isClearPropobility;
        }
        if (null !== $this->isComplete) {
            $res['is_complete'] = $this->isComplete;
        }
        if (null !== $this->isCompletePropobility) {
            $res['is_complete_propobility'] = $this->isCompletePropobility;
        }
        if (null !== $this->isNoCover) {
            $res['is_no_cover'] = $this->isNoCover;
        }
        if (null !== $this->isNoCoverPropobility) {
            $res['is_no_cover_propobility'] = $this->isNoCoverPropobility;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CardQuality
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['is_clear'])) {
            $model->isClear = $map['is_clear'];
        }
        if (isset($map['is_clear_propobility'])) {
            $model->isClearPropobility = $map['is_clear_propobility'];
        }
        if (isset($map['is_complete'])) {
            $model->isComplete = $map['is_complete'];
        }
        if (isset($map['is_complete_propobility'])) {
            $model->isCompletePropobility = $map['is_complete_propobility'];
        }
        if (isset($map['is_no_cover'])) {
            $model->isNoCover = $map['is_no_cover'];
        }
        if (isset($map['is_no_cover_propobility'])) {
            $model->isNoCoverPropobility = $map['is_no_cover_propobility'];
        }

        return $model;
    }
}
