<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class UpdateMerchantProvisionRequest extends Model
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

    // 链ID
    /**
     * @var string
     */
    public $chainId;

    // 更新授信上限
    /**
     * @var string
     */
    public $creditMaxAmount;

    // 更新授信已使用数额
    /**
     * @var string
     */
    public $creditUsedAmount;

    // 币种
    /**
     * @var string
     */
    public $currency;

    // 更新余额
    /**
     * @var string
     */
    public $debitAmount;

    // 要设置备付金的商户租户ID
    /**
     * @var string
     */
    public $optTenantId;

    // 操作类型，ADD表示增加，SUB表示减少
    /**
     * @var string
     */
    public $optType;

    // 外部交易ID
    /**
     * @var string
     */
    public $outTxId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'chainId'           => 'chain_id',
        'creditMaxAmount'   => 'credit_max_amount',
        'creditUsedAmount'  => 'credit_used_amount',
        'currency'          => 'currency',
        'debitAmount'       => 'debit_amount',
        'optTenantId'       => 'opt_tenant_id',
        'optType'           => 'opt_type',
        'outTxId'           => 'out_tx_id',
    ];

    public function validate()
    {
        Model::validateRequired('chainId', $this->chainId, true);
        Model::validateRequired('currency', $this->currency, true);
        Model::validateRequired('optTenantId', $this->optTenantId, true);
        Model::validateRequired('optType', $this->optType, true);
        Model::validateRequired('outTxId', $this->outTxId, true);
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
     *
     * @return UpdateMerchantProvisionRequest
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
        if (isset($map['chain_id'])) {
            $model->chainId = $map['chain_id'];
        }
        if (isset($map['credit_max_amount'])) {
            $model->creditMaxAmount = $map['credit_max_amount'];
        }
        if (isset($map['credit_used_amount'])) {
            $model->creditUsedAmount = $map['credit_used_amount'];
        }
        if (isset($map['currency'])) {
            $model->currency = $map['currency'];
        }
        if (isset($map['debit_amount'])) {
            $model->debitAmount = $map['debit_amount'];
        }
        if (isset($map['opt_tenant_id'])) {
            $model->optTenantId = $map['opt_tenant_id'];
        }
        if (isset($map['opt_type'])) {
            $model->optType = $map['opt_type'];
        }
        if (isset($map['out_tx_id'])) {
            $model->outTxId = $map['out_tx_id'];
        }

        return $model;
    }
}
