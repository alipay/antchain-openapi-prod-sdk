<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\GESAAS\Models;

use AlibabaCloud\Tea\Model;

class SettleOrderRoyaltyDetail extends Model
{
    // 分账金额，单位：分
    /**
     * @example 1000
     *
     * @var int
     */
    public $amount;

    // 分账状态，SUCCESS成功，FAIL失败，PROCESSING处理中
    /**
     * @example FAIL
     *
     * @var string
     */
    public $state;

    // 分账执行时间
    /**
     * @example 2021-07-30 12:00:00
     *
     * @var string
     */
    public $executeDt;

    // 分账转出账号
    /**
     * @example 2088111111111111
     *
     * @var string
     */
    public $transOutAccount;

    // 分账失败错误码，只在分账失败时返回
    /**
     * @example TXN_RESULT_ACCOUNT_BALANCE_NOT_ENOUGH
     *
     * @var string
     */
    public $errorCode;

    // 分账错误描述信息
    /**
     * @example 分账余额不足
     *
     * @var string
     */
    public $errorDesc;

    // 分账转入账号
    /**
     * @example 2088111111111111
     *
     * @var string
     */
    public $transInAccount;
    protected $_name = [
        'amount'          => 'amount',
        'state'           => 'state',
        'executeDt'       => 'execute_dt',
        'transOutAccount' => 'trans_out_account',
        'errorCode'       => 'error_code',
        'errorDesc'       => 'error_desc',
        'transInAccount'  => 'trans_in_account',
    ];

    public function validate()
    {
        Model::validatePattern('executeDt', $this->executeDt, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->amount) {
            $res['amount'] = $this->amount;
        }
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        if (null !== $this->executeDt) {
            $res['execute_dt'] = $this->executeDt;
        }
        if (null !== $this->transOutAccount) {
            $res['trans_out_account'] = $this->transOutAccount;
        }
        if (null !== $this->errorCode) {
            $res['error_code'] = $this->errorCode;
        }
        if (null !== $this->errorDesc) {
            $res['error_desc'] = $this->errorDesc;
        }
        if (null !== $this->transInAccount) {
            $res['trans_in_account'] = $this->transInAccount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SettleOrderRoyaltyDetail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['amount'])) {
            $model->amount = $map['amount'];
        }
        if (isset($map['state'])) {
            $model->state = $map['state'];
        }
        if (isset($map['execute_dt'])) {
            $model->executeDt = $map['execute_dt'];
        }
        if (isset($map['trans_out_account'])) {
            $model->transOutAccount = $map['trans_out_account'];
        }
        if (isset($map['error_code'])) {
            $model->errorCode = $map['error_code'];
        }
        if (isset($map['error_desc'])) {
            $model->errorDesc = $map['error_desc'];
        }
        if (isset($map['trans_in_account'])) {
            $model->transInAccount = $map['trans_in_account'];
        }

        return $model;
    }
}
