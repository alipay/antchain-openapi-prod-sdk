<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class QueryDigitalassetExchangeEpaccountResponse extends Model
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

    // 账户状态 0:正常 1:锁定
    /**
     * @var int
     */
    public $accountStatus;

    // 版通回购账户信息
    /**
     * @var AccountInfo[]
     */
    public $buybackAccounts;

    // 版通限制交易账户信息
    /**
     * @var AccountInfo[]
     */
    public $constrainedAccounts;

    // 版通可交易账户信息
    /**
     * @var AccountInfo[]
     */
    public $tradeAccounts;
    protected $_name = [
        'reqMsgId'            => 'req_msg_id',
        'resultCode'          => 'result_code',
        'resultMsg'           => 'result_msg',
        'accountStatus'       => 'account_status',
        'buybackAccounts'     => 'buyback_accounts',
        'constrainedAccounts' => 'constrained_accounts',
        'tradeAccounts'       => 'trade_accounts',
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
        if (null !== $this->accountStatus) {
            $res['account_status'] = $this->accountStatus;
        }
        if (null !== $this->buybackAccounts) {
            $res['buyback_accounts'] = [];
            if (null !== $this->buybackAccounts && \is_array($this->buybackAccounts)) {
                $n = 0;
                foreach ($this->buybackAccounts as $item) {
                    $res['buyback_accounts'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->constrainedAccounts) {
            $res['constrained_accounts'] = [];
            if (null !== $this->constrainedAccounts && \is_array($this->constrainedAccounts)) {
                $n = 0;
                foreach ($this->constrainedAccounts as $item) {
                    $res['constrained_accounts'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->tradeAccounts) {
            $res['trade_accounts'] = [];
            if (null !== $this->tradeAccounts && \is_array($this->tradeAccounts)) {
                $n = 0;
                foreach ($this->tradeAccounts as $item) {
                    $res['trade_accounts'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDigitalassetExchangeEpaccountResponse
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
        if (isset($map['account_status'])) {
            $model->accountStatus = $map['account_status'];
        }
        if (isset($map['buyback_accounts'])) {
            if (!empty($map['buyback_accounts'])) {
                $model->buybackAccounts = [];
                $n                      = 0;
                foreach ($map['buyback_accounts'] as $item) {
                    $model->buybackAccounts[$n++] = null !== $item ? AccountInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['constrained_accounts'])) {
            if (!empty($map['constrained_accounts'])) {
                $model->constrainedAccounts = [];
                $n                          = 0;
                foreach ($map['constrained_accounts'] as $item) {
                    $model->constrainedAccounts[$n++] = null !== $item ? AccountInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['trade_accounts'])) {
            if (!empty($map['trade_accounts'])) {
                $model->tradeAccounts = [];
                $n                    = 0;
                foreach ($map['trade_accounts'] as $item) {
                    $model->tradeAccounts[$n++] = null !== $item ? AccountInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
