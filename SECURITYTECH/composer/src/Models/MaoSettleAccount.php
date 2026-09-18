<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class MaoSettleAccount extends Model {
    protected $_name = [
        'settlementAccountType' => 'settlement_account_type',
        'settlementAccountName' => 'settlement_account_name',
        'accountNo' => 'account_no',
        'bankName' => 'bank_name',
        'bankCode' => 'bank_code',
        'bankBranchName' => 'bank_branch_name',
        'bankBranchCode' => 'bank_branch_code',
        'bankProvince' => 'bank_province',
        'bankCity' => 'bank_city',
        'bankCardImage' => 'bank_card_image',
        'openPermitImage' => 'open_permit_image',
        'unionpayNumber' => 'unionpay_number',
    ];
    public function validate() {
        Model::validateRequired('settlementAccountType', $this->settlementAccountType, true);
        Model::validateRequired('settlementAccountName', $this->settlementAccountName, true);
        Model::validateRequired('accountNo', $this->accountNo, true);
        Model::validateRequired('bankName', $this->bankName, true);
        Model::validateRequired('bankProvince', $this->bankProvince, true);
        Model::validateRequired('bankCity', $this->bankCity, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->settlementAccountType) {
            $res['settlement_account_type'] = $this->settlementAccountType;
        }
        if (null !== $this->settlementAccountName) {
            $res['settlement_account_name'] = $this->settlementAccountName;
        }
        if (null !== $this->accountNo) {
            $res['account_no'] = $this->accountNo;
        }
        if (null !== $this->bankName) {
            $res['bank_name'] = $this->bankName;
        }
        if (null !== $this->bankCode) {
            $res['bank_code'] = $this->bankCode;
        }
        if (null !== $this->bankBranchName) {
            $res['bank_branch_name'] = $this->bankBranchName;
        }
        if (null !== $this->bankBranchCode) {
            $res['bank_branch_code'] = $this->bankBranchCode;
        }
        if (null !== $this->bankProvince) {
            $res['bank_province'] = $this->bankProvince;
        }
        if (null !== $this->bankCity) {
            $res['bank_city'] = $this->bankCity;
        }
        if (null !== $this->bankCardImage) {
            $res['bank_card_image'] = $this->bankCardImage;
        }
        if (null !== $this->openPermitImage) {
            $res['open_permit_image'] = $this->openPermitImage;
        }
        if (null !== $this->unionpayNumber) {
            $res['unionpay_number'] = $this->unionpayNumber;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return MaoSettleAccount
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['settlement_account_type'])){
            $model->settlementAccountType = $map['settlement_account_type'];
        }
        if(isset($map['settlement_account_name'])){
            $model->settlementAccountName = $map['settlement_account_name'];
        }
        if(isset($map['account_no'])){
            $model->accountNo = $map['account_no'];
        }
        if(isset($map['bank_name'])){
            $model->bankName = $map['bank_name'];
        }
        if(isset($map['bank_code'])){
            $model->bankCode = $map['bank_code'];
        }
        if(isset($map['bank_branch_name'])){
            $model->bankBranchName = $map['bank_branch_name'];
        }
        if(isset($map['bank_branch_code'])){
            $model->bankBranchCode = $map['bank_branch_code'];
        }
        if(isset($map['bank_province'])){
            $model->bankProvince = $map['bank_province'];
        }
        if(isset($map['bank_city'])){
            $model->bankCity = $map['bank_city'];
        }
        if(isset($map['bank_card_image'])){
            $model->bankCardImage = $map['bank_card_image'];
        }
        if(isset($map['open_permit_image'])){
            $model->openPermitImage = $map['open_permit_image'];
        }
        if(isset($map['unionpay_number'])){
            $model->unionpayNumber = $map['unionpay_number'];
        }
        return $model;
    }
    // 结算账户类型
    /**
     * @example 结算账户类型
     * @var string
     */
    public $settlementAccountType;

    // 收款账户户名
    /**
     * @example 收款账户户名
     * @var string
     */
    public $settlementAccountName;

    // 银行账户号
    /**
     * @example 银行账户号
     * @var string
     */
    public $accountNo;

    // 开户行总行名称
    /**
     * @example 开户行总行名称
     * @var string
     */
    public $bankName;

    // 开户行总行编码
    /**
     * @example 开户行总行编码
     * @var string
     */
    public $bankCode;

    // 开户行支行名称
    /**
     * @example 开户行支行名称
     * @var string
     */
    public $bankBranchName;

    // 开户支行编码
    /**
     * @example 开户支行编码
     * @var string
     */
    public $bankBranchCode;

    // 开户行所在省
    /**
     * @example 开户行所在省
     * @var string
     */
    public $bankProvince;

    // 开户行所在市
    /**
     * @example 开户行所在市
     * @var string
     */
    public $bankCity;

    // 银行卡照片 URL
    /**
     * @example 银行卡照片 URL
     * @var string
     */
    public $bankCardImage;

    // 开户许可证照片 URL
    /**
     * @example 开户许可证照片 URL
     * @var string
     */
    public $openPermitImage;

    // 银联号
    /**
     * @example 银联号
     * @var string
     */
    public $unionpayNumber;

}
