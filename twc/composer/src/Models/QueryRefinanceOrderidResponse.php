<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class QueryRefinanceOrderidResponse extends Model
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

    // 订单id列表
    /**
     * @var RefinanceOrderInfoResponse[]
     */
    public $orderInfoList;
    protected $_name = [
        'reqMsgId'      => 'req_msg_id',
        'resultCode'    => 'result_code',
        'resultMsg'     => 'result_msg',
        'orderInfoList' => 'order_info_list',
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
        if (null !== $this->orderInfoList) {
            $res['order_info_list'] = [];
            if (null !== $this->orderInfoList && \is_array($this->orderInfoList)) {
                $n = 0;
                foreach ($this->orderInfoList as $item) {
                    $res['order_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryRefinanceOrderidResponse
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
        if (isset($map['order_info_list'])) {
            if (!empty($map['order_info_list'])) {
                $model->orderInfoList = [];
                $n                    = 0;
                foreach ($map['order_info_list'] as $item) {
                    $model->orderInfoList[$n++] = null !== $item ? RefinanceOrderInfoResponse::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
