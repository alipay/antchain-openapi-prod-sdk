<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class ConnectionDTO extends Model
{
    // 该消费实例的地址和端口
    /**
     * @example 30.5.121.**
     *
     * @var string
     */
    public $clientAddr;

    // 消费实例的 ID
    /**
     * @example 30.5.121.**@25560#-1999745829#-1737591554#458773089270275
     *
     * @var string
     */
    public $clientId;

    // 消费端语言
    /**
     * @example JAVA
     *
     * @var string
     */
    public $language;

    // 宿主机 IP 或公网 IP
    /**
     * @example 42.120.74.**
     *
     * @var string
     */
    public $remoteIp;

    // 消费端版本
    /**
     * @example V4_3_6_SNAPSHOT
     *
     * @var string
     */
    public $version;
    protected $_name = [
        'clientAddr' => 'client_addr',
        'clientId'   => 'client_id',
        'language'   => 'language',
        'remoteIp'   => 'remote_ip',
        'version'    => 'version',
    ];

    public function validate()
    {
        Model::validateRequired('clientAddr', $this->clientAddr, true);
        Model::validateRequired('clientId', $this->clientId, true);
        Model::validateRequired('language', $this->language, true);
        Model::validateRequired('remoteIp', $this->remoteIp, true);
        Model::validateRequired('version', $this->version, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->clientAddr) {
            $res['client_addr'] = $this->clientAddr;
        }
        if (null !== $this->clientId) {
            $res['client_id'] = $this->clientId;
        }
        if (null !== $this->language) {
            $res['language'] = $this->language;
        }
        if (null !== $this->remoteIp) {
            $res['remote_ip'] = $this->remoteIp;
        }
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ConnectionDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['client_addr'])) {
            $model->clientAddr = $map['client_addr'];
        }
        if (isset($map['client_id'])) {
            $model->clientId = $map['client_id'];
        }
        if (isset($map['language'])) {
            $model->language = $map['language'];
        }
        if (isset($map['remote_ip'])) {
            $model->remoteIp = $map['remote_ip'];
        }
        if (isset($map['version'])) {
            $model->version = $map['version'];
        }

        return $model;
    }
}
