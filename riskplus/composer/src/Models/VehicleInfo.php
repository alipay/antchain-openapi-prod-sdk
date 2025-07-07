<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class VehicleInfo extends Model
{
    // 流量方购物订单号
    /**
     * @example xxxx
     *
     * @var string
     */
    public $bizOrderNo;

    // 订单[分期]金额，单位：元
    /**
     * @example 199.88
     *
     * @var string
     */
    public $tradeAmount;

    // 订单分期金额，单位：元
    /**
     * @example 188.88
     *
     * @var string
     */
    public $installmentAmount;

    // 首付金额，单位：元
    /**
     * @example 199.00
     *
     * @var string
     */
    public $downPayment;

    // pad设备提供
    /**
     * @example xxx
     *
     * @var string
     */
    public $wifiMac;

    // SN码/中控号(授信后放款前)
    /**
     * @example xxx
     *
     * @var string
     */
    public $sn;

    // 车驾号(授信后放款前)
    /**
     * @example xxx
     *
     * @var string
     */
    public $frameNo;

    // SKU ID
    /**
     * @example xxxx
     *
     * @var string
     */
    public $sku;

    // 颜色
    /**
     * @example xxxx
     *
     * @var string
     */
    public $color;

    // 车型关键词
    /**
     * @example xxx
     *
     * @var string
     */
    public $modelKeyword;

    // 续航里程
    /**
     * @example 1024
     *
     * @var string
     */
    public $range;

    // 新车指导价，单位：元
    /**
     * @example 199.88
     *
     * @var string
     */
    public $guidePrice;

    // 售价，单位：元
    /**
     * @example 1999.98
     *
     * @var string
     */
    public $sellingPrice;

    // 品牌
    /**
     * @example xxxx
     *
     * @var string
     */
    public $brand;

    // 车型
    /**
     * @example xxxx
     *
     * @var string
     */
    public $model;

    // 年款，yyyy
    /**
     * @example yyyy
     *
     * @var string
     */
    public $modelYear;

    // 公里数，Odometer
    /**
     * @example xxxx
     *
     * @var string
     */
    public $odo;

    // 首次上牌时间
    /**
     * @example xxxx
     *
     * @var string
     */
    public $firstRegDate;

    // 过户次数，Ownership Transfer Records
    /**
     * @example xxxx
     *
     * @var string
     */
    public $otr;

    // 配件信息
    /**
     * @example xxxx
     *
     * @var string
     */
    public $parts;
    protected $_name = [
        'bizOrderNo'        => 'biz_order_no',
        'tradeAmount'       => 'trade_amount',
        'installmentAmount' => 'installment_amount',
        'downPayment'       => 'down_payment',
        'wifiMac'           => 'wifi_mac',
        'sn'                => 'sn',
        'frameNo'           => 'frame_no',
        'sku'               => 'sku',
        'color'             => 'color',
        'modelKeyword'      => 'model_keyword',
        'range'             => 'range',
        'guidePrice'        => 'guide_price',
        'sellingPrice'      => 'selling_price',
        'brand'             => 'brand',
        'model'             => 'model',
        'modelYear'         => 'model_year',
        'odo'               => 'odo',
        'firstRegDate'      => 'first_reg_date',
        'otr'               => 'otr',
        'parts'             => 'parts',
    ];

    public function validate()
    {
        Model::validateRequired('bizOrderNo', $this->bizOrderNo, true);
        Model::validateRequired('tradeAmount', $this->tradeAmount, true);
        Model::validateRequired('sku', $this->sku, true);
        Model::validateRequired('guidePrice', $this->guidePrice, true);
        Model::validateRequired('sellingPrice', $this->sellingPrice, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->bizOrderNo) {
            $res['biz_order_no'] = $this->bizOrderNo;
        }
        if (null !== $this->tradeAmount) {
            $res['trade_amount'] = $this->tradeAmount;
        }
        if (null !== $this->installmentAmount) {
            $res['installment_amount'] = $this->installmentAmount;
        }
        if (null !== $this->downPayment) {
            $res['down_payment'] = $this->downPayment;
        }
        if (null !== $this->wifiMac) {
            $res['wifi_mac'] = $this->wifiMac;
        }
        if (null !== $this->sn) {
            $res['sn'] = $this->sn;
        }
        if (null !== $this->frameNo) {
            $res['frame_no'] = $this->frameNo;
        }
        if (null !== $this->sku) {
            $res['sku'] = $this->sku;
        }
        if (null !== $this->color) {
            $res['color'] = $this->color;
        }
        if (null !== $this->modelKeyword) {
            $res['model_keyword'] = $this->modelKeyword;
        }
        if (null !== $this->range) {
            $res['range'] = $this->range;
        }
        if (null !== $this->guidePrice) {
            $res['guide_price'] = $this->guidePrice;
        }
        if (null !== $this->sellingPrice) {
            $res['selling_price'] = $this->sellingPrice;
        }
        if (null !== $this->brand) {
            $res['brand'] = $this->brand;
        }
        if (null !== $this->model) {
            $res['model'] = $this->model;
        }
        if (null !== $this->modelYear) {
            $res['model_year'] = $this->modelYear;
        }
        if (null !== $this->odo) {
            $res['odo'] = $this->odo;
        }
        if (null !== $this->firstRegDate) {
            $res['first_reg_date'] = $this->firstRegDate;
        }
        if (null !== $this->otr) {
            $res['otr'] = $this->otr;
        }
        if (null !== $this->parts) {
            $res['parts'] = $this->parts;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VehicleInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['biz_order_no'])) {
            $model->bizOrderNo = $map['biz_order_no'];
        }
        if (isset($map['trade_amount'])) {
            $model->tradeAmount = $map['trade_amount'];
        }
        if (isset($map['installment_amount'])) {
            $model->installmentAmount = $map['installment_amount'];
        }
        if (isset($map['down_payment'])) {
            $model->downPayment = $map['down_payment'];
        }
        if (isset($map['wifi_mac'])) {
            $model->wifiMac = $map['wifi_mac'];
        }
        if (isset($map['sn'])) {
            $model->sn = $map['sn'];
        }
        if (isset($map['frame_no'])) {
            $model->frameNo = $map['frame_no'];
        }
        if (isset($map['sku'])) {
            $model->sku = $map['sku'];
        }
        if (isset($map['color'])) {
            $model->color = $map['color'];
        }
        if (isset($map['model_keyword'])) {
            $model->modelKeyword = $map['model_keyword'];
        }
        if (isset($map['range'])) {
            $model->range = $map['range'];
        }
        if (isset($map['guide_price'])) {
            $model->guidePrice = $map['guide_price'];
        }
        if (isset($map['selling_price'])) {
            $model->sellingPrice = $map['selling_price'];
        }
        if (isset($map['brand'])) {
            $model->brand = $map['brand'];
        }
        if (isset($map['model'])) {
            $model->model = $map['model'];
        }
        if (isset($map['model_year'])) {
            $model->modelYear = $map['model_year'];
        }
        if (isset($map['odo'])) {
            $model->odo = $map['odo'];
        }
        if (isset($map['first_reg_date'])) {
            $model->firstRegDate = $map['first_reg_date'];
        }
        if (isset($map['otr'])) {
            $model->otr = $map['otr'];
        }
        if (isset($map['parts'])) {
            $model->parts = $map['parts'];
        }

        return $model;
    }
}
