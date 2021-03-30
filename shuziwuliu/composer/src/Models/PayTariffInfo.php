<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class PayTariffInfo extends Model
{
    // 托运单号 [业务必填]
    /**
     * @example 暂无
     *
     * @var string
     */
    public $orderNo;

    // 应付资费项code [业务必填]
    //
    //
    /**
     * @example 暂无
     *
     * @var string
     */
    public $payTariffCode;

    // 应付资费项项目 [业务必填]
    //
    //
    /**
     * @example 暂无
     *
     * @var string
     */
    public $payTariffProject;

    // 资费项中文描述 [业务必填]
    //
    //
    /**
     * @example 暂无
     *
     * @var string
     */
    public $payTariffDesc;

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

    // 订舱单唯一性标识 [业务必填]
    /**
     * @example 暂无
     *
     * @var string
     */
    public $bookingNo;

    // 订舱单 [业务必填]
    /**
     * @example 暂无
     *
     * @var string
     */
    public $bkgNo;
    protected $_name = [
        'orderNo'           => 'order_no',
        'payTariffCode'     => 'pay_tariff_code',
        'payTariffProject'  => 'pay_tariff_project',
        'payTariffDesc'     => 'pay_tariff_desc',
        'currency'          => 'currency',
        'priceIncludingTax' => 'price_including_tax',
        'bookingNo'         => 'booking_no',
        'bkgNo'             => 'bkg_no',
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
        if (null !== $this->payTariffCode) {
            $res['pay_tariff_code'] = $this->payTariffCode;
        }
        if (null !== $this->payTariffProject) {
            $res['pay_tariff_project'] = $this->payTariffProject;
        }
        if (null !== $this->payTariffDesc) {
            $res['pay_tariff_desc'] = $this->payTariffDesc;
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
     * @return PayTariffInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['order_no'])) {
            $model->orderNo = $map['order_no'];
        }
        if (isset($map['pay_tariff_code'])) {
            $model->payTariffCode = $map['pay_tariff_code'];
        }
        if (isset($map['pay_tariff_project'])) {
            $model->payTariffProject = $map['pay_tariff_project'];
        }
        if (isset($map['pay_tariff_desc'])) {
            $model->payTariffDesc = $map['pay_tariff_desc'];
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
