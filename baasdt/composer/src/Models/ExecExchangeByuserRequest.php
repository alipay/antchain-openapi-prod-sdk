<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class ExecExchangeByuserRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $productInstanceId;

    // 资产ID
    /**
     * @var string
     */
    public $assetId;

    // 资产发行方
    /**
     * @var string
     */
    public $assetIssuer;

    // 期望资产汇率
    /**
     * @var string
     */
    public $assetRate;

    // 链ID
    /**
     * @var string
     */
    public $chainId;

    // 代理操作专用，要代理操作的租户ID
    /**
     * @var string
     */
    public $delegatedTenantId;

    // 权益商品ID
    /**
     * @var string
     */
    public $equityId;

    // 权益商品提供方ID
    /**
     * @var string
     */
    public $equityProvider;

    // 期望权益汇率
    /**
     * @var string
     */
    public $equityRate;

    // 兑换时必要信息，敏感信息需加密。兑换时必要的信息，敏感信息需加密。实际数据结构根据商品类型和描述输入，可参考https://tech.antfin.com/docs/2/163896
    /**
     * @var string
     */
    public $memo;

    // 外部交易ID
    /**
     * @var string
     */
    public $outTxId;

    // 用户ID
    /**
     * @var string
     */
    public $userId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'assetId'           => 'asset_id',
        'assetIssuer'       => 'asset_issuer',
        'assetRate'         => 'asset_rate',
        'chainId'           => 'chain_id',
        'delegatedTenantId' => 'delegated_tenant_id',
        'equityId'          => 'equity_id',
        'equityProvider'    => 'equity_provider',
        'equityRate'        => 'equity_rate',
        'memo'              => 'memo',
        'outTxId'           => 'out_tx_id',
        'userId'            => 'user_id',
    ];

    public function validate()
    {
        Model::validateRequired('assetId', $this->assetId, true);
        Model::validateRequired('assetIssuer', $this->assetIssuer, true);
        Model::validateRequired('assetRate', $this->assetRate, true);
        Model::validateRequired('chainId', $this->chainId, true);
        Model::validateRequired('equityId', $this->equityId, true);
        Model::validateRequired('equityProvider', $this->equityProvider, true);
        Model::validateRequired('equityRate', $this->equityRate, true);
        Model::validateRequired('outTxId', $this->outTxId, true);
        Model::validateRequired('userId', $this->userId, true);
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
        if (null !== $this->assetId) {
            $res['asset_id'] = $this->assetId;
        }
        if (null !== $this->assetIssuer) {
            $res['asset_issuer'] = $this->assetIssuer;
        }
        if (null !== $this->assetRate) {
            $res['asset_rate'] = $this->assetRate;
        }
        if (null !== $this->chainId) {
            $res['chain_id'] = $this->chainId;
        }
        if (null !== $this->delegatedTenantId) {
            $res['delegated_tenant_id'] = $this->delegatedTenantId;
        }
        if (null !== $this->equityId) {
            $res['equity_id'] = $this->equityId;
        }
        if (null !== $this->equityProvider) {
            $res['equity_provider'] = $this->equityProvider;
        }
        if (null !== $this->equityRate) {
            $res['equity_rate'] = $this->equityRate;
        }
        if (null !== $this->memo) {
            $res['memo'] = $this->memo;
        }
        if (null !== $this->outTxId) {
            $res['out_tx_id'] = $this->outTxId;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecExchangeByuserRequest
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
        if (isset($map['asset_id'])) {
            $model->assetId = $map['asset_id'];
        }
        if (isset($map['asset_issuer'])) {
            $model->assetIssuer = $map['asset_issuer'];
        }
        if (isset($map['asset_rate'])) {
            $model->assetRate = $map['asset_rate'];
        }
        if (isset($map['chain_id'])) {
            $model->chainId = $map['chain_id'];
        }
        if (isset($map['delegated_tenant_id'])) {
            $model->delegatedTenantId = $map['delegated_tenant_id'];
        }
        if (isset($map['equity_id'])) {
            $model->equityId = $map['equity_id'];
        }
        if (isset($map['equity_provider'])) {
            $model->equityProvider = $map['equity_provider'];
        }
        if (isset($map['equity_rate'])) {
            $model->equityRate = $map['equity_rate'];
        }
        if (isset($map['memo'])) {
            $model->memo = $map['memo'];
        }
        if (isset($map['out_tx_id'])) {
            $model->outTxId = $map['out_tx_id'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }

        return $model;
    }
}
