<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class HttpEntry extends Model
{
    // 端口
    /**
     * @example 80
     *
     * @var int
     */
    public $port;

    // 是否使用websocket连接方式
    /**
     * @example true, false
     *
     * @var bool
     */
    public $websocketConnect;
    protected $_name = [
        'port'             => 'port',
        'websocketConnect' => 'websocket_connect',
    ];

    public function validate()
    {
        Model::validateRequired('port', $this->port, true);
        Model::validateRequired('websocketConnect', $this->websocketConnect, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->port) {
            $res['port'] = $this->port;
        }
        if (null !== $this->websocketConnect) {
            $res['websocket_connect'] = $this->websocketConnect;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return HttpEntry
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['port'])) {
            $model->port = $map['port'];
        }
        if (isset($map['websocket_connect'])) {
            $model->websocketConnect = $map['websocket_connect'];
        }

        return $model;
    }
}
