<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class QueryConsumecardBlockResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 区块信息
    /**
     * @var Block
     */
    public $block;

    // 区块高度
    /**
     * @var int
     */
    public $blockNumber;

    // 链ID
    /**
     * @var string
     */
    public $chainId;

    // 过滤后的交易数量
    /**
     * @var int
     */
    public $filteredTxCount;

    // 区块中交易总数
    /**
     * @var int
     */
    public $totalTxCount;
    protected $_name = [
        'reqMsgId'        => 'req_msg_id',
        'resultCode'      => 'result_code',
        'resultMsg'       => 'result_msg',
        'block'           => 'block',
        'blockNumber'     => 'block_number',
        'chainId'         => 'chain_id',
        'filteredTxCount' => 'filtered_tx_count',
        'totalTxCount'    => 'total_tx_count',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->block) {
            $res['block'] = null !== $this->block ? $this->block->toMap() : null;
        }
        if (null !== $this->blockNumber) {
            $res['block_number'] = $this->blockNumber;
        }
        if (null !== $this->chainId) {
            $res['chain_id'] = $this->chainId;
        }
        if (null !== $this->filteredTxCount) {
            $res['filtered_tx_count'] = $this->filteredTxCount;
        }
        if (null !== $this->totalTxCount) {
            $res['total_tx_count'] = $this->totalTxCount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryConsumecardBlockResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['block'])) {
            $model->block = Block::fromMap($map['block']);
        }
        if (isset($map['block_number'])) {
            $model->blockNumber = $map['block_number'];
        }
        if (isset($map['chain_id'])) {
            $model->chainId = $map['chain_id'];
        }
        if (isset($map['filtered_tx_count'])) {
            $model->filteredTxCount = $map['filtered_tx_count'];
        }
        if (isset($map['total_tx_count'])) {
            $model->totalTxCount = $map['total_tx_count'];
        }

        return $model;
    }
}
