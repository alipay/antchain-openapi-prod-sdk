<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\WEBTTS\Models;

use AlibabaCloud\Tea\Model;

class QueryBlockchainResponse extends Model
{
    // 链名称
    /**
     * @example Ethereum
     *
     * @var string
     */
    public $blockchain;

    // 链类型
    /**
     * @example EVM
     *
     * @var string
     */
    public $chainType;
    protected $_name = [
        'blockchain' => 'blockchain',
        'chainType'  => 'chain_type',
    ];

    public function validate()
    {
        Model::validateRequired('blockchain', $this->blockchain, true);
        Model::validateRequired('chainType', $this->chainType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->blockchain) {
            $res['blockchain'] = $this->blockchain;
        }
        if (null !== $this->chainType) {
            $res['chain_type'] = $this->chainType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryBlockchainResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['blockchain'])) {
            $model->blockchain = $map['blockchain'];
        }
        if (isset($map['chain_type'])) {
            $model->chainType = $map['chain_type'];
        }

        return $model;
    }
}
