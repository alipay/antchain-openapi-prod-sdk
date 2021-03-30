<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PROPERTYCHAIN\Models;

use AlibabaCloud\Tea\Model;

class BlockchainInfo extends Model
{
    // hash值
    /**
     * @example 457345
     *
     * @var string
     */
    public $txHash;

    // 时间戳
    /**
     * @example 5676989
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
     * @return BlockchainInfo
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
