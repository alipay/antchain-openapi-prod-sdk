<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class AppReleaseConfigDependOn extends Model
{
    // 类型
    /**
     * @example MIDDLEWARE_DRM
     *
     * @var string
     */
    public $kind;

    // 名称
    /**
     * @example msg-type1
     *
     * @var string
     */
    public $name;
    protected $_name = [
        'kind' => 'kind',
        'name' => 'name',
    ];

    public function validate()
    {
        Model::validateRequired('kind', $this->kind, true);
        Model::validateRequired('name', $this->name, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->kind) {
            $res['kind'] = $this->kind;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AppReleaseConfigDependOn
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['kind'])) {
            $model->kind = $map['kind'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }

        return $model;
    }
}
