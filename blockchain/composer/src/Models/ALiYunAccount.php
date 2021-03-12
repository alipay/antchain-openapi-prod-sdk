<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

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
    protected $_name = [
        'antChainId'         => 'ant_chain_id',
        'account'            => 'account',
        'accountPublicKey'   => 'account_public_key',
        'accountRecoveryKey' => 'account_recovery_key',
        'accountStatus'      => 'account_status',
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

        return $model;
    }
}
