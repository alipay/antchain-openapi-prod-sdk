<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class BlockchainDTO extends Model
{
    // 交易hash
    /**
     * @example xxx
     *
     * @var string
     */
    public $txHash;

    // 当前块高
    /**
     * @example 12917
     *
     * @var int
     */
    public $blockNumber;
    protected $_name = [
        'txHash'      => 'tx_hash',
        'blockNumber' => 'block_number',
    ];

    public function validate()
    {
        Model::validateRequired('txHash', $this->txHash, true);
        Model::validateRequired('blockNumber', $this->blockNumber, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }
        if (null !== $this->blockNumber) {
            $res['block_number'] = $this->blockNumber;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BlockchainDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['tx_hash'])) {
            $model->txHash = $map['tx_hash'];
        }
        if (isset($map['block_number'])) {
            $model->blockNumber = $map['block_number'];
        }

        return $model;
    }
}
