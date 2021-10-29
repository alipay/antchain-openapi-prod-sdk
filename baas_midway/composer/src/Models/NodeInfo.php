<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAAS_MIDWAY\Models;

use AlibabaCloud\Tea\Model;

class NodeInfo extends Model
{
    // 公网IP
    /**
     * @example 47.117.118.62
     *
     * @var string
     */
    public $publicIp;

    // 内网IP
    /**
     * @example 127.0.0.1
     *
     * @var string
     */
    public $privateIp;

    // 连接端口
    /**
     * @example 18130
     *
     * @var string
     */
    public $clientPort;

    // 共识端口
    /**
     * @example 18230
     *
     * @var string
     */
    public $p2pPort;
    protected $_name = [
        'publicIp'   => 'public_ip',
        'privateIp'  => 'private_ip',
        'clientPort' => 'client_port',
        'p2pPort'    => 'p2p_port',
    ];

    public function validate()
    {
        Model::validateRequired('publicIp', $this->publicIp, true);
        Model::validateRequired('privateIp', $this->privateIp, true);
        Model::validateRequired('clientPort', $this->clientPort, true);
        Model::validateRequired('p2pPort', $this->p2pPort, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->publicIp) {
            $res['public_ip'] = $this->publicIp;
        }
        if (null !== $this->privateIp) {
            $res['private_ip'] = $this->privateIp;
        }
        if (null !== $this->clientPort) {
            $res['client_port'] = $this->clientPort;
        }
        if (null !== $this->p2pPort) {
            $res['p2p_port'] = $this->p2pPort;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NodeInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['public_ip'])) {
            $model->publicIp = $map['public_ip'];
        }
        if (isset($map['private_ip'])) {
            $model->privateIp = $map['private_ip'];
        }
        if (isset($map['client_port'])) {
            $model->clientPort = $map['client_port'];
        }
        if (isset($map['p2p_port'])) {
            $model->p2pPort = $map['p2p_port'];
        }

        return $model;
    }
}
