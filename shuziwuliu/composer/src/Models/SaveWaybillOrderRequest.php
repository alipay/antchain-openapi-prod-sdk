<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class SaveWaybillOrderRequest extends Model
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

    // 链上账号 与司机did 二选一填写
    //
    /**
     * @var string
     */
    public $accountId;

    // 运费，单位（元），平台支付给司机的运费
    /**
     * @var string
     */
    public $allFreight;

    // 回单押金
    //
    /**
     * @var string
     */
    public $backFee;

    // 业务类型
    /**
     * @var string
     */
    public $businessType;

    // 货物行业编码
    //
    /**
     * @var string
     */
    public $cargoBusinessCode;

    // 货物商品编码
    //
    /**
     * @var string
     */
    public $cargoCode;

    // 货物运费险
    //
    /**
     * @var string
     */
    public $cargoInsuranceMoney;

    // 货源单号
    //
    /**
     * @var string
     */
    public $cargoOrder;

    // 货物单位
    //
    /**
     * @var string
     */
    public $cargoUnit;

    // 货物体积，单位（方）
    //
    /**
     * @var string
     */
    public $cargoVolume;

    // 货物重量，单位（吨）
    /**
     * @var string
     */
    public $cargoWeight;

    // 车牌颜色，黄色、蓝色、绿色
    /**
     * @var string
     */
    public $cartBadgeColor;

    // 车牌号
    //
    /**
     * @var string
     */
    public $cartBadgeNo;

    // 承运商did
    /**
     * @var string
     */
    public $carCaptainDid;

    // 货主运费金额，货主支付给平台的运费
    //
    /**
     * @var string
     */
    public $consignorFreightAmount;

    // 建单时间，13位毫秒级时间戳
    /**
     * @var int
     */
    public $createdTime;

    // 到达门点时间，13位毫秒级时间戳
    /**
     * @var int
     */
    public $destDoorsEndTime;

    // 门点城市CODE，6位区域行政编码
    /**
     * @var string
     */
    public $doorsCityCode;

    // 门点城市名称
    /**
     * @var string
     */
    public $doorsCityName;

    // 门点区县CODE，6位区域行政编码
    /**
     * @var string
     */
    public $doorsCountyCode;

    // 门点区县名称
    /**
     * @var string
     */
    public $doorsCountyName;

    // 门点行政区划代码，12位区域行政编码（长途运输须准确提供前6位，如不能提供后6位可补0；短途运输须准确提供12位）
    /**
     * @var string
     */
    public $doorsDivisionCode;

    // 门点省份CODE，6位区域行政编码
    /**
     * @var string
     */
    public $doorsProvinceCode;

    // 门点省份名称
    /**
     * @var string
     */
    public $doorsProvinceName;

    // 发货方名称
    //
    /**
     * @var string
     */
    public $drawee;

    // 发货方纳税人识别号
    //
    /**
     * @var string
     */
    public $draweeTaxNo;

    // 司机分布式数字身份
    //
    /**
     * @var string
     */
    public $driverDid;

    // 司机姓名 已填司机分布式身份的情况下可不填
    //
    /**
     * @var string
     */
    public $driverName;

    // 目的地详细地址
    /**
     * @var string
     */
    public $endAddress;

    // 目的地城市CODE，6位区域行政编码
    //
    /**
     * @var string
     */
    public $endCityCode;

    // 目的地城市名称
    //
    /**
     * @var string
     */
    public $endCityName;

    // 目的地区县CODE，6位区域行政编码
    /**
     * @var string
     */
    public $endCountyCode;

    // 目的地区县名称
    //
    /**
     * @var string
     */
    public $endCountyName;

    // 结束行政区划代码（长途运输须准确提供前6位，如不能提供后6位可补0；短途运输须准确提供12位）
    //
    /**
     * @var string
     */
    public $endDivisionCode;

    // 目的地省份CODE，6位区域行政编码
    /**
     * @var string
     */
    public $endProvinceCode;

    // 目的地省份名称
    //
    /**
     * @var string
     */
    public $endProvinceName;

    // 目的地街道CODE，12位区域行政编码
    /**
     * @var string
     */
    public $endStreetCode;

    // 目的地街道名称
    /**
     * @var string
     */
    public $endStreetName;

    // 运达时间，13位毫秒级时间戳
    /**
     * @var int
     */
    public $endTime;

    // 运费增项
    //
    /**
     * @var string
     */
    public $freightIncr;

    // 货物数量
    //
    /**
     * @var string
     */
    public $goodsAmount;

    // 货物数量单位类型
    //
    /**
     * @var string
     */
    public $goodsAmountType;

    // 货物名称
    //
    /**
     * @var string
     */
    public $goodsName;

    // 司机身份证号 已填司机分布式身份的情况下可不填
    //
    /**
     * @var string
     */
    public $idCard;

    // 运费扣减
    //
    /**
     * @var string
     */
    public $lossFee;

    // 司机手机号 已填司机分布式身份的情况下可不填
    //
    /**
     * @var string
     */
    public $mobileNo;

    // 系统识别id 网商识别号
    //
    /**
     * @var string
     */
    public $partnerId;

    // 是否进行资金验证
    //
    /**
     * @var bool
     */
    public $payCheck;

    // 无车承运平台分布式数字身份，缺省时为自己的分布式数字身份
    //
    /**
     * @var string
     */
    public $platformDid;

    // 预付款金额
    //
    /**
     * @var string
     */
    public $prepayments;

    // 线下预付ETC
    //
    /**
     * @var string
     */
    public $prepaymentsBuyEtc;

    // 线下气款金额
    //
    /**
     * @var string
     */
    public $prepaymentsBuyGas;

    // 线下油款预付
    //
    /**
     * @var string
     */
    public $prepaymentsBuyOil;

    // 预付ETC卡金额
    //
    /**
     * @var string
     */
    public $prepaymentsEtccard;

    // 预付油卡金额
    //
    /**
     * @var string
     */
    public $prepaymentsOilcard;

    // 油卡赠送金额
    //
    /**
     * @var string
     */
    public $presentAmountOil;

    // 起始地详细地址
    /**
     * @var string
     */
    public $startAddress;

    // 起始地城市CODE，6位区域行政编码
    //
    /**
     * @var string
     */
    public $startCityCode;

    // 起始地城市名称
    //
    /**
     * @var string
     */
    public $startCityName;

    // 起始地区县CODE，6位区域行政编码
    //
    //
    /**
     * @var string
     */
    public $startCountyCode;

    // 起始地区县名称
    //
    /**
     * @var string
     */
    public $startCountyName;

    // 起始行政区划代码（长途运输须准确提供前6位，如不能提供后6位可补0；短途运输须准确提供12位）
    //
    /**
     * @var string
     */
    public $startDivisionCode;

    // 起始地省份CODE，6位区域行政编码
    //
    //
    /**
     * @var string
     */
    public $startProvinceCode;

    // 起始地省份名称
    //
    /**
     * @var string
     */
    public $startProvinceName;

    // 起始地街道CODE，12位区域行政编码
    /**
     * @var string
     */
    public $startStreetCode;

    // 起始地街道名称
    /**
     * @var string
     */
    public $startStreetName;

    // 起运时间，13位毫秒级时间戳
    /**
     * @var int
     */
    public $startTime;

    // 运单ID
    //
    /**
     * @var string
     */
    public $taxWaybillId;

    // 车长，可以填：不限车长或者1.8，2.7，3.8，4.2，5，6.2，6.8，7.7，8.2，8.7，9.6，11.7，12.5，13，13.7，15，16，17.5等不超过2位小数的数字
    /**
     * @var string
     */
    public $truckLength;

    // 车型
    /**
     * @var string
     */
    public $truckType;

    // 运输单价
    //
    /**
     * @var string
     */
    public $unitPrice;
    protected $_name = [
        'authToken'              => 'auth_token',
        'productInstanceId'      => 'product_instance_id',
        'accountId'              => 'account_id',
        'allFreight'             => 'all_freight',
        'backFee'                => 'back_fee',
        'businessType'           => 'business_type',
        'cargoBusinessCode'      => 'cargo_business_code',
        'cargoCode'              => 'cargo_code',
        'cargoInsuranceMoney'    => 'cargo_insurance_money',
        'cargoOrder'             => 'cargo_order',
        'cargoUnit'              => 'cargo_unit',
        'cargoVolume'            => 'cargo_volume',
        'cargoWeight'            => 'cargo_weight',
        'cartBadgeColor'         => 'cart_badge_color',
        'cartBadgeNo'            => 'cart_badge_no',
        'carCaptainDid'          => 'car_captain_did',
        'consignorFreightAmount' => 'consignor_freight_amount',
        'createdTime'            => 'created_time',
        'destDoorsEndTime'       => 'dest_doors_end_time',
        'doorsCityCode'          => 'doors_city_code',
        'doorsCityName'          => 'doors_city_name',
        'doorsCountyCode'        => 'doors_county_code',
        'doorsCountyName'        => 'doors_county_name',
        'doorsDivisionCode'      => 'doors_division_code',
        'doorsProvinceCode'      => 'doors_province_code',
        'doorsProvinceName'      => 'doors_province_name',
        'drawee'                 => 'drawee',
        'draweeTaxNo'            => 'drawee_tax_no',
        'driverDid'              => 'driver_did',
        'driverName'             => 'driver_name',
        'endAddress'             => 'end_address',
        'endCityCode'            => 'end_city_code',
        'endCityName'            => 'end_city_name',
        'endCountyCode'          => 'end_county_code',
        'endCountyName'          => 'end_county_name',
        'endDivisionCode'        => 'end_division_code',
        'endProvinceCode'        => 'end_province_code',
        'endProvinceName'        => 'end_province_name',
        'endStreetCode'          => 'end_street_code',
        'endStreetName'          => 'end_street_name',
        'endTime'                => 'end_time',
        'freightIncr'            => 'freight_incr',
        'goodsAmount'            => 'goods_amount',
        'goodsAmountType'        => 'goods_amount_type',
        'goodsName'              => 'goods_name',
        'idCard'                 => 'id_card',
        'lossFee'                => 'loss_fee',
        'mobileNo'               => 'mobile_no',
        'partnerId'              => 'partner_id',
        'payCheck'               => 'pay_check',
        'platformDid'            => 'platform_did',
        'prepayments'            => 'prepayments',
        'prepaymentsBuyEtc'      => 'prepayments_buy_etc',
        'prepaymentsBuyGas'      => 'prepayments_buy_gas',
        'prepaymentsBuyOil'      => 'prepayments_buy_oil',
        'prepaymentsEtccard'     => 'prepayments_etccard',
        'prepaymentsOilcard'     => 'prepayments_oilcard',
        'presentAmountOil'       => 'present_amount_oil',
        'startAddress'           => 'start_address',
        'startCityCode'          => 'start_city_code',
        'startCityName'          => 'start_city_name',
        'startCountyCode'        => 'start_county_code',
        'startCountyName'        => 'start_county_name',
        'startDivisionCode'      => 'start_division_code',
        'startProvinceCode'      => 'start_province_code',
        'startProvinceName'      => 'start_province_name',
        'startStreetCode'        => 'start_street_code',
        'startStreetName'        => 'start_street_name',
        'startTime'              => 'start_time',
        'taxWaybillId'           => 'tax_waybill_id',
        'truckLength'            => 'truck_length',
        'truckType'              => 'truck_type',
        'unitPrice'              => 'unit_price',
    ];

    public function validate()
    {
        Model::validateRequired('allFreight', $this->allFreight, true);
        Model::validateRequired('cartBadgeColor', $this->cartBadgeColor, true);
        Model::validateRequired('cartBadgeNo', $this->cartBadgeNo, true);
        Model::validateRequired('consignorFreightAmount', $this->consignorFreightAmount, true);
        Model::validateRequired('createdTime', $this->createdTime, true);
        Model::validateRequired('drawee', $this->drawee, true);
        Model::validateRequired('draweeTaxNo', $this->draweeTaxNo, true);
        Model::validateRequired('driverDid', $this->driverDid, true);
        Model::validateRequired('endCityCode', $this->endCityCode, true);
        Model::validateRequired('endCityName', $this->endCityName, true);
        Model::validateRequired('endDivisionCode', $this->endDivisionCode, true);
        Model::validateRequired('endProvinceCode', $this->endProvinceCode, true);
        Model::validateRequired('endProvinceName', $this->endProvinceName, true);
        Model::validateRequired('endTime', $this->endTime, true);
        Model::validateRequired('goodsName', $this->goodsName, true);
        Model::validateRequired('platformDid', $this->platformDid, true);
        Model::validateRequired('startCityCode', $this->startCityCode, true);
        Model::validateRequired('startCityName', $this->startCityName, true);
        Model::validateRequired('startDivisionCode', $this->startDivisionCode, true);
        Model::validateRequired('startProvinceCode', $this->startProvinceCode, true);
        Model::validateRequired('startProvinceName', $this->startProvinceName, true);
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
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
        }
        if (null !== $this->allFreight) {
            $res['all_freight'] = $this->allFreight;
        }
        if (null !== $this->backFee) {
            $res['back_fee'] = $this->backFee;
        }
        if (null !== $this->businessType) {
            $res['business_type'] = $this->businessType;
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
        if (null !== $this->cargoOrder) {
            $res['cargo_order'] = $this->cargoOrder;
        }
        if (null !== $this->cargoUnit) {
            $res['cargo_unit'] = $this->cargoUnit;
        }
        if (null !== $this->cargoVolume) {
            $res['cargo_volume'] = $this->cargoVolume;
        }
        if (null !== $this->cargoWeight) {
            $res['cargo_weight'] = $this->cargoWeight;
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
        if (null !== $this->consignorFreightAmount) {
            $res['consignor_freight_amount'] = $this->consignorFreightAmount;
        }
        if (null !== $this->createdTime) {
            $res['created_time'] = $this->createdTime;
        }
        if (null !== $this->destDoorsEndTime) {
            $res['dest_doors_end_time'] = $this->destDoorsEndTime;
        }
        if (null !== $this->doorsCityCode) {
            $res['doors_city_code'] = $this->doorsCityCode;
        }
        if (null !== $this->doorsCityName) {
            $res['doors_city_name'] = $this->doorsCityName;
        }
        if (null !== $this->doorsCountyCode) {
            $res['doors_county_code'] = $this->doorsCountyCode;
        }
        if (null !== $this->doorsCountyName) {
            $res['doors_county_name'] = $this->doorsCountyName;
        }
        if (null !== $this->doorsDivisionCode) {
            $res['doors_division_code'] = $this->doorsDivisionCode;
        }
        if (null !== $this->doorsProvinceCode) {
            $res['doors_province_code'] = $this->doorsProvinceCode;
        }
        if (null !== $this->doorsProvinceName) {
            $res['doors_province_name'] = $this->doorsProvinceName;
        }
        if (null !== $this->drawee) {
            $res['drawee'] = $this->drawee;
        }
        if (null !== $this->draweeTaxNo) {
            $res['drawee_tax_no'] = $this->draweeTaxNo;
        }
        if (null !== $this->driverDid) {
            $res['driver_did'] = $this->driverDid;
        }
        if (null !== $this->driverName) {
            $res['driver_name'] = $this->driverName;
        }
        if (null !== $this->endAddress) {
            $res['end_address'] = $this->endAddress;
        }
        if (null !== $this->endCityCode) {
            $res['end_city_code'] = $this->endCityCode;
        }
        if (null !== $this->endCityName) {
            $res['end_city_name'] = $this->endCityName;
        }
        if (null !== $this->endCountyCode) {
            $res['end_county_code'] = $this->endCountyCode;
        }
        if (null !== $this->endCountyName) {
            $res['end_county_name'] = $this->endCountyName;
        }
        if (null !== $this->endDivisionCode) {
            $res['end_division_code'] = $this->endDivisionCode;
        }
        if (null !== $this->endProvinceCode) {
            $res['end_province_code'] = $this->endProvinceCode;
        }
        if (null !== $this->endProvinceName) {
            $res['end_province_name'] = $this->endProvinceName;
        }
        if (null !== $this->endStreetCode) {
            $res['end_street_code'] = $this->endStreetCode;
        }
        if (null !== $this->endStreetName) {
            $res['end_street_name'] = $this->endStreetName;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        if (null !== $this->freightIncr) {
            $res['freight_incr'] = $this->freightIncr;
        }
        if (null !== $this->goodsAmount) {
            $res['goods_amount'] = $this->goodsAmount;
        }
        if (null !== $this->goodsAmountType) {
            $res['goods_amount_type'] = $this->goodsAmountType;
        }
        if (null !== $this->goodsName) {
            $res['goods_name'] = $this->goodsName;
        }
        if (null !== $this->idCard) {
            $res['id_card'] = $this->idCard;
        }
        if (null !== $this->lossFee) {
            $res['loss_fee'] = $this->lossFee;
        }
        if (null !== $this->mobileNo) {
            $res['mobile_no'] = $this->mobileNo;
        }
        if (null !== $this->partnerId) {
            $res['partner_id'] = $this->partnerId;
        }
        if (null !== $this->payCheck) {
            $res['pay_check'] = $this->payCheck;
        }
        if (null !== $this->platformDid) {
            $res['platform_did'] = $this->platformDid;
        }
        if (null !== $this->prepayments) {
            $res['prepayments'] = $this->prepayments;
        }
        if (null !== $this->prepaymentsBuyEtc) {
            $res['prepayments_buy_etc'] = $this->prepaymentsBuyEtc;
        }
        if (null !== $this->prepaymentsBuyGas) {
            $res['prepayments_buy_gas'] = $this->prepaymentsBuyGas;
        }
        if (null !== $this->prepaymentsBuyOil) {
            $res['prepayments_buy_oil'] = $this->prepaymentsBuyOil;
        }
        if (null !== $this->prepaymentsEtccard) {
            $res['prepayments_etccard'] = $this->prepaymentsEtccard;
        }
        if (null !== $this->prepaymentsOilcard) {
            $res['prepayments_oilcard'] = $this->prepaymentsOilcard;
        }
        if (null !== $this->presentAmountOil) {
            $res['present_amount_oil'] = $this->presentAmountOil;
        }
        if (null !== $this->startAddress) {
            $res['start_address'] = $this->startAddress;
        }
        if (null !== $this->startCityCode) {
            $res['start_city_code'] = $this->startCityCode;
        }
        if (null !== $this->startCityName) {
            $res['start_city_name'] = $this->startCityName;
        }
        if (null !== $this->startCountyCode) {
            $res['start_county_code'] = $this->startCountyCode;
        }
        if (null !== $this->startCountyName) {
            $res['start_county_name'] = $this->startCountyName;
        }
        if (null !== $this->startDivisionCode) {
            $res['start_division_code'] = $this->startDivisionCode;
        }
        if (null !== $this->startProvinceCode) {
            $res['start_province_code'] = $this->startProvinceCode;
        }
        if (null !== $this->startProvinceName) {
            $res['start_province_name'] = $this->startProvinceName;
        }
        if (null !== $this->startStreetCode) {
            $res['start_street_code'] = $this->startStreetCode;
        }
        if (null !== $this->startStreetName) {
            $res['start_street_name'] = $this->startStreetName;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }
        if (null !== $this->taxWaybillId) {
            $res['tax_waybill_id'] = $this->taxWaybillId;
        }
        if (null !== $this->truckLength) {
            $res['truck_length'] = $this->truckLength;
        }
        if (null !== $this->truckType) {
            $res['truck_type'] = $this->truckType;
        }
        if (null !== $this->unitPrice) {
            $res['unit_price'] = $this->unitPrice;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SaveWaybillOrderRequest
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
        if (isset($map['account_id'])) {
            $model->accountId = $map['account_id'];
        }
        if (isset($map['all_freight'])) {
            $model->allFreight = $map['all_freight'];
        }
        if (isset($map['back_fee'])) {
            $model->backFee = $map['back_fee'];
        }
        if (isset($map['business_type'])) {
            $model->businessType = $map['business_type'];
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
        if (isset($map['cargo_order'])) {
            $model->cargoOrder = $map['cargo_order'];
        }
        if (isset($map['cargo_unit'])) {
            $model->cargoUnit = $map['cargo_unit'];
        }
        if (isset($map['cargo_volume'])) {
            $model->cargoVolume = $map['cargo_volume'];
        }
        if (isset($map['cargo_weight'])) {
            $model->cargoWeight = $map['cargo_weight'];
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
        if (isset($map['consignor_freight_amount'])) {
            $model->consignorFreightAmount = $map['consignor_freight_amount'];
        }
        if (isset($map['created_time'])) {
            $model->createdTime = $map['created_time'];
        }
        if (isset($map['dest_doors_end_time'])) {
            $model->destDoorsEndTime = $map['dest_doors_end_time'];
        }
        if (isset($map['doors_city_code'])) {
            $model->doorsCityCode = $map['doors_city_code'];
        }
        if (isset($map['doors_city_name'])) {
            $model->doorsCityName = $map['doors_city_name'];
        }
        if (isset($map['doors_county_code'])) {
            $model->doorsCountyCode = $map['doors_county_code'];
        }
        if (isset($map['doors_county_name'])) {
            $model->doorsCountyName = $map['doors_county_name'];
        }
        if (isset($map['doors_division_code'])) {
            $model->doorsDivisionCode = $map['doors_division_code'];
        }
        if (isset($map['doors_province_code'])) {
            $model->doorsProvinceCode = $map['doors_province_code'];
        }
        if (isset($map['doors_province_name'])) {
            $model->doorsProvinceName = $map['doors_province_name'];
        }
        if (isset($map['drawee'])) {
            $model->drawee = $map['drawee'];
        }
        if (isset($map['drawee_tax_no'])) {
            $model->draweeTaxNo = $map['drawee_tax_no'];
        }
        if (isset($map['driver_did'])) {
            $model->driverDid = $map['driver_did'];
        }
        if (isset($map['driver_name'])) {
            $model->driverName = $map['driver_name'];
        }
        if (isset($map['end_address'])) {
            $model->endAddress = $map['end_address'];
        }
        if (isset($map['end_city_code'])) {
            $model->endCityCode = $map['end_city_code'];
        }
        if (isset($map['end_city_name'])) {
            $model->endCityName = $map['end_city_name'];
        }
        if (isset($map['end_county_code'])) {
            $model->endCountyCode = $map['end_county_code'];
        }
        if (isset($map['end_county_name'])) {
            $model->endCountyName = $map['end_county_name'];
        }
        if (isset($map['end_division_code'])) {
            $model->endDivisionCode = $map['end_division_code'];
        }
        if (isset($map['end_province_code'])) {
            $model->endProvinceCode = $map['end_province_code'];
        }
        if (isset($map['end_province_name'])) {
            $model->endProvinceName = $map['end_province_name'];
        }
        if (isset($map['end_street_code'])) {
            $model->endStreetCode = $map['end_street_code'];
        }
        if (isset($map['end_street_name'])) {
            $model->endStreetName = $map['end_street_name'];
        }
        if (isset($map['end_time'])) {
            $model->endTime = $map['end_time'];
        }
        if (isset($map['freight_incr'])) {
            $model->freightIncr = $map['freight_incr'];
        }
        if (isset($map['goods_amount'])) {
            $model->goodsAmount = $map['goods_amount'];
        }
        if (isset($map['goods_amount_type'])) {
            $model->goodsAmountType = $map['goods_amount_type'];
        }
        if (isset($map['goods_name'])) {
            $model->goodsName = $map['goods_name'];
        }
        if (isset($map['id_card'])) {
            $model->idCard = $map['id_card'];
        }
        if (isset($map['loss_fee'])) {
            $model->lossFee = $map['loss_fee'];
        }
        if (isset($map['mobile_no'])) {
            $model->mobileNo = $map['mobile_no'];
        }
        if (isset($map['partner_id'])) {
            $model->partnerId = $map['partner_id'];
        }
        if (isset($map['pay_check'])) {
            $model->payCheck = $map['pay_check'];
        }
        if (isset($map['platform_did'])) {
            $model->platformDid = $map['platform_did'];
        }
        if (isset($map['prepayments'])) {
            $model->prepayments = $map['prepayments'];
        }
        if (isset($map['prepayments_buy_etc'])) {
            $model->prepaymentsBuyEtc = $map['prepayments_buy_etc'];
        }
        if (isset($map['prepayments_buy_gas'])) {
            $model->prepaymentsBuyGas = $map['prepayments_buy_gas'];
        }
        if (isset($map['prepayments_buy_oil'])) {
            $model->prepaymentsBuyOil = $map['prepayments_buy_oil'];
        }
        if (isset($map['prepayments_etccard'])) {
            $model->prepaymentsEtccard = $map['prepayments_etccard'];
        }
        if (isset($map['prepayments_oilcard'])) {
            $model->prepaymentsOilcard = $map['prepayments_oilcard'];
        }
        if (isset($map['present_amount_oil'])) {
            $model->presentAmountOil = $map['present_amount_oil'];
        }
        if (isset($map['start_address'])) {
            $model->startAddress = $map['start_address'];
        }
        if (isset($map['start_city_code'])) {
            $model->startCityCode = $map['start_city_code'];
        }
        if (isset($map['start_city_name'])) {
            $model->startCityName = $map['start_city_name'];
        }
        if (isset($map['start_county_code'])) {
            $model->startCountyCode = $map['start_county_code'];
        }
        if (isset($map['start_county_name'])) {
            $model->startCountyName = $map['start_county_name'];
        }
        if (isset($map['start_division_code'])) {
            $model->startDivisionCode = $map['start_division_code'];
        }
        if (isset($map['start_province_code'])) {
            $model->startProvinceCode = $map['start_province_code'];
        }
        if (isset($map['start_province_name'])) {
            $model->startProvinceName = $map['start_province_name'];
        }
        if (isset($map['start_street_code'])) {
            $model->startStreetCode = $map['start_street_code'];
        }
        if (isset($map['start_street_name'])) {
            $model->startStreetName = $map['start_street_name'];
        }
        if (isset($map['start_time'])) {
            $model->startTime = $map['start_time'];
        }
        if (isset($map['tax_waybill_id'])) {
            $model->taxWaybillId = $map['tax_waybill_id'];
        }
        if (isset($map['truck_length'])) {
            $model->truckLength = $map['truck_length'];
        }
        if (isset($map['truck_type'])) {
            $model->truckType = $map['truck_type'];
        }
        if (isset($map['unit_price'])) {
            $model->unitPrice = $map['unit_price'];
        }

        return $model;
    }
}
