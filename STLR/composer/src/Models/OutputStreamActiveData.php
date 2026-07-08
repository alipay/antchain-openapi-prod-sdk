<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class OutputStreamActiveData extends Model
{
    // 物料编码
    /**
     * @example 0102010000
     *
     * @var string
     */
    public $materialCode;

    // 用量，非负，最多6位小数
    /**
     * @example 200.12
     *
     * @var string
     */
    public $amount;

    // 单位
    /**
     * @example KG
     *
     * @var string
     */
    public $unit;

    // 单价（仅产品用，产品不传时默认为空）
    /**
     * @example 100
     *
     * @var string
     */
    public $unitPrice;

    // 处置方式编码（仅废弃物用）
    /**
     * @example 5201000000
     *
     * @var string
     */
    public $disposalTypeCode;

    // 运输信息列表（仅废弃物用）
    /**
     * @example
     *
     * @var TransportActiveData[]
     */
    public $transportList;
    protected $_name = [
        'materialCode'     => 'material_code',
        'amount'           => 'amount',
        'unit'             => 'unit',
        'unitPrice'        => 'unit_price',
        'disposalTypeCode' => 'disposal_type_code',
        'transportList'    => 'transport_list',
    ];

    public function validate()
    {
        Model::validateRequired('materialCode', $this->materialCode, true);
        Model::validateRequired('amount', $this->amount, true);
        Model::validateRequired('unit', $this->unit, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->materialCode) {
            $res['material_code'] = $this->materialCode;
        }
        if (null !== $this->amount) {
            $res['amount'] = $this->amount;
        }
        if (null !== $this->unit) {
            $res['unit'] = $this->unit;
        }
        if (null !== $this->unitPrice) {
            $res['unit_price'] = $this->unitPrice;
        }
        if (null !== $this->disposalTypeCode) {
            $res['disposal_type_code'] = $this->disposalTypeCode;
        }
        if (null !== $this->transportList) {
            $res['transport_list'] = [];
            if (null !== $this->transportList && \is_array($this->transportList)) {
                $n = 0;
                foreach ($this->transportList as $item) {
                    $res['transport_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OutputStreamActiveData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['material_code'])) {
            $model->materialCode = $map['material_code'];
        }
        if (isset($map['amount'])) {
            $model->amount = $map['amount'];
        }
        if (isset($map['unit'])) {
            $model->unit = $map['unit'];
        }
        if (isset($map['unit_price'])) {
            $model->unitPrice = $map['unit_price'];
        }
        if (isset($map['disposal_type_code'])) {
            $model->disposalTypeCode = $map['disposal_type_code'];
        }
        if (isset($map['transport_list'])) {
            if (!empty($map['transport_list'])) {
                $model->transportList = [];
                $n                    = 0;
                foreach ($map['transport_list'] as $item) {
                    $model->transportList[$n++] = null !== $item ? TransportActiveData::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
