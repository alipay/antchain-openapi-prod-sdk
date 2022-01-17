<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APIGATEWAY\Models;

use AlibabaCloud\Tea\Model;

class ProtocolVO extends Model
{
    // 协议类型
    /**
     * @example HTTP、RPC、DUBBO
     *
     * @var string
     */
    public $protocol;

    // 端口
    /**
     * @example 80
     *
     * @var string
     */
    public $port;
    protected $_name = [
        'protocol' => 'protocol',
        'port'     => 'port',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->protocol) {
            $res['protocol'] = $this->protocol;
        }
        if (null !== $this->port) {
            $res['port'] = $this->port;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ProtocolVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['protocol'])) {
            $model->protocol = $map['protocol'];
        }
        if (isset($map['port'])) {
            $model->port = $map['port'];
        }

        return $model;
    }
}
