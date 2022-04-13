<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class ResourceOverride extends Model
{
    // 部署单元名称，ALL 代表所有部署单元
    /**
     * @example RZ00A
     *
     * @var string
     */
    public $cell;

    // fed 资源路径
    /**
     * @example /spec/template/spec/terminationGracePeriodSeconds
     *
     * @var string
     */
    public $path;

    // 值
    /**
     * @example 30
     *
     * @var string
     */
    public $value;

    // 值的字段类型，支持 string、number、boolean
    /**
     * @example string
     *
     * @var string
     */
    public $type;
    protected $_name = [
        'cell'  => 'cell',
        'path'  => 'path',
        'value' => 'value',
        'type'  => 'type',
    ];

    public function validate()
    {
        Model::validateRequired('cell', $this->cell, true);
        Model::validateRequired('path', $this->path, true);
        Model::validateRequired('value', $this->value, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->cell) {
            $res['cell'] = $this->cell;
        }
        if (null !== $this->path) {
            $res['path'] = $this->path;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ResourceOverride
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cell'])) {
            $model->cell = $map['cell'];
        }
        if (isset($map['path'])) {
            $model->path = $map['path'];
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }

        return $model;
    }
}
