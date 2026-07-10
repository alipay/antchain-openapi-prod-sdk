<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class DayStatisticsInfo extends Model
{
    // 日期时间戳
    /**
     * @example 1661788800000
     *
     * @var int
     */
    public $date;

    // 日观看次数
    /**
     * @example 100
     *
     * @var string
     */
    public $dayViews;

    // 日观看时长
    /**
     * @example 10
     *
     * @var string
     */
    public $dayViewDuration;

    // 日平均观看时长
    /**
     * @example 100
     *
     * @var string
     */
    public $dayAverageViewDuration;

    // 日预计收入
    /**
     * @example 100
     *
     * @var string
     */
    public $revenue;
    protected $_name = [
        'date'                   => 'date',
        'dayViews'               => 'day_views',
        'dayViewDuration'        => 'day_view_duration',
        'dayAverageViewDuration' => 'day_average_view_duration',
        'revenue'                => 'revenue',
    ];

    public function validate()
    {
        Model::validateRequired('date', $this->date, true);
        Model::validateRequired('dayViews', $this->dayViews, true);
        Model::validateRequired('dayViewDuration', $this->dayViewDuration, true);
        Model::validateRequired('dayAverageViewDuration', $this->dayAverageViewDuration, true);
        Model::validateRequired('revenue', $this->revenue, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->date) {
            $res['date'] = $this->date;
        }
        if (null !== $this->dayViews) {
            $res['day_views'] = $this->dayViews;
        }
        if (null !== $this->dayViewDuration) {
            $res['day_view_duration'] = $this->dayViewDuration;
        }
        if (null !== $this->dayAverageViewDuration) {
            $res['day_average_view_duration'] = $this->dayAverageViewDuration;
        }
        if (null !== $this->revenue) {
            $res['revenue'] = $this->revenue;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DayStatisticsInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['date'])) {
            $model->date = $map['date'];
        }
        if (isset($map['day_views'])) {
            $model->dayViews = $map['day_views'];
        }
        if (isset($map['day_view_duration'])) {
            $model->dayViewDuration = $map['day_view_duration'];
        }
        if (isset($map['day_average_view_duration'])) {
            $model->dayAverageViewDuration = $map['day_average_view_duration'];
        }
        if (isset($map['revenue'])) {
            $model->revenue = $map['revenue'];
        }

        return $model;
    }
}
