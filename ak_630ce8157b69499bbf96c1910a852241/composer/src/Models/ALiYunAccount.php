<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_630ce8157b69499bbf96c1910a852241\Models;

use AlibabaCloud\Tea\Model;

class ALiYunAccount extends Model
{
    // ant_chain_id
    /**
     * @example ant_chain_id
     *
     * @var string
     */
    public $antChainId;

    // account
    /**
     * @example account
     *
     * @var string
     */
    public $account;

    // account_public_key
    /**
     * @example account_public_key
     *
     * @var string
     */
    public $accountPublicKey;

    // account_recovery_key
    /**
     * @example account_recovery_key
     *
     * @var string
     */
    public $accountRecoveryKey;

    // account_status
    /**
     * @example account_status
     *
     * @var string
     */
    public $accountStatus;

    // 机构信息
    /**
     * @example uid-11321313131
     *
     * @var string
     */
    public $memberName;

    // 创建时间
    /**
     * @example 112313123
     *
     * @var int
     */
    public $createTime;
    protected $_name = [
        'antChainId'         => 'ant_chain_id',
        'account'            => 'account',
        'accountPublicKey'   => 'account_public_key',
        'accountRecoveryKey' => 'account_recovery_key',
        'accountStatus'      => 'account_status',
        'memberName'         => 'member_name',
        'createTime'         => 'create_time',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->antChainId) {
            $res['ant_chain_id'] = $this->antChainId;
        }
        if (null !== $this->account) {
            $res['account'] = $this->account;
        }
        if (null !== $this->accountPublicKey) {
            $res['account_public_key'] = $this->accountPublicKey;
        }
        if (null !== $this->accountRecoveryKey) {
            $res['account_recovery_key'] = $this->accountRecoveryKey;
        }
        if (null !== $this->accountStatus) {
            $res['account_status'] = $this->accountStatus;
        }
        if (null !== $this->memberName) {
            $res['member_name'] = $this->memberName;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ALiYunAccount
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['ant_chain_id'])) {
            $model->antChainId = $map['ant_chain_id'];
        }
        if (isset($map['account'])) {
            $model->account = $map['account'];
        }
        if (isset($map['account_public_key'])) {
            $model->accountPublicKey = $map['account_public_key'];
        }
        if (isset($map['account_recovery_key'])) {
            $model->accountRecoveryKey = $map['account_recovery_key'];
        }
        if (isset($map['account_status'])) {
            $model->accountStatus = $map['account_status'];
        }
        if (isset($map['member_name'])) {
            $model->memberName = $map['member_name'];
        }
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }

        return $model;
    }
}
