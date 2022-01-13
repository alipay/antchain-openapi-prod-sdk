<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACCOUNT\Models;

use AlibabaCloud\Tea\Model;

class QueryBalanceResponse extends Model
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

    // 余额
    /**
     * @var MultiCurrencyMoneyOpenApi
     */
    public $balance;

    // ALIPAY-客资账户 FINANCE-财资账户
    /**
     * @var string
     */
    public $accountType;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'balance'     => 'balance',
        'accountType' => 'account_type',
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
        if (null !== $this->balance) {
            $res['balance'] = null !== $this->balance ? $this->balance->toMap() : null;
        }
        if (null !== $this->accountType) {
            $res['account_type'] = $this->accountType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryBalanceResponse
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
        if (isset($map['balance'])) {
            $model->balance = MultiCurrencyMoneyOpenApi::fromMap($map['balance']);
        }
        if (isset($map['account_type'])) {
            $model->accountType = $map['account_type'];
        }

        return $model;
    }
}
