<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTAIAGT\Models;

use AlibabaCloud\Tea\Model;

class ToolOptionParam extends Model
{
    // 参数名称
    /**
     * @example 参数名称
     *
     * @var string
     */
    public $name;

    // 参数code
    /**
     * @example 参数code
     *
     * @var string
     */
    public $code;

    // 参数描述
    /**
     * @example 参数描述
     *
     * @var string
     */
    public $desc;

    // 参数值
    /**
     * @example 参数值
     *
     * @var string
     */
    public $value;
    protected $_name = [
        'name'  => 'name',
        'code'  => 'code',
        'desc'  => 'desc',
        'value' => 'value',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('code', $this->code, true);
        Model::validateRequired('desc', $this->desc, true);
        Model::validateRequired('value', $this->value, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->desc) {
            $res['desc'] = $this->desc;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ToolOptionParam
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['desc'])) {
            $model->desc = $map['desc'];
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }

        return $model;
    }
}
