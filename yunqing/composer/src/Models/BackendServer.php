<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class BackendServer extends Model
{
    // 容器id。
    /**
     * @example 006ca7547c991d2a5bee2167552fc5058f92aea3fb2ce534394172e21af01055
     *
     * @var string
     */
    public $containerId;

    // 容器所在的资源池id。
    /**
     * @example yysit-ake
     *
     * @var string
     */
    public $containerResourcePoolId;

    // 资源池id。
    /**
     * @example lb-ant58sit
     *
     * @var string
     */
    public $lbResourcePoolId;

    // 负载均衡实例id。
    /**
     * @example f6a614f448f4019f72d1438305ce2e742c345fc3496399af6fe38d1e0615f1f1
     *
     * @var string
     */
    public $loadBalancerId;

    // 权重。
    /**
     * @example 100
     *
     * @var int
     */
    public $weight;
    protected $_name = [
        'containerId'             => 'container_id',
        'containerResourcePoolId' => 'container_resource_pool_id',
        'lbResourcePoolId'        => 'lb_resource_pool_id',
        'loadBalancerId'          => 'load_balancer_id',
        'weight'                  => 'weight',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->containerId) {
            $res['container_id'] = $this->containerId;
        }
        if (null !== $this->containerResourcePoolId) {
            $res['container_resource_pool_id'] = $this->containerResourcePoolId;
        }
        if (null !== $this->lbResourcePoolId) {
            $res['lb_resource_pool_id'] = $this->lbResourcePoolId;
        }
        if (null !== $this->loadBalancerId) {
            $res['load_balancer_id'] = $this->loadBalancerId;
        }
        if (null !== $this->weight) {
            $res['weight'] = $this->weight;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BackendServer
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['container_id'])) {
            $model->containerId = $map['container_id'];
        }
        if (isset($map['container_resource_pool_id'])) {
            $model->containerResourcePoolId = $map['container_resource_pool_id'];
        }
        if (isset($map['lb_resource_pool_id'])) {
            $model->lbResourcePoolId = $map['lb_resource_pool_id'];
        }
        if (isset($map['load_balancer_id'])) {
            $model->loadBalancerId = $map['load_balancer_id'];
        }
        if (isset($map['weight'])) {
            $model->weight = $map['weight'];
        }

        return $model;
    }
}
