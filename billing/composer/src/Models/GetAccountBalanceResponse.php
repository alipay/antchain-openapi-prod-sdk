<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BILLING\Models;

use AlibabaCloud\Tea\Model;

class GetAccountBalanceResponse extends Model
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

    // 账户余额
    /**
     * @var string
     */
    public $accountBalance;

    // 可用余额
    /**
     * @var string
     */
    public $availableBalance;

    // 币种
    /**
     * @var string
     */
    public $currencyValue;
    protected $_name = [
        'reqMsgId'         => 'req_msg_id',
        'resultCode'       => 'result_code',
        'resultMsg'        => 'result_msg',
        'accountBalance'   => 'account_balance',
        'availableBalance' => 'available_balance',
        'currencyValue'    => 'currency_value',
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
        if (null !== $this->accountBalance) {
            $res['account_balance'] = $this->accountBalance;
        }
        if (null !== $this->availableBalance) {
            $res['available_balance'] = $this->availableBalance;
        }
        if (null !== $this->currencyValue) {
            $res['currency_value'] = $this->currencyValue;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetAccountBalanceResponse
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
        if (isset($map['account_balance'])) {
            $model->accountBalance = $map['account_balance'];
        }
        if (isset($map['available_balance'])) {
            $model->availableBalance = $map['available_balance'];
        }
        if (isset($map['currency_value'])) {
            $model->currencyValue = $map['currency_value'];
        }

        return $model;
    }
}
