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
    protected $_name = [
        'skuId' => 'sku_id',
    ];

    public function validate()
    {
        Model::validateRequired('skuId', $this->skuId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->skuId) {
            $res['sku_id'] = $this->skuId;
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

        return $model;
    }
}
