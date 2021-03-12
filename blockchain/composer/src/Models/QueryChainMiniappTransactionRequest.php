<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class QueryChainMiniappTransactionRequest extends Model
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

    // ant_chain_id
    /**
     * @var string
     */
    public $antChainId;

    // transaction_hash
    /**
     * @var string
     */
    public $transactionHash;

    // phone_hash
    /**
     * @var string
     */
    public $phoneHash;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'antChainId'        => 'ant_chain_id',
        'transactionHash'   => 'transaction_hash',
        'phoneHash'         => 'phone_hash',
    ];

    public function validate()
    {
        Model::validateRequired('antChainId', $this->antChainId, true);
        Model::validateRequired('transactionHash', $this->transactionHash, true);
        Model::validateRequired('phoneHash', $this->phoneHash, true);
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
        if (null !== $this->antChainId) {
            $res['ant_chain_id'] = $this->antChainId;
        }
        if (null !== $this->transactionHash) {
            $res['transaction_hash'] = $this->transactionHash;
        }
        if (null !== $this->phoneHash) {
            $res['phone_hash'] = $this->phoneHash;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryChainMiniappTransactionRequest
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
        if (isset($map['ant_chain_id'])) {
            $model->antChainId = $map['ant_chain_id'];
        }
        if (isset($map['transaction_hash'])) {
            $model->transactionHash = $map['transaction_hash'];
        }
        if (isset($map['phone_hash'])) {
            $model->phoneHash = $map['phone_hash'];
        }

        return $model;
    }
}
