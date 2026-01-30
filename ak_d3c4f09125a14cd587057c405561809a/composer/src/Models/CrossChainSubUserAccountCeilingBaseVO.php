<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_d3c4f09125a14cd587057c405561809a\Models;

use AlibabaCloud\Tea\Model;

class CrossChainSubUserAccountCeilingBaseVO extends Model
{
    // 项目ID
    /**
     * @example 0628455d41d044ed97783db554149d4b
     *
     * @var string
     */
    public $assetProjectId;

    // 代币名称
    /**
     * @example ETH
     *
     * @var string
     */
    public $tokenName;

    // 代币合约地址
    /**
     * @example 0x1753b2e244b1d5e62eaec9a916eaed93c665aec8
     *
     * @var string
     */
    public $tokenAddress;

    // 别名
    /**
     * @example test
     *
     * @var string
     */
    public $alias;

    // 实际持有份额
    /**
     * @example 100
     *
     * @var string
     */
    public $realShares;

    // 代币名称
    /**
     * @example ETH
     *
     * @var string
     */
    public $bonusTokenName;

    // 代币合约名称
    /**
     * @example 0x1753b2e244b1d5e62eaec9a916eaed93c665aec8
     *
     * @var string
     */
    public $bonusTokenAddress;

    // 红利份额
    /**
     * @example 100
     *
     * @var string
     */
    public $realBonus;

    // 目标链
    /**
     * @example CONFLUX_TEST_NET
     *
     * @var string
     */
    public $tagetChainType;

    // 目标链用户地址
    /**
     * @example 0x0c4d1a578ef5af9f37cdc251bfa11c660c20d38f
     *
     * @var string
     */
    public $targetUserAddress;
    protected $_name = [
        'assetProjectId'    => 'asset_project_id',
        'tokenName'         => 'token_name',
        'tokenAddress'      => 'token_address',
        'alias'             => 'alias',
        'realShares'        => 'real_shares',
        'bonusTokenName'    => 'bonus_token_name',
        'bonusTokenAddress' => 'bonus_token_address',
        'realBonus'         => 'real_bonus',
        'tagetChainType'    => 'taget_chain_type',
        'targetUserAddress' => 'target_user_address',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->assetProjectId) {
            $res['asset_project_id'] = $this->assetProjectId;
        }
        if (null !== $this->tokenName) {
            $res['token_name'] = $this->tokenName;
        }
        if (null !== $this->tokenAddress) {
            $res['token_address'] = $this->tokenAddress;
        }
        if (null !== $this->alias) {
            $res['alias'] = $this->alias;
        }
        if (null !== $this->realShares) {
            $res['real_shares'] = $this->realShares;
        }
        if (null !== $this->bonusTokenName) {
            $res['bonus_token_name'] = $this->bonusTokenName;
        }
        if (null !== $this->bonusTokenAddress) {
            $res['bonus_token_address'] = $this->bonusTokenAddress;
        }
        if (null !== $this->realBonus) {
            $res['real_bonus'] = $this->realBonus;
        }
        if (null !== $this->tagetChainType) {
            $res['taget_chain_type'] = $this->tagetChainType;
        }
        if (null !== $this->targetUserAddress) {
            $res['target_user_address'] = $this->targetUserAddress;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CrossChainSubUserAccountCeilingBaseVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['asset_project_id'])) {
            $model->assetProjectId = $map['asset_project_id'];
        }
        if (isset($map['token_name'])) {
            $model->tokenName = $map['token_name'];
        }
        if (isset($map['token_address'])) {
            $model->tokenAddress = $map['token_address'];
        }
        if (isset($map['alias'])) {
            $model->alias = $map['alias'];
        }
        if (isset($map['real_shares'])) {
            $model->realShares = $map['real_shares'];
        }
        if (isset($map['bonus_token_name'])) {
            $model->bonusTokenName = $map['bonus_token_name'];
        }
        if (isset($map['bonus_token_address'])) {
            $model->bonusTokenAddress = $map['bonus_token_address'];
        }
        if (isset($map['real_bonus'])) {
            $model->realBonus = $map['real_bonus'];
        }
        if (isset($map['taget_chain_type'])) {
            $model->tagetChainType = $map['taget_chain_type'];
        }
        if (isset($map['target_user_address'])) {
            $model->targetUserAddress = $map['target_user_address'];
        }

        return $model;
    }
}
