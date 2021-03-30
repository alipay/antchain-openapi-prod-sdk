<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class StartFinanceWaybillRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 货物运费险
    /**
     * @var string
     */
    public $cargoInsuranceMoney;

    // 车牌颜色
    /**
     * @var string
     */
    public $cartBadgeColor;

    // 车牌号
    /**
     * @var string
     */
    public $cartBadgeNo;

    // 承运商did
    /**
     * @var string
     */
    public $carCaptainDid;

    // 司机分布式数字身份
    /**
     * @var string
     */
    public $driverDid;

    // 无车承运平台分布式数字身份，缺省时为自己的分布式数字身份
    /**
     * @var string
     */
    public $platformDid;

    // 起运时间，13位毫秒级时间戳
    /**
     * @var int
     */
    public $startTime;

    // 运单id
    /**
     * @var string
     */
    public $taxWaybillId;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'cargoInsuranceMoney' => 'cargo_insurance_money',
        'cartBadgeColor'      => 'cart_badge_color',
        'cartBadgeNo'         => 'cart_badge_no',
        'carCaptainDid'       => 'car_captain_did',
        'driverDid'           => 'driver_did',
        'platformDid'         => 'platform_did',
        'startTime'           => 'start_time',
        'taxWaybillId'        => 'tax_waybill_id',
    ];

    public function validate()
    {
        Model::validateRequired('cartBadgeColor', $this->cartBadgeColor, true);
        Model::validateRequired('cartBadgeNo', $this->cartBadgeNo, true);
        Model::validateRequired('driverDid', $this->driverDid, true);
        Model::validateRequired('platformDid', $this->platformDid, true);
        Model::validateRequired('startTime', $this->startTime, true);
        Model::validateRequired('taxWaybillId', $this->taxWaybillId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->cargoInsuranceMoney) {
            $res['cargo_insurance_money'] = $this->cargoInsuranceMoney;
        }
        if (null !== $this->cartBadgeColor) {
            $res['cart_badge_color'] = $this->cartBadgeColor;
        }
        if (null !== $this->cartBadgeNo) {
            $res['cart_badge_no'] = $this->cartBadgeNo;
        }
        if (null !== $this->carCaptainDid) {
            $res['car_captain_did'] = $this->carCaptainDid;
        }
        if (null !== $this->driverDid) {
            $res['driver_did'] = $this->driverDid;
        }
        if (null !== $this->platformDid) {
            $res['platform_did'] = $this->platformDid;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }
        if (null !== $this->taxWaybillId) {
            $res['tax_waybill_id'] = $this->taxWaybillId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartFinanceWaybillRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['cargo_insurance_money'])) {
            $model->cargoInsuranceMoney = $map['cargo_insurance_money'];
        }
        if (isset($map['cart_badge_color'])) {
            $model->cartBadgeColor = $map['cart_badge_color'];
        }
        if (isset($map['cart_badge_no'])) {
            $model->cartBadgeNo = $map['cart_badge_no'];
        }
        if (isset($map['car_captain_did'])) {
            $model->carCaptainDid = $map['car_captain_did'];
        }
        if (isset($map['driver_did'])) {
            $model->driverDid = $map['driver_did'];
        }
        if (isset($map['platform_did'])) {
            $model->platformDid = $map['platform_did'];
        }
        if (isset($map['start_time'])) {
            $model->startTime = $map['start_time'];
        }
        if (isset($map['tax_waybill_id'])) {
            $model->taxWaybillId = $map['tax_waybill_id'];
        }

        return $model;
    }
}
