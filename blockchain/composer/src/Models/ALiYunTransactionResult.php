<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ALiYunTransactionResult extends Model
{
    // block_hash
    /**
     * @example block_hash
     *
     * @var string
     */
    public $blockHash;

    // block_height
    /**
     * @example 123131
     *
     * @var int
     */
    public $blockHeight;

    // block_version
    /**
     * @example block_version
     *
     * @var string
     */
    public $blockVersion;

    // create_time
    /**
     * @example 213213
     *
     * @var int
     */
    public $createTime;

    // hash
    /**
     * @example hash
     *
     * @var string
     */
    public $hash;

    // Transaction
    /**
     * @example Transaction
     *
     * @var ALiYunTransaction
     */
    public $transaction;
    protected $_name = [
        'blockHash'    => 'block_hash',
        'blockHeight'  => 'block_height',
        'blockVersion' => 'block_version',
        'createTime'   => 'create_time',
        'hash'         => 'hash',
        'transaction'  => 'transaction',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->blockHash) {
            $res['block_hash'] = $this->blockHash;
        }
        if (null !== $this->blockHeight) {
            $res['block_height'] = $this->blockHeight;
        }
        if (null !== $this->blockVersion) {
            $res['block_version'] = $this->blockVersion;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->hash) {
            $res['hash'] = $this->hash;
        }
        if (null !== $this->transaction) {
            $res['transaction'] = null !== $this->transaction ? $this->transaction->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ALiYunTransactionResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['block_hash'])) {
            $model->blockHash = $map['block_hash'];
        }
        if (isset($map['block_height'])) {
            $model->blockHeight = $map['block_height'];
        }
        if (isset($map['block_version'])) {
            $model->blockVersion = $map['block_version'];
        }
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }
        if (isset($map['hash'])) {
            $model->hash = $map['hash'];
        }
        if (isset($map['transaction'])) {
            $model->transaction = ALiYunTransaction::fromMap($map['transaction']);
        }

        return $model;
    }
}
