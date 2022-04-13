<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class EnvVar extends Model
{
    // 环境变量名称。
    /**
     * @example app_name
     *
     * @var string
     */
    public $name;

    // 环境变量value。
    /**
     * @example test-app
     *
     * @var string
     */
    public $value;

    // 环境变量的取值来源。
    /**
     * @example {}
     *
     * @var EnvVarSource
     */
    public $valueFrom;

    // EnvVar类型
    /**
     * @example MANUAL, CONFIGMAP, SECRET
     *
     * @var string
     */
    public $type;
    protected $_name = [
        'name'      => 'name',
        'value'     => 'value',
        'valueFrom' => 'value_from',
        'type'      => 'type',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }
        if (null !== $this->valueFrom) {
            $res['value_from'] = null !== $this->valueFrom ? $this->valueFrom->toMap() : null;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EnvVar
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }
        if (isset($map['value_from'])) {
            $model->valueFrom = EnvVarSource::fromMap($map['value_from']);
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }

        return $model;
    }
}
