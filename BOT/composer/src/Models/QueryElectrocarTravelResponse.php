<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class QueryElectrocarTravelResponse extends Model
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

    // 接口调用结果
    /**
     * @var bool
     */
    public $success;

    // 概览信息,
    // bean 定义：
    // 行程统计：TripStatisticsView
    // 行程列表：-
    // 行程详情：TripTraceView
    /**
     * @var string
     */
    public $overView;

    // 详情列表
    // bean 定义：
    // 行程统计：TripStatistics
    // 行程列表：TripView
    // 行程详情：TripTrace
    /**
     * @var string[]
     */
    public $detailList;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'success'    => 'success',
        'overView'   => 'over_view',
        'detailList' => 'detail_list',
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
        if (null !== $this->overView) {
            $res['over_view'] = $this->overView;
        }
        if (null !== $this->detailList) {
            $res['detail_list'] = $this->detailList;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryElectrocarTravelResponse
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
        if (isset($map['over_view'])) {
            $model->overView = $map['over_view'];
        }
        if (isset($map['detail_list'])) {
            if (!empty($map['detail_list'])) {
                $model->detailList = $map['detail_list'];
            }
        }

        return $model;
    }
}
