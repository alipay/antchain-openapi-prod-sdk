<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class ReceiptTariffInvoiceParam extends Model
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
    public $receiptTariffAmount;

    // 资费单据编号 业务必填
    /**
     * @example 暂无
     *
     * @var string
     */
    public $receiptTariffCode;

    // 资费项发票code
    /**
     * @example 暂无
     *
     * @var string
     */
    public $receiptTariffInvoiceCode;
    protected $_name = [
        'action'                   => 'action',
        'invoiceAmount'            => 'invoice_amount',
        'receiptTariffAmount'      => 'receipt_tariff_amount',
        'receiptTariffCode'        => 'receipt_tariff_code',
        'receiptTariffInvoiceCode' => 'receipt_tariff_invoice_code',
    ];

    public function validate()
    {
        Model::validateRequired('receiptTariffInvoiceCode', $this->receiptTariffInvoiceCode, true);
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
        if (null !== $this->receiptTariffAmount) {
            $res['receipt_tariff_amount'] = $this->receiptTariffAmount;
        }
        if (null !== $this->receiptTariffCode) {
            $res['receipt_tariff_code'] = $this->receiptTariffCode;
        }
        if (null !== $this->receiptTariffInvoiceCode) {
            $res['receipt_tariff_invoice_code'] = $this->receiptTariffInvoiceCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ReceiptTariffInvoiceParam
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
        if (isset($map['receipt_tariff_amount'])) {
            $model->receiptTariffAmount = $map['receipt_tariff_amount'];
        }
        if (isset($map['receipt_tariff_code'])) {
            $model->receiptTariffCode = $map['receipt_tariff_code'];
        }
        if (isset($map['receipt_tariff_invoice_code'])) {
            $model->receiptTariffInvoiceCode = $map['receipt_tariff_invoice_code'];
        }

        return $model;
    }
}
