<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class JsonPatch extends Model
{
    // 操作类型
    /**
     * @example add、remove、replace
     *
     * @var string
     */
    public $op;

    // json path 路径
    /**
     * @example /containerSpecs/0/logConfigs/0/dockerExcludeLabel
     *
     * @var string
     */
    public $path;

    // 值
    /**
     * @example 111
     *
     * @var string
     */
    public $value;

    // 值类型，默认 string
    /**
     * @example string、number、array、object
     *
     * @var string
     */
    public $valueType;
    protected $_name = [
        'op'        => 'op',
        'path'      => 'path',
        'value'     => 'value',
        'valueType' => 'value_type',
    ];

    public function validate()
    {
        Model::validateRequired('op', $this->op, true);
        Model::validateRequired('path', $this->path, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->op) {
            $res['op'] = $this->op;
        }
        if (null !== $this->path) {
            $res['path'] = $this->path;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }
        if (null !== $this->valueType) {
            $res['value_type'] = $this->valueType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return JsonPatch
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['op'])) {
            $model->op = $map['op'];
        }
        if (isset($map['path'])) {
            $model->path = $map['path'];
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }
        if (isset($map['value_type'])) {
            $model->valueType = $map['value_type'];
        }

        return $model;
    }
}
