<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

class ApplyInvoiceSeller extends Model {
    protected $_name = [
        'sellerAddress' => 'seller_address',
        'sellerBankAccount' => 'seller_bank_account',
        'sellerBankName' => 'seller_bank_name',
        'sellerCompanyName' => 'seller_company_name',
        'sellerTaxNo' => 'seller_tax_no',
        'sellerTelephone' => 'seller_telephone',
        'sellerInstId' => 'seller_inst_id',
    ];
    public function validate() {
        Model::validateRequired('sellerBankAccount', $this->sellerBankAccount, true);
        Model::validateRequired('sellerBankName', $this->sellerBankName, true);
        Model::validateRequired('sellerCompanyName', $this->sellerCompanyName, true);
        Model::validateRequired('sellerTaxNo', $this->sellerTaxNo, true);
        Model::validateRequired('sellerTelephone', $this->sellerTelephone, true);
        Model::validateRequired('sellerInstId', $this->sellerInstId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->sellerAddress) {
            $res['seller_address'] = $this->sellerAddress;
        }
        if (null !== $this->sellerBankAccount) {
            $res['seller_bank_account'] = $this->sellerBankAccount;
        }
        if (null !== $this->sellerBankName) {
            $res['seller_bank_name'] = $this->sellerBankName;
        }
        if (null !== $this->sellerCompanyName) {
            $res['seller_company_name'] = $this->sellerCompanyName;
        }
        if (null !== $this->sellerTaxNo) {
            $res['seller_tax_no'] = $this->sellerTaxNo;
        }
        if (null !== $this->sellerTelephone) {
            $res['seller_telephone'] = $this->sellerTelephone;
        }
        if (null !== $this->sellerInstId) {
            $res['seller_inst_id'] = $this->sellerInstId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ApplyInvoiceSeller
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['seller_address'])){
            $model->sellerAddress = $map['seller_address'];
        }
        if(isset($map['seller_bank_account'])){
            $model->sellerBankAccount = $map['seller_bank_account'];
        }
        if(isset($map['seller_bank_name'])){
            $model->sellerBankName = $map['seller_bank_name'];
        }
        if(isset($map['seller_company_name'])){
            $model->sellerCompanyName = $map['seller_company_name'];
        }
        if(isset($map['seller_tax_no'])){
            $model->sellerTaxNo = $map['seller_tax_no'];
        }
        if(isset($map['seller_telephone'])){
            $model->sellerTelephone = $map['seller_telephone'];
        }
        if(isset($map['seller_inst_id'])){
            $model->sellerInstId = $map['seller_inst_id'];
        }
        return $model;
    }
    // 地址
    /**
     * @example 上海市黄浦区
     * @var string
     */
    public $sellerAddress;

    // 银行账号
    /**
     * @example 323422244555
     * @var string
     */
    public $sellerBankAccount;

    // 银行名称
    /**
     * @example 招商很行
     * @var string
     */
    public $sellerBankName;

    // 公司名称
    /**
     * @example 蚂蚁区块链
     * @var string
     */
    public $sellerCompanyName;

    // 税号
    /**
     * @example 33453344556
     * @var string
     */
    public $sellerTaxNo;

    // 电话
    /**
     * @example 0571-978655
     * @var string
     */
    public $sellerTelephone;

    // 销方机构id
    /**
     * @example ZL6
     * @var string
     */
    public $sellerInstId;

}
