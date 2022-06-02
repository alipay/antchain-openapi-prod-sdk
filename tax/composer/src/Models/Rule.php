<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAX\Models;

use AlibabaCloud\Tea\Model;

class Rule extends Model
{
    // 字段值的类型，常见有 string | number| boolean | _array_
    /**
     * @example string
     *
     * @var string
     */
    public $type;

    // type 为 string 类型时，表示字符串长度；number 类型时表示确定数字； array 类型时表示数组长度
    /**
     * @example 11
     *
     * @var int
     */
    public $len;

    // type 为 string 类型时，表示字符串最大长度；number 类型时表示最大值；array 类型时表示数组最大长度
    /**
     * @example 13
     *
     * @var int
     */
    public $max;

    // type 为 string 类型时，表示字符串最小长度；number 类型时表示最小值；array 类型时表示数组最小长度
    /**
     * @example 4
     *
     * @var int
     */
    public $min;

    // 校验出错时显示的错误消息
    /**
     * @example 重新输入
     *
     * @var string
     */
    public $message;

    // 是否必填
    /**
     * @example true, false
     *
     * @var bool
     */
    public $required;

    // 正则表达式,
    /**
     * @example d
     *
     * @var string
     */
    public $regPattern;
    protected $_name = [
        'type'       => 'type',
        'len'        => 'len',
        'max'        => 'max',
        'min'        => 'min',
        'message'    => 'message',
        'required'   => 'required',
        'regPattern' => 'reg_pattern',
    ];

    public function validate()
    {
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('len', $this->len, true);
        Model::validateRequired('max', $this->max, true);
        Model::validateRequired('min', $this->min, true);
        Model::validateRequired('message', $this->message, true);
        Model::validateRequired('required', $this->required, true);
        Model::validateRequired('regPattern', $this->regPattern, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->len) {
            $res['len'] = $this->len;
        }
        if (null !== $this->max) {
            $res['max'] = $this->max;
        }
        if (null !== $this->min) {
            $res['min'] = $this->min;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }
        if (null !== $this->required) {
            $res['required'] = $this->required;
        }
        if (null !== $this->regPattern) {
            $res['reg_pattern'] = $this->regPattern;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Rule
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['len'])) {
            $model->len = $map['len'];
        }
        if (isset($map['max'])) {
            $model->max = $map['max'];
        }
        if (isset($map['min'])) {
            $model->min = $map['min'];
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }
        if (isset($map['required'])) {
            $model->required = $map['required'];
        }
        if (isset($map['reg_pattern'])) {
            $model->regPattern = $map['reg_pattern'];
        }

        return $model;
    }
}
