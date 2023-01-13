<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDATAGW\Models;

use AlibabaCloud\Tea\Model;

class DataSearchResultResponseLog extends Model
{
    // 数据关联的合约Meta信息
    /**
     * @example 5
     *
     * @var string
     */
    public $metaId;

    // 交易调用的函数名称
    /**
     * @example trasfer
     *
     * @var string
     */
    public $function;

    // 交易产生的事件名称
    /**
     * @example call_contract
     *
     * @var string
     */
    public $topic;

    // 交易所在的区块高度
    /**
     * @example 1284
     *
     * @var int
     */
    public $blockNum;

    // 交易ID
    /**
     * @example 6958d7e93f116f4ca34c932671733ebe18839f0a674b3d6d7dac69e53eb6c607
     *
     * @var string
     */
    public $txId;

    // Json 序列化的交易请求参数
    /**
     * @example {"from": "account1", "to": "account2"}
     *
     * @var string
     */
    public $data;

    // 交易中合约输出的日志内容
    /**
     * @example TransferEvent
     *
     * @var string
     */
    public $log;

    // 索引数据枚举类型， interface, event, deposit ；分别对应合约调用、合约事件、原生存证
    /**
     * @example interface, event, deposit
     *
     * @var string
     */
    public $type;

    // 交易上链时间戳，单位毫秒
    /**
     * @example 1632992019000
     *
     * @var int
     */
    public $txTimestamp;
    protected $_name = [
        'metaId'      => 'meta_id',
        'function'    => 'function',
        'topic'       => 'topic',
        'blockNum'    => 'block_num',
        'txId'        => 'tx_id',
        'data'        => 'data',
        'log'         => 'log',
        'type'        => 'type',
        'txTimestamp' => 'tx_timestamp',
    ];

    public function validate()
    {
        Model::validateRequired('metaId', $this->metaId, true);
        Model::validateRequired('blockNum', $this->blockNum, true);
        Model::validateRequired('txId', $this->txId, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('txTimestamp', $this->txTimestamp, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->metaId) {
            $res['meta_id'] = $this->metaId;
        }
        if (null !== $this->function) {
            $res['function'] = $this->function;
        }
        if (null !== $this->topic) {
            $res['topic'] = $this->topic;
        }
        if (null !== $this->blockNum) {
            $res['block_num'] = $this->blockNum;
        }
        if (null !== $this->txId) {
            $res['tx_id'] = $this->txId;
        }
        if (null !== $this->data) {
            $res['data'] = $this->data;
        }
        if (null !== $this->log) {
            $res['log'] = $this->log;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->txTimestamp) {
            $res['tx_timestamp'] = $this->txTimestamp;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DataSearchResultResponseLog
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['meta_id'])) {
            $model->metaId = $map['meta_id'];
        }
        if (isset($map['function'])) {
            $model->function = $map['function'];
        }
        if (isset($map['topic'])) {
            $model->topic = $map['topic'];
        }
        if (isset($map['block_num'])) {
            $model->blockNum = $map['block_num'];
        }
        if (isset($map['tx_id'])) {
            $model->txId = $map['tx_id'];
        }
        if (isset($map['data'])) {
            $model->data = $map['data'];
        }
        if (isset($map['log'])) {
            $model->log = $map['log'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['tx_timestamp'])) {
            $model->txTimestamp = $map['tx_timestamp'];
        }

        return $model;
    }
}
