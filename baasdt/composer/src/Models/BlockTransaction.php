<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class BlockTransaction extends Model
{
    // 交易信息
    /**
     * @example 05656e747279a2...
     *
     * @var string
     */
    public $data;

    // 交易扩展信息
    /**
     * @example
     *
     * @var Extension[]
     */
    public $extension;

    // 交易发起方
    /**
     * @example d3936015f0f4676a03a1bdea8b6fc24390f9f147853c5398e989dd30afae643b
     *
     * @var string
     */
    public $from;

    // 交易gas消耗
    /**
     * @example 1234
     *
     * @var int
     */
    public $gas;

    // 分组id，暂时没用
    /**
     * @example 0000000000000000000000000000000000000000
     *
     * @var string
     */
    public $groupId;

    // 交易哈希
    /**
     * @example 7f73437ea59ff23cf1050d5511fe8d94ed5ec8eab8f9175f7f3ffcbb05b374ee
     *
     * @var string
     */
    public $hash;

    // 交易随机数
    /**
     * @example 13945910133563405517
     *
     * @var string
     */
    public $nonce;

    // 交易时间
    /**
     * @example 1583989453107
     *
     * @var int
     */
    public $period;

    // 交易签名
    /**
     * @example c75f573981b3a1fcadea90cd530f5802e0...
     *
     * @var string[]
     */
    public $signature;

    // 交易时间戳
    /**
     * @example 1583989453107
     *
     * @var int
     */
    public $timestamp;

    // 交易接收方
    /**
     * @example f76abaaa47c23bd27d0e77bc625773df9776d2f273b569d1074d89643fb73feb
     *
     * @var string
     */
    public $to;

    // 2
    /**
     * @example 11
     *
     * @var int
     */
    public $type;

    // 交易转账金额
    /**
     * @example 0
     *
     * @var int
     */
    public $value;

    // 2
    /**
     * @example 2
     *
     * @var int
     */
    public $version;
    protected $_name = [
        'data'      => 'data',
        'extension' => 'extension',
        'from'      => 'from',
        'gas'       => 'gas',
        'groupId'   => 'group_id',
        'hash'      => 'hash',
        'nonce'     => 'nonce',
        'period'    => 'period',
        'signature' => 'signature',
        'timestamp' => 'timestamp',
        'to'        => 'to',
        'type'      => 'type',
        'value'     => 'value',
        'version'   => 'version',
    ];

    public function validate()
    {
        Model::validateRequired('data', $this->data, true);
        Model::validateRequired('extension', $this->extension, true);
        Model::validateRequired('from', $this->from, true);
        Model::validateRequired('gas', $this->gas, true);
        Model::validateRequired('groupId', $this->groupId, true);
        Model::validateRequired('hash', $this->hash, true);
        Model::validateRequired('nonce', $this->nonce, true);
        Model::validateRequired('period', $this->period, true);
        Model::validateRequired('signature', $this->signature, true);
        Model::validateRequired('timestamp', $this->timestamp, true);
        Model::validateRequired('to', $this->to, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('value', $this->value, true);
        Model::validateRequired('version', $this->version, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->data) {
            $res['data'] = $this->data;
        }
        if (null !== $this->extension) {
            $res['extension'] = [];
            if (null !== $this->extension && \is_array($this->extension)) {
                $n = 0;
                foreach ($this->extension as $item) {
                    $res['extension'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->from) {
            $res['from'] = $this->from;
        }
        if (null !== $this->gas) {
            $res['gas'] = $this->gas;
        }
        if (null !== $this->groupId) {
            $res['group_id'] = $this->groupId;
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
        if (null !== $this->signature) {
            $res['signature'] = $this->signature;
        }
        if (null !== $this->timestamp) {
            $res['timestamp'] = $this->timestamp;
        }
        if (null !== $this->to) {
            $res['to'] = $this->to;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BlockTransaction
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['data'])) {
            $model->data = $map['data'];
        }
        if (isset($map['extension'])) {
            if (!empty($map['extension'])) {
                $model->extension = [];
                $n                = 0;
                foreach ($map['extension'] as $item) {
                    $model->extension[$n++] = null !== $item ? Extension::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['from'])) {
            $model->from = $map['from'];
        }
        if (isset($map['gas'])) {
            $model->gas = $map['gas'];
        }
        if (isset($map['group_id'])) {
            $model->groupId = $map['group_id'];
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
        if (isset($map['signature'])) {
            if (!empty($map['signature'])) {
                $model->signature = $map['signature'];
            }
        }
        if (isset($map['timestamp'])) {
            $model->timestamp = $map['timestamp'];
        }
        if (isset($map['to'])) {
            $model->to = $map['to'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }
        if (isset($map['version'])) {
            $model->version = $map['version'];
        }

        return $model;
    }
}
