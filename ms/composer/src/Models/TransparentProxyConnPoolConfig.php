<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class TransparentProxyConnPoolConfig extends Model
{
    // 最大连接数
    /**
     * @example 1000
     *
     * @var int
     */
    public $maxReq;
    protected $_name = [
        'maxReq' => 'max_req',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->maxReq) {
            $res['max_req'] = $this->maxReq;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TransparentProxyConnPoolConfig
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['max_req'])) {
            $model->maxReq = $map['max_req'];
        }

        return $model;
    }
}
