<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class OrderItem extends Model
{
    // 项目ID
    /**
     * @example 11111
     *
     * @var string
     */
    public $itemId;

    // 项目类型（数登申请）
    /**
     * @example 数登申请
     *
     * @var string
     */
    public $itemType;
    protected $_name = [
        'itemId'   => 'item_id',
        'itemType' => 'item_type',
    ];

    public function validate()
    {
        Model::validateRequired('itemId', $this->itemId, true);
        Model::validateRequired('itemType', $this->itemType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->itemId) {
            $res['item_id'] = $this->itemId;
        }
        if (null !== $this->itemType) {
            $res['item_type'] = $this->itemType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OrderItem
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['item_id'])) {
            $model->itemId = $map['item_id'];
        }
        if (isset($map['item_type'])) {
            $model->itemType = $map['item_type'];
        }

        return $model;
    }
}
