<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class EnvVarClusterOverride extends Model
{
    // 环境变量名称
    /**
     * @example db_url
     *
     * @var string
     */
    public $name;

    // 环境变量取值
    /**
     * @example test
     *
     * @var string
     */
    public $value;

    // Pod容器名称
    /**
     * @example busybox
     *
     * @var string
     */
    public $containerName;
    protected $_name = [
        'name'          => 'name',
        'value'         => 'value',
        'containerName' => 'container_name',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('value', $this->value, true);
        Model::validateRequired('containerName', $this->containerName, true);
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
        if (null !== $this->containerName) {
            $res['container_name'] = $this->containerName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EnvVarClusterOverride
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
        if (isset($map['container_name'])) {
            $model->containerName = $map['container_name'];
        }

        return $model;
    }
}
