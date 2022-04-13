<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class UnifiedAccessInstanceContainerServiceInfo extends Model
{
    // 应用服务名称
    /**
     * @example name
     *
     * @var string
     */
    public $containerServiceName;

    // 命名空间
    /**
     * @example namespace
     *
     * @var string
     */
    public $namespace;
    protected $_name = [
        'containerServiceName' => 'container_service_name',
        'namespace'            => 'namespace',
    ];

    public function validate()
    {
        Model::validateRequired('containerServiceName', $this->containerServiceName, true);
        Model::validateRequired('namespace', $this->namespace, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->containerServiceName) {
            $res['container_service_name'] = $this->containerServiceName;
        }
        if (null !== $this->namespace) {
            $res['namespace'] = $this->namespace;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UnifiedAccessInstanceContainerServiceInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['container_service_name'])) {
            $model->containerServiceName = $map['container_service_name'];
        }
        if (isset($map['namespace'])) {
            $model->namespace = $map['namespace'];
        }

        return $model;
    }
}
