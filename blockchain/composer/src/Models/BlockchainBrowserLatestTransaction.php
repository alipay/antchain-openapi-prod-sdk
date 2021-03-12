<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class BlockchainBrowserLatestTransaction extends Model
{
    // create_time
    /**
     * @example createTime
     *
     * @var int
     */
    public $createTime;

    // from
    /**
     * @example eeb0aa76449922c8ec718b97ec5da4c493d46d66a1f446fdce2ba29263efd612
     *
     * @var string
     */
    public $from;

    // to
    /**
     * @example e4386406265f8a0f7d3a84efec3afa3ea12d2f9a3c21e2928a7b4d6a4e70ba68
     *
     * @var string
     */
    public $to;

    // hash
    /**
     * @example eeb0aa76449922c8ec718b97ec5da4c493d46d66a1f446fdce2ba29263efd612
     *
     * @var string
     */
    public $hash;

    // transactionV10Type
    /**
     * @example TX_DEPOSIT_DATA
     *
     * @var string
     */
    public $transactionType;
    protected $_name = [
        'createTime'      => 'create_time',
        'from'            => 'from',
        'to'              => 'to',
        'hash'            => 'hash',
        'transactionType' => 'transaction_type',
    ];

    public function validate()
    {
        Model::validateRequired('createTime', $this->createTime, true);
        Model::validateRequired('from', $this->from, true);
        Model::validateRequired('to', $this->to, true);
        Model::validateRequired('hash', $this->hash, true);
        Model::validateRequired('transactionType', $this->transactionType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->from) {
            $res['from'] = $this->from;
        }
        if (null !== $this->to) {
            $res['to'] = $this->to;
        }
        if (null !== $this->hash) {
            $res['hash'] = $this->hash;
        }
        if (null !== $this->transactionType) {
            $res['transaction_type'] = $this->transactionType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BlockchainBrowserLatestTransaction
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }
        if (isset($map['from'])) {
            $model->from = $map['from'];
        }
        if (isset($map['to'])) {
            $model->to = $map['to'];
        }
        if (isset($map['hash'])) {
            $model->hash = $map['hash'];
        }
        if (isset($map['transaction_type'])) {
            $model->transactionType = $map['transaction_type'];
        }

        return $model;
    }
}
