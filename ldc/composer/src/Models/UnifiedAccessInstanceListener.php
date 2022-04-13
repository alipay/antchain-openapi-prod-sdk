<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class UnifiedAccessInstanceListener extends Model
{
    // CA证书ID。 若既上传CA证书又上传服务器证书，即采用双向认证。 若用户只上传服务器证书，即为单向认证。
    /**
     * @example 139a00604ad-cn-east-hangzhou-01
     *
     * @var string
     */
    public $caCertificateId;

    // 统一接入实例监听端口。 取值：1-65535。
    /**
     * @example 80
     *
     * @var int
     */
    public $listenerPort;

    // 协议类型，目前支持http和https两种
    /**
     * @example http
     *
     * @var string
     */
    public $protocol;

    // 是否使用websocket连接方式
    /**
     * @example true, false
     *
     * @var bool
     */
    public $websocketConnect;
    protected $_name = [
        'caCertificateId'  => 'ca_certificate_id',
        'listenerPort'     => 'listener_port',
        'protocol'         => 'protocol',
        'websocketConnect' => 'websocket_connect',
    ];

    public function validate()
    {
        Model::validateRequired('listenerPort', $this->listenerPort, true);
        Model::validateRequired('protocol', $this->protocol, true);
        Model::validateRequired('websocketConnect', $this->websocketConnect, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->caCertificateId) {
            $res['ca_certificate_id'] = $this->caCertificateId;
        }
        if (null !== $this->listenerPort) {
            $res['listener_port'] = $this->listenerPort;
        }
        if (null !== $this->protocol) {
            $res['protocol'] = $this->protocol;
        }
        if (null !== $this->websocketConnect) {
            $res['websocket_connect'] = $this->websocketConnect;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UnifiedAccessInstanceListener
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['ca_certificate_id'])) {
            $model->caCertificateId = $map['ca_certificate_id'];
        }
        if (isset($map['listener_port'])) {
            $model->listenerPort = $map['listener_port'];
        }
        if (isset($map['protocol'])) {
            $model->protocol = $map['protocol'];
        }
        if (isset($map['websocket_connect'])) {
            $model->websocketConnect = $map['websocket_connect'];
        }

        return $model;
    }
}
