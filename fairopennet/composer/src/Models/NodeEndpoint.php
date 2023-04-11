<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\FAIROPENNET\Models;

use AlibabaCloud\Tea\Model;

class NodeEndpoint extends Model
{
    /**
     * @example
     *
     * @var string
     */
    public $ip;

    /**
     * @example
     *
     * @var string
     */
    public $port;
    protected $_name = [
        'ip'   => 'ip',
        'port' => 'port',
    ];

    public function validate()
    {
        Model::validateRequired('ip', $this->ip, true);
        Model::validateRequired('port', $this->port, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->ip) {
            $res['ip'] = $this->ip;
        }
        if (null !== $this->port) {
            $res['port'] = $this->port;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NodeEndpoint
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['ip'])) {
            $model->ip = $map['ip'];
        }
        if (isset($map['port'])) {
            $model->port = $map['port'];
        }

        return $model;
    }
}
