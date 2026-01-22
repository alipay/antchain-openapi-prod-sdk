<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INSURANCE_SAAS_DE\Models;

use AlibabaCloud\Tea\Model;

class CargoDetails extends Model
{
    // 货物序号
    /**
     * @example 1
     *
     * @var string
     */
    public $cargoSequenceNo;

    // 货物名称
    /**
     * @example 耳机
     *
     * @var string
     */
    public $cargoName;

    // 货物规格
    /**
     * @example xxx
     *
     * @var string
     */
    public $cargoSpecification;

    // 货物数量
    /**
     * @example 1000
     *
     * @var string
     */
    public $cargoQuantity;

    // 货物单价，小数位只支持2位
    /**
     * @example 454.22
     *
     * @var string
     */
    public $cargoUnitPrice;
    protected $_name = [
        'cargoSequenceNo'    => 'cargo_sequence_no',
        'cargoName'          => 'cargo_name',
        'cargoSpecification' => 'cargo_specification',
        'cargoQuantity'      => 'cargo_quantity',
        'cargoUnitPrice'     => 'cargo_unit_price',
    ];

    public function validate()
    {
        Model::validateRequired('cargoSequenceNo', $this->cargoSequenceNo, true);
        Model::validateRequired('cargoName', $this->cargoName, true);
        Model::validateRequired('cargoSpecification', $this->cargoSpecification, true);
        Model::validateRequired('cargoQuantity', $this->cargoQuantity, true);
        Model::validateRequired('cargoUnitPrice', $this->cargoUnitPrice, true);
        Model::validateMaxLength('cargoSequenceNo', $this->cargoSequenceNo, 10);
        Model::validateMaxLength('cargoName', $this->cargoName, 50);
        Model::validateMaxLength('cargoSpecification', $this->cargoSpecification, 50);
        Model::validateMaxLength('cargoQuantity', $this->cargoQuantity, 100);
        Model::validateMaxLength('cargoUnitPrice', $this->cargoUnitPrice, 20);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->cargoSequenceNo) {
            $res['cargo_sequence_no'] = $this->cargoSequenceNo;
        }
        if (null !== $this->cargoName) {
            $res['cargo_name'] = $this->cargoName;
        }
        if (null !== $this->cargoSpecification) {
            $res['cargo_specification'] = $this->cargoSpecification;
        }
        if (null !== $this->cargoQuantity) {
            $res['cargo_quantity'] = $this->cargoQuantity;
        }
        if (null !== $this->cargoUnitPrice) {
            $res['cargo_unit_price'] = $this->cargoUnitPrice;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CargoDetails
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cargo_sequence_no'])) {
            $model->cargoSequenceNo = $map['cargo_sequence_no'];
        }
        if (isset($map['cargo_name'])) {
            $model->cargoName = $map['cargo_name'];
        }
        if (isset($map['cargo_specification'])) {
            $model->cargoSpecification = $map['cargo_specification'];
        }
        if (isset($map['cargo_quantity'])) {
            $model->cargoQuantity = $map['cargo_quantity'];
        }
        if (isset($map['cargo_unit_price'])) {
            $model->cargoUnitPrice = $map['cargo_unit_price'];
        }

        return $model;
    }
}
