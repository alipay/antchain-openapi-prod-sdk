<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class HttpsEntry extends Model
{
    // 端口
    /**
     * @example 443
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

    // CA证书ID
    /**
     * @example 139a00604ad-cn-east-hangzhou-01
     *
     * @var string
     */
    public $caCertificateId;
    protected $_name = [
        'port'             => 'port',
        'websocketConnect' => 'websocket_connect',
        'caCertificateId'  => 'ca_certificate_id',
    ];

    public function validate()
    {
        Model::validateRequired('port', $this->port, true);
        Model::validateRequired('websocketConnect', $this->websocketConnect, true);
        Model::validateRequired('caCertificateId', $this->caCertificateId, true);
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
        if (null !== $this->caCertificateId) {
            $res['ca_certificate_id'] = $this->caCertificateId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return HttpsEntry
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
        if (isset($map['ca_certificate_id'])) {
            $model->caCertificateId = $map['ca_certificate_id'];
        }

        return $model;
    }
}
