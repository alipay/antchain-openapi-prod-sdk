<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class ClientValue extends Model
{
    // 客户端内存里的值
    /**
     * @example switch
     *
     * @var string
     */
    public $data;

    // 客户端 IP
    /**
     * @example 127.0.0.1
     *
     * @var string
     */
    public $ip;

    // 是否查询成功
    /**
     * @example true
     *
     * @var bool
     */
    public $success;
    protected $_name = [
        'data'    => 'data',
        'ip'      => 'ip',
        'success' => 'success',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->data) {
            $res['data'] = $this->data;
        }
        if (null !== $this->ip) {
            $res['ip'] = $this->ip;
        }
        if (null !== $this->success) {
            $res['success'] = $this->success;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ClientValue
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['data'])) {
            $model->data = $map['data'];
        }
        if (isset($map['ip'])) {
            $model->ip = $map['ip'];
        }
        if (isset($map['success'])) {
            $model->success = $map['success'];
        }

        return $model;
    }
}
