<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class ServicePortMapping extends Model
{
    // 访问配置前端端口。
    /**
     * @example 80
     *
     * @var int
     */
    public $port;

    // 访问配置协议。
    /**
     * @example TCP
     *
     * @var string
     */
    public $protocol;

    // 访问配置后端端口。
    /**
     * @example 80
     *
     * @var int
     */
    public $targetPort;
    protected $_name = [
        'port'       => 'port',
        'protocol'   => 'protocol',
        'targetPort' => 'target_port',
    ];

    public function validate()
    {
        Model::validateRequired('port', $this->port, true);
        Model::validateRequired('protocol', $this->protocol, true);
        Model::validateRequired('targetPort', $this->targetPort, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->port) {
            $res['port'] = $this->port;
        }
        if (null !== $this->protocol) {
            $res['protocol'] = $this->protocol;
        }
        if (null !== $this->targetPort) {
            $res['target_port'] = $this->targetPort;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ServicePortMapping
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['port'])) {
            $model->port = $map['port'];
        }
        if (isset($map['protocol'])) {
            $model->protocol = $map['protocol'];
        }
        if (isset($map['target_port'])) {
            $model->targetPort = $map['target_port'];
        }

        return $model;
    }
}
