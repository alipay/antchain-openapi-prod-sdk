<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_e902915b72a94e92bc07149e85544a3c\Models;

use AlibabaCloud\Tea\Model;

class AnyKeywordItem extends Model
{
    // 项目编码
    /**
     * @example CFD
     *
     * @var string
     */
    public $itemCode;

    // 项目值
    /**
     * @example 各种按业务场景的取值
     *
     * @var string
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
     * @return AnyKeywordItem
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
