<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_320bc483f2434f39a3af9ec9f04d3cc0\Models;

use AlibabaCloud\Tea\Model;

class SendAntsaasStaffingcInsureRefundResponse extends Model
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

    // 失败原因列表
    /**
     * @var FailOrderInfo[]
     */
    public $failOrderInfoList;
    protected $_name = [
        'reqMsgId'          => 'req_msg_id',
        'resultCode'        => 'result_code',
        'resultMsg'         => 'result_msg',
        'failOrderInfoList' => 'fail_order_info_list',
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
        if (null !== $this->failOrderInfoList) {
            $res['fail_order_info_list'] = [];
            if (null !== $this->failOrderInfoList && \is_array($this->failOrderInfoList)) {
                $n = 0;
                foreach ($this->failOrderInfoList as $item) {
                    $res['fail_order_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SendAntsaasStaffingcInsureRefundResponse
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
        if (isset($map['fail_order_info_list'])) {
            if (!empty($map['fail_order_info_list'])) {
                $model->failOrderInfoList = [];
                $n                        = 0;
                foreach ($map['fail_order_info_list'] as $item) {
                    $model->failOrderInfoList[$n++] = null !== $item ? FailOrderInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
