<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

use AntChain\SHUZIWULIU\Models\ReceiptTariffInvoiceParam;

class SaveDigitalLogisticBillReceiptinvoiceRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'action' => 'action',
        'amount' => 'amount',
        'checkCode' => 'check_code',
        'drawerName' => 'drawer_name',
        'drawerTaxpayerCode' => 'drawer_taxpayer_code',
        'forwarderDid' => 'forwarder_did',
        'invoiceCode' => 'invoice_code',
        'invoiceNumber' => 'invoice_number',
        'invoiceType' => 'invoice_type',
        'makeInvoiceDate' => 'make_invoice_date',
        'receiptTariffInvoiceParams' => 'receipt_tariff_invoice_params',
        'untaxedPrice' => 'untaxed_price',
        'invoiceTaxCode' => 'invoice_tax_code',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->regionName) {
            $res['region_name'] = $this->regionName;
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
        if (null !== $this->invoiceNumber) {
            $res['invoice_number'] = $this->invoiceNumber;
        }
        if (null !== $this->invoiceType) {
            $res['invoice_type'] = $this->invoiceType;
        }
        if (null !== $this->makeInvoiceDate) {
            $res['make_invoice_date'] = $this->makeInvoiceDate;
        }
        if (null !== $this->receiptTariffInvoiceParams) {
            $res['receipt_tariff_invoice_params'] = [];
            if(null !== $this->receiptTariffInvoiceParams && is_array($this->receiptTariffInvoiceParams)){
                $n = 0;
                foreach($this->receiptTariffInvoiceParams as $item){
                    $res['receipt_tariff_invoice_params'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->untaxedPrice) {
            $res['untaxed_price'] = $this->untaxedPrice;
        }
        if (null !== $this->invoiceTaxCode) {
            $res['invoice_tax_code'] = $this->invoiceTaxCode;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return SaveDigitalLogisticBillReceiptinvoiceRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['region_name'])){
            $model->regionName = $map['region_name'];
        }
        if(isset($map['action'])){
            $model->action = $map['action'];
        }
        if(isset($map['amount'])){
            $model->amount = $map['amount'];
        }
        if(isset($map['check_code'])){
            $model->checkCode = $map['check_code'];
        }
        if(isset($map['drawer_name'])){
            $model->drawerName = $map['drawer_name'];
        }
        if(isset($map['drawer_taxpayer_code'])){
            $model->drawerTaxpayerCode = $map['drawer_taxpayer_code'];
        }
        if(isset($map['forwarder_did'])){
            $model->forwarderDid = $map['forwarder_did'];
        }
        if(isset($map['invoice_code'])){
            $model->invoiceCode = $map['invoice_code'];
        }
        if(isset($map['invoice_number'])){
            $model->invoiceNumber = $map['invoice_number'];
        }
        if(isset($map['invoice_type'])){
            $model->invoiceType = $map['invoice_type'];
        }
        if(isset($map['make_invoice_date'])){
            $model->makeInvoiceDate = $map['make_invoice_date'];
        }
        if(isset($map['receipt_tariff_invoice_params'])){
            if(!empty($map['receipt_tariff_invoice_params'])){
                $model->receiptTariffInvoiceParams = [];
                $n = 0;
                foreach($map['receipt_tariff_invoice_params'] as $item) {
                    $model->receiptTariffInvoiceParams[$n++] = null !== $item ? ReceiptTariffInvoiceParam::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['untaxed_price'])){
            $model->untaxedPrice = $map['untaxed_price'];
        }
        if(isset($map['invoice_tax_code'])){
            $model->invoiceTaxCode = $map['invoice_tax_code'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    /**
     * @var string
     */
    public $regionName;

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

    // 开票方名称 业务必填
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

    // 应收发票唯一标识
    /**
     * @var string
     */
    public $invoiceCode;

    // 发票号码 业务必填
    /**
     * @var string
     */
    public $invoiceNumber;

    // 开票类型 业务必填
    /**
     * @var string
     */
    public $invoiceType;

    // 开票日期 毫秒值 业务必填
    /**
     * @var int
     */
    public $makeInvoiceDate;

    // 资费项发票 业务必填
    /**
     * @var ReceiptTariffInvoiceParam[]
     */
    public $receiptTariffInvoiceParams;

    // 不含税金额 业务必填
    /**
     * @var string
     */
    public $untaxedPrice;

    // 发票税务号
    /**
     * @var string
     */
    public $invoiceTaxCode;

}
