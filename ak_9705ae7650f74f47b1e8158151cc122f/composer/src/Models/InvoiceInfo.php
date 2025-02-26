<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_9705ae7650f74f47b1e8158151cc122f\Models;

use AlibabaCloud\Tea\Model;

class InvoiceInfo extends Model
{
    // 发票类型 InvoiceTypeEnum目前只支持普票
    // (NORMAL,ELC,普票)
    // (SPECIAL,VAT,专票)
    /**
     * @example NORMAL
     *
     * @var string
     */
    public $invoiceType;

    // 发票抬头（著作权人之一）
    /**
     * @example 000
     *
     * @var string
     */
    public $invoiceHeader;

    // 纳税人识别号（机构必填）
    /**
     * @example 纳税人识别号
     *
     * @var string
     */
    public $taxpayerNumber;

    // 注册地址（专票必填）
    /**
     * @example 注册地址
     *
     * @var string
     */
    public $registeredAddress;

    // 注册电话（专票必填）
    /**
     * @example 注册电话
     *
     * @var string
     */
    public $registeredTel;

    // 开户电话（专票必填）
    /**
     * @example 开户电话
     *
     * @var string
     */
    public $openAccountTel;

    // 开户银行（专票必填）
    /**
     * @example 开户银行
     *
     * @var string
     */
    public $openAccountBank;

    // 银行账号（专票必填）
    /**
     * @example 银行账号
     *
     * @var string
     */
    public $bankAccount;
    protected $_name = [
        'invoiceType'       => 'invoice_type',
        'invoiceHeader'     => 'invoice_header',
        'taxpayerNumber'    => 'taxpayer_number',
        'registeredAddress' => 'registered_address',
        'registeredTel'     => 'registered_tel',
        'openAccountTel'    => 'open_account_tel',
        'openAccountBank'   => 'open_account_bank',
        'bankAccount'       => 'bank_account',
    ];

    public function validate()
    {
        Model::validateRequired('invoiceType', $this->invoiceType, true);
        Model::validateRequired('invoiceHeader', $this->invoiceHeader, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->invoiceType) {
            $res['invoice_type'] = $this->invoiceType;
        }
        if (null !== $this->invoiceHeader) {
            $res['invoice_header'] = $this->invoiceHeader;
        }
        if (null !== $this->taxpayerNumber) {
            $res['taxpayer_number'] = $this->taxpayerNumber;
        }
        if (null !== $this->registeredAddress) {
            $res['registered_address'] = $this->registeredAddress;
        }
        if (null !== $this->registeredTel) {
            $res['registered_tel'] = $this->registeredTel;
        }
        if (null !== $this->openAccountTel) {
            $res['open_account_tel'] = $this->openAccountTel;
        }
        if (null !== $this->openAccountBank) {
            $res['open_account_bank'] = $this->openAccountBank;
        }
        if (null !== $this->bankAccount) {
            $res['bank_account'] = $this->bankAccount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InvoiceInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['invoice_type'])) {
            $model->invoiceType = $map['invoice_type'];
        }
        if (isset($map['invoice_header'])) {
            $model->invoiceHeader = $map['invoice_header'];
        }
        if (isset($map['taxpayer_number'])) {
            $model->taxpayerNumber = $map['taxpayer_number'];
        }
        if (isset($map['registered_address'])) {
            $model->registeredAddress = $map['registered_address'];
        }
        if (isset($map['registered_tel'])) {
            $model->registeredTel = $map['registered_tel'];
        }
        if (isset($map['open_account_tel'])) {
            $model->openAccountTel = $map['open_account_tel'];
        }
        if (isset($map['open_account_bank'])) {
            $model->openAccountBank = $map['open_account_bank'];
        }
        if (isset($map['bank_account'])) {
            $model->bankAccount = $map['bank_account'];
        }

        return $model;
    }
}
