<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTX\Models;

use AlibabaCloud\Tea\Model;

class ExceptionStats extends Model
{
    // 异常事务数
    /**
     * @example 4
     *
     * @var int
     */
    public $total;
    protected $_name = [
        'total' => 'total',
    ];

    public function validate()
    {
        Model::validateRequired('total', $this->total, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->total) {
            $res['total'] = $this->total;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExceptionStats
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['total'])) {
            $model->total = $map['total'];
        }

        return $model;
    }
}
