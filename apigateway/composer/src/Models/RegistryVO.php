<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APIGATEWAY\Models;

use AlibabaCloud\Tea\Model;

class RegistryVO extends Model
{
    // host
    /**
     * @example hz-gw-host-egress
     *
     * @var string
     */
    public $host;

    // protocol_support
    /**
     * @example [{“protocol”:“HTTP”,"port":"80"}]
     *
     * @var ProtocolVO[]
     */
    public $protocolSupport;

    // 注册中心类型
    /**
     * @example dsr 、nacos、 none
     *
     * @var string
     */
    public $type;
    protected $_name = [
        'host'            => 'host',
        'protocolSupport' => 'protocol_support',
        'type'            => 'type',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->host) {
            $res['host'] = $this->host;
        }
        if (null !== $this->protocolSupport) {
            $res['protocol_support'] = [];
            if (null !== $this->protocolSupport && \is_array($this->protocolSupport)) {
                $n = 0;
                foreach ($this->protocolSupport as $item) {
                    $res['protocol_support'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RegistryVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['host'])) {
            $model->host = $map['host'];
        }
        if (isset($map['protocol_support'])) {
            if (!empty($map['protocol_support'])) {
                $model->protocolSupport = [];
                $n                      = 0;
                foreach ($map['protocol_support'] as $item) {
                    $model->protocolSupport[$n++] = null !== $item ? ProtocolVO::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }

        return $model;
    }
}
