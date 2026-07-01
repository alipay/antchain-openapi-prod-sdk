<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class QueryLeaseClearingResponse extends Model
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

    // 订单id
    /**
     * @var string
     */
    public $orderId;

    // 融资租赁清分信息
    /**
     * @var LeaseClearingInfo[]
     */
    public $cleearingInfos;

    // 错误码
    /**
     * @var string
     */
    public $code;

    // 错误信息描述
    /**
     * @var string
     */
    public $message;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'orderId'        => 'order_id',
        'cleearingInfos' => 'cleearing_infos',
        'code'           => 'code',
        'message'        => 'message',
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
        if (null !== $this->cleearingInfos) {
            $res['cleearing_infos'] = [];
            if (null !== $this->cleearingInfos && \is_array($this->cleearingInfos)) {
                $n = 0;
                foreach ($this->cleearingInfos as $item) {
                    $res['cleearing_infos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryLeaseClearingResponse
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
        if (isset($map['cleearing_infos'])) {
            if (!empty($map['cleearing_infos'])) {
                $model->cleearingInfos = [];
                $n                     = 0;
                foreach ($map['cleearing_infos'] as $item) {
                    $model->cleearingInfos[$n++] = null !== $item ? LeaseClearingInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }

        return $model;
    }
}
