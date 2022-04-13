<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class UidRange extends Model
{
    // UID 起始值
    /**
     * @example
     *
     * @var int
     */
    public $start;

    // UID 终止值
    /**
     * @example
     *
     * @var int
     */
    public $end;

    // 弹性
    /**
     * @example true, false
     *
     * @var bool
     */
    public $elastic;
    protected $_name = [
        'start'   => 'start',
        'end'     => 'end',
        'elastic' => 'elastic',
    ];

    public function validate()
    {
        Model::validateRequired('start', $this->start, true);
        Model::validateRequired('end', $this->end, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->start) {
            $res['start'] = $this->start;
        }
        if (null !== $this->end) {
            $res['end'] = $this->end;
        }
        if (null !== $this->elastic) {
            $res['elastic'] = $this->elastic;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UidRange
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['start'])) {
            $model->start = $map['start'];
        }
        if (isset($map['end'])) {
            $model->end = $map['end'];
        }
        if (isset($map['elastic'])) {
            $model->elastic = $map['elastic'];
        }

        return $model;
    }
}
