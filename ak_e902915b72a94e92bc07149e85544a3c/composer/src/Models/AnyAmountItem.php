<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_e902915b72a94e92bc07149e85544a3c\Models;

use AlibabaCloud\Tea\Model;

class AnyAmountItem extends Model
{
    // 数据项编码
    /**
     * @example AD1
     *
     * @var string
     */
    public $itemCode;

    // 数据值，按字符串输出，最多保留6位小数
    /**
     * @example 221.11
     *
     * @var string
     */
    public $itemAmount;
    protected $_name = [
        'itemCode'   => 'item_code',
        'itemAmount' => 'item_amount',
    ];

    public function validate()
    {
        Model::validateRequired('itemCode', $this->itemCode, true);
        Model::validateRequired('itemAmount', $this->itemAmount, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->itemCode) {
            $res['item_code'] = $this->itemCode;
        }
        if (null !== $this->itemAmount) {
            $res['item_amount'] = $this->itemAmount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AnyAmountItem
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['item_code'])) {
            $model->itemCode = $map['item_code'];
        }
        if (isset($map['item_amount'])) {
            $model->itemAmount = $map['item_amount'];
        }

        return $model;
    }
}
