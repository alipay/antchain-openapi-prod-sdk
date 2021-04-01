<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class QueryBlockRequest extends Model
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

    // 区块链高度
    /**
     * @var int
     */
    public $blockNumber;

    // 链ID
    /**
     * @var string
     */
    public $chainId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'blockNumber'       => 'block_number',
        'chainId'           => 'chain_id',
    ];

    public function validate()
    {
        Model::validateRequired('blockNumber', $this->blockNumber, true);
        Model::validateRequired('chainId', $this->chainId, true);
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
        if (null !== $this->blockNumber) {
            $res['block_number'] = $this->blockNumber;
        }
        if (null !== $this->chainId) {
            $res['chain_id'] = $this->chainId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryBlockRequest
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
        if (isset($map['block_number'])) {
            $model->blockNumber = $map['block_number'];
        }
        if (isset($map['chain_id'])) {
            $model->chainId = $map['chain_id'];
        }

        return $model;
    }
}
