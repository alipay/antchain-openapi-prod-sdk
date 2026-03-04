<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class TripStatisticInfo extends Model
{
    // 总里程
    /**
     * @example
     *
     * @var string
     */
    public $totalMileage;

    // 总时长
    /**
     * @example
     *
     * @var DurationInfo
     */
    public $totalDuration;

    // 总条数
    /**
     * @example
     *
     * @var int
     */
    public $totalCount;

    // 时间码
    /**
     * @example
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
     * @return TripStatisticInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['total_mileage'])) {
            $model->totalMileage = $map['total_mileage'];
        }
        if (isset($map['total_duration'])) {
            $model->totalDuration = DurationInfo::fromMap($map['total_duration']);
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
