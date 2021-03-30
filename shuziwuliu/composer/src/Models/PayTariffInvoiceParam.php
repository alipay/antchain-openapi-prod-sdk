<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class PayTariffInvoiceParam extends Model
{
    // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
    /**
     * @example 暂无
     *
     * @var string
     */
    public $action;

    // 发票金额 业务必填
    /**
     * @example 暂无
     *
     * @var string
     */
    public $invoiceAmount;

    // 资费项金额 业务必填
    /**
     * @example 暂无
     *
     * @var string
     */
    public $payTariffAmount;

    // 资费单据编号 业务必填
    /**
     * @example 暂无
     *
     * @var string
     */
    public $payTariffCode;

    // 资费项发票code
    /**
     * @example 暂无
     *
     * @var string
     */
    public $payTariffInvoiceCode;
    protected $_name = [
        'action'               => 'action',
        'invoiceAmount'        => 'invoice_amount',
        'payTariffAmount'      => 'pay_tariff_amount',
        'payTariffCode'        => 'pay_tariff_code',
        'payTariffInvoiceCode' => 'pay_tariff_invoice_code',
    ];

    public function validate()
    {
        Model::validateRequired('payTariffInvoiceCode', $this->payTariffInvoiceCode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->action) {
            $res['action'] = $this->action;
        }
        if (null !== $this->invoiceAmount) {
            $res['invoice_amount'] = $this->invoiceAmount;
        }
        if (null !== $this->payTariffAmount) {
            $res['pay_tariff_amount'] = $this->payTariffAmount;
        }
        if (null !== $this->payTariffCode) {
            $res['pay_tariff_code'] = $this->payTariffCode;
        }
        if (null !== $this->payTariffInvoiceCode) {
            $res['pay_tariff_invoice_code'] = $this->payTariffInvoiceCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PayTariffInvoiceParam
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['action'])) {
            $model->action = $map['action'];
        }
        if (isset($map['invoice_amount'])) {
            $model->invoiceAmount = $map['invoice_amount'];
        }
        if (isset($map['pay_tariff_amount'])) {
            $model->payTariffAmount = $map['pay_tariff_amount'];
        }
        if (isset($map['pay_tariff_code'])) {
            $model->payTariffCode = $map['pay_tariff_code'];
        }
        if (isset($map['pay_tariff_invoice_code'])) {
            $model->payTariffInvoiceCode = $map['pay_tariff_invoice_code'];
        }

        return $model;
    }
}
