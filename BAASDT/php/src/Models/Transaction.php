<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class Transaction extends Model {
    protected $_name = [
        'data' => 'data',
        'from' => 'from',
        'hash' => 'hash',
        'nonce' => 'nonce',
        'period' => 'period',
        'publicKey' => 'public_key',
        'signature' => 'signature',
        'timestamp' => 'timestamp',
        'to' => 'to',
    ];
    public function validate() {}
    public function toMap() {
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
     * @return Transaction
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['data'])){
            $model->data = $map['data'];
        }
        if(isset($map['from'])){
            $model->from = $map['from'];
        }
        if(isset($map['hash'])){
            $model->hash = $map['hash'];
        }
        if(isset($map['nonce'])){
            $model->nonce = $map['nonce'];
        }
        if(isset($map['period'])){
            $model->period = $map['period'];
        }
        if(isset($map['public_key'])){
            $model->publicKey = $map['public_key'];
        }
        if(isset($map['signature'])){
            $model->signature = $map['signature'];
        }
        if(isset($map['timestamp'])){
            $model->timestamp = $map['timestamp'];
        }
        if(isset($map['to'])){
            $model->to = $map['to'];
        }
        return $model;
    }
    /**
     * @example 05656e...5337d
     * @description 交易数据，转换位十六进制
     * @var string
     */
    public $data;

    /**
     * @example 288ca9e665e93dc47fb424412eb4614695ab139b8866f32b45242363a1a16fb4
     * @description 卡密管理员链上ID，64位十六进制。
     * @var string
     */
    public $from;

    /**
     * @example 7f73437ea59ff23cf1050d5511fe8d94ed5ec8eab8f9175f7f3ffcbb05b374ee
     * @description 交易hash，十六进制编码
     * @var string
     */
    public $hash;

    /**
     * @example 11066299148144480681
     * @description 交易随机数
     * @var integer
     */
    public $nonce;

    /**
     * @example 0
     * @description 交易时间
     * @var integer
     */
    public $period;

    /**
     * @example 0447ef0595c9949df2abd487c2b989ef7a70...26643c8db78f447a7
     * @description from账户对应的公钥，128位十六进制。
     * @var string
     */
    public $publicKey;

    /**
     * @example c75f573981b3a1fcadea90cd530f5802e03276a8a9e9dd9b8eca8f00b83e398220a4ddbc530f37bcfd51d727394357807f3f7b70e525d9ce1a3aec59093e5ec801
     * @description 交易签名，十六进制编码
     * @var string
     */
    public $signature;

    /**
     * @example 1583989453110
     * @description 交易时间戳
     * @var integer
     */
    public $timestamp;

    /**
     * @example 471aa820085ecb3db37508fb0944590448522b5e3836c6abf39ad3540226aa62
     * @description 交易目标地址，64位十六进制。
     * @var string
     */
    public $to;

}
