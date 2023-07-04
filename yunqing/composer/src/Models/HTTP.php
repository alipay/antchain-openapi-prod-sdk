<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class HTTP extends Model
{
    // 检查path
    /**
     * @example /common/checkService
     *
     * @var string
     */
    public $path;

    // http schema
    /**
     * @example http
     *
     * @var string
     */
    public $scheme;

    // port
    /**
     * @example
     *
     * @var int
     */
    public $port;
    protected $_name = [
        'path'   => 'path',
        'scheme' => 'scheme',
        'port'   => 'port',
    ];

    public function validate()
    {
        Model::validateRequired('path', $this->path, true);
        Model::validateRequired('scheme', $this->scheme, true);
        Model::validateRequired('port', $this->port, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->path) {
            $res['path'] = $this->path;
        }
        if (null !== $this->scheme) {
            $res['scheme'] = $this->scheme;
        }
        if (null !== $this->port) {
            $res['port'] = $this->port;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return HTTP
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['path'])) {
            $model->path = $map['path'];
        }
        if (isset($map['scheme'])) {
            $model->scheme = $map['scheme'];
        }
        if (isset($map['port'])) {
            $model->port = $map['port'];
        }

        return $model;
    }
}
