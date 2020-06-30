<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class UpdateMerchantProvisionRequest extends Model {
    protected $_name = [
        'chainId' => 'chain_id',
        'creditMaxAmount' => 'credit_max_amount',
        'creditUsedAmount' => 'credit_used_amount',
        'currency' => 'currency',
        'debitAmount' => 'debit_amount',
        'optTenantId' => 'opt_tenant_id',
        'optType' => 'opt_type',
        'outTxId' => 'out_tx_id',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
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
        if (null !== $this->optType) {
            $res['opt_type'] = $this->optType;
        }
        if (null !== $this->outTxId) {
            $res['out_tx_id'] = $this->outTxId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UpdateMerchantProvisionRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
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
        if(isset($map['opt_type'])){
            $model->optType = $map['opt_type'];
        }
        if(isset($map['out_tx_id'])){
            $model->outTxId = $map['out_tx_id'];
        }
        return $model;
    }
    /**
     * @description 链ID
     * @example antdao
     * @var string
     */
    public $chainId;

    /**
     * @description 更新授信上限
     * @example 1000
     * @var string
     */
    public $creditMaxAmount;

    /**
     * @description 更新授信已使用数额
     * @example 100
     * @var string
     */
    public $creditUsedAmount;

    /**
     * @description 币种
     * @example CNY
     * @var string
     */
    public $currency;

    /**
     * @description 更新余额
     * @example 1000
     * @var string
     */
    public $debitAmount;

    /**
     * @description 要设置备付金的商户租户ID
     * @example tenantID
     * @var string
     */
    public $optTenantId;

    /**
     * @description 操作类型，ADD表示增加，SUB表示减少
     * @example ADD | SUB
     * @var string
     */
    public $optType;

    /**
     * @description 外部交易ID
     * @example 12345
     * @var string
     */
    public $outTxId;

}
