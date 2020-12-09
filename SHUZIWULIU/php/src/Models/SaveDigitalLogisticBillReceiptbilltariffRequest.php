<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class SaveDigitalLogisticBillReceiptbilltariffRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'action' => 'action',
        'billingNumber' => 'billing_number',
        'billingType' => 'billing_type',
        'bkgNo' => 'bkg_no',
        'bookingNo' => 'booking_no',
        'currency' => 'currency',
        'forwarderDid' => 'forwarder_did',
        'incomeOrExpenses' => 'income_or_expenses',
        'invoiceUrl' => 'invoice_url',
        'orderNo' => 'order_no',
        'priceIncludingTax' => 'price_including_tax',
        'receiptTariffCode' => 'receipt_tariff_code',
        'receiptTariffDesc' => 'receipt_tariff_desc',
        'receiptTariffProject' => 'receipt_tariff_project',
        'settleClient' => 'settle_client',
        'settleClientCertNo' => 'settle_client_cert_no',
        'settleClientDid' => 'settle_client_did',
        'taxes' => 'taxes',
        'untaxedPrice' => 'untaxed_price',
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
        if (null !== $this->billingNumber) {
            $res['billing_number'] = $this->billingNumber;
        }
        if (null !== $this->billingType) {
            $res['billing_type'] = $this->billingType;
        }
        if (null !== $this->bkgNo) {
            $res['bkg_no'] = $this->bkgNo;
        }
        if (null !== $this->bookingNo) {
            $res['booking_no'] = $this->bookingNo;
        }
        if (null !== $this->currency) {
            $res['currency'] = $this->currency;
        }
        if (null !== $this->forwarderDid) {
            $res['forwarder_did'] = $this->forwarderDid;
        }
        if (null !== $this->incomeOrExpenses) {
            $res['income_or_expenses'] = $this->incomeOrExpenses;
        }
        if (null !== $this->invoiceUrl) {
            $res['invoice_url'] = $this->invoiceUrl;
        }
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->priceIncludingTax) {
            $res['price_including_tax'] = $this->priceIncludingTax;
        }
        if (null !== $this->receiptTariffCode) {
            $res['receipt_tariff_code'] = $this->receiptTariffCode;
        }
        if (null !== $this->receiptTariffDesc) {
            $res['receipt_tariff_desc'] = $this->receiptTariffDesc;
        }
        if (null !== $this->receiptTariffProject) {
            $res['receipt_tariff_project'] = $this->receiptTariffProject;
        }
        if (null !== $this->settleClient) {
            $res['settle_client'] = $this->settleClient;
        }
        if (null !== $this->settleClientCertNo) {
            $res['settle_client_cert_no'] = $this->settleClientCertNo;
        }
        if (null !== $this->settleClientDid) {
            $res['settle_client_did'] = $this->settleClientDid;
        }
        if (null !== $this->taxes) {
            $res['taxes'] = $this->taxes;
        }
        if (null !== $this->untaxedPrice) {
            $res['untaxed_price'] = $this->untaxedPrice;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return SaveDigitalLogisticBillReceiptbilltariffRequest
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
        if(isset($map['billing_number'])){
            $model->billingNumber = $map['billing_number'];
        }
        if(isset($map['billing_type'])){
            $model->billingType = $map['billing_type'];
        }
        if(isset($map['bkg_no'])){
            $model->bkgNo = $map['bkg_no'];
        }
        if(isset($map['booking_no'])){
            $model->bookingNo = $map['booking_no'];
        }
        if(isset($map['currency'])){
            $model->currency = $map['currency'];
        }
        if(isset($map['forwarder_did'])){
            $model->forwarderDid = $map['forwarder_did'];
        }
        if(isset($map['income_or_expenses'])){
            $model->incomeOrExpenses = $map['income_or_expenses'];
        }
        if(isset($map['invoice_url'])){
            $model->invoiceUrl = $map['invoice_url'];
        }
        if(isset($map['order_no'])){
            $model->orderNo = $map['order_no'];
        }
        if(isset($map['price_including_tax'])){
            $model->priceIncludingTax = $map['price_including_tax'];
        }
        if(isset($map['receipt_tariff_code'])){
            $model->receiptTariffCode = $map['receipt_tariff_code'];
        }
        if(isset($map['receipt_tariff_desc'])){
            $model->receiptTariffDesc = $map['receipt_tariff_desc'];
        }
        if(isset($map['receipt_tariff_project'])){
            $model->receiptTariffProject = $map['receipt_tariff_project'];
        }
        if(isset($map['settle_client'])){
            $model->settleClient = $map['settle_client'];
        }
        if(isset($map['settle_client_cert_no'])){
            $model->settleClientCertNo = $map['settle_client_cert_no'];
        }
        if(isset($map['settle_client_did'])){
            $model->settleClientDid = $map['settle_client_did'];
        }
        if(isset($map['taxes'])){
            $model->taxes = $map['taxes'];
        }
        if(isset($map['untaxed_price'])){
            $model->untaxedPrice = $map['untaxed_price'];
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

    // 计费数量  业务必填
    /**
     * @var string
     */
    public $billingNumber;

    // 计费类型 业务必填
    /**
     * @var string
     */
    public $billingType;

    // 航运订舱号[业务必填]
    /**
     * @var string
     */
    public $bkgNo;

    // 订舱单号[业务必填]
    /**
     * @var string
     */
    public $bookingNo;

    // 币种 [业务必填]
    /**
     * @var string
     */
    public $currency;

    // 货代did
    /**
     * @var string
     */
    public $forwarderDid;

    // 收支  INCOME--收入， EXPENSES--支出
    // 业务必填
    /**
     * @var string
     */
    public $incomeOrExpenses;

    // 电子发票网址
    /**
     * @var string
     */
    public $invoiceUrl;

    // 工作单号 业务必填
    /**
     * @var string
     */
    public $orderNo;

    // 含税价 业务必填
    /**
     * @var string
     */
    public $priceIncludingTax;

    // 资费单据编号
    /**
     * @var string
     */
    public $receiptTariffCode;

    // 中文描述 业务必填
    /**
     * @var string
     */
    public $receiptTariffDesc;

    // 资费项目 业务必填
    /**
     * @var string
     */
    public $receiptTariffProject;

    // 结算客户名称
    /**
     * @var string
     */
    public $settleClient;

    // 结算客户企业信用号
    /**
     * @var string
     */
    public $settleClientCertNo;

    // 结算客户did
    /**
     * @var string
     */
    public $settleClientDid;

    // 税金
    /**
     * @var string
     */
    public $taxes;

    // 未税价 业务必填
    /**
     * @var string
     */
    public $untaxedPrice;

}
