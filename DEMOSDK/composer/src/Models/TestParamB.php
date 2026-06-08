<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMOSDK\Models;

use AlibabaCloud\Tea\Model;

class TestParamB extends Model
{
    // string_param
    /**
     * @example string_param
     *
     * @var string
     */
    public $stringParam;

    // number_param
    /**
     * @example 1
     *
     * @var int
     */
    public $numberParam;

    // boolean_param
    /**
     * @example true, false
     *
     * @var bool
     */
    public $booleanParam;

    // date_param
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $dateParam;

    // struct_param
    /**
     * @example
     *
     * @var TestParamC
     */
    public $structParam;

    // aa
    /**
     * @example 3000
     *
     * @var TestParamC
     */
    public $structListB;
    protected $_name = [
        'stringParam'  => 'string_param',
        'numberParam'  => 'number_param',
        'booleanParam' => 'boolean_param',
        'dateParam'    => 'date_param',
        'structParam'  => 'struct_param',
        'structListB'  => 'struct_list_b',
    ];

    public function validate()
    {
        Model::validatePattern('dateParam', $this->dateParam, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validateRequired('structParam', $this->structParam, true);
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
        if (null !== $this->structParam) {
            $res['struct_param'] = null !== $this->structParam ? $this->structParam->toMap() : null;
        }
        if (null !== $this->structListB) {
            $res['struct_list_b'] = null !== $this->structListB ? $this->structListB->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TestParamB
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
        if (isset($map['struct_param'])) {
            $model->structParam = TestParamC::fromMap($map['struct_param']);
        }
        if (isset($map['struct_list_b'])) {
            $model->structListB = TestParamC::fromMap($map['struct_list_b']);
        }

        return $model;
    }
}
