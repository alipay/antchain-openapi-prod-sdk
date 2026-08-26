<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

class ApplyInvoiceBuyer extends Model {
    protected $_name = [
        'buyerAddress' => 'buyer_address',
        'buyerBankAccount' => 'buyer_bank_account',
        'buyerBankName' => 'buyer_bank_name',
        'buyerInvoiceTitle' => 'buyer_invoice_title',
        'buyerTaxNo' => 'buyer_tax_no',
        'buyerTelephone' => 'buyer_telephone',
        'taxPayerQualification' => 'tax_payer_qualification',
        'buyerConfigId' => 'buyer_config_id',
    ];
    public function validate() {
        Model::validateRequired('buyerInvoiceTitle', $this->buyerInvoiceTitle, true);
        Model::validateRequired('taxPayerQualification', $this->taxPayerQualification, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->buyerAddress) {
            $res['buyer_address'] = $this->buyerAddress;
        }
        if (null !== $this->buyerBankAccount) {
            $res['buyer_bank_account'] = $this->buyerBankAccount;
        }
        if (null !== $this->buyerBankName) {
            $res['buyer_bank_name'] = $this->buyerBankName;
        }
        if (null !== $this->buyerInvoiceTitle) {
            $res['buyer_invoice_title'] = $this->buyerInvoiceTitle;
        }
        if (null !== $this->buyerTaxNo) {
            $res['buyer_tax_no'] = $this->buyerTaxNo;
        }
        if (null !== $this->buyerTelephone) {
            $res['buyer_telephone'] = $this->buyerTelephone;
        }
        if (null !== $this->taxPayerQualification) {
            $res['tax_payer_qualification'] = $this->taxPayerQualification;
        }
        if (null !== $this->buyerConfigId) {
            $res['buyer_config_id'] = $this->buyerConfigId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ApplyInvoiceBuyer
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['buyer_address'])){
            $model->buyerAddress = $map['buyer_address'];
        }
        if(isset($map['buyer_bank_account'])){
            $model->buyerBankAccount = $map['buyer_bank_account'];
        }
        if(isset($map['buyer_bank_name'])){
            $model->buyerBankName = $map['buyer_bank_name'];
        }
        if(isset($map['buyer_invoice_title'])){
            $model->buyerInvoiceTitle = $map['buyer_invoice_title'];
        }
        if(isset($map['buyer_tax_no'])){
            $model->buyerTaxNo = $map['buyer_tax_no'];
        }
        if(isset($map['buyer_telephone'])){
            $model->buyerTelephone = $map['buyer_telephone'];
        }
        if(isset($map['tax_payer_qualification'])){
            $model->taxPayerQualification = $map['tax_payer_qualification'];
        }
        if(isset($map['buyer_config_id'])){
            $model->buyerConfigId = $map['buyer_config_id'];
        }
        return $model;
    }
    // 购方地址
    /**
     * @example 上海市黄浦区
     * @var string
     */
    public $buyerAddress;

    // 银行账号
    /**
     * @example 23355434
     * @var string
     */
    public $buyerBankAccount;

    // 银行名称
    /**
     * @example 招商银行
     * @var string
     */
    public $buyerBankName;

    // 抬头
    /**
     * @example xxxx公司
     * @var string
     */
    public $buyerInvoiceTitle;

    // 税号
    /**
     * @example 3344555
     * @var string
     */
    public $buyerTaxNo;

    // 电话
    /**
     * @example 0571-94848
     * @var string
     */
    public $buyerTelephone;

    // 纳税人资格类型
    /**
     * @example 01
     * @var string
     */
    public $taxPayerQualification;

    // 客户开票配置ID
    /**
     * @example 2344
     * @var string
     */
    public $buyerConfigId;

}
