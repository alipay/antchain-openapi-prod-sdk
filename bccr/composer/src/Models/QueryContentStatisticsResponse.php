<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class QueryContentStatisticsResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 总观看次数
    /**
     * @var string
     */
    public $totalViews;

    // 总观看时长
    /**
     * @var string
     */
    public $totalViewDuration;

    // 总平均观看时长
    /**
     * @var string
     */
    public $totalAverageViewDuration;

    // 总预计收入
    /**
     * @var string
     */
    public $totalRevenue;

    // 每日详细统计列表
    /**
     * @var DayStatisticsInfo[]
     */
    public $dayStatisticsList;
    protected $_name = [
        'reqMsgId'                 => 'req_msg_id',
        'resultCode'               => 'result_code',
        'resultMsg'                => 'result_msg',
        'totalViews'               => 'total_views',
        'totalViewDuration'        => 'total_view_duration',
        'totalAverageViewDuration' => 'total_average_view_duration',
        'totalRevenue'             => 'total_revenue',
        'dayStatisticsList'        => 'day_statistics_list',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
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
     * @return QueryContentStatisticsResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
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
