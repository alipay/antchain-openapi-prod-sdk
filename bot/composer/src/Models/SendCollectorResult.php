<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class SendCollectorResult extends Model
{
    // 数据内容content的上链交易哈希
    /**
     * @example 2c952456827828cdedad06afccef75a9f2c2840cbb6b0b659f653da1e5916cb2
     *
     * @var string
     */
    public $txHash;

    // 原入参的数组索引
    /**
     * @example 0
     *
     * @var int
     */
    public $originalIndex;
    protected $_name = [
        'txHash'        => 'tx_hash',
        'originalIndex' => 'original_index',
    ];

    public function validate()
    {
        Model::validateRequired('txHash', $this->txHash, true);
        Model::validateRequired('originalIndex', $this->originalIndex, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }
        if (null !== $this->originalIndex) {
            $res['original_index'] = $this->originalIndex;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SendCollectorResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['tx_hash'])) {
            $model->txHash = $map['tx_hash'];
        }
        if (isset($map['original_index'])) {
            $model->originalIndex = $map['original_index'];
        }

        return $model;
    }
}
