<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class CreateHighwayInvoiceRequest extends Model
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

    // 发票号码，8位发票号码
    /**
     * @var string
     */
    public $invoiceNo;

    // 发票代码，10位或者12位发票代码
    /**
     * @var string
     */
    public $invoiceCode;

    // 发票校验码后6位
    /**
     * @var string
     */
    public $verifyCode;

    // 收款方did，出票方，需要出票收钱的
    /**
     * @var string
     */
    public $payeeDid;

    // 付款方did，收票方，需要收票付钱的
    /**
     * @var string
     */
    public $payerDid;

    // 发票含税金额， 不超过2位小数的数字
    /**
     * @var string
     */
    public $invoiceContainsTax;

    // 发票不含税金额，不超过2位小数的数字
    /**
     * @var string
     */
    public $invoiceWithoutTax;

    // 开票日期，格式为yyyy-mm-dd
    /**
     * @var string
     */
    public $invoiceDate;

    // 发票类型，以下二选一填写：应收发票、应付发票
    /**
     * @var string
     */
    public $invoiceType;

    // 影像件ID，发票上传蚂蚁oss的文件ID。注意：影像件id和影像件hash，必须都填写或都不填，不可只填其中一项
    /**
     * @var string
     */
    public $fileId;

    // 影像件hash，上传蚂蚁oss的文件hash。注意：影像件id和影像件hash，必须都填写或都不填，不可只填其中一项
    /**
     * @var string
     */
    public $fileHash;

    // 发票归属平台did，用以区分是哪家平台/企业的发票
    /**
     * @var string
     */
    public $platformDid;

    // 发票种类，以下四选一填写（可填VAT_SPECIAL_INVOICE、VAT_NORMAL_INVOICE、VAT_ROLL_INVOICE、ELECTRONIC_INVOICE）。注：以上分别表示增值税专票、增值税普票、增值税卷票、电子发票
    /**
     * @var string
     */
    public $type;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'invoiceNo'          => 'invoice_no',
        'invoiceCode'        => 'invoice_code',
        'verifyCode'         => 'verify_code',
        'payeeDid'           => 'payee_did',
        'payerDid'           => 'payer_did',
        'invoiceContainsTax' => 'invoice_contains_tax',
        'invoiceWithoutTax'  => 'invoice_without_tax',
        'invoiceDate'        => 'invoice_date',
        'invoiceType'        => 'invoice_type',
        'fileId'             => 'file_id',
        'fileHash'           => 'file_hash',
        'platformDid'        => 'platform_did',
        'type'               => 'type',
    ];

    public function validate()
    {
        Model::validateRequired('invoiceNo', $this->invoiceNo, true);
        Model::validateRequired('invoiceCode', $this->invoiceCode, true);
        Model::validateRequired('payeeDid', $this->payeeDid, true);
        Model::validateRequired('payerDid', $this->payerDid, true);
        Model::validateRequired('invoiceContainsTax', $this->invoiceContainsTax, true);
        Model::validateRequired('invoiceWithoutTax', $this->invoiceWithoutTax, true);
        Model::validateRequired('invoiceDate', $this->invoiceDate, true);
        Model::validateRequired('invoiceType', $this->invoiceType, true);
        Model::validateRequired('platformDid', $this->platformDid, true);
        Model::validateRequired('type', $this->type, true);
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
        if (null !== $this->invoiceNo) {
            $res['invoice_no'] = $this->invoiceNo;
        }
        if (null !== $this->invoiceCode) {
            $res['invoice_code'] = $this->invoiceCode;
        }
        if (null !== $this->verifyCode) {
            $res['verify_code'] = $this->verifyCode;
        }
        if (null !== $this->payeeDid) {
            $res['payee_did'] = $this->payeeDid;
        }
        if (null !== $this->payerDid) {
            $res['payer_did'] = $this->payerDid;
        }
        if (null !== $this->invoiceContainsTax) {
            $res['invoice_contains_tax'] = $this->invoiceContainsTax;
        }
        if (null !== $this->invoiceWithoutTax) {
            $res['invoice_without_tax'] = $this->invoiceWithoutTax;
        }
        if (null !== $this->invoiceDate) {
            $res['invoice_date'] = $this->invoiceDate;
        }
        if (null !== $this->invoiceType) {
            $res['invoice_type'] = $this->invoiceType;
        }
        if (null !== $this->fileId) {
            $res['file_id'] = $this->fileId;
        }
        if (null !== $this->fileHash) {
            $res['file_hash'] = $this->fileHash;
        }
        if (null !== $this->platformDid) {
            $res['platform_did'] = $this->platformDid;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateHighwayInvoiceRequest
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
        if (isset($map['invoice_no'])) {
            $model->invoiceNo = $map['invoice_no'];
        }
        if (isset($map['invoice_code'])) {
            $model->invoiceCode = $map['invoice_code'];
        }
        if (isset($map['verify_code'])) {
            $model->verifyCode = $map['verify_code'];
        }
        if (isset($map['payee_did'])) {
            $model->payeeDid = $map['payee_did'];
        }
        if (isset($map['payer_did'])) {
            $model->payerDid = $map['payer_did'];
        }
        if (isset($map['invoice_contains_tax'])) {
            $model->invoiceContainsTax = $map['invoice_contains_tax'];
        }
        if (isset($map['invoice_without_tax'])) {
            $model->invoiceWithoutTax = $map['invoice_without_tax'];
        }
        if (isset($map['invoice_date'])) {
            $model->invoiceDate = $map['invoice_date'];
        }
        if (isset($map['invoice_type'])) {
            $model->invoiceType = $map['invoice_type'];
        }
        if (isset($map['file_id'])) {
            $model->fileId = $map['file_id'];
        }
        if (isset($map['file_hash'])) {
            $model->fileHash = $map['file_hash'];
        }
        if (isset($map['platform_did'])) {
            $model->platformDid = $map['platform_did'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }

        return $model;
    }
}
