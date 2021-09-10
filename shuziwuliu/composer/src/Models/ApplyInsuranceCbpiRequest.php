<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class ApplyInsuranceCbpiRequest extends Model
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

    // 调用方生成的唯一编码，格式为 yyyyMMdd_身份标识_其他编码，系统会根据该流水号做防重、幂等判断逻辑。
    // yyyyMMdd请传递当前时间。
    // 身份标识可自定义。
    // 其他编码建议为随机值。
    // 当极端场景中，系统会返回处理中，错误码为2222，客户端应该保持该流水号不变，并使用原来的请求再次发送请求，系统会根据幂等逻辑返回处理结果；
    /**
     * @var string
     */
    public $tradeNo;

    // 保司编码.，PAIC---平安
    /**
     * @var string
     */
    public $externalChannelCode;

    // 险种编码，06--跨境邮包险
    /**
     * @var string
     */
    public $externalProductCode;

    // 保险协议中的投保人全称
    /**
     * @var string
     */
    public $tbrName;

    // 投保人证件类型，03--营业执照
    //
    /**
     * @var string
     */
    public $tbrIdType;

    // 投保人证件号码
    /**
     * @var string
     */
    public $tbrIdNo;

    // 被保人姓名，实际的保险被保人名称
    /**
     * @var string
     */
    public $bbrName;

    // 被保人证件类型，01--居民身份证、03--营业执照
    /**
     * @var string
     */
    public $bbrIdType;

    // 被保人证件号码
    //
    /**
     * @var string
     */
    public $bbrIdNo;

    // 受益人名称，实际的保险受益人名称
    //
    /**
     * @var string
     */
    public $beneficiaryName;

    // 受益人证件类型，01--居民身份证、03--营业执照
    /**
     * @var string
     */
    public $beneficiaryIdType;

    // 受益人证件号码
    /**
     * @var string
     */
    public $beneficiaryNo;

    // 保险起期，日期格式yyyy-MM-dd HH:mm:ss
    //
    /**
     * @var string
     */
    public $insureStart;

    // 保险金额，单位（元），最多支持2位小数，超过2位拒绝；
    //
    /**
     * @var string
     */
    public $insuredAmount;

    // 方案名，XBDP—跨境邮包险
    /**
     * @var string
     */
    public $schemeName;

    // 项目名称，命名规范“方案种类+物流业务种类+国别”
    /**
     * @var string
     */
    public $projectName;

    // 订单号,物流平台用以区分业务的唯一码
    /**
     * @var string
     */
    public $relatedOrderNo;

    // 寄件时间，日期格式yyyy-MM-dd HH:mm:ss
    /**
     * @var string
     */
    public $pickUpTime;

    // 快递公司名称，实际的派送公司全称
    /**
     * @var string
     */
    public $courierCompany;

    // 快递单号，实际的派送快递单号
    //
    /**
     * @var string
     */
    public $courierNumber;

    // 货物类型,货物类型的大类
    /**
     * @var string
     */
    public $cargoType;

    // 货物名称,实际的货物名称
    /**
     * @var string
     */
    public $cargoName;

    // 货物数量
    /**
     * @var string
     */
    public $cargoQuantity;

    // 买家ID,买家的脱敏唯一标识
    /**
     * @var string
     */
    public $buyId;

    // 卖家ID,卖家的脱敏唯一标识
    /**
     * @var string
     */
    public $sellId;

    // 出发地地址,包裹的实际发件地地址
    /**
     * @var string
     */
    public $startPlace;

    // 目的地地址,包裹的实际收件地地址
    /**
     * @var string
     */
    public $destination;

    // ISO到达国别,包裹业务实际发生的国家
    /**
     * @var string
     */
    public $isoCountry;

    // 货物申报价值，单位（元），最多支持2位小数，超过2位拒绝
    /**
     * @var string
     */
    public $cargoWorth;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'tradeNo'             => 'trade_no',
        'externalChannelCode' => 'external_channel_code',
        'externalProductCode' => 'external_product_code',
        'tbrName'             => 'tbr_name',
        'tbrIdType'           => 'tbr_id_type',
        'tbrIdNo'             => 'tbr_id_no',
        'bbrName'             => 'bbr_name',
        'bbrIdType'           => 'bbr_id_type',
        'bbrIdNo'             => 'bbr_id_no',
        'beneficiaryName'     => 'beneficiary_name',
        'beneficiaryIdType'   => 'beneficiary_id_type',
        'beneficiaryNo'       => 'beneficiary_no',
        'insureStart'         => 'insure_start',
        'insuredAmount'       => 'insured_amount',
        'schemeName'          => 'scheme_name',
        'projectName'         => 'project_name',
        'relatedOrderNo'      => 'related_order_no',
        'pickUpTime'          => 'pick_up_time',
        'courierCompany'      => 'courier_company',
        'courierNumber'       => 'courier_number',
        'cargoType'           => 'cargo_type',
        'cargoName'           => 'cargo_name',
        'cargoQuantity'       => 'cargo_quantity',
        'buyId'               => 'buy_id',
        'sellId'              => 'sell_id',
        'startPlace'          => 'start_place',
        'destination'         => 'destination',
        'isoCountry'          => 'iso_country',
        'cargoWorth'          => 'cargo_worth',
    ];

    public function validate()
    {
        Model::validateRequired('tradeNo', $this->tradeNo, true);
        Model::validateRequired('externalChannelCode', $this->externalChannelCode, true);
        Model::validateRequired('externalProductCode', $this->externalProductCode, true);
        Model::validateRequired('tbrName', $this->tbrName, true);
        Model::validateRequired('tbrIdType', $this->tbrIdType, true);
        Model::validateRequired('tbrIdNo', $this->tbrIdNo, true);
        Model::validateRequired('bbrName', $this->bbrName, true);
        Model::validateRequired('bbrIdType', $this->bbrIdType, true);
        Model::validateRequired('bbrIdNo', $this->bbrIdNo, true);
        Model::validateRequired('beneficiaryName', $this->beneficiaryName, true);
        Model::validateRequired('beneficiaryIdType', $this->beneficiaryIdType, true);
        Model::validateRequired('beneficiaryNo', $this->beneficiaryNo, true);
        Model::validateRequired('insureStart', $this->insureStart, true);
        Model::validateRequired('insuredAmount', $this->insuredAmount, true);
        Model::validateRequired('schemeName', $this->schemeName, true);
        Model::validateRequired('projectName', $this->projectName, true);
        Model::validateRequired('relatedOrderNo', $this->relatedOrderNo, true);
        Model::validateRequired('pickUpTime', $this->pickUpTime, true);
        Model::validateRequired('courierCompany', $this->courierCompany, true);
        Model::validateRequired('courierNumber', $this->courierNumber, true);
        Model::validateRequired('cargoType', $this->cargoType, true);
        Model::validateRequired('cargoName', $this->cargoName, true);
        Model::validateRequired('cargoQuantity', $this->cargoQuantity, true);
        Model::validateRequired('buyId', $this->buyId, true);
        Model::validateRequired('sellId', $this->sellId, true);
        Model::validateRequired('startPlace', $this->startPlace, true);
        Model::validateRequired('destination', $this->destination, true);
        Model::validateRequired('isoCountry', $this->isoCountry, true);
        Model::validateRequired('cargoWorth', $this->cargoWorth, true);
        Model::validateMaxLength('tradeNo', $this->tradeNo, 50);
        Model::validateMaxLength('externalChannelCode', $this->externalChannelCode, 10);
        Model::validateMaxLength('externalProductCode', $this->externalProductCode, 2);
        Model::validateMaxLength('tbrName', $this->tbrName, 100);
        Model::validateMaxLength('tbrIdType', $this->tbrIdType, 2);
        Model::validateMaxLength('tbrIdNo', $this->tbrIdNo, 30);
        Model::validateMaxLength('bbrName', $this->bbrName, 100);
        Model::validateMaxLength('bbrIdType', $this->bbrIdType, 2);
        Model::validateMaxLength('bbrIdNo', $this->bbrIdNo, 30);
        Model::validateMaxLength('beneficiaryName', $this->beneficiaryName, 100);
        Model::validateMaxLength('beneficiaryIdType', $this->beneficiaryIdType, 2);
        Model::validateMaxLength('beneficiaryNo', $this->beneficiaryNo, 30);
        Model::validateMaxLength('schemeName', $this->schemeName, 100);
        Model::validateMaxLength('projectName', $this->projectName, 500);
        Model::validateMaxLength('relatedOrderNo', $this->relatedOrderNo, 100);
        Model::validateMaxLength('courierCompany', $this->courierCompany, 200);
        Model::validateMaxLength('courierNumber', $this->courierNumber, 100);
        Model::validateMaxLength('cargoType', $this->cargoType, 100);
        Model::validateMaxLength('cargoName', $this->cargoName, 200);
        Model::validateMaxLength('buyId', $this->buyId, 100);
        Model::validateMaxLength('sellId', $this->sellId, 100);
        Model::validateMaxLength('startPlace', $this->startPlace, 500);
        Model::validateMaxLength('destination', $this->destination, 500);
        Model::validateMaxLength('isoCountry', $this->isoCountry, 10);
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
        if (null !== $this->beneficiaryName) {
            $res['beneficiary_name'] = $this->beneficiaryName;
        }
        if (null !== $this->beneficiaryIdType) {
            $res['beneficiary_id_type'] = $this->beneficiaryIdType;
        }
        if (null !== $this->beneficiaryNo) {
            $res['beneficiary_no'] = $this->beneficiaryNo;
        }
        if (null !== $this->insureStart) {
            $res['insure_start'] = $this->insureStart;
        }
        if (null !== $this->insuredAmount) {
            $res['insured_amount'] = $this->insuredAmount;
        }
        if (null !== $this->schemeName) {
            $res['scheme_name'] = $this->schemeName;
        }
        if (null !== $this->projectName) {
            $res['project_name'] = $this->projectName;
        }
        if (null !== $this->relatedOrderNo) {
            $res['related_order_no'] = $this->relatedOrderNo;
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
        if (null !== $this->cargoName) {
            $res['cargo_name'] = $this->cargoName;
        }
        if (null !== $this->cargoQuantity) {
            $res['cargo_quantity'] = $this->cargoQuantity;
        }
        if (null !== $this->buyId) {
            $res['buy_id'] = $this->buyId;
        }
        if (null !== $this->sellId) {
            $res['sell_id'] = $this->sellId;
        }
        if (null !== $this->startPlace) {
            $res['start_place'] = $this->startPlace;
        }
        if (null !== $this->destination) {
            $res['destination'] = $this->destination;
        }
        if (null !== $this->isoCountry) {
            $res['iso_country'] = $this->isoCountry;
        }
        if (null !== $this->cargoWorth) {
            $res['cargo_worth'] = $this->cargoWorth;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyInsuranceCbpiRequest
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
        if (isset($map['beneficiary_name'])) {
            $model->beneficiaryName = $map['beneficiary_name'];
        }
        if (isset($map['beneficiary_id_type'])) {
            $model->beneficiaryIdType = $map['beneficiary_id_type'];
        }
        if (isset($map['beneficiary_no'])) {
            $model->beneficiaryNo = $map['beneficiary_no'];
        }
        if (isset($map['insure_start'])) {
            $model->insureStart = $map['insure_start'];
        }
        if (isset($map['insured_amount'])) {
            $model->insuredAmount = $map['insured_amount'];
        }
        if (isset($map['scheme_name'])) {
            $model->schemeName = $map['scheme_name'];
        }
        if (isset($map['project_name'])) {
            $model->projectName = $map['project_name'];
        }
        if (isset($map['related_order_no'])) {
            $model->relatedOrderNo = $map['related_order_no'];
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
        if (isset($map['cargo_name'])) {
            $model->cargoName = $map['cargo_name'];
        }
        if (isset($map['cargo_quantity'])) {
            $model->cargoQuantity = $map['cargo_quantity'];
        }
        if (isset($map['buy_id'])) {
            $model->buyId = $map['buy_id'];
        }
        if (isset($map['sell_id'])) {
            $model->sellId = $map['sell_id'];
        }
        if (isset($map['start_place'])) {
            $model->startPlace = $map['start_place'];
        }
        if (isset($map['destination'])) {
            $model->destination = $map['destination'];
        }
        if (isset($map['iso_country'])) {
            $model->isoCountry = $map['iso_country'];
        }
        if (isset($map['cargo_worth'])) {
            $model->cargoWorth = $map['cargo_worth'];
        }

        return $model;
    }
}
