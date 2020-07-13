<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class SetAasAntdaoMerchantProvisionRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'chainId' => 'chain_id',
        'creditMaxAmount' => 'credit_max_amount',
        'creditUsedAmount' => 'credit_used_amount',
        'currency' => 'currency',
        'debitAmount' => 'debit_amount',
        'optTenantId' => 'opt_tenant_id',
        'originalCreditMaxAmount' => 'original_credit_max_amount',
        'originalCreditUsedAmount' => 'original_credit_used_amount',
        'originalDebitAmount' => 'original_debit_amount',
        'outTxId' => 'out_tx_id',
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
        if (null !== $this->chainId) {
            $res['chain_id'] = $this->chainId;
        }
        if (null !== $this->creditMaxAmount) {
            $res['credit_max_amount'] = $this->creditMaxAmount;
        }
        if (null !== $this->creditUsedAmount) {
            $res['credit_used_amount'] = $this->creditUsedAmount;
        }
        if (null !== $this->currency) {
            $res['currency'] = $this->currency;
        }
        if (null !== $this->debitAmount) {
            $res['debit_amount'] = $this->debitAmount;
        }
        if (null !== $this->optTenantId) {
            $res['opt_tenant_id'] = $this->optTenantId;
        }
        if (null !== $this->originalCreditMaxAmount) {
            $res['original_credit_max_amount'] = $this->originalCreditMaxAmount;
        }
        if (null !== $this->originalCreditUsedAmount) {
            $res['original_credit_used_amount'] = $this->originalCreditUsedAmount;
        }
        if (null !== $this->originalDebitAmount) {
            $res['original_debit_amount'] = $this->originalDebitAmount;
        }
        if (null !== $this->outTxId) {
            $res['out_tx_id'] = $this->outTxId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return SetAasAntdaoMerchantProvisionRequest
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
        if(isset($map['chain_id'])){
            $model->chainId = $map['chain_id'];
        }
        if(isset($map['credit_max_amount'])){
            $model->creditMaxAmount = $map['credit_max_amount'];
        }
        if(isset($map['credit_used_amount'])){
            $model->creditUsedAmount = $map['credit_used_amount'];
        }
        if(isset($map['currency'])){
            $model->currency = $map['currency'];
        }
        if(isset($map['debit_amount'])){
            $model->debitAmount = $map['debit_amount'];
        }
        if(isset($map['opt_tenant_id'])){
            $model->optTenantId = $map['opt_tenant_id'];
        }
        if(isset($map['original_credit_max_amount'])){
            $model->originalCreditMaxAmount = $map['original_credit_max_amount'];
        }
        if(isset($map['original_credit_used_amount'])){
            $model->originalCreditUsedAmount = $map['original_credit_used_amount'];
        }
        if(isset($map['original_debit_amount'])){
            $model->originalDebitAmount = $map['original_debit_amount'];
        }
        if(isset($map['out_tx_id'])){
            $model->outTxId = $map['out_tx_id'];
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

    // 链ID
    /**
     * @var string
     */
    public $chainId;

    // 新的授信上限（单位：元）
    /**
     * @var string
     */
    public $creditMaxAmount;

    // 新的授信已使用数额（单位：元）
    /**
     * @var string
     */
    public $creditUsedAmount;

    // 币种
    /**
     * @var string
     */
    public $currency;

    // 新的备付金余额（单位：元）
    /**
     * @var string
     */
    public $debitAmount;

    // 要设置备付金的商户租户ID
    /**
     * @var string
     */
    public $optTenantId;

    // 初始的授信上限（单位：元）
    /**
     * @var string
     */
    public $originalCreditMaxAmount;

    // 初始的授信已使用数额（单位：元）
    /**
     * @var string
     */
    public $originalCreditUsedAmount;

    // 初始的备付金余额（单位：元）
    /**
     * @var string
     */
    public $originalDebitAmount;

    // 外部交易ID（确保幂等）
    /**
     * @var string
     */
    public $outTxId;

}
