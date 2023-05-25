<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CATRONUS\Models;

use AlibabaCloud\Tea\Model;

class FixPath extends Model
{
    // 路径
    /**
     * @example path
     *
     * @var string
     */
    public $path;

    // 值
    /**
     * @example value
     *
     * @var string
     */
    public $value;
    protected $_name = [
        'path'  => 'path',
        'value' => 'value',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->path) {
            $res['path'] = $this->path;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FixPath
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['path'])) {
            $model->path = $map['path'];
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }

        return $model;
    }
}
