<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SP\Models;

use AlibabaCloud\Tea\Model;

class UpdateAbilityChainAssetRequest extends Model
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

    /**
     * @var string
     */
    public $productAccessCode;

    // 流水号
    /**
     * @var string
     */
    public $bizId;

    // 链id，链上合约id
    /**
     * @var string
     */
    public $chainId;

    // 租户id
    /**
     * @var string
     */
    public $tenantId;

    // 链上用户id
    /**
     * @var string
     */
    public $chainUserId;

    // 链上token金额，价值现金。单元：分
    /**
     * @var int
     */
    public $tokenAmount;

    // token链上数量。与现金有一定的兑换率。
    /**
     * @var string
     */
    public $tokenNumber;

    // 扩展字段，json格式
    /**
     * @var string
     */
    public $extendParams;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'productAccessCode' => 'product_access_code',
        'bizId'             => 'biz_id',
        'chainId'           => 'chain_id',
        'tenantId'          => 'tenant_id',
        'chainUserId'       => 'chain_user_id',
        'tokenAmount'       => 'token_amount',
        'tokenNumber'       => 'token_number',
        'extendParams'      => 'extend_params',
    ];

    public function validate()
    {
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('chainId', $this->chainId, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('tokenAmount', $this->tokenAmount, true);
        Model::validateRequired('tokenNumber', $this->tokenNumber, true);
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
        if (null !== $this->productAccessCode) {
            $res['product_access_code'] = $this->productAccessCode;
        }
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->chainId) {
            $res['chain_id'] = $this->chainId;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->chainUserId) {
            $res['chain_user_id'] = $this->chainUserId;
        }
        if (null !== $this->tokenAmount) {
            $res['token_amount'] = $this->tokenAmount;
        }
        if (null !== $this->tokenNumber) {
            $res['token_number'] = $this->tokenNumber;
        }
        if (null !== $this->extendParams) {
            $res['extend_params'] = $this->extendParams;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateAbilityChainAssetRequest
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
        if (isset($map['product_access_code'])) {
            $model->productAccessCode = $map['product_access_code'];
        }
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['chain_id'])) {
            $model->chainId = $map['chain_id'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['chain_user_id'])) {
            $model->chainUserId = $map['chain_user_id'];
        }
        if (isset($map['token_amount'])) {
            $model->tokenAmount = $map['token_amount'];
        }
        if (isset($map['token_number'])) {
            $model->tokenNumber = $map['token_number'];
        }
        if (isset($map['extend_params'])) {
            $model->extendParams = $map['extend_params'];
        }

        return $model;
    }
}
