<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\GOODSCHAIN\Models;

use AlibabaCloud\Tea\Model;

class QueryGoodsResponse extends Model
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

    // 商品信息
    /**
     * @var GoodsDTO
     */
    public $goods;

    // 溯源信息列表
    /**
     * @var TraceInfoDTO[]
     */
    public $traceInfoList;

    // 流转信息列表
    /**
     * @var TraceInfoDTO[]
     */
    public $roamTraceList;
    protected $_name = [
        'reqMsgId'      => 'req_msg_id',
        'resultCode'    => 'result_code',
        'resultMsg'     => 'result_msg',
        'goods'         => 'goods',
        'traceInfoList' => 'trace_info_list',
        'roamTraceList' => 'roam_trace_list',
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
        if (null !== $this->goods) {
            $res['goods'] = null !== $this->goods ? $this->goods->toMap() : null;
        }
        if (null !== $this->traceInfoList) {
            $res['trace_info_list'] = [];
            if (null !== $this->traceInfoList && \is_array($this->traceInfoList)) {
                $n = 0;
                foreach ($this->traceInfoList as $item) {
                    $res['trace_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->roamTraceList) {
            $res['roam_trace_list'] = [];
            if (null !== $this->roamTraceList && \is_array($this->roamTraceList)) {
                $n = 0;
                foreach ($this->roamTraceList as $item) {
                    $res['roam_trace_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryGoodsResponse
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
        if (isset($map['goods'])) {
            $model->goods = GoodsDTO::fromMap($map['goods']);
        }
        if (isset($map['trace_info_list'])) {
            if (!empty($map['trace_info_list'])) {
                $model->traceInfoList = [];
                $n                    = 0;
                foreach ($map['trace_info_list'] as $item) {
                    $model->traceInfoList[$n++] = null !== $item ? TraceInfoDTO::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['roam_trace_list'])) {
            if (!empty($map['roam_trace_list'])) {
                $model->roamTraceList = [];
                $n                    = 0;
                foreach ($map['roam_trace_list'] as $item) {
                    $model->roamTraceList[$n++] = null !== $item ? TraceInfoDTO::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
