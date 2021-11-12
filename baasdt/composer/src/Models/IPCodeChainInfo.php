<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class IPCodeChainInfo extends Model
{
    // 交易哈希
    /**
     * @example dgdyuwegyuwy73huhuhjhj
     *
     * @var string
     */
    public $txHash;

    // 交易区块
    /**
     * @example 23333333333
     *
     * @var int
     */
    public $blockHeight;

    // 交易时间
    /**
     * @example 63846728467826478264782
     *
     * @var int
     */
    public $txTime;
    protected $_name = [
        'txHash'      => 'tx_hash',
        'blockHeight' => 'block_height',
        'txTime'      => 'tx_time',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }
        if (null !== $this->blockHeight) {
            $res['block_height'] = $this->blockHeight;
        }
        if (null !== $this->txTime) {
            $res['tx_time'] = $this->txTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IPCodeChainInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['tx_hash'])) {
            $model->txHash = $map['tx_hash'];
        }
        if (isset($map['block_height'])) {
            $model->blockHeight = $map['block_height'];
        }
        if (isset($map['tx_time'])) {
            $model->txTime = $map['tx_time'];
        }

        return $model;
    }
}
