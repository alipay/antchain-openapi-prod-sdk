<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class TcpSocketAction extends Model
{
    // 健康检查端口。
    /**
     * @example 80
     *
     * @var string
     */
    public $port;
    protected $_name = [
        'port' => 'port',
    ];

    public function validate()
    {
        Model::validateRequired('port', $this->port, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->port) {
            $res['port'] = $this->port;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TcpSocketAction
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['port'])) {
            $model->port = $map['port'];
        }

        return $model;
    }
}
