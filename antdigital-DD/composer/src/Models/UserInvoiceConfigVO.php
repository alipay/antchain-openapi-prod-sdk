<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

class UserInvoiceConfigVO extends Model {
    protected $_name = [
        'tenantId' => 'tenant_id',
        'companyName' => 'company_name',
        'companyPhoneNo' => 'company_phone_no',
        'companyAddress' => 'company_address',
        'bankName' => 'bank_name',
        'bankAccount' => 'bank_account',
        'taxNo' => 'tax_no',
        'generalTaxpayer' => 'general_taxpayer',
    ];
    public function validate() {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('companyName', $this->companyName, true);
        Model::validateRequired('generalTaxpayer', $this->generalTaxpayer, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->companyName) {
            $res['company_name'] = $this->companyName;
        }
        if (null !== $this->companyPhoneNo) {
            $res['company_phone_no'] = $this->companyPhoneNo;
        }
        if (null !== $this->companyAddress) {
            $res['company_address'] = $this->companyAddress;
        }
        if (null !== $this->bankName) {
            $res['bank_name'] = $this->bankName;
        }
        if (null !== $this->bankAccount) {
            $res['bank_account'] = $this->bankAccount;
        }
        if (null !== $this->taxNo) {
            $res['tax_no'] = $this->taxNo;
        }
        if (null !== $this->generalTaxpayer) {
            $res['general_taxpayer'] = $this->generalTaxpayer;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UserInvoiceConfigVO
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['tenant_id'])){
            $model->tenantId = $map['tenant_id'];
        }
        if(isset($map['company_name'])){
            $model->companyName = $map['company_name'];
        }
        if(isset($map['company_phone_no'])){
            $model->companyPhoneNo = $map['company_phone_no'];
        }
        if(isset($map['company_address'])){
            $model->companyAddress = $map['company_address'];
        }
        if(isset($map['bank_name'])){
            $model->bankName = $map['bank_name'];
        }
        if(isset($map['bank_account'])){
            $model->bankAccount = $map['bank_account'];
        }
        if(isset($map['tax_no'])){
            $model->taxNo = $map['tax_no'];
        }
        if(isset($map['general_taxpayer'])){
            $model->generalTaxpayer = $map['general_taxpayer'];
        }
        return $model;
    }
    // 租户ID
    /**
     * @example 2088720671581149
     * @var string
     */
    public $tenantId;

    // 企业名称
    /**
     * @example XX公司
     * @var string
     */
    public $companyName;

    // 企业电话
    /**
     * @example 0571-877776
     * @var string
     */
    public $companyPhoneNo;

    // 公司地址(详细地址)
    /**
     * @example 上海市黄浦区外马路
     * @var string
     */
    public $companyAddress;

    // 银行名称
    /**
     * @example 招商银行
     * @var string
     */
    public $bankName;

    // 银行账号
    /**
     * @example 34355565
     * @var string
     */
    public $bankAccount;

    // 税号
    /**
     * @example 35556T5
     * @var string
     */
    public $taxNo;

    // 是否是一般纳税人
    /**
     * @example true, false
     * @var bool
     */
    public $generalTaxpayer;

}
