<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class LoadBalancer extends Model
{
    // 地址类型。INTRANET/INTERNET/OFFICE
    /**
     * @example INTRANET
     *
     * @var string
     */
    public $addressType;

    // 后端服务器列表。
    /**
     * @example
     *
     * @var BackendServer[]
     */
    public $backendServers;

    // 实例域名。
    /**
     * @example aciamcore_intranet_vip.alipay.net
     *
     * @var string
     */
    public $domain;

    // 监听器列表。
    /**
     * @example
     *
     * @var Listener[]
     */
    public $listeners;

    // 实例名称。
    /**
     * @example acgotonecore_lb_-2329718886441325351
     *
     * @var string
     */
    public $name;

    // 类型。SLB/ALB。
    /**
     * @example SLB
     *
     * @var string
     */
    public $provider;

    // 实例id。
    /**
     * @example a46d1a9f673808298ca1e8bd363bf8b82ce5f7473544b4b8a3a0adf12c8d1dfa
     *
     * @var string
     */
    public $resourceId;

    // 资源池id。
    /**
     * @example lb-ant58sit
     *
     * @var string
     */
    public $resourcePoolId;

    // vip地址。
    /**
     * @example 11.162.163.190
     *
     * @var string
     */
    public $vip;
    protected $_name = [
        'addressType'    => 'address_type',
        'backendServers' => 'backend_servers',
        'domain'         => 'domain',
        'listeners'      => 'listeners',
        'name'           => 'name',
        'provider'       => 'provider',
        'resourceId'     => 'resource_id',
        'resourcePoolId' => 'resource_pool_id',
        'vip'            => 'vip',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->addressType) {
            $res['address_type'] = $this->addressType;
        }
        if (null !== $this->backendServers) {
            $res['backend_servers'] = [];
            if (null !== $this->backendServers && \is_array($this->backendServers)) {
                $n = 0;
                foreach ($this->backendServers as $item) {
                    $res['backend_servers'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->domain) {
            $res['domain'] = $this->domain;
        }
        if (null !== $this->listeners) {
            $res['listeners'] = [];
            if (null !== $this->listeners && \is_array($this->listeners)) {
                $n = 0;
                foreach ($this->listeners as $item) {
                    $res['listeners'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->provider) {
            $res['provider'] = $this->provider;
        }
        if (null !== $this->resourceId) {
            $res['resource_id'] = $this->resourceId;
        }
        if (null !== $this->resourcePoolId) {
            $res['resource_pool_id'] = $this->resourcePoolId;
        }
        if (null !== $this->vip) {
            $res['vip'] = $this->vip;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return LoadBalancer
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['address_type'])) {
            $model->addressType = $map['address_type'];
        }
        if (isset($map['backend_servers'])) {
            if (!empty($map['backend_servers'])) {
                $model->backendServers = [];
                $n                     = 0;
                foreach ($map['backend_servers'] as $item) {
                    $model->backendServers[$n++] = null !== $item ? BackendServer::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['domain'])) {
            $model->domain = $map['domain'];
        }
        if (isset($map['listeners'])) {
            if (!empty($map['listeners'])) {
                $model->listeners = [];
                $n                = 0;
                foreach ($map['listeners'] as $item) {
                    $model->listeners[$n++] = null !== $item ? Listener::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['provider'])) {
            $model->provider = $map['provider'];
        }
        if (isset($map['resource_id'])) {
            $model->resourceId = $map['resource_id'];
        }
        if (isset($map['resource_pool_id'])) {
            $model->resourcePoolId = $map['resource_pool_id'];
        }
        if (isset($map['vip'])) {
            $model->vip = $map['vip'];
        }

        return $model;
    }
}
