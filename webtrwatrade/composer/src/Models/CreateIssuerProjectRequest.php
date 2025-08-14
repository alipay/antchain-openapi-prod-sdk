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

    // 项目描述(markdown格式)
    /**
     * @var string
     */
    public $description;

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

    // 项目封面文件id
    /**
     * @var string
     */
    public $projectCoverFileId;

    // 是否限购
    /**
     * @var bool
     */
    public $maxSubscriptionLimited;

    // 最大可认购份额
    /**
     * @var string
     */
    public $maxSubscriptionAmount;

    // 项目支持的结算方式
    /**
     * @var SupportedSettlementMethodInfo[]
     */
    public $settlementMethods;

    // crossChain
    /**
     * @var bool
     */
    public $crossChain;

    // 目标链名称列表（跨链项目必填）
    /**
     * @var string[]
     */
    public $targetChainNameList;
    protected $_name = [
        'authToken'              => 'auth_token',
        'productInstanceId'      => 'product_instance_id',
        'name'                   => 'name',
        'info'                   => 'info',
        'description'            => 'description',
        'tokenName'              => 'token_name',
        'capacity'               => 'capacity',
        'netValue'               => 'net_value',
        'currency'               => 'currency',
        'participants'           => 'participants',
        'mintKeys'               => 'mint_keys',
        'burnKeys'               => 'burn_keys',
        'transferKeys'           => 'transfer_keys',
        'managerKeys'            => 'manager_keys',
        'projectCoverFileId'     => 'project_cover_file_id',
        'maxSubscriptionLimited' => 'max_subscription_limited',
        'maxSubscriptionAmount'  => 'max_subscription_amount',
        'settlementMethods'      => 'settlement_methods',
        'crossChain'             => 'cross_chain',
        'targetChainNameList'    => 'target_chain_name_list',
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
        Model::validateRequired('projectCoverFileId', $this->projectCoverFileId, true);
        Model::validateRequired('maxSubscriptionLimited', $this->maxSubscriptionLimited, true);
        Model::validateRequired('maxSubscriptionAmount', $this->maxSubscriptionAmount, true);
        Model::validateRequired('settlementMethods', $this->settlementMethods, true);
        Model::validateRequired('crossChain', $this->crossChain, true);
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
        if (null !== $this->description) {
            $res['description'] = $this->description;
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
        if (null !== $this->projectCoverFileId) {
            $res['project_cover_file_id'] = $this->projectCoverFileId;
        }
        if (null !== $this->maxSubscriptionLimited) {
            $res['max_subscription_limited'] = $this->maxSubscriptionLimited;
        }
        if (null !== $this->maxSubscriptionAmount) {
            $res['max_subscription_amount'] = $this->maxSubscriptionAmount;
        }
        if (null !== $this->settlementMethods) {
            $res['settlement_methods'] = [];
            if (null !== $this->settlementMethods && \is_array($this->settlementMethods)) {
                $n = 0;
                foreach ($this->settlementMethods as $item) {
                    $res['settlement_methods'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->crossChain) {
            $res['cross_chain'] = $this->crossChain;
        }
        if (null !== $this->targetChainNameList) {
            $res['target_chain_name_list'] = $this->targetChainNameList;
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
        if (isset($map['description'])) {
            $model->description = $map['description'];
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
        if (isset($map['project_cover_file_id'])) {
            $model->projectCoverFileId = $map['project_cover_file_id'];
        }
        if (isset($map['max_subscription_limited'])) {
            $model->maxSubscriptionLimited = $map['max_subscription_limited'];
        }
        if (isset($map['max_subscription_amount'])) {
            $model->maxSubscriptionAmount = $map['max_subscription_amount'];
        }
        if (isset($map['settlement_methods'])) {
            if (!empty($map['settlement_methods'])) {
                $model->settlementMethods = [];
                $n                        = 0;
                foreach ($map['settlement_methods'] as $item) {
                    $model->settlementMethods[$n++] = null !== $item ? SupportedSettlementMethodInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['cross_chain'])) {
            $model->crossChain = $map['cross_chain'];
        }
        if (isset($map['target_chain_name_list'])) {
            if (!empty($map['target_chain_name_list'])) {
                $model->targetChainNameList = $map['target_chain_name_list'];
            }
        }

        return $model;
    }
}
