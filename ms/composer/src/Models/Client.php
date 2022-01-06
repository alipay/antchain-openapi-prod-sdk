<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class Client extends Model
{
    // 所属的 cell
    /**
     * @example DEFAULT
     *
     * @var string
     */
    public $cell;

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

    // 推送的值
    /**
     * @example switch
     *
     * @var string
     */
    public $pushData;
    protected $_name = [
        'cell'     => 'cell',
        'data'     => 'data',
        'ip'       => 'ip',
        'pushData' => 'push_data',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->cell) {
            $res['cell'] = $this->cell;
        }
        if (null !== $this->data) {
            $res['data'] = $this->data;
        }
        if (null !== $this->ip) {
            $res['ip'] = $this->ip;
        }
        if (null !== $this->pushData) {
            $res['push_data'] = $this->pushData;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Client
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cell'])) {
            $model->cell = $map['cell'];
        }
        if (isset($map['data'])) {
            $model->data = $map['data'];
        }
        if (isset($map['ip'])) {
            $model->ip = $map['ip'];
        }
        if (isset($map['push_data'])) {
            $model->pushData = $map['push_data'];
        }

        return $model;
    }
}
