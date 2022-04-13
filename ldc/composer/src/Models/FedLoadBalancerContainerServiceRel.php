<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class FedLoadBalancerContainerServiceRel extends Model
{
    // 应用服务名字
    /**
     * @example app_service_example
     *
     * @var string
     */
    public $containerServiceName;

    // 应用服务命名空间
    /**
     * @example antcloud-test-default
     *
     * @var string
     */
    public $namespace;

    // 联邦负载均衡实例当前已被占用的端口
    /**
     * @example [80, 443, 8080]
     *
     * @var int[]
     */
    public $occupiedPorts;
    protected $_name = [
        'containerServiceName' => 'container_service_name',
        'namespace'            => 'namespace',
        'occupiedPorts'        => 'occupied_ports',
    ];

    public function validate()
    {
        Model::validateRequired('containerServiceName', $this->containerServiceName, true);
        Model::validateRequired('namespace', $this->namespace, true);
        Model::validateRequired('occupiedPorts', $this->occupiedPorts, true);
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
        if (null !== $this->occupiedPorts) {
            $res['occupied_ports'] = $this->occupiedPorts;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FedLoadBalancerContainerServiceRel
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
        if (isset($map['occupied_ports'])) {
            if (!empty($map['occupied_ports'])) {
                $model->occupiedPorts = $map['occupied_ports'];
            }
        }

        return $model;
    }
}
