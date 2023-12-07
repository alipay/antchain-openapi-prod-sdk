<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMO\Models;

use AlibabaCloud\Tea\Model;

class CreateAutoGenerateCodeRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 必填参数
    /**
     * @var string
     */
    public $string1;

    // 非必填参数
    /**
     * @var string
     */
    public $string2;

    // 长度限制2~5位
    /**
     * @var string
     */
    public $string3;

    // 长度限制3~5位
    /**
     * @var string
     */
    public $string4;

    // 数值必填
    /**
     * @var int
     */
    public $number1;

    // 数值非必填
    /**
     * @var int
     */
    public $number2;

    // 最小2，最大10
    /**
     * @var int
     */
    public $number3;

    // 最小1，最大5
    /**
     * @var int
     */
    public $number4;

    // boolean必填
    /**
     * @var bool
     */
    public $boolean1;

    // boolean非必填
    /**
     * @var bool
     */
    public $boolean2;

    // 必填日期
    /**
     * @var string
     */
    public $date1;

    // 非必填日期
    /**
     * @var string
     */
    public $date2;

    // 必填array
    /**
     * @var int[]
     */
    public $array1;

    // 非必填array
    /**
     * @var int[]
     */
    public $array2;

    // 必填struct
    /**
     * @var GroupAClass
     */
    public $struct1;

    // 非必填struct
    /**
     * @var GroupAClass
     */
    public $struct2;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'string1'           => 'string_1',
        'string2'           => 'string_2',
        'string3'           => 'string_3',
        'string4'           => 'string_4',
        'number1'           => 'number_1',
        'number2'           => 'number_2',
        'number3'           => 'number_3',
        'number4'           => 'number_4',
        'boolean1'          => 'boolean_1',
        'boolean2'          => 'boolean_2',
        'date1'             => 'date_1',
        'date2'             => 'date_2',
        'array1'            => 'array_1',
        'array2'            => 'array_2',
        'struct1'           => 'struct_1',
        'struct2'           => 'struct_2',
    ];

    public function validate()
    {
        Model::validateRequired('string1', $this->string1, true);
        Model::validateRequired('string3', $this->string3, true);
        Model::validateRequired('number1', $this->number1, true);
        Model::validateRequired('number3', $this->number3, true);
        Model::validateRequired('boolean1', $this->boolean1, true);
        Model::validateRequired('date1', $this->date1, true);
        Model::validateRequired('date2', $this->date2, true);
        Model::validateRequired('array1', $this->array1, true);
        Model::validateRequired('struct1', $this->struct1, true);
        Model::validateRequired('struct2', $this->struct2, true);
        Model::validateMaxLength('string3', $this->string3, 5);
        Model::validateMaxLength('string4', $this->string4, 5);
        Model::validateMinLength('string3', $this->string3, 2);
        Model::validateMinLength('string4', $this->string4, 3);
        Model::validateMaximum('number3', $this->number3, 10);
        Model::validateMaximum('number4', $this->number4, 5);
        Model::validateMinimum('number3', $this->number3, 2);
        Model::validateMinimum('number4', $this->number4, 1);
        Model::validatePattern('date1', $this->date1, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('date2', $this->date2, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->string1) {
            $res['string_1'] = $this->string1;
        }
        if (null !== $this->string2) {
            $res['string_2'] = $this->string2;
        }
        if (null !== $this->string3) {
            $res['string_3'] = $this->string3;
        }
        if (null !== $this->string4) {
            $res['string_4'] = $this->string4;
        }
        if (null !== $this->number1) {
            $res['number_1'] = $this->number1;
        }
        if (null !== $this->number2) {
            $res['number_2'] = $this->number2;
        }
        if (null !== $this->number3) {
            $res['number_3'] = $this->number3;
        }
        if (null !== $this->number4) {
            $res['number_4'] = $this->number4;
        }
        if (null !== $this->boolean1) {
            $res['boolean_1'] = $this->boolean1;
        }
        if (null !== $this->boolean2) {
            $res['boolean_2'] = $this->boolean2;
        }
        if (null !== $this->date1) {
            $res['date_1'] = $this->date1;
        }
        if (null !== $this->date2) {
            $res['date_2'] = $this->date2;
        }
        if (null !== $this->array1) {
            $res['array_1'] = $this->array1;
        }
        if (null !== $this->array2) {
            $res['array_2'] = $this->array2;
        }
        if (null !== $this->struct1) {
            $res['struct_1'] = null !== $this->struct1 ? $this->struct1->toMap() : null;
        }
        if (null !== $this->struct2) {
            $res['struct_2'] = null !== $this->struct2 ? $this->struct2->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateAutoGenerateCodeRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['string_1'])) {
            $model->string1 = $map['string_1'];
        }
        if (isset($map['string_2'])) {
            $model->string2 = $map['string_2'];
        }
        if (isset($map['string_3'])) {
            $model->string3 = $map['string_3'];
        }
        if (isset($map['string_4'])) {
            $model->string4 = $map['string_4'];
        }
        if (isset($map['number_1'])) {
            $model->number1 = $map['number_1'];
        }
        if (isset($map['number_2'])) {
            $model->number2 = $map['number_2'];
        }
        if (isset($map['number_3'])) {
            $model->number3 = $map['number_3'];
        }
        if (isset($map['number_4'])) {
            $model->number4 = $map['number_4'];
        }
        if (isset($map['boolean_1'])) {
            $model->boolean1 = $map['boolean_1'];
        }
        if (isset($map['boolean_2'])) {
            $model->boolean2 = $map['boolean_2'];
        }
        if (isset($map['date_1'])) {
            $model->date1 = $map['date_1'];
        }
        if (isset($map['date_2'])) {
            $model->date2 = $map['date_2'];
        }
        if (isset($map['array_1'])) {
            if (!empty($map['array_1'])) {
                $model->array1 = $map['array_1'];
            }
        }
        if (isset($map['array_2'])) {
            if (!empty($map['array_2'])) {
                $model->array2 = $map['array_2'];
            }
        }
        if (isset($map['struct_1'])) {
            $model->struct1 = GroupAClass::fromMap($map['struct_1']);
        }
        if (isset($map['struct_2'])) {
            $model->struct2 = GroupAClass::fromMap($map['struct_2']);
        }

        return $model;
    }
}
