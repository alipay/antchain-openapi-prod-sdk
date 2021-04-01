<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class ExecConsumecardOrdertrywithdrawResponse extends Model
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

    // 试算总提现金额(单位:元,精确到分)
    /**
     * @var string
     */
    public $withdrawTotalAmount;

    // 试算提现订单总笔数
    /**
     * @var int
     */
    public $withdrawTotalCount;
    protected $_name = [
        'reqMsgId'            => 'req_msg_id',
        'resultCode'          => 'result_code',
        'resultMsg'           => 'result_msg',
        'withdrawTotalAmount' => 'withdraw_total_amount',
        'withdrawTotalCount'  => 'withdraw_total_count',
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
        if (null !== $this->withdrawTotalAmount) {
            $res['withdraw_total_amount'] = $this->withdrawTotalAmount;
        }
        if (null !== $this->withdrawTotalCount) {
            $res['withdraw_total_count'] = $this->withdrawTotalCount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecConsumecardOrdertrywithdrawResponse
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
        if (isset($map['withdraw_total_amount'])) {
            $model->withdrawTotalAmount = $map['withdraw_total_amount'];
        }
        if (isset($map['withdraw_total_count'])) {
            $model->withdrawTotalCount = $map['withdraw_total_count'];
        }

        return $model;
    }
}
