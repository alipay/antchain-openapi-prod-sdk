<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class ApplyInsuranceOspireportRequest extends Model
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

    // 保司编码，PAIC---平安
    /**
     * @var string
     */
    public $externalChannelCode;

    // 险种编码
    // 04--海外邮包险
    // 06--跨境邮包险
    /**
     * @var string
     */
    public $externalProductCode;

    // 保单号，申请理赔的保单号
    /**
     * @var string
     */
    public $policyNo;

    // 订单号，申请理赔所关联的订单号
    /**
     * @var string
     */
    public $relaOrderNo;

    // 出险时间，发生损失的时间，yyyy-MM-dd HH:mm:ss
    /**
     * @var string
     */
    public $accidentTime;

    // 报案人名称，申请报案人的名称
    /**
     * @var string
     */
    public $reporterName;

    // 报案人联系方式，申请报案人的联系方式
    /**
     * @var string
     */
    public $reporterContact;

    // 索赔金额，单位（元），最多支持2位小数，超2位小数拒绝
    /**
     * @var string
     */
    public $claimAmount;

    // 物流揽收时间，yyyy-MM-dd HH:mm:ss
    /**
     * @var string
     */
    public $collectDate;

    // 工单号，平台客服判责的工单号
    /**
     * @var string
     */
    public $jobNo;

    // 快递公司名称，实际的派送公司全称
    /**
     * @var string
     */
    public $courierCompany;

    // 快递单号，实际的派送快递单号
    /**
     * @var string
     */
    public $courierNumber;

    // 买家ID，买家的脱敏唯一标识
    /**
     * @var string
     */
    public $buyId;

    // 卖家ID，卖家的脱敏唯一标识
    /**
     * @var string
     */
    public $sellId;

    // 站点/仓储ID，站点/仓储的脱敏唯一标识
    /**
     * @var string
     */
    public $siteId;

    // 货物名称，实际的货物名称
    /**
     * @var string
     */
    public $cargoName;

    // 货物的重量，单位(kg)，最多支持6位小数
    /**
     * @var string
     */
    public $cargoWeight;

    // 出发地地址，货物的出发地地址
    /**
     * @var string
     */
    public $startPlace;

    // 目的地地址，货物的目的地地址
    /**
     * @var string
     */
    public $destination;

    // ISO到达国别，包裹业务实际发生的国家
    /**
     * @var string
     */
    public $isoCountry;

    // 出险地址，货物发生实际损失的最近的一次地址记录
    /**
     * @var string
     */
    public $accidentAddress;

    // 平台赔款支付时间，平台先行赔付的时间，yyyy-MM-dd HH:mm:ss
    /**
     * @var string
     */
    public $paymentTime;

    // 赔付项目类型，01-运费，02-货值，03-货值2
    /**
     * @var string
     */
    public $paymentItem;

    // 出险类型，赔付的出险类型，届时保司和平台方商定
    /**
     * @var string
     */
    public $accidentType;

    // 索赔资料附件，最多10个
    /**
     * @var ClaimInformation[]
     */
    public $claimInformations;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'tradeNo'             => 'trade_no',
        'externalChannelCode' => 'external_channel_code',
        'externalProductCode' => 'external_product_code',
        'policyNo'            => 'policy_no',
        'relaOrderNo'         => 'rela_order_no',
        'accidentTime'        => 'accident_time',
        'reporterName'        => 'reporter_name',
        'reporterContact'     => 'reporter_contact',
        'claimAmount'         => 'claim_amount',
        'collectDate'         => 'collect_date',
        'jobNo'               => 'job_no',
        'courierCompany'      => 'courier_company',
        'courierNumber'       => 'courier_number',
        'buyId'               => 'buy_id',
        'sellId'              => 'sell_id',
        'siteId'              => 'site_id',
        'cargoName'           => 'cargo_name',
        'cargoWeight'         => 'cargo_weight',
        'startPlace'          => 'start_place',
        'destination'         => 'destination',
        'isoCountry'          => 'iso_country',
        'accidentAddress'     => 'accident_address',
        'paymentTime'         => 'payment_time',
        'paymentItem'         => 'payment_item',
        'accidentType'        => 'accident_type',
        'claimInformations'   => 'claim_informations',
    ];

    public function validate()
    {
        Model::validateRequired('tradeNo', $this->tradeNo, true);
        Model::validateRequired('externalChannelCode', $this->externalChannelCode, true);
        Model::validateRequired('externalProductCode', $this->externalProductCode, true);
        Model::validateRequired('policyNo', $this->policyNo, true);
        Model::validateRequired('relaOrderNo', $this->relaOrderNo, true);
        Model::validateRequired('accidentTime', $this->accidentTime, true);
        Model::validateRequired('reporterName', $this->reporterName, true);
        Model::validateRequired('reporterContact', $this->reporterContact, true);
        Model::validateRequired('claimAmount', $this->claimAmount, true);
        Model::validateRequired('collectDate', $this->collectDate, true);
        Model::validateRequired('jobNo', $this->jobNo, true);
        Model::validateRequired('courierCompany', $this->courierCompany, true);
        Model::validateRequired('courierNumber', $this->courierNumber, true);
        Model::validateRequired('buyId', $this->buyId, true);
        Model::validateRequired('sellId', $this->sellId, true);
        Model::validateRequired('cargoName', $this->cargoName, true);
        Model::validateRequired('cargoWeight', $this->cargoWeight, true);
        Model::validateRequired('startPlace', $this->startPlace, true);
        Model::validateRequired('destination', $this->destination, true);
        Model::validateRequired('isoCountry', $this->isoCountry, true);
        Model::validateRequired('accidentAddress', $this->accidentAddress, true);
        Model::validateRequired('paymentTime', $this->paymentTime, true);
        Model::validateRequired('paymentItem', $this->paymentItem, true);
        Model::validateRequired('accidentType', $this->accidentType, true);
        Model::validateRequired('claimInformations', $this->claimInformations, true);
        Model::validateMaxLength('tradeNo', $this->tradeNo, 50);
        Model::validateMaxLength('externalChannelCode', $this->externalChannelCode, 10);
        Model::validateMaxLength('externalProductCode', $this->externalProductCode, 2);
        Model::validateMaxLength('policyNo', $this->policyNo, 200);
        Model::validateMaxLength('relaOrderNo', $this->relaOrderNo, 200);
        Model::validateMaxLength('reporterName', $this->reporterName, 100);
        Model::validateMaxLength('reporterContact', $this->reporterContact, 20);
        Model::validateMaxLength('jobNo', $this->jobNo, 100);
        Model::validateMaxLength('courierCompany', $this->courierCompany, 200);
        Model::validateMaxLength('courierNumber', $this->courierNumber, 100);
        Model::validateMaxLength('buyId', $this->buyId, 100);
        Model::validateMaxLength('sellId', $this->sellId, 100);
        Model::validateMaxLength('siteId', $this->siteId, 100);
        Model::validateMaxLength('cargoName', $this->cargoName, 200);
        Model::validateMaxLength('cargoWeight', $this->cargoWeight, 20);
        Model::validateMaxLength('startPlace', $this->startPlace, 500);
        Model::validateMaxLength('destination', $this->destination, 500);
        Model::validateMaxLength('isoCountry', $this->isoCountry, 10);
        Model::validateMaxLength('accidentAddress', $this->accidentAddress, 500);
        Model::validateMaxLength('paymentItem', $this->paymentItem, 2);
        Model::validateMaxLength('accidentType', $this->accidentType, 20);
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
        if (null !== $this->policyNo) {
            $res['policy_no'] = $this->policyNo;
        }
        if (null !== $this->relaOrderNo) {
            $res['rela_order_no'] = $this->relaOrderNo;
        }
        if (null !== $this->accidentTime) {
            $res['accident_time'] = $this->accidentTime;
        }
        if (null !== $this->reporterName) {
            $res['reporter_name'] = $this->reporterName;
        }
        if (null !== $this->reporterContact) {
            $res['reporter_contact'] = $this->reporterContact;
        }
        if (null !== $this->claimAmount) {
            $res['claim_amount'] = $this->claimAmount;
        }
        if (null !== $this->collectDate) {
            $res['collect_date'] = $this->collectDate;
        }
        if (null !== $this->jobNo) {
            $res['job_no'] = $this->jobNo;
        }
        if (null !== $this->courierCompany) {
            $res['courier_company'] = $this->courierCompany;
        }
        if (null !== $this->courierNumber) {
            $res['courier_number'] = $this->courierNumber;
        }
        if (null !== $this->buyId) {
            $res['buy_id'] = $this->buyId;
        }
        if (null !== $this->sellId) {
            $res['sell_id'] = $this->sellId;
        }
        if (null !== $this->siteId) {
            $res['site_id'] = $this->siteId;
        }
        if (null !== $this->cargoName) {
            $res['cargo_name'] = $this->cargoName;
        }
        if (null !== $this->cargoWeight) {
            $res['cargo_weight'] = $this->cargoWeight;
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
        if (null !== $this->accidentAddress) {
            $res['accident_address'] = $this->accidentAddress;
        }
        if (null !== $this->paymentTime) {
            $res['payment_time'] = $this->paymentTime;
        }
        if (null !== $this->paymentItem) {
            $res['payment_item'] = $this->paymentItem;
        }
        if (null !== $this->accidentType) {
            $res['accident_type'] = $this->accidentType;
        }
        if (null !== $this->claimInformations) {
            $res['claim_informations'] = [];
            if (null !== $this->claimInformations && \is_array($this->claimInformations)) {
                $n = 0;
                foreach ($this->claimInformations as $item) {
                    $res['claim_informations'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyInsuranceOspireportRequest
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
        if (isset($map['policy_no'])) {
            $model->policyNo = $map['policy_no'];
        }
        if (isset($map['rela_order_no'])) {
            $model->relaOrderNo = $map['rela_order_no'];
        }
        if (isset($map['accident_time'])) {
            $model->accidentTime = $map['accident_time'];
        }
        if (isset($map['reporter_name'])) {
            $model->reporterName = $map['reporter_name'];
        }
        if (isset($map['reporter_contact'])) {
            $model->reporterContact = $map['reporter_contact'];
        }
        if (isset($map['claim_amount'])) {
            $model->claimAmount = $map['claim_amount'];
        }
        if (isset($map['collect_date'])) {
            $model->collectDate = $map['collect_date'];
        }
        if (isset($map['job_no'])) {
            $model->jobNo = $map['job_no'];
        }
        if (isset($map['courier_company'])) {
            $model->courierCompany = $map['courier_company'];
        }
        if (isset($map['courier_number'])) {
            $model->courierNumber = $map['courier_number'];
        }
        if (isset($map['buy_id'])) {
            $model->buyId = $map['buy_id'];
        }
        if (isset($map['sell_id'])) {
            $model->sellId = $map['sell_id'];
        }
        if (isset($map['site_id'])) {
            $model->siteId = $map['site_id'];
        }
        if (isset($map['cargo_name'])) {
            $model->cargoName = $map['cargo_name'];
        }
        if (isset($map['cargo_weight'])) {
            $model->cargoWeight = $map['cargo_weight'];
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
        if (isset($map['accident_address'])) {
            $model->accidentAddress = $map['accident_address'];
        }
        if (isset($map['payment_time'])) {
            $model->paymentTime = $map['payment_time'];
        }
        if (isset($map['payment_item'])) {
            $model->paymentItem = $map['payment_item'];
        }
        if (isset($map['accident_type'])) {
            $model->accidentType = $map['accident_type'];
        }
        if (isset($map['claim_informations'])) {
            if (!empty($map['claim_informations'])) {
                $model->claimInformations = [];
                $n                        = 0;
                foreach ($map['claim_informations'] as $item) {
                    $model->claimInformations[$n++] = null !== $item ? ClaimInformation::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
