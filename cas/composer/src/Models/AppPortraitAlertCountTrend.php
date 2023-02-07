<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class AppPortraitAlertCountTrend extends Model
{
    // 日期
    /**
     * @example 2022-01-03
     *
     * @var string
     */
    public $day;

    // 本周期
    /**
     * @example 80
     *
     * @var int
     */
    public $nowCycle;

    // 上周期
    /**
     * @example 30
     *
     * @var int
     */
    public $lastCycle;
    protected $_name = [
        'day'       => 'day',
        'nowCycle'  => 'now_cycle',
        'lastCycle' => 'last_cycle',
    ];

    public function validate()
    {
        Model::validateRequired('day', $this->day, true);
        Model::validateRequired('nowCycle', $this->nowCycle, true);
        Model::validateRequired('lastCycle', $this->lastCycle, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->day) {
            $res['day'] = $this->day;
        }
        if (null !== $this->nowCycle) {
            $res['now_cycle'] = $this->nowCycle;
        }
        if (null !== $this->lastCycle) {
            $res['last_cycle'] = $this->lastCycle;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AppPortraitAlertCountTrend
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['day'])) {
            $model->day = $map['day'];
        }
        if (isset($map['now_cycle'])) {
            $model->nowCycle = $map['now_cycle'];
        }
        if (isset($map['last_cycle'])) {
            $model->lastCycle = $map['last_cycle'];
        }

        return $model;
    }
}
