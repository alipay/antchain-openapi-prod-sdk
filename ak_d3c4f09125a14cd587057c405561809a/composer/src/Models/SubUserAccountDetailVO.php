<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_d3c4f09125a14cd587057c405561809a\Models;

use AlibabaCloud\Tea\Model;

class SubUserAccountDetailVO extends Model
{
    // 项目ID
    /**
     * @example 1000
     *
     * @var string
     */
    public $projectId;

    // 资产项目合约地址
    /**
     * @example 0x44b2c05769202f0001ab5beb5d583bb8a630677e
     *
     * @var string
     */
    public $assetProjectAddress;

    // 红利合约地址
    /**
     * @example 0x6dd8c1ab208dd3d2b20ff28fe97babb6154ff9db
     *
     * @var string
     */
    public $bonusAddress;

    // 用户ID
    /**
     * @example 1
     *
     * @var string
     */
    public $userId;

    // 代销机构ID
    /**
     * @example 1000
     *
     * @var string
     */
    public $distributorInstitutionId;

    // 发行链名称
    /**
     * @example ANTCHAIN
     *
     * @var string
     */
    public $chainName;

    // 投资者用户账户ID
    /**
     * @example 1
     *
     * @var string
     */
    public $subUserAccountId;

    // 投资者用户红利账户ID
    /**
     * @example 11
     *
     * @var string
     */
    public $subUserBonusAccountId;

    // 资产账户明细
    /**
     * @example 资产账户明细
     *
     * @var SubUserAccountDetailsVO[]
     */
    public $subUserAccountDetails;

    // 红利账户明细
    /**
     * @example 红利账户明细
     *
     * @var SubUserBonusAccountDetailVO[]
     */
    public $subUserBonusAccountDetails;
    protected $_name = [
        'projectId'                  => 'project_id',
        'assetProjectAddress'        => 'asset_project_address',
        'bonusAddress'               => 'bonus_address',
        'userId'                     => 'user_id',
        'distributorInstitutionId'   => 'distributor_institution_id',
        'chainName'                  => 'chain_name',
        'subUserAccountId'           => 'sub_user_account_id',
        'subUserBonusAccountId'      => 'sub_user_bonus_account_id',
        'subUserAccountDetails'      => 'sub_user_account_details',
        'subUserBonusAccountDetails' => 'sub_user_bonus_account_details',
    ];

    public function validate()
    {
        Model::validateRequired('projectId', $this->projectId, true);
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
        if (null !== $this->subUserAccountDetails) {
            $res['sub_user_account_details'] = [];
            if (null !== $this->subUserAccountDetails && \is_array($this->subUserAccountDetails)) {
                $n = 0;
                foreach ($this->subUserAccountDetails as $item) {
                    $res['sub_user_account_details'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->subUserBonusAccountDetails) {
            $res['sub_user_bonus_account_details'] = [];
            if (null !== $this->subUserBonusAccountDetails && \is_array($this->subUserBonusAccountDetails)) {
                $n = 0;
                foreach ($this->subUserBonusAccountDetails as $item) {
                    $res['sub_user_bonus_account_details'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SubUserAccountDetailVO
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
        if (isset($map['sub_user_account_details'])) {
            if (!empty($map['sub_user_account_details'])) {
                $model->subUserAccountDetails = [];
                $n                            = 0;
                foreach ($map['sub_user_account_details'] as $item) {
                    $model->subUserAccountDetails[$n++] = null !== $item ? SubUserAccountDetailsVO::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['sub_user_bonus_account_details'])) {
            if (!empty($map['sub_user_bonus_account_details'])) {
                $model->subUserBonusAccountDetails = [];
                $n                                 = 0;
                foreach ($map['sub_user_bonus_account_details'] as $item) {
                    $model->subUserBonusAccountDetails[$n++] = null !== $item ? SubUserBonusAccountDetailVO::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
