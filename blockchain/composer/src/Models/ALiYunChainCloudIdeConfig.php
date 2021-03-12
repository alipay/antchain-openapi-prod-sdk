<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ALiYunChainCloudIdeConfig extends Model
{
    // bizid
    /**
     * @example bizid
     *
     * @var string
     */
    public $bizid;

    // name
    /**
     * @example name
     *
     * @var string
     */
    public $name;

    // trial_account
    /**
     * @example trial_account
     *
     * @var string
     */
    public $trialAccount;

    // trial_account_private_key
    /**
     * @example trial_account_private_key
     *
     * @var string
     */
    public $trialAccountPrivateKey;

    // ant_chain_id
    /**
     * @example ant_chain_id
     *
     * @var string
     */
    public $antChainId;

    // ant_chain_name
    /**
     * @example ant_chain_name
     *
     * @var string
     */
    public $antChainName;

    // version
    /**
     * @example version
     *
     * @var string
     */
    public $version;
    protected $_name = [
        'bizid'                  => 'bizid',
        'name'                   => 'name',
        'trialAccount'           => 'trial_account',
        'trialAccountPrivateKey' => 'trial_account_private_key',
        'antChainId'             => 'ant_chain_id',
        'antChainName'           => 'ant_chain_name',
        'version'                => 'version',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->bizid) {
            $res['bizid'] = $this->bizid;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->trialAccount) {
            $res['trial_account'] = $this->trialAccount;
        }
        if (null !== $this->trialAccountPrivateKey) {
            $res['trial_account_private_key'] = $this->trialAccountPrivateKey;
        }
        if (null !== $this->antChainId) {
            $res['ant_chain_id'] = $this->antChainId;
        }
        if (null !== $this->antChainName) {
            $res['ant_chain_name'] = $this->antChainName;
        }
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ALiYunChainCloudIdeConfig
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['bizid'])) {
            $model->bizid = $map['bizid'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['trial_account'])) {
            $model->trialAccount = $map['trial_account'];
        }
        if (isset($map['trial_account_private_key'])) {
            $model->trialAccountPrivateKey = $map['trial_account_private_key'];
        }
        if (isset($map['ant_chain_id'])) {
            $model->antChainId = $map['ant_chain_id'];
        }
        if (isset($map['ant_chain_name'])) {
            $model->antChainName = $map['ant_chain_name'];
        }
        if (isset($map['version'])) {
            $model->version = $map['version'];
        }

        return $model;
    }
}
