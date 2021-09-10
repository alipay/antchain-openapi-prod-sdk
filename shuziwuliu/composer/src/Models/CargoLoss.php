<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class CargoLoss extends Model
{
    // 物品类型
    /**
     * @example 电子/3C
     *
     * @var string
     */
    public $cargoType;

    // 物品名称
    /**
     * @example 诺基亚nokiai103
     *
     * @var string
     */
    public $cargoName;

    // 物品所有人
    /**
     * @example 福建省漳州市漳浦县201站点
     *
     * @var string
     */
    public $cargoOwner;

    // 物品损失描述
    /**
     * @example 外包装破损
     *
     * @var string
     */
    public $cargoLossDesc;

    // 损失预估，单位（元），最多支持2位小数
    /**
     * @example 20.00
     *
     * @var string
     */
    public $cargoLossEstimateAmount;
    protected $_name = [
        'cargoType'               => 'cargo_type',
        'cargoName'               => 'cargo_name',
        'cargoOwner'              => 'cargo_owner',
        'cargoLossDesc'           => 'cargo_loss_desc',
        'cargoLossEstimateAmount' => 'cargo_loss_estimate_amount',
    ];

    public function validate()
    {
        Model::validateMaxLength('cargoType', $this->cargoType, 200);
        Model::validateMaxLength('cargoName', $this->cargoName, 500);
        Model::validateMaxLength('cargoOwner', $this->cargoOwner, 200);
        Model::validateMaxLength('cargoLossDesc', $this->cargoLossDesc, 500);
        Model::validateRequired('cargoName', $this->cargoName, true);
        Model::validateRequired('cargoLossEstimateAmount', $this->cargoLossEstimateAmount, true);
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
        if (null !== $this->cargoOwner) {
            $res['cargo_owner'] = $this->cargoOwner;
        }
        if (null !== $this->cargoLossDesc) {
            $res['cargo_loss_desc'] = $this->cargoLossDesc;
        }
        if (null !== $this->cargoLossEstimateAmount) {
            $res['cargo_loss_estimate_amount'] = $this->cargoLossEstimateAmount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CargoLoss
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
        if (isset($map['cargo_owner'])) {
            $model->cargoOwner = $map['cargo_owner'];
        }
        if (isset($map['cargo_loss_desc'])) {
            $model->cargoLossDesc = $map['cargo_loss_desc'];
        }
        if (isset($map['cargo_loss_estimate_amount'])) {
            $model->cargoLossEstimateAmount = $map['cargo_loss_estimate_amount'];
        }

        return $model;
    }
}
