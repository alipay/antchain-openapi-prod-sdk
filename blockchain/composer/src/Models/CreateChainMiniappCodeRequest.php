<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class CreateChainMiniappCodeRequest extends Model
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

    // contract_id
    /**
     * @var string
     */
    public $contractId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'antChainId'        => 'ant_chain_id',
        'transactionHash'   => 'transaction_hash',
        'contractId'        => 'contract_id',
    ];

    public function validate()
    {
        Model::validateRequired('antChainId', $this->antChainId, true);
        Model::validateRequired('transactionHash', $this->transactionHash, true);
        Model::validateRequired('contractId', $this->contractId, true);
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
        if (null !== $this->contractId) {
            $res['contract_id'] = $this->contractId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateChainMiniappCodeRequest
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
        if (isset($map['contract_id'])) {
            $model->contractId = $map['contract_id'];
        }

        return $model;
    }
}
