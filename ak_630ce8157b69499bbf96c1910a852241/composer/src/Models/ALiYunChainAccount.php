<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_630ce8157b69499bbf96c1910a852241\Models;

use AlibabaCloud\Tea\Model;

class ALiYunChainAccount extends Model
{
    // account
    /**
     * @example account
     *
     * @var string
     */
    public $account;

    // account_private_key
    /**
     * @example account_private_key
     *
     * @var string
     */
    public $accountPrivateKey;

    // account_public_key
    /**
     * @example account_public_key
     *
     * @var string
     */
    public $accountPublicKey;

    // account_recover_private_key
    /**
     * @example account_recover_private_key
     *
     * @var string
     */
    public $accountRecoverPrivateKey;

    // account_recover_public_key
    /**
     * @example account_recover_public_key
     *
     * @var string
     */
    public $accountRecoverPublicKey;

    // ant_chain_id
    /**
     * @example ant_chain_id
     *
     * @var string
     */
    public $antChainId;
    protected $_name = [
        'account'                  => 'account',
        'accountPrivateKey'        => 'account_private_key',
        'accountPublicKey'         => 'account_public_key',
        'accountRecoverPrivateKey' => 'account_recover_private_key',
        'accountRecoverPublicKey'  => 'account_recover_public_key',
        'antChainId'               => 'ant_chain_id',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->account) {
            $res['account'] = $this->account;
        }
        if (null !== $this->accountPrivateKey) {
            $res['account_private_key'] = $this->accountPrivateKey;
        }
        if (null !== $this->accountPublicKey) {
            $res['account_public_key'] = $this->accountPublicKey;
        }
        if (null !== $this->accountRecoverPrivateKey) {
            $res['account_recover_private_key'] = $this->accountRecoverPrivateKey;
        }
        if (null !== $this->accountRecoverPublicKey) {
            $res['account_recover_public_key'] = $this->accountRecoverPublicKey;
        }
        if (null !== $this->antChainId) {
            $res['ant_chain_id'] = $this->antChainId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ALiYunChainAccount
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['account'])) {
            $model->account = $map['account'];
        }
        if (isset($map['account_private_key'])) {
            $model->accountPrivateKey = $map['account_private_key'];
        }
        if (isset($map['account_public_key'])) {
            $model->accountPublicKey = $map['account_public_key'];
        }
        if (isset($map['account_recover_private_key'])) {
            $model->accountRecoverPrivateKey = $map['account_recover_private_key'];
        }
        if (isset($map['account_recover_public_key'])) {
            $model->accountRecoverPublicKey = $map['account_recover_public_key'];
        }
        if (isset($map['ant_chain_id'])) {
            $model->antChainId = $map['ant_chain_id'];
        }

        return $model;
    }
}
