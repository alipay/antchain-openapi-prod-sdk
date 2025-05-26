<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class ItemInventoryVO extends Model
{
    // 库存数量
    /**
     * @example 1000
     *
     * @var int
     */
    public $stock;

    // 生效时间
    /**
     * @example 2025-05-20 08:00:00
     *
     * @var string
     */
    public $gmtValid;

    // 失效时间
    /**
     * @example 2025-05-20 09:00:00
     *
     * @var string
     */
    public $gmtInvalid;
    protected $_name = [
        'stock'      => 'stock',
        'gmtValid'   => 'gmt_valid',
        'gmtInvalid' => 'gmt_invalid',
    ];

    public function validate()
    {
        Model::validateRequired('stock', $this->stock, true);
        Model::validateRequired('gmtValid', $this->gmtValid, true);
        Model::validateRequired('gmtInvalid', $this->gmtInvalid, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->stock) {
            $res['stock'] = $this->stock;
        }
        if (null !== $this->gmtValid) {
            $res['gmt_valid'] = $this->gmtValid;
        }
        if (null !== $this->gmtInvalid) {
            $res['gmt_invalid'] = $this->gmtInvalid;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ItemInventoryVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['stock'])) {
            $model->stock = $map['stock'];
        }
        if (isset($map['gmt_valid'])) {
            $model->gmtValid = $map['gmt_valid'];
        }
        if (isset($map['gmt_invalid'])) {
            $model->gmtInvalid = $map['gmt_invalid'];
        }

        return $model;
    }
}
