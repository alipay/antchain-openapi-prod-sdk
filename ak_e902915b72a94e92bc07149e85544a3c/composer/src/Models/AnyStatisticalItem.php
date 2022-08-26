<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_e902915b72a94e92bc07149e85544a3c\Models;

use AlibabaCloud\Tea\Model;

class AnyStatisticalItem extends Model
{
    // 统计项目编码
    /**
     * @example abc
     *
     * @var string
     */
    public $itemCode;

    // 数据值，按字符串输出，最多保留6位小数
    /**
     * @example 222.22
     *
     * @var string
     */
    public $amount;

    // 单位编码
    /**
     * @example t
     *
     * @var string
     */
    public $unit;

    // 单位标签
    /**
     * @example 吨
     *
     * @var string
     */
    public $unitLabel;
    protected $_name = [
        'itemCode'  => 'item_code',
        'amount'    => 'amount',
        'unit'      => 'unit',
        'unitLabel' => 'unit_label',
    ];

    public function validate()
    {
        Model::validateRequired('itemCode', $this->itemCode, true);
        Model::validateRequired('amount', $this->amount, true);
        Model::validateRequired('unit', $this->unit, true);
        Model::validateRequired('unitLabel', $this->unitLabel, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->itemCode) {
            $res['item_code'] = $this->itemCode;
        }
        if (null !== $this->amount) {
            $res['amount'] = $this->amount;
        }
        if (null !== $this->unit) {
            $res['unit'] = $this->unit;
        }
        if (null !== $this->unitLabel) {
            $res['unit_label'] = $this->unitLabel;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AnyStatisticalItem
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['item_code'])) {
            $model->itemCode = $map['item_code'];
        }
        if (isset($map['amount'])) {
            $model->amount = $map['amount'];
        }
        if (isset($map['unit'])) {
            $model->unit = $map['unit'];
        }
        if (isset($map['unit_label'])) {
            $model->unitLabel = $map['unit_label'];
        }

        return $model;
    }
}
