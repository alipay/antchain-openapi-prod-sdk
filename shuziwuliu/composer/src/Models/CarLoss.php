<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class CarLoss extends Model
{
    // 车牌号，车牌号和车架号至少填一个
    /**
     * @example 皖C54322
     *
     * @var string
     */
    public $carMark;

    // 车主姓名
    /**
     * @example 王大毛
     *
     * @var string
     */
    public $carOwnerName;

    // 车主联系方式
    /**
     * @example 17029990909
     *
     * @var string
     */
    public $carOwnerContact;

    // 车架号，车牌号和车架号至少填一个
    /**
     * @example DMQJ928881992
     *
     * @var string
     */
    public $carVinNo;

    // 损失预估，单位（元），最多支持2位小数
    /**
     * @example 1002.00
     *
     * @var string
     */
    public $carLossEstimateAmount;
    protected $_name = [
        'carMark'               => 'car_mark',
        'carOwnerName'          => 'car_owner_name',
        'carOwnerContact'       => 'car_owner_contact',
        'carVinNo'              => 'car_vin_no',
        'carLossEstimateAmount' => 'car_loss_estimate_amount',
    ];

    public function validate()
    {
        Model::validateMaxLength('carMark', $this->carMark, 20);
        Model::validateMaxLength('carOwnerName', $this->carOwnerName, 200);
        Model::validateMaxLength('carOwnerContact', $this->carOwnerContact, 20);
        Model::validateMaxLength('carVinNo', $this->carVinNo, 100);
        Model::validateRequired('carLossEstimateAmount', $this->carLossEstimateAmount, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->carMark) {
            $res['car_mark'] = $this->carMark;
        }
        if (null !== $this->carOwnerName) {
            $res['car_owner_name'] = $this->carOwnerName;
        }
        if (null !== $this->carOwnerContact) {
            $res['car_owner_contact'] = $this->carOwnerContact;
        }
        if (null !== $this->carVinNo) {
            $res['car_vin_no'] = $this->carVinNo;
        }
        if (null !== $this->carLossEstimateAmount) {
            $res['car_loss_estimate_amount'] = $this->carLossEstimateAmount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CarLoss
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['car_mark'])) {
            $model->carMark = $map['car_mark'];
        }
        if (isset($map['car_owner_name'])) {
            $model->carOwnerName = $map['car_owner_name'];
        }
        if (isset($map['car_owner_contact'])) {
            $model->carOwnerContact = $map['car_owner_contact'];
        }
        if (isset($map['car_vin_no'])) {
            $model->carVinNo = $map['car_vin_no'];
        }
        if (isset($map['car_loss_estimate_amount'])) {
            $model->carLossEstimateAmount = $map['car_loss_estimate_amount'];
        }

        return $model;
    }
}
