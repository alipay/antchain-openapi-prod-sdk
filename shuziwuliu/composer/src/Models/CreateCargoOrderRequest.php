<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class CreateCargoOrderRequest extends Model
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

    // 运费
    /**
     * @var string
     */
    public $allFreight;

    // 货物行业编码
    /**
     * @var string
     */
    public $cargoBusinessCode;

    // 货物商品编码
    /**
     * @var string
     */
    public $cargoCode;

    // 货运险金额
    /**
     * @var string
     */
    public $cargoInsuranceMoney;

    // 货物名称
    /**
     * @var string
     */
    public $cargoName;

    // 货源单号
    /**
     * @var string
     */
    public $cargoOrder;

    // 货物类型
    /**
     * @var string
     */
    public $cargoType;

    // 货物单位
    /**
     * @var string
     */
    public $cargoUnit;

    // 货物体积，单位（方）
    /**
     * @var string
     */
    public $cargoVolume;

    // 货主did
    /**
     * @var string
     */
    public $consignorDid;

    // 卸货地，XX省-XX市-XX区
    /**
     * @var string
     */
    public $deliveryPlace;

    // 装货地，XX省-XX市-XX区
    /**
     * @var string
     */
    public $loadingPlace;

    // 所属承运平台did
    /**
     * @var string
     */
    public $platformDid;

    // 货源单创建时间
    /**
     * @var int
     */
    public $startTime;

    // 联系人电话
    /**
     * @var string
     */
    public $userPhone;

    // 货物重量，单位（吨）
    /**
     * @var string
     */
    public $weight;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'allFreight'          => 'all_freight',
        'cargoBusinessCode'   => 'cargo_business_code',
        'cargoCode'           => 'cargo_code',
        'cargoInsuranceMoney' => 'cargo_insurance_money',
        'cargoName'           => 'cargo_name',
        'cargoOrder'          => 'cargo_order',
        'cargoType'           => 'cargo_type',
        'cargoUnit'           => 'cargo_unit',
        'cargoVolume'         => 'cargo_volume',
        'consignorDid'        => 'consignor_did',
        'deliveryPlace'       => 'delivery_place',
        'loadingPlace'        => 'loading_place',
        'platformDid'         => 'platform_did',
        'startTime'           => 'start_time',
        'userPhone'           => 'user_phone',
        'weight'              => 'weight',
    ];

    public function validate()
    {
        Model::validateRequired('allFreight', $this->allFreight, true);
        Model::validateRequired('cargoName', $this->cargoName, true);
        Model::validateRequired('cargoOrder', $this->cargoOrder, true);
        Model::validateRequired('cargoType', $this->cargoType, true);
        Model::validateRequired('consignorDid', $this->consignorDid, true);
        Model::validateRequired('deliveryPlace', $this->deliveryPlace, true);
        Model::validateRequired('loadingPlace', $this->loadingPlace, true);
        Model::validateRequired('platformDid', $this->platformDid, true);
        Model::validateRequired('startTime', $this->startTime, true);
        Model::validateRequired('weight', $this->weight, true);
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
        if (null !== $this->allFreight) {
            $res['all_freight'] = $this->allFreight;
        }
        if (null !== $this->cargoBusinessCode) {
            $res['cargo_business_code'] = $this->cargoBusinessCode;
        }
        if (null !== $this->cargoCode) {
            $res['cargo_code'] = $this->cargoCode;
        }
        if (null !== $this->cargoInsuranceMoney) {
            $res['cargo_insurance_money'] = $this->cargoInsuranceMoney;
        }
        if (null !== $this->cargoName) {
            $res['cargo_name'] = $this->cargoName;
        }
        if (null !== $this->cargoOrder) {
            $res['cargo_order'] = $this->cargoOrder;
        }
        if (null !== $this->cargoType) {
            $res['cargo_type'] = $this->cargoType;
        }
        if (null !== $this->cargoUnit) {
            $res['cargo_unit'] = $this->cargoUnit;
        }
        if (null !== $this->cargoVolume) {
            $res['cargo_volume'] = $this->cargoVolume;
        }
        if (null !== $this->consignorDid) {
            $res['consignor_did'] = $this->consignorDid;
        }
        if (null !== $this->deliveryPlace) {
            $res['delivery_place'] = $this->deliveryPlace;
        }
        if (null !== $this->loadingPlace) {
            $res['loading_place'] = $this->loadingPlace;
        }
        if (null !== $this->platformDid) {
            $res['platform_did'] = $this->platformDid;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }
        if (null !== $this->userPhone) {
            $res['user_phone'] = $this->userPhone;
        }
        if (null !== $this->weight) {
            $res['weight'] = $this->weight;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateCargoOrderRequest
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
        if (isset($map['all_freight'])) {
            $model->allFreight = $map['all_freight'];
        }
        if (isset($map['cargo_business_code'])) {
            $model->cargoBusinessCode = $map['cargo_business_code'];
        }
        if (isset($map['cargo_code'])) {
            $model->cargoCode = $map['cargo_code'];
        }
        if (isset($map['cargo_insurance_money'])) {
            $model->cargoInsuranceMoney = $map['cargo_insurance_money'];
        }
        if (isset($map['cargo_name'])) {
            $model->cargoName = $map['cargo_name'];
        }
        if (isset($map['cargo_order'])) {
            $model->cargoOrder = $map['cargo_order'];
        }
        if (isset($map['cargo_type'])) {
            $model->cargoType = $map['cargo_type'];
        }
        if (isset($map['cargo_unit'])) {
            $model->cargoUnit = $map['cargo_unit'];
        }
        if (isset($map['cargo_volume'])) {
            $model->cargoVolume = $map['cargo_volume'];
        }
        if (isset($map['consignor_did'])) {
            $model->consignorDid = $map['consignor_did'];
        }
        if (isset($map['delivery_place'])) {
            $model->deliveryPlace = $map['delivery_place'];
        }
        if (isset($map['loading_place'])) {
            $model->loadingPlace = $map['loading_place'];
        }
        if (isset($map['platform_did'])) {
            $model->platformDid = $map['platform_did'];
        }
        if (isset($map['start_time'])) {
            $model->startTime = $map['start_time'];
        }
        if (isset($map['user_phone'])) {
            $model->userPhone = $map['user_phone'];
        }
        if (isset($map['weight'])) {
            $model->weight = $map['weight'];
        }

        return $model;
    }
}
