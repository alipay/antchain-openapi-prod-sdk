<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class OverseaContentStatistics extends Model
{
    // 发布视频id
    /**
     * @example 84343147225530369
     *
     * @var string
     */
    public $contentId;

    // 总观看次数
    /**
     * @example 100
     *
     * @var string
     */
    public $totalViews;

    // 总观看时长
    /**
     * @example 10
     *
     * @var string
     */
    public $totalViewDuration;

    // 总平均观看时长
    /**
     * @example 20
     *
     * @var string
     */
    public $totalAverageViewDuration;

    // 总预计收入
    /**
     * @example 40
     *
     * @var string
     */
    public $totalRevenue;

    // 每日详细统计列表
    /**
     * @example
     *
     * @var DayStatisticsInfo[]
     */
    public $dayStatisticsList;
    protected $_name = [
        'contentId'                => 'content_id',
        'totalViews'               => 'total_views',
        'totalViewDuration'        => 'total_view_duration',
        'totalAverageViewDuration' => 'total_average_view_duration',
        'totalRevenue'             => 'total_revenue',
        'dayStatisticsList'        => 'day_statistics_list',
    ];

    public function validate()
    {
        Model::validateRequired('contentId', $this->contentId, true);
        Model::validateRequired('totalViews', $this->totalViews, true);
        Model::validateRequired('totalViewDuration', $this->totalViewDuration, true);
        Model::validateRequired('totalAverageViewDuration', $this->totalAverageViewDuration, true);
        Model::validateRequired('totalRevenue', $this->totalRevenue, true);
        Model::validateRequired('dayStatisticsList', $this->dayStatisticsList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->contentId) {
            $res['content_id'] = $this->contentId;
        }
        if (null !== $this->totalViews) {
            $res['total_views'] = $this->totalViews;
        }
        if (null !== $this->totalViewDuration) {
            $res['total_view_duration'] = $this->totalViewDuration;
        }
        if (null !== $this->totalAverageViewDuration) {
            $res['total_average_view_duration'] = $this->totalAverageViewDuration;
        }
        if (null !== $this->totalRevenue) {
            $res['total_revenue'] = $this->totalRevenue;
        }
        if (null !== $this->dayStatisticsList) {
            $res['day_statistics_list'] = [];
            if (null !== $this->dayStatisticsList && \is_array($this->dayStatisticsList)) {
                $n = 0;
                foreach ($this->dayStatisticsList as $item) {
                    $res['day_statistics_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OverseaContentStatistics
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['content_id'])) {
            $model->contentId = $map['content_id'];
        }
        if (isset($map['total_views'])) {
            $model->totalViews = $map['total_views'];
        }
        if (isset($map['total_view_duration'])) {
            $model->totalViewDuration = $map['total_view_duration'];
        }
        if (isset($map['total_average_view_duration'])) {
            $model->totalAverageViewDuration = $map['total_average_view_duration'];
        }
        if (isset($map['total_revenue'])) {
            $model->totalRevenue = $map['total_revenue'];
        }
        if (isset($map['day_statistics_list'])) {
            if (!empty($map['day_statistics_list'])) {
                $model->dayStatisticsList = [];
                $n                        = 0;
                foreach ($map['day_statistics_list'] as $item) {
                    $model->dayStatisticsList[$n++] = null !== $item ? DayStatisticsInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
