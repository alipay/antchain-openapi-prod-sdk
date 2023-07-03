<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\HK_SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class ClassMethodConfig extends Model
{
    // 加固类名
    /**
     * @example class_name
     *
     * @var string
     */
    public $className;

    // 方法集合，使用英文逗号分隔
    /**
     * @example methods
     *
     * @var string
     */
    public $methods;
    protected $_name = [
        'className' => 'class_name',
        'methods'   => 'methods',
    ];

    public function validate()
    {
        Model::validateRequired('className', $this->className, true);
        Model::validateRequired('methods', $this->methods, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->className) {
            $res['class_name'] = $this->className;
        }
        if (null !== $this->methods) {
            $res['methods'] = $this->methods;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ClassMethodConfig
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['class_name'])) {
            $model->className = $map['class_name'];
        }
        if (isset($map['methods'])) {
            $model->methods = $map['methods'];
        }

        return $model;
    }
}
