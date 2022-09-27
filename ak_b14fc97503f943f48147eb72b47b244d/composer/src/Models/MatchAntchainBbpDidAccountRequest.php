<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_b14fc97503f943f48147eb72b47b244d\Models;

use AlibabaCloud\Tea\Model;

class MatchAntchainBbpDidAccountRequest extends Model
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

    // 场景码(YYX)
    /**
     * @var string
     */
    public $bizCode;

    // 支付宝uid
    /**
     * @var string
     */
    public $uid;

    // 分布式id ，双向check
    /**
     * @var string
     */
    public $did;

    // 链id
    /**
     * @var string
     */
    public $chainId;

    // 链账户
    /**
     * @var string
     */
    public $chainAccount;

    // 托管情况下包含
    /**
     * @var string
     */
    public $kmsKeyId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizCode'           => 'biz_code',
        'uid'               => 'uid',
        'did'               => 'did',
        'chainId'           => 'chain_id',
        'chainAccount'      => 'chain_account',
        'kmsKeyId'          => 'kms_key_id',
    ];

    public function validate()
    {
        Model::validateRequired('uid', $this->uid, true);
        Model::validateRequired('did', $this->did, true);
        Model::validateRequired('chainId', $this->chainId, true);
        Model::validateRequired('chainAccount', $this->chainAccount, true);
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
        if (null !== $this->bizCode) {
            $res['biz_code'] = $this->bizCode;
        }
        if (null !== $this->uid) {
            $res['uid'] = $this->uid;
        }
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }
        if (null !== $this->chainId) {
            $res['chain_id'] = $this->chainId;
        }
        if (null !== $this->chainAccount) {
            $res['chain_account'] = $this->chainAccount;
        }
        if (null !== $this->kmsKeyId) {
            $res['kms_key_id'] = $this->kmsKeyId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MatchAntchainBbpDidAccountRequest
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
        if (isset($map['biz_code'])) {
            $model->bizCode = $map['biz_code'];
        }
        if (isset($map['uid'])) {
            $model->uid = $map['uid'];
        }
        if (isset($map['did'])) {
            $model->did = $map['did'];
        }
        if (isset($map['chain_id'])) {
            $model->chainId = $map['chain_id'];
        }
        if (isset($map['chain_account'])) {
            $model->chainAccount = $map['chain_account'];
        }
        if (isset($map['kms_key_id'])) {
            $model->kmsKeyId = $map['kms_key_id'];
        }

        return $model;
    }
}
