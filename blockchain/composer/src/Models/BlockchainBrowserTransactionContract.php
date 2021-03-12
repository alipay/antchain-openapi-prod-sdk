<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class BlockchainBrowserTransactionContract extends Model
{
    // data
    /**
     * @example asdfasdfsadfsdafasd
     *
     * @var string
     */
    public $data;

    // from
    /**
     * @example eeb0aa76449922c8ec718b97ec5da4c493d46d66a1f446fdce2ba29263efd612
     *
     * @var string
     */
    public $from;

    // to
    /**
     * @example eeb0aa76449922c8ec718b97ec5da4c493d46d66a1f446fdce2ba29263efd612
     *
     * @var string
     */
    public $to;

    // gas
    /**
     * @example 0
     *
     * @var int
     */
    public $gas;

    // hash
    /**
     * @example 65a0a7aa9b6f739faddd8e993eadecf85340cdeda6e20417e013e052f30afd3c
     *
     * @var string
     */
    public $hash;

    // nonce
    /**
     * @example 395460146568219584
     *
     * @var string
     */
    public $nonce;

    // period
    /**
     * @example 0
     *
     * @var int
     */
    public $period;

    // signature_list
    /**
     * @example signature_list
     *
     * @var string[]
     */
    public $signatureList;

    // timestamp
    /**
     * @example 1604565299516
     *
     * @var int
     */
    public $timestamp;

    // transaction_type
    /**
     * @example TX_DEPOSIT_DATA
     *
     * @var string
     */
    public $transactionType;

    // value
    /**
     * @example 0
     *
     * @var int
     */
    public $value;
    protected $_name = [
        'data'            => 'data',
        'from'            => 'from',
        'to'              => 'to',
        'gas'             => 'gas',
        'hash'            => 'hash',
        'nonce'           => 'nonce',
        'period'          => 'period',
        'signatureList'   => 'signature_list',
        'timestamp'       => 'timestamp',
        'transactionType' => 'transaction_type',
        'value'           => 'value',
    ];

    public function validate()
    {
        Model::validateRequired('data', $this->data, true);
        Model::validateRequired('from', $this->from, true);
        Model::validateRequired('to', $this->to, true);
        Model::validateRequired('gas', $this->gas, true);
        Model::validateRequired('hash', $this->hash, true);
        Model::validateRequired('nonce', $this->nonce, true);
        Model::validateRequired('period', $this->period, true);
        Model::validateRequired('signatureList', $this->signatureList, true);
        Model::validateRequired('timestamp', $this->timestamp, true);
        Model::validateRequired('transactionType', $this->transactionType, true);
        Model::validateRequired('value', $this->value, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->data) {
            $res['data'] = $this->data;
        }
        if (null !== $this->from) {
            $res['from'] = $this->from;
        }
        if (null !== $this->to) {
            $res['to'] = $this->to;
        }
        if (null !== $this->gas) {
            $res['gas'] = $this->gas;
        }
        if (null !== $this->hash) {
            $res['hash'] = $this->hash;
        }
        if (null !== $this->nonce) {
            $res['nonce'] = $this->nonce;
        }
        if (null !== $this->period) {
            $res['period'] = $this->period;
        }
        if (null !== $this->signatureList) {
            $res['signature_list'] = $this->signatureList;
        }
        if (null !== $this->timestamp) {
            $res['timestamp'] = $this->timestamp;
        }
        if (null !== $this->transactionType) {
            $res['transaction_type'] = $this->transactionType;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BlockchainBrowserTransactionContract
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['data'])) {
            $model->data = $map['data'];
        }
        if (isset($map['from'])) {
            $model->from = $map['from'];
        }
        if (isset($map['to'])) {
            $model->to = $map['to'];
        }
        if (isset($map['gas'])) {
            $model->gas = $map['gas'];
        }
        if (isset($map['hash'])) {
            $model->hash = $map['hash'];
        }
        if (isset($map['nonce'])) {
            $model->nonce = $map['nonce'];
        }
        if (isset($map['period'])) {
            $model->period = $map['period'];
        }
        if (isset($map['signature_list'])) {
            if (!empty($map['signature_list'])) {
                $model->signatureList = $map['signature_list'];
            }
        }
        if (isset($map['timestamp'])) {
            $model->timestamp = $map['timestamp'];
        }
        if (isset($map['transaction_type'])) {
            $model->transactionType = $map['transaction_type'];
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }

        return $model;
    }
}
