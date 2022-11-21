<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Osp\Models;

use AlibabaCloud\Tea\Model;

class MeterDataItemModel extends Model
{
    // 计量项名称
    /**
     * @example 1
     *
     * @var string
     */
    public $itemCode;

    // 计量项值
    /**
     * @example 11
     *
     * @var int
     */
    public $itemValue;
    protected $_name = [
        'itemCode'  => 'item_code',
        'itemValue' => 'item_value',
    ];

    public function validate()
    {
        Model::validateRequired('itemCode', $this->itemCode, true);
        Model::validateRequired('itemValue', $this->itemValue, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->itemCode) {
            $res['item_code'] = $this->itemCode;
        }
        if (null !== $this->itemValue) {
            $res['item_value'] = $this->itemValue;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MeterDataItemModel
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['item_code'])) {
            $model->itemCode = $map['item_code'];
        }
        if (isset($map['item_value'])) {
            $model->itemValue = $map['item_value'];
        }

        return $model;
    }
}
