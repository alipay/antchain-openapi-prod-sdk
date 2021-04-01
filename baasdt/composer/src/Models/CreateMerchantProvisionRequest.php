<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class CreateMerchantProvisionRequest extends Model
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

    // 外部交易ID，确保幂等
    /**
     * @var string
     */
    public $outTxId;

    // 链ID
    /**
     * @var string
     */
    public $chainId;

    // 要创建备付金账户的租户ID
    /**
     * @var string
     */
    public $optTenantId;

    // 备付金账户币种
    /**
     * @var string
     */
    public $currency;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'outTxId'           => 'out_tx_id',
        'chainId'           => 'chain_id',
        'optTenantId'       => 'opt_tenant_id',
        'currency'          => 'currency',
    ];

    public function validate()
    {
        Model::validateRequired('outTxId', $this->outTxId, true);
        Model::validateRequired('chainId', $this->chainId, true);
        Model::validateRequired('optTenantId', $this->optTenantId, true);
        Model::validateRequired('currency', $this->currency, true);
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
        if (null !== $this->outTxId) {
            $res['out_tx_id'] = $this->outTxId;
        }
        if (null !== $this->chainId) {
            $res['chain_id'] = $this->chainId;
        }
        if (null !== $this->optTenantId) {
            $res['opt_tenant_id'] = $this->optTenantId;
        }
        if (null !== $this->currency) {
            $res['currency'] = $this->currency;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateMerchantProvisionRequest
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
        if (isset($map['out_tx_id'])) {
            $model->outTxId = $map['out_tx_id'];
        }
        if (isset($map['chain_id'])) {
            $model->chainId = $map['chain_id'];
        }
        if (isset($map['opt_tenant_id'])) {
            $model->optTenantId = $map['opt_tenant_id'];
        }
        if (isset($map['currency'])) {
            $model->currency = $map['currency'];
        }

        return $model;
    }
}
