<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class UpdateTransportWaybillRequest extends Model
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

    // 运费，3pl支付给下承运商的运费金额，单位（元），要求格式为不超过二位小数
    /**
     * @var string
     */
    public $allFreight;

    // 货物名称
    /**
     * @var string
     */
    public $cargoName;

    // 单位（方），货物体积
    /**
     * @var string
     */
    public $cargoVolume;

    // 单位（吨），货物重量
    /**
     * @var string
     */
    public $cargoWeight;

    // 下游承运商did，一般为下一级承运商数字身份
    /**
     * @var string
     */
    public $carrierDid;

    // 车牌颜色，需填写黄色、蓝色、绿色中的一种
    /**
     * @var string
     */
    public $carBadgeColor;

    // 车牌号，承运车牌号
    /**
     * @var string
     */
    public $carBadgeNo;

    // 货主did，一般为合同甲方的链上数字身份
    /**
     * @var string
     */
    public $consignorDid;

    // 创建时间，13位毫秒级时间戳
    /**
     * @var int
     */
    public $createTime;

    // 实际承运司机did，实际承运司机的链上数字身份
    /**
     * @var string
     */
    public $driverDid;

    // 目的地省市区，要求格式 XX省-XX市-XX区，比如四川省-成都市-青白江区
    /**
     * @var string
     */
    public $endAddress;

    // 目的地详细地址，街道村社区道路楼宇门牌号
    /**
     * @var string
     */
    public $endDetailedAddress;

    // 到达时间，13位毫秒级时间戳
    /**
     * @var int
     */
    public $endTime;

    // 货物数量
    /**
     * @var int
     */
    public $goodsAmount;

    // 货物数量单位类型
    /**
     * @var string
     */
    public $goodsAmountType;

    // 起始地省市区，要求格式 XX省-XX市-XX区。比如浙江省-杭州市-余杭区
    /**
     * @var string
     */
    public $startAddress;

    // 起始地详细地址，街道村社区道路楼宇门牌号
    /**
     * @var string
     */
    public $startDetailedAddress;

    // 起运时间，13位毫秒级时间戳
    /**
     * @var int
     */
    public $startTime;

    // 客户系统内运单编号
    /**
     * @var string
     */
    public $taxWaybillId;

    // 3plDid，一般为合同乙方的链上数字身份
    /**
     * @var string
     */
    public $thirdPartyLogisticsDid;

    // 所属合同编号
    /**
     * @var string
     */
    public $transportContractCode;

    // 所属运输线路编码
    /**
     * @var string
     */
    public $transportRouteCode;

    // 托盘方did
    /**
     * @var string
     */
    public $palletDid;
    protected $_name = [
        'authToken'              => 'auth_token',
        'productInstanceId'      => 'product_instance_id',
        'allFreight'             => 'all_freight',
        'cargoName'              => 'cargo_name',
        'cargoVolume'            => 'cargo_volume',
        'cargoWeight'            => 'cargo_weight',
        'carrierDid'             => 'carrier_did',
        'carBadgeColor'          => 'car_badge_color',
        'carBadgeNo'             => 'car_badge_no',
        'consignorDid'           => 'consignor_did',
        'createTime'             => 'create_time',
        'driverDid'              => 'driver_did',
        'endAddress'             => 'end_address',
        'endDetailedAddress'     => 'end_detailed_address',
        'endTime'                => 'end_time',
        'goodsAmount'            => 'goods_amount',
        'goodsAmountType'        => 'goods_amount_type',
        'startAddress'           => 'start_address',
        'startDetailedAddress'   => 'start_detailed_address',
        'startTime'              => 'start_time',
        'taxWaybillId'           => 'tax_waybill_id',
        'thirdPartyLogisticsDid' => 'third_party_logistics_did',
        'transportContractCode'  => 'transport_contract_code',
        'transportRouteCode'     => 'transport_route_code',
        'palletDid'              => 'pallet_did',
    ];

    public function validate()
    {
        Model::validateRequired('taxWaybillId', $this->taxWaybillId, true);
        Model::validateRequired('thirdPartyLogisticsDid', $this->thirdPartyLogisticsDid, true);
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
        if (null !== $this->cargoName) {
            $res['cargo_name'] = $this->cargoName;
        }
        if (null !== $this->cargoVolume) {
            $res['cargo_volume'] = $this->cargoVolume;
        }
        if (null !== $this->cargoWeight) {
            $res['cargo_weight'] = $this->cargoWeight;
        }
        if (null !== $this->carrierDid) {
            $res['carrier_did'] = $this->carrierDid;
        }
        if (null !== $this->carBadgeColor) {
            $res['car_badge_color'] = $this->carBadgeColor;
        }
        if (null !== $this->carBadgeNo) {
            $res['car_badge_no'] = $this->carBadgeNo;
        }
        if (null !== $this->consignorDid) {
            $res['consignor_did'] = $this->consignorDid;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->driverDid) {
            $res['driver_did'] = $this->driverDid;
        }
        if (null !== $this->endAddress) {
            $res['end_address'] = $this->endAddress;
        }
        if (null !== $this->endDetailedAddress) {
            $res['end_detailed_address'] = $this->endDetailedAddress;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        if (null !== $this->goodsAmount) {
            $res['goods_amount'] = $this->goodsAmount;
        }
        if (null !== $this->goodsAmountType) {
            $res['goods_amount_type'] = $this->goodsAmountType;
        }
        if (null !== $this->startAddress) {
            $res['start_address'] = $this->startAddress;
        }
        if (null !== $this->startDetailedAddress) {
            $res['start_detailed_address'] = $this->startDetailedAddress;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }
        if (null !== $this->taxWaybillId) {
            $res['tax_waybill_id'] = $this->taxWaybillId;
        }
        if (null !== $this->thirdPartyLogisticsDid) {
            $res['third_party_logistics_did'] = $this->thirdPartyLogisticsDid;
        }
        if (null !== $this->transportContractCode) {
            $res['transport_contract_code'] = $this->transportContractCode;
        }
        if (null !== $this->transportRouteCode) {
            $res['transport_route_code'] = $this->transportRouteCode;
        }
        if (null !== $this->palletDid) {
            $res['pallet_did'] = $this->palletDid;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateTransportWaybillRequest
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
        if (isset($map['cargo_name'])) {
            $model->cargoName = $map['cargo_name'];
        }
        if (isset($map['cargo_volume'])) {
            $model->cargoVolume = $map['cargo_volume'];
        }
        if (isset($map['cargo_weight'])) {
            $model->cargoWeight = $map['cargo_weight'];
        }
        if (isset($map['carrier_did'])) {
            $model->carrierDid = $map['carrier_did'];
        }
        if (isset($map['car_badge_color'])) {
            $model->carBadgeColor = $map['car_badge_color'];
        }
        if (isset($map['car_badge_no'])) {
            $model->carBadgeNo = $map['car_badge_no'];
        }
        if (isset($map['consignor_did'])) {
            $model->consignorDid = $map['consignor_did'];
        }
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }
        if (isset($map['driver_did'])) {
            $model->driverDid = $map['driver_did'];
        }
        if (isset($map['end_address'])) {
            $model->endAddress = $map['end_address'];
        }
        if (isset($map['end_detailed_address'])) {
            $model->endDetailedAddress = $map['end_detailed_address'];
        }
        if (isset($map['end_time'])) {
            $model->endTime = $map['end_time'];
        }
        if (isset($map['goods_amount'])) {
            $model->goodsAmount = $map['goods_amount'];
        }
        if (isset($map['goods_amount_type'])) {
            $model->goodsAmountType = $map['goods_amount_type'];
        }
        if (isset($map['start_address'])) {
            $model->startAddress = $map['start_address'];
        }
        if (isset($map['start_detailed_address'])) {
            $model->startDetailedAddress = $map['start_detailed_address'];
        }
        if (isset($map['start_time'])) {
            $model->startTime = $map['start_time'];
        }
        if (isset($map['tax_waybill_id'])) {
            $model->taxWaybillId = $map['tax_waybill_id'];
        }
        if (isset($map['third_party_logistics_did'])) {
            $model->thirdPartyLogisticsDid = $map['third_party_logistics_did'];
        }
        if (isset($map['transport_contract_code'])) {
            $model->transportContractCode = $map['transport_contract_code'];
        }
        if (isset($map['transport_route_code'])) {
            $model->transportRouteCode = $map['transport_route_code'];
        }
        if (isset($map['pallet_did'])) {
            $model->palletDid = $map['pallet_did'];
        }

        return $model;
    }
}
