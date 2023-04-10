<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\FAIROPENNET\Models;

use AlibabaCloud\Tea\Model;

class FairComputeClientConfig extends Model
{
    // 服务host
    /**
     * @example ""
     *
     * @var string
     */
    public $host;

    // 服务端口
    /**
     * @example
     *
     * @var int
     */
    public $port;

    // TLS连接配置【暂不支持】
    /**
     * @example ""
     *
     * @var string
     */
    public $sslCertChain;

    // TLS连接配置【暂不支持】
    /**
     * @example ""
     *
     * @var string
     */
    public $sslPrivateKey;

    // TLS连接配置【暂不支持】
    /**
     * @example ""
     *
     * @var string
     */
    public $sslTrustCertCollection;

    // TLS连接配置【暂不支持】
    /**
     * @example ""
     *
     * @var string
     */
    public $sslAuthority;
    protected $_name = [
        'host'                   => 'host',
        'port'                   => 'port',
        'sslCertChain'           => 'ssl_cert_chain',
        'sslPrivateKey'          => 'ssl_private_key',
        'sslTrustCertCollection' => 'ssl_trust_cert_collection',
        'sslAuthority'           => 'ssl_authority',
    ];

    public function validate()
    {
        Model::validateRequired('host', $this->host, true);
        Model::validateRequired('port', $this->port, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->host) {
            $res['host'] = $this->host;
        }
        if (null !== $this->port) {
            $res['port'] = $this->port;
        }
        if (null !== $this->sslCertChain) {
            $res['ssl_cert_chain'] = $this->sslCertChain;
        }
        if (null !== $this->sslPrivateKey) {
            $res['ssl_private_key'] = $this->sslPrivateKey;
        }
        if (null !== $this->sslTrustCertCollection) {
            $res['ssl_trust_cert_collection'] = $this->sslTrustCertCollection;
        }
        if (null !== $this->sslAuthority) {
            $res['ssl_authority'] = $this->sslAuthority;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FairComputeClientConfig
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['host'])) {
            $model->host = $map['host'];
        }
        if (isset($map['port'])) {
            $model->port = $map['port'];
        }
        if (isset($map['ssl_cert_chain'])) {
            $model->sslCertChain = $map['ssl_cert_chain'];
        }
        if (isset($map['ssl_private_key'])) {
            $model->sslPrivateKey = $map['ssl_private_key'];
        }
        if (isset($map['ssl_trust_cert_collection'])) {
            $model->sslTrustCertCollection = $map['ssl_trust_cert_collection'];
        }
        if (isset($map['ssl_authority'])) {
            $model->sslAuthority = $map['ssl_authority'];
        }

        return $model;
    }
}
