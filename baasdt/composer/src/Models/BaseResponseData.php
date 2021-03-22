<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class BaseResponseData extends Model
{
    // 区块链交易执行的区块高度
    /**
     * @example 10213
     *
     * @var int
     */
    public $blockNumber;

    // 交易的业务幂等Id,与交易发起时外部传入的一致
    /**
     * @example bizId001
     *
     * @var string
     */
    public $outBizId;

    // 区块链交易执行的哈希
    /**
     * @example ae855Afc982d96fAB65b3a49cAc8b878184Cb16
     *
     * @var string
     */
    public $txHash;
    protected $_name = [
        'blockNumber' => 'block_number',
        'outBizId'    => 'out_biz_id',
        'txHash'      => 'tx_hash',
    ];

    public function validate()
    {
        Model::validateRequired('blockNumber', $this->blockNumber, true);
        Model::validateRequired('outBizId', $this->outBizId, true);
        Model::validateRequired('txHash', $this->txHash, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->blockNumber) {
            $res['block_number'] = $this->blockNumber;
        }
        if (null !== $this->outBizId) {
            $res['out_biz_id'] = $this->outBizId;
        }
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BaseResponseData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['block_number'])) {
            $model->blockNumber = $map['block_number'];
        }
        if (isset($map['out_biz_id'])) {
            $model->outBizId = $map['out_biz_id'];
        }
        if (isset($map['tx_hash'])) {
            $model->txHash = $map['tx_hash'];
        }

        return $model;
    }
}
