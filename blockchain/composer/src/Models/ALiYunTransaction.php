<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ALiYunTransaction extends Model
{
    // tx_type
    /**
     * @example tx_type
     *
     * @var string
     */
    public $txType;

    // data
    /**
     * @example data
     *
     * @var string
     */
    public $data;

    // hash
    /**
     * @example hash
     *
     * @var string
     */
    public $hash;

    // from
    /**
     * @example from
     *
     * @var string
     */
    public $from;

    // to
    /**
     * @example to
     *
     * @var string
     */
    public $to;

    // timestamp
    /**
     * @example 1231231
     *
     * @var int
     */
    public $timestamp;

    // period
    /**
     * @example 12312312
     *
     * @var int
     */
    public $period;

    // nonce
    /**
     * @example nonce
     *
     * @var string
     */
    public $nonce;

    // gas
    /**
     * @example gas
     *
     * @var string
     */
    public $gas;

    // value
    /**
     * @example value
     *
     * @var string
     */
    public $value;

    // signatures
    /**
     * @example signatures
     *
     * @var string[]
     */
    public $signatures;

    // extentions
    /**
     * @example extentions
     *
     * @var string[]
     */
    public $extentions;
    protected $_name = [
        'txType'     => 'tx_type',
        'data'       => 'data',
        'hash'       => 'hash',
        'from'       => 'from',
        'to'         => 'to',
        'timestamp'  => 'timestamp',
        'period'     => 'period',
        'nonce'      => 'nonce',
        'gas'        => 'gas',
        'value'      => 'value',
        'signatures' => 'signatures',
        'extentions' => 'extentions',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->txType) {
            $res['tx_type'] = $this->txType;
        }
        if (null !== $this->data) {
            $res['data'] = $this->data;
        }
        if (null !== $this->hash) {
            $res['hash'] = $this->hash;
        }
        if (null !== $this->from) {
            $res['from'] = $this->from;
        }
        if (null !== $this->to) {
            $res['to'] = $this->to;
        }
        if (null !== $this->timestamp) {
            $res['timestamp'] = $this->timestamp;
        }
        if (null !== $this->period) {
            $res['period'] = $this->period;
        }
        if (null !== $this->nonce) {
            $res['nonce'] = $this->nonce;
        }
        if (null !== $this->gas) {
            $res['gas'] = $this->gas;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }
        if (null !== $this->signatures) {
            $res['signatures'] = $this->signatures;
        }
        if (null !== $this->extentions) {
            $res['extentions'] = $this->extentions;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ALiYunTransaction
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['tx_type'])) {
            $model->txType = $map['tx_type'];
        }
        if (isset($map['data'])) {
            $model->data = $map['data'];
        }
        if (isset($map['hash'])) {
            $model->hash = $map['hash'];
        }
        if (isset($map['from'])) {
            $model->from = $map['from'];
        }
        if (isset($map['to'])) {
            $model->to = $map['to'];
        }
        if (isset($map['timestamp'])) {
            $model->timestamp = $map['timestamp'];
        }
        if (isset($map['period'])) {
            $model->period = $map['period'];
        }
        if (isset($map['nonce'])) {
            $model->nonce = $map['nonce'];
        }
        if (isset($map['gas'])) {
            $model->gas = $map['gas'];
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }
        if (isset($map['signatures'])) {
            if (!empty($map['signatures'])) {
                $model->signatures = $map['signatures'];
            }
        }
        if (isset($map['extentions'])) {
            if (!empty($map['extentions'])) {
                $model->extentions = $map['extentions'];
            }
        }

        return $model;
    }
}
