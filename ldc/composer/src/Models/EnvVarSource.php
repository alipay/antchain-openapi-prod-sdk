<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class EnvVarSource extends Model
{
    // 对应的ConfigMap或Secret名称。
    /**
     * @example app_config
     *
     * @var string
     */
    public $objectName;

    // 对应的Object类型。
    // 取值：ConfigMap | Secret
    /**
     * @example ConfigMap | Secret
     *
     * @var string
     */
    public $objectType;

    // 引用的ConfigMap或则Secret的key。
    /**
     * @example data
     *
     * @var string
     */
    public $key;
    protected $_name = [
        'objectName' => 'object_name',
        'objectType' => 'object_type',
        'key'        => 'key',
    ];

    public function validate()
    {
        Model::validateRequired('objectName', $this->objectName, true);
        Model::validateRequired('objectType', $this->objectType, true);
        Model::validateRequired('key', $this->key, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->objectName) {
            $res['object_name'] = $this->objectName;
        }
        if (null !== $this->objectType) {
            $res['object_type'] = $this->objectType;
        }
        if (null !== $this->key) {
            $res['key'] = $this->key;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EnvVarSource
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['object_name'])) {
            $model->objectName = $map['object_name'];
        }
        if (isset($map['object_type'])) {
            $model->objectType = $map['object_type'];
        }
        if (isset($map['key'])) {
            $model->key = $map['key'];
        }

        return $model;
    }
}
