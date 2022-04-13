<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class LoadBalancerListenerWithRule extends Model
{
    // 统一接入域名。
    /**
     * @example alipay.net
     *
     * @var string
     */
    public $domain;

    // 负载均衡监听。
    /**
     * @example {}
     *
     * @var LoadBalancerListener
     */
    public $listener;

    // 转发路径。
    /**
     * @example /urlpath
     *
     * @var string
     */
    public $path;

    // 权重。
    /**
     * @example 50
     *
     * @var int
     */
    public $weight;
    protected $_name = [
        'domain'   => 'domain',
        'listener' => 'listener',
        'path'     => 'path',
        'weight'   => 'weight',
    ];

    public function validate()
    {
        Model::validateRequired('domain', $this->domain, true);
        Model::validateRequired('listener', $this->listener, true);
        Model::validateRequired('path', $this->path, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->domain) {
            $res['domain'] = $this->domain;
        }
        if (null !== $this->listener) {
            $res['listener'] = null !== $this->listener ? $this->listener->toMap() : null;
        }
        if (null !== $this->path) {
            $res['path'] = $this->path;
        }
        if (null !== $this->weight) {
            $res['weight'] = $this->weight;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return LoadBalancerListenerWithRule
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['domain'])) {
            $model->domain = $map['domain'];
        }
        if (isset($map['listener'])) {
            $model->listener = LoadBalancerListener::fromMap($map['listener']);
        }
        if (isset($map['path'])) {
            $model->path = $map['path'];
        }
        if (isset($map['weight'])) {
            $model->weight = $map['weight'];
        }

        return $model;
    }
}
