// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INTELLICAR.Models
{
    // 电池报告返回数据详情
    public class BatteryReportData : TeaModel {
        // VIN码
        /// <summary>
        /// <b>Example:</b>
        /// <list type="bullet">
        /// <item><description></description></item>
        /// </list>
        /// </summary>
        [NameInMap("vin_code")]
        [Validation(Required=true)]
        public string VinCode { get; set; }

        // 评估时间，报告生成时间 yyyy-MM-dd HH:mm:ss
        /// <summary>
        /// <b>Example:</b>
        /// <list type="bullet">
        /// <item><description></description></item>
        /// </list>
        /// </summary>
        [NameInMap("evaluate_time")]
        [Validation(Required=true)]
        public string EvaluateTime { get; set; }

        // 当前 SOH（%），数值 0-100
        /// <summary>
        /// <b>Example:</b>
        /// <para>12</para>
        /// </summary>
        [NameInMap("current_soh")]
        [Validation(Required=true)]
        public string CurrentSoh { get; set; }

        // SOH 评级：优秀 100-95 良好 95-90 中等 90-85 较差 85-80 差 80 以下
        /// <summary>
        /// <b>Example:</b>
        /// <list type="bullet">
        /// <item><description></description></item>
        /// </list>
        /// </summary>
        [NameInMap("soh_lv_str")]
        [Validation(Required=true)]
        public string SohLvStr { get; set; }

        // 电池衰退水平值
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("volume_score_recession")]
        [Validation(Required=true)]
        public string VolumeScoreRecession { get; set; }

        // 安全风险水平：低 较低 较高 高
        /// <summary>
        /// <b>Example:</b>
        /// <list type="bullet">
        /// <item><description></description></item>
        /// </list>
        /// </summary>
        [NameInMap("volume_score_recession_lv_str")]
        [Validation(Required=true)]
        public string VolumeScoreRecessionLvStr { get; set; }

        // 安全风险水平解读文案
        /// <summary>
        /// <b>Example:</b>
        /// <list type="bullet">
        /// <item><description></description></item>
        /// </list>
        /// </summary>
        [NameInMap("volume_score_recession_narrate")]
        [Validation(Required=true)]
        public string VolumeScoreRecessionNarrate { get; set; }

        // 保障状态 0：未保障 1：保障中 2：保障结束
        [NameInMap("safeguard_status")]
        [Validation(Required=true)]
        public long? SafeguardStatus { get; set; }

        // 保障截止期 yyyy-MM-dd HH:mm:ss
        /// <summary>
        /// <b>Example:</b>
        /// <list type="bullet">
        /// <item><description></description></item>
        /// </list>
        /// </summary>
        [NameInMap("safeguard_end_time")]
        [Validation(Required=true)]
        public string SafeguardEndTime { get; set; }

        // 本轮首检 SOH（%）数值 0-100
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("initial_soh")]
        [Validation(Required=true)]
        public string InitialSoh { get; set; }

        // 本轮首检 评估时间 yyyy-MM-dd HH:mm:ss
        /// <summary>
        /// <b>Example:</b>
        /// <list type="bullet">
        /// <item><description></description></item>
        /// </list>
        /// </summary>
        [NameInMap("initial_soh_evaluate_time")]
        [Validation(Required=true)]
        public string InitialSohEvaluateTime { get; set; }

        // 本轮首检 充电单号
        /// <summary>
        /// <b>Example:</b>
        /// <list type="bullet">
        /// <item><description></description></item>
        /// </list>
        /// </summary>
        [NameInMap("initial_charge_seq")]
        [Validation(Required=true)]
        public string InitialChargeSeq { get; set; }

        // 触发赔付 SOH（%），数值 0-100
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("safeguard_max_sub_soh")]
        [Validation(Required=true)]
        public string SafeguardMaxSubSoh { get; set; }

        // 是否触发赔付，当前 SOH≤触发赔付 SOH 时为 true
        /// <summary>
        /// <b>Example:</b>
        /// <para>true, false</para>
        /// </summary>
        [NameInMap("compensation_triggered")]
        [Validation(Required=true)]
        public bool? CompensationTriggered { get; set; }

        // SOH 衰退预测-X 轴标题（年）
        [NameInMap("year_soh_title")]
        [Validation(Required=true)]
        public List<string> YearSohTitle { get; set; }

        // 本车电池衰退预测，逐年 SOH（%）
        [NameInMap("cur_estimate_year_soh")]
        [Validation(Required=true)]
        public List<string> CurEstimateYearSoh { get; set; }

        // 同类型车电池衰退预测，逐年 SOH（%）
        [NameInMap("peer_estimate_year_soh")]
        [Validation(Required=true)]
        public List<string> PeerEstimateYearSoh { get; set; }

        // 电池厂商
        /// <summary>
        /// <b>Example:</b>
        /// <list type="bullet">
        /// <item><description></description></item>
        /// </list>
        /// </summary>
        [NameInMap("battery_manufacturer")]
        [Validation(Required=true)]
        public string BatteryManufacturer { get; set; }

        // 标称能量，单位 kWh
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("nominal_energy")]
        [Validation(Required=true)]
        public string NominalEnergy { get; set; }

        // 标称容量，单位 Ah
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("rate_capacity")]
        [Validation(Required=true)]
        public string RateCapacity { get; set; }

        // 电池类型
        /// <summary>
        /// <b>Example:</b>
        /// <list type="bullet">
        /// <item><description></description></item>
        /// </list>
        /// </summary>
        [NameInMap("battery_type")]
        [Validation(Required=true)]
        public string BatteryType { get; set; }

        // 车辆生产年份
        /// <summary>
        /// <b>Example:</b>
        /// <list type="bullet">
        /// <item><description></description></item>
        /// </list>
        /// </summary>
        [NameInMap("manufacturer_date")]
        [Validation(Required=true)]
        public string ManufacturerDate { get; set; }

        // 权益说明文案
        /// <summary>
        /// <b>Example:</b>
        /// <list type="bullet">
        /// <item><description></description></item>
        /// </list>
        /// </summary>
        [NameInMap("rights_desc")]
        [Validation(Required=true)]
        public string RightsDesc { get; set; }

        // 权益说明-状态
        /// <summary>
        /// <b>Example:</b>
        /// <list type="bullet">
        /// <item><description></description></item>
        /// </list>
        /// </summary>
        [NameInMap("right_status")]
        [Validation(Required=true)]
        public string RightStatus { get; set; }

        // 电池健康度-建议
        [NameInMap("soh_suggest")]
        [Validation(Required=true)]
        public List<string> SohSuggest { get; set; }

        // 保障金额
        /// <summary>
        /// <b>Example:</b>
        /// <list type="bullet">
        /// <item><description></description></item>
        /// </list>
        /// </summary>
        [NameInMap("safeguard_amount")]
        [Validation(Required=false)]
        public string SafeguardAmount { get; set; }

        // 保障天数
        /// <summary>
        /// <b>Example:</b>
        /// <list type="bullet">
        /// <item><description></description></item>
        /// </list>
        /// </summary>
        [NameInMap("safeguard_days")]
        [Validation(Required=false)]
        public long? SafeguardDays { get; set; }

        // SOH允许衰退阈值
        /// <summary>
        /// <b>Example:</b>
        /// <list type="bullet">
        /// <item><description></description></item>
        /// </list>
        /// </summary>
        [NameInMap("allow_max_soh_diff")]
        [Validation(Required=false)]
        public string AllowMaxSohDiff { get; set; }

    }

}
