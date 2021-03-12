<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class QueryDistributionOrderRakebackResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultCode;

    /**
     * @var string
     */
    public $resultMsg;

    // 订单id
    /**
     * @var string
     */
    public $orderId;

    // 返佣信息列表
    /**
     * @var RakeBackInfo[]
     */
    public $rakebackList;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'orderId'      => 'order_id',
        'rakebackList' => 'rakeback_list',
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
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->rakebackList) {
            $res['rakeback_list'] = [];
            if (null !== $this->rakebackList && \is_array($this->rakebackList)) {
                $n = 0;
                foreach ($this->rakebackList as $item) {
                    $res['rakeback_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDistributionOrderRakebackResponse
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
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['rakeback_list'])) {
            if (!empty($map['rakeback_list'])) {
                $model->rakebackList = [];
                $n                   = 0;
                foreach ($map['rakeback_list'] as $item) {
                    $model->rakebackList[$n++] = null !== $item ? RakeBackInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
