<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\REALPERSON\Models;

use AlibabaCloud\Tea\Model;

class QueryCutpaymentsubBalanceResponse extends Model
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

    // 账簿可用余额，单位：元；可用于提现，整数部分最长10位数，保留两位小数
    /**
     * @var string
     */
    public $availableAmount;

    // 账簿余额，单位：元；整数部分最长10位数，保留两位小数
    /**
     * @var string
     */
    public $currAmount;

    // 扩展信息，预留字段
    /**
     * @var string
     */
    public $externInfo;
    protected $_name = [
        'reqMsgId'        => 'req_msg_id',
        'resultCode'      => 'result_code',
        'resultMsg'       => 'result_msg',
        'availableAmount' => 'available_amount',
        'currAmount'      => 'curr_amount',
        'externInfo'      => 'extern_info',
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
        if (null !== $this->availableAmount) {
            $res['available_amount'] = $this->availableAmount;
        }
        if (null !== $this->currAmount) {
            $res['curr_amount'] = $this->currAmount;
        }
        if (null !== $this->externInfo) {
            $res['extern_info'] = $this->externInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryCutpaymentsubBalanceResponse
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
        if (isset($map['available_amount'])) {
            $model->availableAmount = $map['available_amount'];
        }
        if (isset($map['curr_amount'])) {
            $model->currAmount = $map['curr_amount'];
        }
        if (isset($map['extern_info'])) {
            $model->externInfo = $map['extern_info'];
        }

        return $model;
    }
}
