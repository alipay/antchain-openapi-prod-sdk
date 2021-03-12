<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ALiYunChainBlock extends Model
{
    // ant_chain_id
    /**
     * @example ant_chain_id
     *
     * @var string
     */
    public $antChainId;

    // block_hash
    /**
     * @example block_hash
     *
     * @var string
     */
    public $blockHash;

    // create_time
    /**
     * @example create_time
     *
     * @var int
     */
    public $createTime;

    // height
    /**
     * @example 123123
     *
     * @var int
     */
    public $height;

    // previous_hash
    /**
     * @example previous_hash
     *
     * @var string
     */
    public $previousHash;

    // root_tx_hash
    /**
     * @example root_tx_hash
     *
     * @var string
     */
    public $rootTxHash;

    // transaction_size
    /**
     * @example 3
     *
     * @var int
     */
    public $transactionSize;

    // trans_summary_list
    /**
     * @example trans_summary_list
     *
     * @var ALiYunTransactionSummary[]
     */
    public $transSummaryList;

    // Version
    /**
     * @example 10
     *
     * @var int
     */
    public $version;
    protected $_name = [
        'antChainId'       => 'ant_chain_id',
        'blockHash'        => 'block_hash',
        'createTime'       => 'create_time',
        'height'           => 'height',
        'previousHash'     => 'previous_hash',
        'rootTxHash'       => 'root_tx_hash',
        'transactionSize'  => 'transaction_size',
        'transSummaryList' => 'trans_summary_list',
        'version'          => 'version',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->antChainId) {
            $res['ant_chain_id'] = $this->antChainId;
        }
        if (null !== $this->blockHash) {
            $res['block_hash'] = $this->blockHash;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->height) {
            $res['height'] = $this->height;
        }
        if (null !== $this->previousHash) {
            $res['previous_hash'] = $this->previousHash;
        }
        if (null !== $this->rootTxHash) {
            $res['root_tx_hash'] = $this->rootTxHash;
        }
        if (null !== $this->transactionSize) {
            $res['transaction_size'] = $this->transactionSize;
        }
        if (null !== $this->transSummaryList) {
            $res['trans_summary_list'] = [];
            if (null !== $this->transSummaryList && \is_array($this->transSummaryList)) {
                $n = 0;
                foreach ($this->transSummaryList as $item) {
                    $res['trans_summary_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ALiYunChainBlock
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['ant_chain_id'])) {
            $model->antChainId = $map['ant_chain_id'];
        }
        if (isset($map['block_hash'])) {
            $model->blockHash = $map['block_hash'];
        }
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }
        if (isset($map['height'])) {
            $model->height = $map['height'];
        }
        if (isset($map['previous_hash'])) {
            $model->previousHash = $map['previous_hash'];
        }
        if (isset($map['root_tx_hash'])) {
            $model->rootTxHash = $map['root_tx_hash'];
        }
        if (isset($map['transaction_size'])) {
            $model->transactionSize = $map['transaction_size'];
        }
        if (isset($map['trans_summary_list'])) {
            if (!empty($map['trans_summary_list'])) {
                $model->transSummaryList = [];
                $n                       = 0;
                foreach ($map['trans_summary_list'] as $item) {
                    $model->transSummaryList[$n++] = null !== $item ? ALiYunTransactionSummary::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['version'])) {
            $model->version = $map['version'];
        }

        return $model;
    }
}
