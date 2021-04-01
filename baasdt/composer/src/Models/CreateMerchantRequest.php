<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class CreateMerchantRequest extends Model
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

    // 商户描述，不超过2048
    /**
     * @var string
     */
    public $description;

    // 商户的资金管理员 归属的租户ID
    /**
     * @var string
     */
    public $fundManagerTenantId;

    // 商户角色，是否是资产发行商
    /**
     * @var bool
     */
    public $ifAssetIssuer;

    // 商户角色，是否是采购商
    /**
     * @var bool
     */
    public $ifEquityConsumer;

    // 商户角色，是否是供应商
    /**
     * @var bool
     */
    public $ifEquityProvider;

    // 商户归属的租户ID
    /**
     * @var string
     */
    public $optTenantId;

    // 外部交易ID（确保幂等）
    /**
     * @var string
     */
    public $outTxId;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'chainId'             => 'chain_id',
        'description'         => 'description',
        'fundManagerTenantId' => 'fund_manager_tenant_id',
        'ifAssetIssuer'       => 'if_asset_issuer',
        'ifEquityConsumer'    => 'if_equity_consumer',
        'ifEquityProvider'    => 'if_equity_provider',
        'optTenantId'         => 'opt_tenant_id',
        'outTxId'             => 'out_tx_id',
    ];

    public function validate()
    {
        Model::validateRequired('chainId', $this->chainId, true);
        Model::validateRequired('fundManagerTenantId', $this->fundManagerTenantId, true);
        Model::validateRequired('ifAssetIssuer', $this->ifAssetIssuer, true);
        Model::validateRequired('ifEquityConsumer', $this->ifEquityConsumer, true);
        Model::validateRequired('ifEquityProvider', $this->ifEquityProvider, true);
        Model::validateRequired('optTenantId', $this->optTenantId, true);
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
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->fundManagerTenantId) {
            $res['fund_manager_tenant_id'] = $this->fundManagerTenantId;
        }
        if (null !== $this->ifAssetIssuer) {
            $res['if_asset_issuer'] = $this->ifAssetIssuer;
        }
        if (null !== $this->ifEquityConsumer) {
            $res['if_equity_consumer'] = $this->ifEquityConsumer;
        }
        if (null !== $this->ifEquityProvider) {
            $res['if_equity_provider'] = $this->ifEquityProvider;
        }
        if (null !== $this->optTenantId) {
            $res['opt_tenant_id'] = $this->optTenantId;
        }
        if (null !== $this->outTxId) {
            $res['out_tx_id'] = $this->outTxId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateMerchantRequest
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
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['fund_manager_tenant_id'])) {
            $model->fundManagerTenantId = $map['fund_manager_tenant_id'];
        }
        if (isset($map['if_asset_issuer'])) {
            $model->ifAssetIssuer = $map['if_asset_issuer'];
        }
        if (isset($map['if_equity_consumer'])) {
            $model->ifEquityConsumer = $map['if_equity_consumer'];
        }
        if (isset($map['if_equity_provider'])) {
            $model->ifEquityProvider = $map['if_equity_provider'];
        }
        if (isset($map['opt_tenant_id'])) {
            $model->optTenantId = $map['opt_tenant_id'];
        }
        if (isset($map['out_tx_id'])) {
            $model->outTxId = $map['out_tx_id'];
        }

        return $model;
    }
}
