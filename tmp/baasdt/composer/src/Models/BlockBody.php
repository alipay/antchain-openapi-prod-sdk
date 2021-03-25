<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class BlockBody extends Model
{
    // 区块共识证明(HEX)
    /**
     * @example f8f2f8c9b841f8...
     *
     * @var string
     */
    public $consensusProof;

    // 区块中交易回执列表
    /**
     * @example
     *
     * @var BlockReceipt[]
     */
    public $receiptList;

    // 区块中交易列表
    /**
     * @example
     *
     * @var BlockTransaction[]
     */
    public $transactionList;
    protected $_name = [
        'consensusProof'  => 'consensus_proof',
        'receiptList'     => 'receipt_list',
        'transactionList' => 'transaction_list',
    ];

    public function validate()
    {
        Model::validateRequired('consensusProof', $this->consensusProof, true);
        Model::validateRequired('receiptList', $this->receiptList, true);
        Model::validateRequired('transactionList', $this->transactionList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->consensusProof) {
            $res['consensus_proof'] = $this->consensusProof;
        }
        if (null !== $this->receiptList) {
            $res['receipt_list'] = [];
            if (null !== $this->receiptList && \is_array($this->receiptList)) {
                $n = 0;
                foreach ($this->receiptList as $item) {
                    $res['receipt_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->transactionList) {
            $res['transaction_list'] = [];
            if (null !== $this->transactionList && \is_array($this->transactionList)) {
                $n = 0;
                foreach ($this->transactionList as $item) {
                    $res['transaction_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BlockBody
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['consensus_proof'])) {
            $model->consensusProof = $map['consensus_proof'];
        }
        if (isset($map['receipt_list'])) {
            if (!empty($map['receipt_list'])) {
                $model->receiptList = [];
                $n                  = 0;
                foreach ($map['receipt_list'] as $item) {
                    $model->receiptList[$n++] = null !== $item ? BlockReceipt::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['transaction_list'])) {
            if (!empty($map['transaction_list'])) {
                $model->transactionList = [];
                $n                      = 0;
                foreach ($map['transaction_list'] as $item) {
                    $model->transactionList[$n++] = null !== $item ? BlockTransaction::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
