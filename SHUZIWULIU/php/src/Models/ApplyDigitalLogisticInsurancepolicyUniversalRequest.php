<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class ApplyDigitalLogisticInsurancepolicyUniversalRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'accountBankName' => 'account_bank_name',
        'bankAccountInformation' => 'bank_account_information',
        'bbrAddr' => 'bbr_addr',
        'bbrDid' => 'bbr_did',
        'bbrIdNo' => 'bbr_id_no',
        'bbrIdType' => 'bbr_id_type',
        'bbrName' => 'bbr_name',
        'bbrTel' => 'bbr_tel',
        'bbrType' => 'bbr_type',
        'cargoName' => 'cargo_name',
        'cargoQuantity' => 'cargo_quantity',
        'cargoQuantityUnit' => 'cargo_quantity_unit',
        'cargoTonnage' => 'cargo_tonnage',
        'cargoType' => 'cargo_type',
        'cargoVolume' => 'cargo_volume',
        'cargoWorth' => 'cargo_worth',
        'carLength' => 'car_length',
        'carModel' => 'car_model',
        'destination' => 'destination',
        'driverName' => 'driver_name',
        'driverTel' => 'driver_tel',
        'effDate' => 'eff_date',
        'externalChannelCode' => 'external_channel_code',
        'externalProductCode' => 'external_product_code',
        'frameNo' => 'frame_no',
        'insuredAmount' => 'insured_amount',
        'licenseNo' => 'license_no',
        'licensePlateColor' => 'license_plate_color',
        'nsrIdentifier' => 'nsr_identifier',
        'orderTime' => 'order_time',
        'packing' => 'packing',
        'printInvoice' => 'print_invoice',
        'rate' => 'rate',
        'startPlace' => 'start_place',
        'tbrAddr' => 'tbr_addr',
        'tbrCorporateContract' => 'tbr_corporate_contract',
        'tbrDid' => 'tbr_did',
        'tbrEmail' => 'tbr_email',
        'tbrIdNo' => 'tbr_id_no',
        'tbrIdType' => 'tbr_id_type',
        'tbrName' => 'tbr_name',
        'tbrTel' => 'tbr_tel',
        'tbrType' => 'tbr_type',
        'termDate' => 'term_date',
        'ticketAddr' => 'ticket_addr',
        'tradeNo' => 'trade_no',
        'transitPoint' => 'transit_point',
        'waybillId' => 'waybill_id',
    ];
    public function validate() {
        Model::validateMaxLength('accountBankName', $this->accountBankName, 100);
        Model::validateMaxLength('bankAccountInformation', $this->bankAccountInformation, 50);
        Model::validateMaxLength('bbrAddr', $this->bbrAddr, 200);
        Model::validateMaxLength('bbrDid', $this->bbrDid, 200);
        Model::validateMaxLength('bbrIdNo', $this->bbrIdNo, 50);
        Model::validateMaxLength('bbrIdType', $this->bbrIdType, 2);
        Model::validateMaxLength('bbrName', $this->bbrName, 100);
        Model::validateMaxLength('bbrTel', $this->bbrTel, 20);
        Model::validateMaxLength('bbrType', $this->bbrType, 1);
        Model::validateMaxLength('cargoName', $this->cargoName, 100);
        Model::validateMaxLength('cargoQuantity', $this->cargoQuantity, 20);
        Model::validateMaxLength('cargoQuantityUnit', $this->cargoQuantityUnit, 20);
        Model::validateMaxLength('cargoTonnage', $this->cargoTonnage, 20);
        Model::validateMaxLength('cargoType', $this->cargoType, 50);
        Model::validateMaxLength('cargoVolume', $this->cargoVolume, 20);
        Model::validateMaxLength('cargoWorth', $this->cargoWorth, 50);
        Model::validateMaxLength('carLength', $this->carLength, 10);
        Model::validateMaxLength('carModel', $this->carModel, 20);
        Model::validateMaxLength('destination', $this->destination, 100);
        Model::validateMaxLength('driverName', $this->driverName, 50);
        Model::validateMaxLength('driverTel', $this->driverTel, 20);
        Model::validateMaxLength('externalChannelCode', $this->externalChannelCode, 2);
        Model::validateMaxLength('externalProductCode', $this->externalProductCode, 2);
        Model::validateMaxLength('frameNo', $this->frameNo, 50);
        Model::validateMaxLength('insuredAmount', $this->insuredAmount, 12);
        Model::validateMaxLength('licenseNo', $this->licenseNo, 20);
        Model::validateMaxLength('licensePlateColor', $this->licensePlateColor, 2);
        Model::validateMaxLength('nsrIdentifier', $this->nsrIdentifier, 50);
        Model::validateMaxLength('packing', $this->packing, 100);
        Model::validateMaxLength('printInvoice', $this->printInvoice, 1);
        Model::validateMaxLength('rate', $this->rate, 8);
        Model::validateMaxLength('startPlace', $this->startPlace, 100);
        Model::validateMaxLength('tbrAddr', $this->tbrAddr, 200);
        Model::validateMaxLength('tbrCorporateContract', $this->tbrCorporateContract, 20);
        Model::validateMaxLength('tbrDid', $this->tbrDid, 200);
        Model::validateMaxLength('tbrEmail', $this->tbrEmail, 50);
        Model::validateMaxLength('tbrIdNo', $this->tbrIdNo, 50);
        Model::validateMaxLength('tbrIdType', $this->tbrIdType, 2);
        Model::validateMaxLength('tbrName', $this->tbrName, 100);
        Model::validateMaxLength('tbrTel', $this->tbrTel, 20);
        Model::validateMaxLength('tbrType', $this->tbrType, 1);
        Model::validateMaxLength('ticketAddr', $this->ticketAddr, 200);
        Model::validateMaxLength('tradeNo', $this->tradeNo, 50);
        Model::validateMaxLength('transitPoint', $this->transitPoint, 100);
        Model::validateMaxLength('waybillId', $this->waybillId, 50);
        Model::validatePattern('effDate', $this->effDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('orderTime', $this->orderTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('termDate', $this->termDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->regionName) {
            $res['region_name'] = $this->regionName;
        }
        if (null !== $this->accountBankName) {
            $res['account_bank_name'] = $this->accountBankName;
        }
        if (null !== $this->bankAccountInformation) {
            $res['bank_account_information'] = $this->bankAccountInformation;
        }
        if (null !== $this->bbrAddr) {
            $res['bbr_addr'] = $this->bbrAddr;
        }
        if (null !== $this->bbrDid) {
            $res['bbr_did'] = $this->bbrDid;
        }
        if (null !== $this->bbrIdNo) {
            $res['bbr_id_no'] = $this->bbrIdNo;
        }
        if (null !== $this->bbrIdType) {
            $res['bbr_id_type'] = $this->bbrIdType;
        }
        if (null !== $this->bbrName) {
            $res['bbr_name'] = $this->bbrName;
        }
        if (null !== $this->bbrTel) {
            $res['bbr_tel'] = $this->bbrTel;
        }
        if (null !== $this->bbrType) {
            $res['bbr_type'] = $this->bbrType;
        }
        if (null !== $this->cargoName) {
            $res['cargo_name'] = $this->cargoName;
        }
        if (null !== $this->cargoQuantity) {
            $res['cargo_quantity'] = $this->cargoQuantity;
        }
        if (null !== $this->cargoQuantityUnit) {
            $res['cargo_quantity_unit'] = $this->cargoQuantityUnit;
        }
        if (null !== $this->cargoTonnage) {
            $res['cargo_tonnage'] = $this->cargoTonnage;
        }
        if (null !== $this->cargoType) {
            $res['cargo_type'] = $this->cargoType;
        }
        if (null !== $this->cargoVolume) {
            $res['cargo_volume'] = $this->cargoVolume;
        }
        if (null !== $this->cargoWorth) {
            $res['cargo_worth'] = $this->cargoWorth;
        }
        if (null !== $this->carLength) {
            $res['car_length'] = $this->carLength;
        }
        if (null !== $this->carModel) {
            $res['car_model'] = $this->carModel;
        }
        if (null !== $this->destination) {
            $res['destination'] = $this->destination;
        }
        if (null !== $this->driverName) {
            $res['driver_name'] = $this->driverName;
        }
        if (null !== $this->driverTel) {
            $res['driver_tel'] = $this->driverTel;
        }
        if (null !== $this->effDate) {
            $res['eff_date'] = $this->effDate;
        }
        if (null !== $this->externalChannelCode) {
            $res['external_channel_code'] = $this->externalChannelCode;
        }
        if (null !== $this->externalProductCode) {
            $res['external_product_code'] = $this->externalProductCode;
        }
        if (null !== $this->frameNo) {
            $res['frame_no'] = $this->frameNo;
        }
        if (null !== $this->insuredAmount) {
            $res['insured_amount'] = $this->insuredAmount;
        }
        if (null !== $this->licenseNo) {
            $res['license_no'] = $this->licenseNo;
        }
        if (null !== $this->licensePlateColor) {
            $res['license_plate_color'] = $this->licensePlateColor;
        }
        if (null !== $this->nsrIdentifier) {
            $res['nsr_identifier'] = $this->nsrIdentifier;
        }
        if (null !== $this->orderTime) {
            $res['order_time'] = $this->orderTime;
        }
        if (null !== $this->packing) {
            $res['packing'] = $this->packing;
        }
        if (null !== $this->printInvoice) {
            $res['print_invoice'] = $this->printInvoice;
        }
        if (null !== $this->rate) {
            $res['rate'] = $this->rate;
        }
        if (null !== $this->startPlace) {
            $res['start_place'] = $this->startPlace;
        }
        if (null !== $this->tbrAddr) {
            $res['tbr_addr'] = $this->tbrAddr;
        }
        if (null !== $this->tbrCorporateContract) {
            $res['tbr_corporate_contract'] = $this->tbrCorporateContract;
        }
        if (null !== $this->tbrDid) {
            $res['tbr_did'] = $this->tbrDid;
        }
        if (null !== $this->tbrEmail) {
            $res['tbr_email'] = $this->tbrEmail;
        }
        if (null !== $this->tbrIdNo) {
            $res['tbr_id_no'] = $this->tbrIdNo;
        }
        if (null !== $this->tbrIdType) {
            $res['tbr_id_type'] = $this->tbrIdType;
        }
        if (null !== $this->tbrName) {
            $res['tbr_name'] = $this->tbrName;
        }
        if (null !== $this->tbrTel) {
            $res['tbr_tel'] = $this->tbrTel;
        }
        if (null !== $this->tbrType) {
            $res['tbr_type'] = $this->tbrType;
        }
        if (null !== $this->termDate) {
            $res['term_date'] = $this->termDate;
        }
        if (null !== $this->ticketAddr) {
            $res['ticket_addr'] = $this->ticketAddr;
        }
        if (null !== $this->tradeNo) {
            $res['trade_no'] = $this->tradeNo;
        }
        if (null !== $this->transitPoint) {
            $res['transit_point'] = $this->transitPoint;
        }
        if (null !== $this->waybillId) {
            $res['waybill_id'] = $this->waybillId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ApplyDigitalLogisticInsurancepolicyUniversalRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['region_name'])){
            $model->regionName = $map['region_name'];
        }
        if(isset($map['account_bank_name'])){
            $model->accountBankName = $map['account_bank_name'];
        }
        if(isset($map['bank_account_information'])){
            $model->bankAccountInformation = $map['bank_account_information'];
        }
        if(isset($map['bbr_addr'])){
            $model->bbrAddr = $map['bbr_addr'];
        }
        if(isset($map['bbr_did'])){
            $model->bbrDid = $map['bbr_did'];
        }
        if(isset($map['bbr_id_no'])){
            $model->bbrIdNo = $map['bbr_id_no'];
        }
        if(isset($map['bbr_id_type'])){
            $model->bbrIdType = $map['bbr_id_type'];
        }
        if(isset($map['bbr_name'])){
            $model->bbrName = $map['bbr_name'];
        }
        if(isset($map['bbr_tel'])){
            $model->bbrTel = $map['bbr_tel'];
        }
        if(isset($map['bbr_type'])){
            $model->bbrType = $map['bbr_type'];
        }
        if(isset($map['cargo_name'])){
            $model->cargoName = $map['cargo_name'];
        }
        if(isset($map['cargo_quantity'])){
            $model->cargoQuantity = $map['cargo_quantity'];
        }
        if(isset($map['cargo_quantity_unit'])){
            $model->cargoQuantityUnit = $map['cargo_quantity_unit'];
        }
        if(isset($map['cargo_tonnage'])){
            $model->cargoTonnage = $map['cargo_tonnage'];
        }
        if(isset($map['cargo_type'])){
            $model->cargoType = $map['cargo_type'];
        }
        if(isset($map['cargo_volume'])){
            $model->cargoVolume = $map['cargo_volume'];
        }
        if(isset($map['cargo_worth'])){
            $model->cargoWorth = $map['cargo_worth'];
        }
        if(isset($map['car_length'])){
            $model->carLength = $map['car_length'];
        }
        if(isset($map['car_model'])){
            $model->carModel = $map['car_model'];
        }
        if(isset($map['destination'])){
            $model->destination = $map['destination'];
        }
        if(isset($map['driver_name'])){
            $model->driverName = $map['driver_name'];
        }
        if(isset($map['driver_tel'])){
            $model->driverTel = $map['driver_tel'];
        }
        if(isset($map['eff_date'])){
            $model->effDate = $map['eff_date'];
        }
        if(isset($map['external_channel_code'])){
            $model->externalChannelCode = $map['external_channel_code'];
        }
        if(isset($map['external_product_code'])){
            $model->externalProductCode = $map['external_product_code'];
        }
        if(isset($map['frame_no'])){
            $model->frameNo = $map['frame_no'];
        }
        if(isset($map['insured_amount'])){
            $model->insuredAmount = $map['insured_amount'];
        }
        if(isset($map['license_no'])){
            $model->licenseNo = $map['license_no'];
        }
        if(isset($map['license_plate_color'])){
            $model->licensePlateColor = $map['license_plate_color'];
        }
        if(isset($map['nsr_identifier'])){
            $model->nsrIdentifier = $map['nsr_identifier'];
        }
        if(isset($map['order_time'])){
            $model->orderTime = $map['order_time'];
        }
        if(isset($map['packing'])){
            $model->packing = $map['packing'];
        }
        if(isset($map['print_invoice'])){
            $model->printInvoice = $map['print_invoice'];
        }
        if(isset($map['rate'])){
            $model->rate = $map['rate'];
        }
        if(isset($map['start_place'])){
            $model->startPlace = $map['start_place'];
        }
        if(isset($map['tbr_addr'])){
            $model->tbrAddr = $map['tbr_addr'];
        }
        if(isset($map['tbr_corporate_contract'])){
            $model->tbrCorporateContract = $map['tbr_corporate_contract'];
        }
        if(isset($map['tbr_did'])){
            $model->tbrDid = $map['tbr_did'];
        }
        if(isset($map['tbr_email'])){
            $model->tbrEmail = $map['tbr_email'];
        }
        if(isset($map['tbr_id_no'])){
            $model->tbrIdNo = $map['tbr_id_no'];
        }
        if(isset($map['tbr_id_type'])){
            $model->tbrIdType = $map['tbr_id_type'];
        }
        if(isset($map['tbr_name'])){
            $model->tbrName = $map['tbr_name'];
        }
        if(isset($map['tbr_tel'])){
            $model->tbrTel = $map['tbr_tel'];
        }
        if(isset($map['tbr_type'])){
            $model->tbrType = $map['tbr_type'];
        }
        if(isset($map['term_date'])){
            $model->termDate = $map['term_date'];
        }
        if(isset($map['ticket_addr'])){
            $model->ticketAddr = $map['ticket_addr'];
        }
        if(isset($map['trade_no'])){
            $model->tradeNo = $map['trade_no'];
        }
        if(isset($map['transit_point'])){
            $model->transitPoint = $map['transit_point'];
        }
        if(isset($map['waybill_id'])){
            $model->waybillId = $map['waybill_id'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    /**
     * @var string
     */
    public $regionName;

    // 投保人开户银行，当打印发票选择为“1”时，必填
    /**
     * @var string
     */
    public $accountBankName;

    // 投保人银行账户，当打印发票选择为“1”时，必填
    /**
     * @var string
     */
    public $bankAccountInformation;

    // 被保人地址
    /**
     * @var string
     */
    public $bbrAddr;

    // 被保人did（被保人所在链上分布式数字身份）
    /**
     * @var string
     */
    public $bbrDid;

    // 被保人证件号
    /**
     * @var string
     */
    public $bbrIdNo;

    // 被保人证件类型，01-居民身份证, 02-驾驶执照, 03-营业执照, 99-其他
    // 
    /**
     * @var string
     */
    public $bbrIdType;

    // 被保人姓名
    /**
     * @var string
     */
    public $bbrName;

    // 被保人电话号
    /**
     * @var string
     */
    public $bbrTel;

    // 被保人类型, 1-个人 2-团队
    /**
     * @var string
     */
    public $bbrType;

    // 货物名称
    /**
     * @var string
     */
    public $cargoName;

    // 货物数量
    /**
     * @var string
     */
    public $cargoQuantity;

    // 货物数量单位
    /**
     * @var string
     */
    public $cargoQuantityUnit;

    // 货物吨位
    /**
     * @var string
     */
    public $cargoTonnage;

    // 货物类型，普货，手机/电子产品/家用电器，精密仪器，家具，易碎品，大宗散货，生鲜（瓜果蔬菜），棉纱
    /**
     * @var string
     */
    public $cargoType;

    // 货物体积
    /**
     * @var string
     */
    public $cargoVolume;

    // 货值
    /**
     * @var string
     */
    public $cargoWorth;

    // 车长
    /**
     * @var string
     */
    public $carLength;

    // 车型
    /**
     * @var string
     */
    public $carModel;

    // 目的地，格式为"省-市-区"
    /**
     * @var string
     */
    public $destination;

    // 司机姓名
    /**
     * @var string
     */
    public $driverName;

    // 司机联系方式
    /**
     * @var string
     */
    public $driverTel;

    // 保险起始时间, 时间格式 "yyyy-MM-dd HH:mm:ss", 预计起运日期
    /**
     * @var string
     */
    public $effDate;

    // 保司, 01-华泰, 02-平安, 03-亚太
    /**
     * @var string
     */
    public $externalChannelCode;

    // 险种, 01-承运人平台责任险
    // 
    /**
     * @var string
     */
    public $externalProductCode;

    // 车架号
    /**
     * @var string
     */
    public $frameNo;

    // 投保额，整数以元为单位
    // 
    /**
     * @var string
     */
    public $insuredAmount;

    // 车牌号
    /**
     * @var string
     */
    public $licenseNo;

    // 车牌颜色，01-黄牌，02-蓝牌
    /**
     * @var string
     */
    public $licensePlateColor;

    // 税务登记证/纳税人识别号，当打印发票选择为“1”时，必填
    /**
     * @var string
     */
    public $nsrIdentifier;

    // 接单时间, 时间格式 "yyyy-MM-dd HH:mm:ss"
    /**
     * @var string
     */
    public $orderTime;

    // 包装方式, 01-箱装、02-袋装、03-包装、04-桶装、05-捆扎包装、06-裸装、07-散装、08-其他包装
    /**
     * @var string
     */
    public $packing;

    // 是否打印发票，默认0-不开票  1-专票 2-电子发票
    /**
     * @var string
     */
    public $printInvoice;

    // 费率，按实际业务商讨费率执行, 但最终结果以保司计算结果为准，0到1之间，最多6位小数
    /**
     * @var string
     */
    public $rate;

    // 起运地，格式为"省-市-区"
    /**
     * @var string
     */
    public $startPlace;

    // 投保人地址，当打印发票选择为“1”时，必填
    /**
     * @var string
     */
    public $tbrAddr;

    // 投保人-企业联系人联系方式
    /**
     * @var string
     */
    public $tbrCorporateContract;

    // 投保人did（投保人所在链上分布式数字身份）
    /**
     * @var string
     */
    public $tbrDid;

    // 投保人邮箱，用以接受电子发票的邮箱地址
    /**
     * @var string
     */
    public $tbrEmail;

    // 投保人证件号
    /**
     * @var string
     */
    public $tbrIdNo;

    // 投保人证件类型，01-居民身份证, 02-驾驶执照, 03-营业执照, 99-其他
    /**
     * @var string
     */
    public $tbrIdType;

    // 投保人名称
    /**
     * @var string
     */
    public $tbrName;

    // 投保人电话号
    /**
     * @var string
     */
    public $tbrTel;

    // 投保人类型, 1-个人 2-团队
    /**
     * @var string
     */
    public $tbrType;

    // 保险截止时间, 时间格式 "yyyy-MM-dd HH:mm:ss", 预计到达日期，保险止期间隔为1-30天
    /**
     * @var string
     */
    public $termDate;

    // 专票邮寄地址
    /**
     * @var string
     */
    public $ticketAddr;

    // 订单号, 年月日+唯一字符ID
    /**
     * @var string
     */
    public $tradeNo;

    // 中转地，格式为"省-市-区"
    /**
     * @var string
     */
    public $transitPoint;

    // 运单id（平台方运单id）
    /**
     * @var string
     */
    public $waybillId;

}
