<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class ServiceStatus extends Model
{
    // 负载均衡地址
    /**
     * @example 10.4.0.229
     *
     * @var string
     */
    public $loadBalancerIp;
    protected $_name = [
        'loadBalancerIp' => 'load_balancer_ip',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->loadBalancerIp) {
            $res['load_balancer_ip'] = $this->loadBalancerIp;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ServiceStatus
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['load_balancer_ip'])) {
            $model->loadBalancerIp = $map['load_balancer_ip'];
        }

        return $model;
    }
}
