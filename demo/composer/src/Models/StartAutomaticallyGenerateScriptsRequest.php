<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMO\Models;

use AlibabaCloud\Tea\Model;

class StartAutomaticallyGenerateScriptsRequest extends Model
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

    // 入参1
    /**
     * @var string
     */
    public $string1;

    // 1
    /**
     * @var int
     */
    public $number1;

    // boolean
    /**
     * @var bool
     */
    public $boolean1;

    // date
    /**
     * @var string
     */
    public $date1;

    // 1
    /**
     * @var string[]
     */
    public $array1;

    // struct
    /**
     * @var GroupAClass
     */
    public $struct1;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'string1'           => 'string_1',
        'number1'           => 'number_1',
        'boolean1'          => 'boolean_1',
        'date1'             => 'date_1',
        'array1'            => 'array_1',
        'struct1'           => 'struct_1',
    ];

    public function validate()
    {
        Model::validateRequired('string1', $this->string1, true);
        Model::validateRequired('number1', $this->number1, true);
        Model::validateRequired('date1', $this->date1, true);
        Model::validateRequired('struct1', $this->struct1, true);
        Model::validatePattern('date1', $this->date1, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->number1) {
            $res['number_1'] = $this->number1;
        }
        if (null !== $this->boolean1) {
            $res['boolean_1'] = $this->boolean1;
        }
        if (null !== $this->date1) {
            $res['date_1'] = $this->date1;
        }
        if (null !== $this->array1) {
            $res['array_1'] = $this->array1;
        }
        if (null !== $this->struct1) {
            $res['struct_1'] = null !== $this->struct1 ? $this->struct1->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartAutomaticallyGenerateScriptsRequest
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
        if (isset($map['number_1'])) {
            $model->number1 = $map['number_1'];
        }
        if (isset($map['boolean_1'])) {
            $model->boolean1 = $map['boolean_1'];
        }
        if (isset($map['date_1'])) {
            $model->date1 = $map['date_1'];
        }
        if (isset($map['array_1'])) {
            if (!empty($map['array_1'])) {
                $model->array1 = $map['array_1'];
            }
        }
        if (isset($map['struct_1'])) {
            $model->struct1 = GroupAClass::fromMap($map['struct_1']);
        }

        return $model;
    }
}
