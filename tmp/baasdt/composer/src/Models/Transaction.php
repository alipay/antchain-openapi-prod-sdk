<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class Transaction extends Model
{
    // 交易数据，转换位十六进制
    /**
     * @example 05656e...5337d
     *
     * @var string
     */
    public $data;

    // 卡密管理员链上ID，64位十六进制。
    /**
     * @example 288ca9e665e93dc47fb424412eb4614695ab139b8866f32b45242363a1a16fb4
     *
     * @var string
     */
    public $from;

    // 交易hash，十六进制编码
    /**
     * @example 7f73437ea59ff23cf1050d5511fe8d94ed5ec8eab8f9175f7f3ffcbb05b374ee
     *
     * @var string
     */
    public $hash;

    // 交易随机数
    /**
     * @example 11066299148144480681
     *
     * @var int
     */
    public $nonce;

    // 交易时间
    /**
     * @example 0
     *
     * @var int
     */
    public $period;

    // from账户对应的公钥，128位十六进制。
    /**
     * @example 0447ef0595c9949df2abd487c2b989ef7a70...26643c8db78f447a7
     *
     * @var string
     */
    public $publicKey;

    // 交易签名，十六进制编码
    /**
     * @example c75f573981b3a1fcadea90cd530f5802e03276a8a9e9dd9b8eca8f00b83e398220a4ddbc530f37bcfd51d727394357807f3f7b70e525d9ce1a3aec59093e5ec801
     *
     * @var string
     */
    public $signature;

    // 交易时间戳
    /**
     * @example 1583989453110
     *
     * @var int
     */
    public $timestamp;

    // 交易目标地址，64位十六进制。
    /**
     * @example 471aa820085ecb3db37508fb0944590448522b5e3836c6abf39ad3540226aa62
     *
     * @var string
     */
    public $to;
    protected $_name = [
        'data'      => 'data',
        'from'      => 'from',
        'hash'      => 'hash',
        'nonce'     => 'nonce',
        'period'    => 'period',
        'publicKey' => 'public_key',
        'signature' => 'signature',
        'timestamp' => 'timestamp',
        'to'        => 'to',
    ];

    public function validate()
    {
        Model::validateRequired('data', $this->data, true);
        Model::validateRequired('from', $this->from, true);
        Model::validateRequired('hash', $this->hash, true);
        Model::validateRequired('nonce', $this->nonce, true);
        Model::validateRequired('period', $this->period, true);
        Model::validateRequired('publicKey', $this->publicKey, true);
        Model::validateRequired('signature', $this->signature, true);
        Model::validateRequired('timestamp', $this->timestamp, true);
        Model::validateRequired('to', $this->to, true);
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
        if (null !== $this->hash) {
            $res['hash'] = $this->hash;
        }
        if (null !== $this->nonce) {
            $res['nonce'] = $this->nonce;
        }
        if (null !== $this->period) {
            $res['period'] = $this->period;
        }
        if (null !== $this->publicKey) {
            $res['public_key'] = $this->publicKey;
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Transaction
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
        if (isset($map['hash'])) {
            $model->hash = $map['hash'];
        }
        if (isset($map['nonce'])) {
            $model->nonce = $map['nonce'];
        }
        if (isset($map['period'])) {
            $model->period = $map['period'];
        }
        if (isset($map['public_key'])) {
            $model->publicKey = $map['public_key'];
        }
        if (isset($map['signature'])) {
            $model->signature = $map['signature'];
        }
        if (isset($map['timestamp'])) {
            $model->timestamp = $map['timestamp'];
        }
        if (isset($map['to'])) {
            $model->to = $map['to'];
        }

        return $model;
    }
}
