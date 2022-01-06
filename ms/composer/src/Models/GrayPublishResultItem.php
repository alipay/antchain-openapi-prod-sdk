<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class GrayPublishResultItem extends Model
{
    // 推送目标 host
    /**
     * @example 127.0.0.1
     *
     * @var string
     */
    public $host;

    // 是否推送成功
    /**
     * @example true
     *
     * @var bool
     */
    public $success;
    protected $_name = [
        'host'    => 'host',
        'success' => 'success',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->host) {
            $res['host'] = $this->host;
        }
        if (null !== $this->success) {
            $res['success'] = $this->success;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GrayPublishResultItem
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['host'])) {
            $model->host = $map['host'];
        }
        if (isset($map['success'])) {
            $model->success = $map['success'];
        }

        return $model;
    }
}
