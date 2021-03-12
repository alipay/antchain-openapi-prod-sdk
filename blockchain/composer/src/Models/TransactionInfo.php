<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class TransactionInfo extends Model
{
    // 交易时间戳
    /**
     * @example timestamp
     *
     * @var int
     */
    public $timestamp;

    // 交易hash
    /**
     * @example hash
     *
     * @var string
     */
    public $hash;

    // 交易块高
    /**
     * @example 1
     *
     * @var int
     */
    public $height;

    // 交易所在块高
    /**
     * @example hash
     *
     * @var string
     */
    public $blockhash;

    // 交易来源
    /**
     * @example hash
     *
     * @var string
     */
    public $from;

    // 交易地址
    /**
     * @example hash
     *
     * @var string
     */
    public $to;

    // 交易类型
    /**
     * @example 11
     *
     * @var int
     */
    public $txtype;

    // 转账额度
    /**
     * @example 1
     *
     * @var int
     */
    public $value;

    // logs
    /**
     * @example logs
     *
     * @var string
     */
    public $logs;

    // 燃料消耗
    /**
     * @example 11
     *
     * @var int
     */
    public $gasused;

    // result
    /**
     * @example result
     *
     * @var string
     */
    public $result;

    // 拓展json字段
    /**
     * @example json
     *
     * @var string
     */
    public $json;
    protected $_name = [
        'timestamp' => 'timestamp',
        'hash'      => 'hash',
        'height'    => 'height',
        'blockhash' => 'blockhash',
        'from'      => 'from',
        'to'        => 'to',
        'txtype'    => 'txtype',
        'value'     => 'value',
        'logs'      => 'logs',
        'gasused'   => 'gasused',
        'result'    => 'result',
        'json'      => 'json',
    ];

    public function validate()
    {
        Model::validateRequired('timestamp', $this->timestamp, true);
        Model::validateRequired('hash', $this->hash, true);
        Model::validateRequired('height', $this->height, true);
        Model::validateRequired('blockhash', $this->blockhash, true);
        Model::validateRequired('from', $this->from, true);
        Model::validateRequired('to', $this->to, true);
        Model::validateRequired('txtype', $this->txtype, true);
        Model::validateRequired('value', $this->value, true);
        Model::validateRequired('logs', $this->logs, true);
        Model::validateRequired('gasused', $this->gasused, true);
        Model::validateRequired('result', $this->result, true);
        Model::validateRequired('json', $this->json, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->timestamp) {
            $res['timestamp'] = $this->timestamp;
        }
        if (null !== $this->hash) {
            $res['hash'] = $this->hash;
        }
        if (null !== $this->height) {
            $res['height'] = $this->height;
        }
        if (null !== $this->blockhash) {
            $res['blockhash'] = $this->blockhash;
        }
        if (null !== $this->from) {
            $res['from'] = $this->from;
        }
        if (null !== $this->to) {
            $res['to'] = $this->to;
        }
        if (null !== $this->txtype) {
            $res['txtype'] = $this->txtype;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }
        if (null !== $this->logs) {
            $res['logs'] = $this->logs;
        }
        if (null !== $this->gasused) {
            $res['gasused'] = $this->gasused;
        }
        if (null !== $this->result) {
            $res['result'] = $this->result;
        }
        if (null !== $this->json) {
            $res['json'] = $this->json;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TransactionInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['timestamp'])) {
            $model->timestamp = $map['timestamp'];
        }
        if (isset($map['hash'])) {
            $model->hash = $map['hash'];
        }
        if (isset($map['height'])) {
            $model->height = $map['height'];
        }
        if (isset($map['blockhash'])) {
            $model->blockhash = $map['blockhash'];
        }
        if (isset($map['from'])) {
            $model->from = $map['from'];
        }
        if (isset($map['to'])) {
            $model->to = $map['to'];
        }
        if (isset($map['txtype'])) {
            $model->txtype = $map['txtype'];
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }
        if (isset($map['logs'])) {
            $model->logs = $map['logs'];
        }
        if (isset($map['gasused'])) {
            $model->gasused = $map['gasused'];
        }
        if (isset($map['result'])) {
            $model->result = $map['result'];
        }
        if (isset($map['json'])) {
            $model->json = $map['json'];
        }

        return $model;
    }
}
