<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class QueryElectrocarTriplastResponse extends Model
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

    // {
    // "startTime":1733841600000,
    // "tripId":"T20251210140000001",
    // "endTime":1733845200000,
    // "mileage":36.8,
    // "duration":{
    // "value":"79",
    // "unit":"h"
    // },
    // "maxSpeed":85.5,
    // "avgSpeed":36.8,
    // "firstAddress":"上海市浦东新区张江高科技园区博云路",
    // "lastAddress":"上海市徐汇区漕河泾开发区桂平路",
    // "firstLocationTime":1733841605000,
    // "lastLocationTime":1733845195000
    // }
    /**
     * @var TripDetail
     */
    public $lastTripDetail;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'success'        => 'success',
        'lastTripDetail' => 'last_trip_detail',
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
        if (null !== $this->lastTripDetail) {
            $res['last_trip_detail'] = null !== $this->lastTripDetail ? $this->lastTripDetail->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryElectrocarTriplastResponse
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
        if (isset($map['last_trip_detail'])) {
            $model->lastTripDetail = TripDetail::fromMap($map['last_trip_detail']);
        }

        return $model;
    }
}
