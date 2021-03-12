<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class TransactionPo extends Model
{
    // 交易所在块hash
    /**
     * @example b0c13c3bdeb4b3e0892ab2d2ddd28f9972abba66a3fae0799507dec6fcfa7ba0
     *
     * @var string
     */
    public $blockHash;

    // 交易来源
    /**
     * @example b0c13c3bdeb4b3e0892ab2d2ddd28f9972abba66a3fae0799507dec6fcfa7ba0
     *
     * @var string
     */
    public $from;

    // gas消耗
    /**
     * @example 1111
     *
     * @var int
     */
    public $gasUsed;

    // 交易hash
    /**
     * @example ce386c5510df2e358056893b86ba77178fcf00d90de9c56bd788fd1968c9b58d
     *
     * @var string
     */
    public $hash;

    // 交易所在块 块高
    /**
     * @example 1000
     *
     * @var int
     */
    public $height;

    // 交易返回结果
    /**
     * @example 0
     *
     * @var string
     */
    public $result;

    // 交易时间
    /**
     * @example 1573401600000
     *
     * @var int
     */
    public $timestamp;

    // 交易地址
    /**
     * @example 4a5e107d0ea041f25ca7bfb58503e6549913e67e5d07aadfe359418440359fec
     *
     * @var string
     */
    public $to;

    // 交易类型 同SDK
    /**
     * @example 11
     *
     * @var int
     */
    public $txType;

    // 转账额度
    /**
     * @example 1111
     *
     * @var int
     */
    public $value;
    protected $_name = [
        'blockHash' => 'block_hash',
        'from'      => 'from',
        'gasUsed'   => 'gas_used',
        'hash'      => 'hash',
        'height'    => 'height',
        'result'    => 'result',
        'timestamp' => 'timestamp',
        'to'        => 'to',
        'txType'    => 'tx_type',
        'value'     => 'value',
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
        if (null !== $this->from) {
            $res['from'] = $this->from;
        }
        if (null !== $this->gasUsed) {
            $res['gas_used'] = $this->gasUsed;
        }
        if (null !== $this->hash) {
            $res['hash'] = $this->hash;
        }
        if (null !== $this->height) {
            $res['height'] = $this->height;
        }
        if (null !== $this->result) {
            $res['result'] = $this->result;
        }
        if (null !== $this->timestamp) {
            $res['timestamp'] = $this->timestamp;
        }
        if (null !== $this->to) {
            $res['to'] = $this->to;
        }
        if (null !== $this->txType) {
            $res['tx_type'] = $this->txType;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TransactionPo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['block_hash'])) {
            $model->blockHash = $map['block_hash'];
        }
        if (isset($map['from'])) {
            $model->from = $map['from'];
        }
        if (isset($map['gas_used'])) {
            $model->gasUsed = $map['gas_used'];
        }
        if (isset($map['hash'])) {
            $model->hash = $map['hash'];
        }
        if (isset($map['height'])) {
            $model->height = $map['height'];
        }
        if (isset($map['result'])) {
            $model->result = $map['result'];
        }
        if (isset($map['timestamp'])) {
            $model->timestamp = $map['timestamp'];
        }
        if (isset($map['to'])) {
            $model->to = $map['to'];
        }
        if (isset($map['tx_type'])) {
            $model->txType = $map['tx_type'];
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }

        return $model;
    }
}
