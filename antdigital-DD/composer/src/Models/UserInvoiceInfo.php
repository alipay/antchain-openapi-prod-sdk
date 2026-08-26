<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

class UserInvoiceInfo extends Model {
    protected $_name = [
        'title' => 'title',
        'taxPayerQualification' => 'tax_payer_qualification',
        'registerCountry' => 'register_country',
        'address' => 'address',
        'taxNo' => 'tax_no',
        'telephone' => 'telephone',
        'bankName' => 'bank_name',
        'bankAccount' => 'bank_account',
    ];
    public function validate() {
        Model::validateRequired('title', $this->title, true);
        Model::validateRequired('taxPayerQualification', $this->taxPayerQualification, true);
        Model::validateRequired('registerCountry', $this->registerCountry, true);
        Model::validateRequired('address', $this->address, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->title) {
            $res['title'] = $this->title;
        }
        if (null !== $this->taxPayerQualification) {
            $res['tax_payer_qualification'] = $this->taxPayerQualification;
        }
        if (null !== $this->registerCountry) {
            $res['register_country'] = $this->registerCountry;
        }
        if (null !== $this->address) {
            $res['address'] = $this->address;
        }
        if (null !== $this->taxNo) {
            $res['tax_no'] = $this->taxNo;
        }
        if (null !== $this->telephone) {
            $res['telephone'] = $this->telephone;
        }
        if (null !== $this->bankName) {
            $res['bank_name'] = $this->bankName;
        }
        if (null !== $this->bankAccount) {
            $res['bank_account'] = $this->bankAccount;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UserInvoiceInfo
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['title'])){
            $model->title = $map['title'];
        }
        if(isset($map['tax_payer_qualification'])){
            $model->taxPayerQualification = $map['tax_payer_qualification'];
        }
        if(isset($map['register_country'])){
            $model->registerCountry = $map['register_country'];
        }
        if(isset($map['address'])){
            $model->address = $map['address'];
        }
        if(isset($map['tax_no'])){
            $model->taxNo = $map['tax_no'];
        }
        if(isset($map['telephone'])){
            $model->telephone = $map['telephone'];
        }
        if(isset($map['bank_name'])){
            $model->bankName = $map['bank_name'];
        }
        if(isset($map['bank_account'])){
            $model->bankAccount = $map['bank_account'];
        }
        return $model;
    }
    // 公司标题（发票抬头）
    /**
     * @example xxxx Group Limited
     * @var string
     */
    public $title;

    // 纳税人类型
    /**
     * @example 03
     * @var string
     */
    public $taxPayerQualification;

    // 注册国家编号
    /**
     * @example HK
     * @var string
     */
    public $registerCountry;

    // 公司注册地址
    /**
     * @example xxxxxx
     * @var string
     */
    public $address;

    // 纳税人识别号
    /**
     * @example 123
     * @var string
     */
    public $taxNo;

    // 公司注册电话
    /**
     * @example 17797768855
     * @var string
     */
    public $telephone;

    // 开户行
    /**
     * @example 中国人民银行
     * @var string
     */
    public $bankName;

    // 银行账号
    /**
     * @example 12312312
     * @var string
     */
    public $bankAccount;

}
