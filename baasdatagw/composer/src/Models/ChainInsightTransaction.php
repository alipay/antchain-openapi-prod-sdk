<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDATAGW\Models;

use AlibabaCloud\Tea\Model;

class ChainInsightTransaction extends Model
{
    // 链ID
    /**
     * @example c3179e0d54a340a38d338664fe71d54c
     *
     * @var string
     */
    public $bizId;

    // 链名称
    /**
     * @example 数字资产
     *
     * @var string
     */
    public $bizIdName;

    // 交易ID
    /**
     * @example 450734c80f679db95a6d1d64ca0a5e1f4b71460ab520567861614f87fb9b4d75
     *
     * @var string
     */
    public $id;

    // 交易类型
    /**
     * @example TX_CALL_CONTRACT
     *
     * @var string
     */
    public $type;

    // 交易状态，VALID 表示合法，其它为错误码
    /**
     * @example VALID
     *
     * @var string
     */
    public $state;

    // 交易发起者地址
    /**
     * @example 8d881273a516ace01646381132b921dbbdeec771f01ca210ca213efdf4117b80
     *
     * @var string
     */
    public $from;

    // 交易目标地址
    /**
     * @example 13fe9940d10389c1df1bb4f253c5ec9bf7e0b8719020385e3aa96681bd13a0b4
     *
     * @var string
     */
    public $to;

    // 交易原始输入，hex编码
    /**
     * @example 28504d2e0000000000000000000000000
     *
     * @var string
     */
    public $input;

    // 交易调用的函数名
    /**
     * @example Add
     *
     * @var string
     */
    public $function;

    // 交易输入解析后的 json string
    /**
     * @example {"arg1":"add", "arg2": "1"}
     *
     * @var string
     */
    public $inputDecoded;

    // 交易的返回值
    /**
     * @example 00
     *
     * @var string
     */
    public $output;

    // 交易返回值解析后的 json string
    /**
     * @example {"idx_0": true}
     *
     * @var string
     */
    public $outputDecoded;

    // 交易所在区块高度
    /**
     * @example 1234
     *
     * @var int
     */
    public $blockNum;

    // 交易所在区块中的 index
    /**
     * @example 0
     *
     * @var int
     */
    public $txIndex;

    // 原始交易的 json string
    /**
     * @example string
     *
     * @var string
     */
    public $data;

    // 交易中的事件
    /**
     * @example
     *
     * @var ChainInsightEvent[]
     */
    public $events;
    protected $_name = [
        'bizId'         => 'biz_id',
        'bizIdName'     => 'biz_id_name',
        'id'            => 'id',
        'type'          => 'type',
        'state'         => 'state',
        'from'          => 'from',
        'to'            => 'to',
        'input'         => 'input',
        'function'      => 'function',
        'inputDecoded'  => 'input_decoded',
        'output'        => 'output',
        'outputDecoded' => 'output_decoded',
        'blockNum'      => 'block_num',
        'txIndex'       => 'tx_index',
        'data'          => 'data',
        'events'        => 'events',
    ];

    public function validate()
    {
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('state', $this->state, true);
        Model::validateRequired('from', $this->from, true);
        Model::validateRequired('to', $this->to, true);
        Model::validateRequired('input', $this->input, true);
        Model::validateRequired('blockNum', $this->blockNum, true);
        Model::validateRequired('txIndex', $this->txIndex, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->bizIdName) {
            $res['biz_id_name'] = $this->bizIdName;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        if (null !== $this->from) {
            $res['from'] = $this->from;
        }
        if (null !== $this->to) {
            $res['to'] = $this->to;
        }
        if (null !== $this->input) {
            $res['input'] = $this->input;
        }
        if (null !== $this->function) {
            $res['function'] = $this->function;
        }
        if (null !== $this->inputDecoded) {
            $res['input_decoded'] = $this->inputDecoded;
        }
        if (null !== $this->output) {
            $res['output'] = $this->output;
        }
        if (null !== $this->outputDecoded) {
            $res['output_decoded'] = $this->outputDecoded;
        }
        if (null !== $this->blockNum) {
            $res['block_num'] = $this->blockNum;
        }
        if (null !== $this->txIndex) {
            $res['tx_index'] = $this->txIndex;
        }
        if (null !== $this->data) {
            $res['data'] = $this->data;
        }
        if (null !== $this->events) {
            $res['events'] = [];
            if (null !== $this->events && \is_array($this->events)) {
                $n = 0;
                foreach ($this->events as $item) {
                    $res['events'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ChainInsightTransaction
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['biz_id_name'])) {
            $model->bizIdName = $map['biz_id_name'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['state'])) {
            $model->state = $map['state'];
        }
        if (isset($map['from'])) {
            $model->from = $map['from'];
        }
        if (isset($map['to'])) {
            $model->to = $map['to'];
        }
        if (isset($map['input'])) {
            $model->input = $map['input'];
        }
        if (isset($map['function'])) {
            $model->function = $map['function'];
        }
        if (isset($map['input_decoded'])) {
            $model->inputDecoded = $map['input_decoded'];
        }
        if (isset($map['output'])) {
            $model->output = $map['output'];
        }
        if (isset($map['output_decoded'])) {
            $model->outputDecoded = $map['output_decoded'];
        }
        if (isset($map['block_num'])) {
            $model->blockNum = $map['block_num'];
        }
        if (isset($map['tx_index'])) {
            $model->txIndex = $map['tx_index'];
        }
        if (isset($map['data'])) {
            $model->data = $map['data'];
        }
        if (isset($map['events'])) {
            if (!empty($map['events'])) {
                $model->events = [];
                $n             = 0;
                foreach ($map['events'] as $item) {
                    $model->events[$n++] = null !== $item ? ChainInsightEvent::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
