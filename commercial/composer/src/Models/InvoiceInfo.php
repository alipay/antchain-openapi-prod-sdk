<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COMMERCIAL\Models;

use AlibabaCloud\Tea\Model;

class InvoiceInfo extends Model
{
    // 发票类型
    /**
     * @example 增值税专用发票
     *
     * @var string
     */
    public $invoiceType;

    // 发票编码
    /**
     * @example 2021032410730500140A00330000088993
     *
     * @var string
     */
    public $invoiceCode;

    // 开票日期
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $invoiceDate;

    // 发票信息槽
    /**
     * @example json串
     *
     * @var string
     */
    public $invoiceSlots;

    // 税价合计
    /**
     * @example 20.25
     *
     * @var string
     */
    public $totalAmt;
    protected $_name = [
        'invoiceType'  => 'invoice_type',
        'invoiceCode'  => 'invoice_code',
        'invoiceDate'  => 'invoice_date',
        'invoiceSlots' => 'invoice_slots',
        'totalAmt'     => 'total_amt',
    ];

    public function validate()
    {
        Model::validateRequired('invoiceType', $this->invoiceType, true);
        Model::validateRequired('invoiceCode', $this->invoiceCode, true);
        Model::validateRequired('invoiceDate', $this->invoiceDate, true);
        Model::validateRequired('invoiceSlots', $this->invoiceSlots, true);
        Model::validateRequired('totalAmt', $this->totalAmt, true);
        Model::validatePattern('invoiceDate', $this->invoiceDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->invoiceType) {
            $res['invoice_type'] = $this->invoiceType;
        }
        if (null !== $this->invoiceCode) {
            $res['invoice_code'] = $this->invoiceCode;
        }
        if (null !== $this->invoiceDate) {
            $res['invoice_date'] = $this->invoiceDate;
        }
        if (null !== $this->invoiceSlots) {
            $res['invoice_slots'] = $this->invoiceSlots;
        }
        if (null !== $this->totalAmt) {
            $res['total_amt'] = $this->totalAmt;
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
        if (isset($map['invoice_code'])) {
            $model->invoiceCode = $map['invoice_code'];
        }
        if (isset($map['invoice_date'])) {
            $model->invoiceDate = $map['invoice_date'];
        }
        if (isset($map['invoice_slots'])) {
            $model->invoiceSlots = $map['invoice_slots'];
        }
        if (isset($map['total_amt'])) {
            $model->totalAmt = $map['total_amt'];
        }

        return $model;
    }
}
