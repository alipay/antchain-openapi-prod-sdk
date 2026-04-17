<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMO\Models;

use AlibabaCloud\Tea\Model;

class TestClass extends Model
{
    // 字符串字段
    /**
     * @example string_param
     *
     * @var string
     */
    public $stringParam;

    // 数字字段
    /**
     * @example 100
     *
     * @var int
     */
    public $numberParam;

    // 布尔值参数
    /**
     * @example true, false
     *
     * @var bool
     */
    public $booleanParam;

    // 日期参数
    /**
     * @example 2026-02-10T10:10:00Z
     *
     * @var string
     */
    public $dateParam;

    // 数组参数
    /**
     * @example {a,b,c,d}
     *
     * @var string[]
     */
    public $arrayParam;

    // 结构体参数
    /**
     * @example
     *
     * @var DemoClass
     */
    public $structParam;
    protected $_name = [
        'stringParam'  => 'string_param',
        'numberParam'  => 'number_param',
        'booleanParam' => 'boolean_param',
        'dateParam'    => 'date_param',
        'arrayParam'   => 'array_param',
        'structParam'  => 'struct_param',
    ];

    public function validate()
    {
        Model::validateRequired('stringParam', $this->stringParam, true);
        Model::validateRequired('numberParam', $this->numberParam, true);
        Model::validateRequired('booleanParam', $this->booleanParam, true);
        Model::validateRequired('dateParam', $this->dateParam, true);
        Model::validateRequired('arrayParam', $this->arrayParam, true);
        Model::validateRequired('structParam', $this->structParam, true);
        Model::validatePattern('dateParam', $this->dateParam, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->stringParam) {
            $res['string_param'] = $this->stringParam;
        }
        if (null !== $this->numberParam) {
            $res['number_param'] = $this->numberParam;
        }
        if (null !== $this->booleanParam) {
            $res['boolean_param'] = $this->booleanParam;
        }
        if (null !== $this->dateParam) {
            $res['date_param'] = $this->dateParam;
        }
        if (null !== $this->arrayParam) {
            $res['array_param'] = $this->arrayParam;
        }
        if (null !== $this->structParam) {
            $res['struct_param'] = null !== $this->structParam ? $this->structParam->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TestClass
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['string_param'])) {
            $model->stringParam = $map['string_param'];
        }
        if (isset($map['number_param'])) {
            $model->numberParam = $map['number_param'];
        }
        if (isset($map['boolean_param'])) {
            $model->booleanParam = $map['boolean_param'];
        }
        if (isset($map['date_param'])) {
            $model->dateParam = $map['date_param'];
        }
        if (isset($map['array_param'])) {
            if (!empty($map['array_param'])) {
                $model->arrayParam = $map['array_param'];
            }
        }
        if (isset($map['struct_param'])) {
            $model->structParam = DemoClass::fromMap($map['struct_param']);
        }

        return $model;
    }
}
