<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class ReleasePlanSpecAppService extends Model
{
    // 依赖的应用服务名字列表
    /**
     * @example
     *
     * @var string[]
     */
    public $dependencies;

    // 应用服务名字
    /**
     * @example apaks
     *
     * @var string
     */
    public $name;

    // container service revision
    /**
     * @example 20200219202232595.bifgvfw8
     *
     * @var string
     */
    public $revision;
    protected $_name = [
        'dependencies' => 'dependencies',
        'name'         => 'name',
        'revision'     => 'revision',
    ];

    public function validate()
    {
        Model::validateRequired('dependencies', $this->dependencies, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('revision', $this->revision, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->dependencies) {
            $res['dependencies'] = $this->dependencies;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->revision) {
            $res['revision'] = $this->revision;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ReleasePlanSpecAppService
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['dependencies'])) {
            if (!empty($map['dependencies'])) {
                $model->dependencies = $map['dependencies'];
            }
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['revision'])) {
            $model->revision = $map['revision'];
        }

        return $model;
    }
}
