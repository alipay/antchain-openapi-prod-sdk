<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class Listener extends Model
{
    // 后端端口。
    /**
     * @example 80
     *
     * @var int
     */
    public $backendServerPort;

    // 前端端口。
    /**
     * @example 80
     *
     * @var int
     */
    public $listenerPort;

    // 负载均衡实例id。
    /**
     * @example a46d1a9f673808298ca1e8bd363bf8b82ce5f7473544b4b8a3a0adf12c8d1dfa
     *
     * @var string
     */
    public $loadBalancerId;

    // 监听器协议。HTTP/HTTPS/TCP
    /**
     * @example HTTP
     *
     * @var string
     */
    public $protocol;

    // 资源池id。
    /**
     * @example lb-ant58sit
     *
     * @var string
     */
    public $resourcePoolId;
    protected $_name = [
        'backendServerPort' => 'backend_server_port',
        'listenerPort'      => 'listener_port',
        'loadBalancerId'    => 'load_balancer_id',
        'protocol'          => 'protocol',
        'resourcePoolId'    => 'resource_pool_id',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->backendServerPort) {
            $res['backend_server_port'] = $this->backendServerPort;
        }
        if (null !== $this->listenerPort) {
            $res['listener_port'] = $this->listenerPort;
        }
        if (null !== $this->loadBalancerId) {
            $res['load_balancer_id'] = $this->loadBalancerId;
        }
        if (null !== $this->protocol) {
            $res['protocol'] = $this->protocol;
        }
        if (null !== $this->resourcePoolId) {
            $res['resource_pool_id'] = $this->resourcePoolId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Listener
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['backend_server_port'])) {
            $model->backendServerPort = $map['backend_server_port'];
        }
        if (isset($map['listener_port'])) {
            $model->listenerPort = $map['listener_port'];
        }
        if (isset($map['load_balancer_id'])) {
            $model->loadBalancerId = $map['load_balancer_id'];
        }
        if (isset($map['protocol'])) {
            $model->protocol = $map['protocol'];
        }
        if (isset($map['resource_pool_id'])) {
            $model->resourcePoolId = $map['resource_pool_id'];
        }

        return $model;
    }
}
