<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class ApplyInsuranceCbecRequest extends Model
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

    // 投保交易号，调用方生成的唯一编码
    /**
     * @var string
     */
    public $tradeNo;

    // 保司编码，CPIC---太保
    /**
     * @var string
     */
    public $externalChannelCode;

    // 险种编码，03--跨境出口货运险
    /**
     * @var string
     */
    public $externalProductCode;

    // 投保人姓名
    /**
     * @var string
     */
    public $tbrName;

    // 投保人证件类型，03--营业执照
    /**
     * @var string
     */
    public $tbrIdType;

    // 投保人证件号码
    /**
     * @var string
     */
    public $tbrIdNo;

    // 被保人姓名
    /**
     * @var string
     */
    public $bbrName;

    // 被保人证件类型，01--居民身份证，03--营业执照
    /**
     * @var string
     */
    public $bbrIdType;

    // 被保人证件号码
    /**
     * @var string
     */
    public $bbrIdNo;

    // 出库单号/航次号/运单号
    /**
     * @var string
     */
    public $relatedOrderNo;

    // 包装及数量
    /**
     * @var string
     */
    public $cargoQuantity;

    // 货物名称
    /**
     * @var string
     */
    public $cargoName;

    // 包装代码,参考保司提供样例-包装代码
    /**
     * @var string
     */
    public $packingCode;

    // 货物类型代码,货物类型代码,参考保司提供样例-货物类型代码
    /**
     * @var string
     */
    public $cargoTypeCode;

    // 航行区域代码,参考保司提供样例-航行区域代码
    /**
     * @var string
     */
    public $flightAreaCode;

    // 运输方式代码,参考保司提供样例-运输方式
    /**
     * @var string
     */
    public $transportTypeCode;

    // 运输工具名称
    /**
     * @var string
     */
    public $transportMeansName;

    // 航次号
    /**
     * @var string
     */
    public $voyage;

    // 出发地
    /**
     * @var string
     */
    public $startPlace;

    // 中转地
    /**
     * @var string
     */
    public $transitPoint;

    // 目的地
    /**
     * @var string
     */
    public $destination;

    // 理赔代理地代码，参考保司提供样例-理赔代理地
    /**
     * @var string
     */
    public $claimAgentCode;

    // 主险条款代码
    /**
     * @var string
     */
    public $mainItemCode;

    // 主险条款内容
    /**
     * @var string
     */
    public $mainItemContent;

    // 附加条款集合
    /**
     * @var MainItemAdd[]
     */
    public $mainItemAdds;

    // 特别约定
    /**
     * @var string
     */
    public $specialize;

    // 申报货物价值,，最多兼容2位小数，单位（元）
    /**
     * @var string
     */
    public $cargoWorth;

    // 费率，最多兼容9位小数
    /**
     * @var string
     */
    public $rate;

    // 保费，最多兼容2位小数，单位（元）
    /**
     * @var string
     */
    public $premium;

    // 保险起期，日期格式yyyy-mm-dd
    /**
     * @var string
     */
    public $insureStart;

    // 起运日期，日期格式yyyy-mm-dd
    /**
     * @var string
     */
    public $saleDate;
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
        'relatedOrderNo'      => 'related_order_no',
        'cargoQuantity'       => 'cargo_quantity',
        'cargoName'           => 'cargo_name',
        'packingCode'         => 'packing_code',
        'cargoTypeCode'       => 'cargo_type_code',
        'flightAreaCode'      => 'flight_area_code',
        'transportTypeCode'   => 'transport_type_code',
        'transportMeansName'  => 'transport_means_name',
        'voyage'              => 'voyage',
        'startPlace'          => 'start_place',
        'transitPoint'        => 'transit_point',
        'destination'         => 'destination',
        'claimAgentCode'      => 'claim_agent_code',
        'mainItemCode'        => 'main_item_code',
        'mainItemContent'     => 'main_item_content',
        'mainItemAdds'        => 'main_item_adds',
        'specialize'          => 'specialize',
        'cargoWorth'          => 'cargo_worth',
        'rate'                => 'rate',
        'premium'             => 'premium',
        'insureStart'         => 'insure_start',
        'saleDate'            => 'sale_date',
    ];

    public function validate()
    {
        Model::validateRequired('tradeNo', $this->tradeNo, true);
        Model::validateRequired('externalChannelCode', $this->externalChannelCode, true);
        Model::validateRequired('externalProductCode', $this->externalProductCode, true);
        Model::validateRequired('tbrName', $this->tbrName, true);
        Model::validateRequired('bbrName', $this->bbrName, true);
        Model::validateRequired('relatedOrderNo', $this->relatedOrderNo, true);
        Model::validateRequired('cargoQuantity', $this->cargoQuantity, true);
        Model::validateRequired('cargoName', $this->cargoName, true);
        Model::validateRequired('packingCode', $this->packingCode, true);
        Model::validateRequired('cargoTypeCode', $this->cargoTypeCode, true);
        Model::validateRequired('flightAreaCode', $this->flightAreaCode, true);
        Model::validateRequired('transportTypeCode', $this->transportTypeCode, true);
        Model::validateRequired('transportMeansName', $this->transportMeansName, true);
        Model::validateRequired('startPlace', $this->startPlace, true);
        Model::validateRequired('destination', $this->destination, true);
        Model::validateRequired('claimAgentCode', $this->claimAgentCode, true);
        Model::validateRequired('mainItemCode', $this->mainItemCode, true);
        Model::validateRequired('mainItemContent', $this->mainItemContent, true);
        Model::validateRequired('cargoWorth', $this->cargoWorth, true);
        Model::validateRequired('rate', $this->rate, true);
        Model::validateRequired('premium', $this->premium, true);
        Model::validateRequired('insureStart', $this->insureStart, true);
        Model::validateRequired('saleDate', $this->saleDate, true);
        Model::validateMaxLength('tradeNo', $this->tradeNo, 50);
        Model::validateMaxLength('externalChannelCode', $this->externalChannelCode, 64);
        Model::validateMaxLength('externalProductCode', $this->externalProductCode, 64);
        Model::validateMaxLength('tbrName', $this->tbrName, 100);
        Model::validateMaxLength('tbrIdType', $this->tbrIdType, 40);
        Model::validateMaxLength('tbrIdNo', $this->tbrIdNo, 800);
        Model::validateMaxLength('bbrName', $this->bbrName, 100);
        Model::validateMaxLength('bbrIdType', $this->bbrIdType, 40);
        Model::validateMaxLength('bbrIdNo', $this->bbrIdNo, 800);
        Model::validateMaxLength('relatedOrderNo', $this->relatedOrderNo, 200);
        Model::validateMaxLength('cargoQuantity', $this->cargoQuantity, 20);
        Model::validateMaxLength('cargoName', $this->cargoName, 100);
        Model::validateMaxLength('packingCode', $this->packingCode, 2);
        Model::validateMaxLength('cargoTypeCode', $this->cargoTypeCode, 4);
        Model::validateMaxLength('flightAreaCode', $this->flightAreaCode, 10);
        Model::validateMaxLength('transportTypeCode', $this->transportTypeCode, 2);
        Model::validateMaxLength('transportMeansName', $this->transportMeansName, 30);
        Model::validateMaxLength('voyage', $this->voyage, 30);
        Model::validateMaxLength('startPlace', $this->startPlace, 200);
        Model::validateMaxLength('transitPoint', $this->transitPoint, 100);
        Model::validateMaxLength('destination', $this->destination, 200);
        Model::validateMaxLength('claimAgentCode', $this->claimAgentCode, 30);
        Model::validateMaxLength('mainItemCode', $this->mainItemCode, 12);
        Model::validateMaxLength('mainItemContent', $this->mainItemContent, 500);
        Model::validateMaxLength('specialize', $this->specialize, 500);
        Model::validateMaxLength('cargoWorth', $this->cargoWorth, 50);
        Model::validatePattern('insureStart', $this->insureStart, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('saleDate', $this->saleDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->relatedOrderNo) {
            $res['related_order_no'] = $this->relatedOrderNo;
        }
        if (null !== $this->cargoQuantity) {
            $res['cargo_quantity'] = $this->cargoQuantity;
        }
        if (null !== $this->cargoName) {
            $res['cargo_name'] = $this->cargoName;
        }
        if (null !== $this->packingCode) {
            $res['packing_code'] = $this->packingCode;
        }
        if (null !== $this->cargoTypeCode) {
            $res['cargo_type_code'] = $this->cargoTypeCode;
        }
        if (null !== $this->flightAreaCode) {
            $res['flight_area_code'] = $this->flightAreaCode;
        }
        if (null !== $this->transportTypeCode) {
            $res['transport_type_code'] = $this->transportTypeCode;
        }
        if (null !== $this->transportMeansName) {
            $res['transport_means_name'] = $this->transportMeansName;
        }
        if (null !== $this->voyage) {
            $res['voyage'] = $this->voyage;
        }
        if (null !== $this->startPlace) {
            $res['start_place'] = $this->startPlace;
        }
        if (null !== $this->transitPoint) {
            $res['transit_point'] = $this->transitPoint;
        }
        if (null !== $this->destination) {
            $res['destination'] = $this->destination;
        }
        if (null !== $this->claimAgentCode) {
            $res['claim_agent_code'] = $this->claimAgentCode;
        }
        if (null !== $this->mainItemCode) {
            $res['main_item_code'] = $this->mainItemCode;
        }
        if (null !== $this->mainItemContent) {
            $res['main_item_content'] = $this->mainItemContent;
        }
        if (null !== $this->mainItemAdds) {
            $res['main_item_adds'] = [];
            if (null !== $this->mainItemAdds && \is_array($this->mainItemAdds)) {
                $n = 0;
                foreach ($this->mainItemAdds as $item) {
                    $res['main_item_adds'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->specialize) {
            $res['specialize'] = $this->specialize;
        }
        if (null !== $this->cargoWorth) {
            $res['cargo_worth'] = $this->cargoWorth;
        }
        if (null !== $this->rate) {
            $res['rate'] = $this->rate;
        }
        if (null !== $this->premium) {
            $res['premium'] = $this->premium;
        }
        if (null !== $this->insureStart) {
            $res['insure_start'] = $this->insureStart;
        }
        if (null !== $this->saleDate) {
            $res['sale_date'] = $this->saleDate;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyInsuranceCbecRequest
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
        if (isset($map['related_order_no'])) {
            $model->relatedOrderNo = $map['related_order_no'];
        }
        if (isset($map['cargo_quantity'])) {
            $model->cargoQuantity = $map['cargo_quantity'];
        }
        if (isset($map['cargo_name'])) {
            $model->cargoName = $map['cargo_name'];
        }
        if (isset($map['packing_code'])) {
            $model->packingCode = $map['packing_code'];
        }
        if (isset($map['cargo_type_code'])) {
            $model->cargoTypeCode = $map['cargo_type_code'];
        }
        if (isset($map['flight_area_code'])) {
            $model->flightAreaCode = $map['flight_area_code'];
        }
        if (isset($map['transport_type_code'])) {
            $model->transportTypeCode = $map['transport_type_code'];
        }
        if (isset($map['transport_means_name'])) {
            $model->transportMeansName = $map['transport_means_name'];
        }
        if (isset($map['voyage'])) {
            $model->voyage = $map['voyage'];
        }
        if (isset($map['start_place'])) {
            $model->startPlace = $map['start_place'];
        }
        if (isset($map['transit_point'])) {
            $model->transitPoint = $map['transit_point'];
        }
        if (isset($map['destination'])) {
            $model->destination = $map['destination'];
        }
        if (isset($map['claim_agent_code'])) {
            $model->claimAgentCode = $map['claim_agent_code'];
        }
        if (isset($map['main_item_code'])) {
            $model->mainItemCode = $map['main_item_code'];
        }
        if (isset($map['main_item_content'])) {
            $model->mainItemContent = $map['main_item_content'];
        }
        if (isset($map['main_item_adds'])) {
            if (!empty($map['main_item_adds'])) {
                $model->mainItemAdds = [];
                $n                   = 0;
                foreach ($map['main_item_adds'] as $item) {
                    $model->mainItemAdds[$n++] = null !== $item ? MainItemAdd::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['specialize'])) {
            $model->specialize = $map['specialize'];
        }
        if (isset($map['cargo_worth'])) {
            $model->cargoWorth = $map['cargo_worth'];
        }
        if (isset($map['rate'])) {
            $model->rate = $map['rate'];
        }
        if (isset($map['premium'])) {
            $model->premium = $map['premium'];
        }
        if (isset($map['insure_start'])) {
            $model->insureStart = $map['insure_start'];
        }
        if (isset($map['sale_date'])) {
            $model->saleDate = $map['sale_date'];
        }

        return $model;
    }
}
