<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class QueryTransactionResultInfo extends Model
{
    // 区块hash
    /**
     * @example 123
     *
     * @var string
     */
    public $blockHash;

    // 父区块hash
    /**
     * @example 123
     *
     * @var string
     */
    public $parentBlockHash;

    // 交易时间戳
    /**
     * @example 123
     *
     * @var string
     */
    public $timestamp;

    // 该交易所能消耗的最大gas
    /**
     * @example
     *
     * @var int
     */
    public $gas;

    // 交易发起方账户
    /**
     * @example 123
     *
     * @var string
     */
    public $from;

    // 交易接收方账户
    /**
     * @example 123
     *
     * @var string
     */
    public $to;

    // 交易类型
    /**
     * @example 123
     *
     * @var string
     */
    public $txType;

    // 交易返回的数据
    /**
     * @example
     *
     * @var QueryChainDataTransactionResultData
     */
    public $data;
    protected $_name = [
        'blockHash'       => 'block_hash',
        'parentBlockHash' => 'parent_block_hash',
        'timestamp'       => 'timestamp',
        'gas'             => 'gas',
        'from'            => 'from',
        'to'              => 'to',
        'txType'          => 'tx_type',
        'data'            => 'data',
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
        if (null !== $this->parentBlockHash) {
            $res['parent_block_hash'] = $this->parentBlockHash;
        }
        if (null !== $this->timestamp) {
            $res['timestamp'] = $this->timestamp;
        }
        if (null !== $this->gas) {
            $res['gas'] = $this->gas;
        }
        if (null !== $this->from) {
            $res['from'] = $this->from;
        }
        if (null !== $this->to) {
            $res['to'] = $this->to;
        }
        if (null !== $this->txType) {
            $res['tx_type'] = $this->txType;
        }
        if (null !== $this->data) {
            $res['data'] = null !== $this->data ? $this->data->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryTransactionResultInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['block_hash'])) {
            $model->blockHash = $map['block_hash'];
        }
        if (isset($map['parent_block_hash'])) {
            $model->parentBlockHash = $map['parent_block_hash'];
        }
        if (isset($map['timestamp'])) {
            $model->timestamp = $map['timestamp'];
        }
        if (isset($map['gas'])) {
            $model->gas = $map['gas'];
        }
        if (isset($map['from'])) {
            $model->from = $map['from'];
        }
        if (isset($map['to'])) {
            $model->to = $map['to'];
        }
        if (isset($map['tx_type'])) {
            $model->txType = $map['tx_type'];
        }
        if (isset($map['data'])) {
            $model->data = QueryChainDataTransactionResultData::fromMap($map['data']);
        }

        return $model;
    }
}
