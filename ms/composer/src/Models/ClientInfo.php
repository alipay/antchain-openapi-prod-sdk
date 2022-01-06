<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class ClientInfo extends Model
{
    // 订阅客户端地址列表
    /**
     * @example 10.1.1.101
     *
     * @var string
     */
    public $ip;
    protected $_name = [
        'ip' => 'ip',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->ip) {
            $res['ip'] = $this->ip;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ClientInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['ip'])) {
            $model->ip = $map['ip'];
        }

        return $model;
    }
}
