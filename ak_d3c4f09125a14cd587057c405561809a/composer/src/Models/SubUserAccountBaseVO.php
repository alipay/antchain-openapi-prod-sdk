<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_d3c4f09125a14cd587057c405561809a\Models;

use AlibabaCloud\Tea\Model;

class SubUserAccountBaseVO extends Model
{
    // 二级用户ID
    /**
     * @example b20167e21a8d4cc2b5f1022d24f43815
     *
     * @var string
     */
    public $subUserAccountId;

    // 用户地址
    /**
     * @example 0x9f18be920360500f216495cd589895d3917cd9f2
     *
     * @var string
     */
    public $userAddress;

    // 用户邮箱
    /**
     * @example test@gamil.com
     *
     * @var string
     */
    public $contact;

    // 用户昵称
    /**
     * @example Alice
     *
     * @var string
     */
    public $alias;

    // 项目ID
    /**
     * @example 00d00c02fb314212b73a23a0c95df0c7
     *
     * @var string
     */
    public $assetProjectId;

    // 链名称
    /**
     * @example ANTCHAIN
     *
     * @var string
     */
    public $chainName;

    // 虚拟子账号信息
    /**
     * @example
     *
     * @var SubUserVirtualAccountInfoBO[]
     */
    public $subUserVirtualAccountsInfo;

    // 跨链账号信息
    /**
     * @example
     *
     * @var CrossChainSubUserAccountInfoBO[]
     */
    public $crossChainSubUserAccountsInfo;
    protected $_name = [
        'subUserAccountId'              => 'sub_user_account_id',
        'userAddress'                   => 'user_address',
        'contact'                       => 'contact',
        'alias'                         => 'alias',
        'assetProjectId'                => 'asset_project_id',
        'chainName'                     => 'chain_name',
        'subUserVirtualAccountsInfo'    => 'sub_user_virtual_accounts_info',
        'crossChainSubUserAccountsInfo' => 'cross_chain_sub_user_accounts_info',
    ];

    public function validate()
    {
        Model::validateRequired('subUserAccountId', $this->subUserAccountId, true);
        Model::validateRequired('assetProjectId', $this->assetProjectId, true);
        Model::validateRequired('chainName', $this->chainName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->subUserAccountId) {
            $res['sub_user_account_id'] = $this->subUserAccountId;
        }
        if (null !== $this->userAddress) {
            $res['user_address'] = $this->userAddress;
        }
        if (null !== $this->contact) {
            $res['contact'] = $this->contact;
        }
        if (null !== $this->alias) {
            $res['alias'] = $this->alias;
        }
        if (null !== $this->assetProjectId) {
            $res['asset_project_id'] = $this->assetProjectId;
        }
        if (null !== $this->chainName) {
            $res['chain_name'] = $this->chainName;
        }
        if (null !== $this->subUserVirtualAccountsInfo) {
            $res['sub_user_virtual_accounts_info'] = [];
            if (null !== $this->subUserVirtualAccountsInfo && \is_array($this->subUserVirtualAccountsInfo)) {
                $n = 0;
                foreach ($this->subUserVirtualAccountsInfo as $item) {
                    $res['sub_user_virtual_accounts_info'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->crossChainSubUserAccountsInfo) {
            $res['cross_chain_sub_user_accounts_info'] = [];
            if (null !== $this->crossChainSubUserAccountsInfo && \is_array($this->crossChainSubUserAccountsInfo)) {
                $n = 0;
                foreach ($this->crossChainSubUserAccountsInfo as $item) {
                    $res['cross_chain_sub_user_accounts_info'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SubUserAccountBaseVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['sub_user_account_id'])) {
            $model->subUserAccountId = $map['sub_user_account_id'];
        }
        if (isset($map['user_address'])) {
            $model->userAddress = $map['user_address'];
        }
        if (isset($map['contact'])) {
            $model->contact = $map['contact'];
        }
        if (isset($map['alias'])) {
            $model->alias = $map['alias'];
        }
        if (isset($map['asset_project_id'])) {
            $model->assetProjectId = $map['asset_project_id'];
        }
        if (isset($map['chain_name'])) {
            $model->chainName = $map['chain_name'];
        }
        if (isset($map['sub_user_virtual_accounts_info'])) {
            if (!empty($map['sub_user_virtual_accounts_info'])) {
                $model->subUserVirtualAccountsInfo = [];
                $n                                 = 0;
                foreach ($map['sub_user_virtual_accounts_info'] as $item) {
                    $model->subUserVirtualAccountsInfo[$n++] = null !== $item ? SubUserVirtualAccountInfoBO::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['cross_chain_sub_user_accounts_info'])) {
            if (!empty($map['cross_chain_sub_user_accounts_info'])) {
                $model->crossChainSubUserAccountsInfo = [];
                $n                                    = 0;
                foreach ($map['cross_chain_sub_user_accounts_info'] as $item) {
                    $model->crossChainSubUserAccountsInfo[$n++] = null !== $item ? CrossChainSubUserAccountInfoBO::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
