<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

class IntlRcptDetailItem extends Model {
    protected $_name = [
        'receiptNo' => 'receipt_no',
        'tenantId' => 'tenant_id',
        'arNo' => 'ar_no',
        'chargeType' => 'charge_type',
        'rcptContractAmt' => 'rcpt_contract_amt',
        'reptInvedAmt' => 'rept_inved_amt',
        'rcptContractRemainAmt' => 'rcpt_contract_remain_amt',
        'commodityCode' => 'commodity_code',
        'commodityName' => 'commodity_name',
        'ou' => 'ou',
        'ccy' => 'ccy',
        'rate' => 'rate',
        'rcptContractAmtExclTax' => 'rcpt_contract_amt_excl_tax',
        'reptInvedAmtExclTax' => 'rept_inved_amt_excl_tax',
        'rcptContractRemainAmtExclTax' => 'rcpt_contract_remain_amt_excl_tax',
    ];
    public function validate() {
        Model::validateRequired('receiptNo', $this->receiptNo, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('arNo', $this->arNo, true);
        Model::validateRequired('chargeType', $this->chargeType, true);
        Model::validateRequired('rcptContractAmt', $this->rcptContractAmt, true);
        Model::validateRequired('reptInvedAmt', $this->reptInvedAmt, true);
        Model::validateRequired('rcptContractRemainAmt', $this->rcptContractRemainAmt, true);
        Model::validateRequired('commodityCode', $this->commodityCode, true);
        Model::validateRequired('commodityName', $this->commodityName, true);
        Model::validateRequired('ou', $this->ou, true);
        Model::validateRequired('ccy', $this->ccy, true);
        Model::validateRequired('rate', $this->rate, true);
        Model::validateRequired('rcptContractAmtExclTax', $this->rcptContractAmtExclTax, true);
        Model::validateRequired('reptInvedAmtExclTax', $this->reptInvedAmtExclTax, true);
        Model::validateRequired('rcptContractRemainAmtExclTax', $this->rcptContractRemainAmtExclTax, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->receiptNo) {
            $res['receipt_no'] = $this->receiptNo;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->arNo) {
            $res['ar_no'] = $this->arNo;
        }
        if (null !== $this->chargeType) {
            $res['charge_type'] = $this->chargeType;
        }
        if (null !== $this->rcptContractAmt) {
            $res['rcpt_contract_amt'] = $this->rcptContractAmt;
        }
        if (null !== $this->reptInvedAmt) {
            $res['rept_inved_amt'] = $this->reptInvedAmt;
        }
        if (null !== $this->rcptContractRemainAmt) {
            $res['rcpt_contract_remain_amt'] = $this->rcptContractRemainAmt;
        }
        if (null !== $this->commodityCode) {
            $res['commodity_code'] = $this->commodityCode;
        }
        if (null !== $this->commodityName) {
            $res['commodity_name'] = $this->commodityName;
        }
        if (null !== $this->ou) {
            $res['ou'] = $this->ou;
        }
        if (null !== $this->ccy) {
            $res['ccy'] = $this->ccy;
        }
        if (null !== $this->rate) {
            $res['rate'] = $this->rate;
        }
        if (null !== $this->rcptContractAmtExclTax) {
            $res['rcpt_contract_amt_excl_tax'] = $this->rcptContractAmtExclTax;
        }
        if (null !== $this->reptInvedAmtExclTax) {
            $res['rept_inved_amt_excl_tax'] = $this->reptInvedAmtExclTax;
        }
        if (null !== $this->rcptContractRemainAmtExclTax) {
            $res['rcpt_contract_remain_amt_excl_tax'] = $this->rcptContractRemainAmtExclTax;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return IntlRcptDetailItem
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['receipt_no'])){
            $model->receiptNo = $map['receipt_no'];
        }
        if(isset($map['tenant_id'])){
            $model->tenantId = $map['tenant_id'];
        }
        if(isset($map['ar_no'])){
            $model->arNo = $map['ar_no'];
        }
        if(isset($map['charge_type'])){
            $model->chargeType = $map['charge_type'];
        }
        if(isset($map['rcpt_contract_amt'])){
            $model->rcptContractAmt = $map['rcpt_contract_amt'];
        }
        if(isset($map['rept_inved_amt'])){
            $model->reptInvedAmt = $map['rept_inved_amt'];
        }
        if(isset($map['rcpt_contract_remain_amt'])){
            $model->rcptContractRemainAmt = $map['rcpt_contract_remain_amt'];
        }
        if(isset($map['commodity_code'])){
            $model->commodityCode = $map['commodity_code'];
        }
        if(isset($map['commodity_name'])){
            $model->commodityName = $map['commodity_name'];
        }
        if(isset($map['ou'])){
            $model->ou = $map['ou'];
        }
        if(isset($map['ccy'])){
            $model->ccy = $map['ccy'];
        }
        if(isset($map['rate'])){
            $model->rate = $map['rate'];
        }
        if(isset($map['rcpt_contract_amt_excl_tax'])){
            $model->rcptContractAmtExclTax = $map['rcpt_contract_amt_excl_tax'];
        }
        if(isset($map['rept_inved_amt_excl_tax'])){
            $model->reptInvedAmtExclTax = $map['rept_inved_amt_excl_tax'];
        }
        if(isset($map['rcpt_contract_remain_amt_excl_tax'])){
            $model->rcptContractRemainAmtExclTax = $map['rcpt_contract_remain_amt_excl_tax'];
        }
        return $model;
    }
    // 可开票单据号
    /**
     * @example 33345454
     * @var string
     */
    public $receiptNo;

    // 租户ID
    /**
     * @example 20882838383
     * @var string
     */
    public $tenantId;

    // 合同号或订单号
    /**
     * @example 3333
     * @var string
     */
    public $arNo;

    // 计费类型
    /**
     * @example PREPAY/AFTER_PAY
     * @var string
     */
    public $chargeType;

    // 合同商品总金额
    /**
     * @example 34.99
     * @var string
     */
    public $rcptContractAmt;

    // 合同商品已开票金额
    /**
     * @example 22.12
     * @var string
     */
    public $reptInvedAmt;

    // 合同商品剩余可开票金额
    /**
     * @example 23.21
     * @var string
     */
    public $rcptContractRemainAmt;

    // 商品CODE
    /**
     * @example abd
     * @var string
     */
    public $commodityCode;

    // 商品名称
    /**
     * @example 测试商品
     * @var string
     */
    public $commodityName;

    // ou
    /**
     * @example Z37
     * @var string
     */
    public $ou;

    // 币种
    /**
     * @example 840
     * @var string
     */
    public $ccy;

    // 税率
    /**
     * @example 0.09
     * @var string
     */
    public $rate;

    // 合同金额（不含税）
    /**
     * @example 22
     * @var string
     */
    public $rcptContractAmtExclTax;

    // 已开票金额（不含税）
    /**
     * @example 23
     * @var string
     */
    public $reptInvedAmtExclTax;

    // 剩余可开票金额（不含税）
    /**
     * @example 23
     * @var string
     */
    public $rcptContractRemainAmtExclTax;

}
