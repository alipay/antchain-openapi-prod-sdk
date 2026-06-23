<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class StoreAccountInfo extends Model
{
    // 结算银行卡号
    /**
     * @example 2023343380112
     *
     * @var string
     */
    public $bankCardNo;

    // 结算银行账户名称
    /**
     * @example 交通银行
     *
     * @var string
     */
    public $bankAccountName;

    // 结算银行code
    /**
     * @example ICBC
     *
     * @var string
     */
    public $bankCode;

    // 商户号(支付通道给的商户编号)
    /**
     * @example 202334332380
     *
     * @var string
     */
    public $merchantNo;

    // 银行虚拟户卡号(监管户的账户信息)
    /**
     * @example 3242352345234
     *
     * @var string
     */
    public $eVirtualBankCardNo;

    // 银行虚拟户账户名称(监管户的账户信息)
    /**
     * @example 账户1
     *
     * @var string
     */
    public $eVirtualBankAccountName;

    // 银行虚拟户银行code(监管户的账户信息)
    /**
     * @example SEFG
     *
     * @var string
     */
    public $eVirtualBankCode;
    protected $_name = [
        'bankCardNo'              => 'bank_card_no',
        'bankAccountName'         => 'bank_account_name',
        'bankCode'                => 'bank_code',
        'merchantNo'              => 'merchant_no',
        'eVirtualBankCardNo'      => 'e_virtual_bank_card_no',
        'eVirtualBankAccountName' => 'e_virtual_bank_account_name',
        'eVirtualBankCode'        => 'e_virtual_bank_code',
    ];

    public function validate()
    {
        Model::validateRequired('bankCardNo', $this->bankCardNo, true);
        Model::validateRequired('bankAccountName', $this->bankAccountName, true);
        Model::validateRequired('bankCode', $this->bankCode, true);
        Model::validateRequired('merchantNo', $this->merchantNo, true);
        Model::validateRequired('eVirtualBankCardNo', $this->eVirtualBankCardNo, true);
        Model::validateRequired('eVirtualBankAccountName', $this->eVirtualBankAccountName, true);
        Model::validateRequired('eVirtualBankCode', $this->eVirtualBankCode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->bankCardNo) {
            $res['bank_card_no'] = $this->bankCardNo;
        }
        if (null !== $this->bankAccountName) {
            $res['bank_account_name'] = $this->bankAccountName;
        }
        if (null !== $this->bankCode) {
            $res['bank_code'] = $this->bankCode;
        }
        if (null !== $this->merchantNo) {
            $res['merchant_no'] = $this->merchantNo;
        }
        if (null !== $this->eVirtualBankCardNo) {
            $res['e_virtual_bank_card_no'] = $this->eVirtualBankCardNo;
        }
        if (null !== $this->eVirtualBankAccountName) {
            $res['e_virtual_bank_account_name'] = $this->eVirtualBankAccountName;
        }
        if (null !== $this->eVirtualBankCode) {
            $res['e_virtual_bank_code'] = $this->eVirtualBankCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StoreAccountInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['bank_card_no'])) {
            $model->bankCardNo = $map['bank_card_no'];
        }
        if (isset($map['bank_account_name'])) {
            $model->bankAccountName = $map['bank_account_name'];
        }
        if (isset($map['bank_code'])) {
            $model->bankCode = $map['bank_code'];
        }
        if (isset($map['merchant_no'])) {
            $model->merchantNo = $map['merchant_no'];
        }
        if (isset($map['e_virtual_bank_card_no'])) {
            $model->eVirtualBankCardNo = $map['e_virtual_bank_card_no'];
        }
        if (isset($map['e_virtual_bank_account_name'])) {
            $model->eVirtualBankAccountName = $map['e_virtual_bank_account_name'];
        }
        if (isset($map['e_virtual_bank_code'])) {
            $model->eVirtualBankCode = $map['e_virtual_bank_code'];
        }

        return $model;
    }
}
