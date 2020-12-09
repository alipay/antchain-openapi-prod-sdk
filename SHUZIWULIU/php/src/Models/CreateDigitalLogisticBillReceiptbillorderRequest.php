<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

use AntChain\SHUZIWULIU\Models\ReceiptBillTariffParam;

class CreateDigitalLogisticBillReceiptbillorderRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'actualSettleCompany' => 'actual_settle_company',
        'actualSettleCompanyCertNo' => 'actual_settle_company_cert_no',
        'actualSettleCompanyDid' => 'actual_settle_company_did',
        'applyDate' => 'apply_date',
        'clientType' => 'client_type',
        'currency' => 'currency',
        'forwarderDid' => 'forwarder_did',
        'invoiceTitle' => 'invoice_title',
        'priceIncludingTax' => 'price_including_tax',
        'receiptAccount' => 'receipt_account',
        'receiptAmount' => 'receipt_amount',
        'receiptBillOrderCode' => 'receipt_bill_order_code',
        'receiptBillTariffParams' => 'receipt_bill_tariff_params',
        'settleClient' => 'settle_client',
        'settleClientCertNo' => 'settle_client_cert_no',
        'settleClientDid' => 'settle_client_did',
        'settleCompany' => 'settle_company',
        'settleCompanyCertNo' => 'settle_company_cert_no',
        'settleCompanyDid' => 'settle_company_did',
        'settleCycle' => 'settle_cycle',
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
        if (null !== $this->actualSettleCompany) {
            $res['actual_settle_company'] = $this->actualSettleCompany;
        }
        if (null !== $this->actualSettleCompanyCertNo) {
            $res['actual_settle_company_cert_no'] = $this->actualSettleCompanyCertNo;
        }
        if (null !== $this->actualSettleCompanyDid) {
            $res['actual_settle_company_did'] = $this->actualSettleCompanyDid;
        }
        if (null !== $this->applyDate) {
            $res['apply_date'] = $this->applyDate;
        }
        if (null !== $this->clientType) {
            $res['client_type'] = $this->clientType;
        }
        if (null !== $this->currency) {
            $res['currency'] = $this->currency;
        }
        if (null !== $this->forwarderDid) {
            $res['forwarder_did'] = $this->forwarderDid;
        }
        if (null !== $this->invoiceTitle) {
            $res['invoice_title'] = $this->invoiceTitle;
        }
        if (null !== $this->priceIncludingTax) {
            $res['price_including_tax'] = $this->priceIncludingTax;
        }
        if (null !== $this->receiptAccount) {
            $res['receipt_account'] = $this->receiptAccount;
        }
        if (null !== $this->receiptAmount) {
            $res['receipt_amount'] = $this->receiptAmount;
        }
        if (null !== $this->receiptBillOrderCode) {
            $res['receipt_bill_order_code'] = $this->receiptBillOrderCode;
        }
        if (null !== $this->receiptBillTariffParams) {
            $res['receipt_bill_tariff_params'] = [];
            if(null !== $this->receiptBillTariffParams && is_array($this->receiptBillTariffParams)){
                $n = 0;
                foreach($this->receiptBillTariffParams as $item){
                    $res['receipt_bill_tariff_params'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
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
        if (null !== $this->settleCompany) {
            $res['settle_company'] = $this->settleCompany;
        }
        if (null !== $this->settleCompanyCertNo) {
            $res['settle_company_cert_no'] = $this->settleCompanyCertNo;
        }
        if (null !== $this->settleCompanyDid) {
            $res['settle_company_did'] = $this->settleCompanyDid;
        }
        if (null !== $this->settleCycle) {
            $res['settle_cycle'] = $this->settleCycle;
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
     * @return CreateDigitalLogisticBillReceiptbillorderRequest
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
        if(isset($map['actual_settle_company'])){
            $model->actualSettleCompany = $map['actual_settle_company'];
        }
        if(isset($map['actual_settle_company_cert_no'])){
            $model->actualSettleCompanyCertNo = $map['actual_settle_company_cert_no'];
        }
        if(isset($map['actual_settle_company_did'])){
            $model->actualSettleCompanyDid = $map['actual_settle_company_did'];
        }
        if(isset($map['apply_date'])){
            $model->applyDate = $map['apply_date'];
        }
        if(isset($map['client_type'])){
            $model->clientType = $map['client_type'];
        }
        if(isset($map['currency'])){
            $model->currency = $map['currency'];
        }
        if(isset($map['forwarder_did'])){
            $model->forwarderDid = $map['forwarder_did'];
        }
        if(isset($map['invoice_title'])){
            $model->invoiceTitle = $map['invoice_title'];
        }
        if(isset($map['price_including_tax'])){
            $model->priceIncludingTax = $map['price_including_tax'];
        }
        if(isset($map['receipt_account'])){
            $model->receiptAccount = $map['receipt_account'];
        }
        if(isset($map['receipt_amount'])){
            $model->receiptAmount = $map['receipt_amount'];
        }
        if(isset($map['receipt_bill_order_code'])){
            $model->receiptBillOrderCode = $map['receipt_bill_order_code'];
        }
        if(isset($map['receipt_bill_tariff_params'])){
            if(!empty($map['receipt_bill_tariff_params'])){
                $model->receiptBillTariffParams = [];
                $n = 0;
                foreach($map['receipt_bill_tariff_params'] as $item) {
                    $model->receiptBillTariffParams[$n++] = null !== $item ? ReceiptBillTariffParam::fromMap($item) : $item;
                }
            }
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
        if(isset($map['settle_company'])){
            $model->settleCompany = $map['settle_company'];
        }
        if(isset($map['settle_company_cert_no'])){
            $model->settleCompanyCertNo = $map['settle_company_cert_no'];
        }
        if(isset($map['settle_company_did'])){
            $model->settleCompanyDid = $map['settle_company_did'];
        }
        if(isset($map['settle_cycle'])){
            $model->settleCycle = $map['settle_cycle'];
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

    // 实际收款结算公司
    /**
     * @var string
     */
    public $actualSettleCompany;

    // 实际收款结算公司企业信用号
    /**
     * @var string
     */
    public $actualSettleCompanyCertNo;

    // 实际收款结算公司did
    /**
     * @var string
     */
    public $actualSettleCompanyDid;

    // 确认时间  业务必填
    /**
     * @var int
     */
    public $applyDate;

    // 揽货类型
    /**
     * @var string
     */
    public $clientType;

    // 币种 业务必填
    /**
     * @var string
     */
    public $currency;

    // 货代did
    /**
     * @var string
     */
    public $forwarderDid;

    // 开票抬头
    /**
     * @var string
     */
    public $invoiceTitle;

    // 含税价
    /**
     * @var string
     */
    public $priceIncludingTax;

    // 收款账号
    /**
     * @var string
     */
    public $receiptAccount;

    // 收款总额 业务必填
    /**
     * @var string
     */
    public $receiptAmount;

    // 收款账单编号
    /**
     * @var string
     */
    public $receiptBillOrderCode;

    // 应收资费项账单 业务必填
    /**
     * @var ReceiptBillTariffParam[]
     */
    public $receiptBillTariffParams;

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

    // 结算客户名称did
    /**
     * @var string
     */
    public $settleClientDid;

    // 结算公司
    /**
     * @var string
     */
    public $settleCompany;

    // 结算公司企业信用号
    /**
     * @var string
     */
    public $settleCompanyCertNo;

    // 结算公司did
    /**
     * @var string
     */
    public $settleCompanyDid;

    // 账单结算周期
    /**
     * @var string
     */
    public $settleCycle;

    // 税金
    /**
     * @var string
     */
    public $taxes;

    // 未税价
    /**
     * @var string
     */
    public $untaxedPrice;

}
