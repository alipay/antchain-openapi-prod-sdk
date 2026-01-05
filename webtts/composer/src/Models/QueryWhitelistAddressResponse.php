<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\WEBTTS\Models;

use AlibabaCloud\Tea\Model;

class QueryWhitelistAddressResponse extends Model
{
    // 白名单地址
    /**
     * @example 0xf5be944e4829aa055957e45bdf1b41175744f0a2
     *
     * @var string
     */
    public $whitelistAddress;

    // 区块链列表信息
    /**
     * @example []
     *
     * @var QueryBlockchainResponse[]
     */
    public $blockchainList;
    protected $_name = [
        'whitelistAddress' => 'whitelist_address',
        'blockchainList'   => 'blockchain_list',
    ];

    public function validate()
    {
        Model::validateRequired('whitelistAddress', $this->whitelistAddress, true);
        Model::validateRequired('blockchainList', $this->blockchainList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->whitelistAddress) {
            $res['whitelist_address'] = $this->whitelistAddress;
        }
        if (null !== $this->blockchainList) {
            $res['blockchain_list'] = [];
            if (null !== $this->blockchainList && \is_array($this->blockchainList)) {
                $n = 0;
                foreach ($this->blockchainList as $item) {
                    $res['blockchain_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryWhitelistAddressResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['whitelist_address'])) {
            $model->whitelistAddress = $map['whitelist_address'];
        }
        if (isset($map['blockchain_list'])) {
            if (!empty($map['blockchain_list'])) {
                $model->blockchainList = [];
                $n                     = 0;
                foreach ($map['blockchain_list'] as $item) {
                    $model->blockchainList[$n++] = null !== $item ? QueryBlockchainResponse::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
