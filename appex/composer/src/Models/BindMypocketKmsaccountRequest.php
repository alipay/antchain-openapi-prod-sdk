<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APPEX\Models;

use AlibabaCloud\Tea\Model;

class BindMypocketKmsaccountRequest extends Model
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

    // 用户的DID
    /**
     * @var string
     */
    public $did;

    // 区块链ID
    /**
     * @var string
     */
    public $chainId;

    // 用户的链上账户
    /**
     * @var string
     */
    public $chainAccount;

    // 该链账户在BaaS服务的KMS ID
    /**
     * @var string
     */
    public $kmsId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'did'               => 'did',
        'chainId'           => 'chain_id',
        'chainAccount'      => 'chain_account',
        'kmsId'             => 'kms_id',
    ];

    public function validate()
    {
        Model::validateRequired('did', $this->did, true);
        Model::validateRequired('chainId', $this->chainId, true);
        Model::validateRequired('chainAccount', $this->chainAccount, true);
        Model::validateRequired('kmsId', $this->kmsId, true);
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
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }
        if (null !== $this->chainId) {
            $res['chain_id'] = $this->chainId;
        }
        if (null !== $this->chainAccount) {
            $res['chain_account'] = $this->chainAccount;
        }
        if (null !== $this->kmsId) {
            $res['kms_id'] = $this->kmsId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BindMypocketKmsaccountRequest
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
        if (isset($map['did'])) {
            $model->did = $map['did'];
        }
        if (isset($map['chain_id'])) {
            $model->chainId = $map['chain_id'];
        }
        if (isset($map['chain_account'])) {
            $model->chainAccount = $map['chain_account'];
        }
        if (isset($map['kms_id'])) {
            $model->kmsId = $map['kms_id'];
        }

        return $model;
    }
}
