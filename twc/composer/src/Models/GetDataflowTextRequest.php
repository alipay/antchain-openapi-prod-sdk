<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class GetDataflowTextRequest extends Model
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

    // 存证地址
    /**
     * @var string
     */
    public $txHash;

    // 存证方使用的8位英文租户id，当存证地址来自其他存证方用户时必填
    /**
     * @var string
     */
    public $targetAccountId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'txHash'            => 'tx_hash',
        'targetAccountId'   => 'target_account_id',
    ];

    public function validate()
    {
        Model::validateRequired('txHash', $this->txHash, true);
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
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }
        if (null !== $this->targetAccountId) {
            $res['target_account_id'] = $this->targetAccountId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetDataflowTextRequest
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
        if (isset($map['tx_hash'])) {
            $model->txHash = $map['tx_hash'];
        }
        if (isset($map['target_account_id'])) {
            $model->targetAccountId = $map['target_account_id'];
        }

        return $model;
    }
}
