<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class ReceiptBillTariffParam extends Model
{
    // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
    /**
     * @example UPDATE、DELETE、INSERT
     *
     * @var string
     */
    public $action;

    // 账单金额 业务必填
    /**
     * @example 暂无
     *
     * @var string
     */
    public $billAmount;

    // 应收账单 、应收资费项 多对多关联code
    /**
     * @example 暂无
     *
     * @var string
     */
    public $receiptBillTariffCode;

    // 资费项金额 业务必填
    /**
     * @example 暂无
     *
     * @var string
     */
    public $receiptTariffAmount;

    // 应收资费项编号 业务必填
    /**
     * @example 暂无
     *
     * @var string
     */
    public $receiptTariffCode;
    protected $_name = [
        'action'                => 'action',
        'billAmount'            => 'bill_amount',
        'receiptBillTariffCode' => 'receipt_bill_tariff_code',
        'receiptTariffAmount'   => 'receipt_tariff_amount',
        'receiptTariffCode'     => 'receipt_tariff_code',
    ];

    public function validate()
    {
        Model::validateRequired('receiptBillTariffCode', $this->receiptBillTariffCode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->action) {
            $res['action'] = $this->action;
        }
        if (null !== $this->billAmount) {
            $res['bill_amount'] = $this->billAmount;
        }
        if (null !== $this->receiptBillTariffCode) {
            $res['receipt_bill_tariff_code'] = $this->receiptBillTariffCode;
        }
        if (null !== $this->receiptTariffAmount) {
            $res['receipt_tariff_amount'] = $this->receiptTariffAmount;
        }
        if (null !== $this->receiptTariffCode) {
            $res['receipt_tariff_code'] = $this->receiptTariffCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ReceiptBillTariffParam
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['action'])) {
            $model->action = $map['action'];
        }
        if (isset($map['bill_amount'])) {
            $model->billAmount = $map['bill_amount'];
        }
        if (isset($map['receipt_bill_tariff_code'])) {
            $model->receiptBillTariffCode = $map['receipt_bill_tariff_code'];
        }
        if (isset($map['receipt_tariff_amount'])) {
            $model->receiptTariffAmount = $map['receipt_tariff_amount'];
        }
        if (isset($map['receipt_tariff_code'])) {
            $model->receiptTariffCode = $map['receipt_tariff_code'];
        }

        return $model;
    }
}
