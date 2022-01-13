<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACCOUNT\Models;

use AlibabaCloud\Tea\Model;

class QueryInfoResponse extends Model
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

    // 用户的银行打款卡号
    /**
     * @var string
     */
    public $cardId;

    // 银行户名
    /**
     * @var string
     */
    public $accountName;

    // 开户银行
    /**
     * @var string
     */
    public $bankName;

    // 网点/支行 （客资特有）
    /**
     * @var string
     */
    public $branchBankName;

    // 联行号（客资特有）
    /**
     * @var string
     */
    public $bankLineNumber;

    // 开户地（客资特有）
    /**
     * @var string
     */
    public $bankLocation;

    // ALIPAY-客资账户 FINANCE-财资账户
    /**
     * @var string
     */
    public $accountType;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'cardId'         => 'card_id',
        'accountName'    => 'account_name',
        'bankName'       => 'bank_name',
        'branchBankName' => 'branch_bank_name',
        'bankLineNumber' => 'bank_line_number',
        'bankLocation'   => 'bank_location',
        'accountType'    => 'account_type',
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
        if (null !== $this->cardId) {
            $res['card_id'] = $this->cardId;
        }
        if (null !== $this->accountName) {
            $res['account_name'] = $this->accountName;
        }
        if (null !== $this->bankName) {
            $res['bank_name'] = $this->bankName;
        }
        if (null !== $this->branchBankName) {
            $res['branch_bank_name'] = $this->branchBankName;
        }
        if (null !== $this->bankLineNumber) {
            $res['bank_line_number'] = $this->bankLineNumber;
        }
        if (null !== $this->bankLocation) {
            $res['bank_location'] = $this->bankLocation;
        }
        if (null !== $this->accountType) {
            $res['account_type'] = $this->accountType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryInfoResponse
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
        if (isset($map['card_id'])) {
            $model->cardId = $map['card_id'];
        }
        if (isset($map['account_name'])) {
            $model->accountName = $map['account_name'];
        }
        if (isset($map['bank_name'])) {
            $model->bankName = $map['bank_name'];
        }
        if (isset($map['branch_bank_name'])) {
            $model->branchBankName = $map['branch_bank_name'];
        }
        if (isset($map['bank_line_number'])) {
            $model->bankLineNumber = $map['bank_line_number'];
        }
        if (isset($map['bank_location'])) {
            $model->bankLocation = $map['bank_location'];
        }
        if (isset($map['account_type'])) {
            $model->accountType = $map['account_type'];
        }

        return $model;
    }
}
