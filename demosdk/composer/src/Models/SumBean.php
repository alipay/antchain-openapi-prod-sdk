<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMOSDK\Models;

use AlibabaCloud\Tea\Model;

class SumBean extends Model
{
    // 1
    /**
     * @example 1
     *
     * @var int
     */
    public $a;
    protected $_name = [
        'a' => 'a',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->a) {
            $res['a'] = $this->a;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SumBean
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['a'])) {
            $model->a = $map['a'];
        }

        return $model;
    }
}
