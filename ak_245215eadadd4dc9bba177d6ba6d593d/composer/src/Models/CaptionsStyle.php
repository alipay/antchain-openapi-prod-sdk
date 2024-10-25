<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_245215eadadd4dc9bba177d6ba6d593d\Models;

use AlibabaCloud\Tea\Model;

class CaptionsStyle extends Model
{
    // 字体类型
    /**
     * @example AlibabaPuHuiTi-Medium
     *
     * @var string
     */
    public $fontType;

    // 字体大小，像素单位
    /**
     * @example 1
     *
     * @var int
     */
    public $fontSize;

    // 字体颜色
    /**
     * @example FF1100
     *
     * @var string
     */
    public $fontColor;

    // 描边颜色
    /**
     * @example FF1100
     *
     * @var string
     */
    public $strokeColor;

    // 描边宽度
    /**
     * @example 1
     *
     * @var int
     */
    public $strokeWidth;

    // 字体背景颜色
    /**
     * @example FFFFFF
     *
     * @var string
     */
    public $backgroundColor;
    protected $_name = [
        'fontType'        => 'font_type',
        'fontSize'        => 'font_size',
        'fontColor'       => 'font_color',
        'strokeColor'     => 'stroke_color',
        'strokeWidth'     => 'stroke_width',
        'backgroundColor' => 'background_color',
    ];

    public function validate()
    {
        Model::validateRequired('fontType', $this->fontType, true);
        Model::validateRequired('fontSize', $this->fontSize, true);
        Model::validateRequired('fontColor', $this->fontColor, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->fontType) {
            $res['font_type'] = $this->fontType;
        }
        if (null !== $this->fontSize) {
            $res['font_size'] = $this->fontSize;
        }
        if (null !== $this->fontColor) {
            $res['font_color'] = $this->fontColor;
        }
        if (null !== $this->strokeColor) {
            $res['stroke_color'] = $this->strokeColor;
        }
        if (null !== $this->strokeWidth) {
            $res['stroke_width'] = $this->strokeWidth;
        }
        if (null !== $this->backgroundColor) {
            $res['background_color'] = $this->backgroundColor;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CaptionsStyle
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['font_type'])) {
            $model->fontType = $map['font_type'];
        }
        if (isset($map['font_size'])) {
            $model->fontSize = $map['font_size'];
        }
        if (isset($map['font_color'])) {
            $model->fontColor = $map['font_color'];
        }
        if (isset($map['stroke_color'])) {
            $model->strokeColor = $map['stroke_color'];
        }
        if (isset($map['stroke_width'])) {
            $model->strokeWidth = $map['stroke_width'];
        }
        if (isset($map['background_color'])) {
            $model->backgroundColor = $map['background_color'];
        }

        return $model;
    }
}
