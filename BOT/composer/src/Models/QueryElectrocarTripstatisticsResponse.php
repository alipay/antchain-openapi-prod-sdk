<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class QueryElectrocarTripstatisticsResponse extends Model
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

    // 状态
    /**
     * @var bool
     */
    public $success;

    // [{总里程、总用时、总次数、 时期码}，{总里程、总用时、总次数、 时期码}，......]
    // 备注：返回前八个加上当前共九个的统计数据（按时间正排）
    // 时期码说明：
    // 月维度：
    // eg1: 12，11，10，9...
    // eg2: 3, 2, 1, 12（去年12月）, 11...
    // 周维度：
    // eg1: 52，51，50，49...
    // eg2: 3，2，1，52（去年最后一周）， 51...
    // 日维度：
    // eg1: 30，29，28，27...
    // eg2: 3，2，1，30（上个月最后一天），29...
    /**
     * @var TripStatistics[]
     */
    public $tripStatistics;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'success'        => 'success',
        'tripStatistics' => 'trip_statistics',
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
        if (null !== $this->success) {
            $res['success'] = $this->success;
        }
        if (null !== $this->tripStatistics) {
            $res['trip_statistics'] = [];
            if (null !== $this->tripStatistics && \is_array($this->tripStatistics)) {
                $n = 0;
                foreach ($this->tripStatistics as $item) {
                    $res['trip_statistics'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryElectrocarTripstatisticsResponse
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
        if (isset($map['success'])) {
            $model->success = $map['success'];
        }
        if (isset($map['trip_statistics'])) {
            if (!empty($map['trip_statistics'])) {
                $model->tripStatistics = [];
                $n                     = 0;
                foreach ($map['trip_statistics'] as $item) {
                    $model->tripStatistics[$n++] = null !== $item ? TripStatistics::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
