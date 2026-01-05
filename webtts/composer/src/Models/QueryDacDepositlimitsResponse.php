<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\WEBTTS\Models;

use AlibabaCloud\Tea\Model;

class QueryDacDepositlimitsResponse extends Model
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

    // 可以deposit的最大金额
    /**
     * @var string
     */
    public $depositMaxAmount;

    // 可以deposit的最小金额
    /**
     * @var string
     */
    public $depositMinAmount;
    protected $_name = [
        'reqMsgId'         => 'req_msg_id',
        'resultCode'       => 'result_code',
        'resultMsg'        => 'result_msg',
        'depositMaxAmount' => 'deposit_max_amount',
        'depositMinAmount' => 'deposit_min_amount',
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
        if (null !== $this->depositMaxAmount) {
            $res['deposit_max_amount'] = $this->depositMaxAmount;
        }
        if (null !== $this->depositMinAmount) {
            $res['deposit_min_amount'] = $this->depositMinAmount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDacDepositlimitsResponse
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
        if (isset($map['deposit_max_amount'])) {
            $model->depositMaxAmount = $map['deposit_max_amount'];
        }
        if (isset($map['deposit_min_amount'])) {
            $model->depositMinAmount = $map['deposit_min_amount'];
        }

        return $model;
    }
}
