<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class ProbeConfig extends Model
{
    // 超时时间，单位s
    /**
     * @example 10
     *
     * @var string
     */
    public $timeout;

    // exec
    /**
     * @example
     *
     * @var Exec
     */
    public $exec;

    // http
    /**
     * @example
     *
     * @var HTTP
     */
    public $http;

    // tcp
    /**
     * @example
     *
     * @var TCP
     */
    public $tcp;
    protected $_name = [
        'timeout' => 'timeout',
        'exec'    => 'exec',
        'http'    => 'http',
        'tcp'     => 'tcp',
    ];

    public function validate()
    {
        Model::validateRequired('timeout', $this->timeout, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->timeout) {
            $res['timeout'] = $this->timeout;
        }
        if (null !== $this->exec) {
            $res['exec'] = null !== $this->exec ? $this->exec->toMap() : null;
        }
        if (null !== $this->http) {
            $res['http'] = null !== $this->http ? $this->http->toMap() : null;
        }
        if (null !== $this->tcp) {
            $res['tcp'] = null !== $this->tcp ? $this->tcp->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ProbeConfig
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['timeout'])) {
            $model->timeout = $map['timeout'];
        }
        if (isset($map['exec'])) {
            $model->exec = Exec::fromMap($map['exec']);
        }
        if (isset($map['http'])) {
            $model->http = HTTP::fromMap($map['http']);
        }
        if (isset($map['tcp'])) {
            $model->tcp = TCP::fromMap($map['tcp']);
        }

        return $model;
    }
}
