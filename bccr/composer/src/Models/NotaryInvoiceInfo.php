<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class NotaryInvoiceInfo extends Model
{
    // 开票类型
    /**
     * @example PAPER纸质，ELECTRIC电子
     *
     * @var string
     */
    public $billingType;

    // 发票类型
    /**
     * @example NORMAL增值税普通发票、SPECIAL增值税专用发票 个人只能开具普通发票
     *
     * @var string
     */
    public $invoiceType;

    // 主体类型
    /**
     * @example 个人PERSON，机构ENTERPRISE
     *
     * @var string
     */
    public $subjectType;

    // 发票抬头
    /**
     * @example 姓名/单位名称
     *
     * @var string
     */
    public $invoiceName;

    // 纳税人识别号
    /**
     * @example 发票抬头为机构时必填
     *
     * @var string
     */
    public $ratepayerCode;

    // 开户行
    /**
     * @example 发票抬头为机构时必填
     *
     * @var string
     */
    public $bankType;

    // 开户行账号
    /**
     * @example 发票抬头为机构时必填
     *
     * @var string
     */
    public $bankAccount;

    // 单位地址
    /**
     * @example 发票抬头为机构时必填
     *
     * @var string
     */
    public $unitAddress;

    // 单位电话
    /**
     * @example 发票抬头为机构时必填
     *
     * @var string
     */
    public $unitPhone;

    // 发票收件信息
    /**
     * @example
     *
     * @var DeliveryInfo
     */
    public $delivery;
    protected $_name = [
        'billingType'   => 'billing_type',
        'invoiceType'   => 'invoice_type',
        'subjectType'   => 'subject_type',
        'invoiceName'   => 'invoice_name',
        'ratepayerCode' => 'ratepayer_code',
        'bankType'      => 'bank_type',
        'bankAccount'   => 'bank_account',
        'unitAddress'   => 'unit_address',
        'unitPhone'     => 'unit_phone',
        'delivery'      => 'delivery',
    ];

    public function validate()
    {
        Model::validateRequired('billingType', $this->billingType, true);
        Model::validateRequired('invoiceType', $this->invoiceType, true);
        Model::validateRequired('subjectType', $this->subjectType, true);
        Model::validateRequired('invoiceName', $this->invoiceName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->billingType) {
            $res['billing_type'] = $this->billingType;
        }
        if (null !== $this->invoiceType) {
            $res['invoice_type'] = $this->invoiceType;
        }
        if (null !== $this->subjectType) {
            $res['subject_type'] = $this->subjectType;
        }
        if (null !== $this->invoiceName) {
            $res['invoice_name'] = $this->invoiceName;
        }
        if (null !== $this->ratepayerCode) {
            $res['ratepayer_code'] = $this->ratepayerCode;
        }
        if (null !== $this->bankType) {
            $res['bank_type'] = $this->bankType;
        }
        if (null !== $this->bankAccount) {
            $res['bank_account'] = $this->bankAccount;
        }
        if (null !== $this->unitAddress) {
            $res['unit_address'] = $this->unitAddress;
        }
        if (null !== $this->unitPhone) {
            $res['unit_phone'] = $this->unitPhone;
        }
        if (null !== $this->delivery) {
            $res['delivery'] = null !== $this->delivery ? $this->delivery->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NotaryInvoiceInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['billing_type'])) {
            $model->billingType = $map['billing_type'];
        }
        if (isset($map['invoice_type'])) {
            $model->invoiceType = $map['invoice_type'];
        }
        if (isset($map['subject_type'])) {
            $model->subjectType = $map['subject_type'];
        }
        if (isset($map['invoice_name'])) {
            $model->invoiceName = $map['invoice_name'];
        }
        if (isset($map['ratepayer_code'])) {
            $model->ratepayerCode = $map['ratepayer_code'];
        }
        if (isset($map['bank_type'])) {
            $model->bankType = $map['bank_type'];
        }
        if (isset($map['bank_account'])) {
            $model->bankAccount = $map['bank_account'];
        }
        if (isset($map['unit_address'])) {
            $model->unitAddress = $map['unit_address'];
        }
        if (isset($map['unit_phone'])) {
            $model->unitPhone = $map['unit_phone'];
        }
        if (isset($map['delivery'])) {
            $model->delivery = DeliveryInfo::fromMap($map['delivery']);
        }

        return $model;
    }
}
