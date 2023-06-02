<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\IAM\Models;

use AlibabaCloud\Tea\Model;

class OnexExtraInfo extends Model
{
    // Onex接口路径
    /**
     * @example /a/b/c
     *
     * @var string
     */
    public $path;

    // Onex接口的HTTP Method
    /**
     * @example POST
     *
     * @var string
     */
    public $method;
    protected $_name = [
        'path'   => 'path',
        'method' => 'method',
    ];

    public function validate()
    {
        Model::validateRequired('path', $this->path, true);
        Model::validateRequired('method', $this->method, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->path) {
            $res['path'] = $this->path;
        }
        if (null !== $this->method) {
            $res['method'] = $this->method;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OnexExtraInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['path'])) {
            $model->path = $map['path'];
        }
        if (isset($map['method'])) {
            $model->method = $map['method'];
        }

        return $model;
    }
}
