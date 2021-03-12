<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ApplyChainPublicAccountRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $productInstanceId;

    // account
    /**
     * @var string
     */
    public $account;

    // bizid
    /**
     * @var string
     */
    public $bizid;

    // password
    /**
     * @var string
     */
    public $password;

    // recover_password
    /**
     * @var string
     */
    public $recoverPassword;

    // region_id
    /**
     * @var string
     */
    public $regionId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'account'           => 'account',
        'bizid'             => 'bizid',
        'password'          => 'password',
        'recoverPassword'   => 'recover_password',
        'regionId'          => 'region_id',
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
        if (null !== $this->bizid) {
            $res['bizid'] = $this->bizid;
        }
        if (null !== $this->password) {
            $res['password'] = $this->password;
        }
        if (null !== $this->recoverPassword) {
            $res['recover_password'] = $this->recoverPassword;
        }
        if (null !== $this->regionId) {
            $res['region_id'] = $this->regionId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyChainPublicAccountRequest
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
        if (isset($map['bizid'])) {
            $model->bizid = $map['bizid'];
        }
        if (isset($map['password'])) {
            $model->password = $map['password'];
        }
        if (isset($map['recover_password'])) {
            $model->recoverPassword = $map['recover_password'];
        }
        if (isset($map['region_id'])) {
            $model->regionId = $map['region_id'];
        }

        return $model;
    }
}
