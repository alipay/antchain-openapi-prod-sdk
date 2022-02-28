<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SP\Models;

use AlibabaCloud\Tea\Model;

class UpdateAbilityChainAccountRequest extends Model
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

    // 业务流水，请求幂等号
    /**
     * @var string
     */
    public $bizId;

    // 链id，每个合约独立的标识
    /**
     * @var string
     */
    public $chainId;

    // 租户名。目前理解 chain_id + tenant_id + chain_user_id 能唯一标识某个合约上的某个账号
    /**
     * @var string
     */
    public $tenantId;

    // 链上账号。链上唯一账号。某些特定场景（比如某个租户可以在一个合约上不同平台方参与分润），会需要合约账户id
    /**
     * @var string
     */
    public $chainUserId;

    // decrease 减少 increase 增加
    /**
     * @var string
     */
    public $type;

    // 金额，单位：分。
    /**
     * @var int
     */
    public $value;

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
        'type'              => 'type',
        'value'             => 'value',
        'extendParams'      => 'extend_params',
    ];

    public function validate()
    {
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('chainId', $this->chainId, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('value', $this->value, true);
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
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }
        if (null !== $this->extendParams) {
            $res['extend_params'] = $this->extendParams;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateAbilityChainAccountRequest
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
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }
        if (isset($map['extend_params'])) {
            $model->extendParams = $map['extend_params'];
        }

        return $model;
    }
}
