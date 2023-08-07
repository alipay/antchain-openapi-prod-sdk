<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMO\Models;

use AlibabaCloud\Tea\Model;

class CreateAutoTestCodeRequest extends Model
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

    // 111
    /**
     * @var string
     */
    public $stringParam1;

    // 222
    /**
     * @var string
     */
    public $stringParam2;

    // 111
    /**
     * @var int
     */
    public $numberParam1;

    // 222
    /**
     * @var int
     */
    public $numberParam2;

    // 111
    /**
     * @var bool
     */
    public $boolParam1;

    // 222
    /**
     * @var bool
     */
    public $boolParam2;

    // 111
    /**
     * @var string
     */
    public $dateParam1;

    // 222
    /**
     * @var string
     */
    public $dateParam2;

    // 111
    /**
     * @var string[]
     */
    public $arrayParam1;

    // 222
    /**
     * @var string[]
     */
    public $arrayParam2;

    // 111
    /**
     * @var AutoCodeModel
     */
    public $structParam1;

    // 222
    /**
     * @var AutoCodeModel
     */
    public $structParam2;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'stringParam1'      => 'string_param_1',
        'stringParam2'      => 'string_param_2',
        'numberParam1'      => 'number_param_1',
        'numberParam2'      => 'number_param_2',
        'boolParam1'        => 'bool_param_1',
        'boolParam2'        => 'bool_param_2',
        'dateParam1'        => 'date_param_1',
        'dateParam2'        => 'date_param_2',
        'arrayParam1'       => 'array_param_1',
        'arrayParam2'       => 'array_param_2',
        'structParam1'      => 'struct_param_1',
        'structParam2'      => 'struct_param_2',
    ];

    public function validate()
    {
        Model::validateRequired('stringParam1', $this->stringParam1, true);
        Model::validateRequired('numberParam1', $this->numberParam1, true);
        Model::validateRequired('boolParam1', $this->boolParam1, true);
        Model::validateRequired('dateParam1', $this->dateParam1, true);
        Model::validateRequired('arrayParam1', $this->arrayParam1, true);
        Model::validateRequired('structParam1', $this->structParam1, true);
        Model::validatePattern('dateParam1', $this->dateParam1, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('dateParam2', $this->dateParam2, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->stringParam1) {
            $res['string_param_1'] = $this->stringParam1;
        }
        if (null !== $this->stringParam2) {
            $res['string_param_2'] = $this->stringParam2;
        }
        if (null !== $this->numberParam1) {
            $res['number_param_1'] = $this->numberParam1;
        }
        if (null !== $this->numberParam2) {
            $res['number_param_2'] = $this->numberParam2;
        }
        if (null !== $this->boolParam1) {
            $res['bool_param_1'] = $this->boolParam1;
        }
        if (null !== $this->boolParam2) {
            $res['bool_param_2'] = $this->boolParam2;
        }
        if (null !== $this->dateParam1) {
            $res['date_param_1'] = $this->dateParam1;
        }
        if (null !== $this->dateParam2) {
            $res['date_param_2'] = $this->dateParam2;
        }
        if (null !== $this->arrayParam1) {
            $res['array_param_1'] = $this->arrayParam1;
        }
        if (null !== $this->arrayParam2) {
            $res['array_param_2'] = $this->arrayParam2;
        }
        if (null !== $this->structParam1) {
            $res['struct_param_1'] = null !== $this->structParam1 ? $this->structParam1->toMap() : null;
        }
        if (null !== $this->structParam2) {
            $res['struct_param_2'] = null !== $this->structParam2 ? $this->structParam2->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateAutoTestCodeRequest
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
        if (isset($map['string_param_1'])) {
            $model->stringParam1 = $map['string_param_1'];
        }
        if (isset($map['string_param_2'])) {
            $model->stringParam2 = $map['string_param_2'];
        }
        if (isset($map['number_param_1'])) {
            $model->numberParam1 = $map['number_param_1'];
        }
        if (isset($map['number_param_2'])) {
            $model->numberParam2 = $map['number_param_2'];
        }
        if (isset($map['bool_param_1'])) {
            $model->boolParam1 = $map['bool_param_1'];
        }
        if (isset($map['bool_param_2'])) {
            $model->boolParam2 = $map['bool_param_2'];
        }
        if (isset($map['date_param_1'])) {
            $model->dateParam1 = $map['date_param_1'];
        }
        if (isset($map['date_param_2'])) {
            $model->dateParam2 = $map['date_param_2'];
        }
        if (isset($map['array_param_1'])) {
            if (!empty($map['array_param_1'])) {
                $model->arrayParam1 = $map['array_param_1'];
            }
        }
        if (isset($map['array_param_2'])) {
            if (!empty($map['array_param_2'])) {
                $model->arrayParam2 = $map['array_param_2'];
            }
        }
        if (isset($map['struct_param_1'])) {
            $model->structParam1 = AutoCodeModel::fromMap($map['struct_param_1']);
        }
        if (isset($map['struct_param_2'])) {
            $model->structParam2 = AutoCodeModel::fromMap($map['struct_param_2']);
        }

        return $model;
    }
}
