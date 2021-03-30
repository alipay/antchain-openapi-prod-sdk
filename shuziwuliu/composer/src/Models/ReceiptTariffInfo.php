<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class ReceiptTariffInfo extends Model
{
    // 托运单号 [业务必填]
    /**
     * @example 暂无
     *
     * @var string
     */
    public $orderNo;

    // 应收资费项code [业务必填]
    //
    //
    /**
     * @example 暂无
     *
     * @var string
     */
    public $receiptTariffCode;

    // 应收资费项项目 [业务必填]
    /**
     * @example 暂无
     *
     * @var string
     */
    public $receiptTariffProject;

    // 资费项中文描述 [业务必填]
    //
    //
    /**
     * @example 暂无
     *
     * @var string
     */
    public $receiptTariffDesc;

    // 币种 [业务必填]
    /**
     * @example CNY
     *
     * @var string
     */
    public $currency;

    // 资费项含税价 [业务必填]
    //
    //
    /**
     * @example 暂无
     *
     * @var string
     */
    public $priceIncludingTax;

    // 订舱单唯一标识 [业务必填]
    /**
     * @example 暂无
     *
     * @var string
     */
    public $bookingNo;

    // 订舱号 [业务必填]
    /**
     * @example 暂无
     *
     * @var string
     */
    public $bkgNo;
    protected $_name = [
        'orderNo'              => 'order_no',
        'receiptTariffCode'    => 'receipt_tariff_code',
        'receiptTariffProject' => 'receipt_tariff_project',
        'receiptTariffDesc'    => 'receipt_tariff_desc',
        'currency'             => 'currency',
        'priceIncludingTax'    => 'price_including_tax',
        'bookingNo'            => 'booking_no',
        'bkgNo'                => 'bkg_no',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->receiptTariffCode) {
            $res['receipt_tariff_code'] = $this->receiptTariffCode;
        }
        if (null !== $this->receiptTariffProject) {
            $res['receipt_tariff_project'] = $this->receiptTariffProject;
        }
        if (null !== $this->receiptTariffDesc) {
            $res['receipt_tariff_desc'] = $this->receiptTariffDesc;
        }
        if (null !== $this->currency) {
            $res['currency'] = $this->currency;
        }
        if (null !== $this->priceIncludingTax) {
            $res['price_including_tax'] = $this->priceIncludingTax;
        }
        if (null !== $this->bookingNo) {
            $res['booking_no'] = $this->bookingNo;
        }
        if (null !== $this->bkgNo) {
            $res['bkg_no'] = $this->bkgNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ReceiptTariffInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['order_no'])) {
            $model->orderNo = $map['order_no'];
        }
        if (isset($map['receipt_tariff_code'])) {
            $model->receiptTariffCode = $map['receipt_tariff_code'];
        }
        if (isset($map['receipt_tariff_project'])) {
            $model->receiptTariffProject = $map['receipt_tariff_project'];
        }
        if (isset($map['receipt_tariff_desc'])) {
            $model->receiptTariffDesc = $map['receipt_tariff_desc'];
        }
        if (isset($map['currency'])) {
            $model->currency = $map['currency'];
        }
        if (isset($map['price_including_tax'])) {
            $model->priceIncludingTax = $map['price_including_tax'];
        }
        if (isset($map['booking_no'])) {
            $model->bookingNo = $map['booking_no'];
        }
        if (isset($map['bkg_no'])) {
            $model->bkgNo = $map['bkg_no'];
        }

        return $model;
    }
}
