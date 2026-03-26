<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INTELLICAR\Models;

use AlibabaCloud\Tea\Model;

class BatteryReportData extends Model
{
    // VIN码
    /**
     * @example -
     *
     * @var string
     */
    public $vinCode;

    // 评估时间，报告生成时间 yyyy-MM-dd HH:mm:ss
    /**
     * @example -
     *
     * @var string
     */
    public $evaluateTime;

    // 当前 SOH（%），数值 0-100
    /**
     * @example 12
     *
     * @var string
     */
    public $currentSoh;

    // SOH 评级：优秀 100-95 良好 95-90 中等 90-85 较差 85-80 差 80 以下
    /**
     * @example -
     *
     * @var string
     */
    public $sohLvStr;

    // 电池衰退水平值
    /**
     * @example 1
     *
     * @var string
     */
    public $volumeScoreRecession;

    // 安全风险水平：低 较低 较高 高
    /**
     * @example -
     *
     * @var string
     */
    public $volumeScoreRecessionLvStr;

    // 安全风险水平解读文案
    /**
     * @example -
     *
     * @var string
     */
    public $volumeScoreRecessionNarrate;

    // 保障状态 0：未保障 1：保障中 2：保障结束
    /**
     * @example
     *
     * @var int
     */
    public $safeguardStatus;

    // 保障截止期 yyyy-MM-dd HH:mm:ss
    /**
     * @example -
     *
     * @var string
     */
    public $safeguardEndTime;

    // 本轮首检 SOH（%）数值 0-100
    /**
     * @example 1
     *
     * @var string
     */
    public $initialSoh;

    // 本轮首检 评估时间 yyyy-MM-dd HH:mm:ss
    /**
     * @example -
     *
     * @var string
     */
    public $initialSohEvaluateTime;

    // 本轮首检 充电单号
    /**
     * @example -
     *
     * @var string
     */
    public $initialChargeSeq;

    // 触发赔付 SOH（%），数值 0-100
    /**
     * @example 1
     *
     * @var string
     */
    public $sageguardMaxSubSoh;

    // 是否触发赔付，当前 SOH≤触发赔付 SOH 时为 true
    /**
     * @example true, false
     *
     * @var bool
     */
    public $compensationTriggered;

    // SOH 衰退预测-X 轴标题（年）
    /**
     * @example
     *
     * @var string[]
     */
    public $yearSohTitle;

    // 本车电池衰退预测，逐年 SOH（%）
    /**
     * @example
     *
     * @var string[]
     */
    public $curEstimateYearSoh;

    // 同类型车电池衰退预测，逐年 SOH（%）
    /**
     * @example
     *
     * @var string[]
     */
    public $peerEstimateYearSoh;

    // 电池厂商
    /**
     * @example -
     *
     * @var string
     */
    public $batteryManufacturer;

    // 标称能量，单位 kWh
    /**
     * @example 1
     *
     * @var string
     */
    public $nominalEnergy;

    // 标称容量，单位 Ah
    /**
     * @example 1
     *
     * @var string
     */
    public $rateCapacity;

    // 电池类型
    /**
     * @example -
     *
     * @var string
     */
    public $batteryType;

    // 车辆生产年份
    /**
     * @example -
     *
     * @var string
     */
    public $manufacturerDate;

    // 权益说明文案
    /**
     * @example -
     *
     * @var string
     */
    public $rightsDesc;
    protected $_name = [
        'vinCode'                     => 'vin_code',
        'evaluateTime'                => 'evaluate_time',
        'currentSoh'                  => 'current_soh',
        'sohLvStr'                    => 'soh_lv_str',
        'volumeScoreRecession'        => 'volume_score_recession',
        'volumeScoreRecessionLvStr'   => 'volume_score_recession_lv_str',
        'volumeScoreRecessionNarrate' => 'volume_score_recession_narrate',
        'safeguardStatus'             => 'safeguard_status',
        'safeguardEndTime'            => 'safeguard_end_time',
        'initialSoh'                  => 'initial_soh',
        'initialSohEvaluateTime'      => 'initial_soh_evaluate_time',
        'initialChargeSeq'            => 'initial_charge_seq',
        'sageguardMaxSubSoh'          => 'sageguard_max_sub_soh',
        'compensationTriggered'       => 'compensation_triggered',
        'yearSohTitle'                => 'year_soh_title',
        'curEstimateYearSoh'          => 'cur_estimate_year_soh',
        'peerEstimateYearSoh'         => 'peer_estimate_year_soh',
        'batteryManufacturer'         => 'battery_manufacturer',
        'nominalEnergy'               => 'nominal_energy',
        'rateCapacity'                => 'rate_capacity',
        'batteryType'                 => 'battery_type',
        'manufacturerDate'            => 'manufacturer_date',
        'rightsDesc'                  => 'rights_desc',
    ];

    public function validate()
    {
        Model::validateRequired('vinCode', $this->vinCode, true);
        Model::validateRequired('evaluateTime', $this->evaluateTime, true);
        Model::validateRequired('currentSoh', $this->currentSoh, true);
        Model::validateRequired('sohLvStr', $this->sohLvStr, true);
        Model::validateRequired('volumeScoreRecession', $this->volumeScoreRecession, true);
        Model::validateRequired('volumeScoreRecessionLvStr', $this->volumeScoreRecessionLvStr, true);
        Model::validateRequired('volumeScoreRecessionNarrate', $this->volumeScoreRecessionNarrate, true);
        Model::validateRequired('safeguardStatus', $this->safeguardStatus, true);
        Model::validateRequired('safeguardEndTime', $this->safeguardEndTime, true);
        Model::validateRequired('initialSoh', $this->initialSoh, true);
        Model::validateRequired('initialSohEvaluateTime', $this->initialSohEvaluateTime, true);
        Model::validateRequired('initialChargeSeq', $this->initialChargeSeq, true);
        Model::validateRequired('sageguardMaxSubSoh', $this->sageguardMaxSubSoh, true);
        Model::validateRequired('compensationTriggered', $this->compensationTriggered, true);
        Model::validateRequired('yearSohTitle', $this->yearSohTitle, true);
        Model::validateRequired('curEstimateYearSoh', $this->curEstimateYearSoh, true);
        Model::validateRequired('peerEstimateYearSoh', $this->peerEstimateYearSoh, true);
        Model::validateRequired('batteryManufacturer', $this->batteryManufacturer, true);
        Model::validateRequired('nominalEnergy', $this->nominalEnergy, true);
        Model::validateRequired('rateCapacity', $this->rateCapacity, true);
        Model::validateRequired('batteryType', $this->batteryType, true);
        Model::validateRequired('manufacturerDate', $this->manufacturerDate, true);
        Model::validateRequired('rightsDesc', $this->rightsDesc, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->vinCode) {
            $res['vin_code'] = $this->vinCode;
        }
        if (null !== $this->evaluateTime) {
            $res['evaluate_time'] = $this->evaluateTime;
        }
        if (null !== $this->currentSoh) {
            $res['current_soh'] = $this->currentSoh;
        }
        if (null !== $this->sohLvStr) {
            $res['soh_lv_str'] = $this->sohLvStr;
        }
        if (null !== $this->volumeScoreRecession) {
            $res['volume_score_recession'] = $this->volumeScoreRecession;
        }
        if (null !== $this->volumeScoreRecessionLvStr) {
            $res['volume_score_recession_lv_str'] = $this->volumeScoreRecessionLvStr;
        }
        if (null !== $this->volumeScoreRecessionNarrate) {
            $res['volume_score_recession_narrate'] = $this->volumeScoreRecessionNarrate;
        }
        if (null !== $this->safeguardStatus) {
            $res['safeguard_status'] = $this->safeguardStatus;
        }
        if (null !== $this->safeguardEndTime) {
            $res['safeguard_end_time'] = $this->safeguardEndTime;
        }
        if (null !== $this->initialSoh) {
            $res['initial_soh'] = $this->initialSoh;
        }
        if (null !== $this->initialSohEvaluateTime) {
            $res['initial_soh_evaluate_time'] = $this->initialSohEvaluateTime;
        }
        if (null !== $this->initialChargeSeq) {
            $res['initial_charge_seq'] = $this->initialChargeSeq;
        }
        if (null !== $this->sageguardMaxSubSoh) {
            $res['sageguard_max_sub_soh'] = $this->sageguardMaxSubSoh;
        }
        if (null !== $this->compensationTriggered) {
            $res['compensation_triggered'] = $this->compensationTriggered;
        }
        if (null !== $this->yearSohTitle) {
            $res['year_soh_title'] = $this->yearSohTitle;
        }
        if (null !== $this->curEstimateYearSoh) {
            $res['cur_estimate_year_soh'] = $this->curEstimateYearSoh;
        }
        if (null !== $this->peerEstimateYearSoh) {
            $res['peer_estimate_year_soh'] = $this->peerEstimateYearSoh;
        }
        if (null !== $this->batteryManufacturer) {
            $res['battery_manufacturer'] = $this->batteryManufacturer;
        }
        if (null !== $this->nominalEnergy) {
            $res['nominal_energy'] = $this->nominalEnergy;
        }
        if (null !== $this->rateCapacity) {
            $res['rate_capacity'] = $this->rateCapacity;
        }
        if (null !== $this->batteryType) {
            $res['battery_type'] = $this->batteryType;
        }
        if (null !== $this->manufacturerDate) {
            $res['manufacturer_date'] = $this->manufacturerDate;
        }
        if (null !== $this->rightsDesc) {
            $res['rights_desc'] = $this->rightsDesc;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatteryReportData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['vin_code'])) {
            $model->vinCode = $map['vin_code'];
        }
        if (isset($map['evaluate_time'])) {
            $model->evaluateTime = $map['evaluate_time'];
        }
        if (isset($map['current_soh'])) {
            $model->currentSoh = $map['current_soh'];
        }
        if (isset($map['soh_lv_str'])) {
            $model->sohLvStr = $map['soh_lv_str'];
        }
        if (isset($map['volume_score_recession'])) {
            $model->volumeScoreRecession = $map['volume_score_recession'];
        }
        if (isset($map['volume_score_recession_lv_str'])) {
            $model->volumeScoreRecessionLvStr = $map['volume_score_recession_lv_str'];
        }
        if (isset($map['volume_score_recession_narrate'])) {
            $model->volumeScoreRecessionNarrate = $map['volume_score_recession_narrate'];
        }
        if (isset($map['safeguard_status'])) {
            $model->safeguardStatus = $map['safeguard_status'];
        }
        if (isset($map['safeguard_end_time'])) {
            $model->safeguardEndTime = $map['safeguard_end_time'];
        }
        if (isset($map['initial_soh'])) {
            $model->initialSoh = $map['initial_soh'];
        }
        if (isset($map['initial_soh_evaluate_time'])) {
            $model->initialSohEvaluateTime = $map['initial_soh_evaluate_time'];
        }
        if (isset($map['initial_charge_seq'])) {
            $model->initialChargeSeq = $map['initial_charge_seq'];
        }
        if (isset($map['sageguard_max_sub_soh'])) {
            $model->sageguardMaxSubSoh = $map['sageguard_max_sub_soh'];
        }
        if (isset($map['compensation_triggered'])) {
            $model->compensationTriggered = $map['compensation_triggered'];
        }
        if (isset($map['year_soh_title'])) {
            if (!empty($map['year_soh_title'])) {
                $model->yearSohTitle = $map['year_soh_title'];
            }
        }
        if (isset($map['cur_estimate_year_soh'])) {
            if (!empty($map['cur_estimate_year_soh'])) {
                $model->curEstimateYearSoh = $map['cur_estimate_year_soh'];
            }
        }
        if (isset($map['peer_estimate_year_soh'])) {
            if (!empty($map['peer_estimate_year_soh'])) {
                $model->peerEstimateYearSoh = $map['peer_estimate_year_soh'];
            }
        }
        if (isset($map['battery_manufacturer'])) {
            $model->batteryManufacturer = $map['battery_manufacturer'];
        }
        if (isset($map['nominal_energy'])) {
            $model->nominalEnergy = $map['nominal_energy'];
        }
        if (isset($map['rate_capacity'])) {
            $model->rateCapacity = $map['rate_capacity'];
        }
        if (isset($map['battery_type'])) {
            $model->batteryType = $map['battery_type'];
        }
        if (isset($map['manufacturer_date'])) {
            $model->manufacturerDate = $map['manufacturer_date'];
        }
        if (isset($map['rights_desc'])) {
            $model->rightsDesc = $map['rights_desc'];
        }

        return $model;
    }
}
