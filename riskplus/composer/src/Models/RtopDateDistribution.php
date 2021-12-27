<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class RtopDateDistribution extends Model
{
    // 统计值
    /**
     * @example 10
     *
     * @var int
     */
    public $count;

    // 年龄
    /**
     * @example 2018-09-09
     *
     * @var string
     */
    public $date;
    protected $_name = [
        'count' => 'count',
        'date'  => 'date',
    ];

    public function validate()
    {
        Model::validateRequired('count', $this->count, true);
        Model::validateRequired('date', $this->date, true);
        Model::validatePattern('date', $this->date, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->count) {
            $res['count'] = $this->count;
        }
        if (null !== $this->date) {
            $res['date'] = $this->date;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RtopDateDistribution
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['count'])) {
            $model->count = $map['count'];
        }
        if (isset($map['date'])) {
            $model->date = $map['date'];
        }

        return $model;
    }
}
