<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class TransparentProxyProtocolVo extends Model
{
    // 最大请求数
    /**
     * @example 1000
     *
     * @var int
     */
    public $maxReq;

    // 端口
    /**
     * @example 80
     *
     * @var int
     */
    public $port;

    // 协议
    /**
     * @example HTTP
     *
     * @var string
     */
    public $protocol;
    protected $_name = [
        'maxReq'   => 'max_req',
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
        if (null !== $this->maxReq) {
            $res['max_req'] = $this->maxReq;
        }
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
     * @return TransparentProxyProtocolVo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['max_req'])) {
            $model->maxReq = $map['max_req'];
        }
        if (isset($map['port'])) {
            $model->port = $map['port'];
        }
        if (isset($map['protocol'])) {
            $model->protocol = $map['protocol'];
        }

        return $model;
    }
}
