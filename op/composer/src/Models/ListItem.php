<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\OP\Models;

use AlibabaCloud\Tea\Model;

class ListItem extends Model
{
    // 参数类型
    /**
     * @example STRING
     *
     * @var string
     */
    public $type;

    // 结构体名称
    /**
     * @example test
     *
     * @var string
     */
    public $structName;

    // 参数示例
    /**
     * @example test
     *
     * @var string
     */
    public $example;

    // 整数最大值
    /**
     * @example
     *
     * @var int
     */
    public $maximum;

    // 是否包括最大值
    /**
     * @example true, false
     *
     * @var bool
     */
    public $exclusiveMaximum;

    // 最小值
    /**
     * @example
     *
     * @var int
     */
    public $minimum;

    // 是否包括最小值
    /**
     * @example true, false
     *
     * @var bool
     */
    public $exclusiveMinimum;

    // 最大长度
    /**
     * @example
     *
     * @var int
     */
    public $maxLength;

    // 最小长度
    /**
     * @example
     *
     * @var int
     */
    public $minLength;

    // 模式
    /**
     * @example NULL
     *
     * @var string
     */
    public $pattern;

    // 最大元素个数
    /**
     * @example
     *
     * @var int
     */
    public $maxItems;

    // 最小元素数目
    /**
     * @example
     *
     * @var int
     */
    public $minItems;

    // 枚举类型
    /**
     * @example A，B，C
     *
     * @var string
     */
    public $enumValues;
    protected $_name = [
        'type'             => 'type',
        'structName'       => 'struct_name',
        'example'          => 'example',
        'maximum'          => 'maximum',
        'exclusiveMaximum' => 'exclusive_maximum',
        'minimum'          => 'minimum',
        'exclusiveMinimum' => 'exclusive_minimum',
        'maxLength'        => 'max_length',
        'minLength'        => 'min_length',
        'pattern'          => 'pattern',
        'maxItems'         => 'max_items',
        'minItems'         => 'min_items',
        'enumValues'       => 'enum_values',
    ];

    public function validate()
    {
        Model::validateRequired('type', $this->type, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->structName) {
            $res['struct_name'] = $this->structName;
        }
        if (null !== $this->example) {
            $res['example'] = $this->example;
        }
        if (null !== $this->maximum) {
            $res['maximum'] = $this->maximum;
        }
        if (null !== $this->exclusiveMaximum) {
            $res['exclusive_maximum'] = $this->exclusiveMaximum;
        }
        if (null !== $this->minimum) {
            $res['minimum'] = $this->minimum;
        }
        if (null !== $this->exclusiveMinimum) {
            $res['exclusive_minimum'] = $this->exclusiveMinimum;
        }
        if (null !== $this->maxLength) {
            $res['max_length'] = $this->maxLength;
        }
        if (null !== $this->minLength) {
            $res['min_length'] = $this->minLength;
        }
        if (null !== $this->pattern) {
            $res['pattern'] = $this->pattern;
        }
        if (null !== $this->maxItems) {
            $res['max_items'] = $this->maxItems;
        }
        if (null !== $this->minItems) {
            $res['min_items'] = $this->minItems;
        }
        if (null !== $this->enumValues) {
            $res['enum_values'] = $this->enumValues;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListItem
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['struct_name'])) {
            $model->structName = $map['struct_name'];
        }
        if (isset($map['example'])) {
            $model->example = $map['example'];
        }
        if (isset($map['maximum'])) {
            $model->maximum = $map['maximum'];
        }
        if (isset($map['exclusive_maximum'])) {
            $model->exclusiveMaximum = $map['exclusive_maximum'];
        }
        if (isset($map['minimum'])) {
            $model->minimum = $map['minimum'];
        }
        if (isset($map['exclusive_minimum'])) {
            $model->exclusiveMinimum = $map['exclusive_minimum'];
        }
        if (isset($map['max_length'])) {
            $model->maxLength = $map['max_length'];
        }
        if (isset($map['min_length'])) {
            $model->minLength = $map['min_length'];
        }
        if (isset($map['pattern'])) {
            $model->pattern = $map['pattern'];
        }
        if (isset($map['max_items'])) {
            $model->maxItems = $map['max_items'];
        }
        if (isset($map['min_items'])) {
            $model->minItems = $map['min_items'];
        }
        if (isset($map['enum_values'])) {
            $model->enumValues = $map['enum_values'];
        }

        return $model;
    }
}
