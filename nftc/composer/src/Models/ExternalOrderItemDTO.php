<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\NFTC\Models;

use AlibabaCloud\Tea\Model;

class ExternalOrderItemDTO extends Model
{
    // 购买的sku id
    /**
     * @example 12345
     *
     * @var int
     */
    public $skuId;

    // 购买后对应发放的藏品nftId，仅当orderStatus为FINISH时返回
    /**
     * @example AC152**#/123***
     *
     * @var string
     */
    public $nftId;
    protected $_name = [
        'skuId' => 'sku_id',
        'nftId' => 'nft_id',
    ];

    public function validate()
    {
        Model::validateRequired('skuId', $this->skuId, true);
        Model::validateRequired('nftId', $this->nftId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->skuId) {
            $res['sku_id'] = $this->skuId;
        }
        if (null !== $this->nftId) {
            $res['nft_id'] = $this->nftId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExternalOrderItemDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['sku_id'])) {
            $model->skuId = $map['sku_id'];
        }
        if (isset($map['nft_id'])) {
            $model->nftId = $map['nft_id'];
        }

        return $model;
    }
}
