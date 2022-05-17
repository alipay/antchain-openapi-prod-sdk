<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class AppPortraitAppHealthScoreTrendQuery extends Model
{
    // 日期
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $day;

    // 健康分分值
    /**
     * @example 88
     *
     * @var int
     */
    public $healthScore;
    protected $_name = [
        'day'         => 'day',
        'healthScore' => 'health_score',
    ];

    public function validate()
    {
        Model::validatePattern('day', $this->day, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->day) {
            $res['day'] = $this->day;
        }
        if (null !== $this->healthScore) {
            $res['health_score'] = $this->healthScore;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AppPortraitAppHealthScoreTrendQuery
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['day'])) {
            $model->day = $map['day'];
        }
        if (isset($map['health_score'])) {
            $model->healthScore = $map['health_score'];
        }

        return $model;
    }
}
