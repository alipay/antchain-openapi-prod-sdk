<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_d3c4f09125a14cd587057c405561809a\Models;

use AlibabaCloud\Tea\Model;

class SubUserVirtualAccountListVO extends Model
{
    // 项目ID
    /**
     * @example 0628455d41d044ed97783db554149d4b
     *
     * @var string
     */
    public $assetProjectId;

    // 资产项目合约地址
    /**
     * @example 0xf7d48f098440a166e9785ced7073baa6964acc80
     *
     * @var string
     */
    public $assetProjectAddress;

    // 红利合约地址
    /**
     * @example 0xc8f15261d4a6022ef48c5d77a55b8d276cd8b41c
     *
     * @var string
     */
    public $bonusAddress;

    // 用户ID
    /**
     * @example 0207764086af408990a5479c2320f9ce
     *
     * @var string
     */
    public $userId;

    // 代销机构ID
    /**
     * @example b658ce566060409b82c58b710ba869a7
     *
     * @var string
     */
    public $distributorInstitutionId;

    // 链名
    /**
     * @example ANTCHAIN
     *
     * @var string
     */
    public $chainName;

    // 投资者用户账户ID
    /**
     * @example 4a5297828bfc42ceb57c912cfbca6584
     *
     * @var string
     */
    public $subUserAccountId;

    // 虚拟子账户ID
    /**
     * @example 128798fc530249f78296fa97fb03c6f8
     *
     * @var string
     */
    public $subUserVirtualAccountId;

    // 虚拟子账户红利账户ID
    /**
     * @example 4311e8e118d848ea9f56731d82e214e8
     *
     * @var string
     */
    public $subUserBonusVirtualAccountId;

    // 虚拟子账户明细
    /**
     * @example
     *
     * @var SubUserVirtualAccountDetailVO[]
     */
    public $subUserVirtualAccountDetails;

    // 虚拟子账户红利明细
    /**
     * @example
     *
     * @var SubUserBonusVirtualAccountDetailVO[]
     */
    public $subUserBonusVirtualAccountDetails;
    protected $_name = [
        'assetProjectId'                    => 'asset_project_id',
        'assetProjectAddress'               => 'asset_project_address',
        'bonusAddress'                      => 'bonus_address',
        'userId'                            => 'user_id',
        'distributorInstitutionId'          => 'distributor_institution_id',
        'chainName'                         => 'chain_name',
        'subUserAccountId'                  => 'sub_user_account_id',
        'subUserVirtualAccountId'           => 'sub_user_virtual_account_id',
        'subUserBonusVirtualAccountId'      => 'sub_user_bonus_virtual_account_id',
        'subUserVirtualAccountDetails'      => 'sub_user_virtual_account_details',
        'subUserBonusVirtualAccountDetails' => 'sub_user_bonus_virtual_account_details',
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
        if (null !== $this->subUserVirtualAccountId) {
            $res['sub_user_virtual_account_id'] = $this->subUserVirtualAccountId;
        }
        if (null !== $this->subUserBonusVirtualAccountId) {
            $res['sub_user_bonus_virtual_account_id'] = $this->subUserBonusVirtualAccountId;
        }
        if (null !== $this->subUserVirtualAccountDetails) {
            $res['sub_user_virtual_account_details'] = [];
            if (null !== $this->subUserVirtualAccountDetails && \is_array($this->subUserVirtualAccountDetails)) {
                $n = 0;
                foreach ($this->subUserVirtualAccountDetails as $item) {
                    $res['sub_user_virtual_account_details'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->subUserBonusVirtualAccountDetails) {
            $res['sub_user_bonus_virtual_account_details'] = [];
            if (null !== $this->subUserBonusVirtualAccountDetails && \is_array($this->subUserBonusVirtualAccountDetails)) {
                $n = 0;
                foreach ($this->subUserBonusVirtualAccountDetails as $item) {
                    $res['sub_user_bonus_virtual_account_details'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SubUserVirtualAccountListVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['asset_project_id'])) {
            $model->assetProjectId = $map['asset_project_id'];
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
        if (isset($map['sub_user_virtual_account_id'])) {
            $model->subUserVirtualAccountId = $map['sub_user_virtual_account_id'];
        }
        if (isset($map['sub_user_bonus_virtual_account_id'])) {
            $model->subUserBonusVirtualAccountId = $map['sub_user_bonus_virtual_account_id'];
        }
        if (isset($map['sub_user_virtual_account_details'])) {
            if (!empty($map['sub_user_virtual_account_details'])) {
                $model->subUserVirtualAccountDetails = [];
                $n                                   = 0;
                foreach ($map['sub_user_virtual_account_details'] as $item) {
                    $model->subUserVirtualAccountDetails[$n++] = null !== $item ? SubUserVirtualAccountDetailVO::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['sub_user_bonus_virtual_account_details'])) {
            if (!empty($map['sub_user_bonus_virtual_account_details'])) {
                $model->subUserBonusVirtualAccountDetails = [];
                $n                                        = 0;
                foreach ($map['sub_user_bonus_virtual_account_details'] as $item) {
                    $model->subUserBonusVirtualAccountDetails[$n++] = null !== $item ? SubUserBonusVirtualAccountDetailVO::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
