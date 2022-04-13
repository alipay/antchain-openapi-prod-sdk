<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class HttpGetAction extends Model
{
    // 健康检查url地址。
    /**
     * @example /checkService
     *
     * @var string
     */
    public $path;

    // 健康检查端口。
    /**
     * @example 80
     *
     * @var string
     */
    public $port;

    // 协议类型，http/https。
    /**
     * @example http
     *
     * @var string
     */
    public $scheme;
    protected $_name = [
        'path'   => 'path',
        'port'   => 'port',
        'scheme' => 'scheme',
    ];

    public function validate()
    {
        Model::validateRequired('path', $this->path, true);
        Model::validateRequired('port', $this->port, true);
        Model::validateRequired('scheme', $this->scheme, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->path) {
            $res['path'] = $this->path;
        }
        if (null !== $this->port) {
            $res['port'] = $this->port;
        }
        if (null !== $this->scheme) {
            $res['scheme'] = $this->scheme;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return HttpGetAction
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['path'])) {
            $model->path = $map['path'];
        }
        if (isset($map['port'])) {
            $model->port = $map['port'];
        }
        if (isset($map['scheme'])) {
            $model->scheme = $map['scheme'];
        }

        return $model;
    }
}
