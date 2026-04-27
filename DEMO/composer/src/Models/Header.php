<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMO\Models;

use AlibabaCloud\Tea\Model;

class Header extends Model
{
    // 身份信息
    /**
     * @example "identity": {       "ak": "test_0efe42463f8f"     }
     *
     * @var Identity
     */
    public $identity;

    // 调用链编号
    /**
     * @example test_6db79b5d2e48
     *
     * @var string
     */
    public $traceId;

    // host信息
    /**
     * @example "host": {       "systemName": "test_2e1ae924805f",       "address": "test_941f18a4013b"     }
     *
     * @var Host
     */
    public $host;

    // 方向
    /**
     * @example REQUEST
     *
     * @var string
     */
    public $direction;

    // 请求类型
    /**
     * @example INVOKE
     *
     * @var string
     */
    public $requestType;

    // 协议版本
    /**
     * @example test_6709e9002606
     *
     * @var string
     */
    public $protocolVersion;
    protected $_name = [
        'identity'        => 'identity',
        'traceId'         => 'trace_id',
        'host'            => 'host',
        'direction'       => 'direction',
        'requestType'     => 'request_type',
        'protocolVersion' => 'protocol_version',
    ];

    public function validate()
    {
        Model::validateRequired('identity', $this->identity, true);
        Model::validateRequired('traceId', $this->traceId, true);
        Model::validateRequired('host', $this->host, true);
        Model::validateRequired('direction', $this->direction, true);
        Model::validateRequired('requestType', $this->requestType, true);
        Model::validateRequired('protocolVersion', $this->protocolVersion, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->identity) {
            $res['identity'] = null !== $this->identity ? $this->identity->toMap() : null;
        }
        if (null !== $this->traceId) {
            $res['trace_id'] = $this->traceId;
        }
        if (null !== $this->host) {
            $res['host'] = null !== $this->host ? $this->host->toMap() : null;
        }
        if (null !== $this->direction) {
            $res['direction'] = $this->direction;
        }
        if (null !== $this->requestType) {
            $res['request_type'] = $this->requestType;
        }
        if (null !== $this->protocolVersion) {
            $res['protocol_version'] = $this->protocolVersion;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Header
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['identity'])) {
            $model->identity = Identity::fromMap($map['identity']);
        }
        if (isset($map['trace_id'])) {
            $model->traceId = $map['trace_id'];
        }
        if (isset($map['host'])) {
            $model->host = Host::fromMap($map['host']);
        }
        if (isset($map['direction'])) {
            $model->direction = $map['direction'];
        }
        if (isset($map['request_type'])) {
            $model->requestType = $map['request_type'];
        }
        if (isset($map['protocol_version'])) {
            $model->protocolVersion = $map['protocol_version'];
        }

        return $model;
    }
}
