<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class ServicePort extends Model
{
    // 此端口映射名称
    /**
     * @example http-port-1
     *
     * @var string
     */
    public $name;

    // service端口映射在k8s层面的协议名，包括"TCP", "UDP", and "SCTP".
    /**
     * @example tcp
     *
     * @var string
     */
    public $protocol;

    // service端口映射前端端口
    /**
     * @example 80
     *
     * @var int
     */
    public $port;

    // service分配到的节点端口
    /**
     * @example 34568
     *
     * @var int
     */
    public $nodePort;

    // 后端端口，这里仅支持整数类型
    /**
     * @example 8080
     *
     * @var int
     */
    public $targetPort;
    protected $_name = [
        'name'       => 'name',
        'protocol'   => 'protocol',
        'port'       => 'port',
        'nodePort'   => 'node_port',
        'targetPort' => 'target_port',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('port', $this->port, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->protocol) {
            $res['protocol'] = $this->protocol;
        }
        if (null !== $this->port) {
            $res['port'] = $this->port;
        }
        if (null !== $this->nodePort) {
            $res['node_port'] = $this->nodePort;
        }
        if (null !== $this->targetPort) {
            $res['target_port'] = $this->targetPort;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ServicePort
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['protocol'])) {
            $model->protocol = $map['protocol'];
        }
        if (isset($map['port'])) {
            $model->port = $map['port'];
        }
        if (isset($map['node_port'])) {
            $model->nodePort = $map['node_port'];
        }
        if (isset($map['target_port'])) {
            $model->targetPort = $map['target_port'];
        }

        return $model;
    }
}
