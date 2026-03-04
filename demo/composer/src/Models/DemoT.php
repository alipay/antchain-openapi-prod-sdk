<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMO\Models;

use AlibabaCloud\Tea\Model;

class DemoT extends Model
{
    // 1
    /**
     * @example 3000
     *
     * @var string
     */
    public $timeout;
    protected $_name = [
        'timeout' => 'timeout',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->timeout) {
            $res['timeout'] = $this->timeout;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DemoT
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['timeout'])) {
            $model->timeout = $map['timeout'];
        }

        return $model;
    }
}
