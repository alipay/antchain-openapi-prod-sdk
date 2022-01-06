<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class TransparentProxyProtocolModel extends Model
{
    // 端口
    /**
     * @example 80
     *
     * @var int
     */
    public $port;

    // 协议
    /**
     * @example http
     *
     * @var string
     */
    public $protocol;
    protected $_name = [
        'port'     => 'port',
        'protocol' => 'protocol',
    ];

    public function validate()
    {
        Model::validateRequired('port', $this->port, true);
        Model::validateRequired('protocol', $this->protocol, true);
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TransparentProxyProtocolModel
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

        return $model;
    }
}
