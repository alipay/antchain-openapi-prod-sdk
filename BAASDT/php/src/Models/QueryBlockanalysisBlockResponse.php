<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class QueryBlockanalysisBlockResponse extends Model {
    protected $_name = [
        'block' => 'block',
        'blockNumber' => 'block_number',
        'chainId' => 'chain_id',
        'filteredTxCount' => 'filtered_tx_count',
        'totalTxCount' => 'total_tx_count',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
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
     * @return QueryBlockanalysisBlockResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['block'])){
            $model->block = Block::fromMap($map['block']);
        }
        if(isset($map['block_number'])){
            $model->blockNumber = $map['block_number'];
        }
        if(isset($map['chain_id'])){
            $model->chainId = $map['chain_id'];
        }
        if(isset($map['filtered_tx_count'])){
            $model->filteredTxCount = $map['filtered_tx_count'];
        }
        if(isset($map['total_tx_count'])){
            $model->totalTxCount = $map['total_tx_count'];
        }
        return $model;
    }
    /**
     * @description 区块信息
     * @example 
     * @var Block
     */
    public $block;

    /**
     * @description 区块高度
     * @example 1423675
     * @var integer
     */
    public $blockNumber;

    /**
     * @description 链ID
     * @example antdao
     * @var string
     */
    public $chainId;

    /**
     * @description 过滤后的交易数量
     * @example 1
     * @var integer
     */
    public $filteredTxCount;

    /**
     * @description 区块中交易总数
     * @example 3
     * @var integer
     */
    public $totalTxCount;

}
