// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.intellicar.models;

import com.aliyun.tea.*;

public class BatteryReportData extends TeaModel {
    // VIN码
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("vin_code")
    @Validation(required = true)
    public String vinCode;

    // 评估时间，报告生成时间 yyyy-MM-dd HH:mm:ss
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("evaluate_time")
    @Validation(required = true)
    public String evaluateTime;

    // 当前 SOH（%），数值 0-100
    /**
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("current_soh")
    @Validation(required = true)
    public String currentSoh;

    // SOH 评级：优秀 100-95 良好 95-90 中等 90-85 较差 85-80 差 80 以下
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("soh_lv_str")
    @Validation(required = true)
    public String sohLvStr;

    // 电池衰退水平值
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("volume_score_recession")
    @Validation(required = true)
    public String volumeScoreRecession;

    // 安全风险水平：低 较低 较高 高
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("volume_score_recession_lv_str")
    @Validation(required = true)
    public String volumeScoreRecessionLvStr;

    // 安全风险水平解读文案
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("volume_score_recession_narrate")
    @Validation(required = true)
    public String volumeScoreRecessionNarrate;

    // 保障状态 0：未保障 1：保障中 2：保障结束
    @NameInMap("safeguard_status")
    @Validation(required = true)
    public Long safeguardStatus;

    // 保障截止期 yyyy-MM-dd HH:mm:ss
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("safeguard_end_time")
    @Validation(required = true)
    public String safeguardEndTime;

    // 本轮首检 SOH（%）数值 0-100
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("initial_soh")
    @Validation(required = true)
    public String initialSoh;

    // 本轮首检 评估时间 yyyy-MM-dd HH:mm:ss
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("initial_soh_evaluate_time")
    @Validation(required = true)
    public String initialSohEvaluateTime;

    // 本轮首检 充电单号
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("initial_charge_seq")
    @Validation(required = true)
    public String initialChargeSeq;

    // 触发赔付 SOH（%），数值 0-100
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("sageguard_max_sub_soh")
    @Validation(required = true)
    public String sageguardMaxSubSoh;

    // 是否触发赔付，当前 SOH≤触发赔付 SOH 时为 true
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("compensation_triggered")
    @Validation(required = true)
    public Boolean compensationTriggered;

    // SOH 衰退预测-X 轴标题（年）
    @NameInMap("year_soh_title")
    @Validation(required = true)
    public java.util.List<String> yearSohTitle;

    // 本车电池衰退预测，逐年 SOH（%）
    @NameInMap("cur_estimate_year_soh")
    @Validation(required = true)
    public java.util.List<String> curEstimateYearSoh;

    // 同类型车电池衰退预测，逐年 SOH（%）
    @NameInMap("peer_estimate_year_soh")
    @Validation(required = true)
    public java.util.List<String> peerEstimateYearSoh;

    // 电池厂商
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("battery_manufacturer")
    @Validation(required = true)
    public String batteryManufacturer;

    // 标称能量，单位 kWh
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("nominal_energy")
    @Validation(required = true)
    public String nominalEnergy;

    // 标称容量，单位 Ah
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("rate_capacity")
    @Validation(required = true)
    public String rateCapacity;

    // 电池类型
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("battery_type")
    @Validation(required = true)
    public String batteryType;

    // 车辆生产年份
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("manufacturer_date")
    @Validation(required = true)
    public String manufacturerDate;

    // 权益说明文案
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("rights_desc")
    @Validation(required = true)
    public String rightsDesc;

    public static BatteryReportData build(java.util.Map<String, ?> map) throws Exception {
        BatteryReportData self = new BatteryReportData();
        return TeaModel.build(map, self);
    }

    public BatteryReportData setVinCode(String vinCode) {
        this.vinCode = vinCode;
        return this;
    }
    public String getVinCode() {
        return this.vinCode;
    }

    public BatteryReportData setEvaluateTime(String evaluateTime) {
        this.evaluateTime = evaluateTime;
        return this;
    }
    public String getEvaluateTime() {
        return this.evaluateTime;
    }

    public BatteryReportData setCurrentSoh(String currentSoh) {
        this.currentSoh = currentSoh;
        return this;
    }
    public String getCurrentSoh() {
        return this.currentSoh;
    }

    public BatteryReportData setSohLvStr(String sohLvStr) {
        this.sohLvStr = sohLvStr;
        return this;
    }
    public String getSohLvStr() {
        return this.sohLvStr;
    }

    public BatteryReportData setVolumeScoreRecession(String volumeScoreRecession) {
        this.volumeScoreRecession = volumeScoreRecession;
        return this;
    }
    public String getVolumeScoreRecession() {
        return this.volumeScoreRecession;
    }

    public BatteryReportData setVolumeScoreRecessionLvStr(String volumeScoreRecessionLvStr) {
        this.volumeScoreRecessionLvStr = volumeScoreRecessionLvStr;
        return this;
    }
    public String getVolumeScoreRecessionLvStr() {
        return this.volumeScoreRecessionLvStr;
    }

    public BatteryReportData setVolumeScoreRecessionNarrate(String volumeScoreRecessionNarrate) {
        this.volumeScoreRecessionNarrate = volumeScoreRecessionNarrate;
        return this;
    }
    public String getVolumeScoreRecessionNarrate() {
        return this.volumeScoreRecessionNarrate;
    }

    public BatteryReportData setSafeguardStatus(Long safeguardStatus) {
        this.safeguardStatus = safeguardStatus;
        return this;
    }
    public Long getSafeguardStatus() {
        return this.safeguardStatus;
    }

    public BatteryReportData setSafeguardEndTime(String safeguardEndTime) {
        this.safeguardEndTime = safeguardEndTime;
        return this;
    }
    public String getSafeguardEndTime() {
        return this.safeguardEndTime;
    }

    public BatteryReportData setInitialSoh(String initialSoh) {
        this.initialSoh = initialSoh;
        return this;
    }
    public String getInitialSoh() {
        return this.initialSoh;
    }

    public BatteryReportData setInitialSohEvaluateTime(String initialSohEvaluateTime) {
        this.initialSohEvaluateTime = initialSohEvaluateTime;
        return this;
    }
    public String getInitialSohEvaluateTime() {
        return this.initialSohEvaluateTime;
    }

    public BatteryReportData setInitialChargeSeq(String initialChargeSeq) {
        this.initialChargeSeq = initialChargeSeq;
        return this;
    }
    public String getInitialChargeSeq() {
        return this.initialChargeSeq;
    }

    public BatteryReportData setSageguardMaxSubSoh(String sageguardMaxSubSoh) {
        this.sageguardMaxSubSoh = sageguardMaxSubSoh;
        return this;
    }
    public String getSageguardMaxSubSoh() {
        return this.sageguardMaxSubSoh;
    }

    public BatteryReportData setCompensationTriggered(Boolean compensationTriggered) {
        this.compensationTriggered = compensationTriggered;
        return this;
    }
    public Boolean getCompensationTriggered() {
        return this.compensationTriggered;
    }

    public BatteryReportData setYearSohTitle(java.util.List<String> yearSohTitle) {
        this.yearSohTitle = yearSohTitle;
        return this;
    }
    public java.util.List<String> getYearSohTitle() {
        return this.yearSohTitle;
    }

    public BatteryReportData setCurEstimateYearSoh(java.util.List<String> curEstimateYearSoh) {
        this.curEstimateYearSoh = curEstimateYearSoh;
        return this;
    }
    public java.util.List<String> getCurEstimateYearSoh() {
        return this.curEstimateYearSoh;
    }

    public BatteryReportData setPeerEstimateYearSoh(java.util.List<String> peerEstimateYearSoh) {
        this.peerEstimateYearSoh = peerEstimateYearSoh;
        return this;
    }
    public java.util.List<String> getPeerEstimateYearSoh() {
        return this.peerEstimateYearSoh;
    }

    public BatteryReportData setBatteryManufacturer(String batteryManufacturer) {
        this.batteryManufacturer = batteryManufacturer;
        return this;
    }
    public String getBatteryManufacturer() {
        return this.batteryManufacturer;
    }

    public BatteryReportData setNominalEnergy(String nominalEnergy) {
        this.nominalEnergy = nominalEnergy;
        return this;
    }
    public String getNominalEnergy() {
        return this.nominalEnergy;
    }

    public BatteryReportData setRateCapacity(String rateCapacity) {
        this.rateCapacity = rateCapacity;
        return this;
    }
    public String getRateCapacity() {
        return this.rateCapacity;
    }

    public BatteryReportData setBatteryType(String batteryType) {
        this.batteryType = batteryType;
        return this;
    }
    public String getBatteryType() {
        return this.batteryType;
    }

    public BatteryReportData setManufacturerDate(String manufacturerDate) {
        this.manufacturerDate = manufacturerDate;
        return this;
    }
    public String getManufacturerDate() {
        return this.manufacturerDate;
    }

    public BatteryReportData setRightsDesc(String rightsDesc) {
        this.rightsDesc = rightsDesc;
        return this;
    }
    public String getRightsDesc() {
        return this.rightsDesc;
    }

}
