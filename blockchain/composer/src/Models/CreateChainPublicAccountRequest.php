<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class CreateChainPublicAccountRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // account
    /**
     * @var string
     */
    public $account;

    // account_pub_key
    /**
     * @var string
     */
    public $accountPubKey;

    // account_recover_pub_key
    /**
     * @var string
     */
    public $accountRecoverPubKey;

    // bizid
    /**
     * @var string
     */
    public $bizid;

    // region_id
    /**
     * @var string
     */
    public $regionId;
    protected $_name = [
        'authToken'            => 'auth_token',
        'productInstanceId'    => 'product_instance_id',
        'account'              => 'account',
        'accountPubKey'        => 'account_pub_key',
        'accountRecoverPubKey' => 'account_recover_pub_key',
        'bizid'                => 'bizid',
        'regionId'             => 'region_id',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->account) {
            $res['account'] = $this->account;
        }
        if (null !== $this->accountPubKey) {
            $res['account_pub_key'] = $this->accountPubKey;
        }
        if (null !== $this->accountRecoverPubKey) {
            $res['account_recover_pub_key'] = $this->accountRecoverPubKey;
        }
        if (null !== $this->bizid) {
            $res['bizid'] = $this->bizid;
        }
        if (null !== $this->regionId) {
            $res['region_id'] = $this->regionId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateChainPublicAccountRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['account'])) {
            $model->account = $map['account'];
        }
        if (isset($map['account_pub_key'])) {
            $model->accountPubKey = $map['account_pub_key'];
        }
        if (isset($map['account_recover_pub_key'])) {
            $model->accountRecoverPubKey = $map['account_recover_pub_key'];
        }
        if (isset($map['bizid'])) {
            $model->bizid = $map['bizid'];
        }
        if (isset($map['region_id'])) {
            $model->regionId = $map['region_id'];
        }

        return $model;
    }
}
