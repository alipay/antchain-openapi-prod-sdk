<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\WEBTRWATRADE\Models;

use AlibabaCloud\Tea\Model;

class CreateIssuerProjectRequest extends Model
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

    // 项目名称
    /**
     * @var string
     */
    public $name;

    // 项目名称
    /**
     * @var string
     */
    public $info;

    // 代币名称
    /**
     * @var string
     */
    public $tokenName;

    // 最大供应量
    /**
     * @var string
     */
    public $capacity;

    // 净值
    /**
     * @var string
     */
    public $netValue;

    // 币种(目前支持USD、HKD、CNY)
    /**
     * @var string
     */
    public $currency;

    // 项目参与者列表(代销机构，最多3个)
    /**
     * @var ParticipantInfo[]
     */
    public $participants;

    // 发行密钥ID列表(最多3个)
    /**
     * @var string[]
     */
    public $mintKeys;

    // 赎回密钥ID列表(最多3个)
    /**
     * @var string[]
     */
    public $burnKeys;

    // 转账密钥ID列表(最多3个)
    /**
     * @var string[]
     */
    public $transferKeys;

    // 管理密钥ID列表(最多3个)
    /**
     * @var string[]
     */
    public $managerKeys;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'name'              => 'name',
        'info'              => 'info',
        'tokenName'         => 'token_name',
        'capacity'          => 'capacity',
        'netValue'          => 'net_value',
        'currency'          => 'currency',
        'participants'      => 'participants',
        'mintKeys'          => 'mint_keys',
        'burnKeys'          => 'burn_keys',
        'transferKeys'      => 'transfer_keys',
        'managerKeys'       => 'manager_keys',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('info', $this->info, true);
        Model::validateRequired('tokenName', $this->tokenName, true);
        Model::validateRequired('capacity', $this->capacity, true);
        Model::validateRequired('currency', $this->currency, true);
        Model::validateRequired('participants', $this->participants, true);
        Model::validateRequired('mintKeys', $this->mintKeys, true);
        Model::validateRequired('burnKeys', $this->burnKeys, true);
        Model::validateRequired('transferKeys', $this->transferKeys, true);
        Model::validateRequired('managerKeys', $this->managerKeys, true);
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
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->info) {
            $res['info'] = $this->info;
        }
        if (null !== $this->tokenName) {
            $res['token_name'] = $this->tokenName;
        }
        if (null !== $this->capacity) {
            $res['capacity'] = $this->capacity;
        }
        if (null !== $this->netValue) {
            $res['net_value'] = $this->netValue;
        }
        if (null !== $this->currency) {
            $res['currency'] = $this->currency;
        }
        if (null !== $this->participants) {
            $res['participants'] = [];
            if (null !== $this->participants && \is_array($this->participants)) {
                $n = 0;
                foreach ($this->participants as $item) {
                    $res['participants'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->mintKeys) {
            $res['mint_keys'] = $this->mintKeys;
        }
        if (null !== $this->burnKeys) {
            $res['burn_keys'] = $this->burnKeys;
        }
        if (null !== $this->transferKeys) {
            $res['transfer_keys'] = $this->transferKeys;
        }
        if (null !== $this->managerKeys) {
            $res['manager_keys'] = $this->managerKeys;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateIssuerProjectRequest
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
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['info'])) {
            $model->info = $map['info'];
        }
        if (isset($map['token_name'])) {
            $model->tokenName = $map['token_name'];
        }
        if (isset($map['capacity'])) {
            $model->capacity = $map['capacity'];
        }
        if (isset($map['net_value'])) {
            $model->netValue = $map['net_value'];
        }
        if (isset($map['currency'])) {
            $model->currency = $map['currency'];
        }
        if (isset($map['participants'])) {
            if (!empty($map['participants'])) {
                $model->participants = [];
                $n                   = 0;
                foreach ($map['participants'] as $item) {
                    $model->participants[$n++] = null !== $item ? ParticipantInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['mint_keys'])) {
            if (!empty($map['mint_keys'])) {
                $model->mintKeys = $map['mint_keys'];
            }
        }
        if (isset($map['burn_keys'])) {
            if (!empty($map['burn_keys'])) {
                $model->burnKeys = $map['burn_keys'];
            }
        }
        if (isset($map['transfer_keys'])) {
            if (!empty($map['transfer_keys'])) {
                $model->transferKeys = $map['transfer_keys'];
            }
        }
        if (isset($map['manager_keys'])) {
            if (!empty($map['manager_keys'])) {
                $model->managerKeys = $map['manager_keys'];
            }
        }

        return $model;
    }
}
