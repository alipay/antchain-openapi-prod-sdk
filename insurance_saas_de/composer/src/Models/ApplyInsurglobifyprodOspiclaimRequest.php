<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INSURANCE_SAAS_DE\Models;

use AlibabaCloud\Tea\Model;

class ApplyInsurglobifyprodOspiclaimRequest extends Model
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

    // 大保单号
    /**
     * @var string
     */
    public $bigPolNo;

    // 投保订单号
    /**
     * @var string
     */
    public $relaOrderNo;

    // 受损货物名称
    /**
     * @var string
     */
    public $damagedCargoName;

    // 出险原因
    /**
     * @var string
     */
    public $incidentCause;

    // 出险日期(ISO 8601格式，2026-01-11T14:30:00+02:00)
    /**
     * @var string
     */
    public $accidentTime;

    // 销售日期(ISO 8601格式，2026-01-11T14:30:00+02:00)
    /**
     * @var string
     */
    public $saleDate;

    // 时区
    // Asia/Shanghai
    // Europe/Berlin
    // America/New_York
    // Pacific/Auckland
    // Europe/Berlin
    /**
     * @var string
     */
    public $timezone;

    // 索赔状态（Open / Under Review / In Payment Process / Closed / Rejected / Cancelled）
    /**
     * @var string
     */
    public $claimStatus;

    // 货物大类
    /**
     * @var string
     */
    public $cargoType;

    // 平台赔付日期(ISO 8601格式，2026-01-11T14:30:00+02:00)
    /**
     * @var string
     */
    public $claimPaidTime;

    // 索赔类别(Valid / Fraudulent / Invalid
    /**
     * @var string
     */
    public $claimCategory;

    // 索赔被拒原因
    /**
     * @var string
     */
    public $claimPaidDesc;

    // 索赔总金额，小数位只支持2位
    /**
     * @var string
     */
    public $claimPaidAmount;

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

    // 索赔事件类型(Loss / Theft / Breakage / Non-Delivery）
    /**
     * @var string
     */
    public $claimIncidentType;

    // 索赔事件详情情况
    /**
     * @var string
     */
    public $claimVerdictDesc;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'tradeNo'             => 'trade_no',
        'externalChannelCode' => 'external_channel_code',
        'externalProductCode' => 'external_product_code',
        'bigPolNo'            => 'big_pol_no',
        'relaOrderNo'         => 'rela_order_no',
        'damagedCargoName'    => 'damaged_cargo_name',
        'incidentCause'       => 'incident_cause',
        'accidentTime'        => 'accident_time',
        'saleDate'            => 'sale_date',
        'timezone'            => 'timezone',
        'claimStatus'         => 'claim_status',
        'cargoType'           => 'cargo_type',
        'claimPaidTime'       => 'claim_paid_time',
        'claimCategory'       => 'claim_category',
        'claimPaidDesc'       => 'claim_paid_desc',
        'claimPaidAmount'     => 'claim_paid_amount',
        'currency'            => 'currency',
        'claimIncidentType'   => 'claim_incident_type',
        'claimVerdictDesc'    => 'claim_verdict_desc',
    ];

    public function validate()
    {
        Model::validateRequired('tradeNo', $this->tradeNo, true);
        Model::validateRequired('externalChannelCode', $this->externalChannelCode, true);
        Model::validateRequired('externalProductCode', $this->externalProductCode, true);
        Model::validateRequired('bigPolNo', $this->bigPolNo, true);
        Model::validateRequired('relaOrderNo', $this->relaOrderNo, true);
        Model::validateRequired('damagedCargoName', $this->damagedCargoName, true);
        Model::validateRequired('incidentCause', $this->incidentCause, true);
        Model::validateRequired('accidentTime', $this->accidentTime, true);
        Model::validateRequired('saleDate', $this->saleDate, true);
        Model::validateRequired('timezone', $this->timezone, true);
        Model::validateRequired('claimStatus', $this->claimStatus, true);
        Model::validateRequired('cargoType', $this->cargoType, true);
        Model::validateRequired('claimPaidTime', $this->claimPaidTime, true);
        Model::validateRequired('claimCategory', $this->claimCategory, true);
        Model::validateRequired('claimPaidDesc', $this->claimPaidDesc, true);
        Model::validateRequired('claimPaidAmount', $this->claimPaidAmount, true);
        Model::validateRequired('currency', $this->currency, true);
        Model::validateRequired('claimIncidentType', $this->claimIncidentType, true);
        Model::validateRequired('claimVerdictDesc', $this->claimVerdictDesc, true);
        Model::validateMaxLength('tradeNo', $this->tradeNo, 50);
        Model::validateMaxLength('externalChannelCode', $this->externalChannelCode, 10);
        Model::validateMaxLength('externalProductCode', $this->externalProductCode, 10);
        Model::validateMaxLength('bigPolNo', $this->bigPolNo, 200);
        Model::validateMaxLength('relaOrderNo', $this->relaOrderNo, 100);
        Model::validateMaxLength('damagedCargoName', $this->damagedCargoName, 100);
        Model::validateMaxLength('incidentCause', $this->incidentCause, 50);
        Model::validateMaxLength('accidentTime', $this->accidentTime, 50);
        Model::validateMaxLength('saleDate', $this->saleDate, 50);
        Model::validateMaxLength('timezone', $this->timezone, 20);
        Model::validateMaxLength('claimStatus', $this->claimStatus, 20);
        Model::validateMaxLength('cargoType', $this->cargoType, 256);
        Model::validateMaxLength('claimPaidTime', $this->claimPaidTime, 50);
        Model::validateMaxLength('claimCategory', $this->claimCategory, 20);
        Model::validateMaxLength('claimPaidDesc', $this->claimPaidDesc, 256);
        Model::validateMaxLength('claimPaidAmount', $this->claimPaidAmount, 20);
        Model::validateMaxLength('claimIncidentType', $this->claimIncidentType, 20);
        Model::validateMaxLength('claimVerdictDesc', $this->claimVerdictDesc, 526);
        Model::validateMinLength('currency', $this->currency, 3);
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
        if (null !== $this->bigPolNo) {
            $res['big_pol_no'] = $this->bigPolNo;
        }
        if (null !== $this->relaOrderNo) {
            $res['rela_order_no'] = $this->relaOrderNo;
        }
        if (null !== $this->damagedCargoName) {
            $res['damaged_cargo_name'] = $this->damagedCargoName;
        }
        if (null !== $this->incidentCause) {
            $res['incident_cause'] = $this->incidentCause;
        }
        if (null !== $this->accidentTime) {
            $res['accident_time'] = $this->accidentTime;
        }
        if (null !== $this->saleDate) {
            $res['sale_date'] = $this->saleDate;
        }
        if (null !== $this->timezone) {
            $res['timezone'] = $this->timezone;
        }
        if (null !== $this->claimStatus) {
            $res['claim_status'] = $this->claimStatus;
        }
        if (null !== $this->cargoType) {
            $res['cargo_type'] = $this->cargoType;
        }
        if (null !== $this->claimPaidTime) {
            $res['claim_paid_time'] = $this->claimPaidTime;
        }
        if (null !== $this->claimCategory) {
            $res['claim_category'] = $this->claimCategory;
        }
        if (null !== $this->claimPaidDesc) {
            $res['claim_paid_desc'] = $this->claimPaidDesc;
        }
        if (null !== $this->claimPaidAmount) {
            $res['claim_paid_amount'] = $this->claimPaidAmount;
        }
        if (null !== $this->currency) {
            $res['currency'] = $this->currency;
        }
        if (null !== $this->claimIncidentType) {
            $res['claim_incident_type'] = $this->claimIncidentType;
        }
        if (null !== $this->claimVerdictDesc) {
            $res['claim_verdict_desc'] = $this->claimVerdictDesc;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyInsurglobifyprodOspiclaimRequest
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
        if (isset($map['big_pol_no'])) {
            $model->bigPolNo = $map['big_pol_no'];
        }
        if (isset($map['rela_order_no'])) {
            $model->relaOrderNo = $map['rela_order_no'];
        }
        if (isset($map['damaged_cargo_name'])) {
            $model->damagedCargoName = $map['damaged_cargo_name'];
        }
        if (isset($map['incident_cause'])) {
            $model->incidentCause = $map['incident_cause'];
        }
        if (isset($map['accident_time'])) {
            $model->accidentTime = $map['accident_time'];
        }
        if (isset($map['sale_date'])) {
            $model->saleDate = $map['sale_date'];
        }
        if (isset($map['timezone'])) {
            $model->timezone = $map['timezone'];
        }
        if (isset($map['claim_status'])) {
            $model->claimStatus = $map['claim_status'];
        }
        if (isset($map['cargo_type'])) {
            $model->cargoType = $map['cargo_type'];
        }
        if (isset($map['claim_paid_time'])) {
            $model->claimPaidTime = $map['claim_paid_time'];
        }
        if (isset($map['claim_category'])) {
            $model->claimCategory = $map['claim_category'];
        }
        if (isset($map['claim_paid_desc'])) {
            $model->claimPaidDesc = $map['claim_paid_desc'];
        }
        if (isset($map['claim_paid_amount'])) {
            $model->claimPaidAmount = $map['claim_paid_amount'];
        }
        if (isset($map['currency'])) {
            $model->currency = $map['currency'];
        }
        if (isset($map['claim_incident_type'])) {
            $model->claimIncidentType = $map['claim_incident_type'];
        }
        if (isset($map['claim_verdict_desc'])) {
            $model->claimVerdictDesc = $map['claim_verdict_desc'];
        }

        return $model;
    }
}
