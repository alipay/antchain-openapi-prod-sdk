<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INSURANCE_SAAS_DE\Models;

use AlibabaCloud\Tea\Model;

class ApplyInsurglobifyprodOspiinsureRequest extends Model
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

    // 调用方生成的唯一编码，系统会根据该流水号做防重、幂等判断逻辑。当极端场景中，系统会返回处理中，错误码为2222，客户端应该保持该流水号不变，并使用原来的请求再次发送请求，系统会根据幂等逻辑返回处理结果；
    /**
     * @var string
     */
    public $tradeNo;

    // 保司编码
    /**
     * @var string
     */
    public $externalChannelCode;

    // 险种编码
    /**
     * @var string
     */
    public $externalProductCode;

    // 保险方案名
    /**
     * @var string
     */
    public $chSchemeName;

    // 保险项目名
    /**
     * @var string
     */
    public $chProjectName;

    // 总保额，小数位只支持2位
    /**
     * @var string
     */
    public $insuredAmount;

    // 保费，小数位只支持2位
    /**
     * @var string
     */
    public $premium;

    // 总保费，小数位只支持2位
    /**
     * @var string
     */
    public $totalPremium;

    // 币种，使用ISO 4217代码；
    // CNY：人民币
    // USD：美元
    // EUR：欧元
    // GBP：英镑
    // JPY：日元
    // CHF：瑞士法郎
    // SGD：新加坡元
    /**
     * @var string
     */
    public $currency;

    // 关联的大保单编号
    /**
     * @var string
     */
    public $bigPolNo;

    // 保险起期(ISO 8601格式，2026-01-11T14:30:00+02:00)
    /**
     * @var string
     */
    public $insureStart;

    // 时区
    // Asia/Shanghai
    // Europe/Berlin
    // America/New_York
    // Pacific/Auckland
    // Europe/Berlin
    /**
     * @var string
     */
    public $timeZone;

    // 投保人名称
    /**
     * @var string
     */
    public $tbrName;

    // 投保人证件类型
    // // 个人
    // // 护照
    // PASSPORT
    // // 国民身份证
    // NATIONAL_ID
    // // 居留许可
    // RESIDENCE_PERMIT
    // // 个人税号
    // TAX_ID
    // // 企业
    // // 公司注册号（最常用）
    // COMPANY_REGISTRATION
    // // 增值税号
    // VAT_NUMBER
    // // 企业税号
    // TAX_ID
    /**
     * @var string
     */
    public $tbrIdType;

    // 投保人证件号
    /**
     * @var string
     */
    public $tbrIdNo;

    // 被保人名称
    /**
     * @var string
     */
    public $bbrName;

    // 被保人证件类型
    // // 个人
    // // 护照
    // PASSPORT
    // // 国民身份证
    // NATIONAL_ID
    // // 居留许可
    // RESIDENCE_PERMIT
    // // 个人税号
    // TAX_ID
    // // 企业
    // // 公司注册号（最常用）
    // COMPANY_REGISTRATION
    // // 增值税号
    // VAT_NUMBER
    // // 企业税号
    // TAX_ID
    /**
     * @var string
     */
    public $bbrIdType;

    // 被保人证件号
    /**
     * @var string
     */
    public $bbrIdNo;

    // 订单号
    /**
     * @var string
     */
    public $relaOrderNo;

    // 寄件时间(ISO 8601格式，2026-01-11T14:30:00+02:00)
    /**
     * @var string
     */
    public $pickUpTime;

    // 快递公司名称
    /**
     * @var string
     */
    public $courierCompany;

    // 快递单号
    /**
     * @var string
     */
    public $courierNumber;

    // 货物大类
    /**
     * @var string
     */
    public $cargoType;

    // 货物总数量（件）
    /**
     * @var string
     */
    public $cargoTotalQuantity;

    // 货物总重量
    /**
     * @var string
     */
    public $cargoTotalWeight;

    // 货物总价值，小数位只支持2位
    /**
     * @var string
     */
    public $cargoTotalWorth;

    // 卖家脱敏唯一标识
    /**
     * @var string
     */
    public $sellId;

    // 卖家NAIC代码
    /**
     * @var string
     */
    public $sellNaicCode;

    // 出发地ISO国别
    /**
     * @var string
     */
    public $startPlaceIsoCountry;

    // 出发地省市
    /**
     * @var string
     */
    public $startPlaceProvinceCity;

    // 出发地详细地址
    /**
     * @var string
     */
    public $startPlace;

    // 出发地邮编
    /**
     * @var string
     */
    public $startPlacePostcode;

    // 买家脱敏唯一标识
    /**
     * @var string
     */
    public $buyId;

    // 目的地ISO国别
    /**
     * @var string
     */
    public $isoCountry;

    // 湖南省长沙市
    /**
     * @var string
     */
    public $destinationProvinceCity;

    // 目的地详细地址
    /**
     * @var string
     */
    public $destination;

    // 货物明细
    /**
     * @var CargoDetails
     */
    public $cargoDetails;
    protected $_name = [
        'authToken'               => 'auth_token',
        'productInstanceId'       => 'product_instance_id',
        'tradeNo'                 => 'trade_no',
        'externalChannelCode'     => 'external_channel_code',
        'externalProductCode'     => 'external_product_code',
        'chSchemeName'            => 'ch_scheme_name',
        'chProjectName'           => 'ch_project_name',
        'insuredAmount'           => 'insured_amount',
        'premium'                 => 'premium',
        'totalPremium'            => 'total_premium',
        'currency'                => 'currency',
        'bigPolNo'                => 'big_pol_no',
        'insureStart'             => 'insure_start',
        'timeZone'                => 'time_zone',
        'tbrName'                 => 'tbr_name',
        'tbrIdType'               => 'tbr_id_type',
        'tbrIdNo'                 => 'tbr_id_no',
        'bbrName'                 => 'bbr_name',
        'bbrIdType'               => 'bbr_id_type',
        'bbrIdNo'                 => 'bbr_id_no',
        'relaOrderNo'             => 'rela_order_no',
        'pickUpTime'              => 'pick_up_time',
        'courierCompany'          => 'courier_company',
        'courierNumber'           => 'courier_number',
        'cargoType'               => 'cargo_type',
        'cargoTotalQuantity'      => 'cargo_total_quantity',
        'cargoTotalWeight'        => 'cargo_total_weight',
        'cargoTotalWorth'         => 'cargo_total_worth',
        'sellId'                  => 'sell_id',
        'sellNaicCode'            => 'sell_naic_code',
        'startPlaceIsoCountry'    => 'start_place_iso_country',
        'startPlaceProvinceCity'  => 'start_place_province_city',
        'startPlace'              => 'start_place',
        'startPlacePostcode'      => 'start_place_postcode',
        'buyId'                   => 'buy_id',
        'isoCountry'              => 'iso_country',
        'destinationProvinceCity' => 'destination_province_city',
        'destination'             => 'destination',
        'cargoDetails'            => 'cargo_details',
    ];

    public function validate()
    {
        Model::validateRequired('tradeNo', $this->tradeNo, true);
        Model::validateRequired('externalChannelCode', $this->externalChannelCode, true);
        Model::validateRequired('externalProductCode', $this->externalProductCode, true);
        Model::validateRequired('chSchemeName', $this->chSchemeName, true);
        Model::validateRequired('chProjectName', $this->chProjectName, true);
        Model::validateRequired('insuredAmount', $this->insuredAmount, true);
        Model::validateRequired('premium', $this->premium, true);
        Model::validateRequired('totalPremium', $this->totalPremium, true);
        Model::validateRequired('currency', $this->currency, true);
        Model::validateRequired('bigPolNo', $this->bigPolNo, true);
        Model::validateRequired('insureStart', $this->insureStart, true);
        Model::validateRequired('timeZone', $this->timeZone, true);
        Model::validateRequired('tbrName', $this->tbrName, true);
        Model::validateRequired('tbrIdType', $this->tbrIdType, true);
        Model::validateRequired('tbrIdNo', $this->tbrIdNo, true);
        Model::validateRequired('bbrName', $this->bbrName, true);
        Model::validateRequired('bbrIdType', $this->bbrIdType, true);
        Model::validateRequired('bbrIdNo', $this->bbrIdNo, true);
        Model::validateRequired('relaOrderNo', $this->relaOrderNo, true);
        Model::validateRequired('pickUpTime', $this->pickUpTime, true);
        Model::validateRequired('courierCompany', $this->courierCompany, true);
        Model::validateRequired('courierNumber', $this->courierNumber, true);
        Model::validateRequired('cargoType', $this->cargoType, true);
        Model::validateRequired('cargoTotalQuantity', $this->cargoTotalQuantity, true);
        Model::validateRequired('cargoTotalWeight', $this->cargoTotalWeight, true);
        Model::validateRequired('cargoTotalWorth', $this->cargoTotalWorth, true);
        Model::validateRequired('sellId', $this->sellId, true);
        Model::validateRequired('sellNaicCode', $this->sellNaicCode, true);
        Model::validateRequired('startPlaceIsoCountry', $this->startPlaceIsoCountry, true);
        Model::validateRequired('startPlaceProvinceCity', $this->startPlaceProvinceCity, true);
        Model::validateRequired('startPlace', $this->startPlace, true);
        Model::validateRequired('startPlacePostcode', $this->startPlacePostcode, true);
        Model::validateRequired('buyId', $this->buyId, true);
        Model::validateRequired('isoCountry', $this->isoCountry, true);
        Model::validateRequired('destinationProvinceCity', $this->destinationProvinceCity, true);
        Model::validateRequired('destination', $this->destination, true);
        Model::validateRequired('cargoDetails', $this->cargoDetails, true);
        Model::validateMaxLength('tradeNo', $this->tradeNo, 50);
        Model::validateMaxLength('externalChannelCode', $this->externalChannelCode, 10);
        Model::validateMaxLength('externalProductCode', $this->externalProductCode, 10);
        Model::validateMaxLength('chSchemeName', $this->chSchemeName, 20);
        Model::validateMaxLength('chProjectName', $this->chProjectName, 20);
        Model::validateMaxLength('insuredAmount', $this->insuredAmount, 20);
        Model::validateMaxLength('premium', $this->premium, 20);
        Model::validateMaxLength('totalPremium', $this->totalPremium, 20);
        Model::validateMaxLength('currency', $this->currency, 3);
        Model::validateMaxLength('bigPolNo', $this->bigPolNo, 200);
        Model::validateMaxLength('insureStart', $this->insureStart, 50);
        Model::validateMaxLength('timeZone', $this->timeZone, 20);
        Model::validateMaxLength('tbrName', $this->tbrName, 100);
        Model::validateMaxLength('tbrIdType', $this->tbrIdType, 20);
        Model::validateMaxLength('tbrIdNo', $this->tbrIdNo, 100);
        Model::validateMaxLength('bbrName', $this->bbrName, 100);
        Model::validateMaxLength('bbrIdType', $this->bbrIdType, 20);
        Model::validateMaxLength('bbrIdNo', $this->bbrIdNo, 100);
        Model::validateMaxLength('relaOrderNo', $this->relaOrderNo, 100);
        Model::validateMaxLength('pickUpTime', $this->pickUpTime, 50);
        Model::validateMaxLength('courierCompany', $this->courierCompany, 100);
        Model::validateMaxLength('courierNumber', $this->courierNumber, 100);
        Model::validateMaxLength('cargoType', $this->cargoType, 256);
        Model::validateMaxLength('cargoTotalQuantity', $this->cargoTotalQuantity, 100);
        Model::validateMaxLength('cargoTotalWeight', $this->cargoTotalWeight, 200);
        Model::validateMaxLength('cargoTotalWorth', $this->cargoTotalWorth, 20);
        Model::validateMaxLength('sellId', $this->sellId, 100);
        Model::validateMaxLength('sellNaicCode', $this->sellNaicCode, 50);
        Model::validateMaxLength('startPlaceIsoCountry', $this->startPlaceIsoCountry, 10);
        Model::validateMaxLength('startPlaceProvinceCity', $this->startPlaceProvinceCity, 50);
        Model::validateMaxLength('startPlace', $this->startPlace, 500);
        Model::validateMaxLength('startPlacePostcode', $this->startPlacePostcode, 50);
        Model::validateMaxLength('buyId', $this->buyId, 100);
        Model::validateMaxLength('isoCountry', $this->isoCountry, 10);
        Model::validateMaxLength('destinationProvinceCity', $this->destinationProvinceCity, 50);
        Model::validateMaxLength('destination', $this->destination, 500);
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
        if (null !== $this->tradeNo) {
            $res['trade_no'] = $this->tradeNo;
        }
        if (null !== $this->externalChannelCode) {
            $res['external_channel_code'] = $this->externalChannelCode;
        }
        if (null !== $this->externalProductCode) {
            $res['external_product_code'] = $this->externalProductCode;
        }
        if (null !== $this->chSchemeName) {
            $res['ch_scheme_name'] = $this->chSchemeName;
        }
        if (null !== $this->chProjectName) {
            $res['ch_project_name'] = $this->chProjectName;
        }
        if (null !== $this->insuredAmount) {
            $res['insured_amount'] = $this->insuredAmount;
        }
        if (null !== $this->premium) {
            $res['premium'] = $this->premium;
        }
        if (null !== $this->totalPremium) {
            $res['total_premium'] = $this->totalPremium;
        }
        if (null !== $this->currency) {
            $res['currency'] = $this->currency;
        }
        if (null !== $this->bigPolNo) {
            $res['big_pol_no'] = $this->bigPolNo;
        }
        if (null !== $this->insureStart) {
            $res['insure_start'] = $this->insureStart;
        }
        if (null !== $this->timeZone) {
            $res['time_zone'] = $this->timeZone;
        }
        if (null !== $this->tbrName) {
            $res['tbr_name'] = $this->tbrName;
        }
        if (null !== $this->tbrIdType) {
            $res['tbr_id_type'] = $this->tbrIdType;
        }
        if (null !== $this->tbrIdNo) {
            $res['tbr_id_no'] = $this->tbrIdNo;
        }
        if (null !== $this->bbrName) {
            $res['bbr_name'] = $this->bbrName;
        }
        if (null !== $this->bbrIdType) {
            $res['bbr_id_type'] = $this->bbrIdType;
        }
        if (null !== $this->bbrIdNo) {
            $res['bbr_id_no'] = $this->bbrIdNo;
        }
        if (null !== $this->relaOrderNo) {
            $res['rela_order_no'] = $this->relaOrderNo;
        }
        if (null !== $this->pickUpTime) {
            $res['pick_up_time'] = $this->pickUpTime;
        }
        if (null !== $this->courierCompany) {
            $res['courier_company'] = $this->courierCompany;
        }
        if (null !== $this->courierNumber) {
            $res['courier_number'] = $this->courierNumber;
        }
        if (null !== $this->cargoType) {
            $res['cargo_type'] = $this->cargoType;
        }
        if (null !== $this->cargoTotalQuantity) {
            $res['cargo_total_quantity'] = $this->cargoTotalQuantity;
        }
        if (null !== $this->cargoTotalWeight) {
            $res['cargo_total_weight'] = $this->cargoTotalWeight;
        }
        if (null !== $this->cargoTotalWorth) {
            $res['cargo_total_worth'] = $this->cargoTotalWorth;
        }
        if (null !== $this->sellId) {
            $res['sell_id'] = $this->sellId;
        }
        if (null !== $this->sellNaicCode) {
            $res['sell_naic_code'] = $this->sellNaicCode;
        }
        if (null !== $this->startPlaceIsoCountry) {
            $res['start_place_iso_country'] = $this->startPlaceIsoCountry;
        }
        if (null !== $this->startPlaceProvinceCity) {
            $res['start_place_province_city'] = $this->startPlaceProvinceCity;
        }
        if (null !== $this->startPlace) {
            $res['start_place'] = $this->startPlace;
        }
        if (null !== $this->startPlacePostcode) {
            $res['start_place_postcode'] = $this->startPlacePostcode;
        }
        if (null !== $this->buyId) {
            $res['buy_id'] = $this->buyId;
        }
        if (null !== $this->isoCountry) {
            $res['iso_country'] = $this->isoCountry;
        }
        if (null !== $this->destinationProvinceCity) {
            $res['destination_province_city'] = $this->destinationProvinceCity;
        }
        if (null !== $this->destination) {
            $res['destination'] = $this->destination;
        }
        if (null !== $this->cargoDetails) {
            $res['cargo_details'] = null !== $this->cargoDetails ? $this->cargoDetails->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyInsurglobifyprodOspiinsureRequest
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
        if (isset($map['trade_no'])) {
            $model->tradeNo = $map['trade_no'];
        }
        if (isset($map['external_channel_code'])) {
            $model->externalChannelCode = $map['external_channel_code'];
        }
        if (isset($map['external_product_code'])) {
            $model->externalProductCode = $map['external_product_code'];
        }
        if (isset($map['ch_scheme_name'])) {
            $model->chSchemeName = $map['ch_scheme_name'];
        }
        if (isset($map['ch_project_name'])) {
            $model->chProjectName = $map['ch_project_name'];
        }
        if (isset($map['insured_amount'])) {
            $model->insuredAmount = $map['insured_amount'];
        }
        if (isset($map['premium'])) {
            $model->premium = $map['premium'];
        }
        if (isset($map['total_premium'])) {
            $model->totalPremium = $map['total_premium'];
        }
        if (isset($map['currency'])) {
            $model->currency = $map['currency'];
        }
        if (isset($map['big_pol_no'])) {
            $model->bigPolNo = $map['big_pol_no'];
        }
        if (isset($map['insure_start'])) {
            $model->insureStart = $map['insure_start'];
        }
        if (isset($map['time_zone'])) {
            $model->timeZone = $map['time_zone'];
        }
        if (isset($map['tbr_name'])) {
            $model->tbrName = $map['tbr_name'];
        }
        if (isset($map['tbr_id_type'])) {
            $model->tbrIdType = $map['tbr_id_type'];
        }
        if (isset($map['tbr_id_no'])) {
            $model->tbrIdNo = $map['tbr_id_no'];
        }
        if (isset($map['bbr_name'])) {
            $model->bbrName = $map['bbr_name'];
        }
        if (isset($map['bbr_id_type'])) {
            $model->bbrIdType = $map['bbr_id_type'];
        }
        if (isset($map['bbr_id_no'])) {
            $model->bbrIdNo = $map['bbr_id_no'];
        }
        if (isset($map['rela_order_no'])) {
            $model->relaOrderNo = $map['rela_order_no'];
        }
        if (isset($map['pick_up_time'])) {
            $model->pickUpTime = $map['pick_up_time'];
        }
        if (isset($map['courier_company'])) {
            $model->courierCompany = $map['courier_company'];
        }
        if (isset($map['courier_number'])) {
            $model->courierNumber = $map['courier_number'];
        }
        if (isset($map['cargo_type'])) {
            $model->cargoType = $map['cargo_type'];
        }
        if (isset($map['cargo_total_quantity'])) {
            $model->cargoTotalQuantity = $map['cargo_total_quantity'];
        }
        if (isset($map['cargo_total_weight'])) {
            $model->cargoTotalWeight = $map['cargo_total_weight'];
        }
        if (isset($map['cargo_total_worth'])) {
            $model->cargoTotalWorth = $map['cargo_total_worth'];
        }
        if (isset($map['sell_id'])) {
            $model->sellId = $map['sell_id'];
        }
        if (isset($map['sell_naic_code'])) {
            $model->sellNaicCode = $map['sell_naic_code'];
        }
        if (isset($map['start_place_iso_country'])) {
            $model->startPlaceIsoCountry = $map['start_place_iso_country'];
        }
        if (isset($map['start_place_province_city'])) {
            $model->startPlaceProvinceCity = $map['start_place_province_city'];
        }
        if (isset($map['start_place'])) {
            $model->startPlace = $map['start_place'];
        }
        if (isset($map['start_place_postcode'])) {
            $model->startPlacePostcode = $map['start_place_postcode'];
        }
        if (isset($map['buy_id'])) {
            $model->buyId = $map['buy_id'];
        }
        if (isset($map['iso_country'])) {
            $model->isoCountry = $map['iso_country'];
        }
        if (isset($map['destination_province_city'])) {
            $model->destinationProvinceCity = $map['destination_province_city'];
        }
        if (isset($map['destination'])) {
            $model->destination = $map['destination'];
        }
        if (isset($map['cargo_details'])) {
            $model->cargoDetails = CargoDetails::fromMap($map['cargo_details']);
        }

        return $model;
    }
}
