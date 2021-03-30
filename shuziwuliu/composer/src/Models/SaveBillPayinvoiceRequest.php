<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class SaveBillPayinvoiceRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
    /**
     * @var string
     */
    public $action;

    // 总金额 业务必填
    /**
     * @var string
     */
    public $amount;

    // 校验码后六位
    /**
     * @var string
     */
    public $checkCode;

    // 币种 CNY/USD [业务必填]
    /**
     * @var string
     */
    public $currency;

    // 美元金额
    /**
     * @var string
     */
    public $dollarAmount;

    // 开票方名称  业务必填
    /**
     * @var string
     */
    public $drawerName;

    // 开票纳税人识别号 业务必填
    /**
     * @var string
     */
    public $drawerTaxpayerCode;

    // 货代did
    /**
     * @var string
     */
    public $forwarderDid;

    // 发票唯一标识
    /**
     * @var string
     */
    public $invoiceCode;

    // 发票抬头did[业务必填]
    /**
     * @var string
     */
    public $invoiceHeaderDid;

    // 发票抬头企业名称[业务必填]
    /**
     * @var string
     */
    public $invoiceHeaderName;

    // 发票抬头企业信用代码[业务必填]
    /**
     * @var string
     */
    public $invoiceHeaderSocialNo;

    // 发票号码 业务必填
    /**
     * @var string
     */
    public $invoiceNumber;

    // 发票税务号
    /**
     * @var string
     */
    public $invoiceTaxCode;

    // 开票类型 业务必填
    /**
     * @var string
     */
    public $invoiceType;

    // 开票日期 业务必填
    /**
     * @var int
     */
    public $makeInvoiceDate;

    // 账单关联项目
    /**
     * @var PayBillInvoiceParam[]
     */
    public $payBillInvoiceParams;

    // 资费项发票 业务必填
    /**
     * @var PayTariffInvoiceParam[]
     */
    public $payTariffInvoiceParams;

    // 不含税金额 业务必填
    /**
     * @var string
     */
    public $untaxedPrice;
    protected $_name = [
        'authToken'              => 'auth_token',
        'productInstanceId'      => 'product_instance_id',
        'action'                 => 'action',
        'amount'                 => 'amount',
        'checkCode'              => 'check_code',
        'currency'               => 'currency',
        'dollarAmount'           => 'dollar_amount',
        'drawerName'             => 'drawer_name',
        'drawerTaxpayerCode'     => 'drawer_taxpayer_code',
        'forwarderDid'           => 'forwarder_did',
        'invoiceCode'            => 'invoice_code',
        'invoiceHeaderDid'       => 'invoice_header_did',
        'invoiceHeaderName'      => 'invoice_header_name',
        'invoiceHeaderSocialNo'  => 'invoice_header_social_no',
        'invoiceNumber'          => 'invoice_number',
        'invoiceTaxCode'         => 'invoice_tax_code',
        'invoiceType'            => 'invoice_type',
        'makeInvoiceDate'        => 'make_invoice_date',
        'payBillInvoiceParams'   => 'pay_bill_invoice_params',
        'payTariffInvoiceParams' => 'pay_tariff_invoice_params',
        'untaxedPrice'           => 'untaxed_price',
    ];

    public function validate()
    {
        Model::validateRequired('forwarderDid', $this->forwarderDid, true);
        Model::validateRequired('invoiceCode', $this->invoiceCode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->action) {
            $res['action'] = $this->action;
        }
        if (null !== $this->amount) {
            $res['amount'] = $this->amount;
        }
        if (null !== $this->checkCode) {
            $res['check_code'] = $this->checkCode;
        }
        if (null !== $this->currency) {
            $res['currency'] = $this->currency;
        }
        if (null !== $this->dollarAmount) {
            $res['dollar_amount'] = $this->dollarAmount;
        }
        if (null !== $this->drawerName) {
            $res['drawer_name'] = $this->drawerName;
        }
        if (null !== $this->drawerTaxpayerCode) {
            $res['drawer_taxpayer_code'] = $this->drawerTaxpayerCode;
        }
        if (null !== $this->forwarderDid) {
            $res['forwarder_did'] = $this->forwarderDid;
        }
        if (null !== $this->invoiceCode) {
            $res['invoice_code'] = $this->invoiceCode;
        }
        if (null !== $this->invoiceHeaderDid) {
            $res['invoice_header_did'] = $this->invoiceHeaderDid;
        }
        if (null !== $this->invoiceHeaderName) {
            $res['invoice_header_name'] = $this->invoiceHeaderName;
        }
        if (null !== $this->invoiceHeaderSocialNo) {
            $res['invoice_header_social_no'] = $this->invoiceHeaderSocialNo;
        }
        if (null !== $this->invoiceNumber) {
            $res['invoice_number'] = $this->invoiceNumber;
        }
        if (null !== $this->invoiceTaxCode) {
            $res['invoice_tax_code'] = $this->invoiceTaxCode;
        }
        if (null !== $this->invoiceType) {
            $res['invoice_type'] = $this->invoiceType;
        }
        if (null !== $this->makeInvoiceDate) {
            $res['make_invoice_date'] = $this->makeInvoiceDate;
        }
        if (null !== $this->payBillInvoiceParams) {
            $res['pay_bill_invoice_params'] = [];
            if (null !== $this->payBillInvoiceParams && \is_array($this->payBillInvoiceParams)) {
                $n = 0;
                foreach ($this->payBillInvoiceParams as $item) {
                    $res['pay_bill_invoice_params'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->payTariffInvoiceParams) {
            $res['pay_tariff_invoice_params'] = [];
            if (null !== $this->payTariffInvoiceParams && \is_array($this->payTariffInvoiceParams)) {
                $n = 0;
                foreach ($this->payTariffInvoiceParams as $item) {
                    $res['pay_tariff_invoice_params'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->untaxedPrice) {
            $res['untaxed_price'] = $this->untaxedPrice;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SaveBillPayinvoiceRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['action'])) {
            $model->action = $map['action'];
        }
        if (isset($map['amount'])) {
            $model->amount = $map['amount'];
        }
        if (isset($map['check_code'])) {
            $model->checkCode = $map['check_code'];
        }
        if (isset($map['currency'])) {
            $model->currency = $map['currency'];
        }
        if (isset($map['dollar_amount'])) {
            $model->dollarAmount = $map['dollar_amount'];
        }
        if (isset($map['drawer_name'])) {
            $model->drawerName = $map['drawer_name'];
        }
        if (isset($map['drawer_taxpayer_code'])) {
            $model->drawerTaxpayerCode = $map['drawer_taxpayer_code'];
        }
        if (isset($map['forwarder_did'])) {
            $model->forwarderDid = $map['forwarder_did'];
        }
        if (isset($map['invoice_code'])) {
            $model->invoiceCode = $map['invoice_code'];
        }
        if (isset($map['invoice_header_did'])) {
            $model->invoiceHeaderDid = $map['invoice_header_did'];
        }
        if (isset($map['invoice_header_name'])) {
            $model->invoiceHeaderName = $map['invoice_header_name'];
        }
        if (isset($map['invoice_header_social_no'])) {
            $model->invoiceHeaderSocialNo = $map['invoice_header_social_no'];
        }
        if (isset($map['invoice_number'])) {
            $model->invoiceNumber = $map['invoice_number'];
        }
        if (isset($map['invoice_tax_code'])) {
            $model->invoiceTaxCode = $map['invoice_tax_code'];
        }
        if (isset($map['invoice_type'])) {
            $model->invoiceType = $map['invoice_type'];
        }
        if (isset($map['make_invoice_date'])) {
            $model->makeInvoiceDate = $map['make_invoice_date'];
        }
        if (isset($map['pay_bill_invoice_params'])) {
            if (!empty($map['pay_bill_invoice_params'])) {
                $model->payBillInvoiceParams = [];
                $n                           = 0;
                foreach ($map['pay_bill_invoice_params'] as $item) {
                    $model->payBillInvoiceParams[$n++] = null !== $item ? PayBillInvoiceParam::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['pay_tariff_invoice_params'])) {
            if (!empty($map['pay_tariff_invoice_params'])) {
                $model->payTariffInvoiceParams = [];
                $n                             = 0;
                foreach ($map['pay_tariff_invoice_params'] as $item) {
                    $model->payTariffInvoiceParams[$n++] = null !== $item ? PayTariffInvoiceParam::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['untaxed_price'])) {
            $model->untaxedPrice = $map['untaxed_price'];
        }

        return $model;
    }
}
