<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class AccountDetail extends Model {
    protected $_name = [
        'merchantNo' => 'merchant_no',
        'tradeTime' => 'trade_time',
        'tradeNo' => 'trade_no',
        'accountNo' => 'account_no',
        'accountName' => 'account_name',
        'tradeAmt' => 'trade_amt',
        'dcFlag' => 'dc_flag',
        'othAccountNo' => 'oth_account_no',
        'othAccountName' => 'oth_account_name',
        'othBankCode' => 'oth_bank_code',
        'othBankName' => 'oth_bank_name',
        'tradeRemark' => 'trade_remark',
        'actualBalAmt' => 'actual_bal_amt',
    ];
    public function validate() {
        Model::validateRequired('merchantNo', $this->merchantNo, true);
        Model::validateRequired('tradeTime', $this->tradeTime, true);
        Model::validateRequired('tradeNo', $this->tradeNo, true);
        Model::validateRequired('accountNo', $this->accountNo, true);
        Model::validateRequired('tradeAmt', $this->tradeAmt, true);
        Model::validateRequired('dcFlag', $this->dcFlag, true);
        Model::validateRequired('othAccountNo', $this->othAccountNo, true);
        Model::validateRequired('othAccountName', $this->othAccountName, true);
        Model::validateRequired('othBankCode', $this->othBankCode, true);
        Model::validateRequired('othBankName', $this->othBankName, true);
        Model::validateRequired('tradeRemark', $this->tradeRemark, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->merchantNo) {
            $res['merchant_no'] = $this->merchantNo;
        }
        if (null !== $this->tradeTime) {
            $res['trade_time'] = $this->tradeTime;
        }
        if (null !== $this->tradeNo) {
            $res['trade_no'] = $this->tradeNo;
        }
        if (null !== $this->accountNo) {
            $res['account_no'] = $this->accountNo;
        }
        if (null !== $this->accountName) {
            $res['account_name'] = $this->accountName;
        }
        if (null !== $this->tradeAmt) {
            $res['trade_amt'] = $this->tradeAmt;
        }
        if (null !== $this->dcFlag) {
            $res['dc_flag'] = $this->dcFlag;
        }
        if (null !== $this->othAccountNo) {
            $res['oth_account_no'] = $this->othAccountNo;
        }
        if (null !== $this->othAccountName) {
            $res['oth_account_name'] = $this->othAccountName;
        }
        if (null !== $this->othBankCode) {
            $res['oth_bank_code'] = $this->othBankCode;
        }
        if (null !== $this->othBankName) {
            $res['oth_bank_name'] = $this->othBankName;
        }
        if (null !== $this->tradeRemark) {
            $res['trade_remark'] = $this->tradeRemark;
        }
        if (null !== $this->actualBalAmt) {
            $res['actual_bal_amt'] = $this->actualBalAmt;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return AccountDetail
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['merchant_no'])){
            $model->merchantNo = $map['merchant_no'];
        }
        if(isset($map['trade_time'])){
            $model->tradeTime = $map['trade_time'];
        }
        if(isset($map['trade_no'])){
            $model->tradeNo = $map['trade_no'];
        }
        if(isset($map['account_no'])){
            $model->accountNo = $map['account_no'];
        }
        if(isset($map['account_name'])){
            $model->accountName = $map['account_name'];
        }
        if(isset($map['trade_amt'])){
            $model->tradeAmt = $map['trade_amt'];
        }
        if(isset($map['dc_flag'])){
            $model->dcFlag = $map['dc_flag'];
        }
        if(isset($map['oth_account_no'])){
            $model->othAccountNo = $map['oth_account_no'];
        }
        if(isset($map['oth_account_name'])){
            $model->othAccountName = $map['oth_account_name'];
        }
        if(isset($map['oth_bank_code'])){
            $model->othBankCode = $map['oth_bank_code'];
        }
        if(isset($map['oth_bank_name'])){
            $model->othBankName = $map['oth_bank_name'];
        }
        if(isset($map['trade_remark'])){
            $model->tradeRemark = $map['trade_remark'];
        }
        if(isset($map['actual_bal_amt'])){
            $model->actualBalAmt = $map['actual_bal_amt'];
        }
        return $model;
    }
    // 商户号
    /**
     * @example 
     * @var string
     */
    public $merchantNo;

    // 交易时间
    /**
     * @example 
     * @var string
     */
    public $tradeTime;

    // 交易流水号
    /**
     * @example 
     * @var string
     */
    public $tradeNo;

    // 账号
    /**
     * @example 
     * @var string
     */
    public $accountNo;

    // 户名
    /**
     * @example 
     * @var string
     */
    public $accountName;

    // 交易金额
    /**
     * @example 
     * @var string
     */
    public $tradeAmt;

    // 借贷标识	基础类型
    /**
     * @example 
     * @var string
     */
    public $dcFlag;

    // 对手账号
    /**
     * @example 
     * @var string
     */
    public $othAccountNo;

    // 对手户名
    /**
     * @example 
     * @var string
     */
    public $othAccountName;

    // 对手行号
    /**
     * @example 
     * @var string
     */
    public $othBankCode;

    // 对手行名
    /**
     * @example 
     * @var string
     */
    public $othBankName;

    // 交易备注
    /**
     * @example 
     * @var string
     */
    public $tradeRemark;

    // 交易后余额
    /**
     * @example 
     * @var string
     */
    public $actualBalAmt;

}
