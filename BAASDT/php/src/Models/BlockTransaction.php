<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

use AntChain\BAASDT\Models\Extension;

class BlockTransaction extends Model {
    protected $_name = [
        'data' => 'data',
        'extension' => 'extension',
        'from' => 'from',
        'gas' => 'gas',
        'groupId' => 'group_id',
        'hash' => 'hash',
        'nonce' => 'nonce',
        'period' => 'period',
        'signature' => 'signature',
        'timestamp' => 'timestamp',
        'to' => 'to',
        'type' => 'type',
        'value' => 'value',
        'version' => 'version',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->data) {
            $res['data'] = $this->data;
        }
        if (null !== $this->extension) {
            $res['extension'] = [];
            if(null !== $this->extension && is_array($this->extension)){
                $n = 0;
                foreach($this->extension as $item){
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
            $res['signature'] = [];
            if(null !== $this->signature){
                $res['signature'] = $this->signature;
            }
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
     * @return BlockTransaction
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['data'])){
            $model->data = $map['data'];
        }
        if(isset($map['extension'])){
            if(!empty($map['extension'])){
                $model->extension = [];
                $n = 0;
                foreach($map['extension'] as $item) {
                    $model->extension[$n++] = null !== $item ? Extension::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['from'])){
            $model->from = $map['from'];
        }
        if(isset($map['gas'])){
            $model->gas = $map['gas'];
        }
        if(isset($map['group_id'])){
            $model->groupId = $map['group_id'];
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
        if(isset($map['signature'])){
            if(!empty($map['signature'])){
                $model->signature = [];
                $model->signature = $map['signature'];
            }
        }
        if(isset($map['timestamp'])){
            $model->timestamp = $map['timestamp'];
        }
        if(isset($map['to'])){
            $model->to = $map['to'];
        }
        if(isset($map['type'])){
            $model->type = $map['type'];
        }
        if(isset($map['value'])){
            $model->value = $map['value'];
        }
        if(isset($map['version'])){
            $model->version = $map['version'];
        }
        return $model;
    }
    /**
     * @example 05656e747279a2...
     * @description 交易信息
     * @var string
     */
    public $data;

    /**
     * @example 
     * @description 交易扩展信息
     * @var array
     */
    public $extension;

    /**
     * @example d3936015f0f4676a03a1bdea8b6fc24390f9f147853c5398e989dd30afae643b
     * @description 交易发起方
     * @var string
     */
    public $from;

    /**
     * @example 1234
     * @description 交易gas消耗
     * @var integer
     */
    public $gas;

    /**
     * @example 0000000000000000000000000000000000000000
     * @description 分组id，暂时没用
     * @var string
     */
    public $groupId;

    /**
     * @example 7f73437ea59ff23cf1050d5511fe8d94ed5ec8eab8f9175f7f3ffcbb05b374ee
     * @description 交易哈希
     * @var string
     */
    public $hash;

    /**
     * @example 13945910133563405517
     * @description 交易随机数
     * @var string
     */
    public $nonce;

    /**
     * @example 1583989453107
     * @description 交易时间
     * @var integer
     */
    public $period;

    /**
     * @example c75f573981b3a1fcadea90cd530f5802e0...
     * @description 交易签名
     * @var array
     */
    public $signature;

    /**
     * @example 1583989453107
     * @description 交易时间戳
     * @var integer
     */
    public $timestamp;

    /**
     * @example f76abaaa47c23bd27d0e77bc625773df9776d2f273b569d1074d89643fb73feb
     * @description 交易接收方
     * @var string
     */
    public $to;

    /**
     * @example 11
     * @description 2
     * @var integer
     */
    public $type;

    /**
     * @example 0
     * @description 交易转账金额
     * @var integer
     */
    public $value;

    /**
     * @example 2
     * @description 2
     * @var integer
     */
    public $version;

}
