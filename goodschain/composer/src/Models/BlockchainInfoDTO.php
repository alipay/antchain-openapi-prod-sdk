<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\GOODSCHAIN\Models;

use AlibabaCloud\Tea\Model;

class BlockchainInfoDTO extends Model
{
    // 交易hash
    /**
     * @example WER09877EEE
     *
     * @var string
     */
    public $txHash;

    // 交易时间戳
    /**
     * @example 1230987766
     *
     * @var int
     */
    public $txTime;
    protected $_name = [
        'txHash' => 'tx_hash',
        'txTime' => 'tx_time',
    ];

    public function validate()
    {
        Model::validateRequired('txHash', $this->txHash, true);
        Model::validateRequired('txTime', $this->txTime, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }
        if (null !== $this->txTime) {
            $res['tx_time'] = $this->txTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BlockchainInfoDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['tx_hash'])) {
            $model->txHash = $map['tx_hash'];
        }
        if (isset($map['tx_time'])) {
            $model->txTime = $map['tx_time'];
        }

        return $model;
    }
}
