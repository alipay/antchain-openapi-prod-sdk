<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_d3c4f09125a14cd587057c405561809a\Models;

use AlibabaCloud\Tea\Model;

class CrossChainAccountsVO extends Model
{
    // 对侧链用户地址
    /**
     * @example 0xce81adcd4b9b78293c73caed55840c81b4c3b8f5
     *
     * @var string
     */
    public $targetUserAddress;

    // 对侧链账户ID
    /**
     * @example 1938129653756694529
     *
     * @var string
     */
    public $crossChainUserAccountId;

    // 对侧链红利账户ID
    /**
     * @example 1928364866666541058
     *
     * @var string
     */
    public $crossChainUserBonusAccountId;

    // 对侧链资产账户明细
    /**
     * @example 对侧链资产账户明细
     *
     * @var CrossChainAccountsDetailVO[]
     */
    public $crossChainUserAccountsDetails;

    // 对侧链账户信息
    /**
     * @example 对侧链账户信息
     *
     * @var CrossChainBonusAccountsDetailVO[]
     */
    public $crossChainBonusAccountsDetails;
    protected $_name = [
        'targetUserAddress'              => 'target_user_address',
        'crossChainUserAccountId'        => 'cross_chain_user_account_id',
        'crossChainUserBonusAccountId'   => 'cross_chain_user_bonus_account_id',
        'crossChainUserAccountsDetails'  => 'cross_chain_user_accounts_details',
        'crossChainBonusAccountsDetails' => 'cross_chain_bonus_accounts_details',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->targetUserAddress) {
            $res['target_user_address'] = $this->targetUserAddress;
        }
        if (null !== $this->crossChainUserAccountId) {
            $res['cross_chain_user_account_id'] = $this->crossChainUserAccountId;
        }
        if (null !== $this->crossChainUserBonusAccountId) {
            $res['cross_chain_user_bonus_account_id'] = $this->crossChainUserBonusAccountId;
        }
        if (null !== $this->crossChainUserAccountsDetails) {
            $res['cross_chain_user_accounts_details'] = [];
            if (null !== $this->crossChainUserAccountsDetails && \is_array($this->crossChainUserAccountsDetails)) {
                $n = 0;
                foreach ($this->crossChainUserAccountsDetails as $item) {
                    $res['cross_chain_user_accounts_details'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->crossChainBonusAccountsDetails) {
            $res['cross_chain_bonus_accounts_details'] = [];
            if (null !== $this->crossChainBonusAccountsDetails && \is_array($this->crossChainBonusAccountsDetails)) {
                $n = 0;
                foreach ($this->crossChainBonusAccountsDetails as $item) {
                    $res['cross_chain_bonus_accounts_details'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CrossChainAccountsVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['target_user_address'])) {
            $model->targetUserAddress = $map['target_user_address'];
        }
        if (isset($map['cross_chain_user_account_id'])) {
            $model->crossChainUserAccountId = $map['cross_chain_user_account_id'];
        }
        if (isset($map['cross_chain_user_bonus_account_id'])) {
            $model->crossChainUserBonusAccountId = $map['cross_chain_user_bonus_account_id'];
        }
        if (isset($map['cross_chain_user_accounts_details'])) {
            if (!empty($map['cross_chain_user_accounts_details'])) {
                $model->crossChainUserAccountsDetails = [];
                $n                                    = 0;
                foreach ($map['cross_chain_user_accounts_details'] as $item) {
                    $model->crossChainUserAccountsDetails[$n++] = null !== $item ? CrossChainAccountsDetailVO::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['cross_chain_bonus_accounts_details'])) {
            if (!empty($map['cross_chain_bonus_accounts_details'])) {
                $model->crossChainBonusAccountsDetails = [];
                $n                                     = 0;
                foreach ($map['cross_chain_bonus_accounts_details'] as $item) {
                    $model->crossChainBonusAccountsDetails[$n++] = null !== $item ? CrossChainBonusAccountsDetailVO::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
