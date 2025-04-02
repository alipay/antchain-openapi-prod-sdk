<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class CustomerBankCardInfo extends Model
{
    // 银行名称
    /**
     * @example 工商银行
     *
     * @var string
     */
    public $bankName;

    // 银行编码
    /**
     * @example ICBC
     *
     * @var string
     */
    public $bankCode;

    // 银行卡号
    /**
     * @example 6226211215645646
     *
     * @var string
     */
    public $bankCardNo;

    // 是否已签约
    /**
     * @example Y/N
     *
     * @var string
     */
    public $signed;

    // 是否为账户代扣银行卡
    /**
     * @example Y/N
     *
     * @var string
     */
    public $acctBankCard;
    protected $_name = [
        'bankName'     => 'bank_name',
        'bankCode'     => 'bank_code',
        'bankCardNo'   => 'bank_card_no',
        'signed'       => 'signed',
        'acctBankCard' => 'acct_bank_card',
    ];

    public function validate()
    {
        Model::validateRequired('bankName', $this->bankName, true);
        Model::validateRequired('bankCode', $this->bankCode, true);
        Model::validateRequired('bankCardNo', $this->bankCardNo, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->bankName) {
            $res['bank_name'] = $this->bankName;
        }
        if (null !== $this->bankCode) {
            $res['bank_code'] = $this->bankCode;
        }
        if (null !== $this->bankCardNo) {
            $res['bank_card_no'] = $this->bankCardNo;
        }
        if (null !== $this->signed) {
            $res['signed'] = $this->signed;
        }
        if (null !== $this->acctBankCard) {
            $res['acct_bank_card'] = $this->acctBankCard;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CustomerBankCardInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['bank_name'])) {
            $model->bankName = $map['bank_name'];
        }
        if (isset($map['bank_code'])) {
            $model->bankCode = $map['bank_code'];
        }
        if (isset($map['bank_card_no'])) {
            $model->bankCardNo = $map['bank_card_no'];
        }
        if (isset($map['signed'])) {
            $model->signed = $map['signed'];
        }
        if (isset($map['acct_bank_card'])) {
            $model->acctBankCard = $map['acct_bank_card'];
        }

        return $model;
    }
}
