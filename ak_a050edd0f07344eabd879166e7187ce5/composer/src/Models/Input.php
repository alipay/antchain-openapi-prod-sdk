<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_a050edd0f07344eabd879166e7187ce5\Models;

use AlibabaCloud\Tea\Model;

class Input extends Model
{
    // 参数唯一id
    /**
     * @example u7jdde34
     *
     * @var string
     */
    public $feId;

    // 因子的id
    /**
     * @example
     *
     * @var int
     */
    public $id;

    // 参数的code
    /**
     * @example TEST_CODE
     *
     * @var string
     */
    public $code;

    // 参数的名称
    /**
     * @example ss
     *
     * @var string
     */
    public $name;

    // 参数取值
    /**
     * @example
     *
     * @var string[]
     */
    public $value;

    // 参数的值类型
    /**
     * @example STRING
     *
     * @var string
     */
    public $type;

    // 是否使用自定义值
    /**
     * @example true, false
     *
     * @var bool
     */
    public $custom;

    // 是否多选
    /**
     * @example true, false
     *
     * @var bool
     */
    public $multiple;
    protected $_name = [
        'feId'     => 'fe_id',
        'id'       => 'id',
        'code'     => 'code',
        'name'     => 'name',
        'value'    => 'value',
        'type'     => 'type',
        'custom'   => 'custom',
        'multiple' => 'multiple',
    ];

    public function validate()
    {
        Model::validateRequired('feId', $this->feId, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('code', $this->code, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('value', $this->value, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('custom', $this->custom, true);
        Model::validateRequired('multiple', $this->multiple, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->feId) {
            $res['fe_id'] = $this->feId;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->custom) {
            $res['custom'] = $this->custom;
        }
        if (null !== $this->multiple) {
            $res['multiple'] = $this->multiple;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Input
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['fe_id'])) {
            $model->feId = $map['fe_id'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['value'])) {
            if (!empty($map['value'])) {
                $model->value = $map['value'];
            }
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['custom'])) {
            $model->custom = $map['custom'];
        }
        if (isset($map['multiple'])) {
            $model->multiple = $map['multiple'];
        }

        return $model;
    }
}
