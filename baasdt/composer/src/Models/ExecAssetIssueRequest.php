<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class ExecAssetIssueRequest extends Model
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

    // 充值数量
    /**
     * @var int
     */
    public $amount;

    // 资产ID
    /**
     * @var string
     */
    public $assetId;

    // 链ID
    /**
     * @var string
     */
    public $chainId;

    // 备注信息
    /**
     * @var string
     */
    public $info;

    // 外部交易ID
    /**
     * @var string
     */
    public $outTxId;

    // 充值租户ID
    /**
     * @var string
     */
    public $optTenantId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'amount'            => 'amount',
        'assetId'           => 'asset_id',
        'chainId'           => 'chain_id',
        'info'              => 'info',
        'outTxId'           => 'out_tx_id',
        'optTenantId'       => 'opt_tenant_id',
    ];

    public function validate()
    {
        Model::validateRequired('amount', $this->amount, true);
        Model::validateRequired('assetId', $this->assetId, true);
        Model::validateRequired('chainId', $this->chainId, true);
        Model::validateRequired('info', $this->info, true);
        Model::validateRequired('outTxId', $this->outTxId, true);
        Model::validateRequired('optTenantId', $this->optTenantId, true);
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
        if (null !== $this->amount) {
            $res['amount'] = $this->amount;
        }
        if (null !== $this->assetId) {
            $res['asset_id'] = $this->assetId;
        }
        if (null !== $this->chainId) {
            $res['chain_id'] = $this->chainId;
        }
        if (null !== $this->info) {
            $res['info'] = $this->info;
        }
        if (null !== $this->outTxId) {
            $res['out_tx_id'] = $this->outTxId;
        }
        if (null !== $this->optTenantId) {
            $res['opt_tenant_id'] = $this->optTenantId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecAssetIssueRequest
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
        if (isset($map['amount'])) {
            $model->amount = $map['amount'];
        }
        if (isset($map['asset_id'])) {
            $model->assetId = $map['asset_id'];
        }
        if (isset($map['chain_id'])) {
            $model->chainId = $map['chain_id'];
        }
        if (isset($map['info'])) {
            $model->info = $map['info'];
        }
        if (isset($map['out_tx_id'])) {
            $model->outTxId = $map['out_tx_id'];
        }
        if (isset($map['opt_tenant_id'])) {
            $model->optTenantId = $map['opt_tenant_id'];
        }

        return $model;
    }
}
