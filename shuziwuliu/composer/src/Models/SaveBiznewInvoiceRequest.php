<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class SaveBiznewInvoiceRequest extends Model
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

    // 发票税务号 [业务必填]
    /**
     * @var string
     */
    public $invoiceTaxCode;

    // 发票号 [业务必填]
    /**
     * @var string
     */
    public $invoiceNumber;

    // 发票类型 [业务必填]
    /**
     * @var string
     */
    public $invoiceType;

    // 开票类型 pay/receipt (应付/应收) [业务必填]
    //
    //
    /**
     * @var string
     */
    public $type;

    // 校验码
    //
    //
    /**
     * @var string
     */
    public $checkCode;

    // 开票方名称 [业务必填]
    //
    //
    /**
     * @var string
     */
    public $drawerName;

    // 开票纳税人识别号 [业务必填]
    //
    //
    /**
     * @var string
     */
    public $drawerTaxpayerCode;

    // 受票方企业名称 [业务必填]
    //
    //
    /**
     * @var string
     */
    public $invoiceHeaderName;

    // 受票方企业信用证代码 [业务必填]
    //
    //
    /**
     * @var string
     */
    public $invoiceHeaderSocialNo;

    // 开票时间 [业务必填]
    //
    //
    /**
     * @var int
     */
    public $makeInvoiceDate;

    // 发票金额 [业务必填]
    //
    //
    /**
     * @var string
     */
    public $amount;

    // 币种 [业务必填]
    /**
     * @var string
     */
    public $currency;

    // 美元
    /**
     * @var string
     */
    public $dollarAmount;

    // 不含税金额 [业务必填]
    /**
     * @var string
     */
    public $untaxedPrice;

    // 发票文件ID [业务必填]
    /**
     * @var string
     */
    public $fileId;

    // 发票文件hash [业务必填]
    /**
     * @var string
     */
    public $fileHash;
    protected $_name = [
        'authToken'             => 'auth_token',
        'productInstanceId'     => 'product_instance_id',
        'forwarderDid'          => 'forwarder_did',
        'invoiceCode'           => 'invoice_code',
        'invoiceTaxCode'        => 'invoice_tax_code',
        'invoiceNumber'         => 'invoice_number',
        'invoiceType'           => 'invoice_type',
        'type'                  => 'type',
        'checkCode'             => 'check_code',
        'drawerName'            => 'drawer_name',
        'drawerTaxpayerCode'    => 'drawer_taxpayer_code',
        'invoiceHeaderName'     => 'invoice_header_name',
        'invoiceHeaderSocialNo' => 'invoice_header_social_no',
        'makeInvoiceDate'       => 'make_invoice_date',
        'amount'                => 'amount',
        'currency'              => 'currency',
        'dollarAmount'          => 'dollar_amount',
        'untaxedPrice'          => 'untaxed_price',
        'fileId'                => 'file_id',
        'fileHash'              => 'file_hash',
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
        if (null !== $this->forwarderDid) {
            $res['forwarder_did'] = $this->forwarderDid;
        }
        if (null !== $this->invoiceCode) {
            $res['invoice_code'] = $this->invoiceCode;
        }
        if (null !== $this->invoiceTaxCode) {
            $res['invoice_tax_code'] = $this->invoiceTaxCode;
        }
        if (null !== $this->invoiceNumber) {
            $res['invoice_number'] = $this->invoiceNumber;
        }
        if (null !== $this->invoiceType) {
            $res['invoice_type'] = $this->invoiceType;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
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
        if (null !== $this->invoiceHeaderName) {
            $res['invoice_header_name'] = $this->invoiceHeaderName;
        }
        if (null !== $this->invoiceHeaderSocialNo) {
            $res['invoice_header_social_no'] = $this->invoiceHeaderSocialNo;
        }
        if (null !== $this->makeInvoiceDate) {
            $res['make_invoice_date'] = $this->makeInvoiceDate;
        }
        if (null !== $this->amount) {
            $res['amount'] = $this->amount;
        }
        if (null !== $this->currency) {
            $res['currency'] = $this->currency;
        }
        if (null !== $this->dollarAmount) {
            $res['dollar_amount'] = $this->dollarAmount;
        }
        if (null !== $this->untaxedPrice) {
            $res['untaxed_price'] = $this->untaxedPrice;
        }
        if (null !== $this->fileId) {
            $res['file_id'] = $this->fileId;
        }
        if (null !== $this->fileHash) {
            $res['file_hash'] = $this->fileHash;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SaveBiznewInvoiceRequest
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
        if (isset($map['forwarder_did'])) {
            $model->forwarderDid = $map['forwarder_did'];
        }
        if (isset($map['invoice_code'])) {
            $model->invoiceCode = $map['invoice_code'];
        }
        if (isset($map['invoice_tax_code'])) {
            $model->invoiceTaxCode = $map['invoice_tax_code'];
        }
        if (isset($map['invoice_number'])) {
            $model->invoiceNumber = $map['invoice_number'];
        }
        if (isset($map['invoice_type'])) {
            $model->invoiceType = $map['invoice_type'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['check_code'])) {
            $model->checkCode = $map['check_code'];
        }
        if (isset($map['drawer_name'])) {
            $model->drawerName = $map['drawer_name'];
        }
        if (isset($map['drawer_taxpayer_code'])) {
            $model->drawerTaxpayerCode = $map['drawer_taxpayer_code'];
        }
        if (isset($map['invoice_header_name'])) {
            $model->invoiceHeaderName = $map['invoice_header_name'];
        }
        if (isset($map['invoice_header_social_no'])) {
            $model->invoiceHeaderSocialNo = $map['invoice_header_social_no'];
        }
        if (isset($map['make_invoice_date'])) {
            $model->makeInvoiceDate = $map['make_invoice_date'];
        }
        if (isset($map['amount'])) {
            $model->amount = $map['amount'];
        }
        if (isset($map['currency'])) {
            $model->currency = $map['currency'];
        }
        if (isset($map['dollar_amount'])) {
            $model->dollarAmount = $map['dollar_amount'];
        }
        if (isset($map['untaxed_price'])) {
            $model->untaxedPrice = $map['untaxed_price'];
        }
        if (isset($map['file_id'])) {
            $model->fileId = $map['file_id'];
        }
        if (isset($map['file_hash'])) {
            $model->fileHash = $map['file_hash'];
        }

        return $model;
    }
}
