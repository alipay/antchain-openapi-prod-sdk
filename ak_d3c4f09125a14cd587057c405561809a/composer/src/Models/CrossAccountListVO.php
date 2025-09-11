<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_d3c4f09125a14cd587057c405561809a\Models;

use AlibabaCloud\Tea\Model;

class CrossAccountListVO extends Model
{
    // 项目ID
    /**
     * @example 项目ID
     *
     * @var string
     */
    public $projectId;

    // 资产项目合约地址
    /**
     * @example 资产项目合约地址
     *
     * @var string
     */
    public $assetProjectAddress;

    // 红利合约地址
    /**
     * @example 红利合约地址
     *
     * @var string
     */
    public $bonusAddress;

    // 用户ID
    /**
     * @example 用户ID
     *
     * @var string
     */
    public $userId;

    // 代销机构ID
    /**
     * @example 代销机构ID
     *
     * @var string
     */
    public $distributorInstitutionId;

    // 发行链名称
    /**
     * @example 发行链名称
     *
     * @var string
     */
    public $chainName;

    // 投资者用户账户ID
    /**
     * @example 投资者用户账户ID
     *
     * @var string
     */
    public $subUserAccountId;

    // 投资者用户红利账户ID
    /**
     * @example 投资者用户红利账户ID
     *
     * @var string
     */
    public $subUserBonusAccountId;

    // 目标链名称
    /**
     * @example 目标链名称
     *
     * @var string
     */
    public $targetChainName;

    // 目标链资产合约地址
    /**
     * @example 目标链资产合约地址
     *
     * @var string
     */
    public $targetChainAssetTokenAddress;

    // 目标链红利合约地址
    /**
     * @example 目标链红利合约地址
     *
     * @var string
     */
    public $targetChainBonusAddress;

    // 对侧链账户信息
    /**
     * @example 对侧链账户信息
     *
     * @var CrossChainAccountsVO[]
     */
    public $crossChainAccountsInfo;
    protected $_name = [
        'projectId'                    => 'project_id',
        'assetProjectAddress'          => 'asset_project_address',
        'bonusAddress'                 => 'bonus_address',
        'userId'                       => 'user_id',
        'distributorInstitutionId'     => 'distributor_institution_id',
        'chainName'                    => 'chain_name',
        'subUserAccountId'             => 'sub_user_account_id',
        'subUserBonusAccountId'        => 'sub_user_bonus_account_id',
        'targetChainName'              => 'target_chain_name',
        'targetChainAssetTokenAddress' => 'target_chain_asset_token_address',
        'targetChainBonusAddress'      => 'target_chain_bonus_address',
        'crossChainAccountsInfo'       => 'cross_chain_accounts_info',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->projectId) {
            $res['project_id'] = $this->projectId;
        }
        if (null !== $this->assetProjectAddress) {
            $res['asset_project_address'] = $this->assetProjectAddress;
        }
        if (null !== $this->bonusAddress) {
            $res['bonus_address'] = $this->bonusAddress;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->distributorInstitutionId) {
            $res['distributor_institution_id'] = $this->distributorInstitutionId;
        }
        if (null !== $this->chainName) {
            $res['chain_name'] = $this->chainName;
        }
        if (null !== $this->subUserAccountId) {
            $res['sub_user_account_id'] = $this->subUserAccountId;
        }
        if (null !== $this->subUserBonusAccountId) {
            $res['sub_user_bonus_account_id'] = $this->subUserBonusAccountId;
        }
        if (null !== $this->targetChainName) {
            $res['target_chain_name'] = $this->targetChainName;
        }
        if (null !== $this->targetChainAssetTokenAddress) {
            $res['target_chain_asset_token_address'] = $this->targetChainAssetTokenAddress;
        }
        if (null !== $this->targetChainBonusAddress) {
            $res['target_chain_bonus_address'] = $this->targetChainBonusAddress;
        }
        if (null !== $this->crossChainAccountsInfo) {
            $res['cross_chain_accounts_info'] = [];
            if (null !== $this->crossChainAccountsInfo && \is_array($this->crossChainAccountsInfo)) {
                $n = 0;
                foreach ($this->crossChainAccountsInfo as $item) {
                    $res['cross_chain_accounts_info'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CrossAccountListVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['project_id'])) {
            $model->projectId = $map['project_id'];
        }
        if (isset($map['asset_project_address'])) {
            $model->assetProjectAddress = $map['asset_project_address'];
        }
        if (isset($map['bonus_address'])) {
            $model->bonusAddress = $map['bonus_address'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['distributor_institution_id'])) {
            $model->distributorInstitutionId = $map['distributor_institution_id'];
        }
        if (isset($map['chain_name'])) {
            $model->chainName = $map['chain_name'];
        }
        if (isset($map['sub_user_account_id'])) {
            $model->subUserAccountId = $map['sub_user_account_id'];
        }
        if (isset($map['sub_user_bonus_account_id'])) {
            $model->subUserBonusAccountId = $map['sub_user_bonus_account_id'];
        }
        if (isset($map['target_chain_name'])) {
            $model->targetChainName = $map['target_chain_name'];
        }
        if (isset($map['target_chain_asset_token_address'])) {
            $model->targetChainAssetTokenAddress = $map['target_chain_asset_token_address'];
        }
        if (isset($map['target_chain_bonus_address'])) {
            $model->targetChainBonusAddress = $map['target_chain_bonus_address'];
        }
        if (isset($map['cross_chain_accounts_info'])) {
            if (!empty($map['cross_chain_accounts_info'])) {
                $model->crossChainAccountsInfo = [];
                $n                             = 0;
                foreach ($map['cross_chain_accounts_info'] as $item) {
                    $model->crossChainAccountsInfo[$n++] = null !== $item ? CrossChainAccountsVO::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
