<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class ContractTemplateStructComponent extends Model
{
    // 填充字体,默认1，1-宋体，2-新宋体,4-黑体，5-楷体
    /**
     * @example 1
     *
     * @var int
     */
    public $font;

    // 填充字体大小,默认12
    /**
     * @example 11
     *
     * @var string
     */
    public $fontSize;

    // 输入项组件高度
    /**
     * @example 11.11
     *
     * @var string
     */
    public $height;

    // 输入项组件id，使用时可用id填充，为空时表示添加，不为空时表示修改
    /**
     * @example 45dd9420690b460c9e5ed55b40d7d0f8
     *
     * @var string
     */
    public $id;

    // 模板下输入项组件唯一标识，使用模板时也可用根据key值填充
    /**
     * @example key001
     *
     * @var string
     */
    public $key;

    // 输入项组件显示名称
    /**
     * @example 身份证号码
     *
     * @var string
     */
    public $label;

    // 输入项组件type=2,type=3时填充格式校验规则;数字格式如：#,#00.0# 日期格式如： yyyy-MM-dd
    /**
     * @example yyyy-MM-dd
     *
     * @var string
     */
    public $limit;

    // 页码
    /**
     * @example 1
     *
     * @var int
     */
    public $page;

    // 是否必填，默认true
    /**
     * @example true, false
     *
     * @var bool
     */
    public $required;

    // 字体颜色，默认#000000黑色
    /**
     * @example #000000
     *
     * @var string
     */
    public $textColor;

    // 输入项组件类型，1-文本，2-数字,3-日期，6-签约区
    /**
     * @example
     *
     * @var int
     */
    public $type;

    // 输入项组件宽度
    /**
     * @example 11.11
     *
     * @var string
     */
    public $width;

    // x轴坐标，左下角为原点
    /**
     * @example 11.11
     *
     * @var string
     */
    public $x;

    // y轴坐标，左下角为原点
    /**
     * @example 11.11
     *
     * @var string
     */
    public $y;
    protected $_name = [
        'font'      => 'font',
        'fontSize'  => 'font_size',
        'height'    => 'height',
        'id'        => 'id',
        'key'       => 'key',
        'label'     => 'label',
        'limit'     => 'limit',
        'page'      => 'page',
        'required'  => 'required',
        'textColor' => 'text_color',
        'type'      => 'type',
        'width'     => 'width',
        'x'         => 'x',
        'y'         => 'y',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->font) {
            $res['font'] = $this->font;
        }
        if (null !== $this->fontSize) {
            $res['font_size'] = $this->fontSize;
        }
        if (null !== $this->height) {
            $res['height'] = $this->height;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->key) {
            $res['key'] = $this->key;
        }
        if (null !== $this->label) {
            $res['label'] = $this->label;
        }
        if (null !== $this->limit) {
            $res['limit'] = $this->limit;
        }
        if (null !== $this->page) {
            $res['page'] = $this->page;
        }
        if (null !== $this->required) {
            $res['required'] = $this->required;
        }
        if (null !== $this->textColor) {
            $res['text_color'] = $this->textColor;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->width) {
            $res['width'] = $this->width;
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
     * @return ContractTemplateStructComponent
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['font'])) {
            $model->font = $map['font'];
        }
        if (isset($map['font_size'])) {
            $model->fontSize = $map['font_size'];
        }
        if (isset($map['height'])) {
            $model->height = $map['height'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['key'])) {
            $model->key = $map['key'];
        }
        if (isset($map['label'])) {
            $model->label = $map['label'];
        }
        if (isset($map['limit'])) {
            $model->limit = $map['limit'];
        }
        if (isset($map['page'])) {
            $model->page = $map['page'];
        }
        if (isset($map['required'])) {
            $model->required = $map['required'];
        }
        if (isset($map['text_color'])) {
            $model->textColor = $map['text_color'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['width'])) {
            $model->width = $map['width'];
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
