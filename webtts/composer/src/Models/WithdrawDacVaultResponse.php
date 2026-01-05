<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\WEBTTS\Models;

use AlibabaCloud\Tea\Model;

class WithdrawDacVaultResponse extends Model
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

    // withdrawal order detail
    /**
     * @var WithdrawalOrderDetail
     */
    public $withdrawalOrderDetail;
    protected $_name = [
        'reqMsgId'              => 'req_msg_id',
        'resultCode'            => 'result_code',
        'resultMsg'             => 'result_msg',
        'withdrawalOrderDetail' => 'withdrawal_order_detail',
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
        if (null !== $this->withdrawalOrderDetail) {
            $res['withdrawal_order_detail'] = null !== $this->withdrawalOrderDetail ? $this->withdrawalOrderDetail->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return WithdrawDacVaultResponse
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
        if (isset($map['withdrawal_order_detail'])) {
            $model->withdrawalOrderDetail = WithdrawalOrderDetail::fromMap($map['withdrawal_order_detail']);
        }

        return $model;
    }
}
