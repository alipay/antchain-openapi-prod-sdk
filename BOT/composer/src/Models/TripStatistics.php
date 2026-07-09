<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class TripStatistics extends Model
{
    // 总里程
    /**
     * @example 23
     *
     * @var string
     */
    public $totalMileage;

    // 时间体
    /**
     * @example "totalDuration":{ "value":"79", "unit":"h" }
     *
     * @var TripDuration
     */
    public $totalDuration;

    // 总次数
    /**
     * @example 12
     *
     * @var int
     */
    public $totalCount;

    // 时期码
    /**
     * @example 2
     *
     * @var int
     */
    public $periodCode;
    protected $_name = [
        'totalMileage'  => 'total_mileage',
        'totalDuration' => 'total_duration',
        'totalCount'    => 'total_count',
        'periodCode'    => 'period_code',
    ];

    public function validate()
    {
        Model::validateRequired('totalMileage', $this->totalMileage, true);
        Model::validateRequired('totalDuration', $this->totalDuration, true);
        Model::validateRequired('totalCount', $this->totalCount, true);
        Model::validateRequired('periodCode', $this->periodCode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->totalMileage) {
            $res['total_mileage'] = $this->totalMileage;
        }
        if (null !== $this->totalDuration) {
            $res['total_duration'] = null !== $this->totalDuration ? $this->totalDuration->toMap() : null;
        }
        if (null !== $this->totalCount) {
            $res['total_count'] = $this->totalCount;
        }
        if (null !== $this->periodCode) {
            $res['period_code'] = $this->periodCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TripStatistics
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['total_mileage'])) {
            $model->totalMileage = $map['total_mileage'];
        }
        if (isset($map['total_duration'])) {
            $model->totalDuration = TripDuration::fromMap($map['total_duration']);
        }
        if (isset($map['total_count'])) {
            $model->totalCount = $map['total_count'];
        }
        if (isset($map['period_code'])) {
            $model->periodCode = $map['period_code'];
        }

        return $model;
    }
}
