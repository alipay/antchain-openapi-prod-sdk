<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class CargoInfo extends Model
{
    // 货物类型，货物类型的大类
    /**
     * @example Computer & Office
     *
     * @var string
     */
    public $cargoType;

    // 货物名称，实际的货物名称
    /**
     * @example 3D Printing
     *
     * @var string
     */
    public $cargoName;

    // 货物数量
    /**
     * @example 10
     *
     * @var string
     */
    public $cargoQuantity;

    // 货物申报价值，单位（元），最多支持2位小数，超过2位拒绝
    /**
     * @example 1002.00
     *
     * @var string
     */
    public $cargoWorth;
    protected $_name = [
        'cargoType'     => 'cargo_type',
        'cargoName'     => 'cargo_name',
        'cargoQuantity' => 'cargo_quantity',
        'cargoWorth'    => 'cargo_worth',
    ];

    public function validate()
    {
        Model::validateRequired('cargoType', $this->cargoType, true);
        Model::validateRequired('cargoName', $this->cargoName, true);
        Model::validateRequired('cargoQuantity', $this->cargoQuantity, true);
        Model::validateRequired('cargoWorth', $this->cargoWorth, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->cargoType) {
            $res['cargo_type'] = $this->cargoType;
        }
        if (null !== $this->cargoName) {
            $res['cargo_name'] = $this->cargoName;
        }
        if (null !== $this->cargoQuantity) {
            $res['cargo_quantity'] = $this->cargoQuantity;
        }
        if (null !== $this->cargoWorth) {
            $res['cargo_worth'] = $this->cargoWorth;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CargoInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cargo_type'])) {
            $model->cargoType = $map['cargo_type'];
        }
        if (isset($map['cargo_name'])) {
            $model->cargoName = $map['cargo_name'];
        }
        if (isset($map['cargo_quantity'])) {
            $model->cargoQuantity = $map['cargo_quantity'];
        }
        if (isset($map['cargo_worth'])) {
            $model->cargoWorth = $map['cargo_worth'];
        }

        return $model;
    }
}
