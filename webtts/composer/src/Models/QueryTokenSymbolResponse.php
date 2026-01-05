<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\WEBTTS\Models;

use AlibabaCloud\Tea\Model;

class QueryTokenSymbolResponse extends Model
{
    // 链名称
    /**
     * @example Ethereum
     *
     * @var string
     */
    public $blockchain;

    // 币种
    /**
     * @example USDC
     *
     * @var string
     */
    public $tokenSymbol;
    protected $_name = [
        'blockchain'  => 'blockchain',
        'tokenSymbol' => 'token_symbol',
    ];

    public function validate()
    {
        Model::validateRequired('blockchain', $this->blockchain, true);
        Model::validateRequired('tokenSymbol', $this->tokenSymbol, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->blockchain) {
            $res['blockchain'] = $this->blockchain;
        }
        if (null !== $this->tokenSymbol) {
            $res['token_symbol'] = $this->tokenSymbol;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryTokenSymbolResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['blockchain'])) {
            $model->blockchain = $map['blockchain'];
        }
        if (isset($map['token_symbol'])) {
            $model->tokenSymbol = $map['token_symbol'];
        }

        return $model;
    }
}
