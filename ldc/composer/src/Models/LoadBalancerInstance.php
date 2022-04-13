<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class LoadBalancerInstance extends Model
{
    // 负责均衡iaas id。
    /**
     * @example lb-12345678
     *
     * @var string
     */
    public $iaasId;

    // 监听器。
    /**
     * @example [{}]
     *
     * @var LoadBalancerListener[]
     */
    public $listeners;

    // 负载均衡名称。
    /**
     * @example test-lb
     *
     * @var string
     */
    public $name;

    // 负责均衡PAAS id。
    /**
     * @example 1234567
     *
     * @var string
     */
    public $paasId;

    // 负责均衡类型。
    /**
     * @example INTERNET
     *
     * @var string
     */
    public $type;

    // 负载均衡vip地址。
    /**
     * @example []
     *
     * @var string[]
     */
    public $vipAddresses;

    // 统一接入域名。
    /**
     * @example alipay.net
     *
     * @var string
     */
    public $domain;
    protected $_name = [
        'iaasId'       => 'iaas_id',
        'listeners'    => 'listeners',
        'name'         => 'name',
        'paasId'       => 'paas_id',
        'type'         => 'type',
        'vipAddresses' => 'vip_addresses',
        'domain'       => 'domain',
    ];

    public function validate()
    {
        Model::validateRequired('iaasId', $this->iaasId, true);
        Model::validateRequired('listeners', $this->listeners, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('domain', $this->domain, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->iaasId) {
            $res['iaas_id'] = $this->iaasId;
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
        if (null !== $this->paasId) {
            $res['paas_id'] = $this->paasId;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->vipAddresses) {
            $res['vip_addresses'] = $this->vipAddresses;
        }
        if (null !== $this->domain) {
            $res['domain'] = $this->domain;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return LoadBalancerInstance
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['iaas_id'])) {
            $model->iaasId = $map['iaas_id'];
        }
        if (isset($map['listeners'])) {
            if (!empty($map['listeners'])) {
                $model->listeners = [];
                $n                = 0;
                foreach ($map['listeners'] as $item) {
                    $model->listeners[$n++] = null !== $item ? LoadBalancerListener::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['paas_id'])) {
            $model->paasId = $map['paas_id'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['vip_addresses'])) {
            if (!empty($map['vip_addresses'])) {
                $model->vipAddresses = $map['vip_addresses'];
            }
        }
        if (isset($map['domain'])) {
            $model->domain = $map['domain'];
        }

        return $model;
    }
}
